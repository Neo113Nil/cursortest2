package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbqm extends zzaxo implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbqn ? (zzbqn) iInterfaceQueryLocalInterface : new zzbql(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbqq] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.ads.zzbqb] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbqk] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.internal.ads.zzbqb] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbqm, com.google.android.gms.internal.ads.zzbqn] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzbqh] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.zzbqh] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.zzbpy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbqe] */
    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface zzbpwVar = null;
        if (i7 == 1) {
            p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaxp.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaxp.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbpwVar = iInterfaceQueryLocalInterface instanceof zzbqq ? (zzbqq) iInterfaceQueryLocalInterface : new zzbqo(strongBinder);
            }
            ?? r11 = zzbpwVar;
            zzaxp.zzc(parcel);
            zzh(aVarZ, string, bundle, bundle2, zzrVar, r11);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            zzbrc zzbrcVarZzf = zzf();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, zzbrcVarZzf);
        } else if (i7 == 3) {
            zzbrc zzbrcVarZzg = zzg();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, zzbrcVarZzg);
        } else if (i7 == 5) {
            I0 i0Zze = zze();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, i0Zze);
        } else if (i7 == 10) {
            p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            parcel2.writeNoException();
        } else if (i7 != 11) {
            switch (i7) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface2 instanceof zzbqb ? (zzbqb) iInterfaceQueryLocalInterface2 : new zzbpz(strongBinder2);
                    }
                    ?? r12 = zzbpwVar;
                    zzbou zzbouVarZzb = zzbot.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzaxp.zzc(parcel);
                    zzj(string2, string3, zzmVar, aVarZ2, r12, zzbouVarZzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface3 instanceof zzbqe ? (zzbqe) iInterfaceQueryLocalInterface3 : new zzbqc(strongBinder3);
                    }
                    ?? r7 = zzbpwVar;
                    zzbou zzbouVarZzb2 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzl(string4, string5, zzmVar2, aVarZ3, r7, zzbouVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zZzs = zzs(aVarZ4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface4 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface4 : new zzbqi(strongBinder4);
                    }
                    ?? r13 = zzbpwVar;
                    zzbou zzbouVarZzb3 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzp(string6, string7, zzmVar3, aVarZ5, r13, zzbouVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    p105o3.a aVarZ6 = p105o3.b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zZzt = zzt(aVarZ6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ7 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface5 instanceof zzbqh ? (zzbqh) iInterfaceQueryLocalInterface5 : new zzbqf(strongBinder5);
                    }
                    ?? r8 = zzbpwVar;
                    zzbou zzbouVarZzb4 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzm(string8, string9, zzmVar4, aVarZ7, r8, zzbouVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzaxp.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ8 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface6 instanceof zzbqk ? (zzbqk) iInterfaceQueryLocalInterface6 : new zzbqi(strongBinder6);
                    }
                    ?? r14 = zzbpwVar;
                    zzbou zzbouVarZzb5 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzo(string11, string12, zzmVar5, aVarZ8, r14, zzbouVarZzb5);
                    parcel2.writeNoException();
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ9 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface7 instanceof zzbqb ? (zzbqb) iInterfaceQueryLocalInterface7 : new zzbpz(strongBinder7);
                    }
                    ?? r15 = zzbpwVar;
                    zzbou zzbouVarZzb6 = zzbot.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzaxp.zzc(parcel);
                    zzk(string13, string14, zzmVar6, aVarZ9, r15, zzbouVarZzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ10 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface8 instanceof zzbqh ? (zzbqh) iInterfaceQueryLocalInterface8 : new zzbqf(strongBinder8);
                    }
                    ?? r9 = zzbpwVar;
                    zzbou zzbouVarZzb7 = zzbot.zzb(parcel.readStrongBinder());
                    zzbey zzbeyVar = (zzbey) zzaxp.zza(parcel, zzbey.CREATOR);
                    zzaxp.zzc(parcel);
                    zzn(string15, string16, zzmVar7, aVarZ10, r9, zzbouVarZzb7, zzbeyVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    p105o3.a aVarZ11 = p105o3.b.Z(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbpwVar = iInterfaceQueryLocalInterface9 instanceof zzbpy ? (zzbpy) iInterfaceQueryLocalInterface9 : new zzbpw(strongBinder9);
                    }
                    ?? r10 = zzbpwVar;
                    zzbou zzbouVarZzb8 = zzbot.zzb(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    zzi(string17, string18, zzmVar8, aVarZ11, r10, zzbouVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    p105o3.a aVarZ12 = p105o3.b.Z(parcel.readStrongBinder());
                    zzaxp.zzc(parcel);
                    boolean zZzr = zzr(aVarZ12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
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
