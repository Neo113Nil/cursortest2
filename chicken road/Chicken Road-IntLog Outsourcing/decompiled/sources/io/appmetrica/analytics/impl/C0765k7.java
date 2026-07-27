package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765k7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0739j7 f8605a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0765k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0791l7 c0791l7) {
        return MessageNano.toByteArray(this.f8605a.fromModel(c0791l7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f8605a.fromModel((C0791l7) obj));
    }

    public C0765k7(C0739j7 c0739j7) {
        this.f8605a = c0739j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0791l7 toModel(byte[] bArr) {
        C1024u7 c1024u7;
        if (bArr != null) {
            try {
                c1024u7 = (C1024u7) MessageNano.mergeFrom(new C1024u7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c1024u7 = new C1024u7();
            }
        }
        c1024u7 = new C1024u7();
        return this.f8605a.toModel(c1024u7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0765k7(C0739j7 c0739j7, int i2, kotlin.jvm.internal.e eVar) {
        this(c0739j7);
        if ((i2 & 1) != 0) {
            c0739j7 = new C0739j7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
