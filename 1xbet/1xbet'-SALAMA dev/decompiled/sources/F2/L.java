package F2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends zzaxo implements M {
    public L() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static M zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC0266z c0262x = null;
        InterfaceC0226e0 c0224d0 = null;
        C a2 = null;
        InterfaceC0265y0 c0263x0 = null;
        P o7 = null;
        C0222c0 c0222c0 = null;
        InterfaceC0260w c0258v = null;
        Z x4 = null;
        switch (i7) {
            case 1:
                p105o3.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
                zzaxp.zzc(parcel);
                boolean zZzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c0262x = iInterfaceQueryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) iInterfaceQueryLocalInterface : new C0262x(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzD(c0262x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    x4 = iInterfaceQueryLocalInterface2 instanceof Z ? (Z) iInterfaceQueryLocalInterface2 : new X(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzG(x4);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzg = zzg();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzrVarZzg);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                zzaxp.zzc(parcel);
                zzF(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsx zzbsxVarZzb = zzbsw.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzM(zzbsxVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbta zzbtaVarZzb = zzbsz.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzaxp.zzc(parcel);
                zzQ(zzbtaVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbct zzbctVarZzb = zzbcs.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzO(zzbctVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c0258v = iInterfaceQueryLocalInterface3 instanceof InterfaceC0260w ? (InterfaceC0260w) iInterfaceQueryLocalInterface3 : new C0258v(strongBinder3, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzaxp.zzc(parcel);
                zzC(c0258v);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0222c0 = iInterfaceQueryLocalInterface4 instanceof C0222c0 ? (C0222c0) iInterfaceQueryLocalInterface4 : new C0222c0(strongBinder4);
                }
                zzaxp.zzc(parcel);
                zzac(c0222c0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                zzbvg zzbvgVarZzb = zzbvf.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzS(zzbvgVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                I0 i0Zzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zzl);
                return true;
            case 29:
                zzfx zzfxVar = (zzfx) zzaxp.zza(parcel, zzfx.CREATOR);
                zzaxp.zzc(parcel);
                zzU(zzfxVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzaxp.zza(parcel, zzee.CREATOR);
                zzaxp.zzc(parcel);
                zzK(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                Z zZzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zZzj);
                return true;
            case 33:
                InterfaceC0266z interfaceC0266zZzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, interfaceC0266zZzi);
                return true;
            case 34:
                boolean zZzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    o7 = iInterfaceQueryLocalInterface5 instanceof P ? (P) iInterfaceQueryLocalInterface5 : new O(strongBinder5);
                }
                zzaxp.zzc(parcel);
                zzE(o7);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzaxp.zza(parcel, zzx.CREATOR);
                zzaxp.zzc(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzazt zzaztVarZze = zzazs.zze(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzH(zzaztVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                F0 f0Zzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, f0Zzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c0263x0 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0265y0 ? (InterfaceC0265y0) iInterfaceQueryLocalInterface6 : new C0263x0(strongBinder6);
                }
                zzaxp.zzc(parcel);
                zzP(c0263x0);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    a2 = iInterfaceQueryLocalInterface7 instanceof C ? (C) iInterfaceQueryLocalInterface7 : new A(strongBinder7, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzaxp.zzc(parcel);
                zzy(zzmVar2, a2);
                parcel2.writeNoException();
                return true;
            case 44:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzW(aVarZ);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c0224d0 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0226e0 ? (InterfaceC0226e0) iInterfaceQueryLocalInterface8 : new C0224d0(strongBinder8, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzaxp.zzc(parcel);
                zzJ(c0224d0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i11 = zzaxp.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
