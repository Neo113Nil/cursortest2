package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Q8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Q8[] f6462b;

    /* renamed from: a, reason: collision with root package name */
    public P8[] f6463a;

    public Q8() {
        a();
    }

    public static Q8[] b() {
        if (f6462b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6462b == null) {
                        f6462b = new Q8[0];
                    }
                } finally {
                }
            }
        }
        return f6462b;
    }

    public final Q8 a() {
        this.f6463a = P8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        P8[] p8Arr = this.f6463a;
        if (p8Arr != null && p8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                P8[] p8Arr2 = this.f6463a;
                if (i3 >= p8Arr2.length) {
                    break;
                }
                P8 p8 = p8Arr2[i3];
                if (p8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, p8) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        P8[] p8Arr = this.f6463a;
        if (p8Arr != null && p8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                P8[] p8Arr2 = this.f6463a;
                if (i3 >= p8Arr2.length) {
                    break;
                }
                P8 p8 = p8Arr2[i3];
                if (p8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, p8);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                P8[] p8Arr = this.f6463a;
                int length = p8Arr == null ? 0 : p8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                P8[] p8Arr2 = new P8[i3];
                if (length != 0) {
                    System.arraycopy(p8Arr, 0, p8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    P8 p8 = new P8();
                    p8Arr2[length] = p8;
                    codedInputByteBufferNano.readMessage(p8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                P8 p82 = new P8();
                p8Arr2[length] = p82;
                codedInputByteBufferNano.readMessage(p82);
                this.f6463a = p8Arr2;
            }
        }
        return this;
    }

    public static Q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q8().mergeFrom(codedInputByteBufferNano);
    }

    public static Q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q8) MessageNano.mergeFrom(new Q8(), bArr);
    }
}
