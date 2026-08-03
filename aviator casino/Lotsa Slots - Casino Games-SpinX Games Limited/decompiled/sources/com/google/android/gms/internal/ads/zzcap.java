package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcap extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcaq {
    public zzcap() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcau zzcauVar = null;
        com.google.android.gms.internal.ads.zzcav zzcavVar = null;
        com.google.android.gms.internal.ads.zzcau zzcauVar2 = null;
        com.google.android.gms.internal.ads.zzcau zzcauVar3 = null;
        com.google.android.gms.internal.ads.zzcau zzcauVar4 = null;
        switch (i) {
            case 1:
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, null);
                return true;
            case 2:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcar) {
                    }
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.ads.zzcbd zzcbdVar = (com.google.android.gms.internal.ads.zzcbd) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcbd.CREATOR);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcauVar = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzcau ? (com.google.android.gms.internal.ads.zzcau) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzcas(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(zzcbdVar, zzcauVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.internal.ads.zzcbd zzcbdVar2 = (com.google.android.gms.internal.ads.zzcbd) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcbd.CREATOR);
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcauVar4 = queryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzcau ? (com.google.android.gms.internal.ads.zzcau) queryLocalInterface3 : new com.google.android.gms.internal.ads.zzcas(readStrongBinder3);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(zzcbdVar2, zzcauVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.ads.zzcbd zzcbdVar3 = (com.google.android.gms.internal.ads.zzcbd) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcbd.CREATOR);
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcauVar3 = queryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzcau ? (com.google.android.gms.internal.ads.zzcau) queryLocalInterface4 : new com.google.android.gms.internal.ads.zzcas(readStrongBinder4);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(zzcbdVar3, zzcauVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String readString = parcel.readString();
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcauVar2 = queryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzcau ? (com.google.android.gms.internal.ads.zzcau) queryLocalInterface5 : new com.google.android.gms.internal.ads.zzcas(readStrongBinder5);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(readString, zzcauVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzcam zzcamVar = (com.google.android.gms.internal.ads.zzcam) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcam.CREATOR);
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcavVar = queryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzcav ? (com.google.android.gms.internal.ads.zzcav) queryLocalInterface6 : new com.google.android.gms.internal.ads.zzcav(readStrongBinder6);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(zzcamVar, zzcavVar);
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}
