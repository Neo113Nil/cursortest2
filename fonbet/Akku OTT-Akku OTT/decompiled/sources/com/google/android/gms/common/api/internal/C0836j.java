package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.C0875q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0836j {

    @NonNull
    protected final InterfaceC0837k mLifecycleFragment;

    public C0836j(@NonNull InterfaceC0837k interfaceC0837k) {
        this.mLifecycleFragment = interfaceC0837k;
    }

    @NonNull
    public static InterfaceC0837k getFragment(@NonNull Activity activity) {
        return getFragment(new C0835i(activity));
    }

    @MainThread
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @NonNull
    public Activity getActivity() {
        Activity c = this.mLifecycleFragment.c();
        C0875q.g(c);
        return c;
    }

    @MainThread
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
    }

    @MainThread
    public void onDestroy() {
    }

    @MainThread
    public void onResume() {
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @MainThread
    public void onStart() {
    }

    @MainThread
    public void onStop() {
    }

    @NonNull
    public static InterfaceC0837k getFragment(@NonNull C0835i c0835i) {
        u0 u0Var;
        x0 x0Var;
        Activity activity = c0835i.a;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            WeakHashMap weakHashMap = x0.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
            if (weakReference != null && (x0Var = (x0) weakReference.get()) != null) {
                return x0Var;
            }
            try {
                x0 x0Var2 = (x0) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SLifecycleFragmentImpl");
                if (x0Var2 == null || x0Var2.isRemoving()) {
                    x0Var2 = new x0();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(x0Var2, "SLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(fragmentActivity, new WeakReference(x0Var2));
                return x0Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        if (activity == null) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        WeakHashMap weakHashMap2 = u0.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
        if (weakReference2 != null && (u0Var = (u0) weakReference2.get()) != null) {
            return u0Var;
        }
        try {
            u0 u0Var2 = (u0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (u0Var2 == null || u0Var2.isRemoving()) {
                u0Var2 = new u0();
                activity.getFragmentManager().beginTransaction().add(u0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap2.put(activity, new WeakReference(u0Var2));
            return u0Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @NonNull
    public static InterfaceC0837k getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
