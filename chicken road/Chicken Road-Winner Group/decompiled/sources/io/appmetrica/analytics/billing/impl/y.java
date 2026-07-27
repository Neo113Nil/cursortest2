package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends MessageNano {
    public static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5201g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5202h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile y[] f5203i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5204a;

    /* renamed from: b, reason: collision with root package name */
    public long f5205b;

    /* renamed from: c, reason: collision with root package name */
    public int f5206c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5207d;

    /* renamed from: e, reason: collision with root package name */
    public long f5208e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f5203i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5203i == null) {
                        f5203i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f5203i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5204a = bArr;
        this.f5205b = 0L;
        this.f5206c = 0;
        this.f5207d = bArr;
        this.f5208e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5204a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5204a);
        }
        long j3 = this.f5205b;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
        }
        int i3 = this.f5206c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
        }
        if (!Arrays.equals(this.f5207d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f5207d);
        }
        long j4 = this.f5208e;
        return j4 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f5204a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5204a);
        }
        long j3 = this.f5205b;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j3);
        }
        int i3 = this.f5206c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        if (!Arrays.equals(this.f5207d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f5207d);
        }
        long j4 = this.f5208e;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5204a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f5205b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5206c = readInt32;
                }
            } else if (readTag == 34) {
                this.f5207d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f5208e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
