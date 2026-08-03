package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzcn extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbvc zzf = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzb = zzb(asInterface, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzb);
                return true;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbvc zzf2 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzc = zzc(asInterface2, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzc);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbvc zzf3 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbq zzd = zzd(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzd);
                return true;
            case 4:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbmi zze = zze(asInterface4, asInterface5);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zze);
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper asInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf4 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzcbs zzf5 = zzf(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzf5);
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper asInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbzb zzg = zzg(asInterface7);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzg);
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper asInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzcy zzi = zzi(asInterface8, readInt5);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzi);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper asInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                java.lang.String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzj = zzj(asInterface9, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzj);
                return true;
            case 11:
                com.google.android.gms.dynamic.IObjectWrapper asInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbmn zzk = zzk(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzk);
                return true;
            case 12:
                com.google.android.gms.dynamic.IObjectWrapper asInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String readString5 = parcel.readString();
                com.google.android.gms.internal.ads.zzbvc zzf6 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzcci zzl = zzl(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzl);
                return true;
            case 13:
                com.google.android.gms.dynamic.IObjectWrapper asInterface14 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar4 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                java.lang.String readString6 = parcel.readString();
                com.google.android.gms.internal.ads.zzbvc zzf7 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzm = zzm(asInterface14, zzrVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzm);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper asInterface15 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf8 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzcem zzn = zzn(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzn);
                return true;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper asInterface16 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf9 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbyu zzo = zzo(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzo);
                return true;
            case 16:
                com.google.android.gms.dynamic.IObjectWrapper asInterface17 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf10 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbqq zzc2 = com.google.android.gms.internal.ads.zzbqp.zzc(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbqt zzp = zzp(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzp);
                return true;
            case 17:
                com.google.android.gms.dynamic.IObjectWrapper asInterface18 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf11 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzdt zzq = zzq(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzq);
                return true;
            case 18:
                com.google.android.gms.dynamic.IObjectWrapper asInterface19 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbvc zzf12 = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzch zzh = zzh(asInterface19, zzf12, readInt13);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
