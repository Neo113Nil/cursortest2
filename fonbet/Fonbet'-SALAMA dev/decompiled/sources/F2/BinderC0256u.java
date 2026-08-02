package F2;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;

/* renamed from: F2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0256u extends zzaxo implements InterfaceC0226e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.m f2727a;

    public BinderC0256u(y2.m mVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f2727a = mVar;
    }

    @Override // F2.InterfaceC0226e0
    public final void zzb() {
        y2.m mVar = this.f2727a;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // F2.InterfaceC0226e0
    public final void zzc() {
        y2.m mVar = this.f2727a;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // F2.InterfaceC0226e0
    public final void zzd(zze zzeVar) {
        y2.m mVar = this.f2727a;
        if (mVar != null) {
            mVar.c(zzeVar.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zze zzeVar = (zze) zzaxp.zza(parcel, zze.CREATOR);
            zzaxp.zzc(parcel);
            zzd(zzeVar);
        } else if (i7 == 2) {
            zzf();
        } else if (i7 == 3) {
            zzc();
        } else if (i7 == 4) {
            zze();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // F2.InterfaceC0226e0
    public final void zze() {
        y2.m mVar = this.f2727a;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // F2.InterfaceC0226e0
    public final void zzf() {
        y2.m mVar = this.f2727a;
        if (mVar != null) {
            mVar.e();
        }
    }
}
