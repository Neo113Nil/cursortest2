package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.internal.games_v2.zza implements android.os.IInterface {
    zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void zzd(com.google.android.gms.games.internal.v2.appshortcuts.zzy zzyVar, com.google.android.gms.games.internal.v2.appshortcuts.zzs zzsVar, java.util.List list, java.util.List list2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzyVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, zzsVar);
        zza.writeTypedList(list);
        zza.writeTypedList(list2);
        zzc(3, zza);
    }

    public final void zze(com.google.android.gms.games.internal.v2.appshortcuts.zzy zzyVar, com.google.android.gms.games.internal.v2.appshortcuts.zzs zzsVar, com.google.android.gms.games.internal.v2.appshortcuts.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzd(zza, zzyVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, zzsVar);
        com.google.android.gms.internal.games_v2.zzc.zzc(zza, zzjVar);
        zzc(4, zza);
    }
}
