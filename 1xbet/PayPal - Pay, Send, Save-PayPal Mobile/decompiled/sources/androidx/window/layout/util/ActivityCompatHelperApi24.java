package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/layout/util/ActivityCompatHelperApi24;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "isInMultiWindowMode", "(Landroid/app/Activity;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityCompatHelperApi24 {
    public static final androidx.window.layout.util.ActivityCompatHelperApi24 INSTANCE = new androidx.window.layout.util.ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return activity.isInMultiWindowMode();
    }
}
