package com.google.android.gms.internal.ads;

import I2.J;
import I2.P;
import android.content.Context;
import android.net.Uri;
import e1.k;

/* loaded from: classes.dex */
public final class zzcdq extends zzcac {
    private final zzcax zzc;
    private zzcdr zzd;
    private Uri zze;
    private zzcab zzf;
    private boolean zzg;
    private int zzh;

    public zzcdq(Context context, zzcax zzcaxVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcaxVar;
        zzcaxVar.zza(this);
    }

    public static /* synthetic */ void zzi(zzcdq zzcdqVar) {
        zzcab zzcabVar = zzcdqVar.zzf;
        if (zzcabVar != null) {
            if (!zzcdqVar.zzg) {
                zzcabVar.zzg();
                zzcdqVar.zzg = true;
            }
            zzcdqVar.zzf.zze();
        }
    }

    public static /* synthetic */ void zzk(zzcdq zzcdqVar) {
        zzcab zzcabVar = zzcdqVar.zzf;
        if (zzcabVar != null) {
            zzcabVar.zzd();
        }
    }

    public static /* synthetic */ void zzl(zzcdq zzcdqVar) {
        zzcab zzcabVar = zzcdqVar.zzf;
        if (zzcabVar != null) {
            zzcabVar.zzf();
        }
    }

    private final boolean zzm() {
        int i7 = this.zzh;
        return (i7 == 1 || i7 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i7) {
        if (i7 == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i7;
    }

    @Override // android.view.View
    public final String toString() {
        return k.f(zzcdq.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzh() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final String zzj() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcac, com.google.android.gms.internal.ads.zzcaz
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzo() {
        J.k("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdq.zzk(zzcdq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzp() {
        J.k("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdo
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdq.zzi(zzcdq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzq(int i7) {
        J.k("AdImmersivePlayerView seek " + i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzr(zzcab zzcabVar) {
        this.zzf = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzs(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcdr(parse.toString());
            zzv(3);
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdq.zzl(zzcdq.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzt() {
        J.k("AdImmersivePlayerView stop");
        zzcdr zzcdrVar = this.zzd;
        if (zzcdrVar != null) {
            zzcdrVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzu(float f7, float f8) {
    }
}
