package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzar extends com.google.android.gms.internal.games_v2.zza implements com.google.android.gms.internal.games_v2.zzat {
    zzar(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.recall.IRecallService");
    }

    @Override // com.google.android.gms.internal.games_v2.zzat
    public final void zzd(com.google.android.gms.internal.games_v2.zzaq zzaqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzaqVar);
        zza.writeString("unusedServerClientId");
        zzc(2, zza);
    }
}
