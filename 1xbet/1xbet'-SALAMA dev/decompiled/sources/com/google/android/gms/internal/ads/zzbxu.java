package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxu extends zzaxo implements zzbxv {
    public zzbxu() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            parcel.readString();
            parcel.readString();
            zzaxp.zzc(parcel);
        } else if (i7 == 2) {
            String string = parcel.readString();
            zzaxp.zzc(parcel);
            zzb(string);
        } else {
            if (i7 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
            zzaxp.zzc(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
