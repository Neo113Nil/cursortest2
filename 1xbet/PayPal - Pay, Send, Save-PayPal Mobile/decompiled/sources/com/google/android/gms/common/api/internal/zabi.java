package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public final class zabi implements com.google.android.gms.common.api.internal.zaca, com.google.android.gms.common.api.internal.zau {
    final java.util.Map zaa;
    final com.google.android.gms.common.internal.ClientSettings zac;
    final java.util.Map zad;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder zae;
    int zaf;
    final com.google.android.gms.common.api.internal.zabe zag;
    final com.google.android.gms.common.api.internal.zabz zah;
    private final java.util.concurrent.locks.Lock zai;
    private final java.util.concurrent.locks.Condition zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zal;
    private final com.google.android.gms.common.api.internal.zabh zam;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private volatile com.google.android.gms.common.api.internal.zabf zan;
    final java.util.Map zab = new java.util.HashMap();
    private com.google.android.gms.common.ConnectionResult zao = null;

    public zabi(android.content.Context context, com.google.android.gms.common.api.internal.zabe zabeVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map map2, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.ArrayList arrayList, com.google.android.gms.common.api.internal.zabz zabzVar) {
        this.zak = context;
        this.zai = lock;
        this.zal = googleApiAvailabilityLight;
        this.zaa = map;
        this.zac = clientSettings;
        this.zad = map2;
        this.zae = abstractClientBuilder;
        this.zag = zabeVar;
        this.zah = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.common.api.internal.zat) arrayList.get(i)).zaa(this);
        }
        this.zam = new com.google.android.gms.common.api.internal.zabh(this, looper);
        this.zaj = lock.newCondition();
        this.zan = new com.google.android.gms.common.api.internal.zaax(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zai.lock();
        try {
            this.zan.zag(bundle);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zai.lock();
        try {
            this.zan.zai(i);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        this.zai.lock();
        try {
            this.zan.zah(connectionResult, api, z);
        } finally {
            this.zai.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zab() {
        zaq();
        while (this.zan instanceof com.google.android.gms.common.api.internal.zaaw) {
            try {
                this.zaj.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
        }
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaaj) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zac(long j, java.util.concurrent.TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j);
        while (this.zan instanceof com.google.android.gms.common.api.internal.zaaw) {
            if (nanos <= 0) {
                zar();
                return new com.google.android.gms.common.ConnectionResult(14, null);
            }
            try {
                nanos = this.zaj.awaitNanos(nanos);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return new com.google.android.gms.common.ConnectionResult(15, null);
            }
            java.lang.Thread.currentThread().interrupt();
            return new com.google.android.gms.common.ConnectionResult(15, null);
        }
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaaj) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zao;
        return connectionResult != null ? connectionResult : new com.google.android.gms.common.ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api api) {
        java.util.Map map = this.zaa;
        com.google.android.gms.common.api.Api.AnyClientKey zab = api.zab();
        if (!map.containsKey(zab)) {
            return null;
        }
        if (((com.google.android.gms.common.api.Api.Client) this.zaa.get(zab)).isConnected()) {
            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
        }
        if (this.zab.containsKey(zab)) {
            return (com.google.android.gms.common.ConnectionResult) this.zab.get(zab);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zan.zaa(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.zan.zab(apiMethodImpl);
    }

    final void zai() {
        this.zai.lock();
        try {
            this.zag.zak();
            this.zan = new com.google.android.gms.common.api.internal.zaaj(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zaj() {
        this.zai.lock();
        try {
            this.zan = new com.google.android.gms.common.api.internal.zaaw(this, this.zac, this.zad, this.zal, this.zae, this.zai, this.zak);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zak(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zai.lock();
        try {
            this.zao = connectionResult;
            this.zan = new com.google.android.gms.common.api.internal.zaax(this);
            this.zan.zad();
            this.zaj.signalAll();
        } finally {
            this.zai.unlock();
        }
    }

    final void zal(com.google.android.gms.common.api.internal.zabg zabgVar) {
        com.google.android.gms.common.api.internal.zabh zabhVar = this.zam;
        zabhVar.sendMessage(zabhVar.obtainMessage(1, zabgVar));
    }

    final void zam(java.lang.RuntimeException runtimeException) {
        com.google.android.gms.common.api.internal.zabh zabhVar = this.zam;
        zabhVar.sendMessage(zabhVar.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        if (this.zan.zaj()) {
            this.zab.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("mState=").println(this.zan);
        for (com.google.android.gms.common.api.Api api : this.zad.keySet()) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            printWriter.append((java.lang.CharSequence) str).append((java.lang.CharSequence) api.zad()).println(io.ktor.sse.ServerSentEventKt.COLON);
            ((com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.Api.Client) this.zaa.get(api.zab()))).dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        if (this.zan instanceof com.google.android.gms.common.api.internal.zaaj) {
            ((com.google.android.gms.common.api.internal.zaaj) this.zan).zaf();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.zan instanceof com.google.android.gms.common.api.internal.zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.zan instanceof com.google.android.gms.common.api.internal.zaaj;
    }
}
