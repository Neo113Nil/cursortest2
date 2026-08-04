package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzazt;

/* JADX INFO: loaded from: classes.dex */
public final class K extends zzaxn implements M {
    public K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // F2.M
    public final void zzB() {
        zzda(6, zza());
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0260w);
        zzda(20, parcelZza);
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0266z);
        zzda(7, parcelZza);
    }

    @Override // F2.M
    public final void zzF(zzr zzrVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, z4);
        zzda(8, parcelZza);
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzaztVar);
        zzda(40, parcelZza);
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0226e0);
        zzda(45, parcelZza);
    }

    @Override // F2.M
    public final void zzL(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // F2.M
    public final void zzN(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(22, parcelZza);
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0265y0);
        zzda(42, parcelZza);
    }

    @Override // F2.M
    public final void zzU(zzfx zzfxVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzfxVar);
        zzda(29, parcelZza);
    }

    @Override // F2.M
    public final void zzW(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(44, parcelZza);
    }

    @Override // F2.M
    public final boolean zzab(zzm zzmVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzmVar);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // F2.M
    public final zzr zzg() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzaxp.zza(parcelZzcZ, zzr.CREATOR);
        parcelZzcZ.recycle();
        return zzrVar;
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        InterfaceC0266z c0262x;
        Parcel parcelZzcZ = zzcZ(33, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0262x = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            c0262x = iInterfaceQueryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) iInterfaceQueryLocalInterface : new C0262x(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0262x;
    }

    @Override // F2.M
    public final Z zzj() {
        Z x4;
        Parcel parcelZzcZ = zzcZ(32, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            x4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            x4 = iInterfaceQueryLocalInterface instanceof Z ? (Z) iInterfaceQueryLocalInterface : new X(strongBinder);
        }
        parcelZzcZ.recycle();
        return x4;
    }

    @Override // F2.M
    public final F0 zzk() {
        F0 d7;
        Parcel parcelZzcZ = zzcZ(41, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            d7 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d7 = iInterfaceQueryLocalInterface instanceof F0 ? (F0) iInterfaceQueryLocalInterface : new D0(strongBinder);
        }
        parcelZzcZ.recycle();
        return d7;
    }

    @Override // F2.M
    public final I0 zzl() {
        I0 g3;
        Parcel parcelZzcZ = zzcZ(26, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            g3 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            g3 = iInterfaceQueryLocalInterface instanceof I0 ? (I0) iInterfaceQueryLocalInterface : new G0(strongBinder);
        }
        parcelZzcZ.recycle();
        return g3;
    }

    @Override // F2.M
    public final p105o3.a zzn() {
        return p150v0.a.h(zzcZ(1, zza()));
    }

    @Override // F2.M
    public final String zzr() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // F2.M
    public final void zzx() {
        zzda(2, zza());
    }

    @Override // F2.M
    public final void zzy(zzm zzmVar, C c3) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzmVar);
        zzaxp.zzf(parcelZza, c3);
        zzda(43, parcelZza);
    }

    @Override // F2.M
    public final void zzz() {
        zzda(5, zza());
    }
}
