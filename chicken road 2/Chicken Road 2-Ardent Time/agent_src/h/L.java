package h;

/* loaded from: classes.dex */
public final class L extends h.AbstractC0140I implements h.InterfaceC0141J {

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.reflect.Method f3092z;

    /* renamed from: y, reason: collision with root package name */
    public Z0.h f3093y;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                f3092z = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // h.InterfaceC0141J
    public final void b(g.j jVar, g.k kVar) {
        Z0.h hVar = this.f3093y;
        if (hVar != null) {
            hVar.b(jVar, kVar);
        }
    }

    @Override // h.InterfaceC0141J
    public final void d(g.j jVar, g.k kVar) {
        Z0.h hVar = this.f3093y;
        if (hVar != null) {
            hVar.d(jVar, kVar);
        }
    }
}
