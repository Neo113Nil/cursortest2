package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzbxy;

/* JADX INFO: renamed from: F2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218a0 extends zzaxn implements InterfaceC0220b0 {
    @Override // F2.InterfaceC0220b0
    public final zzbfn G(p105o3.a aVar, p105o3.a aVar2) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbfn zzbfnVarZzdy = zzbfm.zzdy(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfnVarZzdy;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbkb H(p105o3.a aVar, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        zzaxp.zzf(parcelZza, zzbjyVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        zzbkb zzbkbVarZzb = zzbka.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbkbVarZzb;
    }

    @Override // F2.InterfaceC0220b0
    public final M I(p105o3.a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            k7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelZzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbxy N(p105o3.a aVar, zzboo zzbooVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzbxy zzbxyVarZzb = zzbxx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbxyVarZzb;
    }

    @Override // F2.InterfaceC0220b0
    public final M U(p105o3.a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            k7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelZzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final B0 V(p105o3.a aVar, zzboo zzbooVar, int i7) {
        B0 c0267z0;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0267z0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0267z0 = iInterfaceQueryLocalInterface instanceof B0 ? (B0) iInterfaceQueryLocalInterface : new C0267z0(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0267z0;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbvt d0(p105o3.a aVar, String str, zzboo zzbooVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzbvt zzbvtVarZzq = zzbvs.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbvtVarZzq;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbsh f(p105o3.a aVar, zzboo zzbooVar, int i7) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        zzbsh zzbshVarZzb = zzbsg.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbshVarZzb;
    }

    @Override // F2.InterfaceC0220b0
    public final InterfaceC0238k0 i(p105o3.a aVar, int i7) {
        InterfaceC0238k0 c0234i0;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0234i0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0234i0 = iInterfaceQueryLocalInterface instanceof InterfaceC0238k0 ? (InterfaceC0238k0) iInterfaceQueryLocalInterface : new C0234i0(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0234i0;
    }

    @Override // F2.InterfaceC0220b0
    public final I j0(p105o3.a aVar, String str, zzboo zzbooVar, int i7) {
        I g3;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            g3 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            g3 = iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new G(strongBinder);
        }
        parcelZzcZ.recycle();
        return g3;
    }

    @Override // F2.InterfaceC0220b0
    public final V n0(p105o3.a aVar, zzboo zzbooVar, int i7) {
        V t7;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            t7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            t7 = iInterfaceQueryLocalInterface instanceof V ? (V) iInterfaceQueryLocalInterface : new T(strongBinder);
        }
        parcelZzcZ.recycle();
        return t7;
    }

    @Override // F2.InterfaceC0220b0
    public final M x(p105o3.a aVar, zzr zzrVar, String str, int i7) {
        M k7;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            k7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelZzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final M z(p105o3.a aVar, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            k7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelZzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbso zzn(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        zzbso zzbsoVarZzI = zzbsn.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbsoVarZzI;
    }
}
