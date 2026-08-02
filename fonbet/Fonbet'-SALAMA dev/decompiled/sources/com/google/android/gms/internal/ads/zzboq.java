package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzboq extends zzaxo implements zzbor {
    public zzboq() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbou zzbouVar = null;
        switch (i7) {
            case 1:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface instanceof zzbou ? (zzbou) queryLocalInterface : new zzbos(readStrongBinder);
                }
                zzbou zzbouVar2 = zzbouVar;
                zzaxp.zzc(parcel);
                zzu(Z6, zzrVar, zzmVar, readString, zzbouVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC1506a zzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzn);
                return true;
            case 3:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface2 instanceof zzbou ? (zzbou) queryLocalInterface2 : new zzbos(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzx(Z7, zzmVar2, readString2, zzbouVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface3 instanceof zzbou ? (zzbou) queryLocalInterface3 : new zzbos(readStrongBinder3);
                }
                zzbou zzbouVar3 = zzbouVar;
                zzaxp.zzc(parcel);
                zzv(Z8, zzrVar2, zzmVar3, readString3, readString4, zzbouVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface4 instanceof zzbou ? (zzbou) queryLocalInterface4 : new zzbos(readStrongBinder4);
                }
                zzbou zzbouVar4 = zzbouVar;
                zzaxp.zzc(parcel);
                zzy(Z9, zzmVar4, readString5, readString6, zzbouVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzbvl zzb = zzbvk.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaxp.zzc(parcel);
                zzp(Z10, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                zzaxp.zzc(parcel);
                zzs(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                InterfaceC1506a Z11 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface5 instanceof zzbou ? (zzbou) queryLocalInterface5 : new zzbos(readStrongBinder5);
                }
                zzbou zzbouVar5 = zzbouVar;
                zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaxp.zzc(parcel);
                zzz(Z11, zzmVar7, readString10, readString11, zzbouVar5, zzbeyVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaxp.zzc(parcel);
                zzB(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                InterfaceC1506a Z12 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzD(Z12);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC1506a Z13 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbvl zzb2 = zzbvk.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaxp.zzc(parcel);
                zzr(Z13, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgd zzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                I0 zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbpd zzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzk);
                return true;
            case 28:
                InterfaceC1506a Z14 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface6 instanceof zzbou ? (zzbou) queryLocalInterface6 : new zzbos(readStrongBinder6);
                }
                zzaxp.zzc(parcel);
                zzA(Z14, zzmVar9, readString14, zzbouVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC1506a Z15 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzK(Z15);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC1506a Z16 = BinderC1507b.Z(parcel.readStrongBinder());
                zzblb zzb3 = zzbla.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzblh.CREATOR);
                zzaxp.zzc(parcel);
                zzq(Z16, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC1506a Z17 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface7 instanceof zzbou ? (zzbou) queryLocalInterface7 : new zzbos(readStrongBinder7);
                }
                zzaxp.zzc(parcel);
                zzC(Z17, zzmVar10, readString15, zzbouVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrc zzl = zzl();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzl);
                return true;
            case 34:
                zzbrc zzm = zzm();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzm);
                return true;
            case 35:
                InterfaceC1506a Z18 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface8 instanceof zzbou ? (zzbou) queryLocalInterface8 : new zzbos(readStrongBinder8);
                }
                zzbou zzbouVar6 = zzbouVar;
                zzaxp.zzc(parcel);
                zzw(Z18, zzrVar3, zzmVar11, readString16, readString17, zzbouVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbox zzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzj);
                return true;
            case 37:
                InterfaceC1506a Z19 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzJ(Z19);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC1506a Z20 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbouVar = queryLocalInterface9 instanceof zzbou ? (zzbou) queryLocalInterface9 : new zzbos(readStrongBinder9);
                }
                zzaxp.zzc(parcel);
                zzt(Z20, zzmVar12, readString18, zzbouVar);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC1506a Z21 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzH(Z21);
                parcel2.writeNoException();
                return true;
        }
    }
}
