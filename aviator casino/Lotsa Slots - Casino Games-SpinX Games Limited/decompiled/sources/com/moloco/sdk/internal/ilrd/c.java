package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public final class c {
    public static final com.moloco.sdk.internal.ilrd.c.a c = new com.moloco.sdk.internal.ilrd.c.a(null);
    public static final int d = 8;
    public static final java.lang.String e = "IlrdInitializer";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6984a;
    public com.moloco.sdk.internal.ilrd.f b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6984a = context;
    }

    public final com.moloco.sdk.internal.ilrd.f a() {
        return this.b;
    }

    public final java.lang.Object b(com.moloco.sdk.Init.SDKInitResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        if (this.b != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        }
        com.moloco.sdk.Init.SDKInitResponse.ILRDConfig a2 = a(response);
        if (a2 == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("No ILRD configuration found")));
        }
        java.util.List<com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> supportedNetworksList = a2.getSupportedNetworksList();
        if (!a2.getEnabled()) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Publisher has not opted into ILRD collection")));
        }
        if (supportedNetworksList.isEmpty()) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("No ILRD supported networks available")));
        }
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        com.moloco.sdk.internal.ilrd.b a3 = a(CoroutineScope, a2, response);
        kotlin.jvm.internal.Intrinsics.checkNotNull(supportedNetworksList);
        a(CoroutineScope, a3, supportedNetworksList);
        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
    }

    public final com.moloco.sdk.Init.SDKInitResponse.ILRDConfig a(com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
        if (sDKInitResponse.hasIlrdConfig()) {
            return sDKInitResponse.getIlrdConfig();
        }
        return null;
    }

    public final com.moloco.sdk.internal.ilrd.b a(kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.Init.SDKInitResponse.ILRDConfig iLRDConfig, com.moloco.sdk.Init.SDKInitResponse sDKInitResponse) {
        java.lang.String rawImpUrl = iLRDConfig.getRawImpUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawImpUrl, "getRawImpUrl(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c2 = com.moloco.sdk.service_locator.a.i.f7350a.c();
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        int sessionExp = iLRDConfig.getSessionExp();
        kotlin.time.DurationUnit durationUnit = kotlin.time.DurationUnit.SECONDS;
        long duration = kotlin.time.DurationKt.toDuration(sessionExp, durationUnit);
        int maxBatchSize = iLRDConfig.getMaxBatchSize();
        long duration2 = kotlin.time.DurationKt.toDuration(iLRDConfig.getUploadInterval(), durationUnit);
        long duration3 = kotlin.time.DurationKt.toDuration(iLRDConfig.getMaxSessionLen(), durationUnit);
        com.moloco.sdk.service_locator.a.h hVar = com.moloco.sdk.service_locator.a.h.f7349a;
        com.moloco.sdk.internal.services.J i = hVar.i();
        androidx.lifecycle.Lifecycle lifecycle = androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
        com.moloco.sdk.internal.services.InterfaceC3433d d2 = hVar.d();
        java.lang.String publisherId = sDKInitResponse.getPublisherId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publisherId, "getPublisherId(...)");
        java.lang.String appId = sDKInitResponse.getAppId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appId, "getAppId(...)");
        return new com.moloco.sdk.internal.ilrd.b(coroutineScope, rawImpUrl, c2, duration, maxBatchSize, duration2, duration3, i, lifecycle, d2, publisherId, appId, com.moloco.sdk.service_locator.a.j.f7351a.b(), null, null, null, 57344, null);
    }

    public final com.moloco.sdk.internal.ilrd.f a(kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.internal.ilrd.b bVar, java.util.List<? extends com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> list) {
        com.moloco.sdk.internal.ilrd.f fVar = new com.moloco.sdk.internal.ilrd.f(coroutineScope, this.f6984a, bVar, list);
        this.b = fVar;
        fVar.c();
        return fVar;
    }
}
