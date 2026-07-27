package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1064e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1065f f9543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1070k f9544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC1069j f9545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.j f9546d;

    public RunnableC1064e(b0.j jVar, C1065f c1065f, MenuItemC1070k menuItemC1070k, MenuC1069j menuC1069j) {
        this.f9546d = jVar;
        this.f9543a = c1065f;
        this.f9544b = menuItemC1070k;
        this.f9545c = menuC1069j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1065f c1065f = this.f9543a;
        if (c1065f != null) {
            b0.j jVar = this.f9546d;
            ((ViewOnKeyListenerC1066g) jVar.f2462a).f9572z = true;
            c1065f.f9548b.c(false);
            ((ViewOnKeyListenerC1066g) jVar.f2462a).f9572z = false;
        }
        MenuItemC1070k menuItemC1070k = this.f9544b;
        if (menuItemC1070k.isEnabled() && menuItemC1070k.hasSubMenu()) {
            this.f9545c.p(menuItemC1070k, null, 4);
        }
    }
}
