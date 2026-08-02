package androidx.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/activity/Api26Impl;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "hint", "", "setPipParamsSourceRectHint", "(Landroid/app/Activity;Landroid/graphics/Rect;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Api26Impl {
    public static final androidx.view.Api26Impl INSTANCE = new androidx.view.Api26Impl();

    private Api26Impl() {
    }

    public final void setPipParamsSourceRectHint(android.app.Activity activity, android.graphics.Rect hint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hint, "");
        activity.setPictureInPictureParams(new android.app.PictureInPictureParams.Builder().setSourceRectHint(hint).build());
    }
}
