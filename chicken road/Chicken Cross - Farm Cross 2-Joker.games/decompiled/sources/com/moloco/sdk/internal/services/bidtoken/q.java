package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10767a = a.f10768a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10768a = new a();

        public final q a() {
            return new r(a.h.f10873a.i(), o.f10752a.a(), com.moloco.sdk.internal.services.encryption.a.f10786a.a(), com.moloco.sdk.internal.services.bidtoken.providers.l.f10760a.a());
        }
    }

    Object a(MetricsRecorder metricsRecorder, String str, f fVar, Continuation<? super Result<String>> continuation);
}
