package org.betup.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.VideoRewardCollectDialogFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VideoRewardCollectDialogHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0005H\u0007J^\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lorg/betup/utils/VideoRewardCollectDialogHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "DIALOG_TAG", "", "SHOW_RETRY_MS", "", "mainHandler", "Landroid/os/Handler;", "showSafely", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "amount", "", "title", "description", "onCollectListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnCollectListener;", "onDismissListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnDismissListener;", "imageResourceId", "tag", "attemptShow", "", "allowRetry", "scheduleFlushRetry", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoRewardCollectDialogHelper {
    public static final String DIALOG_TAG = "VideoRewardCollectDialog";
    private static final long SHOW_RETRY_MS = 300;
    public static final VideoRewardCollectDialogHelper INSTANCE = new VideoRewardCollectDialogHelper();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    @JvmStatic
    public static final boolean showSafely(FragmentActivity activity, FragmentManager fragmentManager, int i, String title, String description) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return showSafely$default(activity, fragmentManager, i, title, description, null, null, 0, null, 480, null);
    }

    @JvmStatic
    public static final boolean showSafely(FragmentActivity activity, FragmentManager fragmentManager, int i, String title, String description, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return showSafely$default(activity, fragmentManager, i, title, description, onCollectListener, null, 0, null, 448, null);
    }

    @JvmStatic
    public static final boolean showSafely(FragmentActivity activity, FragmentManager fragmentManager, int i, String title, String description, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, VideoRewardCollectDialogFragment.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return showSafely$default(activity, fragmentManager, i, title, description, onCollectListener, onDismissListener, 0, null, RendererCapabilities.DECODER_SUPPORT_MASK, null);
    }

    @JvmStatic
    public static final boolean showSafely(FragmentActivity activity, FragmentManager fragmentManager, int i, String title, String description, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, int i2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return showSafely$default(activity, fragmentManager, i, title, description, onCollectListener, onDismissListener, i2, null, 256, null);
    }

    private VideoRewardCollectDialogHelper() {
    }

    public static /* synthetic */ boolean showSafely$default(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, String str, String str2, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, int i2, String str3, int i3, Object obj) {
        return showSafely(fragmentActivity, fragmentManager, i, str, str2, (i3 & 32) != 0 ? null : onCollectListener, (i3 & 64) != 0 ? null : onDismissListener, (i3 & 128) != 0 ? 2131235583 : i2, (i3 & 256) != 0 ? DIALOG_TAG : str3);
    }

    @JvmStatic
    public static final boolean showSafely(final FragmentActivity activity, final FragmentManager fragmentManager, final int amount, final String title, final String description, final VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, final VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, final int imageResourceId, final String tag) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (activity.isDestroyed()) {
            return false;
        }
        activity.runOnUiThread(new Runnable() { // from class: org.betup.utils.VideoRewardCollectDialogHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardCollectDialogHelper.showSafely$lambda$0(FragmentActivity.this, fragmentManager, amount, title, description, onCollectListener, onDismissListener, imageResourceId, tag);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSafely$lambda$0(FragmentActivity fragmentActivity, FragmentManager fragmentManager, int i, String str, String str2, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, int i2, String str3) {
        if (fragmentActivity.isDestroyed()) {
            return;
        }
        INSTANCE.attemptShow(fragmentActivity, fragmentManager, i, str, str2, onCollectListener, onDismissListener, i2, str3, true);
    }

    private final void attemptShow(final FragmentActivity activity, final FragmentManager fragmentManager, final int amount, final String title, final String description, final VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, final VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, final int imageResourceId, final String tag, boolean allowRetry) {
        if (activity.isDestroyed()) {
            return;
        }
        if (fragmentManager.findFragmentByTag(tag) != null || activity.getSupportFragmentManager().findFragmentByTag(tag) != null) {
            DeferredOverlayQueue.flushPending(activity);
            return;
        }
        boolean showDialogSafely = DialogManager.showDialogSafely(VideoRewardCollectDialogFragment.INSTANCE.newInstance(amount, title, description, onCollectListener, onDismissListener, imageResourceId), fragmentManager, tag);
        DeferredOverlayQueue.flushPending(activity);
        if (!showDialogSafely && allowRetry && fragmentManager.findFragmentByTag(tag) == null && activity.getSupportFragmentManager().findFragmentByTag(tag) == null) {
            mainHandler.postDelayed(new Runnable() { // from class: org.betup.utils.VideoRewardCollectDialogHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRewardCollectDialogHelper.attemptShow$lambda$1(FragmentActivity.this, fragmentManager, tag, amount, title, description, onCollectListener, onDismissListener, imageResourceId);
                }
            }, SHOW_RETRY_MS);
        } else {
            scheduleFlushRetry(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attemptShow$lambda$1(FragmentActivity fragmentActivity, FragmentManager fragmentManager, String str, int i, String str2, String str3, VideoRewardCollectDialogFragment.OnCollectListener onCollectListener, VideoRewardCollectDialogFragment.OnDismissListener onDismissListener, int i2) {
        if (fragmentActivity.isDestroyed() || fragmentManager.findFragmentByTag(str) != null || fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) != null) {
            DeferredOverlayQueue.flushPending(fragmentActivity);
        } else {
            INSTANCE.attemptShow(fragmentActivity, fragmentManager, i, str2, str3, onCollectListener, onDismissListener, i2, str, false);
        }
    }

    private final void scheduleFlushRetry(final FragmentActivity activity) {
        mainHandler.postDelayed(new Runnable() { // from class: org.betup.utils.VideoRewardCollectDialogHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardCollectDialogHelper.scheduleFlushRetry$lambda$2(FragmentActivity.this);
            }
        }, SHOW_RETRY_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFlushRetry$lambda$2(FragmentActivity fragmentActivity) {
        if (fragmentActivity.isDestroyed()) {
            return;
        }
        DeferredOverlayQueue.flushPending(fragmentActivity);
    }
}
