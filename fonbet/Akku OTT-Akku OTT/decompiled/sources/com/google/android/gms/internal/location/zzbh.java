package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.location.C;
import com.google.android.gms.location.C0930i;
import com.google.android.gms.location.C0931j;

/* loaded from: classes4.dex */
final class zzbh extends C<C0931j> {
    final /* synthetic */ C0930i zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, h hVar, C0930i c0930i, String str) {
        super(hVar);
        this.zza = c0930i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l createFailedResult(Status status) {
        return new C0931j(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzazVar.zzL(this.zza, this, null);
    }
}
