package com.google.android.gms.auth;

/* loaded from: classes8.dex */
final class zzi implements com.google.android.gms.auth.zzk {
    final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest zza;

    @Override // com.google.android.gms.auth.zzk
    public final /* synthetic */ java.lang.Object zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.auth.AccountChangeEventsResponse zzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.zza);
        com.google.android.gms.auth.zzl.zzc(zzh);
        return zzh.getEvents();
    }

    zzi(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }
}
