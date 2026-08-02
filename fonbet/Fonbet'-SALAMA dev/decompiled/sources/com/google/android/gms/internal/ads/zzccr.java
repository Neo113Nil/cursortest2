package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
import android.net.Uri;
import java.io.IOException;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzccr extends zzcci implements zzcam {
    public static final /* synthetic */ int zzd = 0;
    private zzcan zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcca zzi;
    private long zzj;
    private long zzk;

    public zzccr(zzcaw zzcawVar, zzcav zzcavVar) {
        super(zzcawVar);
        zzcdj zzcdjVar = new zzcdj(zzcawVar.getContext(), zzcavVar, (zzcaw) this.zzc.get(), null);
        int i7 = J.f3546b;
        j.f("ExoPlayerAdapter initialized.");
        this.zze = zzcdjVar;
        zzcdjVar.zzL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzb(zzccr zzccrVar) {
        String str;
        zzccr zzccrVar2;
        zzccr zzccrVar3;
        C0254t c0254t;
        long longValue;
        long intValue;
        boolean booleanValue;
        C0254t c0254t2;
        zzccr zzccrVar4;
        long j;
        long j3;
        String str2;
        zzccr zzccrVar5;
        long j7;
        String zzc = zzc(zzccrVar.zzf);
        try {
            zzbbp zzbbpVar = zzbby.zzM;
            c0254t = C0254t.f2723d;
            longValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue() * 1000;
            intValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzs)).intValue();
            booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcb)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                zzccrVar2 = booleanValue;
            }
        } catch (Exception e7) {
            e = e7;
            str = zzc;
            zzccrVar2 = zzccrVar;
        }
        synchronized (zzccrVar) {
            try {
                o.f1952C.j.getClass();
                if (System.currentTimeMillis() - zzccrVar.zzj > longValue) {
                    throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                }
                if (zzccrVar.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!zzccrVar.zzh) {
                    if (!zzccrVar.zze.zzV()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long zzz = zzccrVar.zze.zzz();
                    if (zzz > 0) {
                        long zzv = zzccrVar.zze.zzv();
                        if (zzv != zzccrVar.zzk) {
                            try {
                                j3 = intValue;
                                str2 = zzc;
                                c0254t2 = c0254t;
                                try {
                                    zzccrVar.zzo(zzccrVar.zzf, zzc, zzv, zzz, zzv > 0, booleanValue != 0 ? zzccrVar.zze.zzA() : -1L, booleanValue != 0 ? zzccrVar.zze.zzx() : -1L, booleanValue != 0 ? zzccrVar.zze.zzB() : -1L, zzcan.zzs(), zzcan.zzu());
                                    zzccrVar5 = zzccrVar;
                                    j = zzv;
                                    try {
                                        zzccrVar5.zzk = j;
                                        j7 = zzz;
                                        zzccrVar5 = zzccrVar5;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str2;
                                        zzccrVar2 = zzccrVar5;
                                        try {
                                            throw th;
                                        } catch (Exception e8) {
                                            e = e8;
                                            String f7 = AbstractC1663a.f("Failed to preload url ", zzccrVar2.zzf, " Exception: ", e.getMessage());
                                            int i7 = J.f3546b;
                                            j.g(f7);
                                            o.f1952C.f1961g.zzv(e, "VideoStreamExoPlayerCache.preload");
                                            zzccrVar.release();
                                            zzccrVar2.zzg(zzccrVar2.zzf, str, "error", zzd("error", e));
                                            zzccrVar3 = zzccrVar2;
                                            o.f1952C.f1953A.zzc(zzccrVar3.zzi);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zzccrVar5 = zzccrVar;
                                    str = str2;
                                    zzccrVar2 = zzccrVar5;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = zzc;
                                zzccrVar5 = zzccrVar;
                            }
                        } else {
                            j = zzv;
                            j3 = intValue;
                            str2 = zzc;
                            c0254t2 = c0254t;
                            zzccrVar5 = zzccrVar;
                            j7 = zzz;
                        }
                        if (j >= j7) {
                            zzccrVar5.zzj(zzccrVar5.zzf, str2, j7);
                            zzccrVar3 = zzccrVar5;
                        } else {
                            long zzw = zzccrVar5.zze.zzw();
                            zzccrVar4 = zzccrVar5;
                            if (zzw >= j3) {
                                zzccrVar4 = zzccrVar5;
                                if (j > 0) {
                                    zzccrVar3 = zzccrVar5;
                                }
                            }
                        }
                    } else {
                        c0254t2 = c0254t;
                        zzccrVar4 = zzccrVar;
                    }
                    zzccrVar4.zzx(((Long) c0254t2.f2726c.zzb(zzbby.zzN)).longValue());
                    return;
                }
                zzccrVar3 = zzccrVar;
                o.f1952C.f1953A.zzc(zzccrVar3.zzi);
            } catch (Throwable th5) {
                th = th5;
                str = zzc;
                zzccrVar2 = zzccrVar;
            }
        }
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(d.a(str, "MD5")));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        P.f3579l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
            @Override // java.lang.Runnable
            public final void run() {
                zzccr.zzb(zzccr.this);
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void release() {
        zzcan zzcanVar = this.zze;
        if (zzcanVar != null) {
            zzcanVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzD(int i7, int i8) {
    }

    public final zzcan zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcan zzcanVar = this.zze;
        this.zze = null;
        return zzcanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzi(final boolean z4, final long j) {
        final zzcaw zzcawVar = (zzcaw) this.zzc.get();
        if (zzcawVar != null) {
            zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcaw.this.zzv(z4, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzk(String str, Exception exc) {
        int i7 = J.f3546b;
        j.h("Precache error", exc);
        o.f1952C.f1961g.zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzl(String str, Exception exc) {
        int i7 = J.f3546b;
        j.h("Precache exception", exc);
        o.f1952C.f1961g.zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzm(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp(int i7) {
        this.zze.zzJ(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzq(int i7) {
        this.zze.zzK(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(int i7) {
        this.zze.zzM(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(int i7) {
        this.zze.zzN(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzu(String str, String[] strArr) {
        String str2;
        String str3;
        zzccr zzccrVar;
        long j;
        long j3;
        String str4;
        ?? r52;
        long j7;
        long j8;
        String str5;
        long j9;
        long j10;
        zzccr zzccrVar2 = this;
        String str6 = str;
        zzccrVar2.zzf = str6;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            zzccrVar2.zze.zzF(uriArr, zzccrVar2.zzb);
            zzcaw zzcawVar = (zzcaw) zzccrVar2.zzc.get();
            if (zzcawVar != null) {
                zzcawVar.zzt(zzc, zzccrVar2);
            }
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzbbp zzbbpVar = zzbby.zzN;
            C0254t c0254t = C0254t.f2723d;
            long longValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
            long longValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue() * 1000;
            long intValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzs)).intValue();
            boolean booleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcb)).booleanValue();
            long j11 = -1;
            ?? r62 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (zzccrVar2.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzccrVar2.zzh) {
                            break;
                        }
                        if (!zzccrVar2.zze.zzV()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzz = zzccrVar2.zze.zzz();
                        if (zzz > 0) {
                            long zzv = zzccrVar2.zze.zzv();
                            if (zzv != j11) {
                                try {
                                    j = r62;
                                    j10 = zzz;
                                    j3 = longValue2;
                                    j8 = longValue;
                                    str5 = zzc;
                                } catch (Throwable th) {
                                    th = th;
                                    str5 = zzc;
                                }
                                try {
                                    zzo(str, zzc, zzv, j10, zzv > 0, booleanValue ? zzccrVar2.zze.zzA() : -1L, booleanValue ? zzccrVar2.zze.zzx() : -1L, booleanValue ? zzccrVar2.zze.zzB() : -1L, zzcan.zzs(), zzcan.zzu());
                                    j11 = zzv;
                                    j9 = zzz;
                                    str4 = j10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzccrVar = this;
                                    str2 = str;
                                    str3 = str5;
                                    try {
                                        throw th;
                                    } catch (Exception e7) {
                                        e = e7;
                                        String f7 = AbstractC1663a.f("Failed to preload url ", str2, " Exception: ", e.getMessage());
                                        int i8 = J.f3546b;
                                        j.g(f7);
                                        o.f1952C.f1961g.zzv(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        zzccrVar.zzg(str2, str3, "error", zzd("error", e));
                                        return false;
                                    }
                                }
                            } else {
                                j = r62;
                                j3 = longValue2;
                                j8 = longValue;
                                str5 = zzc;
                                j9 = zzz;
                                str4 = r62;
                            }
                            r52 = (zzv > j9 ? 1 : (zzv == j9 ? 0 : -1));
                            if (r52 >= 0) {
                                zzj(str, str5, j9);
                            } else {
                                try {
                                    zzccr zzccrVar3 = this;
                                    str4 = str;
                                    str3 = str5;
                                    if (zzccrVar3.zze.zzw() < j || zzv <= 0) {
                                        j7 = j8;
                                        r52 = zzccrVar3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zzccrVar = r52;
                                    str2 = str4;
                                    throw th;
                                }
                            }
                        } else {
                            j = r62;
                            j3 = longValue2;
                            str4 = str6;
                            str3 = zzc;
                            r52 = zzccrVar2;
                            j7 = longValue;
                        }
                        try {
                            r52.wait(j7);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str6;
                        str3 = zzc;
                        zzccrVar = zzccrVar2;
                    }
                }
                longValue = j7;
                zzccrVar2 = r52;
                str6 = str4;
                zzc = str3;
                r62 = j;
                longValue2 = j3;
            }
            return true;
        } catch (Exception e8) {
            e = e8;
            str2 = str6;
            str3 = zzc;
            zzccrVar = zzccrVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzv() {
        int i7 = J.f3546b;
        j.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzw(String str, String[] strArr, zzcca zzccaVar) {
        this.zzf = str;
        this.zzi = zzccaVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcaw zzcawVar = (zzcaw) this.zzc.get();
            if (zzcawVar != null) {
                zzcawVar.zzt(zzc, this);
            }
            o.f1952C.j.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e7) {
            String f7 = AbstractC1663a.f("Failed to preload url ", str, " Exception: ", e7.getMessage());
            int i8 = J.f3546b;
            j.g(f7);
            o.f1952C.f1961g.zzv(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e7));
            return false;
        }
    }
}
