package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.C0702a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final InterfaceC0835l mLifecycleFragment;

    public LifecycleCallback(InterfaceC0835l interfaceC0835l) {
        this.mLifecycleFragment = interfaceC0835l;
    }

    @Keep
    private static InterfaceC0835l getChimeraLifecycleFragmentImpl(C0834k c0834k) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static InterfaceC0835l getFragment(Activity activity) {
        return getFragment(new C0834k(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity c3 = this.mLifecycleFragment.c();
        com.google.android.gms.common.internal.D.i(c3);
        return c3;
    }

    public void onActivityResult(int i7, int i8, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC0835l getFragment(C0834k c0834k) {
        Z z4;
        a0 a0Var;
        Activity activity = c0834k.f11192a;
        if (!(activity instanceof androidx.fragment.app.A)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = Z.f11156d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (z4 = (Z) weakReference.get()) == null) {
                try {
                    z4 = (Z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (z4 == null || z4.isRemoving()) {
                        z4 = new Z();
                        activity.getFragmentManager().beginTransaction().add(z4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(z4));
                } catch (ClassCastException e7) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
                }
            }
            return z4;
        }
        androidx.fragment.app.A a2 = (androidx.fragment.app.A) activity;
        WeakHashMap weakHashMap2 = a0.f11164m0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(a2);
        if (weakReference2 == null || (a0Var = (a0) weakReference2.get()) == null) {
            try {
                a0Var = (a0) a2.getSupportFragmentManager().D("SupportLifecycleFragmentImpl");
                if (a0Var == null || a0Var.f9506C) {
                    a0Var = new a0();
                    androidx.fragment.app.Q supportFragmentManager = a2.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C0702a c0702a = new C0702a(supportFragmentManager);
                    c0702a.e(0, a0Var, "SupportLifecycleFragmentImpl");
                    c0702a.d(true);
                }
                weakHashMap2.put(a2, new WeakReference(a0Var));
            } catch (ClassCastException e8) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
            }
        }
        return a0Var;
    }

    public static InterfaceC0835l getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
