package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5538b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f5539c;

    public a(String str, String str2, Boolean bool) {
        this.f5537a = str;
        this.f5538b = str2;
        this.f5539c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.a(this.f5537a, aVar.f5537a) && kotlin.jvm.internal.j.a(this.f5538b, aVar.f5538b) && kotlin.jvm.internal.j.a(this.f5539c, aVar.f5539c);
    }

    public final int hashCode() {
        int hashCode = this.f5537a.hashCode() * 31;
        String str = this.f5538b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f5539c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f5537a + ", advId=" + this.f5538b + ", limitedAdTracking=" + this.f5539c + ')';
    }
}
