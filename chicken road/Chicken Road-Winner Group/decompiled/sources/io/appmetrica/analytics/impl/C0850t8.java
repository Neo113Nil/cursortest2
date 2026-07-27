package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850t8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0850t8[] f8346h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8347a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8348b;

    /* renamed from: c, reason: collision with root package name */
    public C0643l8 f8349c;

    /* renamed from: d, reason: collision with root package name */
    public C0798r8 f8350d;

    /* renamed from: e, reason: collision with root package name */
    public C0824s8 f8351e;
    public C0824s8 f;

    /* renamed from: g, reason: collision with root package name */
    public C0876u8[] f8352g;

    public C0850t8() {
        a();
    }

    public static C0850t8[] b() {
        if (f8346h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8346h == null) {
                        f8346h = new C0850t8[0];
                    }
                } finally {
                }
            }
        }
        return f8346h;
    }

    public final C0850t8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8347a = bArr;
        this.f8348b = bArr;
        this.f8349c = null;
        this.f8350d = null;
        this.f8351e = null;
        this.f = null;
        this.f8352g = C0876u8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8347a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8347a);
        }
        if (!Arrays.equals(this.f8348b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8348b);
        }
        C0643l8 c0643l8 = this.f8349c;
        if (c0643l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0643l8);
        }
        C0798r8 c0798r8 = this.f8350d;
        if (c0798r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0798r8);
        }
        C0824s8 c0824s8 = this.f8351e;
        if (c0824s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0824s8);
        }
        C0824s8 c0824s82 = this.f;
        if (c0824s82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0824s82);
        }
        C0876u8[] c0876u8Arr = this.f8352g;
        if (c0876u8Arr != null && c0876u8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0876u8[] c0876u8Arr2 = this.f8352g;
                if (i3 >= c0876u8Arr2.length) {
                    break;
                }
                C0876u8 c0876u8 = c0876u8Arr2[i3];
                if (c0876u8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0876u8) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8347a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8347a);
        }
        if (!Arrays.equals(this.f8348b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8348b);
        }
        C0643l8 c0643l8 = this.f8349c;
        if (c0643l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0643l8);
        }
        C0798r8 c0798r8 = this.f8350d;
        if (c0798r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0798r8);
        }
        C0824s8 c0824s8 = this.f8351e;
        if (c0824s8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0824s8);
        }
        C0824s8 c0824s82 = this.f;
        if (c0824s82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0824s82);
        }
        C0876u8[] c0876u8Arr = this.f8352g;
        if (c0876u8Arr != null && c0876u8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0876u8[] c0876u8Arr2 = this.f8352g;
                if (i3 >= c0876u8Arr2.length) {
                    break;
                }
                C0876u8 c0876u8 = c0876u8Arr2[i3];
                if (c0876u8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0876u8);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0850t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0850t8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0850t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8347a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f8348b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f8349c == null) {
                    this.f8349c = new C0643l8();
                }
                codedInputByteBufferNano.readMessage(this.f8349c);
            } else if (readTag == 34) {
                if (this.f8350d == null) {
                    this.f8350d = new C0798r8();
                }
                codedInputByteBufferNano.readMessage(this.f8350d);
            } else if (readTag == 42) {
                if (this.f8351e == null) {
                    this.f8351e = new C0824s8();
                }
                codedInputByteBufferNano.readMessage(this.f8351e);
            } else if (readTag == 50) {
                if (this.f == null) {
                    this.f = new C0824s8();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0876u8[] c0876u8Arr = this.f8352g;
                int length = c0876u8Arr == null ? 0 : c0876u8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0876u8[] c0876u8Arr2 = new C0876u8[i3];
                if (length != 0) {
                    System.arraycopy(c0876u8Arr, 0, c0876u8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0876u8 c0876u8 = new C0876u8();
                    c0876u8Arr2[length] = c0876u8;
                    codedInputByteBufferNano.readMessage(c0876u8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0876u8 c0876u82 = new C0876u8();
                c0876u8Arr2[length] = c0876u82;
                codedInputByteBufferNano.readMessage(c0876u82);
                this.f8352g = c0876u8Arr2;
            }
        }
        return this;
    }

    public static C0850t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0850t8) MessageNano.mergeFrom(new C0850t8(), bArr);
    }
}
