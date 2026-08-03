package com.ironsource;

/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class CallableC3233q3 implements java.util.concurrent.Callable<com.ironsource.C3304u3> {

    /* renamed from: a, reason: collision with root package name */
    private final int f6567a;
    private final java.lang.String b;
    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdData c;
    private final com.ironsource.InterfaceC3268s3 d;
    private final com.ironsource.InterfaceC3250r3 e;
    private final com.ironsource.mediationsdk.model.NetworkSettings f;

    /* renamed from: com.ironsource.q3$a */
    class a implements com.ironsource.mediationsdk.bidding.BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3056g5 f6568a;
        final /* synthetic */ java.util.concurrent.BlockingQueue b;

        a(com.ironsource.C3056g5 c3056g5, java.util.concurrent.BlockingQueue blockingQueue) {
            this.f6568a = c3056g5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(java.lang.String str) {
            this.b.add(new com.ironsource.C3304u3(com.ironsource.CallableC3233q3.this.d(), com.ironsource.CallableC3233q3.this.c(), null, com.ironsource.C3056g5.a(this.f6568a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.b.add(new com.ironsource.C3304u3(com.ironsource.CallableC3233q3.this.d(), com.ironsource.CallableC3233q3.this.c(), map, com.ironsource.C3056g5.a(this.f6568a), null));
        }
    }

    public CallableC3233q3(int i, java.lang.String str, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, com.ironsource.InterfaceC3268s3 interfaceC3268s3, com.ironsource.InterfaceC3250r3 interfaceC3250r3, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        this.f6567a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC3268s3;
        this.e = interfaceC3250r3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.ironsource.C3304u3 call() throws java.lang.Exception {
        com.ironsource.C3056g5 c3056g5 = new com.ironsource.C3056g5();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, com.ironsource.environment.ContextProvider.getInstance().getActiveContext(), new com.ironsource.CallableC3233q3.a(c3056g5, arrayBlockingQueue));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.String str = "Exception while calling collectBiddingData - " + e.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
            com.ironsource.InterfaceC3250r3 interfaceC3250r3 = this.e;
            if (interfaceC3250r3 != null) {
                interfaceC3250r3.a(str);
            }
        } catch (java.lang.NoClassDefFoundError e2) {
            com.ironsource.C3180n4.d().a(e2);
            java.lang.String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str2);
            com.ironsource.InterfaceC3250r3 interfaceC3250r32 = this.e;
            if (interfaceC3250r32 != null) {
                interfaceC3250r32.a(str2);
            }
        }
        com.ironsource.InterfaceC3250r3 interfaceC3250r33 = this.e;
        if (interfaceC3250r33 != null) {
            interfaceC3250r33.a(this.f);
        }
        return (com.ironsource.C3304u3) arrayBlockingQueue.take();
    }

    public com.ironsource.InterfaceC3268s3 b() {
        return this.d;
    }

    public java.lang.String c() {
        return this.b;
    }

    public int d() {
        return this.f6567a;
    }
}
