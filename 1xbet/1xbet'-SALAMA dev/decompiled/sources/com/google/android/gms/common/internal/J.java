package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class J extends A {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0810f abstractC0810f, int i7) {
        super(abstractC0810f, i7, null);
        this.f11263g = abstractC0810f;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(ConnectionResult connectionResult) {
        AbstractC0810f abstractC0810f = this.f11263g;
        if (abstractC0810f.enableLocalFallback() && AbstractC0810f.zzo(abstractC0810f)) {
            AbstractC0810f.zzk(abstractC0810f, 16);
        } else {
            abstractC0810f.zzc.a(connectionResult);
            abstractC0810f.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        this.f11263g.zzc.a(ConnectionResult.f11059e);
        return true;
    }
}
