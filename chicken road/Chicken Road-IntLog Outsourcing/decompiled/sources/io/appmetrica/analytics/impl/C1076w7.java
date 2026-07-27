package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076w7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1076w7[] f9505d;

    /* renamed from: a, reason: collision with root package name */
    public long f9506a;

    /* renamed from: b, reason: collision with root package name */
    public long f9507b;

    /* renamed from: c, reason: collision with root package name */
    public int f9508c;

    public C1076w7() {
        a();
    }

    public static C1076w7[] b() {
        if (f9505d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9505d == null) {
                        f9505d = new C1076w7[0];
                    }
                } finally {
                }
            }
        }
        return f9505d;
    }

    public final C1076w7 a() {
        this.f9506a = -1L;
        this.f9507b = -1L;
        this.f9508c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f9506a;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        long j6 = this.f9507b;
        if (j6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j6);
        }
        int i2 = this.f9508c;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f9506a;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        long j6 = this.f9507b;
        if (j6 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j6);
        }
        int i2 = this.f9508c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1076w7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f9506a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f9507b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f9508c = readInt32;
                }
            }
        }
    }

    public static C1076w7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1076w7().mergeFrom(codedInputByteBufferNano);
    }

    public static C1076w7 a(byte[] bArr) {
        return (C1076w7) MessageNano.mergeFrom(new C1076w7(), bArr);
    }
}
