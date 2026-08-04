package F2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxp;

/* JADX INFO: renamed from: F2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262x extends zzaxn implements InterfaceC0266z {
    public C0262x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // F2.InterfaceC0266z
    public final void zzc() {
        zzda(6, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zzd() {
        zzda(1, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zze(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(2, parcelZza);
    }

    @Override // F2.InterfaceC0266z
    public final void zzf(zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(8, parcelZza);
    }

    @Override // F2.InterfaceC0266z
    public final void zzg() {
        zzda(7, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zzh() {
        zzda(3, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zzi() {
        zzda(4, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zzj() {
        zzda(5, zza());
    }

    @Override // F2.InterfaceC0266z
    public final void zzk() {
        zzda(9, zza());
    }
}
