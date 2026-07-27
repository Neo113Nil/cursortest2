package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0953x7 f8633a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0978y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C1003z7 c1003z7) {
        return MessageNano.toByteArray(this.f8633a.fromModel(c1003z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f8633a.fromModel((C1003z7) obj));
    }

    public C0978y7(C0953x7 c0953x7) {
        this.f8633a = c0953x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1003z7 toModel(byte[] bArr) {
        C0927w7 c0927w7;
        if (bArr != null) {
            try {
                c0927w7 = (C0927w7) MessageNano.mergeFrom(new C0927w7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0927w7 = new C0927w7();
            }
        }
        c0927w7 = new C0927w7();
        return this.f8633a.toModel(c0927w7);
    }

    public /* synthetic */ C0978y7(C0953x7 c0953x7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0953x7(null, 1, null) : c0953x7);
    }
}
