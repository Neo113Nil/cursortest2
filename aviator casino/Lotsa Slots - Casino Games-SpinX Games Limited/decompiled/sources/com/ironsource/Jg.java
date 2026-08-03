package com.ironsource;

/* loaded from: classes5.dex */
public final class Jg {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.ironsource.B> f5795a;

    /* JADX WARN: Multi-variable type inference failed */
    public Jg(java.util.List<? extends com.ironsource.B> instances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instances, "instances");
        this.f5795a = instances;
    }

    public final java.util.List<com.ironsource.B> a() {
        return this.f5795a;
    }

    public final java.util.List<com.ironsource.B> b() {
        return this.f5795a;
    }

    public final int c() {
        return this.f5795a.size();
    }

    public final java.lang.String d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ironsource.B b : this.f5795a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.Jg) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5795a, ((com.ironsource.Jg) obj).f5795a);
    }

    public int hashCode() {
        return this.f5795a.hashCode();
    }

    public java.lang.String toString() {
        return "WaterfallInstances(instances=" + this.f5795a + ")";
    }

    public final com.ironsource.Jg a(java.util.List<? extends com.ironsource.B> instances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instances, "instances");
        return new com.ironsource.Jg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.Jg a(com.ironsource.Jg jg, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = jg.f5795a;
        }
        return jg.a(list);
    }

    private final java.lang.String a(com.ironsource.C3232q2 c3232q2, int i) {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), c3232q2.c()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
