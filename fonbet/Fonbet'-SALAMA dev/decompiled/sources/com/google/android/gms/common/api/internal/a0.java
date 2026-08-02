package com.google.android.gms.common.api.internal;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import androidx.fragment.app.C0726z;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends AbstractComponentCallbacksC0722v implements InterfaceC0835l {

    /* renamed from: m0, reason: collision with root package name */
    public static final WeakHashMap f11164m0 = new WeakHashMap();

    /* renamed from: j0, reason: collision with root package name */
    public final Map f11165j0 = Collections.synchronizedMap(new r.b());

    /* renamed from: k0, reason: collision with root package name */
    public int f11166k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public Bundle f11167l0;

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f11165j0;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AbstractC0486a1.h("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f11166k0 > 0) {
            new zzi(Looper.getMainLooper()).post(new H2.q(14, this, lifecycleCallback, str, false));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final LifecycleCallback b(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f11165j0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final Activity c() {
        C0726z c0726z = this.f9514K;
        if (c0726z == null) {
            return null;
        }
        return c0726z.f9551a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.e(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void p(int i7, int i8, Intent intent) {
        super.p(i7, i8, intent);
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i7, i8, intent);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void r(Bundle bundle) {
        super.r(bundle);
        this.f11166k0 = 1;
        this.f11167l0 = bundle;
        for (Map.Entry entry : this.f11165j0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void s() {
        this.f9524U = true;
        this.f11166k0 = 5;
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void w() {
        this.f9524U = true;
        this.f11166k0 = 3;
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void x(Bundle bundle) {
        for (Map.Entry entry : this.f11165j0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void y() {
        this.f9524U = true;
        this.f11166k0 = 2;
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0722v
    public final void z() {
        this.f9524U = true;
        this.f11166k0 = 4;
        Iterator it = this.f11165j0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
