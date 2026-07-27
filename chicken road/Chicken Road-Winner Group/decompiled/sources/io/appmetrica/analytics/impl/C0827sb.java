package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827sb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Tc f8298a;

    public C0827sb() {
        this(new Tc(new Tn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Sn sn) {
        return MessageNano.toByteArray((MessageNano) this.f8298a.f6659a.fromModel(sn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0827sb(Tc tc) {
        this.f8298a = tc;
    }

    public final Sn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
