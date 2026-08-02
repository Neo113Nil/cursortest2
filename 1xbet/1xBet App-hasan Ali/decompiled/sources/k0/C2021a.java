package k0;

import W0.m;
import h0.C1991e;
import i0.InterfaceC2009n;
import kotlin.jvm.internal.l;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2021a {

    /* renamed from: a, reason: collision with root package name */
    public W0.c f17535a;

    /* renamed from: b, reason: collision with root package name */
    public m f17536b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2009n f17537c;

    /* renamed from: d, reason: collision with root package name */
    public long f17538d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2021a)) {
            return false;
        }
        C2021a c2021a = (C2021a) obj;
        return l.a(this.f17535a, c2021a.f17535a) && this.f17536b == c2021a.f17536b && l.a(this.f17537c, c2021a.f17537c) && C1991e.a(this.f17538d, c2021a.f17538d);
    }

    public final int hashCode() {
        int hashCode = (this.f17537c.hashCode() + ((this.f17536b.hashCode() + (this.f17535a.hashCode() * 31)) * 31)) * 31;
        long j5 = this.f17538d;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f17535a + ", layoutDirection=" + this.f17536b + ", canvas=" + this.f17537c + ", size=" + ((Object) C1991e.f(this.f17538d)) + ')';
    }
}
