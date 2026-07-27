package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;

/* renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3852kg {

    /* renamed from: a, reason: collision with root package name */
    public final C3733ga f7204a;

    public C3852kg(AdConfig.PingsV2Config pingsConfig) {
        Intrinsics.checkNotNullParameter(pingsConfig, "pingsConfig");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(pingsConfig.getMaxBatchSize().getHigh());
        dispatcher.setMaxRequestsPerHost(pingsConfig.getMaxBatchSize().getHigh());
        Unit unit = Unit.INSTANCE;
        this.f7204a = C3676ea.a(null, dispatcher, null, new Cm(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()), 5);
    }

    public final Object a(Vg vg, ContinuationImpl continuationImpl) {
        HashMap hashMap = new HashMap(vg.c);
        hashMap.put("User-Agent", AbstractC3914mk.b());
        return this.f7204a.f7119a.a(new Kf(vg.f6913a, Li.a((Map) hashMap), null, null, null, vg.d, 28), continuationImpl);
    }
}
