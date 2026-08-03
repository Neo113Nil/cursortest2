package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbve extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbvf {
    public zzbve() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvi zzbviVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString = parcel.readString();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbvi zzbviVar2 = zzbviVar;
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(asInterface, zzrVar, zzmVar, readString, zzbviVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzf);
                return true;
            case 3:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString2 = parcel.readString();
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(asInterface2, zzmVar2, readString2, zzbviVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface3 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder3);
                }
                com.google.android.gms.internal.ads.zzbvi zzbviVar3 = zzbviVar;
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(asInterface3, zzrVar2, zzmVar3, readString3, readString4, zzbviVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString5 = parcel.readString();
                java.lang.String readString6 = parcel.readString();
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface4 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder4);
                }
                com.google.android.gms.internal.ads.zzbvi zzbviVar4 = zzbviVar;
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzk(asInterface4, zzmVar4, readString5, readString6, zzbviVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString7 = parcel.readString();
                com.google.android.gms.internal.ads.zzcca zzb = com.google.android.gms.internal.ads.zzcbz.zzb(parcel.readStrongBinder());
                java.lang.String readString8 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(asInterface5, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString9 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper asInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString10 = parcel.readString();
                java.lang.String readString11 = parcel.readString();
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface5 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface5 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder5);
                }
                com.google.android.gms.internal.ads.zzbvi zzbviVar5 = zzbviVar;
                com.google.android.gms.internal.ads.zzblt zzbltVar = (com.google.android.gms.internal.ads.zzblt) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzblt.CREATOR);
                java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(asInterface6, zzmVar7, readString10, readString11, zzbviVar5, zzbltVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 17:
                android.os.Bundle zzs = zzs();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzs);
                return true;
            case 18:
                android.os.Bundle zzt = zzt();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzt);
                return true;
            case 19:
                android.os.Bundle zzu = zzu();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString12 = parcel.readString();
                java.lang.String readString13 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzv(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.IObjectWrapper asInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzw(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                com.google.android.gms.dynamic.IObjectWrapper asInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzcca zzb2 = com.google.android.gms.internal.ads.zzcbz.zzb(parcel.readStrongBinder());
                java.util.ArrayList<java.lang.String> createStringArrayList2 = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzy(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                com.google.android.gms.internal.ads.zzbmv zzz = zzz();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzz);
                return true;
            case 25:
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzA(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzB = zzB();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzB);
                return true;
            case 27:
                com.google.android.gms.internal.ads.zzbvr zzC = zzC();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzC);
                return true;
            case 28:
                com.google.android.gms.dynamic.IObjectWrapper asInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString14 = parcel.readString();
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface6 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface6 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder6);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzD(asInterface9, zzmVar9, readString14, zzbviVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                com.google.android.gms.dynamic.IObjectWrapper asInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzE(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.dynamic.IObjectWrapper asInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbrt zzb3 = com.google.android.gms.internal.ads.zzbrs.zzb(parcel.readStrongBinder());
                java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.zzbrz.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzF(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                com.google.android.gms.dynamic.IObjectWrapper asInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString15 = parcel.readString();
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface7 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface7 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder7);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzG(asInterface12, zzmVar10, readString15, zzbviVar);
                parcel2.writeNoException();
                return true;
            case 33:
                com.google.android.gms.internal.ads.zzbxq zzH = zzH();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzH);
                return true;
            case 34:
                com.google.android.gms.internal.ads.zzbxq zzI = zzI();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzI);
                return true;
            case 35:
                com.google.android.gms.dynamic.IObjectWrapper asInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString16 = parcel.readString();
                java.lang.String readString17 = parcel.readString();
                android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface8 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface8 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder8);
                }
                com.google.android.gms.internal.ads.zzbvi zzbviVar6 = zzbviVar;
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzJ(asInterface13, zzrVar3, zzmVar11, readString16, readString17, zzbviVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                com.google.android.gms.internal.ads.zzbvl zzK = zzK();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzK);
                return true;
            case 37:
                com.google.android.gms.dynamic.IObjectWrapper asInterface14 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzL(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                com.google.android.gms.dynamic.IObjectWrapper asInterface15 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                java.lang.String readString18 = parcel.readString();
                android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbviVar = queryLocalInterface9 instanceof com.google.android.gms.internal.ads.zzbvi ? (com.google.android.gms.internal.ads.zzbvi) queryLocalInterface9 : new com.google.android.gms.internal.ads.zzbvg(readStrongBinder9);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzM(asInterface15, zzmVar12, readString18, zzbviVar);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.dynamic.IObjectWrapper asInterface16 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzN(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
