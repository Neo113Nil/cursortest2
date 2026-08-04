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

/* JADX INFO: renamed from: F2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234i0 extends zzaxn implements InterfaceC0238k0 {
    public C0234i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // F2.InterfaceC0238k0
    public final float zze() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        float f7 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f7;
    }

    @Override // F2.InterfaceC0238k0
    public final List zzg() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzbkx.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
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
    public final void zzl(String str, p105o3.a aVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzaxp.zzf(parcelZza, aVar);
        zzda(6, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzm(InterfaceC0257u0 interfaceC0257u0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0257u0);
        zzda(16, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzn(p105o3.a aVar, String str) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzo(zzboo zzbooVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbooVar);
        zzda(11, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzp(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzq(float f7) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f7);
        zzda(2, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzs(zzble zzbleVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbleVar);
        zzda(12, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzt(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final void zzu(zzfs zzfsVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzfsVar);
        zzda(14, parcelZza);
    }

    @Override // F2.InterfaceC0238k0
    public final boolean zzv() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
