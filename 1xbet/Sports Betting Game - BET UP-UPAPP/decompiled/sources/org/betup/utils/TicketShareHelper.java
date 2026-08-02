package org.betup.utils;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.ShareCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TicketShareHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0010J>\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005JD\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005J@\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002J(\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lorg/betup/utils/TicketShareHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "SHARE_SUBDIR", "", "FILE_PREFIX", "FILE_SUFFIX", "MIME_PNG", "TAG", "sharePlainText", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "text", "chooserTitleRes", "", "shareBitmapAsImage", "bitmap", "Landroid/graphics/Bitmap;", "betId", "", "isSingleLegBetTicket", "", "includeInstallLink", "betInstallUrl", "shareBitmapsAsImage", "bitmaps", "", "launchShareFromBitmap", "bitmapForShareFile", "source", "writeBitmapPng", "file", "Ljava/io/File;", "recycleIfNotRecycled", "installLinkExtra", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TicketShareHelper {
    public static final int $stable = 0;
    private static final String FILE_PREFIX = "ticket_share_";
    private static final String FILE_SUFFIX = ".png";
    public static final TicketShareHelper INSTANCE = new TicketShareHelper();
    private static final String MIME_PNG = "image/png";
    private static final String SHARE_SUBDIR = "ticket_share";
    private static final String TAG = "TicketShareHelper";

    private TicketShareHelper() {
    }

    public final void sharePlainText(FragmentActivity activity, String text, int chooserTitleRes) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            new ShareCompat.IntentBuilder(activity).setType("text/plain").setText(text).setChooserTitle(activity.getString(chooserTitleRes)).startChooser();
        } catch (ActivityNotFoundException e) {
            Log.w(TAG, "No app to handle share intent", e);
        }
    }

    public final void shareBitmapAsImage(FragmentActivity activity, Bitmap bitmap, long betId, boolean isSingleLegBetTicket, boolean includeInstallLink, String betInstallUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        launchShareFromBitmap(activity, bitmap, betId, isSingleLegBetTicket, includeInstallLink, betInstallUrl);
    }

    public final void shareBitmapsAsImage(FragmentActivity activity, List<Bitmap> bitmaps, long betId, boolean isSingleLegBetTicket, boolean includeInstallLink, String betInstallUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        if (bitmaps.isEmpty()) {
            return;
        }
        int i = 0;
        if (bitmaps.size() == 1) {
            shareBitmapAsImage(activity, bitmaps.get(0), betId, isSingleLegBetTicket, includeInstallLink, betInstallUrl);
            return;
        }
        File file = new File(activity.getCacheDir(), SHARE_SUBDIR);
        file.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bitmaps.size());
        ArrayList<File> arrayList2 = new ArrayList();
        for (Bitmap bitmap : bitmaps) {
            int i2 = i + 1;
            File file2 = new File(file, FILE_PREFIX + currentTimeMillis + "_" + i + FILE_SUFFIX);
            Bitmap bitmapForShareFile = bitmapForShareFile(activity, bitmap, betId, isSingleLegBetTicket);
            if (!writeBitmapPng(bitmapForShareFile, file2)) {
                recycleIfNotRecycled(bitmapForShareFile);
                for (File file3 : arrayList2) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m10853constructorimpl(Boolean.valueOf(file3.delete()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m10853constructorimpl(ResultKt.createFailure(th));
                    }
                }
                int size = bitmaps.size();
                for (int i3 = i2; i3 < size; i3++) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        TicketShareHelper ticketShareHelper = this;
                        if (!bitmaps.get(i3).isRecycled()) {
                            bitmaps.get(i3).recycle();
                        }
                        Result.m10853constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Result.m10853constructorimpl(ResultKt.createFailure(th2));
                    }
                }
                return;
            }
            recycleIfNotRecycled(bitmapForShareFile);
            arrayList2.add(file2);
            arrayList.add(FileProvider.getUriForFile(activity, activity.getPackageName() + ".fileprovider", file2));
            i = i2;
        }
        try {
            String installLinkExtra = installLinkExtra(includeInstallLink, betInstallUrl);
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("image/png");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            if (installLinkExtra != null) {
                intent.putExtra("android.intent.extra.TEXT", installLinkExtra);
            }
            intent.addFlags(1);
            activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.share_bet_ticket)));
        } catch (ActivityNotFoundException e) {
            Log.w(TAG, "No app to handle share intent", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchShareFromBitmap(FragmentActivity activity, Bitmap bitmap, long betId, boolean isSingleLegBetTicket, boolean includeInstallLink, String betInstallUrl) {
        File file = new File(activity.getCacheDir(), SHARE_SUBDIR);
        file.mkdirs();
        File file2 = new File(file, FILE_PREFIX + System.currentTimeMillis() + FILE_SUFFIX);
        Bitmap bitmapForShareFile = bitmapForShareFile(activity, bitmap, betId, isSingleLegBetTicket);
        boolean writeBitmapPng = writeBitmapPng(bitmapForShareFile, file2);
        recycleIfNotRecycled(bitmapForShareFile);
        if (writeBitmapPng) {
            Uri uriForFile = FileProvider.getUriForFile(activity, activity.getPackageName() + ".fileprovider", file2);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            try {
                ShareCompat.IntentBuilder chooserTitle = new ShareCompat.IntentBuilder(activity).setType("image/png").setStream(uriForFile).setChooserTitle(activity.getString(R.string.share_bet_ticket));
                Intrinsics.checkNotNullExpressionValue(chooserTitle, "setChooserTitle(...)");
                String installLinkExtra = installLinkExtra(includeInstallLink, betInstallUrl);
                if (installLinkExtra != null) {
                    chooserTitle.setText(installLinkExtra);
                }
                chooserTitle.startChooser();
            } catch (ActivityNotFoundException e) {
                Log.w(TAG, "No app to handle share intent", e);
            }
        }
    }

    private final Bitmap bitmapForShareFile(FragmentActivity activity, Bitmap source, long betId, boolean isSingleLegBetTicket) {
        return betId > 0 ? BetShareImageDecorator.INSTANCE.applyCornerBrand(activity, source, isSingleLegBetTicket) : source;
    }

    private final boolean writeBitmapPng(Bitmap bitmap, File file) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            TicketShareHelper ticketShareHelper = this;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                m10853constructorimpl = Result.m10853constructorimpl(Boolean.valueOf(compress));
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m10860isSuccessimpl(m10853constructorimpl);
    }

    private final void recycleIfNotRecycled(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    private final String installLinkExtra(boolean includeInstallLink, String betInstallUrl) {
        String obj;
        if (includeInstallLink && betInstallUrl != null && (obj = StringsKt.trim((CharSequence) betInstallUrl).toString()) != null && obj.length() > 0) {
            return obj;
        }
        return null;
    }
}
