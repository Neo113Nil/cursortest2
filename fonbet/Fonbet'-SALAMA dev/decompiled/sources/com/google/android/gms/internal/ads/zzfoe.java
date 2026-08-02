package com.google.android.gms.internal.ads;

import android.os.Parcel;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public abstract class zzfoe extends zzaxo implements zzfof {
    public zzfoe() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                BinderC1507b.Z(parcel.readStrongBinder());
                parcel.readString();
                zzaxp.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaxp.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaxp.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaxp.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaxp.zzc(parcel);
                break;
            case 8:
                BinderC1507b.Z(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaxp.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
