package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.C0926e;

/* loaded from: classes4.dex */
final class zzac extends zzae {
    final /* synthetic */ C0926e zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, h hVar, C0926e c0926e, PendingIntent pendingIntent) {
        super(hVar);
        this.zza = c0926e;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzazVar.zzv(this.zza, this.zzb, this);
    }
}
