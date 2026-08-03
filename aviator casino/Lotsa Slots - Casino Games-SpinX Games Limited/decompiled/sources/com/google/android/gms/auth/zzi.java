package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzi implements com.google.android.gms.auth.zzk {
    final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest zza;

    zzi(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.auth.AccountChangeEventsResponse zzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.zza);
        com.google.android.gms.auth.zzl.zzc(zzh);
        return zzh.getEvents();
    }
}
