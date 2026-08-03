package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Tc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Xc f4974a;
    public final com.inmobi.media.C2756sj b;
    public final com.inmobi.media.AbstractC2422g2 c;
    public final com.inmobi.media.C2756sj d;
    public final com.inmobi.media.C2756sj e;
    public final com.inmobi.media.C2756sj f;
    public final com.inmobi.media.C2756sj g;

    public Tc(com.inmobi.media.Uc nativeBeaconMacroData, com.inmobi.media.Xc trackerData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.f4974a = trackerData;
        this.b = new com.inmobi.media.C2756sj(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.c(com.inmobi.media.Tc.this);
            }
        });
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        this.c = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled() ? new com.inmobi.media.C2316c3(nativeBeaconMacroData) : new com.inmobi.media.Gc(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.a();
            }
        });
        this.d = new com.inmobi.media.C2756sj(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.e(com.inmobi.media.Tc.this);
            }
        });
        this.e = new com.inmobi.media.C2756sj(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.b(com.inmobi.media.Tc.this);
            }
        });
        this.f = new com.inmobi.media.C2756sj(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.a(com.inmobi.media.Tc.this);
            }
        });
        this.g = new com.inmobi.media.C2756sj(nativeBeaconMacroData, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Tc$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Tc.d(com.inmobi.media.Tc.this);
            }
        });
    }

    public static final java.util.List a() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final java.util.List b(com.inmobi.media.Tc tc) {
        return com.inmobi.media.D4.a("impression_shown", tc.f4974a.f5046a.f4784a);
    }

    public static final java.util.List c(com.inmobi.media.Tc tc) {
        return com.inmobi.media.D4.a(com.ironsource.X3.i.r, tc.f4974a.f5046a.f4784a);
    }

    public static final java.util.List d(com.inmobi.media.Tc tc) {
        return com.inmobi.media.D4.a("mrc50", tc.f4974a.f5046a.f4784a);
    }

    public static final java.util.List e(com.inmobi.media.Tc tc) {
        return com.inmobi.media.D4.a("start_tracking", tc.f4974a.f5046a.f4784a);
    }

    public static final java.util.List a(com.inmobi.media.Tc tc) {
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) com.inmobi.media.D4.a("impression", tc.f4974a.f5046a.f4784a), (java.lang.Iterable) com.inmobi.media.AbstractC2283am.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n, tc.f4974a.b));
    }
}
