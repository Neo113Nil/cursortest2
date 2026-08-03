package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public abstract class zzap extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.internal.games_v2.zzaq {
    public zzap() {
        super("com.google.android.gms.games.internal.recall.IRecallCallbacks");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            com.google.android.gms.internal.games_v2.zzau zzauVar = (com.google.android.gms.internal.games_v2.zzau) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.internal.games_v2.zzau.CREATOR);
            com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
            zzc(zzauVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        zzb(status);
        return true;
    }
}
