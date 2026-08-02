package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* loaded from: classes4.dex */
final class zzaa extends zzas {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, h hVar, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(hVar);
        this.zza = createWalletObjectsRequest;
        this.zzb = i;
    }

    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.AbstractC0830d
    /* renamed from: zza */
    public final void doExecute(zzy zzyVar) {
        zzyVar.zzp(this.zza, this.zzb);
        setResult((zzaa) Status.e);
    }
}
