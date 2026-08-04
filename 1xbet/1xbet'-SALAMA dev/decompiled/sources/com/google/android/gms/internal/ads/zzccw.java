package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzccw extends zzfq {
    private final Context zza;
    private final zzfx zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbai zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private I3.b zzo;
    private final AtomicLong zzp;
    private final zzcdg zzq;

    public zzccw(Context context, zzfx zzfxVar, String str, int i7, zzgx zzgxVar, zzcdg zzcdgVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfxVar;
        this.zzq = zzcdgVar;
        this.zzc = str;
        this.zzd = i7;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue();
        zzf(zzgxVar);
    }

    public static Long zzm(zzccw zzccwVar) {
        return Long.valueOf(o.f1952C.f1963i.zza(zzccwVar.zzi));
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        zzbbp zzbbpVar = zzbby.zzey;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || this.zzl) {
            return ((Boolean) c0254t.f2726c.zzb(zzbby.zzez)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i7, i8) : this.zzb.zza(bArr, i7, i8);
        if (!this.zze || this.zzf != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [long] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws Throwable {
        zzbaf zzbafVarZzb;
        Long l7;
        boolean z4;
        boolean z7;
        long jElapsedRealtime;
        StringBuilder sb;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r7 = 1;
        this.zzg = true;
        this.zzh = zzgcVar.zza;
        if (!this.zze) {
            zzj(zzgcVar);
        }
        this.zzi = zzbai.zza(zzgcVar.zza);
        zzbbp zzbbpVar = zzbby.zzev;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgcVar.zze;
                this.zzi.zzi = zzfty.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbafVarZzb = o.f1952C.f1963i.zzb(this.zzi);
            } else {
                zzbafVarZzb = null;
            }
            if (zzbafVarZzb != null && zzbafVarZzb.zze()) {
                this.zzj = zzbafVarZzb.zzd();
                this.zzl = zzbafVarZzb.zzg();
                this.zzm = zzbafVarZzb.zzf();
                this.zzn = zzbafVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbafVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzgcVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgcVar.zze;
            this.zzi.zzi = zzfty.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l7 = (Long) c0254t.f2726c.zzb(zzbby.zzex);
            } else {
                l7 = (Long) c0254t.f2726c.zzb(zzbby.zzew);
            }
            ?? LongValue = l7.longValue();
            o oVar = o.f1952C;
            oVar.j.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ?? Zza = zzbat.zza(this.zza, this.zzi);
            try {
                try {
                    zzbau zzbauVar = (zzbau) Zza.get(LongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzj = zzbauVar.zzd();
                        this.zzl = zzbauVar.zzf();
                        this.zzm = zzbauVar.zze();
                        this.zzn = zzbauVar.zza();
                        if (!zzr()) {
                            this.zzf = zzbauVar.zzc();
                            if (this.zze) {
                                zzj(zzgcVar);
                            }
                            oVar.j.getClass();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            zzcdj.zzab(this.zzq.zza, true, jElapsedRealtime3);
                            this.zzk = true;
                            J.k("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        oVar.j.getClass();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        zzcdj.zzab(this.zzq.zza, true, jElapsedRealtime4);
                        this.zzk = true;
                        sb = new StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z7 = true;
                        Zza.cancel(true);
                        Thread.currentThread().interrupt();
                        o.f1952C.j.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        zzcdj.zzab(this.zzq.zza, z7, jElapsedRealtime);
                        this.zzk = z7;
                        sb = new StringBuilder("Cache connection took ");
                        LongValue = z7;
                        sb.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z4 = true;
                        Zza.cancel(true);
                        o.f1952C.j.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        zzcdj.zzab(this.zzq.zza, z4, jElapsedRealtime);
                        this.zzk = z4;
                        sb = new StringBuilder("Cache connection took ");
                        LongValue = z4;
                        sb.append(jElapsedRealtime);
                    } catch (Throwable th) {
                        th = th;
                        o.f1952C.j.getClass();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        zzcdj.zzab(this.zzq.zza, r7, jElapsedRealtime5);
                        this.zzk = r7;
                        J.k("Cache connection took " + jElapsedRealtime5 + "ms");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r7 = LongValue;
                }
            } catch (InterruptedException unused3) {
                z7 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z4 = false;
            } catch (Throwable th3) {
                th = th3;
                r7 = 0;
            }
            sb.append("ms");
            J.k(sb.toString());
        }
        this.zzk = false;
        if (this.zzi != null) {
            zzga zzgaVarZza = zzgcVar.zza();
            zzgaVarZza.zzd(Uri.parse(this.zzi.zza));
            zzgcVar = zzgaVarZza.zze();
        }
        return this.zzb.zzb(zzgcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z4 = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            c.d(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z4) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                try {
                    if (this.zzo == null) {
                        this.zzo = zzbza.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzccv
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzccw.zzm(this.zza);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
