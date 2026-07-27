package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class F3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5929c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5930d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5931e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile F3[] f5932g;

    /* renamed from: a, reason: collision with root package name */
    public C3 f5933a;

    /* renamed from: b, reason: collision with root package name */
    public C3[] f5934b;

    public F3() {
        a();
    }

    public static F3[] b() {
        if (f5932g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5932g == null) {
                        f5932g = new F3[0];
                    }
                } finally {
                }
            }
        }
        return f5932g;
    }

    public final F3 a() {
        this.f5933a = null;
        this.f5934b = C3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3 c3 = this.f5933a;
        if (c3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c3);
        }
        C3[] c3Arr = this.f5934b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C3[] c3Arr2 = this.f5934b;
                if (i3 >= c3Arr2.length) {
                    break;
                }
                C3 c32 = c3Arr2[i3];
                if (c32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c32) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C3 c3 = this.f5933a;
        if (c3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c3);
        }
        C3[] c3Arr = this.f5934b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C3[] c3Arr2 = this.f5934b;
                if (i3 >= c3Arr2.length) {
                    break;
                }
                C3 c32 = c3Arr2[i3];
                if (c32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c32);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f5933a == null) {
                    this.f5933a = new C3();
                }
                codedInputByteBufferNano.readMessage(this.f5933a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3[] c3Arr = this.f5934b;
                int length = c3Arr == null ? 0 : c3Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C3[] c3Arr2 = new C3[i3];
                if (length != 0) {
                    System.arraycopy(c3Arr, 0, c3Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C3 c3 = new C3();
                    c3Arr2[length] = c3;
                    codedInputByteBufferNano.readMessage(c3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3 c32 = new C3();
                c3Arr2[length] = c32;
                codedInputByteBufferNano.readMessage(c32);
                this.f5934b = c3Arr2;
            }
        }
        return this;
    }

    public static F3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F3().mergeFrom(codedInputByteBufferNano);
    }

    public static F3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F3) MessageNano.mergeFrom(new F3(), bArr);
    }
}
