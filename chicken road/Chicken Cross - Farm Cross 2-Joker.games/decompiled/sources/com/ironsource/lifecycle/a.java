package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes6.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1329a f8320a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC1329a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC1329a interfaceC1329a) {
        if (interfaceC1329a != null) {
            interfaceC1329a.b(getActivity());
        }
    }

    void d(InterfaceC1329a interfaceC1329a) {
        this.f8320a = interfaceC1329a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f8320a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8320a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f8320a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f8320a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC1329a interfaceC1329a) {
        if (interfaceC1329a != null) {
            interfaceC1329a.c(getActivity());
        }
    }

    private void b(InterfaceC1329a interfaceC1329a) {
        if (interfaceC1329a != null) {
            interfaceC1329a.a(getActivity());
        }
    }
}
