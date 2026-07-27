package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844n8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0844n8[] f8840f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8841a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8842b;

    /* renamed from: c, reason: collision with root package name */
    public C0947r8 f8843c;

    /* renamed from: d, reason: collision with root package name */
    public C0870o8[] f8844d;

    /* renamed from: e, reason: collision with root package name */
    public int f8845e;

    public C0844n8() {
        a();
    }

    public static C0844n8[] b() {
        if (f8840f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8840f == null) {
                        f8840f = new C0844n8[0];
                    }
                } finally {
                }
            }
        }
        return f8840f;
    }

    public final C0844n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8841a = bArr;
        this.f8842b = bArr;
        this.f8843c = null;
        this.f8844d = C0870o8.b();
        this.f8845e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8841a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8841a);
        }
        if (!Arrays.equals(this.f8842b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8842b);
        }
        C0947r8 c0947r8 = this.f8843c;
        if (c0947r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0947r8);
        }
        C0870o8[] c0870o8Arr = this.f8844d;
        if (c0870o8Arr != null && c0870o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0870o8[] c0870o8Arr2 = this.f8844d;
                if (i2 >= c0870o8Arr2.length) {
                    break;
                }
                C0870o8 c0870o8 = c0870o8Arr2[i2];
                if (c0870o8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0870o8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f8845e;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f8841a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8841a);
        }
        if (!Arrays.equals(this.f8842b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8842b);
        }
        C0947r8 c0947r8 = this.f8843c;
        if (c0947r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0947r8);
        }
        C0870o8[] c0870o8Arr = this.f8844d;
        if (c0870o8Arr != null && c0870o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0870o8[] c0870o8Arr2 = this.f8844d;
                if (i2 >= c0870o8Arr2.length) {
                    break;
                }
                C0870o8 c0870o8 = c0870o8Arr2[i2];
                if (c0870o8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0870o8);
                }
                i2++;
            }
        }
        int i3 = this.f8845e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0844n8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0844n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0844n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8841a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f8842b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f8843c == null) {
                    this.f8843c = new C0947r8();
                }
                codedInputByteBufferNano.readMessage(this.f8843c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0870o8[] c0870o8Arr = this.f8844d;
                int length = c0870o8Arr == null ? 0 : c0870o8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0870o8[] c0870o8Arr2 = new C0870o8[i2];
                if (length != 0) {
                    System.arraycopy(c0870o8Arr, 0, c0870o8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0870o8 c0870o8 = new C0870o8();
                    c0870o8Arr2[length] = c0870o8;
                    codedInputByteBufferNano.readMessage(c0870o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0870o8 c0870o82 = new C0870o8();
                c0870o8Arr2[length] = c0870o82;
                codedInputByteBufferNano.readMessage(c0870o82);
                this.f8844d = c0870o8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8845e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C0844n8 a(byte[] bArr) {
        return (C0844n8) MessageNano.mergeFrom(new C0844n8(), bArr);
    }
}
