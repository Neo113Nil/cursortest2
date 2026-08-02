package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcat implements com.google.android.libraries.places.internal.zzcft {
    private final com.google.android.libraries.places.internal.zzbzq zzc;
    private final com.google.android.libraries.places.internal.zzcau zzd;

    @javax.annotation.Nullable
    private com.google.android.libraries.places.internal.zzcft zzh;

    @javax.annotation.Nullable
    private java.net.Socket zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.libraries.places.internal.zzcff zzb = new com.google.android.libraries.places.internal.zzcff();
    private boolean zze = false;
    private boolean zzf = false;
    private boolean zzg = false;

    private zzcat(com.google.android.libraries.places.internal.zzbzq zzbzqVar, com.google.android.libraries.places.internal.zzcau zzcauVar, int i) {
        this.zzc = (com.google.android.libraries.places.internal.zzbzq) com.google.common.base.Preconditions.checkNotNull(zzbzqVar, "executor");
        this.zzd = (com.google.android.libraries.places.internal.zzcau) com.google.common.base.Preconditions.checkNotNull(zzcauVar, "exceptionHandler");
    }

    static com.google.android.libraries.places.internal.zzcat zza(com.google.android.libraries.places.internal.zzbzq zzbzqVar, com.google.android.libraries.places.internal.zzcau zzcauVar, int i) {
        return new com.google.android.libraries.places.internal.zzcat(zzbzqVar, zzcauVar, 10000);
    }

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzc.execute(new com.google.android.libraries.places.internal.zzcaq(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.zzg) {
            throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        synchronized (this.zza) {
            if (this.zzf) {
                return;
            }
            this.zzf = true;
            this.zzc.execute(new com.google.android.libraries.places.internal.zzcap(this));
        }
    }

    final void zzb(com.google.android.libraries.places.internal.zzcft zzcftVar, java.net.Socket socket) {
        com.google.common.base.Preconditions.checkState(this.zzh == null, "AsyncSink's becomeConnected should only be called once.");
        this.zzh = (com.google.android.libraries.places.internal.zzcft) com.google.common.base.Preconditions.checkNotNull(zzcftVar, "sink");
        this.zzi = (java.net.Socket) com.google.common.base.Preconditions.checkNotNull(socket, "socket");
    }

    @Override // com.google.android.libraries.places.internal.zzcft
    public final void zzc(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(zzcffVar, "source");
        if (this.zzg) {
            throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        synchronized (this.zza) {
            com.google.android.libraries.places.internal.zzcff zzcffVar2 = this.zzb;
            zzcffVar2.zzc(zzcffVar, j);
            int i = this.zzl + this.zzk;
            this.zzl = i;
            boolean z = false;
            this.zzk = 0;
            if (this.zzj || i <= 10000) {
                if (!this.zze && !this.zzf && zzcffVar2.zzi() > 0) {
                    this.zze = true;
                }
                return;
            }
            this.zzj = true;
            z = true;
            if (!z) {
                this.zzc.execute(new com.google.android.libraries.places.internal.zzcao(this));
                return;
            }
            try {
                this.zzi.close();
            } catch (java.io.IOException e) {
                this.zzd.zzg(e);
            }
        }
    }

    final /* synthetic */ void zzn(int i) {
        this.zzl = i;
    }

    final /* synthetic */ int zzm() {
        return this.zzl;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzk = i;
    }

    final /* synthetic */ int zzk() {
        return this.zzk;
    }

    final /* synthetic */ java.net.Socket zzj() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcft zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzf = false;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zze = false;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcau zzf() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcff zze() {
        return this.zzb;
    }

    final /* synthetic */ java.lang.Object zzd() {
        return this.zza;
    }
}
