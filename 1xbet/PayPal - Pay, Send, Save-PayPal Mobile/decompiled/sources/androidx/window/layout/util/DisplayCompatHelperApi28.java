package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/window/layout/util/DisplayCompatHelperApi28;", "", "<init>", "()V", "Landroid/view/DisplayCutout;", "displayCutout", "", "safeInsetLeft", "(Landroid/view/DisplayCutout;)I", "safeInsetTop", "safeInsetRight", "safeInsetBottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayCompatHelperApi28 {
    public static final androidx.window.layout.util.DisplayCompatHelperApi28 INSTANCE = new androidx.window.layout.util.DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetLeft(android.view.DisplayCutout displayCutout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCutout, "");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetTop(android.view.DisplayCutout displayCutout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCutout, "");
        return displayCutout.getSafeInsetTop();
    }

    public final int safeInsetRight(android.view.DisplayCutout displayCutout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCutout, "");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetBottom(android.view.DisplayCutout displayCutout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayCutout, "");
        return displayCutout.getSafeInsetBottom();
    }
}
