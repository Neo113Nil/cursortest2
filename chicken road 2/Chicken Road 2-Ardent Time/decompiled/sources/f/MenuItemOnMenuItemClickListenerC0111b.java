package f;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0111b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f2744c = {android.view.MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f2745a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Method f2746b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.reflect.Method method = this.f2746b;
        try {
            java.lang.Class<?> returnType = method.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.Object obj = this.f2745a;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
