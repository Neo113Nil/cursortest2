package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Mf extends Nf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6718a;
    public final Map b;
    public final Cm c;
    public final Wj d;
    public final C3631ck e;
    public final boolean f;

    public Mf(String url, Map map, Cm cm, Wj wj, C3631ck c3631ck, int i) {
        map = (i & 2) != 0 ? null : map;
        cm = (i & 4) != 0 ? null : cm;
        c3631ck = (i & 16) != 0 ? null : c3631ck;
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6718a = url;
        this.b = map;
        this.c = cm;
        this.d = wj;
        this.e = c3631ck;
        this.f = true;
    }

    @Override // com.inmobi.media.Nf
    public final Map a() {
        return this.b;
    }

    @Override // com.inmobi.media.Nf
    public final C3631ck b() {
        return this.e;
    }

    @Override // com.inmobi.media.Nf
    public final String c() {
        return this.f6718a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mf)) {
            return false;
        }
        Mf mf = (Mf) obj;
        return Intrinsics.areEqual(this.f6718a, mf.f6718a) && Intrinsics.areEqual(this.b, mf.b) && Intrinsics.areEqual(this.c, mf.c) && Intrinsics.areEqual(this.d, mf.d) && Intrinsics.areEqual(this.e, mf.e) && this.f == mf.f;
    }

    public final int hashCode() {
        int hashCode = this.f6718a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Cm cm = this.c;
        int hashCode3 = (hashCode2 + (cm == null ? 0 : cm.hashCode())) * 31;
        Wj wj = this.d;
        int hashCode4 = (hashCode3 + (wj == null ? 0 : wj.hashCode())) * 31;
        C3631ck c3631ck = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (c3631ck != null ? c3631ck.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f6718a + "', headers=" + this.b + ", body=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
