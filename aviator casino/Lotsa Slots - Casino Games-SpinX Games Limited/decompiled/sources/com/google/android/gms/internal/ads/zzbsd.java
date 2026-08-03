package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbsd extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbse {
    public zzbsd() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbsh zzbsfVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzea zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbsfVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsfVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbsh ? (com.google.android.gms.internal.ads.zzbsh) queryLocalInterface : new com.google.android.gms.internal.ads.zzbsf(readStrongBinder);
            }
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzd(asInterface, zzbsfVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbmb zzf = zzf();
        parcel2.writeNoException();
        com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzf);
        return true;
    }
}
