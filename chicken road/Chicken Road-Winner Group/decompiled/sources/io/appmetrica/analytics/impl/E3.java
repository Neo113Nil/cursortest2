package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class E3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile E3[] f5880b;

    /* renamed from: a, reason: collision with root package name */
    public D3[] f5881a;

    public E3() {
        a();
    }

    public static E3[] b() {
        if (f5880b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5880b == null) {
                        f5880b = new E3[0];
                    }
                } finally {
                }
            }
        }
        return f5880b;
    }

    public final E3 a() {
        this.f5881a = D3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        D3[] d3Arr = this.f5881a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i3 = 0;
            while (true) {
                D3[] d3Arr2 = this.f5881a;
                if (i3 >= d3Arr2.length) {
                    break;
                }
                D3 d3 = d3Arr2[i3];
                if (d3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, d3) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D3[] d3Arr = this.f5881a;
        if (d3Arr != null && d3Arr.length > 0) {
            int i3 = 0;
            while (true) {
                D3[] d3Arr2 = this.f5881a;
                if (i3 >= d3Arr2.length) {
                    break;
                }
                D3 d3 = d3Arr2[i3];
                if (d3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, d3);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                D3[] d3Arr = this.f5881a;
                int length = d3Arr == null ? 0 : d3Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                D3[] d3Arr2 = new D3[i3];
                if (length != 0) {
                    System.arraycopy(d3Arr, 0, d3Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    D3 d3 = new D3();
                    d3Arr2[length] = d3;
                    codedInputByteBufferNano.readMessage(d3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                D3 d32 = new D3();
                d3Arr2[length] = d32;
                codedInputByteBufferNano.readMessage(d32);
                this.f5881a = d3Arr2;
            }
        }
        return this;
    }

    public static E3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E3().mergeFrom(codedInputByteBufferNano);
    }

    public static E3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E3) MessageNano.mergeFrom(new E3(), bArr);
    }
}
