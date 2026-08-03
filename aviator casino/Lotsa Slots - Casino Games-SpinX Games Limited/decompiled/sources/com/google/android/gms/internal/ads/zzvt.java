package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzvt extends com.google.android.gms.internal.ads.zzix {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, com.google.common.base.Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, com.google.common.base.Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, com.google.common.base.Ascii.CR, -50, 113, com.google.common.base.Ascii.CAN, -96, 0, 47, -65, com.google.common.base.Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private java.util.ArrayDeque zzC;
    private com.google.android.gms.internal.ads.zzvp zzD;
    private com.google.android.gms.internal.ads.zzvm zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private java.nio.ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected com.google.android.gms.internal.ads.zzjb zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private com.google.android.gms.internal.ads.zzvs zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private com.google.android.gms.internal.ads.zziz zzan;
    private com.google.android.gms.internal.ads.zziz zzao;
    private com.google.android.gms.internal.ads.zzgww zzap;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzvh zzd;
    private final com.google.android.gms.internal.ads.zzvv zze;
    private final float zzf;
    private final com.google.android.gms.internal.ads.zziv zzg;
    private final com.google.android.gms.internal.ads.zziv zzh;
    private final com.google.android.gms.internal.ads.zziv zzi;
    private final com.google.android.gms.internal.ads.zzva zzj;
    private final android.media.MediaCodec.BufferInfo zzk;
    private final java.util.ArrayDeque zzl;
    private final com.google.android.gms.internal.ads.zzty zzm;
    private final java.util.concurrent.atomic.AtomicInteger zzn;
    private com.google.android.gms.internal.ads.zzv zzo;
    private com.google.android.gms.internal.ads.zzv zzp;
    private com.google.android.gms.internal.ads.zzug zzq;
    private com.google.android.gms.internal.ads.zzug zzr;
    private com.google.android.gms.internal.ads.zzmz zzs;
    private android.media.MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private com.google.android.gms.internal.ads.zzvj zzx;
    private com.google.android.gms.internal.ads.zzv zzy;
    private android.media.MediaFormat zzz;

    public zzvt(android.content.Context context, int i, com.google.android.gms.internal.ads.zzvh zzvhVar, com.google.android.gms.internal.ads.zzvv zzvvVar, boolean z, float f) {
        super(i);
        this.zzc = context.getApplicationContext();
        this.zzd = zzvhVar;
        zzvvVar.getClass();
        this.zze = zzvvVar;
        this.zzf = f;
        this.zzn = new java.util.concurrent.atomic.AtomicInteger();
        this.zzg = new com.google.android.gms.internal.ads.zziv(0, 0);
        this.zzh = new com.google.android.gms.internal.ads.zziv(0, 0);
        this.zzi = new com.google.android.gms.internal.ads.zziv(2, 0);
        com.google.android.gms.internal.ads.zzva zzvaVar = new com.google.android.gms.internal.ads.zzva();
        this.zzj = zzvaVar;
        this.zzk = new android.media.MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = -9223372036854775807L;
        this.zzl = new java.util.ArrayDeque();
        this.zzah = com.google.android.gms.internal.ads.zzvs.zza;
        zzvaVar.zzj(0);
        zzvaVar.zzc.order(java.nio.ByteOrder.nativeOrder());
        this.zzm = new com.google.android.gms.internal.ads.zzty();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzY = 0;
        this.zzZ = 0;
        this.zza = new com.google.android.gms.internal.ads.zzjb();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = com.google.android.gms.internal.ads.zzgww.zzh();
        com.google.android.gms.internal.ads.zziz zzizVar = com.google.android.gms.internal.ads.zziz.zza;
        this.zzan = zzizVar;
        this.zzao = zzizVar;
    }

    private final boolean zzaA(int i) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzlw zzI = zzI();
        com.google.android.gms.internal.ads.zziv zzivVar = this.zzg;
        zzivVar.zza();
        int zzQ = zzQ(zzI, zzivVar, i | 4);
        if (zzQ == -5) {
            zzao(zzI);
            return true;
        }
        if (zzQ != -4 || !zzivVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbr();
        return false;
    }

    private final boolean zzaB(long j) {
        return this.zzu == -9223372036854775807L || zzM().zzb() - j < this.zzu;
    }

    private final boolean zzaC() {
        return this.zzP >= 0;
    }

    private final void zzaq() {
        this.zzT = false;
        zzaw();
    }

    private final void zzaw() {
        zzaz();
        this.zzV = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzU = false;
        this.zzm.zzb();
    }

    private final boolean zzax() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaO()) {
            zzaM();
            return true;
        }
        if (zzaP()) {
            zzay();
            return false;
        }
        this.zzal = true;
        return false;
    }

    private final void zzay() {
        try {
            com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzx;
            zzvjVar.getClass();
            com.google.android.gms.internal.ads.zzvj zzvjVar2 = zzvjVar;
            zzvjVar.zzk();
        } finally {
            zzaR();
        }
    }

    private final void zzaz() {
        this.zzad = -9223372036854775807L;
        zzbt().zzf = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
    }

    protected static boolean zzbj(com.google.android.gms.internal.ads.zzv zzvVar) {
        return zzvVar.zzO == 0;
    }

    private final void zzbm() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbn() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbo(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        if (this.zzx != null && this.zzZ != 3 && zze() != 0) {
            float f = this.zzw;
            zzvVar.getClass();
            float zzak = zzak(f, zzvVar, zzJ());
            float f2 = this.zzB;
            if (f2 != zzak) {
                if (zzak == -1.0f) {
                    zzbq();
                    return false;
                }
                if (f2 != -1.0f || zzak > this.zzf) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putFloat("operating-rate", zzak);
                    com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzx;
                    zzvjVar.getClass();
                    zzvjVar.zzp(bundle);
                    this.zzB = zzak;
                }
            }
        }
        return true;
    }

    private final boolean zzbp() throws com.google.android.gms.internal.ads.zzjk {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzH) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzbu();
        }
        return true;
    }

    private final void zzbq() throws com.google.android.gms.internal.ads.zzjk {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbs(com.google.android.gms.internal.ads.zzvs zzvsVar) {
        this.zzah = zzvsVar;
        if (zzvsVar.zzd != -9223372036854775807L) {
            this.zzaj = true;
        }
    }

    private final com.google.android.gms.internal.ads.zzvs zzbt() {
        java.util.ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (com.google.android.gms.internal.ads.zzvs) arrayDeque.getLast() : this.zzah;
    }

    private final boolean zzbv(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzp;
        return (zzvVar != null && java.util.Objects.equals(zzvVar.zzp, "audio/opus") && com.google.android.gms.internal.ads.zzgv.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzA(long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        java.util.ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (com.google.android.gms.internal.ads.zzvs) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzT) {
                zzaw();
            } else {
                zzaN();
            }
            com.google.android.gms.internal.ads.zzfh zzfhVar = this.zzah.zze;
            if (zzfhVar.zzc() > 0) {
                this.zzag = true;
            }
            zzfhVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzD() {
        this.zzo = null;
        zzbs(com.google.android.gms.internal.ads.zzvs.zza);
        this.zzl.clear();
        if (this.zzT) {
            zzaq();
        } else {
            zzax();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzE() {
        try {
            zzaq();
            zzaM();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final long zzV(long j, long j2) {
        return zzaj(j, j2, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public void zzX(float f, float f2) throws com.google.android.gms.internal.ads.zzjk {
        this.zzv = f;
        this.zzw = f2;
        zzbo(this.zzy);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzna
    public void zzZ(long r29, long r31) throws com.google.android.gms.internal.ads.zzjk {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzZ(long, long):void");
    }

    public final void zzaD() {
        this.zzak = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:41|42|43|44|(1:46)|47|48|(3:159|160|(30:162|163|164|165|51|52|53|(1:55)|56|(2:126|(1:141)(1:140))(1:68)|69|(1:125)(1:73)|74|(1:124)(1:78)|79|(14:81|(1:83)|84|85|86|87|(1:89)|90|(3:94|95|96)|97|98|99|100|101)|102|(12:123|85|86|87|(0)|90|(4:92|94|95|96)|97|98|99|100|101)|84|85|86|87|(0)|90|(0)|97|98|99|100|101))|50|51|52|53|(0)|56|(1:58)|126|(2:128|130)|141|69|(1:71)|125|74|(1:76)|124|79|(0)|102|(6:104|106|108|110|112|114)|116|123|85|86|87|(0)|90|(0)|97|98|99|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f0 A[Catch: zzvp -> 0x0317, TryCatch #1 {zzvp -> 0x0317, blocks: (B:25:0x0055, B:27:0x005c, B:183:0x0064, B:185:0x007a, B:186:0x0085, B:30:0x0092, B:32:0x009a, B:34:0x009f, B:35:0x00a2, B:37:0x00a6, B:39:0x00b0, B:149:0x02d7, B:151:0x02f0, B:152:0x02f9, B:155:0x0305, B:156:0x0307, B:158:0x02f3, B:178:0x0308, B:180:0x030c, B:181:0x0316, B:189:0x0089, B:190:0x0091), top: B:24:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f3 A[Catch: zzvp -> 0x0317, TryCatch #1 {zzvp -> 0x0317, blocks: (B:25:0x0055, B:27:0x005c, B:183:0x0064, B:185:0x007a, B:186:0x0085, B:30:0x0092, B:32:0x009a, B:34:0x009f, B:35:0x00a2, B:37:0x00a6, B:39:0x00b0, B:149:0x02d7, B:151:0x02f0, B:152:0x02f9, B:155:0x0305, B:156:0x0307, B:158:0x02f3, B:178:0x0308, B:180:0x030c, B:181:0x0316, B:189:0x0089, B:190:0x0091), top: B:24:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[Catch: Exception -> 0x010c, TryCatch #2 {Exception -> 0x010c, blocks: (B:165:0x0102, B:53:0x0144, B:55:0x0158, B:56:0x0172, B:58:0x017c, B:60:0x0184, B:62:0x018e, B:64:0x0198, B:66:0x01a2, B:69:0x01ef, B:71:0x01f7, B:74:0x0202, B:76:0x020a, B:79:0x0215, B:81:0x021d, B:85:0x0276, B:87:0x027d, B:89:0x0285, B:90:0x0293, B:92:0x02a3, B:94:0x02ab, B:96:0x02b0, B:102:0x0228, B:104:0x022c, B:106:0x0234, B:108:0x023c, B:110:0x0244, B:112:0x024c, B:114:0x0254, B:116:0x025c, B:118:0x0266, B:120:0x0270, B:126:0x01ae, B:128:0x01b4, B:130:0x01bc, B:132:0x01c4, B:134:0x01ce, B:136:0x01d8, B:138:0x01e2), top: B:164:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021d A[Catch: Exception -> 0x010c, TryCatch #2 {Exception -> 0x010c, blocks: (B:165:0x0102, B:53:0x0144, B:55:0x0158, B:56:0x0172, B:58:0x017c, B:60:0x0184, B:62:0x018e, B:64:0x0198, B:66:0x01a2, B:69:0x01ef, B:71:0x01f7, B:74:0x0202, B:76:0x020a, B:79:0x0215, B:81:0x021d, B:85:0x0276, B:87:0x027d, B:89:0x0285, B:90:0x0293, B:92:0x02a3, B:94:0x02ab, B:96:0x02b0, B:102:0x0228, B:104:0x022c, B:106:0x0234, B:108:0x023c, B:110:0x0244, B:112:0x024c, B:114:0x0254, B:116:0x025c, B:118:0x0266, B:120:0x0270, B:126:0x01ae, B:128:0x01b4, B:130:0x01bc, B:132:0x01c4, B:134:0x01ce, B:136:0x01d8, B:138:0x01e2), top: B:164:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0285 A[Catch: Exception -> 0x010c, TryCatch #2 {Exception -> 0x010c, blocks: (B:165:0x0102, B:53:0x0144, B:55:0x0158, B:56:0x0172, B:58:0x017c, B:60:0x0184, B:62:0x018e, B:64:0x0198, B:66:0x01a2, B:69:0x01ef, B:71:0x01f7, B:74:0x0202, B:76:0x020a, B:79:0x0215, B:81:0x021d, B:85:0x0276, B:87:0x027d, B:89:0x0285, B:90:0x0293, B:92:0x02a3, B:94:0x02ab, B:96:0x02b0, B:102:0x0228, B:104:0x022c, B:106:0x0234, B:108:0x023c, B:110:0x0244, B:112:0x024c, B:114:0x0254, B:116:0x025c, B:118:0x0266, B:120:0x0270, B:126:0x01ae, B:128:0x01b4, B:130:0x01bc, B:132:0x01c4, B:134:0x01ce, B:136:0x01d8, B:138:0x01e2), top: B:164:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3 A[Catch: Exception -> 0x010c, TryCatch #2 {Exception -> 0x010c, blocks: (B:165:0x0102, B:53:0x0144, B:55:0x0158, B:56:0x0172, B:58:0x017c, B:60:0x0184, B:62:0x018e, B:64:0x0198, B:66:0x01a2, B:69:0x01ef, B:71:0x01f7, B:74:0x0202, B:76:0x020a, B:79:0x0215, B:81:0x021d, B:85:0x0276, B:87:0x027d, B:89:0x0285, B:90:0x0293, B:92:0x02a3, B:94:0x02ab, B:96:0x02b0, B:102:0x0228, B:104:0x022c, B:106:0x0234, B:108:0x023c, B:110:0x0244, B:112:0x024c, B:114:0x0254, B:116:0x025c, B:118:0x0266, B:120:0x0270, B:126:0x01ae, B:128:0x01b4, B:130:0x01bc, B:132:0x01c4, B:134:0x01ce, B:136:0x01d8, B:138:0x01e2), top: B:164:0x0102 }] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.zzvh] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzvg] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.media.metrics.LogSessionId] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6, types: [android.media.MediaFormat] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzvt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaE() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzv zzvVar;
        ?? r11;
        com.google.android.gms.internal.ads.zzvm zzvmVar;
        com.google.android.gms.internal.ads.zzv zzvVar2;
        java.lang.String str;
        float zzak;
        long zzb2;
        ?? r12;
        java.util.ArrayDeque arrayDeque;
        ?? zza;
        boolean equals;
        java.lang.String str2;
        boolean z;
        com.google.android.gms.internal.ads.zzvm zzvmVar2;
        if (this.zzx != null || this.zzT || (zzvVar = this.zzo) == null) {
            return;
        }
        if (zzaF(zzvVar)) {
            zzaq();
            java.lang.String str3 = zzvVar.zzp;
            if ("audio/mp4a-latm".equals(str3) || "audio/mpeg".equals(str3) || "audio/opus".equals(str3)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzT = true;
            return;
        }
        com.google.android.gms.internal.ads.zzug zzugVar = this.zzr;
        this.zzq = zzugVar;
        if (zzugVar != null) {
            com.google.android.gms.internal.ads.zzgtj.zzi(true);
            this.zzq.zza();
        }
        try {
            com.google.android.gms.internal.ads.zzv zzvVar3 = this.zzo;
            zzvVar3.getClass();
            com.google.android.gms.internal.ads.zzv zzvVar4 = zzvVar3;
            android.media.MediaCrypto mediaCrypto = null;
            if (this.zzC == null) {
                try {
                    java.util.List zzaf = zzaf(this.zze, zzvVar3, false);
                    zzaf.isEmpty();
                    this.zzC = new java.util.ArrayDeque();
                    if (!zzaf.isEmpty()) {
                        this.zzC.add((com.google.android.gms.internal.ads.zzvm) zzaf.get(0));
                    }
                    this.zzD = null;
                } catch (com.google.android.gms.internal.ads.zzvx e) {
                    throw new com.google.android.gms.internal.ads.zzvp(zzvVar3, (java.lang.Throwable) e, false, -49998);
                }
            }
            if (this.zzC.isEmpty()) {
                throw new com.google.android.gms.internal.ads.zzvp(zzvVar3, (java.lang.Throwable) null, false, -49999);
            }
            java.util.ArrayDeque arrayDeque2 = this.zzC;
            arrayDeque2.getClass();
            java.util.ArrayDeque arrayDeque3 = arrayDeque2;
            while (this.zzx == null) {
                com.google.android.gms.internal.ads.zzvm zzvmVar3 = (com.google.android.gms.internal.ads.zzvm) arrayDeque2.peekFirst();
                zzvmVar3.getClass();
                com.google.android.gms.internal.ads.zzvm zzvmVar4 = zzvmVar3;
                zzaU(zzvVar3);
                if (!zzaG(zzvmVar3)) {
                    return;
                }
                try {
                    this.zzE = zzvmVar3;
                    zzvVar2 = this.zzo;
                    zzvVar2.getClass();
                    com.google.android.gms.internal.ads.zzv zzvVar5 = zzvVar2;
                    str = zzvmVar3.zza;
                    zzak = zzak(this.zzw, zzvVar2, zzJ());
                    if (zzak <= this.zzf) {
                        zzak = -1.0f;
                    }
                    zzb2 = zzM().zzb();
                    r11 = zzah(zzvmVar3, zzvVar2, mediaCrypto, zzak);
                    r12 = android.os.Build.VERSION.SDK_INT;
                    zzvmVar2 = r12;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    r11 = arrayDeque2;
                    zzvmVar = zzvmVar3;
                }
                try {
                    if (r12 >= 31) {
                        try {
                            zza = zzL().zza();
                            equals = zza.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);
                            zzvmVar2 = zza;
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            arrayDeque = arrayDeque2;
                        }
                        if (!equals) {
                            ?? r15 = r11.zzb;
                            arrayDeque = arrayDeque2;
                            try {
                                ?? stringId = zza.getStringId();
                                r15.setString("log-session-id", stringId);
                                zzvmVar = stringId;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 12);
                                sb.append("createCodec:");
                                sb.append(str);
                                android.os.Trace.beginSection(sb.toString());
                                com.google.android.gms.internal.ads.zzvj zzc = this.zzd.zzc(r11);
                                this.zzx = zzc;
                                zzvmVar = null;
                                this.zzM = zzc.zzm(new com.google.android.gms.internal.ads.zzvr(this, null));
                                android.os.Trace.endSection();
                                long zzb3 = zzM().zzb();
                                if (!zzvmVar3.zzc(this.zzc, zzvVar2)) {
                                    java.lang.Object[] objArr = {com.google.android.gms.internal.ads.zzv.zze(zzvVar2), str};
                                    java.lang.String str4 = com.google.android.gms.internal.ads.zzfl.zza;
                                    com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecRenderer", java.lang.String.format(java.util.Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                }
                                this.zzB = zzak;
                                this.zzy = zzvVar2;
                                this.zzF = (android.os.Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (android.os.Build.MODEL.startsWith("SM-T585") || android.os.Build.MODEL.startsWith("SM-A510") || android.os.Build.MODEL.startsWith("SM-A520") || android.os.Build.MODEL.startsWith("SM-J700"))) ? 2 : (android.os.Build.VERSION.SDK_INT < 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(android.os.Build.DEVICE) || "flounder_lte".equals(android.os.Build.DEVICE) || "grouper".equals(android.os.Build.DEVICE) || "tilapia".equals(android.os.Build.DEVICE)))) ? 0 : 1;
                                this.zzG = android.os.Build.VERSION.SDK_INT != 29 && "c2.android.aac.decoder".equals(str);
                                this.zzH = android.os.Build.VERSION.SDK_INT != 23 && "OMX.google.vorbis.decoder".equals(str);
                                str2 = zzvmVar3.zza;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                zzvmVar = zzvmVar3;
                                r11 = arrayDeque;
                                com.google.android.gms.internal.ads.zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzvmVar.zza), e);
                                r11.removeFirst();
                                com.google.android.gms.internal.ads.zzvp zzvpVar = new com.google.android.gms.internal.ads.zzvp(zzvVar3, (java.lang.Throwable) e, false, zzvmVar);
                                zzan(zzvpVar);
                                com.google.android.gms.internal.ads.zzvp zzvpVar2 = this.zzD;
                                if (zzvpVar2 != null) {
                                    this.zzD = zzvpVar;
                                } else {
                                    this.zzD = zzvpVar2.zza(zzvpVar);
                                }
                                if (!r11.isEmpty()) {
                                    throw this.zzD;
                                }
                                arrayDeque2 = r11;
                                mediaCrypto = null;
                            }
                            if (android.os.Build.VERSION.SDK_INT <= 25) {
                                if ("OMX.rk.video_decoder.avc".equals(str2)) {
                                }
                                z = true;
                                this.zzK = z;
                                com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzx;
                                zzvjVar.getClass();
                                com.google.android.gms.internal.ads.zzvj zzvjVar2 = zzvjVar;
                                if (zze() == 2) {
                                    this.zzN = zzM().zzb() + 1000;
                                }
                                this.zza.zza++;
                                long j = zzb3 - zzb2;
                                if (android.os.Build.VERSION.SDK_INT >= 31 && !this.zzap.isEmpty()) {
                                    com.google.android.gms.internal.ads.zzvj zzvjVar3 = this.zzx;
                                    zzvjVar3.getClass();
                                    com.google.android.gms.internal.ads.zzvj zzvjVar4 = zzvjVar3;
                                    zzvjVar3.zzr(new java.util.ArrayList(this.zzap));
                                }
                                zzvmVar = zzvmVar3;
                                r11 = arrayDeque;
                                zzal(str, r11, zzb3, j);
                                arrayDeque2 = r11;
                                mediaCrypto = null;
                            }
                            if ((android.os.Build.VERSION.SDK_INT <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str2) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.avc.tunnel".equals(str2) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel".equals(str2) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) && (!"Amazon".equals(android.os.Build.MANUFACTURER) || !"AFTS".equals(android.os.Build.MODEL) || !zzvmVar3.zzf)) {
                                z = false;
                                this.zzK = z;
                                com.google.android.gms.internal.ads.zzvj zzvjVar5 = this.zzx;
                                zzvjVar5.getClass();
                                com.google.android.gms.internal.ads.zzvj zzvjVar22 = zzvjVar5;
                                if (zze() == 2) {
                                }
                                this.zza.zza++;
                                long j2 = zzb3 - zzb2;
                                if (android.os.Build.VERSION.SDK_INT >= 31) {
                                    com.google.android.gms.internal.ads.zzvj zzvjVar32 = this.zzx;
                                    zzvjVar32.getClass();
                                    com.google.android.gms.internal.ads.zzvj zzvjVar42 = zzvjVar32;
                                    zzvjVar32.zzr(new java.util.ArrayList(this.zzap));
                                }
                                zzvmVar = zzvmVar3;
                                r11 = arrayDeque;
                                zzal(str, r11, zzb3, j2);
                                arrayDeque2 = r11;
                                mediaCrypto = null;
                            }
                            z = true;
                            this.zzK = z;
                            com.google.android.gms.internal.ads.zzvj zzvjVar52 = this.zzx;
                            zzvjVar52.getClass();
                            com.google.android.gms.internal.ads.zzvj zzvjVar222 = zzvjVar52;
                            if (zze() == 2) {
                            }
                            this.zza.zza++;
                            long j22 = zzb3 - zzb2;
                            if (android.os.Build.VERSION.SDK_INT >= 31) {
                            }
                            zzvmVar = zzvmVar3;
                            r11 = arrayDeque;
                            zzal(str, r11, zzb3, j22);
                            arrayDeque2 = r11;
                            mediaCrypto = null;
                        }
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 12);
                    sb2.append("createCodec:");
                    sb2.append(str);
                    android.os.Trace.beginSection(sb2.toString());
                    com.google.android.gms.internal.ads.zzvj zzc2 = this.zzd.zzc(r11);
                    this.zzx = zzc2;
                    zzvmVar = null;
                    this.zzM = zzc2.zzm(new com.google.android.gms.internal.ads.zzvr(this, null));
                    android.os.Trace.endSection();
                    long zzb32 = zzM().zzb();
                    if (!zzvmVar3.zzc(this.zzc, zzvVar2)) {
                    }
                    this.zzB = zzak;
                    this.zzy = zzvVar2;
                    this.zzF = (android.os.Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (android.os.Build.MODEL.startsWith("SM-T585") || android.os.Build.MODEL.startsWith("SM-A510") || android.os.Build.MODEL.startsWith("SM-A520") || android.os.Build.MODEL.startsWith("SM-J700"))) ? 2 : (android.os.Build.VERSION.SDK_INT < 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(android.os.Build.DEVICE) || "flounder_lte".equals(android.os.Build.DEVICE) || "grouper".equals(android.os.Build.DEVICE) || "tilapia".equals(android.os.Build.DEVICE)))) ? 0 : 1;
                    this.zzG = android.os.Build.VERSION.SDK_INT != 29 && "c2.android.aac.decoder".equals(str);
                    this.zzH = android.os.Build.VERSION.SDK_INT != 23 && "OMX.google.vorbis.decoder".equals(str);
                    str2 = zzvmVar3.zza;
                    if (android.os.Build.VERSION.SDK_INT <= 25) {
                    }
                    if (android.os.Build.VERSION.SDK_INT <= 29) {
                    }
                    z = false;
                    this.zzK = z;
                    com.google.android.gms.internal.ads.zzvj zzvjVar522 = this.zzx;
                    zzvjVar522.getClass();
                    com.google.android.gms.internal.ads.zzvj zzvjVar2222 = zzvjVar522;
                    if (zze() == 2) {
                    }
                    this.zza.zza++;
                    long j222 = zzb32 - zzb2;
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                    }
                    zzvmVar = zzvmVar3;
                    r11 = arrayDeque;
                    zzal(str, r11, zzb32, j222);
                    arrayDeque2 = r11;
                    mediaCrypto = null;
                } catch (java.lang.Throwable th) {
                    zzvmVar = zzvmVar3;
                    r11 = arrayDeque;
                    android.os.Trace.endSection();
                    throw th;
                }
                arrayDeque = arrayDeque2;
                zzvmVar = zzvmVar2;
            }
            this.zzC = mediaCrypto;
        } catch (com.google.android.gms.internal.ads.zzvp e5) {
            throw zzP(e5, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaF(com.google.android.gms.internal.ads.zzv zzvVar) {
        return this.zzr == null && zzag(zzvVar);
    }

    protected boolean zzaG(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        return true;
    }

    protected final boolean zzaH() {
        return this.zzT;
    }

    protected final com.google.android.gms.internal.ads.zzvj zzaI() {
        return this.zzx;
    }

    protected final com.google.android.gms.internal.ads.zzv zzaJ() {
        return this.zzy;
    }

    protected final android.media.MediaFormat zzaK() {
        return this.zzz;
    }

    protected final com.google.android.gms.internal.ads.zzvm zzaL() {
        return this.zzE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaM() {
        try {
            com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzx;
            if (zzvjVar != null) {
                zzvjVar.zzl();
                this.zza.zzb++;
                com.google.android.gms.internal.ads.zzvm zzvmVar = this.zzE;
                zzvmVar.getClass();
                com.google.android.gms.internal.ads.zzvm zzvmVar2 = zzvmVar;
                zzam(zzvmVar.zza);
            }
        } finally {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
        }
    }

    protected final boolean zzaN() throws com.google.android.gms.internal.ads.zzjk {
        boolean zzax = zzax();
        if (zzax) {
            zzaE();
        }
        return zzax;
    }

    protected boolean zzaO() {
        int i = this.zzZ;
        if (i == 3 || ((this.zzG && !this.zzac) || (this.zzH && this.zzab))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbu();
            return false;
        } catch (com.google.android.gms.internal.ads.zzjk e) {
            com.google.android.gms.internal.ads.zzeg.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaP() {
        return true;
    }

    protected final long zzaQ() {
        return this.zzam;
    }

    protected void zzaR() {
        zzbm();
        zzbn();
        zzaz();
        this.zzN = -9223372036854775807L;
        this.zzab = false;
        this.zzL = -9223372036854775807L;
        this.zzaa = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaS() {
        zzaR();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzac = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzW = false;
        this.zzX = 0;
    }

    protected com.google.android.gms.internal.ads.zzvl zzaT(java.lang.Throwable th, com.google.android.gms.internal.ads.zzvm zzvmVar) {
        return new com.google.android.gms.internal.ads.zzvl(th, zzvmVar);
    }

    protected boolean zzaU(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        return true;
    }

    protected void zzaV(com.google.android.gms.internal.ads.zziv zzivVar) throws com.google.android.gms.internal.ads.zzjk {
    }

    protected int zzaW(com.google.android.gms.internal.ads.zziv zzivVar) {
        return 0;
    }

    protected boolean zzaX(com.google.android.gms.internal.ads.zziv zzivVar) {
        return false;
    }

    protected final long zzaY() {
        return this.zzai;
    }

    protected void zzaZ(long j) {
        this.zzai = j;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j < ((com.google.android.gms.internal.ads.zzvs) arrayDeque.peek()).zzb) {
                return;
            }
            com.google.android.gms.internal.ads.zzvs zzvsVar = (com.google.android.gms.internal.ads.zzvs) arrayDeque.poll();
            zzvsVar.getClass();
            zzbs(zzvsVar);
            zzar();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzab() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zzad(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        try {
            return zzae(this.zze, zzvVar);
        } catch (com.google.android.gms.internal.ads.zzvx e) {
            throw zzP(e, zzvVar, false, 4002);
        }
    }

    protected abstract int zzae(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzvx;

    protected abstract java.util.List zzaf(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z) throws com.google.android.gms.internal.ads.zzvx;

    protected boolean zzag(com.google.android.gms.internal.ads.zzv zzvVar) {
        return false;
    }

    protected abstract com.google.android.gms.internal.ads.zzvg zzah(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaCrypto mediaCrypto, float f);

    protected com.google.android.gms.internal.ads.zzjc zzai(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2) {
        throw null;
    }

    protected long zzaj(long j, long j2, boolean z) {
        return super.zzV(j, j2);
    }

    protected float zzak(float f, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzal(java.lang.String str, com.google.android.gms.internal.ads.zzvg zzvgVar, long j, long j2) {
        throw null;
    }

    protected void zzam(java.lang.String str) {
        throw null;
    }

    protected void zzan(java.lang.Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected com.google.android.gms.internal.ads.zzjc zzao(com.google.android.gms.internal.ads.zzlw zzlwVar) throws com.google.android.gms.internal.ads.zzjk {
        int i;
        boolean z = true;
        this.zzag = true;
        com.google.android.gms.internal.ads.zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        java.lang.String str = zzvVar.zzp;
        if (str == null) {
            throw zzP(new java.lang.IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if ((java.util.Objects.equals(str, "video/av01") || java.util.Objects.equals(str, "video/x-vnd.on2.vp9") || (java.util.Objects.equals(str, "video/dolby-vision") && java.util.Objects.equals(com.google.android.gms.internal.ads.zzwf.zzg(zzvVar), "video/av01"))) && !zzvVar.zzs.isEmpty()) {
            com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
            zza.zzr(null);
            zzvVar = zza.zzO();
        }
        com.google.android.gms.internal.ads.zzv zzvVar2 = zzvVar;
        this.zzr = zzlwVar.zza;
        this.zzo = zzvVar2;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        com.google.android.gms.internal.ads.zzvj zzvjVar = this.zzx;
        if (zzvjVar == null) {
            this.zzC = null;
            zzaE();
            return null;
        }
        com.google.android.gms.internal.ads.zzvm zzvmVar = this.zzE;
        zzvmVar.getClass();
        com.google.android.gms.internal.ads.zzv zzvVar3 = this.zzy;
        zzvVar3.getClass();
        com.google.android.gms.internal.ads.zzug zzugVar = this.zzq;
        com.google.android.gms.internal.ads.zzug zzugVar2 = this.zzr;
        if (zzugVar != zzugVar2) {
            zzbq();
            return new com.google.android.gms.internal.ads.zzjc(zzvmVar.zza, zzvVar3, zzvVar2, 0, 128);
        }
        com.google.android.gms.internal.ads.zzjc zzai = zzai(zzvmVar, zzvVar3, zzvVar2);
        int i2 = zzai.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                if (zzbo(zzvVar2)) {
                    this.zzy = zzvVar2;
                    if (zzugVar2 == zzugVar) {
                        if (this.zzaa) {
                            this.zzY = 1;
                            if (this.zzH) {
                                this.zzZ = 3;
                                i = 2;
                            } else {
                                this.zzZ = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzbo(zzvVar2)) {
                    this.zzy = zzvVar2;
                    if (zzugVar2 != zzugVar) {
                    }
                }
                i = 16;
            } else {
                if (zzbo(zzvVar2)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i3 = this.zzF;
                    if (i3 != 2 && (i3 != 1 || zzvVar2.zzw != zzvVar3.zzw || zzvVar2.zzx != zzvVar3.zzx)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzy = zzvVar2;
                    if (zzugVar2 != zzugVar) {
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.zzx == zzvjVar && this.zzZ != 3)) ? zzai : new com.google.android.gms.internal.ads.zzjc(zzvmVar.zza, zzvVar3, zzvVar2, 0, i);
        }
        zzbq();
        i = 0;
        if (i2 != 0) {
        }
    }

    protected void zzap(com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaFormat mediaFormat) throws com.google.android.gms.internal.ads.zzjk {
        throw null;
    }

    protected void zzar() {
    }

    protected abstract boolean zzas(long j, long j2, com.google.android.gms.internal.ads.zzvj zzvjVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk;

    protected abstract void zzat(com.google.android.gms.internal.ads.zziz zzizVar);

    protected void zzau() throws com.google.android.gms.internal.ads.zzjk {
        throw null;
    }

    protected void zzav(com.google.android.gms.internal.ads.zziv zzivVar) throws com.google.android.gms.internal.ads.zzjk {
        throw null;
    }

    protected final boolean zzba() {
        if (this.zzo == null) {
            return false;
        }
        if (zzS() || zzaC()) {
            return true;
        }
        return this.zzN != -9223372036854775807L && zzM().zzb() < this.zzN;
    }

    protected final float zzbb() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.ads.zzmz zzbc() {
        return this.zzs;
    }

    protected final boolean zzbd() throws com.google.android.gms.internal.ads.zzjk {
        return zzbo(this.zzy);
    }

    protected final long zzbe() {
        return this.zzah.zzf;
    }

    protected final long zzbf() {
        return this.zzad;
    }

    protected final long zzbg() {
        return this.zzah.zzd;
    }

    protected final long zzbh() {
        return this.zzah.zzc;
    }

    protected final void zzbi(android.media.MediaFormat mediaFormat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbk(com.google.android.gms.internal.ads.zzlw zzlwVar) {
        this.zzn.set(zzQ(zzlwVar, this.zzh, 0));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzmz zzbl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zznc
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public void zzx(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
        if (i != 11) {
            return;
        }
        com.google.android.gms.internal.ads.zzmz zzmzVar = (com.google.android.gms.internal.ads.zzmz) obj;
        zzmzVar.getClass();
        this.zzs = zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        this.zza = new com.google.android.gms.internal.ads.zzjb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] zzvVarArr, long j, long j2, com.google.android.gms.internal.ads.zzxk zzxkVar) throws com.google.android.gms.internal.ads.zzjk {
        if (this.zzah.zzd == -9223372036854775807L) {
            zzbs(new com.google.android.gms.internal.ads.zzvs(-9223372036854775807L, j, j2));
            if (this.zzak) {
                zzar();
                return;
            }
            return;
        }
        java.util.ArrayDeque arrayDeque = this.zzl;
        if (arrayDeque.isEmpty()) {
            long j3 = this.zzad;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzai;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzbs(new com.google.android.gms.internal.ads.zzvs(-9223372036854775807L, j, j2));
            if (this.zzah.zzd != -9223372036854775807L) {
                zzar();
                return;
            }
            return;
        }
        arrayDeque.add(new com.google.android.gms.internal.ads.zzvs(this.zzad, j, j2));
    }

    private final void zzbu() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzug zzugVar = this.zzr;
        zzugVar.getClass();
        this.zzq = zzugVar;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final void zzbr() throws com.google.android.gms.internal.ads.zzjk {
        int i = this.zzZ;
        if (i == 1) {
            zzay();
            return;
        }
        if (i == 2) {
            zzay();
            zzbu();
        } else if (i != 3) {
            this.zzaf = true;
            zzau();
        } else {
            zzaM();
            zzaE();
        }
    }
}
