package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.K;

/* loaded from: classes4.dex */
final class zzad extends zzae {
    final /* synthetic */ K zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzafVar, h hVar, K k) {
        super(hVar);
        this.zza = k;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzazVar.zzw(this.zza, this);
    }
}
