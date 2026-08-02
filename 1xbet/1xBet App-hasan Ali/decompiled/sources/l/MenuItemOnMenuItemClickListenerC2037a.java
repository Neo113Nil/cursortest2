package l;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2037a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f17626c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f17627a;

    /* renamed from: b, reason: collision with root package name */
    public Method f17628b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f17628b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f17627a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
