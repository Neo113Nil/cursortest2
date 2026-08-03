package com.ironsource;

/* loaded from: classes5.dex */
public final class D0 extends com.ironsource.E5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5663a;
    private final com.ironsource.C3069h0 b;
    private final java.lang.String c;

    public /* synthetic */ D0(com.ironsource.C3212p0 c3212p0, com.ironsource.C3069h0 c3069h0, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3212p0, c3069h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.Map<java.lang.String, java.lang.Object> a2 = a(this.b);
        a2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a2.put("sessionDepth", java.lang.Integer.valueOf(this.f5663a.f()));
        java.lang.String str = this.c;
        if (str != null) {
            a2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a2;
    }

    public D0(com.ironsource.C3212p0 adTools, com.ironsource.C3069h0 adProperties, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f5663a = adTools;
        this.b = adProperties;
        this.c = str;
    }
}
