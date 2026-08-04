package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820p implements InterfaceC0808d, InterfaceC0806b, InterfaceC0807c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0820p f11322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f11323c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11324a;

    public /* synthetic */ C0820p(Object obj) {
        this.f11324a = obj;
    }

    public static synchronized C0820p b() {
        try {
            if (f11322b == null) {
                f11322b = new C0820p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11322b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0808d
    public void a(ConnectionResult connectionResult) {
        boolean z4 = connectionResult.f11061b == 0;
        AbstractC0810f abstractC0810f = (AbstractC0810f) this.f11324a;
        if (z4) {
            abstractC0810f.getRemoteService(null, abstractC0810f.getScopes());
        } else if (abstractC0810f.zzx != null) {
            abstractC0810f.zzx.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public void onConnected(Bundle bundle) {
        ((InterfaceC0786g) this.f11324a).Z();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0807c
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((InterfaceC0795p) this.f11324a).onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public void onConnectionSuspended(int i7) {
        ((InterfaceC0786g) this.f11324a).onConnectionSuspended(i7);
    }
}
