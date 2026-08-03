package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaay extends com.google.android.gms.internal.ads.zzabe implements com.google.android.gms.internal.ads.zznb {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzgyg zzc = com.google.android.gms.internal.ads.zzgyg.zzc(com.google.android.gms.internal.ads.zzaah.zza);
    public final android.content.Context zza;
    private final java.lang.Object zzd;
    private com.google.android.gms.internal.ads.zzaam zze;
    private java.lang.Thread zzf;
    private com.google.android.gms.internal.ads.zzacm zzg;
    private com.google.android.gms.internal.ads.zzd zzh;
    private java.lang.Boolean zzi;
    private final com.google.android.gms.internal.ads.zzzt zzj;

    public zzaay(android.content.Context context) {
        com.google.android.gms.internal.ads.zzzt zzztVar = new com.google.android.gms.internal.ads.zzzt();
        com.google.android.gms.internal.ads.zzaam zzaamVar = com.google.android.gms.internal.ads.zzaam.zzJ;
        this.zzd = new java.lang.Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzztVar;
        if (zzaamVar instanceof com.google.android.gms.internal.ads.zzaam) {
            this.zze = zzaamVar;
        } else {
            com.google.android.gms.internal.ads.zzaal zzaalVar = new com.google.android.gms.internal.ads.zzaal(zzaamVar, bArr);
            zzaalVar.zzx((com.google.android.gms.internal.ads.zzbl) zzaamVar);
            this.zze = new com.google.android.gms.internal.ads.zzaam(zzaalVar, bArr);
        }
        this.zzh = com.google.android.gms.internal.ads.zzd.zza;
        if (this.zze.zzU && context == null) {
            com.google.android.gms.internal.ads.zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static android.util.Pair zzA(com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            com.google.android.gms.internal.ads.zzaaz zzaazVar = zzaazVarArr[i2];
            if (zzaazVar != null && zzaazVar.zza.zzc == i) {
                return android.util.Pair.create(zzaazVar, java.lang.Integer.valueOf(i2));
            }
        }
        return null;
    }

    private static final android.util.Pair zzB(int i, com.google.android.gms.internal.ads.zzabd zzabdVar, int[][][] iArr, com.google.android.gms.internal.ads.zzaap zzaapVar, java.util.Comparator comparator) {
        java.util.RandomAccess randomAccess;
        com.google.android.gms.internal.ads.zzabd zzabdVar2 = zzabdVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzabdVar2.zza(i2)) {
                com.google.android.gms.internal.ads.zzzn zzb2 = zzabdVar2.zzb(i2);
                for (int i3 = 0; i3 < zzb2.zzb; i3++) {
                    com.google.android.gms.internal.ads.zzbg zza = zzb2.zza(i3);
                    java.util.List zza2 = zzaapVar.zza(i2, zza, iArr[i2][i3]);
                    int i4 = zza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        com.google.android.gms.internal.ads.zzaaq zzaaqVar = (com.google.android.gms.internal.ads.zzaaq) zza2.get(i5);
                        int zza3 = zzaaqVar.zza();
                        if (!zArr[i5] && zza3 != 0) {
                            if (zza3 == 1) {
                                randomAccess = com.google.android.gms.internal.ads.zzgwm.zzj(zzaaqVar);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(zzaaqVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    com.google.android.gms.internal.ads.zzaaq zzaaqVar2 = (com.google.android.gms.internal.ads.zzaaq) zza2.get(i7);
                                    if (zzaaqVar2.zza() == 2 && zzaaqVar.zzc(zzaaqVar2)) {
                                        arrayList2.add(zzaaqVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzabdVar2 = zzabdVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((com.google.android.gms.internal.ads.zzaaq) list.get(i8)).zzc;
        }
        com.google.android.gms.internal.ads.zzaaq zzaaqVar3 = (com.google.android.gms.internal.ads.zzaaq) list.get(0);
        return android.util.Pair.create(new com.google.android.gms.internal.ads.zzaaz(zzaaqVar3.zzb, iArr2, 0), java.lang.Integer.valueOf(zzaaqVar3.zza));
    }

    protected static java.lang.String zzi(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(com.google.android.gms.internal.ads.zzv zzvVar, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        java.lang.String zzi = zzi(str);
        java.lang.String zzi2 = zzi(zzvVar.zzd);
        if (zzi2 == null || zzi == null) {
            return (z && zzi2 == null) ? 1 : 0;
        }
        if (zzi2.startsWith(zzi) || zzi.startsWith(zzi2)) {
            return 3;
        }
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        return zzi2.split("-", 2)[0].equals(zzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i, int i2) {
        if (i == 0 || i != i2) {
            return java.lang.Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzgwm zzgwmVar) {
        int i = 0;
        while (i < zzgwmVar.size()) {
            int i2 = 0;
            while (true) {
                java.util.List list = zzvVar.zzc;
                if (i2 < list.size()) {
                    if (((com.google.android.gms.internal.ads.zzx) list.get(i2)).zzb.equals(zzgwmVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static final com.google.android.gms.internal.ads.zzaaz zzp(int i, com.google.android.gms.internal.ads.zzzn zzznVar, int[][] iArr, com.google.android.gms.internal.ads.zzaam zzaamVar) throws com.google.android.gms.internal.ads.zzjk {
        int i2 = zzaamVar.zzw.zzb;
        com.google.android.gms.internal.ads.zzbg zzbgVar = null;
        com.google.android.gms.internal.ads.zzaak zzaakVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < zzznVar.zzb; i4++) {
            com.google.android.gms.internal.ads.zzbg zza = zzznVar.zza(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < zza.zza; i5++) {
                if (com.google.android.gms.internal.ads.zznc.CC.zzac(iArr2[i5], zzaamVar.zzV)) {
                    com.google.android.gms.internal.ads.zzaak zzaakVar2 = new com.google.android.gms.internal.ads.zzaak(zza.zza(i5), iArr2[i5]);
                    if (zzaakVar == null || zzaakVar2.compareTo(zzaakVar) > 0) {
                        zzbgVar = zza;
                        i3 = i5;
                        zzaakVar = zzaakVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzaaz(zzbgVar, new int[]{i3}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z;
        com.google.android.gms.internal.ads.zzacm zzacmVar;
        synchronized (this.zzd) {
            z = false;
            if (this.zze.zzU && android.os.Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb()) {
                z = true;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static void zzw(com.google.android.gms.internal.ads.zzabd zzabdVar, com.google.android.gms.internal.ads.zzbl zzblVar, com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < 2; i++) {
            zzx(zzabdVar.zzb(i), zzblVar, hashMap);
        }
        zzx(zzabdVar.zze(), zzblVar, hashMap);
        for (int i2 = 0; i2 < 2; i2++) {
            if (((com.google.android.gms.internal.ads.zzbh) hashMap.get(java.lang.Integer.valueOf(zzabdVar.zza(i2)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzbl zzblVar, java.util.Map map) {
        for (int i = 0; i < zzznVar.zzb; i++) {
            if (((com.google.android.gms.internal.ads.zzbh) zzblVar.zzH.get(zzznVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(com.google.android.gms.internal.ads.zzabd zzabdVar, com.google.android.gms.internal.ads.zzaam zzaamVar, com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr) {
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.ads.zzzn zzb2 = zzabdVar.zzb(i);
            if (zzaamVar.zzb(i, zzb2)) {
                if (zzaamVar.zzc(i, zzb2) != null) {
                    throw null;
                }
                zzaazVarArr[i] = null;
            }
        }
    }

    private static void zzz(com.google.android.gms.internal.ads.zzabd zzabdVar, com.google.android.gms.internal.ads.zzaam zzaamVar, com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr) {
        for (int i = 0; i < 2; i++) {
            int zza = zzabdVar.zza(i);
            if (zzaamVar.zza(i) || zzaamVar.zzI.contains(java.lang.Integer.valueOf(zza))) {
                zzaazVarArr[i] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zza(com.google.android.gms.internal.ads.zzna zznaVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        com.google.android.gms.internal.ads.zzacm zzacmVar;
        synchronized (this.zzd) {
            java.lang.Thread thread = this.zzf;
            if (thread != null) {
                com.google.android.gms.internal.ads.zzgtj.zzj(thread == java.lang.Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null) {
            zzacmVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final com.google.android.gms.internal.ads.zzaam zzc() {
        com.google.android.gms.internal.ads.zzaam zzaamVar;
        synchronized (this.zzd) {
            zzaamVar = this.zze;
        }
        return zzaamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(com.google.android.gms.internal.ads.zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(com.google.android.gms.internal.ads.zzaal zzaalVar) {
        boolean z;
        com.google.android.gms.internal.ads.zzaam zzaamVar = new com.google.android.gms.internal.ads.zzaam(zzaalVar, null);
        synchronized (this.zzd) {
            z = !this.zze.equals(zzaamVar);
            this.zze = zzaamVar;
        }
        if (z) {
            if (zzaamVar.zzU && this.zza == null) {
                com.google.android.gms.internal.ads.zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final com.google.android.gms.internal.ads.zznb zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    protected final android.util.Pair zzh(com.google.android.gms.internal.ads.zzabd zzabdVar, int[][][] iArr, final int[] iArr2, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar) throws com.google.android.gms.internal.ads.zzjk {
        final com.google.android.gms.internal.ads.zzaam zzaamVar;
        int[] iArr3;
        int length;
        final java.lang.String str;
        android.content.Context context;
        android.view.accessibility.CaptioningManager captioningManager;
        java.util.Locale locale;
        android.content.Context context2;
        final boolean z;
        android.content.Context context3;
        synchronized (this.zzd) {
            this.zzf = java.lang.Thread.currentThread();
            zzaamVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.zzfl.zzP(context3));
        }
        if (zzaamVar.zzU && android.os.Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new com.google.android.gms.internal.ads.zzacm(this.zza, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaai
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaay.this.zzk();
                }
            }, this.zzi);
        }
        com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr = new com.google.android.gms.internal.ads.zzaaz[2];
        zzw(zzabdVar, zzaamVar, zzaazVarArr);
        zzy(zzabdVar, zzaamVar, zzaazVarArr);
        zzz(zzabdVar, zzaamVar, zzaazVarArr);
        android.util.Pair zzA = zzA(zzaazVarArr, 1);
        if (zzA == null) {
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = false;
                    break;
                }
                if (zzabdVar.zza(i) == 2 && zzabdVar.zzb(i).zzb > 0) {
                    z = true;
                    break;
                }
                i++;
            }
            zzA = zzB(1, zzabdVar, iArr, new com.google.android.gms.internal.ads.zzaap() { // from class: com.google.android.gms.internal.ads.zzaad
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ java.util.List zza(int i2, com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr4) {
                    com.google.android.gms.internal.ads.zzaad zzaadVar = this;
                    final com.google.android.gms.internal.ads.zzaay zzaayVar = com.google.android.gms.internal.ads.zzaay.this;
                    final com.google.android.gms.internal.ads.zzaam zzaamVar2 = zzaamVar;
                    com.google.android.gms.internal.ads.zzgtk zzgtkVar = new com.google.android.gms.internal.ads.zzgtk() { // from class: com.google.android.gms.internal.ads.zzaag
                        @Override // com.google.android.gms.internal.ads.zzgtk
                        public final /* synthetic */ boolean zza(java.lang.Object obj) {
                            return com.google.android.gms.internal.ads.zzaay.this.zzl(zzaamVar2, (com.google.android.gms.internal.ads.zzv) obj);
                        }
                    };
                    int i3 = iArr2[i2];
                    int i4 = com.google.android.gms.internal.ads.zzgwm.zzd;
                    com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                    int i5 = 0;
                    while (i5 < zzbgVar.zza) {
                        int i6 = i5;
                        zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzzx(i2, zzbgVar, i6, zzaamVar2, iArr4[i5], z, zzgtkVar, i3));
                        i5++;
                        zzaadVar = this;
                    }
                    return zzgwjVar.zzi();
                }
            }, com.google.android.gms.internal.ads.zzzy.zza);
            if (zzA != null) {
                zzaazVarArr[((java.lang.Integer) zzA.second).intValue()] = (com.google.android.gms.internal.ads.zzaaz) zzA.first;
            }
        }
        final java.lang.String str2 = zzA == null ? null : ((com.google.android.gms.internal.ads.zzaaz) zzA.first).zza.zza(((com.google.android.gms.internal.ads.zzaaz) zzA.first).zzb[0]).zzd;
        android.util.Pair zzA2 = zzA(zzaazVarArr, 2);
        android.util.Pair zzA3 = zzA(zzaazVarArr, 4);
        if (zzA2 == null && zzA3 == null) {
            int i2 = zzaamVar.zzw.zzb;
            final android.graphics.Point zzR = (!zzaamVar.zzk || (context2 = this.zza) == null) ? null : com.google.android.gms.internal.ads.zzfl.zzR(context2);
            android.util.Pair zzB = zzB(2, zzabdVar, iArr, new com.google.android.gms.internal.ads.zzaap() { // from class: com.google.android.gms.internal.ads.zzaac
                /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
                @Override // com.google.android.gms.internal.ads.zzaap
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ java.util.List zza(int i3, com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr4) {
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    android.graphics.Point point;
                    int i8;
                    int i9 = com.google.android.gms.internal.ads.zzaay.zzb;
                    android.graphics.Point point2 = zzR;
                    int i10 = iArr2[i3];
                    com.google.android.gms.internal.ads.zzaam zzaamVar2 = com.google.android.gms.internal.ads.zzaam.this;
                    int i11 = point2 != null ? point2.x : zzaamVar2.zzi;
                    int i12 = point2 != null ? point2.y : zzaamVar2.zzj;
                    boolean z2 = zzaamVar2.zzl;
                    int i13 = -1;
                    if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        int i14 = Integer.MAX_VALUE;
                        for (int i15 = 0; i15 < zzbgVar.zza; i15++) {
                            com.google.android.gms.internal.ads.zzv zza = zzbgVar.zza(i15);
                            int i16 = zza.zzw;
                            if (i16 > 0 && (i5 = zza.zzx) > 0) {
                                if (z2) {
                                    if ((i16 > i5) != (i11 > i12)) {
                                        i7 = i12;
                                        i6 = i11;
                                        if (i16 * i6 < i5 * i7) {
                                            java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                                            point = new android.graphics.Point(i7, ((r9 + i16) - 1) / i16);
                                        } else {
                                            java.lang.String str4 = com.google.android.gms.internal.ads.zzfl.zza;
                                            point = new android.graphics.Point(((r15 + i5) - 1) / i5, i6);
                                        }
                                        i8 = i16 * i5;
                                        if (i16 >= ((int) (point.x * 0.98f)) && i5 >= ((int) (point.y * 0.98f)) && i8 < i14) {
                                            i14 = i8;
                                        }
                                    }
                                }
                                i6 = i12;
                                i7 = i11;
                                if (i16 * i6 < i5 * i7) {
                                }
                                i8 = i16 * i5;
                                if (i16 >= ((int) (point.x * 0.98f))) {
                                    i14 = i8;
                                }
                            }
                        }
                        i4 = i14;
                    }
                    int i17 = com.google.android.gms.internal.ads.zzgwm.zzd;
                    com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                    int i18 = 0;
                    while (i18 < zzbgVar.zza) {
                        int zzc2 = zzbgVar.zza(i18).zzc();
                        zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzaax(i3, zzbgVar, i18, zzaamVar2, iArr4[i18], str2, i10, i4 == Integer.MAX_VALUE || (zzc2 != i13 && zzc2 <= i4)));
                        i18++;
                        i13 = -1;
                    }
                    return zzgwjVar.zzi();
                }
            }, com.google.android.gms.internal.ads.zzaab.zza);
            boolean z2 = zzaamVar.zzE;
            android.util.Pair zzB2 = zzB == null ? zzB(4, zzabdVar, iArr, new com.google.android.gms.internal.ads.zzaap() { // from class: com.google.android.gms.internal.ads.zzaaf
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ java.util.List zza(int i3, com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr4) {
                    int i4 = com.google.android.gms.internal.ads.zzaay.zzb;
                    int i5 = com.google.android.gms.internal.ads.zzgwm.zzd;
                    com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                    for (int i6 = 0; i6 < zzbgVar.zza; i6++) {
                        zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzaaj(i3, zzbgVar, i6, com.google.android.gms.internal.ads.zzaam.this, iArr4[i6]));
                    }
                    return zzgwjVar.zzi();
                }
            }, com.google.android.gms.internal.ads.zzzz.zza) : null;
            if (zzB2 != null) {
                zzaazVarArr[((java.lang.Integer) zzB2.second).intValue()] = (com.google.android.gms.internal.ads.zzaaz) zzB2.first;
            } else if (zzB != null) {
                zzaazVarArr[((java.lang.Integer) zzB.second).intValue()] = (com.google.android.gms.internal.ads.zzaaz) zzB.first;
            }
        }
        if (zzA(zzaazVarArr, 3) == null) {
            int i3 = zzaamVar.zzw.zzb;
            if (!zzaamVar.zzB || (context = this.zza) == null || (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str = null;
            } else {
                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                str = locale.toLanguageTag();
            }
            android.util.Pair zzB3 = zzB(3, zzabdVar, iArr, new com.google.android.gms.internal.ads.zzaap() { // from class: com.google.android.gms.internal.ads.zzaae
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ java.util.List zza(int i4, com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr4) {
                    int i5 = com.google.android.gms.internal.ads.zzaay.zzb;
                    int i6 = com.google.android.gms.internal.ads.zzgwm.zzd;
                    com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                    for (int i7 = 0; i7 < zzbgVar.zza; i7++) {
                        java.lang.String str4 = str;
                        int i8 = i7;
                        zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzaao(i4, zzbgVar, i8, com.google.android.gms.internal.ads.zzaam.this, iArr4[i7], str2, str4));
                    }
                    return zzgwjVar.zzi();
                }
            }, com.google.android.gms.internal.ads.zzaaa.zza);
            if (zzB3 != null) {
                zzaazVarArr[((java.lang.Integer) zzB3.second).intValue()] = (com.google.android.gms.internal.ads.zzaaz) zzB3.first;
            }
        }
        int i4 = zzaamVar.zzw.zzb;
        com.google.android.gms.internal.ads.zzgwv zzgwvVar = new com.google.android.gms.internal.ads.zzgwv();
        for (int i5 = 0; i5 < 2; i5++) {
            com.google.android.gms.internal.ads.zzaaz zzaazVar = zzaazVarArr[i5];
            if (zzaazVar != null && !zzaamVar.zza(i5)) {
                com.google.android.gms.internal.ads.zzgww zzgwwVar = zzaamVar.zzI;
                com.google.android.gms.internal.ads.zzbg zzbgVar = zzaazVar.zza;
                if (!zzgwwVar.contains(java.lang.Integer.valueOf(zzbgVar.zzc))) {
                    zzgwvVar.zzf(zzbgVar.zzb);
                    int i6 = 0;
                    while (true) {
                        int[] iArr4 = zzaazVar.zzb;
                        if (i6 < iArr4.length) {
                            java.lang.String str4 = zzbgVar.zza(iArr4[i6]).zzn;
                            if (str4 != null) {
                                zzgwvVar.zzf(str4);
                            }
                            i6++;
                        }
                    }
                }
            }
        }
        com.google.android.gms.internal.ads.zzgww zzh = zzgwvVar.zzh();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            if (zzabdVar.zza(i7) == 5) {
                com.google.android.gms.internal.ads.zzzn zzb2 = zzabdVar.zzb(i7);
                for (int i9 = 0; i9 < zzb2.zzb; i9++) {
                    com.google.android.gms.internal.ads.zzbg zza = zzb2.zza(i9);
                    arrayList.add(zza);
                    int[] iArr5 = (int[]) iArr[i7][i9].clone();
                    for (int i10 = 0; i10 < iArr5.length; i10++) {
                        java.lang.String str5 = zza.zza(i10).zzn;
                        if (str5 != null && !zzh.contains(str5)) {
                            iArr5[i10] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
            i7++;
        }
        com.google.android.gms.internal.ads.zzbg[] zzbgVarArr = new com.google.android.gms.internal.ads.zzbg[arrayList.size()];
        com.google.android.gms.internal.ads.zzfl.zzc(arrayList, zzbgVarArr);
        com.google.android.gms.internal.ads.zzzn zzznVar = new com.google.android.gms.internal.ads.zzzn(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        com.google.android.gms.internal.ads.zzfl.zzc(arrayList2, iArr6);
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzabdVar.zza(i11) == 5) {
                com.google.android.gms.internal.ads.zzaaz zzp = zzp(5, zzznVar, iArr6, zzaamVar);
                zzaazVarArr[i11] = zzp;
                if (zzp == null) {
                    break;
                }
                java.util.Arrays.fill(iArr6[zzznVar.zzb(zzp.zza)], 128);
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            int zza2 = zzabdVar.zza(i12);
            if (zza2 != 2 && zza2 != 1) {
                if (zza2 != 3 && zza2 != 4 && zza2 != 5 && zzaazVarArr[i12] == null) {
                    zzaazVarArr[i12] = zzp(zza2, zzabdVar.zzb(i12), iArr[i12], zzaamVar);
                }
            }
        }
        zzw(zzabdVar, zzaamVar, zzaazVarArr);
        zzy(zzabdVar, zzaamVar, zzaazVarArr);
        zzz(zzabdVar, zzaamVar, zzaazVarArr);
        com.google.android.gms.internal.ads.zzzt zzztVar = this.zzj;
        com.google.android.gms.internal.ads.zzabq zzu = zzu();
        com.google.android.gms.internal.ads.zzgwm zzd = com.google.android.gms.internal.ads.zzzu.zzd(zzaazVarArr);
        int i13 = 2;
        com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = new com.google.android.gms.internal.ads.zzaba[2];
        int i14 = 0;
        while (i14 < i13) {
            com.google.android.gms.internal.ads.zzaaz zzaazVar2 = zzaazVarArr[i14];
            if (zzaazVar2 != null && (length = (iArr3 = zzaazVar2.zzb).length) != 0) {
                zzabaVarArr[i14] = length == 1 ? new com.google.android.gms.internal.ads.zzabb(zzaazVar2.zza, iArr3[0], 0, 0, null) : zzztVar.zza(zzaazVar2.zza, iArr3, 0, zzu, (com.google.android.gms.internal.ads.zzgwm) zzd.get(i14));
            }
            i14++;
            i13 = 2;
        }
        com.google.android.gms.internal.ads.zznd[] zzndVarArr = new com.google.android.gms.internal.ads.zznd[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            zzndVarArr[i15] = (zzaamVar.zza(i15) || zzaamVar.zzI.contains(java.lang.Integer.valueOf(zzabdVar.zza(i15))) || (zzabdVar.zza(i15) != -2 && zzabaVarArr[i15] == null)) ? null : com.google.android.gms.internal.ads.zznd.zza;
        }
        boolean z3 = zzaamVar.zzW;
        return android.util.Pair.create(zzndVarArr, zzabaVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(com.google.android.gms.internal.ads.zzaam zzaamVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzacm zzacmVar;
        com.google.android.gms.internal.ads.zzacm zzacmVar2;
        if (!zzaamVar.zzU) {
            return true;
        }
        java.lang.Boolean bool = this.zzi;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i = zzvVar.zzH;
        char c = 65535;
        if (i == -1 || i <= 2) {
            return true;
        }
        java.lang.String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if ((c == 0 || c == 1 || c == 2 || c == 3) && (android.os.Build.VERSION.SDK_INT < 32 || (zzacmVar2 = this.zzg) == null || !zzacmVar2.zzb())) {
                return true;
            }
        }
        return android.os.Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb() && zzacmVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
    }
}
