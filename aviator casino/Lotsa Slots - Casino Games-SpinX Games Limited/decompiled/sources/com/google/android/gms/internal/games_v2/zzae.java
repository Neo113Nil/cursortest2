package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzae extends com.google.android.gms.internal.games_v2.zza implements android.os.IInterface {
    zzae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void zzd(com.google.android.gms.internal.games_v2.zzad zzadVar, com.google.android.gms.internal.games_v2.zzy zzyVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzadVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, zzyVar);
        zzc(2, zza);
    }
}
