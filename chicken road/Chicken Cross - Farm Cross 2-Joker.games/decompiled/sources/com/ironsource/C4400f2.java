package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4400f2 implements Uc {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f8184a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C4400f2(T0 adTools, com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f8184a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Uc
    public void a(B instance, String str, C4515la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Uc
    public void a(List<? extends B> waterfallInstances, B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        C4561o2 h = winnerInstance.h();
        this.b.a(h, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4561o2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b : waterfallInstances) {
            arrayList.add(b.p());
            concurrentHashMap.put(b.p(), b.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), h);
    }

    private final void a(C4515la c4515la, B b) {
        final V8 v8 = new V8(b.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c4515la.a())) {
            this.f8184a.b(new Runnable() { // from class: com.ironsource.f2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4400f2.a(C4400f2.this, impressionDataListener, v8);
                }
            });
            this.f8184a.f().h().a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4400f2 this$0, ImpressionDataListener listener, V8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C4577p0.a(this$0.f8184a, "onImpressionSuccess " + listener.getClass().getSimpleName(), (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
