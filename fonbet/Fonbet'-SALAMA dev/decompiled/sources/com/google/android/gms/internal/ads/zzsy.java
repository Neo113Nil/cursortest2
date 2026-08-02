package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import e1.k;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class zzsy extends zzhp {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzsr zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzhq zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zzsw zzad;
    private long zzae;
    private boolean zzaf;
    private zzrr zzag;
    private zzrr zzah;
    private final zzsm zzc;
    private final zzta zzd;
    private final float zze;
    private final zzhg zzf;
    private final zzhg zzg;
    private final zzhg zzh;
    private final zzsf zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzre zzl;
    private zzz zzm;
    private zzz zzn;
    private zzll zzo;
    private MediaCrypto zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zzso zzt;
    private zzz zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zzsu zzz;

    public zzsy(int i7, zzsm zzsmVar, zzta zztaVar, boolean z4, float f7) {
        super(i7);
        this.zzc = zzsmVar;
        zztaVar.getClass();
        this.zzd = zztaVar;
        this.zze = f7;
        this.zzf = new zzhg(0, 0);
        this.zzg = new zzhg(0, 0);
        this.zzh = new zzhg(2, 0);
        zzsf zzsfVar = new zzsf();
        this.zzi = zzsfVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzad = zzsw.zza;
        zzsfVar.zzj(0);
        zzsfVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzre();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzH = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzhq();
    }

    public static boolean zzaP(zzz zzzVar) {
        return zzzVar.zzL == 0;
    }

    private final void zzaQ() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final void zzaR(zzsw zzswVar) {
        this.zzad = zzswVar;
        if (zzswVar.zzd != -9223372036854775807L) {
            this.zzaf = true;
        }
    }

    private final void zzaS() {
        zzrr zzrrVar = this.zzah;
        zzrrVar.getClass();
        this.zzag = zzrrVar;
        this.zzT = 0;
        this.zzU = 0;
    }

    private final boolean zzaT() {
        if (this.zzV) {
            this.zzT = 1;
            if (this.zzD) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
        } else {
            zzaS();
        }
        return true;
    }

    private final boolean zzaU() {
        return this.zzK >= 0;
    }

    private final boolean zzaV(long j, long j3) {
        if (j3 >= j) {
            return false;
        }
        zzz zzzVar = this.zzn;
        if (zzzVar == null || !Objects.equals(zzzVar.zzo, "audio/opus")) {
            return true;
        }
        return !zzadq.zzf(j, j3);
    }

    private final boolean zzaW(int i7) {
        zzhg zzhgVar = this.zzf;
        zzkh zzk = zzk();
        zzhgVar.zzb();
        int zzcU = zzcU(zzk, this.zzf, i7 | 4);
        if (zzcU == -5) {
            zzac(zzk);
            return true;
        }
        if (zzcU != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzaa = true;
        zzai();
        return false;
    }

    private final boolean zzaX(long j) {
        return this.zzq == -9223372036854775807L || zzi().zzb() - j < this.zzq;
    }

    private final boolean zzaY(zzz zzzVar) {
        int i7 = zzen.zza;
        if (this.zzt != null && this.zzU != 3 && zzcT() != 0) {
            float f7 = this.zzs;
            zzzVar.getClass();
            float zzZ = zzZ(f7, zzzVar, zzT());
            float f8 = this.zzx;
            if (f8 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f8 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzso zzsoVar = this.zzt;
                    zzsoVar.getClass();
                    zzsoVar.zzq(bundle);
                    this.zzx = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() {
        if (this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
        } else {
            zzaF();
            zzaC();
        }
    }

    private final void zzah() {
        try {
            zzso zzsoVar = this.zzt;
            zzcv.zzb(zzsoVar);
            zzsoVar.zzj();
        } finally {
            zzaG();
        }
    }

    private final void zzai() {
        int i7 = this.zzU;
        if (i7 == 1) {
            zzah();
            return;
        }
        if (i7 == 2) {
            zzah();
            zzaS();
        } else if (i7 != 3) {
            this.zzab = true;
            zzaq();
        } else {
            zzaF();
            zzaC();
        }
    }

    private final void zzao() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public void zzC() {
        try {
            zzad();
            zzaF();
        } finally {
            this.zzah = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzF(zzz[] zzzVarArr, long j, long j3, zzuq zzuqVar) {
        if (this.zzad.zzd == -9223372036854775807L) {
            zzaR(new zzsw(-9223372036854775807L, j, j3));
            return;
        }
        if (this.zzk.isEmpty()) {
            long j7 = this.zzY;
            if (j7 != -9223372036854775807L) {
                long j8 = this.zzae;
                if (j8 != -9223372036854775807L) {
                }
            }
            zzaR(new zzsw(-9223372036854775807L, j, j3));
            if (this.zzad.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        this.zzk.add(new zzsw(this.zzY, j, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public void zzM(float f7, float f8) {
        this.zzr = f7;
        this.zzs = f8;
        zzaY(this.zzu);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // com.google.android.gms.internal.ads.zzlm
    public void zzV(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public boolean zzW() {
        return this.zzab;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        return this.zzI != -9223372036854775807L && zzi().zzb() < this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final int zzY(zzz zzzVar) {
        try {
            return zzaa(this.zzd, zzzVar);
        } catch (zztf e7) {
            throw zzcW(e7, zzzVar, false, 4002);
        }
    }

    public float zzZ(float f7, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    public zzsq zzaA(Throwable th, zzsr zzsrVar) {
        return new zzsq(th, zzsrVar);
    }

    public final zzsr zzaB() {
        return this.zzA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x060e A[Catch: zzsu -> 0x0611, TryCatch #12 {zzsu -> 0x0611, blocks: (B:105:0x05f3, B:107:0x060e, B:108:0x0619, B:113:0x0620, B:114:0x0622, B:115:0x0613, B:397:0x0626, B:399:0x0627, B:402:0x0630, B:403:0x0631, B:404:0x063e, B:416:0x0642), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0613 A[Catch: zzsu -> 0x0611, TryCatch #12 {zzsu -> 0x0611, blocks: (B:105:0x05f3, B:107:0x060e, B:108:0x0619, B:113:0x0620, B:114:0x0622, B:115:0x0613, B:397:0x0626, B:399:0x0627, B:402:0x0630, B:403:0x0631, B:404:0x063e, B:416:0x0642), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0544 A[Catch: Exception -> 0x0235, TryCatch #10 {Exception -> 0x0235, blocks: (B:337:0x022e, B:349:0x0219, B:356:0x023c, B:175:0x025f, B:177:0x0263, B:183:0x0296, B:185:0x029c, B:187:0x02a2, B:190:0x02c0, B:192:0x02c6, B:194:0x02cc, B:198:0x02e0, B:202:0x02ef, B:206:0x02fe, B:210:0x030d, B:213:0x031b, B:217:0x032f, B:220:0x0349, B:222:0x035a, B:223:0x035f, B:225:0x0363, B:226:0x0368, B:267:0x0386, B:268:0x038b, B:270:0x0390, B:271:0x0395, B:273:0x039a, B:274:0x039f, B:276:0x03a3, B:277:0x03a8, B:279:0x03ac, B:280:0x03b1, B:282:0x03b7, B:283:0x03bc, B:285:0x03c0, B:286:0x03c5, B:288:0x03c9, B:289:0x03ce, B:291:0x03d2, B:292:0x03d7, B:294:0x03db, B:295:0x03e0, B:297:0x03e4, B:298:0x03e9, B:300:0x03ed, B:301:0x03f2, B:303:0x03f6, B:304:0x03fb, B:306:0x03ff, B:307:0x0404, B:309:0x0408, B:310:0x040d, B:312:0x0410, B:313:0x0415, B:245:0x0457, B:246:0x0460, B:58:0x049d, B:60:0x04a9, B:62:0x04b1, B:64:0x04bb, B:66:0x04c3, B:68:0x04cb, B:71:0x050f, B:73:0x0515, B:76:0x0520, B:78:0x0526, B:81:0x0531, B:83:0x0537, B:87:0x058e, B:89:0x0594, B:91:0x059b, B:92:0x05a8, B:120:0x0544, B:122:0x054c, B:124:0x0554, B:126:0x055c, B:128:0x0564, B:130:0x056c, B:132:0x0574, B:134:0x057e, B:136:0x0588, B:144:0x04d9, B:146:0x04e1, B:149:0x04ec, B:151:0x04f6, B:153:0x04fe, B:155:0x0506, B:247:0x0440, B:248:0x0447), top: B:336:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0515 A[Catch: Exception -> 0x0235, TryCatch #10 {Exception -> 0x0235, blocks: (B:337:0x022e, B:349:0x0219, B:356:0x023c, B:175:0x025f, B:177:0x0263, B:183:0x0296, B:185:0x029c, B:187:0x02a2, B:190:0x02c0, B:192:0x02c6, B:194:0x02cc, B:198:0x02e0, B:202:0x02ef, B:206:0x02fe, B:210:0x030d, B:213:0x031b, B:217:0x032f, B:220:0x0349, B:222:0x035a, B:223:0x035f, B:225:0x0363, B:226:0x0368, B:267:0x0386, B:268:0x038b, B:270:0x0390, B:271:0x0395, B:273:0x039a, B:274:0x039f, B:276:0x03a3, B:277:0x03a8, B:279:0x03ac, B:280:0x03b1, B:282:0x03b7, B:283:0x03bc, B:285:0x03c0, B:286:0x03c5, B:288:0x03c9, B:289:0x03ce, B:291:0x03d2, B:292:0x03d7, B:294:0x03db, B:295:0x03e0, B:297:0x03e4, B:298:0x03e9, B:300:0x03ed, B:301:0x03f2, B:303:0x03f6, B:304:0x03fb, B:306:0x03ff, B:307:0x0404, B:309:0x0408, B:310:0x040d, B:312:0x0410, B:313:0x0415, B:245:0x0457, B:246:0x0460, B:58:0x049d, B:60:0x04a9, B:62:0x04b1, B:64:0x04bb, B:66:0x04c3, B:68:0x04cb, B:71:0x050f, B:73:0x0515, B:76:0x0520, B:78:0x0526, B:81:0x0531, B:83:0x0537, B:87:0x058e, B:89:0x0594, B:91:0x059b, B:92:0x05a8, B:120:0x0544, B:122:0x054c, B:124:0x0554, B:126:0x055c, B:128:0x0564, B:130:0x056c, B:132:0x0574, B:134:0x057e, B:136:0x0588, B:144:0x04d9, B:146:0x04e1, B:149:0x04ec, B:151:0x04f6, B:153:0x04fe, B:155:0x0506, B:247:0x0440, B:248:0x0447), top: B:336:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0526 A[Catch: Exception -> 0x0235, TryCatch #10 {Exception -> 0x0235, blocks: (B:337:0x022e, B:349:0x0219, B:356:0x023c, B:175:0x025f, B:177:0x0263, B:183:0x0296, B:185:0x029c, B:187:0x02a2, B:190:0x02c0, B:192:0x02c6, B:194:0x02cc, B:198:0x02e0, B:202:0x02ef, B:206:0x02fe, B:210:0x030d, B:213:0x031b, B:217:0x032f, B:220:0x0349, B:222:0x035a, B:223:0x035f, B:225:0x0363, B:226:0x0368, B:267:0x0386, B:268:0x038b, B:270:0x0390, B:271:0x0395, B:273:0x039a, B:274:0x039f, B:276:0x03a3, B:277:0x03a8, B:279:0x03ac, B:280:0x03b1, B:282:0x03b7, B:283:0x03bc, B:285:0x03c0, B:286:0x03c5, B:288:0x03c9, B:289:0x03ce, B:291:0x03d2, B:292:0x03d7, B:294:0x03db, B:295:0x03e0, B:297:0x03e4, B:298:0x03e9, B:300:0x03ed, B:301:0x03f2, B:303:0x03f6, B:304:0x03fb, B:306:0x03ff, B:307:0x0404, B:309:0x0408, B:310:0x040d, B:312:0x0410, B:313:0x0415, B:245:0x0457, B:246:0x0460, B:58:0x049d, B:60:0x04a9, B:62:0x04b1, B:64:0x04bb, B:66:0x04c3, B:68:0x04cb, B:71:0x050f, B:73:0x0515, B:76:0x0520, B:78:0x0526, B:81:0x0531, B:83:0x0537, B:87:0x058e, B:89:0x0594, B:91:0x059b, B:92:0x05a8, B:120:0x0544, B:122:0x054c, B:124:0x0554, B:126:0x055c, B:128:0x0564, B:130:0x056c, B:132:0x0574, B:134:0x057e, B:136:0x0588, B:144:0x04d9, B:146:0x04e1, B:149:0x04ec, B:151:0x04f6, B:153:0x04fe, B:155:0x0506, B:247:0x0440, B:248:0x0447), top: B:336:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0537 A[Catch: Exception -> 0x0235, TryCatch #10 {Exception -> 0x0235, blocks: (B:337:0x022e, B:349:0x0219, B:356:0x023c, B:175:0x025f, B:177:0x0263, B:183:0x0296, B:185:0x029c, B:187:0x02a2, B:190:0x02c0, B:192:0x02c6, B:194:0x02cc, B:198:0x02e0, B:202:0x02ef, B:206:0x02fe, B:210:0x030d, B:213:0x031b, B:217:0x032f, B:220:0x0349, B:222:0x035a, B:223:0x035f, B:225:0x0363, B:226:0x0368, B:267:0x0386, B:268:0x038b, B:270:0x0390, B:271:0x0395, B:273:0x039a, B:274:0x039f, B:276:0x03a3, B:277:0x03a8, B:279:0x03ac, B:280:0x03b1, B:282:0x03b7, B:283:0x03bc, B:285:0x03c0, B:286:0x03c5, B:288:0x03c9, B:289:0x03ce, B:291:0x03d2, B:292:0x03d7, B:294:0x03db, B:295:0x03e0, B:297:0x03e4, B:298:0x03e9, B:300:0x03ed, B:301:0x03f2, B:303:0x03f6, B:304:0x03fb, B:306:0x03ff, B:307:0x0404, B:309:0x0408, B:310:0x040d, B:312:0x0410, B:313:0x0415, B:245:0x0457, B:246:0x0460, B:58:0x049d, B:60:0x04a9, B:62:0x04b1, B:64:0x04bb, B:66:0x04c3, B:68:0x04cb, B:71:0x050f, B:73:0x0515, B:76:0x0520, B:78:0x0526, B:81:0x0531, B:83:0x0537, B:87:0x058e, B:89:0x0594, B:91:0x059b, B:92:0x05a8, B:120:0x0544, B:122:0x054c, B:124:0x0554, B:126:0x055c, B:128:0x0564, B:130:0x056c, B:132:0x0574, B:134:0x057e, B:136:0x0588, B:144:0x04d9, B:146:0x04e1, B:149:0x04ec, B:151:0x04f6, B:153:0x04fe, B:155:0x0506, B:247:0x0440, B:248:0x0447), top: B:336:0x022e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0594 A[Catch: Exception -> 0x0235, TryCatch #10 {Exception -> 0x0235, blocks: (B:337:0x022e, B:349:0x0219, B:356:0x023c, B:175:0x025f, B:177:0x0263, B:183:0x0296, B:185:0x029c, B:187:0x02a2, B:190:0x02c0, B:192:0x02c6, B:194:0x02cc, B:198:0x02e0, B:202:0x02ef, B:206:0x02fe, B:210:0x030d, B:213:0x031b, B:217:0x032f, B:220:0x0349, B:222:0x035a, B:223:0x035f, B:225:0x0363, B:226:0x0368, B:267:0x0386, B:268:0x038b, B:270:0x0390, B:271:0x0395, B:273:0x039a, B:274:0x039f, B:276:0x03a3, B:277:0x03a8, B:279:0x03ac, B:280:0x03b1, B:282:0x03b7, B:283:0x03bc, B:285:0x03c0, B:286:0x03c5, B:288:0x03c9, B:289:0x03ce, B:291:0x03d2, B:292:0x03d7, B:294:0x03db, B:295:0x03e0, B:297:0x03e4, B:298:0x03e9, B:300:0x03ed, B:301:0x03f2, B:303:0x03f6, B:304:0x03fb, B:306:0x03ff, B:307:0x0404, B:309:0x0408, B:310:0x040d, B:312:0x0410, B:313:0x0415, B:245:0x0457, B:246:0x0460, B:58:0x049d, B:60:0x04a9, B:62:0x04b1, B:64:0x04bb, B:66:0x04c3, B:68:0x04cb, B:71:0x050f, B:73:0x0515, B:76:0x0520, B:78:0x0526, B:81:0x0531, B:83:0x0537, B:87:0x058e, B:89:0x0594, B:91:0x059b, B:92:0x05a8, B:120:0x0544, B:122:0x054c, B:124:0x0554, B:126:0x055c, B:128:0x0564, B:130:0x056c, B:132:0x0574, B:134:0x057e, B:136:0x0588, B:144:0x04d9, B:146:0x04e1, B:149:0x04ec, B:151:0x04f6, B:153:0x04fe, B:155:0x0506, B:247:0x0440, B:248:0x0447), top: B:336:0x022e }] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzsv] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzsy] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsx] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.google.android.gms.internal.ads.zzso] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.zzz] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzaC() {
        zzz zzzVar;
        zzz zzzVar2;
        Throwable th;
        ?? r16;
        zzsr zzsrVar;
        ?? r9;
        Object obj;
        zzz zzzVar3;
        zzsu zzsuVar;
        zzz zzzVar4;
        ArrayDeque arrayDeque;
        zzz zzzVar5;
        ArrayDeque arrayDeque2;
        zzz zzzVar6;
        StringBuilder sb;
        ArrayDeque arrayDeque3;
        zzz zzzVar7;
        zzs zzsVar;
        zzsl zzslVar;
        long j;
        String str;
        int i7;
        boolean z4;
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        if (this.zzt != null || this.zzO || (zzzVar = this.zzm) == null) {
            return;
        }
        if (zzaL(zzzVar)) {
            zzad();
            String str2 = zzzVar.zzo;
            if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                this.zzi.zzo(32);
            } else {
                this.zzi.zzo(1);
            }
            this.zzO = true;
            return;
        }
        zzrr zzrrVar = this.zzah;
        this.zzag = zzrrVar;
        if (zzrrVar != null) {
            zzcv.zzf(true);
            zzrr zzrrVar2 = this.zzag;
            boolean z7 = zzrs.zza;
            zzrrVar2.zza();
        }
        try {
            zzzVar2 = this.zzm;
            th = 0;
        } catch (zzsu e7) {
            e = e7;
        }
        try {
            if (zzzVar2 == null) {
                throw null;
            }
            if (this.zzy == null) {
                try {
                    List zzag = zzag(this.zzd, zzzVar2, false);
                    zzag.isEmpty();
                    this.zzy = new ArrayDeque();
                    if (!zzag.isEmpty()) {
                        this.zzy.add((zzsr) zzag.get(0));
                    }
                    this.zzz = null;
                } catch (zztf e8) {
                    throw new zzsu(zzzVar2, (Throwable) e8, false, -49998);
                }
            }
            if (this.zzy.isEmpty()) {
                throw new zzsu(zzzVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque4 = this.zzy;
            if (arrayDeque4 == null) {
                throw null;
            }
            while (this.zzt == null) {
                zzsr zzsrVar2 = (zzsr) arrayDeque4.peekFirst();
                if (zzsrVar2 == null) {
                    throw th;
                }
                if (!zzaM(zzzVar2) || !zzaO(zzsrVar2)) {
                    return;
                }
                try {
                    zzzVar4 = this.zzm;
                } catch (Exception e9) {
                    e = e9;
                    r16 = arrayDeque4;
                    zzsrVar = zzsrVar2;
                    r9 = zzzVar2;
                    obj = th;
                    zzzVar3 = zzzVar;
                }
                if (zzzVar4 == null) {
                    throw th;
                }
                String str3 = zzsrVar2.zza;
                int i8 = zzen.zza;
                float zzZ = zzZ(this.zzs, zzzVar4, zzT());
                r16 = -1082130432;
                r16 = -1082130432;
                if (zzZ <= this.zze) {
                    zzZ = -1.0f;
                }
                long zzb2 = zzi().zzb();
                zzsl zzaf = zzaf(zzsrVar2, zzzVar4, th, zzZ);
                ?? r10 = 31;
                r9 = r9;
                if (zzen.zza >= 31) {
                    LogSessionId zza = zzo().zza();
                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = zza.equals(logSessionId);
                    r9 = r9;
                    r10 = zza;
                    if (!equals) {
                        MediaFormat mediaFormat = zzaf.zzb;
                        stringId = zza.getStringId();
                        mediaFormat.setString("log-session-id", stringId);
                        r9 = "log-session-id";
                        r10 = stringId;
                    }
                }
                try {
                    Trace.beginSection("createCodec:" + str3);
                    r9 = this.zzc.zzd(zzaf);
                    this.zzt = r9;
                    r10 = new zzsv(this, th);
                    r9.zzs(r10);
                    Trace.endSection();
                    long zzb3 = zzi().zzb();
                    if (zzsrVar2.zze(zzzVar4)) {
                        arrayDeque = arrayDeque4;
                        zzzVar5 = zzzVar2;
                        j = zzb3;
                        zzzVar3 = zzzVar;
                        zzslVar = zzaf;
                    } else {
                        try {
                            sb = new StringBuilder();
                            sb.append("id=");
                            sb.append(zzzVar4.zza);
                            sb.append(", mimeType=");
                            sb.append(zzzVar4.zzo);
                            if (zzzVar4.zzn != null) {
                                try {
                                    sb.append(", container=");
                                    sb.append(zzzVar4.zzn);
                                } catch (Exception e10) {
                                    e = e10;
                                    arrayDeque3 = arrayDeque4;
                                    zzsrVar = zzsrVar2;
                                    zzzVar7 = zzzVar2;
                                    zzzVar3 = zzzVar;
                                    obj = null;
                                    r9 = zzzVar7;
                                    r16 = arrayDeque3;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsu zzsuVar2 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar2);
                                    zzsuVar = this.zzz;
                                    if (zzsuVar == null) {
                                    }
                                    if (r16.isEmpty()) {
                                    }
                                }
                            }
                            if (zzzVar4.zzj != -1) {
                                try {
                                    sb.append(", bitrate=");
                                    sb.append(zzzVar4.zzj);
                                } catch (Exception e11) {
                                    e = e11;
                                    arrayDeque2 = arrayDeque4;
                                    zzsrVar = zzsrVar2;
                                    zzzVar6 = zzzVar2;
                                    zzzVar3 = zzzVar;
                                    obj = null;
                                    r9 = zzzVar6;
                                    r16 = arrayDeque2;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsu zzsuVar22 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar22);
                                    zzsuVar = this.zzz;
                                    if (zzsuVar == null) {
                                    }
                                    if (r16.isEmpty()) {
                                    }
                                }
                            }
                            if (zzzVar4.zzk != null) {
                                sb.append(", codecs=");
                                sb.append(zzzVar4.zzk);
                            }
                            if (zzzVar4.zzs != null) {
                                try {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    arrayDeque = arrayDeque4;
                                    int i9 = 0;
                                    while (true) {
                                        try {
                                            zzsVar = zzzVar4.zzs;
                                            zzzVar5 = zzzVar2;
                                        } catch (Exception e12) {
                                            e = e12;
                                            zzzVar5 = zzzVar2;
                                            zzzVar3 = zzzVar;
                                            zzsrVar = zzsrVar2;
                                            arrayDeque2 = arrayDeque;
                                            zzzVar6 = zzzVar5;
                                            obj = null;
                                            r9 = zzzVar6;
                                            r16 = arrayDeque2;
                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                            r16.removeFirst();
                                            zzsu zzsuVar222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                            zzak(zzsuVar222);
                                            zzsuVar = this.zzz;
                                            if (zzsuVar == null) {
                                            }
                                            if (r16.isEmpty()) {
                                            }
                                        }
                                        try {
                                            if (i9 >= zzsVar.zzb) {
                                                break;
                                            }
                                            UUID uuid = zzsVar.zza(i9).zza;
                                            try {
                                                if (uuid.equals(zzh.zzb)) {
                                                    try {
                                                        linkedHashSet.add("cenc");
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        zzsrVar = zzsrVar2;
                                                        zzzVar3 = zzzVar;
                                                        arrayDeque2 = arrayDeque;
                                                        zzzVar6 = zzzVar5;
                                                        obj = null;
                                                        r9 = zzzVar6;
                                                        r16 = arrayDeque2;
                                                        zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                                        r16.removeFirst();
                                                        zzsu zzsuVar2222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                                        zzak(zzsuVar2222);
                                                        zzsuVar = this.zzz;
                                                        if (zzsuVar == null) {
                                                        }
                                                        if (r16.isEmpty()) {
                                                        }
                                                    }
                                                } else if (uuid.equals(zzh.zzc)) {
                                                    linkedHashSet.add("clearkey");
                                                } else if (uuid.equals(zzh.zze)) {
                                                    linkedHashSet.add("playready");
                                                } else if (uuid.equals(zzh.zzd)) {
                                                    linkedHashSet.add("widevine");
                                                } else if (uuid.equals(zzh.zza)) {
                                                    linkedHashSet.add("universal");
                                                } else {
                                                    String obj2 = uuid.toString();
                                                    StringBuilder sb2 = new StringBuilder();
                                                    zzzVar3 = zzzVar;
                                                    sb2.append("unknown (");
                                                    sb2.append(obj2);
                                                    sb2.append(")");
                                                    linkedHashSet.add(sb2.toString());
                                                    i9++;
                                                    zzzVar2 = zzzVar5;
                                                    zzzVar = zzzVar3;
                                                }
                                                i9++;
                                                zzzVar2 = zzzVar5;
                                                zzzVar = zzzVar3;
                                            } catch (Exception e14) {
                                                e = e14;
                                                zzsrVar = zzsrVar2;
                                                arrayDeque2 = arrayDeque;
                                                zzzVar6 = zzzVar5;
                                                obj = null;
                                                r9 = zzzVar6;
                                                r16 = arrayDeque2;
                                                zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                                r16.removeFirst();
                                                zzsu zzsuVar22222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                                zzak(zzsuVar22222);
                                                zzsuVar = this.zzz;
                                                if (zzsuVar == null) {
                                                }
                                                if (r16.isEmpty()) {
                                                }
                                            }
                                            zzzVar3 = zzzVar;
                                        } catch (Exception e15) {
                                            e = e15;
                                            zzzVar3 = zzzVar;
                                            zzsrVar = zzsrVar2;
                                            arrayDeque2 = arrayDeque;
                                            zzzVar6 = zzzVar5;
                                            obj = null;
                                            r9 = zzzVar6;
                                            r16 = arrayDeque2;
                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                            r16.removeFirst();
                                            zzsu zzsuVar222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                            zzak(zzsuVar222222);
                                            zzsuVar = this.zzz;
                                            if (zzsuVar == null) {
                                            }
                                            if (r16.isEmpty()) {
                                            }
                                        }
                                    }
                                    zzzVar3 = zzzVar;
                                    sb.append(", drm=[");
                                    zzfsz.zzb(sb, linkedHashSet, ",");
                                    sb.append(']');
                                } catch (Exception e16) {
                                    e = e16;
                                    arrayDeque = arrayDeque4;
                                }
                            } else {
                                arrayDeque = arrayDeque4;
                                zzzVar5 = zzzVar2;
                                zzzVar3 = zzzVar;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            arrayDeque = arrayDeque4;
                            zzzVar5 = zzzVar2;
                            zzzVar3 = zzzVar;
                        }
                        try {
                            if (zzzVar4.zzv != -1 && zzzVar4.zzw != -1) {
                                sb.append(", res=");
                                sb.append(zzzVar4.zzv);
                                sb.append("x");
                                sb.append(zzzVar4.zzw);
                            }
                            double d7 = zzzVar4.zzz;
                            int i10 = zzfza.zza;
                            zzslVar = zzaf;
                            j = zzb3;
                            if (Math.copySign(d7 - 1.0d, 1.0d) > 0.001d && d7 != 1.0d && (!Double.isNaN(d7) || !Double.isNaN(1.0d))) {
                                sb.append(", par=");
                                sb.append(String.format(Locale.US, "%.3f", Float.valueOf(zzzVar4.zzz)));
                            }
                            zzk zzkVar = zzzVar4.zzC;
                            if (zzkVar != null && (zzkVar.zze() || zzkVar.zzf())) {
                                sb.append(", color=");
                                sb.append(zzzVar4.zzC.zzd());
                            }
                            if (zzzVar4.zzx != -1.0f) {
                                sb.append(", fps=");
                                sb.append(zzzVar4.zzx);
                            }
                            if (zzzVar4.zzD != -1) {
                                sb.append(", maxSubLayers=");
                                sb.append(zzzVar4.zzD);
                            }
                            if (zzzVar4.zzE != -1) {
                                sb.append(", channels=");
                                sb.append(zzzVar4.zzE);
                            }
                            if (zzzVar4.zzF != -1) {
                                sb.append(", sample_rate=");
                                sb.append(zzzVar4.zzF);
                            }
                            if (zzzVar4.zzd != null) {
                                sb.append(", language=");
                                sb.append(zzzVar4.zzd);
                            }
                            if (!zzzVar4.zzc.isEmpty()) {
                                sb.append(", labels=[");
                                zzfsz.zzb(sb, zzfwx.zzb(zzzVar4.zzc, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzw
                                    @Override // com.google.android.gms.internal.ads.zzfsw
                                    public final Object apply(Object obj3) {
                                        zzab zzabVar = (zzab) obj3;
                                        int i11 = zzz.zzM;
                                        return k.f(zzabVar.zza, ": ", zzabVar.zzb);
                                    }
                                }), ",");
                                sb.append("]");
                            }
                            if (zzzVar4.zze != 0) {
                                sb.append(", selectionFlags=[");
                                int i11 = zzzVar4.zze;
                                ArrayList arrayList = new ArrayList();
                                if ((i11 & 1) != 0) {
                                    arrayList.add("default");
                                }
                                if ((i11 & 2) != 0) {
                                    arrayList.add("forced");
                                }
                                zzfsz.zzb(sb, arrayList, ",");
                                sb.append("]");
                            }
                            if (zzzVar4.zzf != 0) {
                                try {
                                    sb.append(", roleFlags=[");
                                    int i12 = zzzVar4.zzf;
                                    ArrayList arrayList2 = new ArrayList();
                                    if ((i12 & 1) != 0) {
                                        arrayList2.add(SentryThread.JsonKeys.MAIN);
                                    }
                                    if ((i12 & 2) != 0) {
                                        arrayList2.add("alt");
                                    }
                                    if ((i12 & 4) != 0) {
                                        arrayList2.add("supplementary");
                                    }
                                    if ((i12 & 8) != 0) {
                                        arrayList2.add("commentary");
                                    }
                                    if ((i12 & 16) != 0) {
                                        arrayList2.add("dub");
                                    }
                                    if ((i12 & 32) != 0) {
                                        arrayList2.add("emergency");
                                    }
                                    if ((i12 & 64) != 0) {
                                        arrayList2.add("caption");
                                    }
                                    if ((i12 & 128) != 0) {
                                        arrayList2.add("subtitle");
                                    }
                                    if ((i12 & 256) != 0) {
                                        arrayList2.add("sign");
                                    }
                                    if ((i12 & 512) != 0) {
                                        arrayList2.add("describes-video");
                                    }
                                    if ((i12 & 1024) != 0) {
                                        arrayList2.add("describes-music");
                                    }
                                    if ((i12 & 2048) != 0) {
                                        arrayList2.add("enhanced-intelligibility");
                                    }
                                    if ((i12 & 4096) != 0) {
                                        arrayList2.add("transcribes-dialog");
                                    }
                                    if ((i12 & 8192) != 0) {
                                        arrayList2.add("easy-read");
                                    }
                                    if ((i12 & 16384) != 0) {
                                        arrayList2.add("trick-play");
                                    }
                                    if ((i12 & 32768) != 0) {
                                        arrayList2.add("auxiliary");
                                    }
                                    zzfsz.zzb(sb, arrayList2, ",");
                                    sb.append("]");
                                } catch (Exception e18) {
                                    e = e18;
                                    zzsrVar = zzsrVar2;
                                    arrayDeque2 = arrayDeque;
                                    zzzVar6 = zzzVar5;
                                    obj = null;
                                    r9 = zzzVar6;
                                    r16 = arrayDeque2;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsu zzsuVar2222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar2222222);
                                    zzsuVar = this.zzz;
                                    if (zzsuVar == null) {
                                    }
                                    if (r16.isEmpty()) {
                                    }
                                }
                            }
                            try {
                                if ((zzzVar4.zzf & 32768) != 0) {
                                    sb.append(", auxiliaryTrackType=");
                                    int i13 = zzzVar4.zzg;
                                    if (i13 == 0) {
                                        str = "undefined";
                                    } else if (i13 == 1) {
                                        str = "original";
                                    } else if (i13 == 2) {
                                        str = "depth-linear";
                                    } else if (i13 == 3) {
                                        str = "depth-inverse";
                                    } else {
                                        if (i13 != 4) {
                                            throw new IllegalStateException("Unsupported auxiliary track type");
                                        }
                                        str = "depth metadata";
                                    }
                                    sb.append(str);
                                }
                                String sb3 = sb.toString();
                                Locale locale = Locale.US;
                                zzdq.zzf("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + sb3 + ", " + str3 + "]");
                            } catch (Exception e19) {
                                e = e19;
                                zzsrVar = zzsrVar2;
                                arrayDeque2 = arrayDeque;
                                zzzVar6 = zzzVar5;
                                obj = null;
                                r9 = zzzVar6;
                                r16 = arrayDeque2;
                                zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                r16.removeFirst();
                                zzsu zzsuVar22222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                zzak(zzsuVar22222222);
                                zzsuVar = this.zzz;
                                if (zzsuVar == null) {
                                }
                                if (r16.isEmpty()) {
                                }
                            }
                        } catch (Exception e20) {
                            e = e20;
                            zzsrVar = zzsrVar2;
                            arrayDeque2 = arrayDeque;
                            zzzVar6 = zzzVar5;
                            obj = null;
                            r9 = zzzVar6;
                            r16 = arrayDeque2;
                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                            r16.removeFirst();
                            zzsu zzsuVar222222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                            zzak(zzsuVar222222222);
                            zzsuVar = this.zzz;
                            if (zzsuVar == null) {
                            }
                            if (r16.isEmpty()) {
                            }
                        }
                    }
                    this.zzA = zzsrVar2;
                    this.zzx = zzZ;
                    this.zzu = zzzVar4;
                    int i14 = zzen.zza;
                    if (i14 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                        String str4 = Build.MODEL;
                        if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                            i7 = 2;
                            this.zzB = i7;
                            this.zzC = i14 != 29 && "c2.android.aac.decoder".equals(str3);
                            this.zzD = i14 > 23 && "OMX.google.vorbis.decoder".equals(str3);
                            String str5 = zzsrVar2.zza;
                            if (i14 <= 25) {
                                if ("OMX.rk.video_decoder.avc".equals(str5)) {
                                }
                                z4 = true;
                                this.zzG = z4;
                                if (this.zzt == null) {
                                    throw null;
                                }
                                if (zzcT() == 2) {
                                    this.zzI = zzi().zzb() + 1000;
                                }
                                try {
                                    this.zza.zza++;
                                    r16 = arrayDeque;
                                    zzsrVar = zzsrVar2;
                                    r9 = zzzVar5;
                                    r10 = 0;
                                    obj = null;
                                } catch (Exception e21) {
                                    e = e21;
                                    zzsrVar = zzsrVar2;
                                    arrayDeque3 = arrayDeque;
                                    zzzVar7 = zzzVar5;
                                    obj = null;
                                    r9 = zzzVar7;
                                    r16 = arrayDeque3;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsu zzsuVar2222222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar2222222222);
                                    zzsuVar = this.zzz;
                                    if (zzsuVar == null) {
                                        this.zzz = zzsuVar2222222222;
                                    } else {
                                        this.zzz = zzsu.zza(zzsuVar, zzsuVar2222222222);
                                    }
                                    if (r16.isEmpty()) {
                                        throw this.zzz;
                                    }
                                    zzzVar2 = r9;
                                    th = obj;
                                    arrayDeque4 = r16;
                                    zzzVar = zzzVar3;
                                }
                                try {
                                    zzal(str3, zzslVar, j, j - zzb2);
                                } catch (Exception e22) {
                                    e = e22;
                                    r9 = r9;
                                    obj = r10;
                                    r16 = r16;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsu zzsuVar22222222222 = new zzsu((zzz) r9, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar22222222222);
                                    zzsuVar = this.zzz;
                                    if (zzsuVar == null) {
                                    }
                                    if (r16.isEmpty()) {
                                    }
                                }
                                zzzVar2 = r9;
                                th = obj;
                                arrayDeque4 = r16;
                                zzzVar = zzzVar3;
                            }
                            if ((i14 <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str5) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.avc.tunnel".equals(str5) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzsrVar2.zzf)) {
                                z4 = false;
                                this.zzG = z4;
                                if (this.zzt == null) {
                                }
                            }
                            z4 = true;
                            this.zzG = z4;
                            if (this.zzt == null) {
                            }
                        }
                    }
                    if (i14 < 24) {
                        if (!"OMX.Nvidia.h264.decode".equals(str3)) {
                            if ("OMX.Nvidia.h264.decode.secure".equals(str3)) {
                            }
                        }
                        String str6 = Build.DEVICE;
                        if ("flounder".equals(str6) || "flounder_lte".equals(str6) || "grouper".equals(str6) || "tilapia".equals(str6)) {
                            i7 = 1;
                            this.zzB = i7;
                            this.zzC = i14 != 29 && "c2.android.aac.decoder".equals(str3);
                            this.zzD = i14 > 23 && "OMX.google.vorbis.decoder".equals(str3);
                            String str52 = zzsrVar2.zza;
                            if (i14 <= 25) {
                            }
                            if (i14 <= 29) {
                            }
                            z4 = false;
                            this.zzG = z4;
                            if (this.zzt == null) {
                            }
                        }
                    }
                    i7 = 0;
                    this.zzB = i7;
                    this.zzC = i14 != 29 && "c2.android.aac.decoder".equals(str3);
                    this.zzD = i14 > 23 && "OMX.google.vorbis.decoder".equals(str3);
                    String str522 = zzsrVar2.zza;
                    if (i14 <= 25) {
                    }
                    if (i14 <= 29) {
                    }
                    z4 = false;
                    this.zzG = z4;
                    if (this.zzt == null) {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            this.zzy = th;
        } catch (zzsu e23) {
            e = e23;
            throw zzcW(e, zzzVar, false, 4001);
        }
    }

    public void zzaD(long j) {
        this.zzae = j;
        while (!this.zzk.isEmpty() && j >= ((zzsw) this.zzk.peek()).zzb) {
            zzsw zzswVar = (zzsw) this.zzk.poll();
            zzswVar.getClass();
            zzaR(zzswVar);
            zzap();
        }
    }

    public void zzaE(zzhg zzhgVar) {
    }

    public final void zzaF() {
        try {
            zzso zzsoVar = this.zzt;
            if (zzsoVar != null) {
                zzsoVar.zzm();
                this.zza.zzb++;
                zzsr zzsrVar = this.zzA;
                if (zzsrVar == null) {
                    throw null;
                }
                zzam(zzsrVar.zza);
            }
            this.zzt = null;
            this.zzp = null;
            this.zzag = null;
            zzaH();
        } catch (Throwable th) {
            this.zzt = null;
            this.zzp = null;
            this.zzag = null;
            zzaH();
            throw th;
        }
    }

    public void zzaG() {
        zzao();
        zzaQ();
        this.zzI = -9223372036854775807L;
        this.zzW = false;
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR ? 1 : 0;
    }

    public final void zzaH() {
        zzaG();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzX = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    public final boolean zzaI() {
        boolean zzaJ = zzaJ();
        if (zzaJ) {
            zzaC();
        }
        return zzaJ;
    }

    public final boolean zzaJ() {
        if (this.zzt == null) {
            return false;
        }
        int i7 = this.zzU;
        if (i7 == 3 || ((this.zzC && !this.zzX) || (this.zzD && this.zzW))) {
            zzaF();
            return true;
        }
        if (i7 == 2) {
            int i8 = zzen.zza;
            try {
                zzaS();
            } catch (zzia e7) {
                zzdq.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                zzaF();
                return true;
            }
        }
        zzah();
        return false;
    }

    public final boolean zzaK() {
        return this.zzO;
    }

    public final boolean zzaL(zzz zzzVar) {
        return this.zzah == null && zzas(zzzVar);
    }

    public boolean zzaM(zzz zzzVar) {
        return true;
    }

    public boolean zzaN(zzhg zzhgVar) {
        return false;
    }

    public boolean zzaO(zzsr zzsrVar) {
        return true;
    }

    public abstract int zzaa(zzta zztaVar, zzz zzzVar);

    public zzhr zzab(zzsr zzsrVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (zzaT() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        if (zzaT() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bb, code lost:
    
        if (zzaT() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzhr zzac(zzkh zzkhVar) {
        int i7;
        boolean z4 = true;
        this.zzac = true;
        zzz zzzVar = zzkhVar.zza;
        zzzVar.getClass();
        String str = zzzVar.zzo;
        if (str == null) {
            throw zzcW(new IllegalArgumentException("Sample MIME type is null."), zzzVar, false, 4005);
        }
        if (str.equals("video/av01") && !zzzVar.zzr.isEmpty()) {
            zzx zzb2 = zzzVar.zzb();
            zzb2.zzP(null);
            zzzVar = zzb2.zzaj();
        }
        zzz zzzVar2 = zzzVar;
        this.zzah = zzkhVar.zzb;
        this.zzm = zzzVar2;
        if (this.zzO) {
            this.zzQ = true;
            return null;
        }
        zzso zzsoVar = this.zzt;
        if (zzsoVar == null) {
            this.zzy = null;
            zzaC();
            return null;
        }
        zzsr zzsrVar = this.zzA;
        zzsrVar.getClass();
        zzz zzzVar3 = this.zzu;
        zzzVar3.getClass();
        zzrr zzrrVar = this.zzag;
        zzrr zzrrVar2 = this.zzah;
        if (zzrrVar != zzrrVar2) {
            zzae();
            return new zzhr(zzsrVar.zza, zzzVar3, zzzVar2, 0, 128);
        }
        boolean z7 = zzrrVar2 != zzrrVar;
        if (z7) {
            int i8 = zzen.zza;
        }
        zzhr zzab = zzab(zzsrVar, zzzVar3, zzzVar2);
        int i9 = zzab.zzd;
        if (i9 != 0) {
            i7 = 2;
            if (i9 == 1) {
                if (zzaY(zzzVar2)) {
                    this.zzu = zzzVar2;
                    if (!z7) {
                        if (this.zzV) {
                            this.zzT = 1;
                            if (this.zzD) {
                                this.zzU = 3;
                            } else {
                                this.zzU = 1;
                            }
                        }
                    }
                }
                i7 = 16;
            } else if (i9 != 2) {
                if (zzaY(zzzVar2)) {
                    this.zzu = zzzVar2;
                    if (z7) {
                    }
                }
                i7 = 16;
            } else {
                if (zzaY(zzzVar2)) {
                    this.zzR = true;
                    this.zzS = 1;
                    int i10 = this.zzB;
                    if (i10 != 2 && (i10 != 1 || zzzVar2.zzv != zzzVar3.zzv || zzzVar2.zzw != zzzVar3.zzw)) {
                        z4 = false;
                    }
                    this.zzE = z4;
                    this.zzu = zzzVar2;
                    if (z7) {
                    }
                }
                i7 = 16;
            }
            return (zzab.zzd != 0 || (this.zzt == zzsoVar && this.zzU != 3)) ? zzab : new zzhr(zzsrVar.zza, zzzVar3, zzzVar2, 0, i7);
        }
        zzae();
        i7 = 0;
        if (zzab.zzd != 0) {
        }
    }

    public abstract zzsl zzaf(zzsr zzsrVar, zzz zzzVar, MediaCrypto mediaCrypto, float f7);

    public abstract List zzag(zzta zztaVar, zzz zzzVar, boolean z4);

    public void zzaj(zzhg zzhgVar) {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzsl zzslVar, long j, long j3) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzz zzzVar, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() {
        throw null;
    }

    public abstract boolean zzar(long j, long j3, zzso zzsoVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, zzz zzzVar);

    public boolean zzas(zzz zzzVar) {
        return false;
    }

    public final float zzat() {
        return this.zzr;
    }

    public int zzau(zzhg zzhgVar) {
        return 0;
    }

    public final long zzav() {
        return this.zzad.zzd;
    }

    public final long zzaw() {
        return this.zzad.zzc;
    }

    public final zzll zzay() {
        return this.zzo;
    }

    public final zzso zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlp
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlh
    public void zzu(int i7, Object obj) {
        if (i7 == 11) {
            zzll zzllVar = (zzll) obj;
            zzllVar.getClass();
            this.zzo = zzllVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public void zzx() {
        this.zzm = null;
        zzaR(zzsw.zza);
        this.zzk.clear();
        zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public void zzy(boolean z4, boolean z7) {
        this.zza = new zzhq();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public void zzz(long j, boolean z4) {
        this.zzaa = false;
        this.zzab = false;
        if (this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        } else {
            zzaI();
        }
        zzej zzejVar = this.zzad.zze;
        if (zzejVar.zza() > 0) {
            this.zzac = true;
        }
        zzejVar.zze();
        this.zzk.clear();
    }
}
