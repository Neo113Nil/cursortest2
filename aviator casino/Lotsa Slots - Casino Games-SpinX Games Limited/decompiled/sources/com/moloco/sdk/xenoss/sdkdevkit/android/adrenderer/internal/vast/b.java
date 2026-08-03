package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class b implements java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> {

    /* renamed from: a, reason: collision with root package name */
    public final double f7686a;
    public final java.lang.Long b;
    public final java.lang.Integer c;
    public final java.lang.Integer d;

    public b(double d, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2) {
        this.f7686a = d;
        this.b = l;
        this.c = num;
        this.d = num2;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q mf1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q mf2) {
        kotlin.Pair b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mf1, "mf1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mf2, "mf2");
        b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.b(mf1, mf2, this.f7686a, this.b, this.c, this.d);
        return kotlin.jvm.internal.Intrinsics.compare(((java.lang.Number) b.component2()).intValue(), ((java.lang.Number) b.component1()).intValue());
    }

    public /* synthetic */ b(double d, java.lang.Long l, java.lang.Integer num, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
