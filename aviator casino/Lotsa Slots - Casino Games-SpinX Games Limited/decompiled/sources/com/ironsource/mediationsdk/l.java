package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class l {
    private static final com.ironsource.mediationsdk.l f = new com.ironsource.mediationsdk.l();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Long> f6441a = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.Boolean> b = new java.util.HashMap();
    private int c;
    private int d;
    private int e;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.IronSource.a f6442a;
        final /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b;
        final /* synthetic */ java.lang.String c;

        a(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str) {
            this.f6442a = aVar;
            this.b = ironSourceError;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            com.ironsource.mediationsdk.l.this.a(this.f6442a, this.b);
            com.ironsource.mediationsdk.l.this.b.put(this.c, java.lang.Boolean.FALSE);
        }
    }

    private l() {
    }

    public static synchronized com.ironsource.mediationsdk.l a() {
        com.ironsource.mediationsdk.l lVar;
        synchronized (com.ironsource.mediationsdk.l.class) {
            lVar = f;
        }
        return lVar;
    }

    public synchronized void b(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        java.lang.String aVar2 = aVar.toString();
        if (!this.f6441a.containsKey(aVar2)) {
            a(aVar, ironSourceError);
            return;
        }
        long a2 = a(aVar) * 1000;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f6441a.get(aVar2).longValue();
        if (currentTimeMillis > a2) {
            a(aVar, ironSourceError);
            return;
        }
        this.b.put(aVar2, java.lang.Boolean.TRUE);
        long j = a2 - currentTimeMillis;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("delaying callback by " + j);
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.mediationsdk.l.a(aVar, ironSourceError, aVar2), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f6441a.put(aVar.toString(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            com.ironsource.Md.a().a(ironSourceError);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            com.ironsource.C2987c8.a().a(ironSourceError);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            com.ironsource.C3357x2.a().a(ironSourceError);
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public void a(com.ironsource.mediationsdk.IronSource.a aVar, int i) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            this.d = i;
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            this.c = i;
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            this.e = i;
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    private int a(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return this.d;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return this.c;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return this.e;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }

    public synchronized boolean b(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (!this.b.containsKey(aVar.toString())) {
            return false;
        }
        return this.b.get(aVar.toString()).booleanValue();
    }
}
