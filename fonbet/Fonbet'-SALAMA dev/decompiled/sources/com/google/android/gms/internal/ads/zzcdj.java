package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcdj extends zzcan implements zzgx, zzmb {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzccu zzc;
    private final zzyf zzd;
    private final zzcav zze;
    private final WeakReference zzf;
    private final zzvz zzg;
    private zzil zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcam zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzccw zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        if (((java.lang.Boolean) r1.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzcb)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        if (r5.zzl == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcda(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0106, code lost:
    
        if (r5.zzi == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcdd(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcde(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (r5.zzh <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdb(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcdc(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (r5.zzi == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcdj(Context context, zzcav zzcavVar, zzcaw zzcawVar, Integer num) {
        final zzfw zzfwVar;
        this.zzb = context;
        this.zze = zzcavVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzcawVar);
        zzccu zzccuVar = new zzccu();
        this.zzc = zzccuVar;
        zzyf zzyfVar = new zzyf(context);
        this.zzd = zzyfVar;
        if (J.m()) {
            J.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcan.zzD().incrementAndGet();
        zzlt zzltVar = new zzlt(context, new zzcdh(this));
        zzltVar.zzb(zzyfVar);
        zzltVar.zza(zzccuVar);
        zzlu zzc = zzltVar.zzc();
        this.zzh = zzc;
        zzc.zzz(this);
        final boolean z4 = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzftf.zzd(zzcawVar != null ? zzcawVar.zzr() : null).zzb("");
        this.zzp = zzcawVar != null ? zzcawVar.zzf() : 0;
        final String x4 = o.f1952C.f1957c.x(context, zzcawVar.zzm().f10834a);
        if (!this.zzj || this.zzi.limit() <= 0) {
            zzbbp zzbbpVar = zzbby.zzcj;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzfwVar = new zzfw() { // from class: com.google.android.gms.internal.ads.zzccy
                @Override // com.google.android.gms.internal.ads.zzfw
                public final zzfx zza() {
                    int i7 = zzcdj.zza;
                    return new zzfs(bArr);
                }
            };
        }
        this.zzg = new zzvz(zzfwVar, new zzvy(((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzl)).booleanValue() ? new zzada() { // from class: com.google.android.gms.internal.ads.zzcdi
            @Override // com.google.android.gms.internal.ads.zzada
            public final /* synthetic */ zzacv[] zza(Uri uri, Map map) {
                int i7 = zzcdj.zza;
                return new zzacv[]{new zzaii(), new zzagy(), new zzaic(zzajq.zza, 32, null, null, zzfwh.zzn(), null)};
            }
        } : new zzada() { // from class: com.google.android.gms.internal.ads.zzccz
            @Override // com.google.android.gms.internal.ads.zzada
            public final /* synthetic */ zzacv[] zza(Uri uri, Map map) {
                int i7 = zzcdj.zza;
                return new zzacv[]{new zzaii(), new zzagy()};
            }
        }));
    }

    public static /* synthetic */ zzfx zzW(zzcdj zzcdjVar, String str, boolean z4) {
        zzcdj zzcdjVar2 = true != z4 ? null : zzcdjVar;
        zzcav zzcavVar = zzcdjVar.zze;
        return new zzcdm(str, zzcdjVar2, zzcavVar.zzd, zzcavVar.zze, zzcavVar.zzm, zzcavVar.zzn);
    }

    public static /* synthetic */ zzfx zzX(zzcdj zzcdjVar, String str, boolean z4) {
        zzcdj zzcdjVar2 = true != z4 ? null : zzcdjVar;
        zzcav zzcavVar = zzcdjVar.zze;
        zzcct zzcctVar = new zzcct(str, zzcdjVar2, zzcavVar.zzd, zzcavVar.zze, zzcavVar.zzh);
        zzcdjVar.zzu.add(new WeakReference(zzcctVar));
        return zzcctVar;
    }

    public static /* synthetic */ zzfx zzY(zzcdj zzcdjVar, String str, boolean z4) {
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzf(str);
        zzgfVar.zze(true != z4 ? null : zzcdjVar);
        zzgfVar.zzc(zzcdjVar.zze.zzd);
        zzgfVar.zzd(zzcdjVar.zze.zze);
        zzgfVar.zzb(true);
        return zzgfVar.zza();
    }

    public static /* synthetic */ zzfx zzZ(zzcdj zzcdjVar, zzfw zzfwVar) {
        zzfx zza2 = zzfwVar.zza();
        zzcdg zzcdgVar = new zzcdg(zzcdjVar);
        return new zzccw(zzcdjVar.zzb, zza2, zzcdjVar.zzo, zzcdjVar.zzp, zzcdjVar, zzcdgVar);
    }

    public static /* synthetic */ void zzab(zzcdj zzcdjVar, boolean z4, long j) {
        zzcam zzcamVar = zzcdjVar.zzk;
        if (zzcamVar != null) {
            zzcamVar.zzi(z4, j);
        }
    }

    public static /* synthetic */ zzlm[] zzac(zzcdj zzcdjVar, Handler handler, zzabl zzablVar, zzpq zzpqVar, zzwy zzwyVar, zzto zztoVar) {
        zzta zztaVar = zzta.zza;
        Context context = zzcdjVar.zzb;
        zzrd zzrdVar = new zzrd(context, new zzsg(context, null, null), zztaVar, false, handler, zzpqVar, new zzql(context).zzc());
        zzaac zzaacVar = new zzaac(zzcdjVar.zzb);
        zzaacVar.zzg(zztaVar);
        zzaacVar.zze(handler);
        zzaacVar.zzf(zzablVar);
        return new zzlm[]{zzrdVar, zzaacVar.zzh()};
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcan.zzD().decrementAndGet();
        if (J.m()) {
            J.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map zze = ((zzgs) this.zzs.remove(0)).zze();
                long j3 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfsn.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j3 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j3;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z4) {
        zzus zzvkVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z4;
            int length = uriArr.length;
            if (length == 1) {
                zzvkVar = zzaa(uriArr[0]);
            } else {
                zzus[] zzusVarArr = new zzus[length];
                for (int i7 = 0; i7 < uriArr.length; i7++) {
                    zzusVarArr[i7] = zzaa(uriArr[i7]);
                }
                zzvkVar = new zzvk(false, false, new zzub(), zzusVarArr);
            }
            this.zzh.zzC(zzvkVar);
            this.zzh.zzq();
            zzcan.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzH() {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzB(this);
            this.zzh.zzA();
            this.zzh = null;
            zzcan.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzI(long j) {
        this.zzh.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzJ(int i7) {
        this.zzc.zzl(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzK(int i7) {
        this.zzc.zzm(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzL(zzcam zzcamVar) {
        this.zzk = zzcamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzM(int i7) {
        this.zzc.zzn(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzN(int i7) {
        this.zzc.zzo(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzO(boolean z4) {
        this.zzh.zzr(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzQ(boolean z4) {
        if (this.zzh == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            this.zzh.zzy();
            if (i7 >= 2) {
                return;
            }
            zzyf zzyfVar = this.zzd;
            zzxs zzc = zzyfVar.zzf().zzc();
            zzc.zzx(i7, !z4);
            zzyfVar.zzl(zzc);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzR(int i7) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcct zzcctVar = (zzcct) ((WeakReference) it.next()).get();
            if (zzcctVar != null) {
                zzcctVar.zzm(i7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzS(Surface surface, boolean z4) {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzT(float f7, boolean z4) {
        zzil zzilVar = this.zzh;
        if (zzilVar != null) {
            zzilVar.zzt(f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzV() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zza(zzfx zzfxVar, zzgc zzgcVar, boolean z4, int i7) {
        this.zzl += i7;
    }

    public final zzus zzaa(Uri uri) {
        zzad zzadVar = new zzad();
        zzadVar.zzb(uri);
        zzap zzc = zzadVar.zzc();
        zzvz zzvzVar = this.zzg;
        zzvzVar.zza(this.zze.zzf);
        return zzvzVar.zzb(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzb(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzc(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzgx
    public final void zzd(zzfx zzfxVar, zzgc zzgcVar, boolean z4) {
        if (zzfxVar instanceof zzgs) {
            synchronized (this.zzq) {
                this.zzs.add((zzgs) zzfxVar);
            }
        } else if (zzfxVar instanceof zzccw) {
            this.zzt = (zzccw) zzfxVar;
            final zzcaw zzcawVar = (zzcaw) this.zzf.get();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue() && zzcawVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = zzcdj.zza;
                        zzcaw.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zze(zzlz zzlzVar, zzz zzzVar, zzhr zzhrVar) {
        zzcaw zzcawVar = (zzcaw) this.zzf.get();
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue() || zzcawVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzzVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcawVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzf(zzlz zzlzVar, int i7, long j, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzg(zzlz zzlzVar, zzum zzumVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzh(zzlz zzlzVar, int i7, long j) {
        this.zzm += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzi(zzbh zzbhVar, zzma zzmaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzj(zzlz zzlzVar, zzuh zzuhVar, zzum zzumVar, IOException iOException, boolean z4) {
        zzcam zzcamVar = this.zzk;
        if (zzcamVar != null) {
            if (this.zze.zzj) {
                zzcamVar.zzl("onLoadException", iOException);
            } else {
                zzcamVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzk(zzlz zzlzVar, int i7) {
        zzcam zzcamVar = this.zzk;
        if (zzcamVar != null) {
            zzcamVar.zzm(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzl(zzlz zzlzVar, zzba zzbaVar) {
        zzcam zzcamVar = this.zzk;
        if (zzcamVar != null) {
            zzcamVar.zzk("onPlayerError", zzbaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzm(zzlz zzlzVar, zzbf zzbfVar, zzbf zzbfVar2, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzn(zzlz zzlzVar, Object obj, long j) {
        zzcam zzcamVar = this.zzk;
        if (zzcamVar != null) {
            zzcamVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzo(zzlz zzlzVar, zzhq zzhqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzp(zzlz zzlzVar, zzz zzzVar, zzhr zzhrVar) {
        zzcaw zzcawVar = (zzcaw) this.zzf.get();
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue() || zzcawVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(zzzVar.zzx));
        hashMap.put("bitRate", String.valueOf(zzzVar.zzj));
        hashMap.put("resolution", zzzVar.zzv + "x" + zzzVar.zzw);
        String str = zzzVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzzVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzzVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcawVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzq(zzlz zzlzVar, zzcc zzccVar) {
        zzcam zzcamVar = this.zzk;
        if (zzcamVar != null) {
            zzcamVar.zzD(zzccVar.zzb, zzccVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final int zzt() {
        return this.zzh.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzv() {
        return this.zzh.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzy() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final long zzz() {
        return this.zzh.zzm();
    }
}
