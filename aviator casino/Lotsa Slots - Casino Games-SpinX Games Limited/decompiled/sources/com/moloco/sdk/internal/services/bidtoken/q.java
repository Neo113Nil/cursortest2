package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.bidtoken.q.a f7246a = com.moloco.sdk.internal.services.bidtoken.q.a.f7247a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.q.a f7247a = new com.moloco.sdk.internal.services.bidtoken.q.a();

        public final com.moloco.sdk.internal.services.bidtoken.q a() {
            return new com.moloco.sdk.internal.services.bidtoken.r(com.moloco.sdk.service_locator.a.h.f7349a.i(), com.moloco.sdk.internal.services.bidtoken.o.f7231a.a(), com.moloco.sdk.internal.services.encryption.a.f7265a.a(), com.moloco.sdk.internal.services.bidtoken.providers.l.f7239a.a());
        }
    }

    java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, com.moloco.sdk.internal.services.bidtoken.f fVar, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation);
}
