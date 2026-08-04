package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
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
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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

    private final boolean zzaW(int i7) throws zzia {
        zzhg zzhgVar = this.zzf;
        zzkh zzkhVarZzk = zzk();
        zzhgVar.zzb();
        int iZzcU = zzcU(zzkhVarZzk, this.zzf, i7 | 4);
        if (iZzcU == -5) {
            zzac(zzkhVarZzk);
            return true;
        }
        if (iZzcU != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzaa = true;
        zzai();
        return false;
    }

    private final boolean zzaX(long j) {
        return this.zzq == -9223372036854775807L || zzi().zzb() - j < this.zzq;
    }

    private final boolean zzaY(zzz zzzVar) throws zzia {
        int i7 = zzen.zza;
        if (this.zzt != null && this.zzU != 3 && zzcT() != 0) {
            float f7 = this.zzs;
            zzzVar.getClass();
            float fZzZ = zzZ(f7, zzzVar, zzT());
            float f8 = this.zzx;
            if (f8 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f8 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zzso zzsoVar = this.zzt;
                    zzsoVar.getClass();
                    zzsoVar.zzq(bundle);
                    this.zzx = fZzZ;
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

    private final void zzae() throws zzia {
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

    private final void zzai() throws zzia {
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
    public void zzM(float f7, float f8) throws zzia {
        this.zzr = f7;
        this.zzs = f8;
        zzaY(this.zzu);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // com.google.android.gms.internal.ads.zzlm
    public void zzV(long r25, long r27) throws com.google.android.gms.internal.ads.zzia {
        /*
            Method dump skipped, instruction units count: 1634
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
    public final int zzY(zzz zzzVar) throws zzia {
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

    /* JADX WARN: Code duplicated, block: B:287:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:321:0x0540  */
    /* JADX WARN: Code duplicated, block: B:367:0x060e A[Catch: zzsu -> 0x0611, TryCatch #12 {zzsu -> 0x0611, blocks: (B:365:0x05f3, B:367:0x060e, B:371:0x0619, B:374:0x0620, B:375:0x0622, B:370:0x0613, B:377:0x0626, B:378:0x0627, B:381:0x0630, B:382:0x0631, B:383:0x063e, B:385:0x0642), top: B:411:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:370:0x0613 A[Catch: zzsu -> 0x0611, TryCatch #12 {zzsu -> 0x0611, blocks: (B:365:0x05f3, B:367:0x060e, B:371:0x0619, B:374:0x0620, B:375:0x0622, B:370:0x0613, B:377:0x0626, B:378:0x0627, B:381:0x0630, B:382:0x0631, B:383:0x063e, B:385:0x0642), top: B:411:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:373:0x061f  */
    /* JADX WARN: Code duplicated, block: B:429:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzsv] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzsy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.ads.zzz] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsx] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.google.android.gms.internal.ads.zzso] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.zzz] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void zzaC() throws zzia {
        zzz zzzVar;
        ?? r7;
        ?? r8;
        ?? r16;
        ?? Zzd;
        ?? r10;
        zzsu zzsuVar;
        zzsu zzsuVar2;
        ?? r19;
        ?? r20;
        ?? r17;
        ?? r9;
        ?? r21;
        ?? r110;
        ?? r18;
        ?? r11;
        String str;
        ?? r22;
        ?? r111;
        int i7;
        boolean z4;
        LogSessionId logSessionIdZza;
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
            zzz zzzVar2 = this.zzm;
            ?? r12 = 0;
            try {
                if (zzzVar2 == null) {
                    throw null;
                }
                if (this.zzy == null) {
                    try {
                        List listZzag = zzag(this.zzd, zzzVar2, false);
                        listZzag.isEmpty();
                        this.zzy = new ArrayDeque();
                        if (!listZzag.isEmpty()) {
                            this.zzy.add((zzsr) listZzag.get(0));
                        }
                        this.zzz = null;
                    } catch (zztf e7) {
                        throw new zzsu(zzzVar2, (Throwable) e7, false, -49998);
                    }
                }
                if (this.zzy.isEmpty()) {
                    throw new zzsu(zzzVar2, (Throwable) null, false, -49999);
                }
                ArrayDeque arrayDeque = this.zzy;
                if (arrayDeque == null) {
                    r8 = arrayDeque;
                    r7 = zzzVar2;
                    throw null;
                }
                while (true) {
                    r8 = arrayDeque;
                    r7 = zzzVar2;
                    if (this.zzt != null) {
                        this.zzy = r12;
                        return;
                    }
                    zzsr zzsrVar = (zzsr) r8.peekFirst();
                    if (zzsrVar == null) {
                        throw r12;
                    }
                    if (!zzaM(r7) || !zzaO(zzsrVar)) {
                        return;
                    }
                    try {
                        zzz zzzVar3 = this.zzm;
                        if (zzzVar3 == null) {
                            throw r12;
                        }
                        String str3 = zzsrVar.zza;
                        int i8 = zzen.zza;
                        float fZzZ = zzZ(this.zzs, zzzVar3, zzT());
                        r16 = -1082130432;
                        r16 = -1082130432;
                        if (fZzZ <= this.zze) {
                            fZzZ = -1.0f;
                        }
                        long jZzb = zzi().zzb();
                        zzsl zzslVarZzaf = zzaf(zzsrVar, zzzVar3, r12, fZzZ);
                        ?? zzsvVar = 31;
                        Zzd = Zzd;
                        if (zzen.zza >= 31) {
                            logSessionIdZza = zzo().zza();
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                Zzd = Zzd;
                                zzsvVar = logSessionIdZza;
                                MediaFormat mediaFormat = zzslVarZzaf.zzb;
                                String stringId = logSessionIdZza.getStringId();
                                mediaFormat.setString("log-session-id", stringId);
                                Zzd = "log-session-id";
                                zzsvVar = stringId;
                            }
                        }
                        try {
                            Zzd = Zzd;
                            zzsvVar = logSessionIdZza;
                            Trace.beginSection("createCodec:" + str3);
                            Zzd = this.zzc.zzd(zzslVarZzaf);
                            this.zzt = Zzd;
                            zzsvVar = new zzsv(this, r12);
                            Zzd.zzs(zzsvVar);
                            Trace.endSection();
                            long jZzb2 = zzi().zzb();
                            if (zzsrVar.zze(zzzVar3)) {
                                r111 = r8;
                                r22 = r7;
                                zzzVar = zzzVar;
                            } else {
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("id=");
                                    sb.append(zzzVar3.zza);
                                    sb.append(", mimeType=");
                                    sb.append(zzzVar3.zzo);
                                    if (zzzVar3.zzn != null) {
                                        try {
                                            sb.append(", container=");
                                            sb.append(zzzVar3.zzn);
                                        } catch (Exception e8) {
                                            e = e8;
                                            r18 = r8;
                                            r11 = r7;
                                            zzzVar = zzzVar;
                                            r10 = 0;
                                            Zzd = r11;
                                            r16 = r18;
                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                            r16.removeFirst();
                                            zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                            zzak(zzsuVar);
                                            zzsuVar2 = this.zzz;
                                            if (zzsuVar2 == null) {
                                                this.zzz = zzsuVar;
                                            } else {
                                                this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                            }
                                            if (!r16.isEmpty()) {
                                                throw this.zzz;
                                            }
                                            r7 = Zzd;
                                            r12 = r10;
                                            r8 = r16;
                                            zzzVar = zzzVar;
                                        }
                                    }
                                    if (zzzVar3.zzj != -1) {
                                        try {
                                            sb.append(", bitrate=");
                                            sb.append(zzzVar3.zzj);
                                        } catch (Exception e9) {
                                            e = e9;
                                            r17 = r8;
                                            zzsrVar = zzsrVar;
                                            r9 = r7;
                                            zzzVar = zzzVar;
                                            r10 = 0;
                                            Zzd = r9;
                                            r16 = r17;
                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                            r16.removeFirst();
                                            zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                            zzak(zzsuVar);
                                            zzsuVar2 = this.zzz;
                                            if (zzsuVar2 == null) {
                                                this.zzz = zzsuVar;
                                            } else {
                                                this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                            }
                                            if (!r16.isEmpty()) {
                                                throw this.zzz;
                                            }
                                        }
                                    }
                                    if (zzzVar3.zzk != null) {
                                        sb.append(", codecs=");
                                        sb.append(zzzVar3.zzk);
                                    }
                                    try {
                                        try {
                                            if (zzzVar3.zzs != null) {
                                                try {
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    r19 = r8;
                                                    int i9 = 0;
                                                    r7 = r7;
                                                    while (true) {
                                                        try {
                                                            zzs zzsVar = zzzVar3.zzs;
                                                            r20 = r7;
                                                            try {
                                                                if (i9 >= zzsVar.zzb) {
                                                                    break;
                                                                }
                                                                UUID uuid = zzsVar.zza(i9).zza;
                                                                try {
                                                                    if (uuid.equals(zzh.zzb)) {
                                                                        try {
                                                                            linkedHashSet.add("cenc");
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            zzzVar = zzzVar;
                                                                            r110 = r19;
                                                                            r21 = r20;
                                                                        }
                                                                    } else if (uuid.equals(zzh.zzc)) {
                                                                        linkedHashSet.add("clearkey");
                                                                    } else if (uuid.equals(zzh.zze)) {
                                                                        linkedHashSet.add("playready");
                                                                    } else if (uuid.equals(zzh.zzd)) {
                                                                        linkedHashSet.add("widevine");
                                                                    } else {
                                                                        if (uuid.equals(zzh.zza)) {
                                                                            linkedHashSet.add("universal");
                                                                        } else {
                                                                            String string = uuid.toString();
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("unknown (");
                                                                            sb2.append(string);
                                                                            sb2.append(")");
                                                                            linkedHashSet.add(sb2.toString());
                                                                        }
                                                                        i9++;
                                                                        r7 = r20;
                                                                        zzzVar = zzzVar;
                                                                    }
                                                                    i9++;
                                                                    r7 = r20;
                                                                    zzzVar = zzzVar;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                zzzVar = zzzVar;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            r20 = r7;
                                                            zzzVar = zzzVar;
                                                            r110 = r19;
                                                            r21 = r20;
                                                            r17 = r110;
                                                            r9 = r21;
                                                            r10 = 0;
                                                            Zzd = r9;
                                                            r16 = r17;
                                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                                            r16.removeFirst();
                                                            zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                                            zzak(zzsuVar);
                                                            zzsuVar2 = this.zzz;
                                                            if (zzsuVar2 == null) {
                                                                this.zzz = zzsuVar;
                                                            } else {
                                                                this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                                            }
                                                            if (!r16.isEmpty()) {
                                                                throw this.zzz;
                                                            }
                                                            r7 = Zzd;
                                                            r12 = r10;
                                                            r8 = r16;
                                                            zzzVar = zzzVar;
                                                        }
                                                        e = e11;
                                                        r110 = r19;
                                                        r21 = r20;
                                                        r17 = r110;
                                                        r9 = r21;
                                                        r10 = 0;
                                                        Zzd = r9;
                                                        r16 = r17;
                                                        zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                                        r16.removeFirst();
                                                        zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                                        zzak(zzsuVar);
                                                        zzsuVar2 = this.zzz;
                                                        if (zzsuVar2 == null) {
                                                            this.zzz = zzsuVar;
                                                        } else {
                                                            this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                                        }
                                                        if (!r16.isEmpty()) {
                                                            throw this.zzz;
                                                        }
                                                        r7 = Zzd;
                                                        r12 = r10;
                                                        r8 = r16;
                                                        zzzVar = zzzVar;
                                                    }
                                                    zzzVar = zzzVar;
                                                    sb.append(", drm=[");
                                                    zzfsz.zzb(sb, linkedHashSet, ",");
                                                    sb.append(']');
                                                    r19 = r19;
                                                    r20 = r20;
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r19 = r8;
                                                }
                                            } else {
                                                r19 = r8;
                                                r20 = r7;
                                                zzzVar = zzzVar;
                                            }
                                            if ((zzzVar3.zzf & 32768) != 0) {
                                                sb.append(", auxiliaryTrackType=");
                                                int i10 = zzzVar3.zzg;
                                                if (i10 == 0) {
                                                    str = "undefined";
                                                } else if (i10 == 1) {
                                                    str = "original";
                                                } else if (i10 == 2) {
                                                    str = "depth-linear";
                                                } else if (i10 == 3) {
                                                    str = "depth-inverse";
                                                } else {
                                                    if (i10 != 4) {
                                                        throw new IllegalStateException("Unsupported auxiliary track type");
                                                    }
                                                    str = "depth metadata";
                                                }
                                                sb.append(str);
                                            }
                                            String string2 = sb.toString();
                                            Locale locale = Locale.US;
                                            zzdq.zzf("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + string2 + ", " + str3 + "]");
                                            r111 = r19;
                                            r22 = r20;
                                        } catch (Exception e15) {
                                            e = e15;
                                            r110 = r19;
                                            r21 = r20;
                                            r17 = r110;
                                            r9 = r21;
                                            r10 = 0;
                                            Zzd = r9;
                                            r16 = r17;
                                            zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                            r16.removeFirst();
                                            zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                            zzak(zzsuVar);
                                            zzsuVar2 = this.zzz;
                                            if (zzsuVar2 == null) {
                                                this.zzz = zzsuVar;
                                            } else {
                                                this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                            }
                                            if (!r16.isEmpty()) {
                                                throw this.zzz;
                                            }
                                        }
                                        if (zzzVar3.zzv != -1 && zzzVar3.zzw != -1) {
                                            sb.append(", res=");
                                            sb.append(zzzVar3.zzv);
                                            sb.append("x");
                                            sb.append(zzzVar3.zzw);
                                        }
                                        double d7 = zzzVar3.zzz;
                                        int i11 = zzfza.zza;
                                        if (Math.copySign(d7 - 1.0d, 1.0d) > 0.001d && d7 != 1.0d && (!Double.isNaN(d7) || !Double.isNaN(1.0d))) {
                                            sb.append(", par=");
                                            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(zzzVar3.zzz)));
                                        }
                                        zzk zzkVar = zzzVar3.zzC;
                                        if (zzkVar != null && (zzkVar.zze() || zzkVar.zzf())) {
                                            sb.append(", color=");
                                            sb.append(zzzVar3.zzC.zzd());
                                        }
                                        if (zzzVar3.zzx != -1.0f) {
                                            sb.append(", fps=");
                                            sb.append(zzzVar3.zzx);
                                        }
                                        if (zzzVar3.zzD != -1) {
                                            sb.append(", maxSubLayers=");
                                            sb.append(zzzVar3.zzD);
                                        }
                                        if (zzzVar3.zzE != -1) {
                                            sb.append(", channels=");
                                            sb.append(zzzVar3.zzE);
                                        }
                                        if (zzzVar3.zzF != -1) {
                                            sb.append(", sample_rate=");
                                            sb.append(zzzVar3.zzF);
                                        }
                                        if (zzzVar3.zzd != null) {
                                            sb.append(", language=");
                                            sb.append(zzzVar3.zzd);
                                        }
                                        if (!zzzVar3.zzc.isEmpty()) {
                                            sb.append(", labels=[");
                                            zzfsz.zzb(sb, zzfwx.zzb(zzzVar3.zzc, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzw
                                                @Override // com.google.android.gms.internal.ads.zzfsw
                                                public final Object apply(Object obj) {
                                                    zzab zzabVar = (zzab) obj;
                                                    int i12 = zzz.zzM;
                                                    return k.f(zzabVar.zza, ": ", zzabVar.zzb);
                                                }
                                            }), ",");
                                            sb.append("]");
                                        }
                                        if (zzzVar3.zze != 0) {
                                            sb.append(", selectionFlags=[");
                                            int i12 = zzzVar3.zze;
                                            ArrayList arrayList = new ArrayList();
                                            if ((i12 & 1) != 0) {
                                                arrayList.add("default");
                                            }
                                            if ((i12 & 2) != 0) {
                                                arrayList.add("forced");
                                            }
                                            zzfsz.zzb(sb, arrayList, ",");
                                            sb.append("]");
                                        }
                                        if (zzzVar3.zzf != 0) {
                                            try {
                                                sb.append(", roleFlags=[");
                                                int i13 = zzzVar3.zzf;
                                                ArrayList arrayList2 = new ArrayList();
                                                if ((i13 & 1) != 0) {
                                                    arrayList2.add(SentryThread.JsonKeys.MAIN);
                                                }
                                                if ((i13 & 2) != 0) {
                                                    arrayList2.add("alt");
                                                }
                                                if ((i13 & 4) != 0) {
                                                    arrayList2.add("supplementary");
                                                }
                                                if ((i13 & 8) != 0) {
                                                    arrayList2.add("commentary");
                                                }
                                                if ((i13 & 16) != 0) {
                                                    arrayList2.add("dub");
                                                }
                                                if ((i13 & 32) != 0) {
                                                    arrayList2.add("emergency");
                                                }
                                                if ((i13 & 64) != 0) {
                                                    arrayList2.add("caption");
                                                }
                                                if ((i13 & 128) != 0) {
                                                    arrayList2.add("subtitle");
                                                }
                                                if ((i13 & 256) != 0) {
                                                    arrayList2.add("sign");
                                                }
                                                if ((i13 & 512) != 0) {
                                                    arrayList2.add("describes-video");
                                                }
                                                if ((i13 & 1024) != 0) {
                                                    arrayList2.add("describes-music");
                                                }
                                                if ((i13 & 2048) != 0) {
                                                    arrayList2.add("enhanced-intelligibility");
                                                }
                                                if ((i13 & 4096) != 0) {
                                                    arrayList2.add("transcribes-dialog");
                                                }
                                                if ((i13 & 8192) != 0) {
                                                    arrayList2.add("easy-read");
                                                }
                                                if ((i13 & 16384) != 0) {
                                                    arrayList2.add("trick-play");
                                                }
                                                if ((i13 & 32768) != 0) {
                                                    arrayList2.add("auxiliary");
                                                }
                                                zzfsz.zzb(sb, arrayList2, ",");
                                                sb.append("]");
                                            } catch (Exception e16) {
                                                e = e16;
                                            }
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        r110 = r19;
                                        r21 = r20;
                                        r17 = r110;
                                        r9 = r21;
                                        r10 = 0;
                                        Zzd = r9;
                                        r16 = r17;
                                        zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                        r16.removeFirst();
                                        zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                        zzak(zzsuVar);
                                        zzsuVar2 = this.zzz;
                                        if (zzsuVar2 == null) {
                                            this.zzz = zzsuVar;
                                        } else {
                                            this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                        }
                                        if (!r16.isEmpty()) {
                                            throw this.zzz;
                                        }
                                        r7 = Zzd;
                                        r12 = r10;
                                        r8 = r16;
                                        zzzVar = zzzVar;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    r19 = r8;
                                    r20 = r7;
                                    zzzVar = zzzVar;
                                }
                            }
                            this.zzA = zzsrVar;
                            this.zzx = fZzZ;
                            this.zzu = zzzVar3;
                            int i14 = zzen.zza;
                            if (i14 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                                String str4 = Build.MODEL;
                                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                                    i7 = 2;
                                } else if (i14 < 24) {
                                    i7 = 0;
                                } else {
                                    i7 = 0;
                                }
                            } else if (i14 < 24 || !("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                                i7 = 0;
                            } else {
                                String str5 = Build.DEVICE;
                                if ("flounder".equals(str5) || "flounder_lte".equals(str5) || "grouper".equals(str5) || "tilapia".equals(str5)) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                            }
                            this.zzB = i7;
                            this.zzC = i14 == 29 && "c2.android.aac.decoder".equals(str3);
                            this.zzD = i14 <= 23 && "OMX.google.vorbis.decoder".equals(str3);
                            String str6 = zzsrVar.zza;
                            if (i14 <= 25 && "OMX.rk.video_decoder.avc".equals(str6)) {
                                z4 = true;
                            } else if ((i14 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzsrVar.zzf)) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            this.zzG = z4;
                            if (this.zzt == null) {
                                throw null;
                            }
                            if (zzcT() == 2) {
                                this.zzI = zzi().zzb() + 1000;
                            }
                            try {
                                this.zza.zza++;
                                long j = jZzb2 - jZzb;
                                r16 = r111;
                                zzsrVar = zzsrVar;
                                Zzd = r22;
                                zzsvVar = 0;
                                r10 = 0;
                                try {
                                    zzal(str3, zzslVarZzaf, jZzb2, j);
                                } catch (Exception e19) {
                                    e = e19;
                                    Zzd = Zzd;
                                    r10 = zzsvVar;
                                    r16 = r16;
                                    zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                    r16.removeFirst();
                                    zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                    zzak(zzsuVar);
                                    zzsuVar2 = this.zzz;
                                    if (zzsuVar2 == null) {
                                        this.zzz = zzsuVar;
                                    } else {
                                        this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                    }
                                    if (!r16.isEmpty()) {
                                        throw this.zzz;
                                    }
                                }
                            } catch (Exception e20) {
                                e = e20;
                                r18 = r111;
                                r11 = r22;
                                r10 = 0;
                                Zzd = r11;
                                r16 = r18;
                                zzdq.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsrVar.zza), e);
                                r16.removeFirst();
                                zzsuVar = new zzsu((zzz) Zzd, (Throwable) e, false, zzsrVar);
                                zzak(zzsuVar);
                                zzsuVar2 = this.zzz;
                                if (zzsuVar2 == null) {
                                    this.zzz = zzsuVar;
                                } else {
                                    this.zzz = zzsu.zza(zzsuVar2, zzsuVar);
                                }
                                if (!r16.isEmpty()) {
                                    throw this.zzz;
                                }
                            }
                            r7 = Zzd;
                            r12 = r10;
                            r8 = r16;
                            zzzVar = zzzVar;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Exception e21) {
                        e = e21;
                        r16 = r8;
                        zzsrVar = zzsrVar;
                        Zzd = r7;
                        r10 = r12;
                        zzzVar = zzzVar;
                    }
                }
            } catch (zzsu e22) {
                e = e22;
            }
        } catch (zzsu e23) {
            e = e23;
        }
        throw zzcW(e, zzzVar, false, 4001);
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

    public final boolean zzaI() throws zzia {
        boolean zZzaJ = zzaJ();
        if (zZzaJ) {
            zzaC();
        }
        return zZzaJ;
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

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    public zzhr zzac(zzkh zzkhVar) {
        int i7;
        boolean z4 = true;
        this.zzac = true;
        zzz zzzVarZzaj = zzkhVar.zza;
        zzzVarZzaj.getClass();
        String str = zzzVarZzaj.zzo;
        if (str == null) {
            throw zzcW(new IllegalArgumentException("Sample MIME type is null."), zzzVarZzaj, false, 4005);
        }
        if (str.equals("video/av01") && !zzzVarZzaj.zzr.isEmpty()) {
            zzx zzxVarZzb = zzzVarZzaj.zzb();
            zzxVarZzb.zzP(null);
            zzzVarZzaj = zzxVarZzb.zzaj();
        }
        zzz zzzVar = zzzVarZzaj;
        this.zzah = zzkhVar.zzb;
        this.zzm = zzzVar;
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
        zzz zzzVar2 = this.zzu;
        zzzVar2.getClass();
        zzrr zzrrVar = this.zzag;
        zzrr zzrrVar2 = this.zzah;
        if (zzrrVar != zzrrVar2) {
            zzae();
            return new zzhr(zzsrVar.zza, zzzVar2, zzzVar, 0, 128);
        }
        boolean z7 = zzrrVar2 != zzrrVar;
        if (z7) {
            int i8 = zzen.zza;
        }
        zzhr zzhrVarZzab = zzab(zzsrVar, zzzVar2, zzzVar);
        int i9 = zzhrVarZzab.zzd;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (zzaY(zzzVar)) {
                        this.zzu = zzzVar;
                        if (!z7 || zzaT()) {
                        }
                    } else {
                        i7 = 16;
                    }
                } else if (zzaY(zzzVar)) {
                    this.zzR = true;
                    this.zzS = 1;
                    int i10 = this.zzB;
                    if (i10 != 2 && (i10 != 1 || zzzVar.zzv != zzzVar2.zzv || zzzVar.zzw != zzzVar2.zzw)) {
                        z4 = false;
                    }
                    this.zzE = z4;
                    this.zzu = zzzVar;
                    if (!z7 || zzaT()) {
                    }
                } else {
                    i7 = 16;
                }
            } else if (zzaY(zzzVar)) {
                this.zzu = zzzVar;
                if (z7) {
                    if (zzaT()) {
                    }
                } else if (this.zzV) {
                    this.zzT = 1;
                    if (this.zzD) {
                        this.zzU = 3;
                    } else {
                        this.zzU = 1;
                    }
                }
            } else {
                i7 = 16;
            }
            return (zzhrVarZzab.zzd != 0 || (this.zzt == zzsoVar && this.zzU != 3)) ? zzhrVarZzab : new zzhr(zzsrVar.zza, zzzVar2, zzzVar, 0, i7);
        }
        zzae();
        i7 = 0;
        if (zzhrVarZzab.zzd != 0) {
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
