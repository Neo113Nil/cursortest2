package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Z8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6987a;
    public final /* synthetic */ C3591b9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(C3591b9 c3591b9, Continuation continuation) {
        super(2, continuation);
        this.b = c3591b9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Z8 z8 = new Z8(this.b, continuation);
        z8.f6987a = obj;
        return z8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Z8 z8 = new Z8(this.b, (Continuation) obj2);
        z8.f6987a = (AbstractC3691eo) obj;
        return z8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC3691eo mediaEvent = (AbstractC3691eo) this.f6987a;
        this.b.a(mediaEvent);
        Oj oj = this.b.b;
        if (oj != null) {
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof J8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((J8) mediaEvent).f6645a;
                Map a2 = oj.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                a2.put("payload", jSONObject.toString());
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("VideoLoadStarted", a2, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof M8) {
                M8 m8 = (M8) mediaEvent;
                Map a3 = oj.a();
                Long latency = m8.f6711a.getLatency();
                a3.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("videoUrl", m8.f6711a.getVideoUrl());
                jSONObject2.put("cacheProgress", m8.b);
                a3.put("payload", jSONObject2.toString());
                C3829jm c3829jm2 = C3829jm.f7187a;
                C3829jm.b("VideoLoadSuccess", a3, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof C4253yp) {
                Map a4 = oj.a();
                C3829jm c3829jm3 = C3829jm.f7187a;
                C3829jm.b("VideoStart", a4, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof Ko) {
                Map a5 = oj.a();
                C3829jm c3829jm4 = C3829jm.f7187a;
                C3829jm.b("VideoFirstQuartile", a5, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof C4199wp) {
                Map a6 = oj.a();
                C3829jm c3829jm5 = C3829jm.f7187a;
                C3829jm.b("VideoSecondQuartile", a6, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof Fp) {
                Map a7 = oj.a();
                C3829jm c3829jm6 = C3829jm.f7187a;
                C3829jm.b("VideoThirdQuartile", a7, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof C3607bo) {
                Map a8 = oj.a();
                C3829jm c3829jm7 = C3829jm.f7187a;
                C3829jm.b("VideoComplete", a8, EnumC3944nm.f7271a);
            } else if (mediaEvent instanceof H8) {
                H8 h8 = (H8) mediaEvent;
                Map a9 = oj.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", h8.f6599a.getVideoFiles());
                a9.put("payload", jSONObject3.toString());
                a9.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(h8.b));
                C3829jm c3829jm8 = C3829jm.f7187a;
                C3829jm.b("VideoLoadFailure", a9, EnumC3944nm.f7271a);
            }
        }
        return Unit.INSTANCE;
    }
}
