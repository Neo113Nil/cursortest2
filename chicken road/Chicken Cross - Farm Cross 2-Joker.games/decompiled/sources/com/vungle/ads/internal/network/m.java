package com.vungle.ads.internal.network;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Call f12054a;
    public final com.vungle.ads.internal.network.converters.a b;

    static {
        new h();
    }

    public m(Call rawCall, com.vungle.ads.internal.network.converters.a responseConverter) {
        Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.f12054a = rawCall;
        this.b = responseConverter;
    }

    public final void a(a callback) {
        Call call;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this) {
            call = this.f12054a;
            Unit unit = Unit.INSTANCE;
        }
        call.enqueue(new l(this, callback));
    }

    public final o a() {
        Call call;
        Object m8079constructorimpl;
        synchronized (this) {
            call = this.f12054a;
            Unit unit = Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(a(call.execute()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("OkHttpCall", com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ").append(m8082exceptionOrNullimpl.getLocalizedMessage()).toString());
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        return (o) m8079constructorimpl;
    }

    public final o a(Response response) {
        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }
        Response build = response.newBuilder().body(new k(body.get$contentType(), body.getContentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                j jVar = new j(body);
                try {
                    return n.a(this.b.a(jVar), build);
                } catch (Throwable th) {
                    jVar.a();
                    throw th;
                }
            }
            body.close();
            return n.a(null, build);
        }
        try {
            Buffer buffer = new Buffer();
            body.getSource().readAll(buffer);
            ResponseBody.INSTANCE.create(buffer, body.get$contentType(), body.getContentLength());
            o a2 = n.a(build);
            CloseableKt.closeFinally(body, null);
            return a2;
        } finally {
        }
    }
}
