package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.init.g.a f7288a = com.moloco.sdk.internal.services.init.g.a.f7289a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.moloco.sdk.internal.services.init.g.a f7289a = new com.moloco.sdk.internal.services.init.g.a();

        public final com.moloco.sdk.internal.services.init.g a(android.content.SharedPreferences sharedPreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            return new com.moloco.sdk.internal.services.init.h(sharedPreferences, com.moloco.sdk.internal.scheduling.b.a().getIo());
        }
    }

    java.lang.Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.Init.SDKInitResponse sDKInitResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.Init.SDKInitResponse> continuation);

    java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object b(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
