package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcbz extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcca {
    public zzcbz() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static com.google.android.gms.internal.ads.zzcca zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcca ? (com.google.android.gms.internal.ads.zzcca) queryLocalInterface : new com.google.android.gms.internal.ads.zzcby(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(asInterface);
                break;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(asInterface2, readInt);
                break;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(asInterface3);
                break;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(asInterface4);
                break;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(asInterface5);
                break;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper asInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(asInterface6);
                break;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper asInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzccb zzccbVar = (com.google.android.gms.internal.ads.zzccb) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzccb.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzk(asInterface7, zzccbVar);
                break;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper asInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzl(asInterface8);
                break;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper asInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzm(asInterface9, readInt2);
                break;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper asInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(asInterface10);
                break;
            case 11:
                com.google.android.gms.dynamic.IObjectWrapper asInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(asInterface11);
                break;
            case 12:
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper asInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(asInterface12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
