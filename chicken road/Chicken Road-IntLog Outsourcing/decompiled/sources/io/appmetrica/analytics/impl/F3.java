package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class F3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6771c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6772d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6773e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6774f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile F3[] f6775g;

    /* renamed from: a, reason: collision with root package name */
    public C3 f6776a;

    /* renamed from: b, reason: collision with root package name */
    public C3[] f6777b;

    public F3() {
        a();
    }

    public static F3[] b() {
        if (f6775g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6775g == null) {
                        f6775g = new F3[0];
                    }
                } finally {
                }
            }
        }
        return f6775g;
    }

    public final F3 a() {
        this.f6776a = null;
        this.f6777b = C3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C3 c32 = this.f6776a;
        if (c32 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c32);
        }
        C3[] c3Arr = this.f6777b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3[] c3Arr2 = this.f6777b;
                if (i2 >= c3Arr2.length) {
                    break;
                }
                C3 c33 = c3Arr2[i2];
                if (c33 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c33) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C3 c32 = this.f6776a;
        if (c32 != null) {
            codedOutputByteBufferNano.writeMessage(1, c32);
        }
        C3[] c3Arr = this.f6777b;
        if (c3Arr != null && c3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C3[] c3Arr2 = this.f6777b;
                if (i2 >= c3Arr2.length) {
                    break;
                }
                C3 c33 = c3Arr2[i2];
                if (c33 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c33);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6776a == null) {
                    this.f6776a = new C3();
                }
                codedInputByteBufferNano.readMessage(this.f6776a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3[] c3Arr = this.f6777b;
                int length = c3Arr == null ? 0 : c3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C3[] c3Arr2 = new C3[i2];
                if (length != 0) {
                    System.arraycopy(c3Arr, 0, c3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C3 c32 = new C3();
                    c3Arr2[length] = c32;
                    codedInputByteBufferNano.readMessage(c32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3 c33 = new C3();
                c3Arr2[length] = c33;
                codedInputByteBufferNano.readMessage(c33);
                this.f6777b = c3Arr2;
            }
        }
    }

    public static F3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new F3().mergeFrom(codedInputByteBufferNano);
    }

    public static F3 a(byte[] bArr) {
        return (F3) MessageNano.mergeFrom(new F3(), bArr);
    }
}
