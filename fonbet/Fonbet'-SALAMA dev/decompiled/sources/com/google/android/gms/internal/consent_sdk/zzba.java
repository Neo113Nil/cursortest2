package com.google.android.gms.internal.consent_sdk;

import B3.c;
import B3.i;
import B3.j;
import B3.k;

/* loaded from: classes.dex */
final class zzba implements k, j {
    private final k zza;
    private final j zzb;

    public /* synthetic */ zzba(k kVar, j jVar, zzbb zzbbVar) {
        this.zza = kVar;
        this.zzb = jVar;
    }

    @Override // B3.j
    public final void onConsentFormLoadFailure(i iVar) {
        this.zzb.onConsentFormLoadFailure(iVar);
    }

    @Override // B3.k
    public final void onConsentFormLoadSuccess(c cVar) {
        this.zza.onConsentFormLoadSuccess(cVar);
    }
}
