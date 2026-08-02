package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f10714a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10715b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f10716c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f10717d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j) {
        this.f10714a = new WeakReference(advertisingIdClient);
        this.f10715b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f10714a;
        try {
            if (this.f10716c.await(this.f10715b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f10717d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f10717d = true;
            }
        }
    }
}
