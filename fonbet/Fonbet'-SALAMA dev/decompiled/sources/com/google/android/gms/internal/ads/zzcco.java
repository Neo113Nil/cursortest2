package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.d;
import J2.j;
import android.net.Uri;
import e1.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcan.zzs();
        int zzu = zzcan.zzu();
        String str = this.zze;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzs, zzu);
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

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b4, code lost:
    
        r20.zzo = true;
        zzj(r21, r4, (int) r20.zzi.zza(r20.zzj));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:52:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(String str) {
        String str2;
        String str3;
        this.zze = str;
        String str4 = "error";
        String zzv = zzv(str);
        int i7 = 0;
        try {
            zzgf zzgfVar = new zzgf();
            zzgfVar.zzf(this.zzb);
            zzgfVar.zzc(this.zzf.zzd);
            zzgfVar.zzd(this.zzf.zze);
            zzgfVar.zzb(true);
            zzgfVar.zze(this);
            zzfx zza = zzgfVar.zza();
            if (this.zzf.zzi) {
                zza = new zzcbq(this.zza, zza, this.zzm, this.zzn, null, null);
            }
            zza.zzb(new zzgc(Uri.parse(str), 0L, -1L, null));
            zzcaw zzcawVar = (zzcaw) this.zzc.get();
            if (zzcawVar != null) {
                zzcawVar.zzt(zzv, this);
            }
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzbbp zzbbpVar = zzbby.zzN;
            C0254t c0254t = C0254t.f2723d;
            long longValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
            long longValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue();
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            int i8 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int zza2 = zza.zza(bArr, i7, Math.min(this.zzj.remaining(), i8));
                if (zza2 == -1) {
                    break;
                }
                synchronized (this.zzl) {
                    try {
                        if (this.zzg) {
                            str2 = str4;
                        } else {
                            str2 = str4;
                            try {
                                this.zzj.put(bArr, 0, zza2);
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
                            str3 = this.zzg;
                            try {
                                if (str3 != 0) {
                                    throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                                }
                                long currentTimeMillis2 = System.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzx();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                }
                                str4 = str2;
                                i8 = 8192;
                                i7 = 0;
                            } catch (Exception e7) {
                                e = e7;
                                String f7 = k.f(e.getClass().getCanonicalName(), ":", e.getMessage());
                                String f8 = AbstractC1663a.f("Failed to preload url ", str, " Exception: ", f7);
                                int i9 = J.f3546b;
                                j.g(f8);
                                zzg(str, zzv, str3, f7);
                                return false;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            str3 = str2;
                            String f72 = k.f(e.getClass().getCanonicalName(), ":", e.getMessage());
                            String f82 = AbstractC1663a.f("Failed to preload url ", str, " Exception: ", f72);
                            int i92 = J.f3546b;
                            j.g(f82);
                            zzg(str, zzv, str3, f72);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e9) {
            e = e9;
            str2 = str4;
        }
    }
}
