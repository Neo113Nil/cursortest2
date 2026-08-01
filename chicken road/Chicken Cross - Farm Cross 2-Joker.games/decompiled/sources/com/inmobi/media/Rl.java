package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Rl {

    /* renamed from: a, reason: collision with root package name */
    public static final Rl f6833a = new Rl();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject signalsPayload, Continuation continuation) {
        Ql ql;
        int i;
        String bundleId;
        try {
            try {
                if (continuation instanceof Ql) {
                    ql = (Ql) continuation;
                    int i2 = ql.c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ql.c = i2 - Integer.MIN_VALUE;
                        Object obj = ql.f6809a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = ql.c;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            Context context = AbstractC3914mk.f7252a;
                            if (context == null || (bundleId = context.getPackageName()) == null) {
                                Intrinsics.checkNotNullExpressionValue("Rl", "TAG");
                                return new Sl(6001);
                            }
                            try {
                                J4 j4 = AbstractC4260z4.f7518a;
                                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                                SignalsConfig.SynapseConfig synapse = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getSynapse();
                                Intrinsics.checkNotNullParameter(signalsPayload, "signalsPayload");
                                Intrinsics.checkNotNullParameter(bundleId, "bundleId");
                                JSONObject put = new JSONObject().put(CmcdData.Factory.STREAMING_FORMAT_SS, signalsPayload).put("hs", Pl.a(bundleId));
                                Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                                Intrinsics.checkNotNullExpressionValue("Rl", "TAG");
                                put.toString();
                                String jSONObject = put.toString();
                                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                                byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                                byte[] maskedEnvelopeBytes = Nl.a(bundleId, bytes);
                                String url = synapse.getPushUrl();
                                int maxRetryCount = synapse.getMaxRetryCount();
                                int retryInterval = synapse.getRetryInterval();
                                IntRange intRange = Tf.f6872a;
                                C3631ck c3631ck = new C3631ck(maxRetryCount, retryInterval * 1000, 0);
                                Intrinsics.checkNotNullParameter(url, "url");
                                Intrinsics.checkNotNullParameter(bundleId, "bundleId");
                                Intrinsics.checkNotNullParameter(maskedEnvelopeBytes, "maskedEnvelopeBytes");
                                Intrinsics.checkNotNullParameter(url, "url");
                                Mf mf = new Mf(url, MapsKt.mapOf(TuplesKt.to("X-IM-Bundle-Id", bundleId)), null, new C3726g3(maskedEnvelopeBytes), c3631ck, 36);
                                C3733ga c3733ga = (C3733ga) If.c.getValue();
                                ql.c = 1;
                                obj = c3733ga.f7119a.a(mf, ql);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (Exception unused) {
                                return new Sl(6002);
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        int c = ((Of) obj).c();
                        Intrinsics.checkNotNullExpressionValue("Rl", "TAG");
                        String str = "Synapse signals push status code: " + c;
                        return (200 <= c || c >= 300) ? new Sl(c) : Tl.f6876a;
                    }
                }
                int c2 = ((Of) obj).c();
                Intrinsics.checkNotNullExpressionValue("Rl", "TAG");
                String str2 = "Synapse signals push status code: " + c2;
                if (200 <= c2) {
                }
            } catch (Exception unused2) {
                return new Sl(6004);
            }
            if (i != 0) {
            }
        } catch (Exception unused3) {
            return new Sl(6003);
        }
        ql = new Ql(this, continuation);
        Object obj2 = ql.f6809a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ql.c;
    }
}
