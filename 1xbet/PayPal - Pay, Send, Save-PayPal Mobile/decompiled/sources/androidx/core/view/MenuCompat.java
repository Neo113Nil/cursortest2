package androidx.core.view;

/* loaded from: classes7.dex */
public final class MenuCompat {
    @androidx.annotation.ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static void setGroupDividerEnabled(android.view.Menu menu, boolean z) {
        if (menu instanceof androidx.core.internal.view.SupportMenu) {
            ((androidx.core.internal.view.SupportMenu) menu).setGroupDividerEnabled(z);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.view.MenuCompat.Api28Impl.getHighSpeedVideoSizes(menu, z);
        }
    }

    private MenuCompat() {
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void getHighSpeedVideoSizes(android.view.Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }
}
