package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3554a0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4008q1 f7000a;
    public final Y b;
    public final C4036r1 c;
    public final AdConfig d;
    public final C3711fg e;
    public final Cm f;
    public final boolean g;

    public C3554a0(C4008q1 adManagerComponent, C3935nd mediationSpecificConfig) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(mediationSpecificConfig, "mediationSpecificConfig");
        this.f7000a = adManagerComponent;
        this.b = new Y(adManagerComponent.d, adManagerComponent.f);
        C4036r1 c4036r1 = adManagerComponent.f7316a;
        this.c = c4036r1;
        AdConfig adConfig = c4036r1.b;
        this.d = adConfig;
        this.e = new C3768hg(adManagerComponent.b, adManagerComponent.c).a();
        Integer num = mediationSpecificConfig.d;
        long intValue = num != null ? num.intValue() : 15000;
        Integer num2 = mediationSpecificConfig.d;
        this.f = new Cm(intValue, num2 != null ? num2.intValue() : 15000, mediationSpecificConfig.d != null ? r11.intValue() : 15000);
        this.g = adConfig.getApplyGzipReq();
    }

    public final Object a(C4014q7 c4014q7) {
        Z9 z9 = this.f7000a.c;
        if (z9 != null) {
            z9.a("AdFetchManager", "fetchAd Called");
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        C3600bi c3600bi = this.c.f7340a;
        Map map = c3600bi.d;
        long j = c3600bi.f7031a;
        Context context = this.f7000a.b;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = context instanceof Activity ? "activity" : "others";
        this.c.getClass();
        return new C3948nq(new C4007q0(this.d.getUrl(), new Nm(this.d.getIncludeIds()), new C3950o0(uuid, map, j, str, "native", MapsKt.emptyMap(), this.c.f7340a.c, this.d.getRendering().getEnablePubMuteControl() && AbstractC3914mk.g), this.f, this.e, this.f7000a.c, this.g).a(), this.f7000a.c).a(new Function1() { // from class: com.inmobi.media.a0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3554a0.a(C3554a0.this, (X) obj);
            }
        }, c4014q7);
    }

    public static final Unit a(C3554a0 c3554a0, X adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        Z9 z9 = c3554a0.f7000a.c;
        if (z9 != null) {
            z9.a("AdFetchManager", "adFetchEvent " + adFetchEvent);
        }
        c3554a0.b.a(adFetchEvent);
        return Unit.INSTANCE;
    }
}
