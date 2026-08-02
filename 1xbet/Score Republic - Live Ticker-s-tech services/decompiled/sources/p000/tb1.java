package p000;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f7406d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7407a = 0;

    /* JADX INFO: renamed from: b */
    public Object f7408b;

    /* JADX INFO: renamed from: c */
    public Object f7409c;

    public tb1(vn0 vn0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7409c = vn0Var;
        this.f7408b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.f7407a) {
            case 0:
                Object obj = this.f7408b;
                Method method = (Method) this.f7409c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    dd0.m1163h(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f7408b).onMenuItemClick(((vn0) this.f7409c).m4688f(menuItem));
        }
    }

    public /* synthetic */ tb1() {
    }
}
