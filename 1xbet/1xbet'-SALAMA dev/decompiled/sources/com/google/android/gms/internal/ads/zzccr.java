package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
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
    public static void zzb(zzccr zzccrVar) throws Throwable {
        String str;
        zzccr zzccrVar2;
        zzccr zzccrVar3;
        zzccr zzccrVar4;
        long j;
        String str2;
        zzccr zzccrVar5;
        long j3;
        String strZzc = zzc(zzccrVar.zzf);
        try {
            zzbbp zzbbpVar = zzbby.zzM;
            C0254t c0254t = C0254t.f2723d;
            long jLongValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue() * 1000;
            long jIntValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzs)).intValue();
            boolean zBooleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcb)).booleanValue();
            try {
                synchronized (zzccrVar) {
                    try {
                        o.f1952C.j.getClass();
                        if (System.currentTimeMillis() - zzccrVar.zzj > jLongValue) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                        }
                        if (zzccrVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!zzccrVar.zzh) {
                            if (!zzccrVar.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = zzccrVar.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = zzccrVar.zze.zzv();
                                if (jZzv != zzccrVar.zzk) {
                                    try {
                                        str2 = strZzc;
                                        try {
                                            zzccrVar.zzo(zzccrVar.zzf, strZzc, jZzv, jZzz, jZzv > 0, zBooleanValue ? zzccrVar.zze.zzA() : -1L, zBooleanValue ? zzccrVar.zze.zzx() : -1L, zBooleanValue ? zzccrVar.zze.zzB() : -1L, zzcan.zzs(), zzcan.zzu());
                                            zzccrVar5 = zzccrVar;
                                            j = jZzv;
                                            try {
                                                zzccrVar5.zzk = j;
                                                j3 = jZzz;
                                                zzccrVar5 = zzccrVar5;
                                            } catch (Throwable th) {
                                                th = th;
                                                str = str2;
                                                zzccrVar2 = zzccrVar5;
                                                try {
                                                    throw th;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    String strF = p150v0.a.f("Failed to preload url ", zzccrVar2.zzf, " Exception: ", e.getMessage());
                                                    int i7 = J.f3546b;
                                                    j.g(strF);
                                                    o.f1952C.f1961g.zzv(e, "VideoStreamExoPlayerCache.preload");
                                                    zzccrVar.release();
                                                    zzccrVar2.zzg(zzccrVar2.zzf, str, "error", zzd("error", e));
                                                    zzccrVar3 = zzccrVar2;
                                                    o.f1952C.f1953A.zzc(zzccrVar3.zzi);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzccrVar5 = zzccrVar;
                                            str = str2;
                                            zzccrVar2 = zzccrVar5;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = strZzc;
                                        zzccrVar5 = zzccrVar;
                                    }
                                } else {
                                    j = jZzv;
                                    str2 = strZzc;
                                    zzccrVar5 = zzccrVar;
                                    j3 = jZzz;
                                }
                                if (j >= j3) {
                                    zzccrVar5.zzj(zzccrVar5.zzf, str2, j3);
                                    zzccrVar3 = zzccrVar5;
                                } else if (zzccrVar5.zze.zzw() >= jIntValue && j > 0) {
                                    zzccrVar3 = zzccrVar5;
                                }
                            } else {
                                c0254t = c0254t;
                                zzccrVar4 = zzccrVar;
                            }
                            zzccrVar4.zzx(((Long) c0254t.f2726c.zzb(zzbby.zzN)).longValue());
                            return;
                        }
                        zzccrVar3 = zzccrVar;
                        o.f1952C.f1953A.zzc(zzccrVar3.zzi);
                    } catch (Throwable th4) {
                        th = th4;
                        str = strZzc;
                        zzccrVar2 = zzccrVar;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                zzccrVar2 = zBooleanValue;
            }
        } catch (Exception e8) {
            e = e8;
            str = strZzc;
            zzccrVar2 = zzccrVar;
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
            public final void run() throws Throwable {
                zzccr.zzb(this.zza);
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
                    zzcawVar.zzv(z4, j);
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
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcaw] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzcci, com.google.android.gms.internal.ads.zzccr] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzccr] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcci] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r7;
        String str2;
        ?? r8;
        long j;
        ?? r9;
        ?? r10;
        String str3;
        long j3;
        ?? r15 = this;
        ?? r13 = str;
        r15.zzf = r13;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            r15.zze.zzF(uriArr, r15.zzb);
            ?? r11 = (zzcaw) r15.zzc.get();
            if (r11 != 0) {
                r11.zzt(strZzc, r15);
            }
            o.f1952C.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbbp zzbbpVar = zzbby.zzN;
            C0254t c0254t = C0254t.f2723d;
            long jLongValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
            long jLongValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue() * 1000;
            long jIntValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzs)).intValue();
            boolean zBooleanValue = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcb)).booleanValue();
            long j7 = -1;
            long j8 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = r15.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = r15.zze.zzv();
                                if (jZzv != j7) {
                                    try {
                                        long j9 = jZzz;
                                        str3 = strZzc;
                                        try {
                                            zzo(str, strZzc, jZzv, j9, jZzv > 0, zBooleanValue ? r15.zze.zzA() : -1L, zBooleanValue ? r15.zze.zzx() : -1L, zBooleanValue ? r15.zze.zzB() : -1L, zzcan.zzs(), zzcan.zzu());
                                            j7 = jZzv;
                                            j3 = jZzz;
                                            r9 = j9;
                                        } catch (Throwable th) {
                                            th = th;
                                            r8 = this;
                                            r7 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (Exception e7) {
                                                e = e7;
                                                String strF = p150v0.a.f("Failed to preload url ", r7, " Exception: ", e.getMessage());
                                                int i8 = J.f3546b;
                                                j.g(strF);
                                                o.f1952C.f1961g.zzv(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r8.zzg(r7, str2, "error", zzd("error", e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str3 = strZzc;
                                    }
                                } else {
                                    str3 = strZzc;
                                    j3 = jZzz;
                                    r9 = j8;
                                }
                                r10 = (jZzv > j3 ? 1 : (jZzv == j3 ? 0 : -1));
                                if (r10 >= 0) {
                                    zzj(str, str3, j3);
                                } else {
                                    try {
                                        zzccr zzccrVar = this;
                                        r9 = str;
                                        str2 = str3;
                                        if (zzccrVar.zze.zzw() < j8 || jZzv <= 0) {
                                            r10 = zzccrVar;
                                            j = j8;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r8 = r10;
                                        r7 = r9;
                                        throw th;
                                    }
                                }
                            } else {
                                j = j8;
                                jLongValue2 = jLongValue2;
                                r9 = r13;
                                str2 = strZzc;
                                r10 = r15;
                            }
                            try {
                                r10.wait(jLongValue);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        r7 = r13;
                        str2 = strZzc;
                        r8 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r10;
                r13 = r9;
                strZzc = str2;
                j8 = j;
                jLongValue2 = jLongValue2;
            }
        } catch (Exception e8) {
            e = e8;
            r7 = r13;
            str2 = strZzc;
            r8 = r15;
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
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcaw zzcawVar = (zzcaw) this.zzc.get();
            if (zzcawVar != null) {
                zzcawVar.zzt(strZzc, this);
            }
            o.f1952C.j.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e7) {
            String strF = p150v0.a.f("Failed to preload url ", str, " Exception: ", e7.getMessage());
            int i8 = J.f3546b;
            j.g(strF);
            o.f1952C.f1961g.zzv(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e7));
            return false;
        }
    }
}
