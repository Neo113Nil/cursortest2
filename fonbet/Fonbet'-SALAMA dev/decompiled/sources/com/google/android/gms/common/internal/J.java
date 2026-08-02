package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class J extends A {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0854f abstractC0854f, int i7) {
        super(abstractC0854f, i7, null);
        this.f11263g = abstractC0854f;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(ConnectionResult connectionResult) {
        AbstractC0854f abstractC0854f = this.f11263g;
        if (abstractC0854f.enableLocalFallback() && AbstractC0854f.zzo(abstractC0854f)) {
            AbstractC0854f.zzk(abstractC0854f, 16);
        } else {
            abstractC0854f.zzc.a(connectionResult);
            abstractC0854f.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        this.f11263g.zzc.a(ConnectionResult.f11059e);
        return true;
    }
}
