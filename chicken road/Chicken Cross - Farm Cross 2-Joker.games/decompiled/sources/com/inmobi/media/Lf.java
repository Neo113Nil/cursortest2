package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Lf extends Nf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6695a;
    public final Cm b;

    public Lf(String url, Cm cm) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6695a = url;
        this.b = cm;
    }

    @Override // com.inmobi.media.Nf
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Nf
    public final C3631ck b() {
        return null;
    }

    @Override // com.inmobi.media.Nf
    public final String c() {
        return this.f6695a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lf)) {
            return false;
        }
        Lf lf = (Lf) obj;
        return Intrinsics.areEqual(this.f6695a, lf.f6695a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.b, lf.b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.f6695a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f6695a + ", headers=null, timeouts=" + this.b + ", retryPolicy=null, followRedirects=true)";
    }
}
