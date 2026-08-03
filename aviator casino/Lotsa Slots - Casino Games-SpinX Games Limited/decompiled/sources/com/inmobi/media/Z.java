package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2631o1 f5074a;
    public final com.inmobi.media.X b;
    public final com.inmobi.media.C2657p1 c;
    public final com.inmobi.media.core.config.models.AdConfig d;
    public final com.inmobi.media.C2565lf e;
    public final com.inmobi.media.Gk f;
    public final boolean g;

    public Z(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.C2828vc mediationSpecificConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationSpecificConfig, "mediationSpecificConfig");
        this.f5074a = adManagerComponent;
        this.b = new com.inmobi.media.X(adManagerComponent.d, adManagerComponent.f);
        com.inmobi.media.C2657p1 c2657p1 = adManagerComponent.f5364a;
        this.c = c2657p1;
        com.inmobi.media.core.config.models.AdConfig adConfig = c2657p1.b;
        this.d = adConfig;
        this.e = new com.inmobi.media.C2619nf(adManagerComponent.b, adManagerComponent.c).a();
        java.lang.Integer num = mediationSpecificConfig.d;
        long intValue = num != null ? num.intValue() : 15000;
        java.lang.Integer num2 = mediationSpecificConfig.d;
        this.f = new com.inmobi.media.Gk(intValue, num2 != null ? num2.intValue() : 15000, mediationSpecificConfig.d != null ? r11.intValue() : 15000);
        this.g = adConfig.getApplyGzipReq();
    }

    public final java.lang.Object a(com.inmobi.media.T6 t6) {
        com.inmobi.media.C2799u9 c2799u9 = this.f5074a.c;
        if (c2799u9 != null) {
            c2799u9.a("AdFetchManager", "fetchAd Called");
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        com.inmobi.media.Sg sg = this.c.f5382a;
        java.util.Map map = sg.c;
        long j = sg.f4958a;
        android.content.Context context = this.f5074a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String str = context instanceof android.app.Activity ? "activity" : "others";
        this.c.getClass();
        return new com.inmobi.media.C2707qo(new com.inmobi.media.C2656p0(this.d.getUrl(), new com.inmobi.media.Rk(this.d.getIncludeIds()), new com.inmobi.media.C2602n0(uuid, map, j, str, "native", kotlin.collections.MapsKt.emptyMap(), this.c.f5382a.b, this.d.getRendering().getEnablePubMuteControl() && com.inmobi.media.Xi.f), this.f, this.e, this.f5074a.c, this.g).a(), this.f5074a.c).a(new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Z$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Z.a(com.inmobi.media.Z.this, (com.inmobi.media.W) obj);
            }
        }, t6);
    }

    public static final kotlin.Unit a(com.inmobi.media.Z z, com.inmobi.media.W adFetchEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        com.inmobi.media.C2799u9 c2799u9 = z.f5074a.c;
        if (c2799u9 != null) {
            c2799u9.a("AdFetchManager", "adFetchEvent " + adFetchEvent);
        }
        z.b.a(adFetchEvent);
        return kotlin.Unit.INSTANCE;
    }
}
