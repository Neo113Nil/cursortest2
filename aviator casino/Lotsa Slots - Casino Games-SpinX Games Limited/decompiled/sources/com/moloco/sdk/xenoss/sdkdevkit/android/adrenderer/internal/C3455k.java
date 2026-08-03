package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3455k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7461a;
    public final java.util.List<java.lang.String> b;

    public C3455k(java.lang.Integer num, java.util.List<java.lang.String> gradient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f7461a = num;
        this.b = gradient;
    }

    public final java.lang.Integer a() {
        return this.f7461a;
    }

    public final java.util.List<java.lang.String> b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return this.f7461a;
    }

    public final java.util.List<java.lang.String> d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7461a, c3455k.f7461a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3455k.b);
    }

    public int hashCode() {
        java.lang.Integer num = this.f7461a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "DECBorder(borderWidth=" + this.f7461a + ", gradient=" + this.b + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k a(java.lang.Integer num, java.util.List<java.lang.String> gradient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gradient, "gradient");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k(num, gradient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k, java.lang.Integer num, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c3455k.f7461a;
        }
        if ((i & 2) != 0) {
            list = c3455k.b;
        }
        return c3455k.a(num, list);
    }

    public /* synthetic */ C3455k(java.lang.Integer num, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }
}
