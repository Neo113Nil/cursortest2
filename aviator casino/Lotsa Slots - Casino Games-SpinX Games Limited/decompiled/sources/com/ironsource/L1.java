package com.ironsource;

/* loaded from: classes5.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f5810a;

    /* JADX WARN: Multi-variable type inference failed */
    public L1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.Map<java.lang.String, java.lang.String> a() {
        return this.f5810a;
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        return this.f5810a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.L1) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5810a, ((com.ironsource.L1) obj).f5810a);
    }

    public int hashCode() {
        return this.f5810a.hashCode();
    }

    public java.lang.String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f5810a + ")";
    }

    public L1(java.util.Map<java.lang.String, java.lang.String> mediationTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f5810a = mediationTypes;
    }

    public final com.ironsource.L1 a(java.util.Map<java.lang.String, java.lang.String> mediationTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new com.ironsource.L1(mediationTypes);
    }

    public /* synthetic */ L1(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.L1 a(com.ironsource.L1 l1, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = l1.f5810a;
        }
        return l1.a(map);
    }
}
