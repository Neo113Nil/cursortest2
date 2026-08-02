package com.google.android.gms.ads.internal;

import E2.n;
import F2.B0;
import F2.I;
import F2.InterfaceC0220b0;
import F2.InterfaceC0238k0;
import F2.M;
import F2.V;
import H2.b;
import H2.d;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzdhw;
import com.google.android.gms.internal.ads.zzdhy;
import com.google.android.gms.internal.ads.zzdsa;
import com.google.android.gms.internal.ads.zzeig;
import com.google.android.gms.internal.ads.zzevf;
import com.google.android.gms.internal.ads.zzewt;
import com.google.android.gms.internal.ads.zzeyk;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfac;
import java.util.HashMap;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public class ClientApi extends zzaxo implements InterfaceC0220b0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // F2.InterfaceC0220b0
    public final zzbfn G(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2) {
        return new zzdhy((FrameLayout) BinderC1507b.t0(interfaceC1506a), (FrameLayout) BinderC1507b.t0(interfaceC1506a2), 250930000);
    }

    @Override // F2.InterfaceC0220b0
    public final zzbkb H(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        zzdsa zzj = zzcgb.zza(context, zzbooVar, i7).zzj();
        zzj.zzb(context);
        zzj.zza(zzbjyVar);
        return zzj.zzc().zzd();
    }

    @Override // F2.InterfaceC0220b0
    public final M I(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        zzewt zzt = zzcgb.zza(context, zzbooVar, i7).zzt();
        zzt.zzc(context);
        zzt.zza(zzrVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbxy N(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) BinderC1507b.t0(interfaceC1506a), zzbooVar, i7).zzp();
    }

    @Override // F2.InterfaceC0220b0
    public final M U(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        zzeyk zzu = zzcgb.zza(context, zzbooVar, i7).zzu();
        zzu.zzc(context);
        zzu.zza(zzrVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final B0 V(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) BinderC1507b.t0(interfaceC1506a), zzbooVar, i7).zzl();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbvt d0(InterfaceC1506a interfaceC1506a, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        zzezy zzv = zzcgb.zza(context, zzbooVar, i7).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbsh f(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) BinderC1507b.t0(interfaceC1506a), zzbooVar, i7).zzm();
    }

    @Override // F2.InterfaceC0220b0
    public final InterfaceC0238k0 i(InterfaceC1506a interfaceC1506a, int i7) {
        return zzcgb.zza((Context) BinderC1507b.t0(interfaceC1506a), null, i7).zzb();
    }

    @Override // F2.InterfaceC0220b0
    public final I j0(InterfaceC1506a interfaceC1506a, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        return new zzeig(zzcgb.zza(context, zzbooVar, i7), context, str);
    }

    @Override // F2.InterfaceC0220b0
    public final V n0(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) BinderC1507b.t0(interfaceC1506a), zzbooVar, i7).zzz();
    }

    @Override // F2.InterfaceC0220b0
    public final M x(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, int i7) {
        return new n((Context) BinderC1507b.t0(interfaceC1506a), zzrVar, str, new VersionInfoParcel(250930000, i7, true, false));
    }

    @Override // F2.InterfaceC0220b0
    public final M z(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        zzevf zzs = zzcgb.zza(context, zzbooVar, i7).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        return zzs.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzboo zzf = zzbon.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxp.zzc(parcel);
                M I7 = I(Z6, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, I7);
                return true;
            case 2:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzboo zzf2 = zzbon.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxp.zzc(parcel);
                M U4 = U(Z7, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, U4);
                return true;
            case 3:
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzboo zzf3 = zzbon.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaxp.zzc(parcel);
                I j02 = j0(Z8, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, j02);
                return true;
            case 4:
                BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 5:
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbfn G2 = G(Z9, Z10);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, G2);
                return true;
            case 6:
                InterfaceC1506a Z11 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf4 = zzbon.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaxp.zzc(parcel);
                Context context = (Context) BinderC1507b.t0(Z11);
                zzezy zzv = zzcgb.zza(context, zzf4, readInt4).zzv();
                zzv.zzb(context);
                zzfac zzb = zzv.zzc().zzb();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzb);
                return true;
            case 7:
                BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 8:
                InterfaceC1506a Z12 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbso zzn = zzn(Z12);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzn);
                return true;
            case 9:
                InterfaceC1506a Z13 = BinderC1507b.Z(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaxp.zzc(parcel);
                InterfaceC0238k0 i9 = i(Z13, readInt5);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i9);
                return true;
            case 10:
                InterfaceC1506a Z14 = BinderC1507b.Z(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaxp.zzc(parcel);
                M x4 = x(Z14, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, x4);
                return true;
            case 11:
                InterfaceC1506a Z15 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z16 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z17 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdhw zzdhwVar = new zzdhw((View) BinderC1507b.t0(Z15), (HashMap) BinderC1507b.t0(Z16), (HashMap) BinderC1507b.t0(Z17));
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzdhwVar);
                return true;
            case 12:
                InterfaceC1506a Z18 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzboo zzf5 = zzbon.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbvt d02 = d0(Z18, readString5, zzf5, readInt7);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, d02);
                return true;
            case 13:
                InterfaceC1506a Z19 = BinderC1507b.Z(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzboo zzf6 = zzbon.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaxp.zzc(parcel);
                M z4 = z(Z19, zzrVar4, readString6, zzf6, readInt8);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, z4);
                return true;
            case 14:
                InterfaceC1506a Z20 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf7 = zzbon.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbxy N7 = N(Z20, zzf7, readInt9);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, N7);
                return true;
            case 15:
                InterfaceC1506a Z21 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf8 = zzbon.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbsh f7 = f(Z21, zzf8, readInt10);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, f7);
                return true;
            case 16:
                InterfaceC1506a Z22 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf9 = zzbon.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjy zzc = zzbjx.zzc(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbkb H7 = H(Z22, zzf9, readInt11, zzc);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, H7);
                return true;
            case 17:
                InterfaceC1506a Z23 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf10 = zzbon.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzaxp.zzc(parcel);
                B0 V4 = V(Z23, zzf10, readInt12);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, V4);
                return true;
            case 18:
                InterfaceC1506a Z24 = BinderC1507b.Z(parcel.readStrongBinder());
                zzboo zzf11 = zzbon.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzaxp.zzc(parcel);
                V n02 = n0(Z24, zzf11, readInt13);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, n02);
                return true;
            default:
                return false;
        }
    }

    @Override // F2.InterfaceC0220b0
    public final zzbso zzn(InterfaceC1506a interfaceC1506a) {
        Activity activity = (Activity) BinderC1507b.t0(interfaceC1506a);
        AdOverlayInfoParcel j = AdOverlayInfoParcel.j(activity.getIntent());
        if (j == null) {
            return new d(activity, 4);
        }
        int i7 = j.f10801B;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? new d(activity, 4) : new d(activity, 0) : new b(activity, j) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }
}
