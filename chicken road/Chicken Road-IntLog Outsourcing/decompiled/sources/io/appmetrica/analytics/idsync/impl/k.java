package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k[] f6419c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6420a;

    /* renamed from: b, reason: collision with root package name */
    public byte[][] f6421b;

    public k() {
        a();
    }

    public static k[] b() {
        if (f6419c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6419c == null) {
                        f6419c = new k[0];
                    }
                } finally {
                }
            }
        }
        return f6419c;
    }

    public final k a() {
        this.f6420a = WireFormatNano.EMPTY_BYTES;
        this.f6421b = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f6420a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6420a);
        }
        byte[][] bArr = this.f6421b;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f6421b;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i3 + i6;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i6++;
                i3 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6420a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6420a);
        }
        byte[][] bArr = this.f6421b;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f6421b;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(2, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6420a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                byte[][] bArr = this.f6421b;
                int length = bArr == null ? 0 : bArr.length;
                int i2 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i2][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i2 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f6421b = bArr2;
            }
        }
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    public static k a(byte[] bArr) {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
