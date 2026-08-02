package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzboo;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1506a;

/* renamed from: F2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234i0 extends zzaxn implements InterfaceC0238k0 {
    public C0234i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // F2.InterfaceC0238k0
    public final float zze() {
        Parcel zzcZ = zzcZ(7, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // F2.InterfaceC0238k0
    public final List zzg() {
        Parcel zzcZ = zzcZ(13, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzbkx.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // F2.InterfaceC0238k0
    public final void zzi() {
        zzda(15, zza());
    }

    @Override // F2.InterfaceC0238k0
    public final void zzk() {
        zzda(1, zza());
    }

    @Override // F2.InterfaceC0238k0
    public final void zzl(String str, InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zza.writeString(null);
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(6, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzm(InterfaceC0257u0 interfaceC0257u0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0257u0);
        zzda(16, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzn(InterfaceC1506a interfaceC1506a, String str) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzo(zzboo zzbooVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbooVar);
        zzda(11, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzp(boolean z4) {
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(4, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzq(float f7) {
        Parcel zza = zza();
        zza.writeFloat(f7);
        zzda(2, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzs(zzble zzbleVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbleVar);
        zzda(12, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzt(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(18, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzu(zzfs zzfsVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzfsVar);
        zzda(14, zza);
    }

    @Override // F2.InterfaceC0238k0
    public final boolean zzv() {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
