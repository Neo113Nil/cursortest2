package com.google.android.gms.ads.identifier;

/* loaded from: classes.dex */
public final class b extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f2575c = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2576d = false;

    public b(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, long j2) {
        this.f2573a = new java.lang.ref.WeakReference(advertisingIdClient);
        this.f2574b = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient;
        java.lang.ref.WeakReference weakReference = this.f2573a;
        try {
            if (this.f2575c.await(this.f2574b, java.util.concurrent.TimeUnit.MILLISECONDS) || (advertisingIdClient = (com.google.android.gms.ads.identifier.AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f2576d = true;
        } catch (java.lang.InterruptedException unused) {
            com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient2 = (com.google.android.gms.ads.identifier.AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f2576d = true;
            }
        }
    }
}
