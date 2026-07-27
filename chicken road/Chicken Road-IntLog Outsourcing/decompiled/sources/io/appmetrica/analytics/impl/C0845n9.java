package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845n9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8846d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8847e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8848f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8849g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8850h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8851i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8852j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8853k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8854l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8855m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8856n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8857o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8858p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0845n9[] f8859q;

    /* renamed from: a, reason: collision with root package name */
    public long f8860a;

    /* renamed from: b, reason: collision with root package name */
    public C0819m9 f8861b;

    /* renamed from: c, reason: collision with root package name */
    public C0793l9[] f8862c;

    public C0845n9() {
        a();
    }

    public static C0845n9[] b() {
        if (f8859q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8859q == null) {
                        f8859q = new C0845n9[0];
                    }
                } finally {
                }
            }
        }
        return f8859q;
    }

    public final C0845n9 a() {
        this.f8860a = 0L;
        this.f8861b = null;
        this.f8862c = C0793l9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f8860a) + super.computeSerializedSize();
        C0819m9 c0819m9 = this.f8861b;
        if (c0819m9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0819m9);
        }
        C0793l9[] c0793l9Arr = this.f8862c;
        if (c0793l9Arr != null && c0793l9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0793l9[] c0793l9Arr2 = this.f8862c;
                if (i2 >= c0793l9Arr2.length) {
                    break;
                }
                C0793l9 c0793l9 = c0793l9Arr2[i2];
                if (c0793l9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0793l9) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f8860a);
        C0819m9 c0819m9 = this.f8861b;
        if (c0819m9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0819m9);
        }
        C0793l9[] c0793l9Arr = this.f8862c;
        if (c0793l9Arr != null && c0793l9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0793l9[] c0793l9Arr2 = this.f8862c;
                if (i2 >= c0793l9Arr2.length) {
                    break;
                }
                C0793l9 c0793l9 = c0793l9Arr2[i2];
                if (c0793l9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0793l9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0845n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8860a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f8861b == null) {
                    this.f8861b = new C0819m9();
                }
                codedInputByteBufferNano.readMessage(this.f8861b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0793l9[] c0793l9Arr = this.f8862c;
                int length = c0793l9Arr == null ? 0 : c0793l9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0793l9[] c0793l9Arr2 = new C0793l9[i2];
                if (length != 0) {
                    System.arraycopy(c0793l9Arr, 0, c0793l9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0793l9 c0793l9 = new C0793l9();
                    c0793l9Arr2[length] = c0793l9;
                    codedInputByteBufferNano.readMessage(c0793l9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0793l9 c0793l92 = new C0793l9();
                c0793l9Arr2[length] = c0793l92;
                codedInputByteBufferNano.readMessage(c0793l92);
                this.f8862c = c0793l9Arr2;
            }
        }
    }

    public static C0845n9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0845n9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0845n9 a(byte[] bArr) {
        return (C0845n9) MessageNano.mergeFrom(new C0845n9(), bArr);
    }
}
