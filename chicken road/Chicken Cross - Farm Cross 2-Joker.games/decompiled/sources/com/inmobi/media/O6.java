package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class O6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6757a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.O6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return O6.a();
        }
    });

    public static final CoroutineScope a() {
        Intrinsics.checkNotNullExpressionValue("O6", "TAG");
        Intrinsics.checkNotNullParameter("O6", "name");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("O6", false));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor));
    }

    public static void a(F6 eventPayload, String url, int i, int i2, long j, Nm nm, M6 m6, boolean z) {
        long j2;
        long j3;
        Intrinsics.checkNotNullExpressionValue("O6", "TAG");
        if (Sf.a() != null || !AbstractC3914mk.d.get()) {
            Intrinsics.checkNotNullExpressionValue("O6", "TAG");
            m6.getClass();
            Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
            String TAG = m6.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new I6(eventPayload, false, m6, null), 1, null);
            m6.a(System.currentTimeMillis());
            if (m6.d != null) {
                ArrayList eventIds = eventPayload.f6550a;
                Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                Integer num = AbstractC3973om.c;
                if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                    AbstractC3973om.c = null;
                }
            }
            m6.f.set(false);
            return;
        }
        if (url != null) {
            String payload = eventPayload.b;
            int i3 = i - i2;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("payload", payload));
            Intrinsics.checkNotNullParameter(hashMapOf, "<this>");
            JSONObject b = AbstractC4263z7.b();
            if (b != null) {
                String jSONObject = b.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                hashMapOf.put("consentObject", jSONObject);
            }
            Li.a(hashMapOf);
            Mf mf = new Mf(url, i3 > 0 ? MapsKt.mapOf(TuplesKt.to("X-im-retry-count", String.valueOf(i3))) : null, null, new B7(hashMapOf, 0), null, 52);
            if (z) {
                if (i2 != i) {
                    j3 = ((long) Math.pow(2.0d, i3)) * j;
                    j2 = j3;
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f6757a.getValue(), null, null, new N6(j2, mf, i2, eventPayload, url, i, j, nm, m6, z, null), 3, null);
                }
            } else if (i2 != i) {
                j2 = j;
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f6757a.getValue(), null, null, new N6(j2, mf, i2, eventPayload, url, i, j, nm, m6, z, null), 3, null);
            }
            j3 = 0;
            j2 = j3;
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f6757a.getValue(), null, null, new N6(j2, mf, i2, eventPayload, url, i, j, nm, m6, z, null), 3, null);
        }
    }
}
