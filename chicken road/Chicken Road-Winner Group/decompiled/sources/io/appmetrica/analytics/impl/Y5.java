package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Y5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Y5[] f6849d;

    /* renamed from: a, reason: collision with root package name */
    public C0538h6 f6850a;

    /* renamed from: b, reason: collision with root package name */
    public C0538h6[] f6851b;

    /* renamed from: c, reason: collision with root package name */
    public String f6852c;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f6849d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6849d == null) {
                        f6849d = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f6849d;
    }

    public final Y5 a() {
        this.f6850a = null;
        this.f6851b = C0538h6.b();
        this.f6852c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0538h6 c0538h6 = this.f6850a;
        if (c0538h6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0538h6);
        }
        C0538h6[] c0538h6Arr = this.f6851b;
        if (c0538h6Arr != null && c0538h6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0538h6[] c0538h6Arr2 = this.f6851b;
                if (i3 >= c0538h6Arr2.length) {
                    break;
                }
                C0538h6 c0538h62 = c0538h6Arr2[i3];
                if (c0538h62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0538h62) + computeSerializedSize;
                }
                i3++;
            }
        }
        return !this.f6852c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f6852c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0538h6 c0538h6 = this.f6850a;
        if (c0538h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0538h6);
        }
        C0538h6[] c0538h6Arr = this.f6851b;
        if (c0538h6Arr != null && c0538h6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0538h6[] c0538h6Arr2 = this.f6851b;
                if (i3 >= c0538h6Arr2.length) {
                    break;
                }
                C0538h6 c0538h62 = c0538h6Arr2[i3];
                if (c0538h62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0538h62);
                }
                i3++;
            }
        }
        if (!this.f6852c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6852c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f6850a == null) {
                    this.f6850a = new C0538h6();
                }
                codedInputByteBufferNano.readMessage(this.f6850a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0538h6[] c0538h6Arr = this.f6851b;
                int length = c0538h6Arr == null ? 0 : c0538h6Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0538h6[] c0538h6Arr2 = new C0538h6[i3];
                if (length != 0) {
                    System.arraycopy(c0538h6Arr, 0, c0538h6Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0538h6 c0538h6 = new C0538h6();
                    c0538h6Arr2[length] = c0538h6;
                    codedInputByteBufferNano.readMessage(c0538h6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0538h6 c0538h62 = new C0538h6();
                c0538h6Arr2[length] = c0538h62;
                codedInputByteBufferNano.readMessage(c0538h62);
                this.f6851b = c0538h6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6852c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
