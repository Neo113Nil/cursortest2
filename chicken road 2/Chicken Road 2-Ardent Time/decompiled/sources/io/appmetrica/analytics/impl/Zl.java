package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zl extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5437b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map<java.lang.String, java.lang.String> f5438c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5439d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List<java.lang.String> f5440e;

    public Zl(io.appmetrica.analytics.impl.H3 h3) {
        this(h3.a().c(), h3.a().d(), h3.a().a(), h3.a().h(), h3.a().b());
    }

    public final boolean a(io.appmetrica.analytics.impl.Zl zl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Zl mergeFrom(io.appmetrica.analytics.impl.Zl zl) {
        return new io.appmetrica.analytics.impl.Zl((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f5436a, zl.f5436a), (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f5437b, zl.f5437b), (java.util.Map) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f5438c, zl.f5438c), this.f5439d || zl.f5439d, zl.f5439d ? zl.f5440e : this.f5440e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(java.lang.Object obj) {
        return false;
    }

    public final java.lang.String toString() {
        return "Arguments{distributionReferrer='" + this.f5436a + "', installReferrerSource='" + this.f5437b + "', clientClids=" + this.f5438c + ", hasNewCustomHosts=" + this.f5439d + ", newCustomHosts=" + this.f5440e + '}';
    }

    public Zl(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, boolean z2, java.util.List<java.lang.String> list) {
        this.f5436a = str;
        this.f5437b = str2;
        this.f5438c = map;
        this.f5439d = z2;
        this.f5440e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
