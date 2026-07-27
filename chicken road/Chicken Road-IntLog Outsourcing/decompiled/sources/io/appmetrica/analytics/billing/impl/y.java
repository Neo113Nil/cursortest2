package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6009f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6010g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6011h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile y[] f6012i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6013a;

    /* renamed from: b, reason: collision with root package name */
    public long f6014b;

    /* renamed from: c, reason: collision with root package name */
    public int f6015c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6016d;

    /* renamed from: e, reason: collision with root package name */
    public long f6017e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f6012i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6012i == null) {
                        f6012i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f6012i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6013a = bArr;
        this.f6014b = 0L;
        this.f6015c = 0;
        this.f6016d = bArr;
        this.f6017e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6013a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6013a);
        }
        long j2 = this.f6014b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f6015c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!Arrays.equals(this.f6016d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6016d);
        }
        long j6 = this.f6017e;
        return j6 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j6) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6013a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6013a);
        }
        long j2 = this.f6014b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f6015c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!Arrays.equals(this.f6016d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6016d);
        }
        long j6 = this.f6017e;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6013a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f6014b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6015c = readInt32;
                }
            } else if (readTag == 34) {
                this.f6016d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6017e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static y a(byte[] bArr) {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
