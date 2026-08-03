package com.ironsource;

/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3009dc extends com.ironsource.AbstractC3230q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3009dc(com.ironsource.C3212p0 adTools, com.ironsource.C3027ec adUnitData, com.ironsource.InterfaceC3045fc listener) {
        super(adTools, adUnitData, listener, null, 8, null);
        java.lang.String format;
        int b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.C3064gd g = g();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || android.text.TextUtils.isEmpty(g.c())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            format = java.lang.String.format("can't load native ad - %s", java.util.Arrays.copyOf(new java.lang.Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = com.ironsource.B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            com.ironsource.mediationsdk.logger.IronLog.API.error(a(format));
            a(b, format);
        }
    }

    @Override // com.ironsource.AbstractC3230q0
    protected com.ironsource.E a() {
        return new com.ironsource.E() { // from class: com.ironsource.dc$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final com.ironsource.B a(com.ironsource.C c, com.ironsource.I i) {
                com.ironsource.B a2;
                a2 = com.ironsource.C3009dc.a(com.ironsource.C3009dc.this, c, i);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.B a(com.ironsource.C3009dc this$0, com.ironsource.C adInstanceData, com.ironsource.I adInstancePayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new com.ironsource.Vb(new com.ironsource.V0(this$0.f(), com.ironsource.F0.b.PROVIDER), adInstanceData, adInstancePayload, new com.ironsource.AbstractC3230q0.a());
    }
}
