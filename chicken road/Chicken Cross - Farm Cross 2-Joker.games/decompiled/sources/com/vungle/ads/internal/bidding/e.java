package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.m3;
import com.vungle.ads.internal.model.p3;
import com.vungle.ads.internal.model.u1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.f0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11893a;
    public k2 b;
    public int c;
    public final Json d;
    public long e;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11893a = context;
        this.b = new k2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.d = JsonKt.Json$default(null, d.f11892a, 1, null);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new a(this));
    }

    public final String a() {
        VungleApiClient vungleApiClient = (VungleApiClient) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new c(this.f11893a)).getValue();
        ConfigManager.INSTANCE.getClass();
        u1 a2 = vungleApiClient.a(!ConfigManager.t(), ConfigManager.d());
        p3 p3Var = new p3(a2.a(), a2.d(), a2.b(), new m3(f0.d()), this.c);
        Json json = this.d;
        KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(p3.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(serializer, p3Var);
    }

    public final b b() {
        b bVar;
        this.c++;
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (s) null, 6);
        try {
            String a2 = a();
            boolean z = u.f12190a;
            t.a("BidTokenEncoder", "BidToken: " + a2);
            try {
                String str = "6:" + q.a(a2);
                t.a("BidTokenEncoder", "After conversion: " + str);
                return new b(str, "");
            } catch (Throwable th) {
                String sb = l.a("Fail to gzip token data. ").append(th.getLocalizedMessage()).toString();
                new GzipEncodeError(sb).logErrorNoReturnValue$vungle_ads_release();
                bVar = new b("", sb);
                return bVar;
            }
        } catch (Throwable th2) {
            String sb2 = l.a("Failed to encode TokenParameters. ").append(th2.getLocalizedMessage()).toString();
            new JsonEncodeError(sb2).logErrorNoReturnValue$vungle_ads_release();
            bVar = new b("", sb2);
        }
    }
}
