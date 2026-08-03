package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class a implements java.util.Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7685a;
    public final java.lang.Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e c1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e c2) {
        kotlin.Pair d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1, "c1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2, "c2");
        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.d(c1, c2, this.f7685a, this.b);
        return kotlin.jvm.internal.Intrinsics.compare(((java.lang.Number) d.component2()).intValue(), ((java.lang.Number) d.component1()).intValue());
    }

    public a(java.lang.Integer num, java.lang.Integer num2) {
        this.f7685a = num;
        this.b = num2;
    }

    public /* synthetic */ a(java.lang.Integer num, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
