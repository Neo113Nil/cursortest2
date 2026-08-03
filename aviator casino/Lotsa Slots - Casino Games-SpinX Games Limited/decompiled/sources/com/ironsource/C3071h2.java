package com.ironsource;

/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3071h2 implements com.ironsource.Uc {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f6282a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C3071h2(com.ironsource.V0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f6282a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Uc
    public void a(com.ironsource.B instance, java.lang.String str, com.ironsource.C3150la publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Uc
    public void a(java.util.List<? extends com.ironsource.B> waterfallInstances, com.ironsource.B winnerInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        com.ironsource.C3232q2 h = winnerInstance.h();
        this.b.a(h, winnerInstance.r(), winnerInstance.m());
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C3232q2> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        for (com.ironsource.B b : waterfallInstances) {
            arrayList.add(b.p());
            concurrentHashMap.put(b.p(), b.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), h);
    }

    private final void a(com.ironsource.C3150la c3150la, com.ironsource.B b) {
        final com.ironsource.V8 v8 = new com.ironsource.V8(b.e());
        for (final com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener : new java.util.HashSet(c3150la.a())) {
            this.f6282a.e(new java.lang.Runnable() { // from class: com.ironsource.h2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3071h2.a(com.ironsource.C3071h2.this, impressionDataListener, v8);
                }
            });
            this.f6282a.e().h().a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3071h2 this$0, com.ironsource.mediationsdk.impressionData.ImpressionDataListener listener, com.ironsource.V8 impressionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.verbose(com.ironsource.C3212p0.a(this$0.f6282a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (java.lang.String) null, 2, (java.lang.Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
