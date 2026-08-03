package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzfz extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzga {
    public zzfz() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.measurement.internal.zzgg zzggVar = null;
        com.google.android.gms.measurement.internal.zzgd zzgdVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.measurement.internal.zzbg zzbgVar = (com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzbg.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zze(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.measurement.internal.zzpk zzpkVar = (com.google.android.gms.measurement.internal.zzpk) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzpk.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzf(zzpkVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzg(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.zzbg zzbgVar2 = (com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzbg.CREATOR);
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzh(zzbgVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.measurement.internal.zzr zzrVar4 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzi(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.measurement.internal.zzr zzrVar5 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                boolean zza = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzj = zzj(zzrVar5, zza);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.zzbg zzbgVar3 = (com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzbg.CREATOR);
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                byte[] zzk = zzk(zzbgVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                java.lang.String readString4 = parcel.readString();
                java.lang.String readString5 = parcel.readString();
                java.lang.String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzl(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.measurement.internal.zzr zzrVar6 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.lang.String zzm = zzm(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.zzah zzahVar = (com.google.android.gms.measurement.internal.zzah) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzah.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar7 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzn(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.zzah zzahVar2 = (com.google.android.gms.measurement.internal.zzah) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzah.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzo(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                java.lang.String readString7 = parcel.readString();
                java.lang.String readString8 = parcel.readString();
                boolean zza2 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                com.google.android.gms.measurement.internal.zzr zzrVar8 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzp = zzp(readString7, readString8, zza2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzp);
                return true;
            case 15:
                java.lang.String readString9 = parcel.readString();
                java.lang.String readString10 = parcel.readString();
                java.lang.String readString11 = parcel.readString();
                boolean zza3 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzq = zzq(readString9, readString10, readString11, zza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 16:
                java.lang.String readString12 = parcel.readString();
                java.lang.String readString13 = parcel.readString();
                com.google.android.gms.measurement.internal.zzr zzrVar9 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzr = zzr(readString12, readString13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzr);
                return true;
            case 17:
                java.lang.String readString14 = parcel.readString();
                java.lang.String readString15 = parcel.readString();
                java.lang.String readString16 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzs = zzs(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzs);
                return true;
            case 18:
                com.google.android.gms.measurement.internal.zzr zzrVar10 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzt(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar11 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzu(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.measurement.internal.zzr zzrVar12 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzv(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.measurement.internal.zzr zzrVar13 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                com.google.android.gms.measurement.internal.zzao zzw = zzw(zzrVar13);
                parcel2.writeNoException();
                if (zzw == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzw.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                com.google.android.gms.measurement.internal.zzr zzrVar14 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                java.util.List zzx = zzx(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzx);
                return true;
            case 25:
                com.google.android.gms.measurement.internal.zzr zzrVar15 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzy(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.measurement.internal.zzr zzrVar16 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzz(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                com.google.android.gms.measurement.internal.zzr zzrVar17 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzA(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                com.google.android.gms.measurement.internal.zzr zzrVar18 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.measurement.internal.zzon zzonVar = (com.google.android.gms.measurement.internal.zzon) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzon.CREATOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzggVar = queryLocalInterface instanceof com.google.android.gms.measurement.internal.zzgg ? (com.google.android.gms.measurement.internal.zzgg) queryLocalInterface : new com.google.android.gms.measurement.internal.zzge(readStrongBinder);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzB(zzrVar18, zzonVar, zzggVar);
                parcel2.writeNoException();
                return true;
            case 30:
                com.google.android.gms.measurement.internal.zzr zzrVar19 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                com.google.android.gms.measurement.internal.zzaf zzafVar = (com.google.android.gms.measurement.internal.zzaf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzaf.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzC(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.measurement.internal.zzr zzrVar20 = (com.google.android.gms.measurement.internal.zzr) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgdVar = queryLocalInterface2 instanceof com.google.android.gms.measurement.internal.zzgd ? (com.google.android.gms.measurement.internal.zzgd) queryLocalInterface2 : new com.google.android.gms.measurement.internal.zzgb(readStrongBinder2);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                zzD(zzrVar20, bundle3, zzgdVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
