package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbvh extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbvi {
    public zzbvh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static com.google.android.gms.internal.ads.zzbvi zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(readInt);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvm) {
                    }
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzl(readString, readString2);
                break;
            case 10:
                com.google.android.gms.internal.ads.zzbmu.zzb(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                com.google.android.gms.internal.ads.zzccb zzccbVar = (com.google.android.gms.internal.ads.zzccb) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzccb.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(zzccbVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                com.google.android.gms.internal.ads.zzccf zzb = com.google.android.gms.internal.ads.zzcce.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                java.lang.String readString4 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzw(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
