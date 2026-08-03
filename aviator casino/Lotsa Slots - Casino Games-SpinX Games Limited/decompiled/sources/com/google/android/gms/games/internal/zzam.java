package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public abstract class zzam extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.games.internal.zzan {
    public zzam() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1001) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzan zzb = zzb();
        parcel2.writeNoException();
        int i3 = com.google.android.gms.internal.games_v2.zzc.zza;
        parcel2.writeInt(1);
        zzb.writeToParcel(parcel2, 1);
        return true;
    }
}
