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
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class L extends zzaxo implements M {
    public L() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static M zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC0266z interfaceC0266z = null;
        InterfaceC0226e0 interfaceC0226e0 = null;
        C c3 = null;
        InterfaceC0265y0 interfaceC0265y0 = null;
        P p5 = null;
        C0222c0 c0222c0 = null;
        InterfaceC0260w interfaceC0260w = null;
        Z z4 = null;
        switch (i7) {
            case 1:
                InterfaceC1506a zzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
                zzaxp.zzc(parcel);
                boolean zzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzab ? 1 : 0);
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
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0266z = queryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) queryLocalInterface : new C0262x(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzD(interfaceC0266z);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    z4 = queryLocalInterface2 instanceof Z ? (Z) queryLocalInterface2 : new X(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzG(z4);
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
                zzr zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzg);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                zzaxp.zzc(parcel);
                zzF(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsx zzb = zzbsw.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbta zzb2 = zzbsz.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaxp.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbct zzb3 = zzbcs.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC0260w = queryLocalInterface3 instanceof InterfaceC0260w ? (InterfaceC0260w) queryLocalInterface3 : new C0258v(readStrongBinder3, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzaxp.zzc(parcel);
                zzC(interfaceC0260w);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0222c0 = queryLocalInterface4 instanceof C0222c0 ? (C0222c0) queryLocalInterface4 : new C0222c0(readStrongBinder4);
                }
                zzaxp.zzc(parcel);
                zzac(c0222c0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbvg zzb4 = zzbvf.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                I0 zzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzl);
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
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                Z zzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzj);
                return true;
            case 33:
                InterfaceC0266z zzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    p5 = queryLocalInterface5 instanceof P ? (P) queryLocalInterface5 : new O(readStrongBinder5);
                }
                zzaxp.zzc(parcel);
                zzE(p5);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzaxp.zza(parcel, zzx.CREATOR);
                zzaxp.zzc(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzazt zze = zzazs.zze(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                F0 zzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC0265y0 = queryLocalInterface6 instanceof InterfaceC0265y0 ? (InterfaceC0265y0) queryLocalInterface6 : new C0263x0(readStrongBinder6);
                }
                zzaxp.zzc(parcel);
                zzP(interfaceC0265y0);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzaxp.zza(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c3 = queryLocalInterface7 instanceof C ? (C) queryLocalInterface7 : new A(readStrongBinder7, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzaxp.zzc(parcel);
                zzy(zzmVar2, c3);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzW(Z6);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC0226e0 = queryLocalInterface8 instanceof InterfaceC0226e0 ? (InterfaceC0226e0) queryLocalInterface8 : new C0224d0(readStrongBinder8, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzaxp.zzc(parcel);
                zzJ(interfaceC0226e0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i11 = zzaxp.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}
