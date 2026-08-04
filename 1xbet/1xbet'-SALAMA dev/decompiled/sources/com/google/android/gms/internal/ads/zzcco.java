package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.d;
import J2.j;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzcco extends zzcci implements zzgx {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcav zzf;
    private boolean zzg;
    private final zzccn zzh;
    private final zzcbs zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcco(zzcaw zzcawVar, zzcav zzcavVar) {
        super(zzcawVar);
        this.zzf = zzcavVar;
        this.zzh = new zzccn();
        this.zzi = new zzcbs();
        this.zzl = new Object();
        this.zzm = (String) zzftf.zzd(zzcawVar != null ? zzcawVar.zzr() : null).zzb("");
        this.zzn = zzcawVar != null ? zzcawVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(d.a(str, "MD5")));
    }

    private final void zzx() {
        int iZza = (int) this.zzh.zza();
        int iZza2 = (int) this.zzi.zza(this.zzj);
        int iPosition = this.zzj.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzs = zzcan.zzs();
        int iZzu = zzcan.zzu();
        String str = this.zze;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zza(zzfx zzfxVar, zzgc zzgcVar, boolean z4, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzb(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzc(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzd(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
        if (zzfxVar instanceof zzgk) {
            this.zzh.zzb((zzgk) zzfxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            try {
                ByteBuffer byteBuffer = this.zzj;
                if (byteBuffer != null && !this.zzk) {
                    byteBuffer.flip();
                    this.zzk = true;
                }
                this.zzg = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:? -> B:23:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzt(String str) throws Throwable {
        String str2;
        this.zze = str;
        String str3 = "error";
        String strZzv = zzv(str);
        int i7 = 0;
        try {
            zzgf zzgfVar = new zzgf();
            zzgfVar.zzf(this.zzb);
            zzgfVar.zzc(this.zzf.zzd);
            zzgfVar.zzd(this.zzf.zze);
            zzgfVar.zzb(true);
            zzgfVar.zze(this);
            zzfx zzfxVarZza = zzgfVar.zza();
            if (this.zzf.zzi) {
                zzfxVarZza = new zzcbq(this.zza, zzfxVarZza, this.zzm, this.zzn, null, null);
            }
            zzfxVarZza.zzb(new zzgc(Uri.parse(str), 0L, -1L, null));
            zzcaw zzcawVar = (zzcaw) this.zzc.get();
            if (zzcawVar != null) {
                zzcawVar.zzt(strZzv, this);
            }
            o.f1952C.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbbp zzbbpVar = zzbby.zzN;
            C0254t c0254t = C0254t.f2723d;
            long jLongValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
            long jLongValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue();
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            int i8 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZza = zzfxVarZza.zza(bArr, i7, Math.min(this.zzj.remaining(), i8));
                if (iZza == -1) {
                    this.zzo = true;
                    zzj(str, strZzv, (int) this.zzi.zza(this.zzj));
                    break;
                }
                synchronized (this.zzl) {
                    try {
                        if (!this.zzg) {
                            try {
                                this.zzj.put(bArr, 0, iZza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzj.remaining() <= 0) {
                                zzx();
                                break;
                            }
                            str2 = this.zzg;
                            try {
                                if (str2 != 0) {
                                    throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    zzx();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str3 = str3;
                                i8 = 8192;
                                i7 = 0;
                            } catch (Exception e7) {
                                e = e7;
                                String strF = k.f(e.getClass().getCanonicalName(), ":", e.getMessage());
                                String strF2 = p150v0.a.f("Failed to preload url ", str, " Exception: ", strF);
                                int i9 = J.f3546b;
                                j.g(strF2);
                                zzg(str, strZzv, str2, strF);
                                return false;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            str2 = str3;
                            String strF3 = k.f(e.getClass().getCanonicalName(), ":", e.getMessage());
                            String strF4 = p150v0.a.f("Failed to preload url ", str, " Exception: ", strF3);
                            int i10 = J.f3546b;
                            j.g(strF4);
                            zzg(str, strZzv, str2, strF3);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            str3 = str3;
        }
    }
}
