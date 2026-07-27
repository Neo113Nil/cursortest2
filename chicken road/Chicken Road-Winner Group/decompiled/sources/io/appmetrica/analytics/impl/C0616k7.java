package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616k7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0590j7 f7686a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0616k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C0642l7 c0642l7) {
        return MessageNano.toByteArray(this.f7686a.fromModel(c0642l7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f7686a.fromModel((C0642l7) obj));
    }

    public C0616k7(C0590j7 c0590j7) {
        this.f7686a = c0590j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0642l7 toModel(byte[] bArr) {
        C0875u7 c0875u7;
        if (bArr != null) {
            try {
                c0875u7 = (C0875u7) MessageNano.mergeFrom(new C0875u7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0875u7 = new C0875u7();
            }
        }
        c0875u7 = new C0875u7();
        return this.f7686a.toModel(c0875u7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0616k7(C0590j7 c0590j7, int i3, kotlin.jvm.internal.f fVar) {
        this(c0590j7);
        if ((i3 & 1) != 0) {
            c0590j7 = new C0590j7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
