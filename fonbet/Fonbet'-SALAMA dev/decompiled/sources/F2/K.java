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
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0260w);
        zzda(20, zza);
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0266z);
        zzda(7, zza);
    }

    @Override // F2.M
    public final void zzF(zzr zzrVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        Parcel zza = zza();
        zzaxp.zzf(zza, z4);
        zzda(8, zza);
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzaztVar);
        zzda(40, zza);
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0226e0);
        zzda(45, zza);
    }

    @Override // F2.M
    public final void zzL(boolean z4) {
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(34, zza);
    }

    @Override // F2.M
    public final void zzN(boolean z4) {
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(22, zza);
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0265y0);
        zzda(42, zza);
    }

    @Override // F2.M
    public final void zzU(zzfx zzfxVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzfxVar);
        zzda(29, zza);
    }

    @Override // F2.M
    public final void zzW(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(44, zza);
    }

    @Override // F2.M
    public final boolean zzab(zzm zzmVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzmVar);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    @Override // F2.M
    public final zzr zzg() {
        Parcel zzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzaxp.zza(zzcZ, zzr.CREATOR);
        zzcZ.recycle();
        return zzrVar;
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        InterfaceC0266z c0262x;
        Parcel zzcZ = zzcZ(33, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            c0262x = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            c0262x = queryLocalInterface instanceof InterfaceC0266z ? (InterfaceC0266z) queryLocalInterface : new C0262x(readStrongBinder);
        }
        zzcZ.recycle();
        return c0262x;
    }

    @Override // F2.M
    public final Z zzj() {
        Z x4;
        Parcel zzcZ = zzcZ(32, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            x4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            x4 = queryLocalInterface instanceof Z ? (Z) queryLocalInterface : new X(readStrongBinder);
        }
        zzcZ.recycle();
        return x4;
    }

    @Override // F2.M
    public final F0 zzk() {
        F0 d02;
        Parcel zzcZ = zzcZ(41, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            d02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d02 = queryLocalInterface instanceof F0 ? (F0) queryLocalInterface : new D0(readStrongBinder);
        }
        zzcZ.recycle();
        return d02;
    }

    @Override // F2.M
    public final I0 zzl() {
        I0 g02;
        Parcel zzcZ = zzcZ(26, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            g02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            g02 = queryLocalInterface instanceof I0 ? (I0) queryLocalInterface : new G0(readStrongBinder);
        }
        zzcZ.recycle();
        return g02;
    }

    @Override // F2.M
    public final InterfaceC1506a zzn() {
        return AbstractC1663a.h(zzcZ(1, zza()));
    }

    @Override // F2.M
    public final String zzr() {
        Parcel zzcZ = zzcZ(31, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // F2.M
    public final void zzx() {
        zzda(2, zza());
    }

    @Override // F2.M
    public final void zzy(zzm zzmVar, C c3) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzmVar);
        zzaxp.zzf(zza, c3);
        zzda(43, zza);
    }

    @Override // F2.M
    public final void zzz() {
        zzda(5, zza());
    }
}
