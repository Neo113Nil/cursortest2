package com.google.android.gms.internal.ads;

import F2.I0;
import I2.J;
import J2.j;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzdgk extends zzbff {
    private final zzdhc zza;
    private InterfaceC1506a zzb;

    public zzdgk(zzdhc zzdhcVar) {
        this.zza = zzdhcVar;
    }

    private static float zzb(InterfaceC1506a interfaceC1506a) {
        Drawable drawable;
        if (interfaceC1506a == null || (drawable = (Drawable) BinderC1507b.t0(interfaceC1506a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zze() {
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.e("Remote exception getting video controller aspect ratio.", e7);
                return 0.0f;
            }
        }
        InterfaceC1506a interfaceC1506a = this.zzb;
        if (interfaceC1506a != null) {
            return zzb(interfaceC1506a);
        }
        zzbfj zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : zzm.zzd() / zzm.zzc();
        return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzf() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final float zzg() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final I0 zzh() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final InterfaceC1506a zzi() {
        InterfaceC1506a interfaceC1506a = this.zzb;
        if (interfaceC1506a != null) {
            return interfaceC1506a;
        }
        zzbfj zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzj(InterfaceC1506a interfaceC1506a) {
        this.zzb = interfaceC1506a;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzk() {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean zzl() {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzm(zzbgr zzbgrVar) {
        if (this.zza.zzj() instanceof zzcfd) {
            ((zzcfd) this.zza.zzj()).zzv(zzbgrVar);
        }
    }
}
