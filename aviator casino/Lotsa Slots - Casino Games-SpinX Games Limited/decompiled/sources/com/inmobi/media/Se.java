package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Se extends com.inmobi.media.Ue {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4957a;
    public final com.inmobi.media.Gk b;

    public Se(java.lang.String url, com.inmobi.media.Gk gk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f4957a = url;
        this.b = gk;
    }

    @Override // com.inmobi.media.Ue
    public final java.util.Map a() {
        return null;
    }

    @Override // com.inmobi.media.Ue
    public final com.inmobi.media.Ni b() {
        return null;
    }

    @Override // com.inmobi.media.Ue
    public final java.lang.String c() {
        return this.f4957a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Se)) {
            return false;
        }
        com.inmobi.media.Se se = (com.inmobi.media.Se) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4957a, se.f4957a) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, se.b) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null);
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(true) + ((this.b.hashCode() + (this.f4957a.hashCode() * 961)) * 961);
    }

    public final java.lang.String toString() {
        return "HeadRequest(url=" + this.f4957a + ", headers=null, timeouts=" + this.b + ", retryPolicy=null, followRedirects=true)";
    }
}
