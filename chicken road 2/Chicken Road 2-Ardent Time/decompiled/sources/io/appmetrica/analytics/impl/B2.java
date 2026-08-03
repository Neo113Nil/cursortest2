package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class B2 implements io.appmetrica.analytics.ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.A9 f4092a;

    public B2(io.appmetrica.analytics.impl.A9 a9) {
        this.f4092a = a9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4092a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalAttribution(type=`");
        sb.append(io.appmetrica.analytics.impl.K9.a(this.f4092a.f4043a));
        sb.append("`value=`");
        return B1.a.j(sb, new java.lang.String(this.f4092a.f4044b, y1.a.f8486a), "`)");
    }
}
