package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3858a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3859b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f3860c;

    public a(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        this.f3858a = str;
        this.f3859b = str2;
        this.f3860c = bool;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.identifiers.impl.a)) {
            return false;
        }
        io.appmetrica.analytics.identifiers.impl.a aVar = (io.appmetrica.analytics.identifiers.impl.a) obj;
        return kotlin.jvm.internal.i.a(this.f3858a, aVar.f3858a) && kotlin.jvm.internal.i.a(this.f3859b, aVar.f3859b) && kotlin.jvm.internal.i.a(this.f3860c, aVar.f3860c);
    }

    public final int hashCode() {
        int hashCode = this.f3858a.hashCode() * 31;
        java.lang.String str = this.f3859b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.f3860c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AdvIdInfo(provider=" + this.f3858a + ", advId=" + this.f3859b + ", limitedAdTracking=" + this.f3860c + ')';
    }
}
