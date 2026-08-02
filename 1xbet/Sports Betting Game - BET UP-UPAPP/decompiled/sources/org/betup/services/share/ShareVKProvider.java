package org.betup.services.share;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;
import com.vk.sdk.api.model.VKApiPhoto;
import com.vk.sdk.api.model.VKPhotoArray;
import com.vk.sdk.api.photo.VKImageParameters;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.dialogs.VKShareDialog;
import com.vk.sdk.dialogs.VKShareDialogBuilder;
import org.betup.BetUpApp;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;
import org.betup.utils.InviteHelper;
import org.betup.utils.ShareHelper;
import org.betup.utils.VksdkHelper;

/* loaded from: classes2.dex */
public class ShareVKProvider implements ShareProvider {
    private Activity context;
    private ShareMessage pendingShareMessage;
    private Bitmap photo;
    private VKApiPhoto photoModel;
    private ProgressDisplay progressDisplay;
    private VKRequest request;
    private final UserService userService;

    public ShareVKProvider(Activity context, ProgressDisplay progressDisplay, UserService userService) {
        this.context = context;
        this.progressDisplay = progressDisplay;
        this.userService = userService;
    }

    @Override // org.betup.services.share.ShareProvider
    public void share(final ShareMessage shareMessage) {
        Log.d(ShareHelper.SHARED_LOG, "Making share " + shareMessage.getLinkType());
        VksdkHelper.ensureInitialized(this.context);
        if (shareMessage.getLinkType() == InviteHelper.LinkType.MATCH && (shareMessage.getBundle() == null || shareMessage.getBundle().getInt("matchId") == 0)) {
            Log.d(ShareHelper.SHARED_LOG, "return");
        } else {
            this.pendingShareMessage = shareMessage;
            InviteHelper.getLink(this.context, this.userService, shareMessage.getLinkType(), new AnonymousClass1(shareMessage), shareMessage.getBundle());
        }
    }

    /* renamed from: org.betup.services.share.ShareVKProvider$1, reason: invalid class name */
    class AnonymousClass1 implements InviteHelper.OnLinkGotListener {
        final /* synthetic */ ShareMessage val$shareMessage;

        AnonymousClass1(final ShareMessage val$shareMessage) {
            this.val$shareMessage = val$shareMessage;
        }

        @Override // org.betup.utils.InviteHelper.OnLinkGotListener
        public void linkGot(final String shareLink) {
            if (shareLink == null) {
                Log.d(ShareHelper.SHARED_LOG, "LINK NULL");
                return;
            }
            Log.d(ShareHelper.SHARED_LOG, "STARTING VK SHARE");
            if (!VKSdk.isLoggedIn()) {
                VKSdk.login(ShareVKProvider.this.context, "wall", "photos", "email");
                return;
            }
            String imgUrl = ShareHelper.getImgUrl(this.val$shareMessage);
            ShareVKProvider.this.progressDisplay.displayProgress();
            C14321 c14321 = new C14321(shareLink);
            Picasso.get().invalidate(imgUrl);
            Picasso.get().load(imgUrl).into(c14321);
        }

        /* renamed from: org.betup.services.share.ShareVKProvider$1$1, reason: invalid class name and collision with other inner class name */
        class C14321 implements Target {
            final /* synthetic */ String val$shareLink;

            C14321(final String val$shareLink) {
                this.val$shareLink = val$shareLink;
            }

            @Override // com.squareup.picasso.Target
            public void onBitmapLoaded(final Bitmap bitmap, Picasso.LoadedFrom from) {
                ShareVKProvider.this.photo = bitmap;
                Log.d(ShareHelper.SHARED_LOG, "BITAMP LOADED");
                new AsyncTaskC14331().execute(new Void[0]);
            }

            /* renamed from: org.betup.services.share.ShareVKProvider$1$1$1, reason: invalid class name and collision with other inner class name */
            class AsyncTaskC14331 extends AsyncTask<Void, Void, Boolean> {
                AsyncTaskC14331() {
                }

                @Override // android.os.AsyncTask
                protected void onPreExecute() {
                    super.onPreExecute();
                    ShareVKProvider.this.progressDisplay.displayProgress();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Boolean doInBackground(Void... voids) {
                    if (ShareVKProvider.this.photo.isRecycled()) {
                        return false;
                    }
                    ShareVKProvider.this.request = VKApi.uploadWallPhotoRequest(new VKUploadImage(ShareVKProvider.this.photo, VKImageParameters.jpgImage(0.9f)), 0L, 0);
                    ShareVKProvider.this.request.executeWithListener(new C14341());
                    return null;
                }

                /* renamed from: org.betup.services.share.ShareVKProvider$1$1$1$1, reason: invalid class name and collision with other inner class name */
                class C14341 extends VKRequest.VKRequestListener {
                    C14341() {
                    }

                    @Override // com.vk.sdk.api.VKRequest.VKRequestListener
                    public void onComplete(VKResponse response) {
                        ShareVKProvider.this.photoModel = ((VKPhotoArray) response.parsedModel).get(0);
                        ShareVKProvider.this.context.runOnUiThread(new Runnable() { // from class: org.betup.services.share.ShareVKProvider.1.1.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShareVKProvider.this.photo.recycle();
                                VKPhotoArray vKPhotoArray = new VKPhotoArray();
                                vKPhotoArray.add((VKPhotoArray) ShareVKProvider.this.photoModel);
                                VKShareDialogBuilder vKShareDialogBuilder = new VKShareDialogBuilder();
                                vKShareDialogBuilder.setUploadedPhotos(vKPhotoArray);
                                vKShareDialogBuilder.setText(ShareHelper.getSharedText(AnonymousClass1.this.val$shareMessage, ShareVKProvider.this.context, ShareVKProvider.this.userService));
                                vKShareDialogBuilder.setAttachmentLink("BetUp #1 Betting App", C14321.this.val$shareLink);
                                vKShareDialogBuilder.setShareDialogListener(new VKShareDialog.VKShareDialogListener() { // from class: org.betup.services.share.ShareVKProvider.1.1.1.1.1.1
                                    @Override // com.vk.sdk.dialogs.VKShareDialogBuilder.VKShareDialogListener
                                    public void onVkShareComplete(int postId) {
                                        ShareVKProvider.this.progressDisplay.hideProgress();
                                        Log.d(ShareHelper.SHARED_LOG, "VK SHARE COMPLETE! ");
                                        if (ShareVKProvider.this.photo == null || ShareVKProvider.this.photo.isRecycled()) {
                                            return;
                                        }
                                        ShareVKProvider.this.photo.recycle();
                                        ShareVKProvider.this.photo = null;
                                    }

                                    @Override // com.vk.sdk.dialogs.VKShareDialogBuilder.VKShareDialogListener
                                    public void onVkShareCancel() {
                                        ShareVKProvider.this.progressDisplay.hideProgress();
                                        Log.d("KEYVK", "CANCEL");
                                    }

                                    @Override // com.vk.sdk.dialogs.VKShareDialogBuilder.VKShareDialogListener
                                    public void onVkShareError(VKError error) {
                                        ShareVKProvider.this.progressDisplay.hideProgress();
                                        Log.d("KEYVK", "ERROR! " + error.errorMessage);
                                        Log.d("KEYVK", "ERROR! " + error.toString());
                                    }
                                });
                                if (((BetUpApp) ShareVKProvider.this.context.getApplicationContext()).isInForeground()) {
                                    vKShareDialogBuilder.show(ShareVKProvider.this.context.getFragmentManager(), "VK_SHARE_DIALOG");
                                }
                            }
                        });
                    }

                    @Override // com.vk.sdk.api.VKRequest.VKRequestListener
                    public void onError(VKError error) {
                        Log.d("VKKEYS", "PHOTO ERROR! " + error.toString());
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public void onPostExecute(Boolean result) {
                    super.onPostExecute((AsyncTaskC14331) result);
                    ShareVKProvider.this.progressDisplay.hideProgress();
                }
            }

            @Override // com.squareup.picasso.Target
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {
                ShareVKProvider.this.progressDisplay.hideProgress();
                Log.d(ShareHelper.SHARED_LOG, "BITMAP LOADING FAILED");
            }

            @Override // com.squareup.picasso.Target
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                Log.d(ShareHelper.SHARED_LOG, "ON PREPARE LOADING");
            }
        }
    }

    @Override // org.betup.services.share.ShareProvider
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(ShareHelper.SHARED_LOG, "ON ACTIVITY RESULT = " + requestCode + " RESULT CODE = " + resultCode);
        if (requestCode != VksdkHelper.getAuthorizationRequestCode()) {
            return false;
        }
        VksdkHelper.ensureInitialized(this.context);
        return VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() { // from class: org.betup.services.share.ShareVKProvider.2
            @Override // com.vk.sdk.VKCallback
            public void onError(VKError error) {
            }

            @Override // com.vk.sdk.VKCallback
            public void onResult(VKAccessToken res) {
                Log.d(ShareHelper.SHARED_LOG, "VK RESULT LOGIN");
                if (ShareVKProvider.this.pendingShareMessage != null) {
                    ShareVKProvider shareVKProvider = ShareVKProvider.this;
                    shareVKProvider.share(shareVKProvider.pendingShareMessage);
                }
            }
        });
    }
}
