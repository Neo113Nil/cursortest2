package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11091b;

    public A(X x4, AlertDialog alertDialog) {
        this.f11091b = x4;
        this.f11090a = alertDialog;
    }

    public void a(Status status, boolean z4) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f11090a)) {
            map = new HashMap((Map) this.f11090a);
        }
        synchronized (((Map) this.f11091b)) {
            map2 = new HashMap((Map) this.f11091b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.j(status));
            }
        }
    }

    public A() {
        this.f11090a = Collections.synchronizedMap(new WeakHashMap());
        this.f11091b = Collections.synchronizedMap(new WeakHashMap());
    }
}
