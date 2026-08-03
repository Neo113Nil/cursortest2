package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public abstract class zzx extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.games.internal.v2.appshortcuts.zzy {
    public zzx() {
        super("com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsServiceCallback");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzd(status);
        } else if (i == 2) {
            com.google.android.gms.games.internal.v2.appshortcuts.zzh zzhVar = (com.google.android.gms.games.internal.v2.appshortcuts.zzh) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.games.internal.v2.appshortcuts.zzh.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzb(zzhVar);
        } else {
            if (i != 3) {
                return false;
            }
            android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.games_v2.zzc.zza(parcel, android.content.Intent.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzc(intent);
        }
        return true;
    }
}
