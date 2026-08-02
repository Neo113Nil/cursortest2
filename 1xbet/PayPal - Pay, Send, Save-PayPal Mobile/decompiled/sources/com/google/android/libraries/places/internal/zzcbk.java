package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbk implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.CountDownLatch zza;
    final /* synthetic */ java.util.concurrent.CyclicBarrier zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzcat zzc;
    final /* synthetic */ java.util.concurrent.CountDownLatch zzd;
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbp zze;

    zzcbk(com.google.android.libraries.places.internal.zzcbp zzcbpVar, java.util.concurrent.CountDownLatch countDownLatch, java.util.concurrent.CyclicBarrier cyclicBarrier, com.google.android.libraries.places.internal.zzcat zzcatVar, java.util.concurrent.CountDownLatch countDownLatch2) {
        this.zza = countDownLatch;
        this.zzb = cyclicBarrier;
        this.zzc = zzcatVar;
        this.zzd = countDownLatch2;
        java.util.Objects.requireNonNull(zzcbpVar);
        this.zze = zzcbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzcbp zzcbpVar;
        com.google.android.libraries.places.internal.zzcbn zzcbnVar;
        com.google.android.libraries.places.internal.zzcfh zzc = com.google.android.libraries.places.internal.zzcfl.zzc(new com.google.android.libraries.places.internal.zzcbj(this));
        try {
            try {
                try {
                    this.zza.await();
                    this.zzb.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zze;
                    zzcbpVar2.zzM(new com.google.android.libraries.places.internal.zzcbn(zzcbpVar2, zzcbpVar2.zzC().zza(zzc, true)));
                    this.zzd.countDown();
                    throw th;
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.BrokenBarrierException | java.util.concurrent.TimeoutException unused2) {
                zzcbpVar = this.zze;
                zzcbpVar.zzu(0, com.google.android.libraries.places.internal.zzccv.INTERNAL_ERROR, com.google.android.libraries.places.internal.zzbnp.zzi.zze("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                zzcbnVar = new com.google.android.libraries.places.internal.zzcbn(zzcbpVar, zzcbpVar.zzC().zza(zzc, true));
                zzcbpVar.zzM(zzcbnVar);
                this.zzd.countDown();
            }
            com.google.android.libraries.places.internal.zzcbp zzcbpVar3 = this.zze;
            com.google.android.libraries.places.internal.zzbki zzbkiVar = zzcbpVar3.zzb;
            if (zzbkiVar == null) {
                zzcbpVar3.zzx(zzcbpVar3.zzS().createSocket(zzcbpVar3.zzA().getAddress(), zzcbpVar3.zzA().getPort()));
            } else {
                if (!(zzbkiVar.zzc() instanceof java.net.InetSocketAddress)) {
                    com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzh;
                    java.lang.String valueOf = java.lang.String.valueOf(zzbkiVar.zzc().getClass());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 41);
                    sb.append("Unsupported SocketAddress implementation ");
                    sb.append(valueOf);
                    throw new com.google.android.libraries.places.internal.zzbnq(zzbnpVar.zze(sb.toString()), null);
                }
                zzcbpVar3.zzx(zzcbpVar3.zzs(zzbkiVar.zzd(), (java.net.InetSocketAddress) zzbkiVar.zzc(), zzbkiVar.zzb(), zzbkiVar.zza()));
            }
            if (zzcbpVar3.zzT() != null) {
                javax.net.ssl.SSLSocketFactory zzT = zzcbpVar3.zzT();
                javax.net.ssl.HostnameVerifier zzU = zzcbpVar3.zzU();
                java.net.Socket zzw = zzcbpVar3.zzw();
                java.lang.String zzk = zzcbpVar3.zzk();
                int zzl = zzcbpVar3.zzl();
                com.google.android.libraries.places.internal.zzcch zzX = zzcbpVar3.zzX();
                com.google.common.base.Preconditions.checkNotNull(zzT, "sslSocketFactory");
                com.google.common.base.Preconditions.checkNotNull(zzw, "socket");
                com.google.common.base.Preconditions.checkNotNull(zzX, "spec");
                javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) zzT.createSocket(zzw, zzk, zzl, true);
                zzX.zzb(sSLSocket, false);
                java.lang.String zza = com.google.android.libraries.places.internal.zzcbu.zzd().zza(sSLSocket, zzk, zzX.zza() ? com.google.android.libraries.places.internal.zzcbw.zza : null);
                java.util.List list = com.google.android.libraries.places.internal.zzcbw.zza;
                boolean contains = list.contains(com.google.android.libraries.places.internal.zzccs.zza(zza));
                java.lang.String valueOf2 = java.lang.String.valueOf(list);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 50);
                sb2.append("Only ");
                sb2.append(valueOf2);
                sb2.append(" are supported, but negotiated protocol is %s");
                com.google.common.base.Preconditions.checkState(contains, sb2.toString(), zza);
                if (!zzU.verify((zzk.startsWith("[") && zzk.endsWith("]")) ? zzk.substring(1, zzk.length() - 1) : zzk, sSLSocket.getSession())) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Cannot verify hostname: ".concat(java.lang.String.valueOf(zzk)));
                }
                zzcbpVar3.zzz(sSLSocket.getSession());
                zzcbpVar3.zzx(sSLSocket);
            }
            zzcbpVar3.zzw().setTcpNoDelay(true);
            com.google.android.libraries.places.internal.zzcfh zzc2 = com.google.android.libraries.places.internal.zzcfl.zzc(com.google.android.libraries.places.internal.zzcfl.zzb(zzcbpVar3.zzw()));
            this.zzc.zzb(com.google.android.libraries.places.internal.zzcfl.zza(zzcbpVar3.zzw()), zzcbpVar3.zzw());
            com.google.android.libraries.places.internal.zzbim zzc3 = zzcbpVar3.zzN().zzc();
            zzc3.zza(com.google.android.libraries.places.internal.zzbkg.zza, zzcbpVar3.zzw().getRemoteSocketAddress());
            zzc3.zza(com.google.android.libraries.places.internal.zzbkg.zzb, zzcbpVar3.zzw().getLocalSocketAddress());
            zzc3.zza(com.google.android.libraries.places.internal.zzbkg.zzc, zzcbpVar3.zzy());
            zzc3.zza(com.google.android.libraries.places.internal.zzbsr.zza, zzcbpVar3.zzy() == null ? com.google.android.libraries.places.internal.zzbni.NONE : com.google.android.libraries.places.internal.zzbni.PRIVACY_AND_INTEGRITY);
            zzcbpVar3.zzO(zzc3.zzc());
            zzcbpVar3.zzM(new com.google.android.libraries.places.internal.zzcbn(zzcbpVar3, zzcbpVar3.zzC().zza(zzc2, true)));
            this.zzd.countDown();
            synchronized (zzcbpVar3.zzG()) {
                zzcbpVar3.zzV((java.net.Socket) com.google.common.base.Preconditions.checkNotNull(zzcbpVar3.zzw(), "socket"));
                if (zzcbpVar3.zzy() != null) {
                }
            }
        } catch (com.google.android.libraries.places.internal.zzbnq e) {
            this.zze.zzu(0, com.google.android.libraries.places.internal.zzccv.INTERNAL_ERROR, e.zza());
            zzcbpVar = this.zze;
            zzcbnVar = new com.google.android.libraries.places.internal.zzcbn(zzcbpVar, zzcbpVar.zzC().zza(zzc, true));
            zzcbpVar.zzM(zzcbnVar);
            this.zzd.countDown();
        } catch (java.lang.Exception e2) {
            zzcbpVar = this.zze;
            zzcbpVar.zzg(e2);
            zzcbnVar = new com.google.android.libraries.places.internal.zzcbn(zzcbpVar, zzcbpVar.zzC().zza(zzc, true));
            zzcbpVar.zzM(zzcbnVar);
            this.zzd.countDown();
        }
    }
}
