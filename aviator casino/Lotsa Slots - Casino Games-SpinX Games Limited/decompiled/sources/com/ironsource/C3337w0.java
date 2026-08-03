package com.ironsource;

/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3337w0 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6790a;
    private final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> b;
    private final com.ironsource.C3150la c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3337w0(java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> providerList, com.ironsource.C3150la publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f6790a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    public final java.lang.String a() {
        return this.f6790a;
    }

    public final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> b() {
        return this.b;
    }

    public final com.ironsource.C3150la c() {
        return this.c;
    }

    public final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> d() {
        return this.b;
    }

    public final com.ironsource.C3150la e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3337w0)) {
            return false;
        }
        com.ironsource.C3337w0 c3337w0 = (com.ironsource.C3337w0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6790a, c3337w0.f6790a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3337w0.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3337w0.c);
    }

    public final java.lang.String f() {
        return this.f6790a;
    }

    public int hashCode() {
        java.lang.String str = this.f6790a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "AdUnitCommonData(userId=" + this.f6790a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final com.ironsource.C3337w0 a(java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> providerList, com.ironsource.C3150la publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new com.ironsource.C3337w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.C3337w0 a(com.ironsource.C3337w0 c3337w0, java.lang.String str, java.util.List list, com.ironsource.C3150la c3150la, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3337w0.f6790a;
        }
        if ((i & 2) != 0) {
            list = c3337w0.b;
        }
        if ((i & 4) != 0) {
            c3150la = c3337w0.c;
        }
        return c3337w0.a(str, list, c3150la);
    }
}
