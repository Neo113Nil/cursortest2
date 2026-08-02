package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class zzfb extends zzo implements zzfa {
    public zzfb() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Collection zza;
        switch (i) {
            case 1:
                zza((zzex) zzp.zza(parcel, zzex.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zza((zzka) zzp.zza(parcel, zzka.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zza((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zza((zzex) zzp.zza(parcel, zzex.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzb((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                zza = zza((zzeb) zzp.zza(parcel, zzeb.CREATOR), zzp.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 9:
                byte[] zza2 = zza((zzex) zzp.zza(parcel, zzex.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zza2);
                return true;
            case 10:
                zza(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String zzc = zzc((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 12:
                zza((zzef) zzp.zza(parcel, zzef.CREATOR), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzb((zzef) zzp.zza(parcel, zzef.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza = zza(parcel.readString(), parcel.readString(), zzp.zza(parcel), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 15:
                zza = zza(parcel.readString(), parcel.readString(), parcel.readString(), zzp.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 16:
                zza = zza(parcel.readString(), parcel.readString(), (zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 17:
                zza = zze(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 18:
                zzd((zzeb) zzp.zza(parcel, zzeb.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
