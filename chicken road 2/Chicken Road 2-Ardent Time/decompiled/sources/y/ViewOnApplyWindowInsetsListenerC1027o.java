package y;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1027o implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public y.Q f8476a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f8477b;

    public ViewOnApplyWindowInsetsListenerC1027o(android.view.View view, y.InterfaceC1022j interfaceC1022j) {
        this.f8477b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        y.Q a2 = y.Q.a(windowInsets, view);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            y.AbstractC1028p.a(windowInsets, this.f8477b);
            if (a2.equals(this.f8476a)) {
                throw null;
            }
        }
        this.f8476a = a2;
        throw null;
    }
}
