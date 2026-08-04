package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class P extends com.google.android.gms.common.api.v implements com.google.android.gms.common.api.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f11141a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11142b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f11143c;

    public P(WeakReference weakReference) {
        com.google.android.gms.common.internal.D.j(weakReference, "GoogleApiClient reference must not be null");
        this.f11143c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        new O(this, oVar != null ? ((F) oVar).f11115b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f11142b) {
            synchronized (this.f11142b) {
            }
        }
    }
}
