package n;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k0.C2023c;
import m.MenuC2070h;
import m.MenuItemC2071i;

/* loaded from: classes.dex */
public final class j0 extends AbstractC2131e0 implements InterfaceC2133f0 {
    public static final Method K;
    public C2023c J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // n.InterfaceC2133f0
    public final void a(MenuC2070h menuC2070h, MenuItemC2071i menuItemC2071i) {
        C2023c c2023c = this.J;
        if (c2023c != null) {
            c2023c.a(menuC2070h, menuItemC2071i);
        }
    }

    @Override // n.InterfaceC2133f0
    public final void e(MenuC2070h menuC2070h, MenuItemC2071i menuItemC2071i) {
        C2023c c2023c = this.J;
        if (c2023c != null) {
            c2023c.e(menuC2070h, menuItemC2071i);
        }
    }
}
