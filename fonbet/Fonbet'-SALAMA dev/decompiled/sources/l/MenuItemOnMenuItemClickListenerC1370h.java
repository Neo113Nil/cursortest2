package l;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1370h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f14812c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f14813a;

    /* renamed from: b, reason: collision with root package name */
    public Method f14814b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f14814b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f14813a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
