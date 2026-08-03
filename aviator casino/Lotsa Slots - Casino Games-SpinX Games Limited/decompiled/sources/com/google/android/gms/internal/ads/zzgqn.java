package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgqn extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzgqo {
    public zzgqn() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
        zzb(bundle);
        return true;
    }
}
