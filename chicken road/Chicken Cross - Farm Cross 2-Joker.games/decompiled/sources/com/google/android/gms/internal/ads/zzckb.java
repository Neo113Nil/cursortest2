package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzckb extends zzcjs implements zzchv {
    public static final /* synthetic */ int zzd = 0;
    private zzchw zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcjk zzi;
    private long zzj;
    private long zzk;

    public zzckb(zzcif zzcifVar, zzcie zzcieVar) {
        super(zzcifVar);
        zzcku zzckuVar = new zzcku(zzcifVar.getContext(), zzcieVar, (zzcif) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzckuVar;
        zzckuVar.zzs(this);
    }

    protected static final String zzc(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        String.valueOf(zzg);
        return "cache:".concat(String.valueOf(zzg));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckb.this.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(ServerSentEventKt.COLON);
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzchw zzchwVar = this.zze;
        if (zzchwVar != null) {
            zzchwVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzchw zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzchw zzchwVar = this.zze;
        this.zze = null;
        return zzchwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.internal.ads.zzckb] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.zzckb] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzbje] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    final /* synthetic */ void zzb() {
        String str;
        zzckb zzckbVar;
        zzckb zzckbVar2;
        long longValue;
        long intValue;
        zzckb zzckbVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzc = zzc(this.zzf);
        String str3 = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzA)).intValue();
            zzbix zzbixVar = zzbjg.zzcG;
            str = com.google.android.gms.ads.internal.client.zzba.zzc();
            zzckbVar = ((Boolean) str.zzd(zzbixVar)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzc;
            zzckbVar = this;
        }
        synchronized (this) {
            try {
                str = ((com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (str <= 0) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzH = this.zze.zzH();
                            if (zzH > 0) {
                                long zzN = this.zze.zzN();
                                if (zzN != this.zzk) {
                                    try {
                                        j2 = intValue;
                                        str2 = zzc;
                                        try {
                                            zzm(this.zzf, zzc, zzN, zzH, zzN > 0, zzckbVar != 0 ? this.zze.zzI() : -1L, zzckbVar != 0 ? this.zze.zzJ() : -1L, zzckbVar != 0 ? this.zze.zzK() : -1L, zzchw.zzP(), zzchw.zzQ());
                                            zzckbVar = this;
                                            j = zzN;
                                            try {
                                                zzckbVar.zzk = j;
                                                j3 = zzH;
                                                zzckbVar = zzckbVar;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zzckbVar = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = zzc;
                                        zzckbVar = this;
                                    }
                                } else {
                                    j = zzN;
                                    j2 = intValue;
                                    str2 = zzc;
                                    zzckbVar = this;
                                    j3 = zzH;
                                }
                                if (j >= j3) {
                                    zzckbVar.zzp(zzckbVar.zzf, str2, j3);
                                    zzckbVar2 = zzckbVar;
                                } else {
                                    long zzO = zzckbVar.zze.zzO();
                                    zzckbVar3 = zzckbVar;
                                    if (zzO >= j2) {
                                        zzckbVar3 = zzckbVar;
                                        if (j > 0) {
                                            zzckbVar2 = zzckbVar;
                                        }
                                    }
                                }
                            } else {
                                zzckbVar3 = this;
                            }
                            zzckbVar3.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue());
                            return;
                        }
                        zzckbVar2 = this;
                        com.google.android.gms.ads.internal.zzt.zzB().zzd(zzckbVar2.zzi);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = "Timeout reached. Limit: ";
                    }
                } else {
                    str = zzc;
                    zzckbVar = this;
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(longValue);
                        sb.append(" ms");
                        throw new IOException(sb.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzc;
                zzckbVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                String str5 = zzckbVar.zzf;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(message).length());
                sb2.append("Failed to preload url ");
                sb2.append(str5);
                sb2.append(" Exception: ");
                sb2.append(message);
                String sb3 = sb2.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzckbVar.zzq(zzckbVar.zzf, str, str4, zzx(str4, e));
                zzckbVar2 = zzckbVar;
                com.google.android.gms.ads.internal.zzt.zzB().zzd(zzckbVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0169, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcjs] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzf(String str, String[] strArr) {
        ?? r6;
        String str2;
        ?? r5;
        Clock clock;
        long j;
        long j2;
        String str3;
        String str4;
        long j3;
        ?? r1;
        long j4;
        String str5;
        long j5;
        long j6;
        zzckb zzckbVar = this;
        String str6 = str;
        zzckbVar.zzf = str6;
        String str7 = "error";
        String zzc = zzc(str);
        String str8 = " ms";
        String str9 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzckbVar.zze.zzq(uriArr, zzckbVar.zzb);
            zzcif zzcifVar = (zzcif) zzckbVar.zzc.get();
            if (zzcifVar != null) {
                zzcifVar.zzt(zzc, zzckbVar);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzA)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
            long j7 = -1;
            long j8 = longValue2;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzk.currentTimeMillis() - currentTimeMillis > j8) {
                            long j9 = j8;
                            String str10 = str8;
                            String str11 = str9;
                            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 27);
                            sb.append(str11);
                            sb.append(j9);
                            sb.append(str10);
                            throw new IOException(sb.toString());
                        }
                        if (zzckbVar.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzckbVar.zzh) {
                            break;
                        }
                        if (!zzckbVar.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        String str12 = str8;
                        String str13 = str9;
                        long zzH = zzckbVar.zze.zzH();
                        if (zzH > 0) {
                            long zzN = zzckbVar.zze.zzN();
                            if (zzN != j7) {
                                try {
                                    j = intValue;
                                    j2 = j8;
                                    long j10 = zzH;
                                    j4 = longValue;
                                    clock = zzk;
                                    str3 = str13;
                                    str4 = str12;
                                    str5 = zzc;
                                    try {
                                        zzm(str, zzc, zzN, j10, zzN > 0, booleanValue ? zzckbVar.zze.zzI() : -1L, booleanValue ? zzckbVar.zze.zzJ() : -1L, booleanValue ? zzckbVar.zze.zzK() : -1L, zzchw.zzP(), zzchw.zzQ());
                                        j6 = zzN;
                                        j5 = zzH;
                                        r6 = j10;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = this;
                                        r6 = str;
                                        str2 = str5;
                                        try {
                                            throw th;
                                        } catch (Exception e) {
                                            e = e;
                                            String str14 = str7;
                                            String message = e.getMessage();
                                            ?? sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                            sb2.append("Failed to preload url ");
                                            sb2.append(r6);
                                            sb2.append(" Exception: ");
                                            sb2.append(message);
                                            String sb3 = sb2.toString();
                                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
                                            release();
                                            r5.zzq(r6, str2, str14, zzx(str14, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str5 = zzc;
                                }
                            } else {
                                clock = zzk;
                                j = intValue;
                                j2 = j8;
                                j4 = longValue;
                                str5 = zzc;
                                str3 = str13;
                                str4 = str12;
                                j5 = zzH;
                                j6 = j7;
                                r6 = j8;
                            }
                            r5 = (zzN > j5 ? 1 : (zzN == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzp(str, str5, j5);
                            } else {
                                try {
                                    zzckb zzckbVar2 = this;
                                    r6 = str;
                                    str2 = str5;
                                    if (zzckbVar2.zze.zzO() < j || zzN <= 0) {
                                        j3 = j4;
                                        r1 = j6;
                                        r5 = zzckbVar2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        } else {
                            clock = zzk;
                            j = intValue;
                            j2 = j8;
                            r6 = str6;
                            str2 = zzc;
                            r5 = zzckbVar;
                            str3 = str13;
                            str4 = str12;
                            j3 = longValue;
                            r1 = j7;
                        }
                        try {
                            try {
                                r5.wait(j3);
                            } catch (Throwable th4) {
                                th = th4;
                                str7 = r1;
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r6 = str6;
                        str2 = zzc;
                        r5 = zzckbVar;
                    }
                }
                str9 = str3;
                longValue = j3;
                zzckbVar = r5;
                str6 = r6;
                zzc = str2;
                str8 = str4;
                intValue = j;
                j8 = j2;
                zzk = clock;
                j7 = r1;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = str6;
            str2 = zzc;
            r5 = zzckbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zzg(String str, String[] strArr, zzcjk zzcjkVar) {
        this.zzf = str;
        this.zzi = zzcjkVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcif zzcifVar = (zzcif) this.zzc.get();
            if (zzcifVar != null) {
                zzcifVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzr(final boolean z, final long j) {
        final zzcif zzcifVar = (zzcif) this.zzc.get();
        if (zzcifVar != null) {
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzckb.zzd;
                    zzcif.this.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "VideoStreamExoPlayerCache.onException");
    }
}
