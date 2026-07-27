package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class P extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile P[] f9000c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9001a;

    /* renamed from: b, reason: collision with root package name */
    public long f9002b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f9000c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9000c == null) {
                        f9000c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f9000c;
    }

    public final P a() {
        this.f9001a = true;
        this.f9002b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z3 = this.f9001a;
        if (!z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z3);
        }
        long j3 = this.f9002b;
        return j3 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z3 = this.f9001a;
        if (!z3) {
            codedOutputByteBufferNano.writeBool(1, z3);
        }
        long j3 = this.f9002b;
        if (j3 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f9001a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f9002b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
