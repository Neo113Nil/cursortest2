package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167zm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1167zm[] f9675b;

    /* renamed from: a, reason: collision with root package name */
    public long f9676a;

    public C1167zm() {
        a();
    }

    public static C1167zm[] b() {
        if (f9675b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9675b == null) {
                        f9675b = new C1167zm[0];
                    }
                } finally {
                }
            }
        }
        return f9675b;
    }

    public final C1167zm a() {
        this.f9676a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f9676a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f9676a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1167zm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9676a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C1167zm a(byte[] bArr) {
        return (C1167zm) MessageNano.mergeFrom(new C1167zm(), bArr);
    }

    public static C1167zm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1167zm().mergeFrom(codedInputByteBufferNano);
    }
}
