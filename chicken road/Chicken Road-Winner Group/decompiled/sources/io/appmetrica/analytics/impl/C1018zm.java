package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018zm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1018zm[] f8712b;

    /* renamed from: a, reason: collision with root package name */
    public long f8713a;

    public C1018zm() {
        a();
    }

    public static C1018zm[] b() {
        if (f8712b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8712b == null) {
                        f8712b = new C1018zm[0];
                    }
                } finally {
                }
            }
        }
        return f8712b;
    }

    public final C1018zm a() {
        this.f8713a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f8713a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f8713a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1018zm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8713a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C1018zm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1018zm) MessageNano.mergeFrom(new C1018zm(), bArr);
    }

    public static C1018zm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1018zm().mergeFrom(codedInputByteBufferNano);
    }
}
