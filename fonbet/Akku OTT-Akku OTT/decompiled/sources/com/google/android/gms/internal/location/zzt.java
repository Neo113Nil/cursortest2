package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C0839m;
import com.google.android.gms.location.AbstractC0927f;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes4.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ AbstractC0927f zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, h hVar, LocationRequest locationRequest, AbstractC0927f abstractC0927f, Looper looper) {
        super(hVar);
        this.zza = locationRequest;
        this.zzb = abstractC0927f;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzy zzyVar = new zzy(this);
        zzazVar.zzB(zzba.zza(null, this.zza), C0839m.a(zzbj.zza(this.zzc), this.zzb, AbstractC0927f.class.getSimpleName()), zzyVar);
    }
}
