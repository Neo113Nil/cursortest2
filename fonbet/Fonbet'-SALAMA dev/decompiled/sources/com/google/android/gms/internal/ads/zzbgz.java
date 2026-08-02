package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbgz extends zzaxo implements zzbha {
    public zzbgz() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zzf(readString);
        } else {
            if (i7 != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
