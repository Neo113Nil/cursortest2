package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmh extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbmi {
    public zzbmh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static com.google.android.gms.internal.ads.zzbmi zzdG(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmi ? (com.google.android.gms.internal.ads.zzbmi) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbmb zzblzVar;
        switch (i) {
            case 1:
                java.lang.String readString = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzb(readString, asInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.dynamic.IObjectWrapper zzc = zzc(readString2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzc);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzd(asInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzdB(asInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzdD(asInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzblzVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzblzVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmb ? (com.google.android.gms.internal.ads.zzbmb) queryLocalInterface : new com.google.android.gms.internal.ads.zzblz(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzdE(zzblzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzdC(asInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
