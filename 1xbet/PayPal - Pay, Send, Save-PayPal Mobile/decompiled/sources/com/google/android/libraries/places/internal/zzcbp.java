package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbp implements com.google.android.libraries.places.internal.zzbqa, com.google.android.libraries.places.internal.zzcau, com.google.android.libraries.places.internal.zzccb {
    static final boolean zza;
    public static final /* synthetic */ int zzd = 0;
    private static final java.util.Map zze;
    private static final java.util.logging.Logger zzf;
    private int zzA;
    private com.google.android.libraries.places.internal.zzcbn zzB;
    private com.google.android.libraries.places.internal.zzbio zzC;
    private com.google.android.libraries.places.internal.zzbnp zzD;
    private boolean zzE;
    private com.google.android.libraries.places.internal.zzbtd zzF;
    private boolean zzG;
    private boolean zzH;
    private final javax.net.SocketFactory zzI;
    private javax.net.ssl.SSLSocketFactory zzJ;
    private javax.net.ssl.HostnameVerifier zzK;
    private java.net.Socket zzL;
    private int zzM;
    private final java.util.Deque zzN;
    private final com.google.android.libraries.places.internal.zzcch zzO;
    private com.google.android.libraries.places.internal.zzbue zzP;
    private final java.lang.Runnable zzQ;
    private final int zzR;
    private final com.google.android.libraries.places.internal.zzcal zzS;
    private final java.util.Map zzT;
    private final com.google.android.libraries.places.internal.zzbte zzU;

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbki zzb;
    int zzc;
    private java.net.Socket zzg;
    private javax.net.ssl.SSLSession zzh;
    private final java.net.InetSocketAddress zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.util.Random zzl;
    private final com.google.common.base.Supplier zzm;
    private final int zzn;
    private final com.google.android.libraries.places.internal.zzcdl zzo;
    private com.google.android.libraries.places.internal.zzbwc zzp;
    private com.google.android.libraries.places.internal.zzcav zzq;
    private com.google.android.libraries.places.internal.zzccd zzr;
    private final java.lang.Object zzs;
    private final com.google.android.libraries.places.internal.zzbku zzt;
    private int zzu;
    private final java.util.Map zzv;
    private final java.util.concurrent.Executor zzw;
    private final com.google.android.libraries.places.internal.zzbzq zzx;
    private final java.util.concurrent.ScheduledExecutorService zzy;
    private final int zzz;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.libraries.places.internal.zzccv.class);
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.NO_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("No error: A GRPC status of OK should have been sent"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Protocol error"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.INTERNAL_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Internal error"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.FLOW_CONTROL_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Flow control error"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.STREAM_CLOSED, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Stream closed"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.FRAME_TOO_LARGE, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Frame too large"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.REFUSED_STREAM, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzi.zze("Refused stream"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.CANCEL, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzb.zze("Cancelled"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.COMPRESSION_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Compression error"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.CONNECT_ERROR, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzh.zze("Connect error"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.ENHANCE_YOUR_CALM, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zzf.zze("Enhance your calm"));
        enumMap.put((java.util.EnumMap) com.google.android.libraries.places.internal.zzccv.INADEQUATE_SECURITY, (com.google.android.libraries.places.internal.zzccv) com.google.android.libraries.places.internal.zzbnp.zze.zze("Inadequate security"));
        zze = java.util.Collections.unmodifiableMap(enumMap);
        zzf = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcbp.class.getName());
        zza = com.google.android.libraries.places.internal.zzbsz.zzj("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            java.lang.Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", java.security.cert.X509Certificate[].class, java.lang.String.class, java.net.Socket.class);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
        }
    }

    public zzcbp(com.google.android.libraries.places.internal.zzcbc zzcbcVar, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, @javax.annotation.Nullable java.lang.String str2, com.google.android.libraries.places.internal.zzbio zzbioVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbki zzbkiVar, java.lang.Runnable runnable, com.google.android.libraries.places.internal.zzbiu zzbiuVar) {
        com.google.common.base.Supplier supplier = com.google.android.libraries.places.internal.zzbsz.zzo;
        com.google.android.libraries.places.internal.zzcdh zzcdhVar = new com.google.android.libraries.places.internal.zzcdh();
        this.zzl = new java.util.Random();
        java.lang.Object obj = new java.lang.Object();
        this.zzs = obj;
        this.zzv = new java.util.HashMap();
        this.zzM = 0;
        this.zzN = new java.util.LinkedList();
        this.zzT = new com.google.android.libraries.places.internal.zzcbo(null);
        this.zzU = new com.google.android.libraries.places.internal.zzcbh(this);
        this.zzc = com.adjust.sdk.Constants.CONNECTION_TIMEOUT_VERIFY;
        this.zzi = (java.net.InetSocketAddress) com.google.common.base.Preconditions.checkNotNull(inetSocketAddress, "address");
        this.zzj = str;
        this.zzz = 4194304;
        this.zzn = 65535;
        this.zzw = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(zzcbcVar.zza, "executor");
        this.zzx = new com.google.android.libraries.places.internal.zzbzq(zzcbcVar.zza);
        this.zzy = (java.util.concurrent.ScheduledExecutorService) com.google.common.base.Preconditions.checkNotNull(zzcbcVar.zzb, "scheduledExecutorService");
        this.zzu = 3;
        this.zzI = javax.net.SocketFactory.getDefault();
        this.zzJ = zzcbcVar.zzd;
        this.zzK = com.google.android.libraries.places.internal.zzccl.zza;
        this.zzO = (com.google.android.libraries.places.internal.zzcch) com.google.common.base.Preconditions.checkNotNull(zzcbcVar.zze, "connectionSpec");
        this.zzm = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier, "stopwatchFactory");
        this.zzo = (com.google.android.libraries.places.internal.zzcdl) com.google.common.base.Preconditions.checkNotNull(zzcdhVar, "variant");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-okhttp/1.77.0-SNAPSHOT");
        this.zzk = sb.toString();
        this.zzb = zzbkiVar;
        this.zzQ = (java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable, "tooManyPingsRunnable");
        this.zzR = Integer.MAX_VALUE;
        this.zzS = zzcbcVar.zzc.zza();
        this.zzt = com.google.android.libraries.places.internal.zzbku.zza(getClass(), inetSocketAddress.toString());
        com.google.android.libraries.places.internal.zzbim zzb = com.google.android.libraries.places.internal.zzbio.zzb();
        zzb.zza(com.google.android.libraries.places.internal.zzbsr.zzb, zzbioVar);
        this.zzC = zzb.zzc();
        synchronized (obj) {
        }
    }

    private final void zzab(com.google.android.libraries.places.internal.zzcbg zzcbgVar) {
        com.google.common.base.Preconditions.checkState(zzcbgVar.zzy().zzJ() == -1, "StreamId already assigned");
        this.zzv.put(java.lang.Integer.valueOf(this.zzu), zzcbgVar);
        zzah(zzcbgVar);
        zzcbgVar.zzy().zzF(this.zzu);
        if (zzcbgVar.zzz() == com.google.android.libraries.places.internal.zzbmj.UNARY || zzcbgVar.zzz() == com.google.android.libraries.places.internal.zzbmj.SERVER_STREAMING) {
            zzcbgVar.zzA();
        } else {
            this.zzq.zze();
        }
        int i = this.zzu;
        if (i < 2147483645) {
            this.zzu = i + 2;
        } else {
            this.zzu = Integer.MAX_VALUE;
            zzu(Integer.MAX_VALUE, com.google.android.libraries.places.internal.zzccv.NO_ERROR, com.google.android.libraries.places.internal.zzbnp.zzi.zze("Stream ids exhausted"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final boolean zzr() {
        boolean z = false;
        while (true) {
            java.util.Deque deque = this.zzN;
            if (deque.isEmpty() || this.zzv.size() >= this.zzM) {
                break;
            }
            zzab((com.google.android.libraries.places.internal.zzcbg) deque.poll());
            z = true;
        }
        return z;
    }

    private static java.lang.String zzad(com.google.android.libraries.places.internal.zzcfv zzcfvVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        while (zzcfvVar.zza(zzcffVar, 1L) != -1) {
            if (zzcffVar.zzk(zzcffVar.zzb() - 1) == 10) {
                return zzcffVar.zzq(Long.MAX_VALUE);
            }
        }
        throw new java.io.EOFException("\\n not found: ".concat(java.lang.String.valueOf(zzcffVar.zzn(zzcffVar.zzb()).zzg())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzu(int i, com.google.android.libraries.places.internal.zzccv zzccvVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        synchronized (this.zzs) {
            if (this.zzD == null) {
                this.zzD = zzbnpVar;
                this.zzp.zzd(zzbnpVar);
            }
            if (zzccvVar != null && !this.zzE) {
                this.zzE = true;
                this.zzq.zzj(0, zzccvVar, new byte[0]);
            }
            java.util.Iterator it = this.zzv.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((com.google.android.libraries.places.internal.zzcbg) entry.getValue()).zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.REFUSED, false, new com.google.android.libraries.places.internal.zzbmg());
                    zzag((com.google.android.libraries.places.internal.zzcbg) entry.getValue());
                }
            }
            java.util.Deque<com.google.android.libraries.places.internal.zzcbg> deque = this.zzN;
            for (com.google.android.libraries.places.internal.zzcbg zzcbgVar : deque) {
                zzcbgVar.zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.MISCARRIED, true, new com.google.android.libraries.places.internal.zzbmg());
                zzag(zzcbgVar);
            }
            deque.clear();
            zzaf();
        }
    }

    private final void zzaf() {
        if (this.zzD == null || !this.zzv.isEmpty() || !this.zzN.isEmpty() || this.zzG) {
            return;
        }
        this.zzG = true;
        com.google.android.libraries.places.internal.zzbue zzbueVar = this.zzP;
        if (zzbueVar != null) {
            zzbueVar.zzd();
        }
        com.google.android.libraries.places.internal.zzbtd zzbtdVar = this.zzF;
        if (zzbtdVar != null) {
            zzbtdVar.zzc(zzai());
            this.zzF = null;
        }
        if (!this.zzE) {
            this.zzE = true;
            this.zzq.zzj(0, com.google.android.libraries.places.internal.zzccv.NO_ERROR, new byte[0]);
        }
        this.zzq.close();
    }

    private final void zzag(com.google.android.libraries.places.internal.zzcbg zzcbgVar) {
        if (this.zzH && this.zzN.isEmpty() && this.zzv.isEmpty()) {
            this.zzH = false;
            com.google.android.libraries.places.internal.zzbue zzbueVar = this.zzP;
            if (zzbueVar != null) {
                zzbueVar.zzc();
            }
        }
        if (zzcbgVar.zzi()) {
            this.zzU.zza(zzcbgVar, false);
        }
    }

    private final void zzah(com.google.android.libraries.places.internal.zzcbg zzcbgVar) {
        if (!this.zzH) {
            this.zzH = true;
            com.google.android.libraries.places.internal.zzbue zzbueVar = this.zzP;
            if (zzbueVar != null) {
                zzbueVar.zzb();
            }
        }
        if (zzcbgVar.zzi()) {
            this.zzU.zza(zzcbgVar, true);
        }
    }

    private final com.google.android.libraries.places.internal.zzbnp zzai() {
        synchronized (this.zzs) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzD;
            if (zzbnpVar != null) {
                return zzbnpVar;
            }
            return com.google.android.libraries.places.internal.zzbnp.zzi.zze("Connection closed");
        }
    }

    static com.google.android.libraries.places.internal.zzbnp zzq(com.google.android.libraries.places.internal.zzccv zzccvVar) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = (com.google.android.libraries.places.internal.zzbnp) zze.get(zzccvVar);
        if (zzbnpVar != null) {
            return zzbnpVar;
        }
        com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = com.google.android.libraries.places.internal.zzbnp.zzc;
        int i = zzccvVar.zzs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 26);
        sb.append("Unknown http2 error code: ");
        sb.append(i);
        return zzbnpVar2.zze(sb.toString());
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("logId", this.zzt.zzc()).add("address", this.zzi).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final java.lang.Runnable zzaq(com.google.android.libraries.places.internal.zzbwc zzbwcVar) {
        this.zzp = (com.google.android.libraries.places.internal.zzbwc) com.google.common.base.Preconditions.checkNotNull(zzbwcVar, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.android.libraries.places.internal.zzcat zza2 = com.google.android.libraries.places.internal.zzcat.zza(this.zzx, this, 10000);
        com.google.android.libraries.places.internal.zzcar zzcarVar = new com.google.android.libraries.places.internal.zzcar(zza2, this.zzo.zzb(com.google.android.libraries.places.internal.zzcfl.zzd(zza2), true));
        synchronized (this.zzs) {
            com.google.android.libraries.places.internal.zzcav zzcavVar = new com.google.android.libraries.places.internal.zzcav(this, zzcarVar);
            this.zzq = zzcavVar;
            this.zzr = new com.google.android.libraries.places.internal.zzccd(this, zzcavVar);
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.CyclicBarrier cyclicBarrier = new java.util.concurrent.CyclicBarrier(2);
        this.zzx.execute(new com.google.android.libraries.places.internal.zzcbk(this, countDownLatch, cyclicBarrier, zza2, countDownLatch2));
        this.zzw.execute(new com.google.android.libraries.places.internal.zzcbl(this, cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.zzs) {
                this.zzq.zzd();
                com.google.android.libraries.places.internal.zzcdk zzcdkVar = new com.google.android.libraries.places.internal.zzcdk();
                zzcdkVar.zza(7, 0, this.zzn);
                this.zzq.zzi(zzcdkVar);
            }
            countDownLatch.countDown();
            this.zzx.execute(new com.google.android.libraries.places.internal.zzcbm(this));
            return null;
        } catch (java.lang.Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpo
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbpl zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        java.lang.Object obj;
        com.google.common.base.Preconditions.checkNotNull(zzbmlVar, "method");
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        com.google.android.libraries.places.internal.zzcaa zza2 = com.google.android.libraries.places.internal.zzcaa.zza(zzbjeVarArr, this.zzC, zzbmgVar);
        java.lang.Object obj2 = this.zzs;
        synchronized (obj2) {
            try {
                obj = obj2;
                try {
                    com.google.android.libraries.places.internal.zzcbg zzcbgVar = new com.google.android.libraries.places.internal.zzcbg(zzbmlVar, zzbmgVar, this.zzq, this, this.zzr, obj2, this.zzz, this.zzn, this.zzj, this.zzk, zza2, this.zzS, zzbisVar, false);
                    return zzcbgVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                obj = obj2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        synchronized (this.zzs) {
            if (this.zzD != null) {
                return;
            }
            this.zzD = zzbnpVar;
            this.zzp.zzd(zzbnpVar);
            zzaf();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        zzd(zzbnpVar);
        synchronized (this.zzs) {
            java.util.Iterator it = this.zzv.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                it.remove();
                ((com.google.android.libraries.places.internal.zzcbg) entry.getValue()).zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, new com.google.android.libraries.places.internal.zzbmg());
                zzag((com.google.android.libraries.places.internal.zzcbg) entry.getValue());
            }
            java.util.Deque<com.google.android.libraries.places.internal.zzcbg> deque = this.zzN;
            for (com.google.android.libraries.places.internal.zzcbg zzcbgVar : deque) {
                zzcbgVar.zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.MISCARRIED, true, new com.google.android.libraries.places.internal.zzbmg());
                zzag(zzcbgVar);
            }
            deque.clear();
            zzaf();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcau
    public final void zzg(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th, "failureCause");
        zzu(0, com.google.android.libraries.places.internal.zzccv.INTERNAL_ERROR, com.google.android.libraries.places.internal.zzbnp.zzi.zzd(th));
    }

    final void zzi(com.google.android.libraries.places.internal.zzcbg zzcbgVar, java.lang.String str) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        com.google.android.libraries.places.internal.zzbnp zzbnpVar2 = this.zzD;
        if (zzbnpVar2 != null) {
            zzcbgVar.zzy().zzg(zzbnpVar2, com.google.android.libraries.places.internal.zzbpm.MISCARRIED, true, new com.google.android.libraries.places.internal.zzbmg());
            return;
        }
        if ((this.zzL instanceof javax.net.ssl.SSLSocket) && !str.equals(this.zzj)) {
            java.util.Map map = this.zzT;
            if (map.containsKey(str)) {
                zzbnpVar = (com.google.android.libraries.places.internal.zzbnp) map.get(str);
            } else {
                com.google.android.libraries.places.internal.zzbnp zze2 = this.zzK.verify(str, ((javax.net.ssl.SSLSocket) this.zzL).getSession()) ? com.google.android.libraries.places.internal.zzbnp.zza : com.google.android.libraries.places.internal.zzbnp.zzi.zze(java.lang.String.format("HostNameVerifier verification failed for authority '%s'", str));
                if (!zze2.zzj() && !zza) {
                    zzf.logp(java.util.logging.Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", java.lang.String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
                }
                if (zze2.zzj()) {
                    zze2 = com.google.android.libraries.places.internal.zzbnp.zzi.zze(java.lang.String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str));
                }
                map.put(str, zze2);
                zzbnpVar = zze2;
            }
            if (!zzbnpVar.zzj() && zza) {
                zzcbgVar.zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, true, new com.google.android.libraries.places.internal.zzbmg());
                return;
            }
        }
        if (this.zzv.size() < this.zzM) {
            zzab(zzcbgVar);
        } else {
            this.zzN.add(zzcbgVar);
            zzah(zzcbgVar);
        }
    }

    final void zzj(com.google.android.libraries.places.internal.zzcbg zzcbgVar) {
        this.zzN.remove(zzcbgVar);
        zzag(zzcbgVar);
    }

    final java.lang.String zzk() {
        java.lang.String str = this.zzj;
        java.net.URI zzb = com.google.android.libraries.places.internal.zzbsz.zzb(str);
        return zzb.getHost() != null ? zzb.getHost() : str;
    }

    final int zzl() {
        java.net.URI zzb = com.google.android.libraries.places.internal.zzbsz.zzb(this.zzj);
        return zzb.getPort() != -1 ? zzb.getPort() : this.zzi.getPort();
    }

    @Override // com.google.android.libraries.places.internal.zzccb
    public final com.google.android.libraries.places.internal.zzcca[] zzm() {
        com.google.android.libraries.places.internal.zzcca[] zzccaVarArr;
        synchronized (this.zzs) {
            java.util.Map map = this.zzv;
            zzccaVarArr = new com.google.android.libraries.places.internal.zzcca[map.size()];
            java.util.Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                zzccaVarArr[i] = ((com.google.android.libraries.places.internal.zzcbg) it.next()).zzy().zzK();
                i++;
            }
        }
        return zzccaVarArr;
    }

    final void zzn(int i, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, boolean z, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzccv zzccvVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        synchronized (this.zzs) {
            com.google.android.libraries.places.internal.zzcbg zzcbgVar = (com.google.android.libraries.places.internal.zzcbg) this.zzv.remove(java.lang.Integer.valueOf(i));
            if (zzcbgVar != null) {
                if (zzccvVar != null) {
                    this.zzq.zzb(i, com.google.android.libraries.places.internal.zzccv.CANCEL);
                }
                if (zzbnpVar != null) {
                    com.google.android.libraries.places.internal.zzcbf zzy = zzcbgVar.zzy();
                    if (zzbmgVar == null) {
                        zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
                    }
                    zzy.zzg(zzbnpVar, zzbpmVar, z, zzbmgVar);
                }
                if (!zzr()) {
                    zzaf();
                }
                zzag(zzcbgVar);
            }
        }
    }

    final boolean zzo(int i) {
        boolean z;
        synchronized (this.zzs) {
            z = false;
            if (i < this.zzu && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    final com.google.android.libraries.places.internal.zzcbg zzp(int i) {
        com.google.android.libraries.places.internal.zzcbg zzcbgVar;
        synchronized (this.zzs) {
            zzcbgVar = (com.google.android.libraries.places.internal.zzcbg) this.zzv.get(java.lang.Integer.valueOf(i));
        }
        return zzcbgVar;
    }

    final /* synthetic */ java.net.Socket zzs(java.net.InetSocketAddress inetSocketAddress, java.net.InetSocketAddress inetSocketAddress2, java.lang.String str, java.lang.String str2) {
        java.net.Socket socket;
        int i;
        java.lang.String str3;
        try {
            socket = inetSocketAddress2.getAddress() != null ? this.zzI.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.zzI.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
        } catch (java.io.IOException e) {
            e = e;
            socket = null;
        }
        try {
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(this.zzc);
            com.google.android.libraries.places.internal.zzcfv zzb = com.google.android.libraries.places.internal.zzcfl.zzb(socket);
            com.google.android.libraries.places.internal.zzcfg zzd2 = com.google.android.libraries.places.internal.zzcfl.zzd(com.google.android.libraries.places.internal.zzcfl.zza(socket));
            com.google.android.libraries.places.internal.zzcdm zzcdmVar = new com.google.android.libraries.places.internal.zzcdm();
            zzcdmVar.zza("https");
            zzcdmVar.zzb(inetSocketAddress.getHostName());
            zzcdmVar.zzc(inetSocketAddress.getPort());
            com.google.android.libraries.places.internal.zzcdn zze2 = zzcdmVar.zze();
            com.google.android.libraries.places.internal.zzcdo zzcdoVar = new com.google.android.libraries.places.internal.zzcdo();
            zzcdoVar.zza(zze2);
            java.lang.String zza2 = zze2.zza();
            int zzb2 = zze2.zzb();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 1 + java.lang.String.valueOf(zzb2).length());
            sb.append(zza2);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(zzb2);
            zzcdoVar.zzb(com.google.common.net.HttpHeaders.HOST, sb.toString());
            zzcdoVar.zzb("User-Agent", this.zzk);
            if (str != null && str2 != null) {
                try {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 1 + str2.length());
                    sb2.append(str);
                    sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb2.append(str2);
                    java.lang.String zzf2 = com.google.android.libraries.places.internal.zzcfi.zzb(sb2.toString().getBytes("ISO-8859-1")).zzf();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(zzf2.length() + 6);
                    sb3.append("Basic ");
                    sb3.append(zzf2);
                    zzcdoVar.zzb(com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, sb3.toString());
                } catch (java.io.UnsupportedEncodingException unused) {
                    throw new java.lang.AssertionError();
                }
            }
            com.google.android.libraries.places.internal.zzcdp zzc = zzcdoVar.zzc();
            com.google.android.libraries.places.internal.zzcdn zza3 = zzc.zza();
            zzd2.zzH(java.lang.String.format(java.util.Locale.US, "CONNECT %s:%d HTTP/1.1", zza3.zza(), java.lang.Integer.valueOf(zza3.zzb()))).zzH(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            int zza4 = zzc.zzb().zza();
            for (int i2 = 0; i2 < zza4; i2++) {
                zzd2.zzH(zzc.zzb().zzb(i2)).zzH(": ").zzH(zzc.zzb().zzc(i2)).zzH(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            }
            zzd2.zzH(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            zzd2.flush();
            java.lang.String zzad = zzad(zzb);
            if (zzad.startsWith("HTTP/1.")) {
                i = 9;
                if (zzad.length() < 9 || zzad.charAt(8) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
                }
                int charAt = zzad.charAt(7) - '0';
                if (charAt != 0 && charAt != 1) {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
                }
            } else {
                if (!zzad.startsWith("ICY ")) {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
                }
                i = 4;
            }
            int i3 = i + 3;
            if (zzad.length() < i3) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
            }
            try {
                int parseInt = java.lang.Integer.parseInt(zzad.substring(i, i3));
                if (zzad.length() <= i3) {
                    str3 = "";
                } else {
                    if (zzad.charAt(i3) != ' ') {
                        throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
                    }
                    str3 = zzad.substring(i + 4);
                }
                while (!zzad(zzb).equals("")) {
                }
                if (parseInt >= 200 && parseInt < 300) {
                    socket.setSoTimeout(0);
                    return socket;
                }
                com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
                try {
                    socket.shutdownOutput();
                    zzb.zza(zzcffVar, okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                } catch (java.io.IOException e2) {
                    java.lang.String obj = e2.toString();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 21);
                    sb4.append("Unable to read body: ");
                    sb4.append(obj);
                    zzcffVar.zzv(sb4.toString());
                }
                try {
                    socket.close();
                } catch (java.io.IOException unused2) {
                }
                throw new com.google.android.libraries.places.internal.zzbnq(com.google.android.libraries.places.internal.zzbnp.zzi.zze(java.lang.String.format(java.util.Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", java.lang.Integer.valueOf(parseInt), str3, zzcffVar.zzo())), null);
            } catch (java.lang.NumberFormatException unused3) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(zzad));
            }
        } catch (java.io.IOException e3) {
            e = e3;
            if (socket != null) {
                com.google.android.libraries.places.internal.zzbsz.zzh(socket);
            }
            throw new com.google.android.libraries.places.internal.zzbnq(com.google.android.libraries.places.internal.zzbnp.zzi.zze("Failed trying to connect with proxy").zzd(e), null);
        }
    }

    final /* synthetic */ void zzt(com.google.android.libraries.places.internal.zzccv zzccvVar, java.lang.String str) {
        zzu(0, zzccvVar, zzq(zzccvVar).zzf(str));
    }

    final /* synthetic */ void zzz(javax.net.ssl.SSLSession sSLSession) {
        this.zzh = sSLSession;
    }

    final /* synthetic */ javax.net.ssl.SSLSession zzy() {
        return this.zzh;
    }

    final /* synthetic */ void zzx(java.net.Socket socket) {
        this.zzg = socket;
    }

    final /* synthetic */ java.net.Socket zzw() {
        return this.zzg;
    }

    final boolean zzh() {
        return this.zzJ == null;
    }

    @Override // com.google.android.libraries.places.internal.zzbqa
    public final com.google.android.libraries.places.internal.zzbio zzf() {
        return this.zzC;
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        return this.zzt;
    }

    final /* synthetic */ int zzaa() {
        return this.zzR;
    }

    final /* synthetic */ java.lang.Runnable zzZ() {
        return this.zzQ;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbue zzY() {
        return this.zzP;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcch zzX() {
        return this.zzO;
    }

    final /* synthetic */ void zzW(int i) {
        this.zzM = i;
    }

    final /* synthetic */ void zzV(java.net.Socket socket) {
        this.zzL = socket;
    }

    final /* synthetic */ javax.net.ssl.HostnameVerifier zzU() {
        return this.zzK;
    }

    final /* synthetic */ javax.net.ssl.SSLSocketFactory zzT() {
        return this.zzJ;
    }

    final /* synthetic */ javax.net.SocketFactory zzS() {
        return this.zzI;
    }

    final /* synthetic */ void zzR(com.google.android.libraries.places.internal.zzbtd zzbtdVar) {
        this.zzF = null;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbtd zzQ() {
        return this.zzF;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zzP() {
        return this.zzD;
    }

    final /* synthetic */ void zzO(com.google.android.libraries.places.internal.zzbio zzbioVar) {
        this.zzC = zzbioVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbio zzN() {
        return this.zzC;
    }

    final /* synthetic */ void zzM(com.google.android.libraries.places.internal.zzcbn zzcbnVar) {
        this.zzB = zzcbnVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcbn zzL() {
        return this.zzB;
    }

    final /* synthetic */ void zzK(int i) {
        this.zzA = i;
    }

    final /* synthetic */ int zzJ() {
        return this.zzA;
    }

    final /* synthetic */ java.util.concurrent.Executor zzI() {
        return this.zzw;
    }

    final /* synthetic */ java.util.Map zzH() {
        return this.zzv;
    }

    final /* synthetic */ java.lang.Object zzG() {
        return this.zzs;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzccd zzF() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcav zzE() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwc zzD() {
        return this.zzp;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcdl zzC() {
        return this.zzo;
    }

    final /* synthetic */ int zzB() {
        return this.zzn;
    }

    final /* synthetic */ java.net.InetSocketAddress zzA() {
        return this.zzi;
    }
}
