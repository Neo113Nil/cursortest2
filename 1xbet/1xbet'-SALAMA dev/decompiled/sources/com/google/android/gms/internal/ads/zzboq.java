package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzboq extends zzaxo implements zzbor {
    public zzboq() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbou zzbosVar = null;
        switch (i7) {
            case 1:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface : new zzbos(strongBinder);
                }
                zzbou zzbouVar = zzbosVar;
                zzaxp.zzc(parcel);
                zzu(aVarZ, zzrVar, zzmVar, string, zzbouVar);
                parcel2.writeNoException();
                return true;
            case 2:
                p105o3.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzn);
                return true;
            case 3:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface2 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface2 : new zzbos(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzx(aVarZ2, zzmVar2, string2, zzbosVar);
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
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface3 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface3 : new zzbos(strongBinder3);
                }
                zzbou zzbouVar2 = zzbosVar;
                zzaxp.zzc(parcel);
                zzv(aVarZ3, zzrVar2, zzmVar3, string3, string4, zzbouVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface4 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface4 : new zzbos(strongBinder4);
                }
                zzbou zzbouVar3 = zzbosVar;
                zzaxp.zzc(parcel);
                zzy(aVarZ4, zzmVar4, string5, string6, zzbouVar3);
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
                p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string7 = parcel.readString();
                zzbvl zzbvlVarZzb = zzbvk.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzaxp.zzc(parcel);
                zzp(aVarZ5, zzmVar5, string7, zzbvlVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                zzaxp.zzc(parcel);
                zzs(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                p105o3.a aVarZ6 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface5 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface5 : new zzbos(strongBinder5);
                }
                zzbou zzbouVar4 = zzbosVar;
                zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzaxp.zzc(parcel);
                zzz(aVarZ6, zzmVar7, string10, string11, zzbouVar4, zzbeyVar, arrayListCreateStringArrayList);
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
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzaxp.zzc(parcel);
                zzB(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                p105o3.a aVarZ7 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzD(aVarZ7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                p105o3.a aVarZ8 = p105o3.b.Z(parcel.readStrongBinder());
                zzbvl zzbvlVarZzb2 = zzbvk.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzaxp.zzc(parcel);
                zzr(aVarZ8, zzbvlVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgd zzbgdVarZzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbgdVarZzi);
                return true;
            case 25:
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzG(zZzg);
                parcel2.writeNoException();
                return true;
            case 26:
                I0 i0Zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zzh);
                return true;
            case 27:
                zzbpd zzbpdVarZzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbpdVarZzk);
                return true;
            case 28:
                p105o3.a aVarZ9 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface6 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface6 : new zzbos(strongBinder6);
                }
                zzaxp.zzc(parcel);
                zzA(aVarZ9, zzmVar9, string14, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                p105o3.a aVarZ10 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzK(aVarZ10);
                parcel2.writeNoException();
                return true;
            case 31:
                p105o3.a aVarZ11 = p105o3.b.Z(parcel.readStrongBinder());
                zzblb zzblbVarZzb = zzbla.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblh.CREATOR);
                zzaxp.zzc(parcel);
                zzq(aVarZ11, zzblbVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                p105o3.a aVarZ12 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface7 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface7 : new zzbos(strongBinder7);
                }
                zzaxp.zzc(parcel);
                zzC(aVarZ12, zzmVar10, string15, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrc zzbrcVarZzl = zzl();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzbrcVarZzl);
                return true;
            case 34:
                zzbrc zzbrcVarZzm = zzm();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzbrcVarZzm);
                return true;
            case 35:
                p105o3.a aVarZ13 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface8 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface8 : new zzbos(strongBinder8);
                }
                zzbou zzbouVar5 = zzbosVar;
                zzaxp.zzc(parcel);
                zzw(aVarZ13, zzrVar3, zzmVar11, string16, string17, zzbouVar5);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbox zzboxVarZzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzboxVarZzj);
                return true;
            case 37:
                p105o3.a aVarZ14 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzJ(aVarZ14);
                parcel2.writeNoException();
                return true;
            case 38:
                p105o3.a aVarZ15 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbosVar = iInterfaceQueryLocalInterface9 instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface9 : new zzbos(strongBinder9);
                }
                zzaxp.zzc(parcel);
                zzt(aVarZ15, zzmVar12, string18, zzbosVar);
                parcel2.writeNoException();
                return true;
            case 39:
                p105o3.a aVarZ16 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzH(aVarZ16);
                parcel2.writeNoException();
                return true;
        }
    }
}
