package com.ironsource;

/* loaded from: classes5.dex */
public final class Zb extends com.ironsource.W {
    private final java.lang.String s;
    private final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> t;
    private final com.ironsource.Pb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Zb(java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.Pb configs) {
        super(com.ironsource.mediationsdk.IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new com.ironsource.O0(com.ironsource.O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new com.ironsource.J0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        this.s = str;
        this.t = list;
        this.u = configs;
    }

    public final com.ironsource.Zb a(java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.Pb configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.ironsource.Zb(str, list, configs);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Zb)) {
            return false;
        }
        com.ironsource.Zb zb = (com.ironsource.Zb) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.s, zb.s) && kotlin.jvm.internal.Intrinsics.areEqual(this.t, zb.t) && kotlin.jvm.internal.Intrinsics.areEqual(this.u, zb.u);
    }

    public int hashCode() {
        java.lang.String str = this.s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list = this.t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.u.hashCode();
    }

    @Override // com.ironsource.W
    public java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> j() {
        return this.t;
    }

    @Override // com.ironsource.W
    public java.lang.String o() {
        return this.s;
    }

    public final java.lang.String s() {
        return this.s;
    }

    public final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> t() {
        return this.t;
    }

    public java.lang.String toString() {
        return "NativeAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    public final com.ironsource.Pb u() {
        return this.u;
    }

    public final com.ironsource.Pb v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.Zb a(com.ironsource.Zb zb, java.lang.String str, java.util.List list, com.ironsource.Pb pb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zb.s;
        }
        if ((i & 2) != 0) {
            list = zb.t;
        }
        if ((i & 4) != 0) {
            pb = zb.u;
        }
        return zb.a(str, list, pb);
    }
}
