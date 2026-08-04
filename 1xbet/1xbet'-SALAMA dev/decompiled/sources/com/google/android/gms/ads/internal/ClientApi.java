package com.google.android.gms.ads.internal;

import E2.n;
import F2.B0;
import F2.I;
import F2.InterfaceC0220b0;
import F2.InterfaceC0238k0;
import F2.M;
import F2.V;
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
import p105o3.a;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzaxo implements InterfaceC0220b0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // F2.InterfaceC0220b0
    public final zzbfn G(a aVar, a aVar2) {
        return new zzdhy((FrameLayout) b.t0(aVar), (FrameLayout) b.t0(aVar2), 250930000);
    }

    @Override // F2.InterfaceC0220b0
    public final zzbkb H(a aVar, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        Context context = (Context) b.t0(aVar);
        zzdsa zzdsaVarZzj = zzcgb.zza(context, zzbooVar, i7).zzj();
        zzdsaVarZzj.zzb(context);
        zzdsaVarZzj.zza(zzbjyVar);
        return zzdsaVarZzj.zzc().zzd();
    }

    @Override // F2.InterfaceC0220b0
    public final M I(a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) b.t0(aVar);
        zzewt zzewtVarZzt = zzcgb.zza(context, zzbooVar, i7).zzt();
        zzewtVarZzt.zzc(context);
        zzewtVarZzt.zza(zzrVar);
        zzewtVarZzt.zzb(str);
        return zzewtVarZzt.zzd().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbxy N(a aVar, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) b.t0(aVar), zzbooVar, i7).zzp();
    }

    @Override // F2.InterfaceC0220b0
    public final M U(a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) b.t0(aVar);
        zzeyk zzeykVarZzu = zzcgb.zza(context, zzbooVar, i7).zzu();
        zzeykVarZzu.zzc(context);
        zzeykVarZzu.zza(zzrVar);
        zzeykVarZzu.zzb(str);
        return zzeykVarZzu.zzd().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final B0 V(a aVar, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) b.t0(aVar), zzbooVar, i7).zzl();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbvt d0(a aVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) b.t0(aVar);
        zzezy zzezyVarZzv = zzcgb.zza(context, zzbooVar, i7).zzv();
        zzezyVarZzv.zzb(context);
        zzezyVarZzv.zza(str);
        return zzezyVarZzv.zzc().zza();
    }

    @Override // F2.InterfaceC0220b0
    public final zzbsh f(a aVar, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) b.t0(aVar), zzbooVar, i7).zzm();
    }

    @Override // F2.InterfaceC0220b0
    public final InterfaceC0238k0 i(a aVar, int i7) {
        return zzcgb.zza((Context) b.t0(aVar), null, i7).zzb();
    }

    @Override // F2.InterfaceC0220b0
    public final I j0(a aVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) b.t0(aVar);
        return new zzeig(zzcgb.zza(context, zzbooVar, i7), context, str);
    }

    @Override // F2.InterfaceC0220b0
    public final V n0(a aVar, zzboo zzbooVar, int i7) {
        return zzcgb.zza((Context) b.t0(aVar), zzbooVar, i7).zzz();
    }

    @Override // F2.InterfaceC0220b0
    public final M x(a aVar, zzr zzrVar, String str, int i7) {
        return new n((Context) b.t0(aVar), zzrVar, str, new VersionInfoParcel(250930000, i7, true, false));
    }

    @Override // F2.InterfaceC0220b0
    public final M z(a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        Context context = (Context) b.t0(aVar);
        zzevf zzevfVarZzs = zzcgb.zza(context, zzbooVar, i7).zzs();
        zzevfVarZzs.zza(str);
        zzevfVarZzs.zzb(context);
        return zzevfVarZzs.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                a aVarZ = b.Z(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzboo zzbooVarZzf = zzbon.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzaxp.zzc(parcel);
                M mI = I(aVarZ, zzrVar, string, zzbooVarZzf, i9);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mI);
                return true;
            case 2:
                a aVarZ2 = b.Z(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzboo zzbooVarZzf2 = zzbon.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzaxp.zzc(parcel);
                M mU = U(aVarZ2, zzrVar2, string2, zzbooVarZzf2, i10);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mU);
                return true;
            case 3:
                a aVarZ3 = b.Z(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzboo zzbooVarZzf3 = zzbon.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzaxp.zzc(parcel);
                I iJ0 = j0(aVarZ3, string3, zzbooVarZzf3, i11);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, iJ0);
                return true;
            case 4:
                b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 5:
                a aVarZ4 = b.Z(parcel.readStrongBinder());
                a aVarZ5 = b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbfn zzbfnVarG = G(aVarZ4, aVarZ5);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfnVarG);
                return true;
            case 6:
                a aVarZ6 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf4 = zzbon.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzaxp.zzc(parcel);
                Context context = (Context) b.t0(aVarZ6);
                zzezy zzezyVarZzv = zzcgb.zza(context, zzbooVarZzf4, i12).zzv();
                zzezyVarZzv.zzb(context);
                zzfac zzfacVarZzb = zzezyVarZzv.zzc().zzb();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzfacVarZzb);
                return true;
            case 7:
                b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 8:
                a aVarZ7 = b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbso zzbsoVarZzn = zzn(aVarZ7);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbsoVarZzn);
                return true;
            case 9:
                a aVarZ8 = b.Z(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzaxp.zzc(parcel);
                InterfaceC0238k0 interfaceC0238k0I = i(aVarZ8, i13);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, interfaceC0238k0I);
                return true;
            case 10:
                a aVarZ9 = b.Z(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i14 = parcel.readInt();
                zzaxp.zzc(parcel);
                M mX = x(aVarZ9, zzrVar3, string4, i14);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mX);
                return true;
            case 11:
                a aVarZ10 = b.Z(parcel.readStrongBinder());
                a aVarZ11 = b.Z(parcel.readStrongBinder());
                a aVarZ12 = b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzdhw zzdhwVar = new zzdhw((View) b.t0(aVarZ10), (HashMap) b.t0(aVarZ11), (HashMap) b.t0(aVarZ12));
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzdhwVar);
                return true;
            case 12:
                a aVarZ13 = b.Z(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzboo zzbooVarZzf5 = zzbon.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbvt zzbvtVarD0 = d0(aVarZ13, string5, zzbooVarZzf5, i15);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbvtVarD0);
                return true;
            case 13:
                a aVarZ14 = b.Z(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzaxp.zza(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzboo zzbooVarZzf6 = zzbon.zzf(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzaxp.zzc(parcel);
                M mZ = z(aVarZ14, zzrVar4, string6, zzbooVarZzf6, i16);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, mZ);
                return true;
            case 14:
                a aVarZ15 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf7 = zzbon.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbxy zzbxyVarN = N(aVarZ15, zzbooVarZzf7, i17);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbxyVarN);
                return true;
            case 15:
                a aVarZ16 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf8 = zzbon.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzbsh zzbshVarF = f(aVarZ16, zzbooVarZzf8, i18);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbshVarF);
                return true;
            case 16:
                a aVarZ17 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf9 = zzbon.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzbjy zzbjyVarZzc = zzbjx.zzc(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzbkb zzbkbVarH = H(aVarZ17, zzbooVarZzf9, i19, zzbjyVarZzc);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbkbVarH);
                return true;
            case 17:
                a aVarZ18 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf10 = zzbon.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzaxp.zzc(parcel);
                B0 b0V = V(aVarZ18, zzbooVarZzf10, i20);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, b0V);
                return true;
            case 18:
                a aVarZ19 = b.Z(parcel.readStrongBinder());
                zzboo zzbooVarZzf11 = zzbon.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzaxp.zzc(parcel);
                V vN0 = n0(aVarZ19, zzbooVarZzf11, i21);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, vN0);
                return true;
            default:
                return false;
        }
    }

    @Override // F2.InterfaceC0220b0
    public final zzbso zzn(a aVar) {
        Activity activity = (Activity) b.t0(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelJ = AdOverlayInfoParcel.j(activity.getIntent());
        if (adOverlayInfoParcelJ == null) {
            return new d(activity, 4);
        }
        int i7 = adOverlayInfoParcelJ.f10801B;
        if (i7 == 1) {
            return new d(activity, 3);
        }
        if (i7 == 2) {
            return new d(activity, 1);
        }
        if (i7 == 3) {
            return new d(activity, 2);
        }
        if (i7 != 4) {
            return i7 != 5 ? new d(activity, 4) : new d(activity, 0);
        }
        return new H2.b(activity, adOverlayInfoParcelJ);
    }
}
