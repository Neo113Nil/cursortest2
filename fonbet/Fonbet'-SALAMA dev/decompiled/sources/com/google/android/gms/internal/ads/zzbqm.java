package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbd;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbqm extends zzaxo implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbqn ? (zzbqn) queryLocalInterface : new zzbql(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbqq zzbqqVar = null;
        zzbpy zzbpwVar = null;
        zzbqh zzbqfVar = null;
        zzbqb zzbpzVar = null;
        zzbqk zzbqiVar = null;
        zzbqh zzbqfVar2 = null;
        zzbqk zzbqiVar2 = null;
        zzbqe zzbqcVar = null;
        zzbqb zzbpzVar2 = null;
        if (i7 == 1) {
            InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaxp.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaxp.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqqVar = queryLocalInterface instanceof zzbqq ? (zzbqq) queryLocalInterface : new zzbqo(readStrongBinder);
            }
            zzbqq zzbqqVar2 = zzbqqVar;
            zzaxp.zzc(parcel);
            zzh(Z6, readString, bundle, bundle2, zzrVar, zzbqqVar2);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            zzbrc zzf = zzf();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, zzf);
        } else if (i7 == 3) {
            zzbrc zzg = zzg();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, zzg);
        } else if (i7 == 5) {
            I0 zze = zze();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zze);
        } else if (i7 == 10) {
            BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            parcel2.writeNoException();
        } else if (i7 != 11) {
            switch (i7) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpzVar2 = queryLocalInterface2 instanceof zzbqb ? (zzbqb) queryLocalInterface2 : new zzbpz(readStrongBinder2);
                    }
                    zzbqb zzbqbVar = zzbpzVar2;
                    zzbou zzb = zzbot.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzaxp.zzc(parcel);
                    zzj(readString2, readString3, zzmVar, Z7, zzbqbVar, zzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqcVar = queryLocalInterface3 instanceof zzbqe ? (zzbqe) queryLocalInterface3 : new zzbqc(readStrongBinder3);
                    }
                    zzbqe zzbqeVar = zzbqcVar;
                    zzbou zzb2 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzl(readString4, readString5, zzmVar2, Z8, zzbqeVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zzs = zzs(Z9);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqiVar2 = queryLocalInterface4 instanceof zzbqk ? (zzbqk) queryLocalInterface4 : new zzbqi(readStrongBinder4);
                    }
                    zzbqk zzbqkVar = zzbqiVar2;
                    zzbou zzb3 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzp(readString6, readString7, zzmVar3, Z10, zzbqkVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC1506a Z11 = BinderC1507b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zzt = zzt(Z11);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z12 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar2 = queryLocalInterface5 instanceof zzbqh ? (zzbqh) queryLocalInterface5 : new zzbqf(readStrongBinder5);
                    }
                    zzbqh zzbqhVar = zzbqfVar2;
                    zzbou zzb4 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzm(readString8, readString9, zzmVar4, Z12, zzbqhVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzaxp.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z13 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqiVar = queryLocalInterface6 instanceof zzbqk ? (zzbqk) queryLocalInterface6 : new zzbqi(readStrongBinder6);
                    }
                    zzbqk zzbqkVar2 = zzbqiVar;
                    zzbou zzb5 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzo(readString11, readString12, zzmVar5, Z13, zzbqkVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z14 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpzVar = queryLocalInterface7 instanceof zzbqb ? (zzbqb) queryLocalInterface7 : new zzbpz(readStrongBinder7);
                    }
                    zzbqb zzbqbVar2 = zzbpzVar;
                    zzbou zzb6 = zzbot.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzaxp.zzc(parcel);
                    zzk(readString13, readString14, zzmVar6, Z14, zzbqbVar2, zzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z15 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqfVar = queryLocalInterface8 instanceof zzbqh ? (zzbqh) queryLocalInterface8 : new zzbqf(readStrongBinder8);
                    }
                    zzbqh zzbqhVar2 = zzbqfVar;
                    zzbou zzb7 = zzbot.zzb(parcel.readStrongBinder());
                    zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                    zzaxp.zzc(parcel);
                    zzn(readString15, readString16, zzmVar7, Z15, zzbqhVar2, zzb7, zzbeyVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    InterfaceC1506a Z16 = BinderC1507b.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbpwVar = queryLocalInterface9 instanceof zzbpy ? (zzbpy) queryLocalInterface9 : new zzbpw(readStrongBinder9);
                    }
                    zzbpy zzbpyVar = zzbpwVar;
                    zzbou zzb8 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzi(readString17, readString18, zzmVar8, Z16, zzbpyVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC1506a Z17 = BinderC1507b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zzr = zzr(Z17);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzaxp.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
