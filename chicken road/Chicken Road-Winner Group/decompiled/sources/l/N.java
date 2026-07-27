package l;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.MenuC1069j;
import k.MenuItemC1070k;

/* loaded from: classes.dex */
public final class N extends K implements L {

    /* renamed from: z, reason: collision with root package name */
    public static final Method f9737z;
    public b0.j y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f9737z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.L
    public final void a(MenuC1069j menuC1069j, MenuItemC1070k menuItemC1070k) {
        b0.j jVar = this.y;
        if (jVar != null) {
            jVar.a(menuC1069j, menuItemC1070k);
        }
    }

    @Override // l.L
    public final void c(MenuC1069j menuC1069j, MenuItemC1070k menuItemC1070k) {
        b0.j jVar = this.y;
        if (jVar != null) {
            jVar.c(menuC1069j, menuItemC1070k);
        }
    }
}
