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
import o3.InterfaceC1506a;

/* renamed from: F2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218a0 extends zzaxn implements InterfaceC0220b0 {
    @Override // F2.InterfaceC0220b0
    public final zzbfn G(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        Parcel zzcZ = zzcZ(5, zza);
        zzbfn zzdy = zzbfm.zzdy(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdy;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbkb H(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        zzaxp.zzf(zza, zzbjyVar);
        Parcel zzcZ = zzcZ(16, zza);
        zzbkb zzb = zzbka.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // F2.InterfaceC0220b0
    public final M I(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(readStrongBinder);
        }
        zzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbxy N(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(14, zza);
        zzbxy zzb = zzbxx.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // F2.InterfaceC0220b0
    public final M U(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(readStrongBinder);
        }
        zzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final B0 V(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        B0 c0267z0;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(17, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            c0267z0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0267z0 = queryLocalInterface instanceof B0 ? (B0) queryLocalInterface : new C0267z0(readStrongBinder);
        }
        zzcZ.recycle();
        return c0267z0;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbvt d0(InterfaceC1506a interfaceC1506a, String str, zzboo zzbooVar, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(12, zza);
        zzbvt zzq = zzbvs.zzq(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzq;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbsh f(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(15, zza);
        zzbsh zzb = zzbsg.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // F2.InterfaceC0220b0
    public final InterfaceC0238k0 i(InterfaceC1506a interfaceC1506a, int i7) {
        InterfaceC0238k0 c0234i0;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(9, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            c0234i0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0234i0 = queryLocalInterface instanceof InterfaceC0238k0 ? (InterfaceC0238k0) queryLocalInterface : new C0234i0(readStrongBinder);
        }
        zzcZ.recycle();
        return c0234i0;
    }

    @Override // F2.InterfaceC0220b0
    public final I j0(InterfaceC1506a interfaceC1506a, String str, zzboo zzbooVar, int i7) {
        I g3;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(3, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            g3 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            g3 = queryLocalInterface instanceof I ? (I) queryLocalInterface : new G(readStrongBinder);
        }
        zzcZ.recycle();
        return g3;
    }

    @Override // F2.InterfaceC0220b0
    public final V n0(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        V t7;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(18, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            t7 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new T(readStrongBinder);
        }
        zzcZ.recycle();
        return t7;
    }

    @Override // F2.InterfaceC0220b0
    public final M x(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, int i7) {
        M k7;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zza.writeString(str);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(10, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(readStrongBinder);
        }
        zzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final M z(InterfaceC1506a interfaceC1506a, zzr zzrVar, String str, zzboo zzbooVar, int i7) {
        M k7;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(13, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k7 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new K(readStrongBinder);
        }
        zzcZ.recycle();
        return k7;
    }

    @Override // F2.InterfaceC0220b0
    public final zzbso zzn(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        Parcel zzcZ = zzcZ(8, zza);
        zzbso zzI = zzbsn.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }
}
