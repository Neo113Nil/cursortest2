package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.media3.common.C0338w;
import com.google.android.gms.dynamic.a;

/* loaded from: classes4.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzd() throws RemoteException {
        return C0338w.a(zzH(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zze(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return C0338w.a(zzH(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0338w.a(zzH(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return C0338w.a(zzH(6, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0338w.a(zzH(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C0338w.a(zzH(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final a zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return C0338w.a(zzH(1, zza));
    }
}
