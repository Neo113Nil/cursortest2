package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.H0;
import F2.K0;
import J2.j;
import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcfd extends H0 {
    private final zzcaw zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private K0 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbgr zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcfd(zzcaw zzcawVar, float f7, boolean z4, boolean z7) {
        this.zza = zzcawVar;
        this.zzi = f7;
        this.zzc = z4;
        this.zzd = z7;
    }

    public static /* synthetic */ void zzd(zzcfd zzcfdVar, int i7, int i8, boolean z4, boolean z7) {
        int i9;
        boolean z8;
        boolean z9;
        K0 k7;
        K0 k8;
        K0 k9;
        synchronized (zzcfdVar.zzb) {
            try {
                boolean z10 = zzcfdVar.zzg;
                if (z10 || i8 != 1) {
                    i9 = i8;
                    z8 = false;
                } else {
                    i8 = 1;
                    i9 = 1;
                    z8 = true;
                }
                boolean z11 = i7 != i8;
                if (z11 && i9 == 1) {
                    z9 = true;
                    i9 = 1;
                } else {
                    z9 = false;
                }
                boolean z12 = z11 && i9 == 2;
                boolean z13 = z11 && i9 == 3;
                zzcfdVar.zzg = z10 || z8;
                if (z8) {
                    try {
                        K0 k10 = zzcfdVar.zzf;
                        if (k10 != null) {
                            k10.zzi();
                        }
                    } catch (RemoteException e7) {
                        j.i("#007 Could not call remote method.", e7);
                    }
                }
                if (z9 && (k9 = zzcfdVar.zzf) != null) {
                    k9.zzh();
                }
                if (z12 && (k8 = zzcfdVar.zzf) != null) {
                    k8.zzg();
                }
                if (z13) {
                    K0 k11 = zzcfdVar.zzf;
                    if (k11 != null) {
                        k11.zze();
                    }
                    zzcfdVar.zza.zzw();
                }
                if (z4 != z7 && (k7 = zzcfdVar.zzf) != null) {
                    k7.zzf(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzw(final int i7, final int i8, final boolean z4, final boolean z7) {
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
            @Override // java.lang.Runnable
            public final void run() {
                zzcfd.zzd(this.zza, i7, i8, z4, z7);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd("pubVideoCmd", map2);
            }
        });
    }

    @Override // F2.I0
    public final float zze() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzk;
        }
        return f7;
    }

    @Override // F2.I0
    public final float zzf() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzj;
        }
        return f7;
    }

    @Override // F2.I0
    public final float zzg() {
        float f7;
        synchronized (this.zzb) {
            f7 = this.zzi;
        }
        return f7;
    }

    @Override // F2.I0
    public final int zzh() {
        int i7;
        synchronized (this.zzb) {
            i7 = this.zze;
        }
        return i7;
    }

    @Override // F2.I0
    public final K0 zzi() {
        K0 k7;
        synchronized (this.zzb) {
            k7 = this.zzf;
        }
        return k7;
    }

    @Override // F2.I0
    public final void zzj(boolean z4) {
        zzx(true != z4 ? "unmute" : "mute", null);
    }

    @Override // F2.I0
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // F2.I0
    public final void zzl() {
        zzx("play", null);
    }

    @Override // F2.I0
    public final void zzm(K0 k7) {
        synchronized (this.zzb) {
            this.zzf = k7;
        }
    }

    @Override // F2.I0
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // F2.I0
    public final boolean zzo() {
        boolean z4;
        Object obj = this.zzb;
        boolean zZzp = zzp();
        synchronized (obj) {
            z4 = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z4 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z4;
    }

    @Override // F2.I0
    public final boolean zzp() {
        boolean z4;
        synchronized (this.zzb) {
            try {
                z4 = false;
                if (this.zzc && this.zzl) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // F2.I0
    public final boolean zzq() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzh;
        }
        return z4;
    }

    public final void zzr(float f7, float f8, int i7, boolean z4, float f9) {
        boolean z7;
        boolean z8;
        int i8;
        synchronized (this.zzb) {
            try {
                z7 = true;
                if (f8 == this.zzi && f9 == this.zzk) {
                    z7 = false;
                }
                this.zzi = f8;
                if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmK)).booleanValue()) {
                    this.zzj = f7;
                }
                z8 = this.zzh;
                this.zzh = z4;
                i8 = this.zze;
                this.zze = i7;
                float f10 = this.zzk;
                this.zzk = f9;
                if (Math.abs(f9 - f10) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            try {
                zzbgr zzbgrVar = this.zzn;
                if (zzbgrVar != null) {
                    zzbgrVar.zze();
                }
            } catch (RemoteException e7) {
                j.i("#007 Could not call remote method.", e7);
            }
        }
        zzw(i8, i7, z8, z4);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        Object obj = this.zzb;
        boolean z4 = zzfxVar.f10736a;
        boolean z7 = zzfxVar.f10737b;
        boolean z8 = zzfxVar.f10738c;
        synchronized (obj) {
            this.zzl = z7;
            this.zzm = z8;
        }
        String str = true != z4 ? "0" : "1";
        String str2 = true != z7 ? "0" : "1";
        String str3 = true != z8 ? "0" : "1";
        p122r.b bVar = new p122r.b(3);
        bVar.put("muteStart", str);
        bVar.put("customControlsRequested", str2);
        bVar.put("clickToExpandRequested", str3);
        zzx("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void zzt(float f7) {
        synchronized (this.zzb) {
            this.zzj = f7;
        }
    }

    public final void zzu() {
        boolean z4;
        int i7;
        synchronized (this.zzb) {
            z4 = this.zzh;
            i7 = this.zze;
            this.zze = 3;
        }
        zzw(i7, 3, z4, z4);
    }

    public final void zzv(zzbgr zzbgrVar) {
        synchronized (this.zzb) {
            this.zzn = zzbgrVar;
        }
    }
}
