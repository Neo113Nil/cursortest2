package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzblo extends zzaxo implements zzblp {
    public zzblo() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            parcel.readInt();
            zzaxp.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
