package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Kf extends Nf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6673a;
    public final Map b;
    public final Cm c;
    public final Map d;
    public final C3631ck e;
    public final boolean f;

    public Kf(String url, Map map, Cm cm, Map map2, C3631ck c3631ck, boolean z, int i) {
        map = (i & 2) != 0 ? null : map;
        cm = (i & 4) != 0 ? null : cm;
        map2 = (i & 8) != 0 ? null : map2;
        c3631ck = (i & 16) != 0 ? null : c3631ck;
        z = (i & 32) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6673a = url;
        this.b = map;
        this.c = cm;
        this.d = map2;
        this.e = c3631ck;
        this.f = z;
        String a2 = Tf.a(url, map2);
        Intrinsics.checkNotNullParameter(a2, "<set-?>");
        this.f6673a = a2;
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
        return this.f6673a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kf)) {
            return false;
        }
        Kf kf = (Kf) obj;
        return Intrinsics.areEqual(this.f6673a, kf.f6673a) && Intrinsics.areEqual(this.b, kf.b) && Intrinsics.areEqual(this.c, kf.c) && Intrinsics.areEqual(this.d, kf.d) && Intrinsics.areEqual(this.e, kf.e) && this.f == kf.f;
    }

    public final int hashCode() {
        int hashCode = this.f6673a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Cm cm = this.c;
        int hashCode3 = (hashCode2 + (cm == null ? 0 : cm.hashCode())) * 31;
        Map map2 = this.d;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        C3631ck c3631ck = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (c3631ck != null ? c3631ck.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f6673a + "', headers=" + this.b + ", queryParams=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
