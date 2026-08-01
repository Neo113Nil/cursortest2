package com.vungle.ads.internal.network;

import com.ironsource.C4761z5;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.q1;
import com.vungle.ads.internal.model.u1;
import com.vungle.ads.internal.model.w2;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes7.dex */
public final class e0 {
    public static final Json c = JsonKt.Json$default(null, b0.f12041a, 1, null);
    public static final Regex d = new Regex("[^\\t\\x20-\\x7E]");

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f12047a;
    public final com.vungle.ads.internal.network.converters.b b;

    public e0(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f12047a = okHttpClient;
        this.b = new com.vungle.ads.internal.network.converters.b();
    }

    public final m b(String ua, String path, u1 body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new m(this.f12047a.newCall(a(this, ua, path, null, null, 12).post(RequestBody.INSTANCE.create(json.encodeToString(serializer, body), (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(Reflection.typeOf(w2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m c(String ua, String path, u1 body) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return new m(this.f12047a.newCall(a(this, ua, path, null, null, 12).post(RequestBody.INSTANCE.create(json.encodeToString(serializer, body), (MediaType) null)).build()), this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Request.Builder a(e0 e0Var, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        e0Var.getClass();
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", c0.a(str)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", C4761z5.M);
        if (map != null) {
            Headers.Builder builder = new Headers.Builder();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    builder.add((String) entry.getKey(), c0.a((String) entry.getValue()));
                } catch (IllegalArgumentException unused) {
                    boolean z = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.a("VungleApiImpl", d0.f12045a);
                }
            }
            addHeader.headers(builder.build());
        }
        if (str3 != null) {
            addHeader.addHeader("X-Vungle-Placement-Ref-Id", c0.a(str3));
        }
        String c2 = f0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(c2));
        }
        String b = f0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", c0.a(b));
        }
        return addHeader;
    }

    public final m b(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Request.Builder addHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(path).newBuilder().build()).addHeader("User-Agent", c0.a(ua)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = f0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", c0.a(b));
        }
        String c2 = f0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(c2));
        }
        return new m(this.f12047a.newCall(addHeader.post(requestBody).build()), this.b);
    }

    public final m a(String ua, String path, u1 body) {
        List a2;
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json = c;
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String encodeToString = json.encodeToString(serializer, body);
            q1 c2 = body.c();
            return new m(this.f12047a.newCall(a(this, ua, path, (c2 == null || (a2 = c2.a()) == null) ? null : (String) CollectionsKt.firstOrNull(a2), null, 8).post(RequestBody.INSTANCE.create(encodeToString, (MediaType) null)).build()), new com.vungle.ads.internal.network.converters.d(Reflection.typeOf(i0.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final m a(String ua, String url, g requestType, Map map, RequestBody requestBody) {
        Request build;
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Request.Builder a2 = a(this, ua, url, null, map, 4);
        int ordinal = requestType.ordinal();
        if (ordinal == 0) {
            build = a2.get().build();
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestBody == null) {
                requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 6, (Object) null);
            }
            build = a2.post(requestBody).build();
        }
        return new m(this.f12047a.newCall(build), this.b);
    }

    public final m a(String ua, String path, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(ua, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Request.Builder addHeader = new Request.Builder().url(HttpUrl.INSTANCE.get(path).newBuilder().build()).addHeader("User-Agent", c0.a(ua)).addHeader("Vungle-Version", "7.1.0").addHeader("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String b = f0.b();
        if (b != null) {
            addHeader.addHeader("X-Vungle-App-Id", c0.a(b));
        }
        String c2 = f0.c();
        if (c2 != null) {
            addHeader.addHeader("X-VUNGLE-APP-VERSION", c0.a(c2));
        }
        return new m(this.f12047a.newCall(addHeader.post(requestBody).build()), this.b);
    }

    public final m a(RequestBody requestBody) {
        Intrinsics.checkNotNullParameter("https://events.ads.vungle.com/rtadebugging", "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new m(this.f12047a.newCall(a(this, "debug", HttpUrl.INSTANCE.get("https://events.ads.vungle.com/rtadebugging").newBuilder().build().getUrl(), null, null, 12).post(requestBody).build()), this.b);
    }
}
