package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864p implements InterfaceC0852d, InterfaceC0850b, InterfaceC0851c {

    /* renamed from: b, reason: collision with root package name */
    public static C0864p f11322b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f11323c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f11324a;

    public /* synthetic */ C0864p(Object obj) {
        this.f11324a = obj;
    }

    public static synchronized C0864p b() {
        C0864p c0864p;
        synchronized (C0864p.class) {
            try {
                if (f11322b == null) {
                    f11322b = new C0864p();
                }
                c0864p = f11322b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0864p;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0852d
    public void a(ConnectionResult connectionResult) {
        InterfaceC0851c interfaceC0851c;
        InterfaceC0851c interfaceC0851c2;
        boolean z4 = connectionResult.f11061b == 0;
        AbstractC0854f abstractC0854f = (AbstractC0854f) this.f11324a;
        if (z4) {
            abstractC0854f.getRemoteService(null, abstractC0854f.getScopes());
            return;
        }
        interfaceC0851c = abstractC0854f.zzx;
        if (interfaceC0851c != null) {
            interfaceC0851c2 = abstractC0854f.zzx;
            interfaceC0851c2.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public void onConnected(Bundle bundle) {
        ((InterfaceC0830g) this.f11324a).Z();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((InterfaceC0839p) this.f11324a).onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public void onConnectionSuspended(int i7) {
        ((InterfaceC0830g) this.f11324a).onConnectionSuspended(i7);
    }
}
