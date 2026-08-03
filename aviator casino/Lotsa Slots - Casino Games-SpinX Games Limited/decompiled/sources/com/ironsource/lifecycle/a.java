package com.ironsource.lifecycle;

/* loaded from: classes5.dex */
public class a extends android.app.Fragment {
    private static final java.lang.String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.lifecycle.a.InterfaceC0155a f6376a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0155a {
        void a(android.app.Activity activity);

        void b(android.app.Activity activity);

        void c(android.app.Activity activity);
    }

    static com.ironsource.lifecycle.a a(android.app.Activity activity) {
        return (com.ironsource.lifecycle.a) activity.getFragmentManager().findFragmentByTag(b);
    }

    static void b(android.app.Activity activity) {
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new com.ironsource.lifecycle.a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(com.ironsource.lifecycle.a.InterfaceC0155a interfaceC0155a) {
        if (interfaceC0155a != null) {
            interfaceC0155a.b(getActivity());
        }
    }

    void d(com.ironsource.lifecycle.a.InterfaceC0155a interfaceC0155a) {
        this.f6376a = interfaceC0155a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f6376a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f6376a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f6376a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f6376a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(com.ironsource.lifecycle.a.InterfaceC0155a interfaceC0155a) {
        if (interfaceC0155a != null) {
            interfaceC0155a.c(getActivity());
        }
    }

    private void b(com.ironsource.lifecycle.a.InterfaceC0155a interfaceC0155a) {
        if (interfaceC0155a != null) {
            interfaceC0155a.a(getActivity());
        }
    }
}
