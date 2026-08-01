package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3642d3 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final C3642d3 f7061a = new C3642d3();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String str = AbstractC3669e3.f7078a;
        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        String str2 = "Intercepting request " + request;
        try {
            Response proceed = chain.proceed(request);
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            String str3 = "Intercepting response " + proceed;
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            String str4 = "Broadcasted response " + request + ServerSentEventKt.SPACE + proceed;
            Intrinsics.checkNotNull(proceed);
            return proceed;
        } catch (Exception e) {
            String str5 = AbstractC3669e3.f7078a;
            String str6 = "Exception occurred while intercepting response " + request;
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            throw e;
        }
    }
}
