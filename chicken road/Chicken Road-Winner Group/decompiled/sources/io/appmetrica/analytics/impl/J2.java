package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public class J2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final H9 f6145a;

    public J2(H9 h9) {
        this.f6145a = h9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f6145a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(R9.a(this.f6145a.f6020a));
        sb.append("`value=`");
        return B0.c.l(sb, new String(this.f6145a.f6021b, v2.a.f10417a), "`)");
    }
}
