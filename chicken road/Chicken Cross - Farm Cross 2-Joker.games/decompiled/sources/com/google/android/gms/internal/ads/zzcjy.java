package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcjy extends zzcjs implements zziq {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcie zze;
    private boolean zzf;
    private final zzcjx zzg;
    private final zzcjb zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcjy(zzcif zzcifVar, zzcie zzcieVar) {
        super(zzcifVar);
        this.zze = zzcieVar;
        this.zzg = new zzcjx();
        this.zzh = new zzcjb();
        this.zzk = new Object();
        this.zzl = (String) zzgui.zzd(zzcifVar != null ? zzcifVar.zzn() : null).zza("");
        this.zzm = zzcifVar != null ? zzcifVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        String.valueOf(zzg);
        return "cache:".concat(String.valueOf(zzg));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzP = zzchw.zzP();
        int zzQ = zzchw.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zza(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzb(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
        if (zzhsVar instanceof zzid) {
            this.zzg.zzb((zzid) zzhsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzc(zzhs zzhsVar, zzhw zzhwVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zzd(zzhs zzhsVar, zzhw zzhwVar, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
    
        r30.zzn = true;
        zzp(r31, r4, (int) r30.zzh.zza(r30.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:55:0x0165). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(String str) {
        String str2;
        String str3;
        String str4;
        this.zzd = str;
        String str5 = "error";
        String zzv = zzv(str);
        try {
            zzhz zzhzVar = new zzhz();
            zzhzVar.zzb(this.zzb);
            zzcie zzcieVar = this.zze;
            zzhzVar.zzc(zzcieVar.zzd);
            zzhzVar.zzd(zzcieVar.zze);
            zzhzVar.zze(true);
            zzhzVar.zzf(this);
            zzhs zza = zzhzVar.zza();
            if (zzcieVar.zzi) {
                zza = new zzciz(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzhw(Uri.parse(str), 0L, -1L, null));
            zzcif zzcifVar = (zzcif) this.zzc.get();
            if (zzcifVar != null) {
                zzcifVar.zzt(zzv, this);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue();
            this.zzi = ByteBuffer.allocate(zzcieVar.zzc);
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                str2 = str5;
                try {
                    int zza2 = zza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (zza2 == -1) {
                        break;
                    }
                    synchronized (this.zzk) {
                        zzhs zzhsVar = zza;
                        try {
                            if (this.zzf) {
                                str3 = zzv;
                            } else {
                                str3 = zzv;
                                try {
                                    this.zzi.put(bArr, 0, zza2);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            try {
                                if (this.zzi.remaining() <= 0) {
                                    zzx();
                                    break;
                                }
                                str4 = this.zzf;
                                try {
                                    if (str4 != 0) {
                                        int limit = this.zzi.limit();
                                        StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                                        sb.append("Precache abort at ");
                                        sb.append(limit);
                                        sb.append(" bytes");
                                        throw new IOException(sb.toString());
                                    }
                                    long currentTimeMillis2 = zzk.currentTimeMillis();
                                    if (currentTimeMillis2 - j >= longValue) {
                                        zzx();
                                        j = currentTimeMillis2;
                                    }
                                    if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                        sb2.append("Timeout exceeded. Limit: ");
                                        sb2.append(longValue2);
                                        sb2.append(" sec");
                                        throw new IOException(sb2.toString());
                                    }
                                    str5 = str2;
                                    zza = zzhsVar;
                                    zzv = str3;
                                } catch (Exception e) {
                                    e = e;
                                    String canonicalName = e.getClass().getCanonicalName();
                                    String message = e.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                                    sb3.append(canonicalName);
                                    sb3.append(ServerSentEventKt.COLON);
                                    sb3.append(message);
                                    String sb4 = sb3.toString();
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + sb4.length());
                                    sb5.append("Failed to preload url ");
                                    sb5.append(str);
                                    sb5.append(" Exception: ");
                                    sb5.append(sb4);
                                    String sb6 = sb5.toString();
                                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                                    zzq(str, str3, str4, sb4);
                                    return false;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = str2;
                                String canonicalName2 = e.getClass().getCanonicalName();
                                String message2 = e.getMessage();
                                StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                                sb32.append(canonicalName2);
                                sb32.append(ServerSentEventKt.COLON);
                                sb32.append(message2);
                                String sb42 = sb32.toString();
                                StringBuilder sb52 = new StringBuilder(String.valueOf(str).length() + 34 + sb42.length());
                                sb52.append("Failed to preload url ");
                                sb52.append(str);
                                sb52.append(" Exception: ");
                                sb52.append(sb42);
                                String sb62 = sb52.toString();
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb62);
                                zzq(str, str3, str4, sb42);
                                return false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    str3 = zzv;
                    str4 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    StringBuilder sb322 = new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length());
                    sb322.append(canonicalName22);
                    sb322.append(ServerSentEventKt.COLON);
                    sb322.append(message22);
                    String sb422 = sb322.toString();
                    StringBuilder sb522 = new StringBuilder(String.valueOf(str).length() + 34 + sb422.length());
                    sb522.append("Failed to preload url ");
                    sb522.append(str);
                    sb522.append(" Exception: ");
                    sb522.append(sb422);
                    String sb622 = sb522.toString();
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb622);
                    zzq(str, str3, str4, sb422);
                    return false;
                }
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            str2 = str5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }
}
