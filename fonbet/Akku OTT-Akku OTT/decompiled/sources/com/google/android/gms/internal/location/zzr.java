package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C0839m;
import com.google.android.gms.location.InterfaceC0928g;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes4.dex */
final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ InterfaceC0928g zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzzVar, h hVar, LocationRequest locationRequest, InterfaceC0928g interfaceC0928g) {
        super(hVar);
        this.zza = locationRequest;
        this.zzb = interfaceC0928g;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) throws RemoteException {
        zzy zzyVar = new zzy(this);
        zzazVar.zzC(this.zza, C0839m.a(zzbj.zzb(), this.zzb, InterfaceC0928g.class.getSimpleName()), zzyVar);
    }
}
