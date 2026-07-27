package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609e6 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f8107l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8108m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0609e6[] f8109n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f8110o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f8111p;

    /* renamed from: a, reason: collision with root package name */
    public C0713i6 f8112a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f8113b;

    /* renamed from: c, reason: collision with root package name */
    public String f8114c;

    /* renamed from: d, reason: collision with root package name */
    public int f8115d;

    /* renamed from: e, reason: collision with root package name */
    public C0661g6[] f8116e;

    /* renamed from: f, reason: collision with root package name */
    public String f8117f;

    /* renamed from: g, reason: collision with root package name */
    public int f8118g;

    /* renamed from: h, reason: collision with root package name */
    public C0584d6 f8119h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f8120i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f8121j;

    /* renamed from: k, reason: collision with root package name */
    public C0506a6[] f8122k;

    public C0609e6() {
        if (!f8111p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f8111p) {
                        f8110o = InternalNano.bytesDefaultValue("JVM");
                        f8111p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0609e6[] b() {
        if (f8109n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8109n == null) {
                        f8109n = new C0609e6[0];
                    }
                } finally {
                }
            }
        }
        return f8109n;
    }

    public final C0609e6 a() {
        this.f8112a = null;
        this.f8113b = null;
        this.f8114c = "";
        this.f8115d = -1;
        this.f8116e = C0661g6.b();
        this.f8117f = "";
        this.f8118g = 0;
        this.f8119h = null;
        this.f8120i = (byte[]) f8110o.clone();
        this.f8121j = WireFormatNano.EMPTY_BYTES;
        this.f8122k = C0506a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0713i6 c0713i6 = this.f8112a;
        if (c0713i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0713i6);
        }
        Y5 y5 = this.f8113b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f8114c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8114c);
        }
        int i2 = this.f8115d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        C0661g6[] c0661g6Arr = this.f8116e;
        int i3 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8116e;
                if (i6 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i6];
                if (c0661g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0661g6) + computeSerializedSize;
                }
                i6++;
            }
        }
        if (!this.f8117f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f8117f);
        }
        int i7 = this.f8118g;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i7);
        }
        C0584d6 c0584d6 = this.f8119h;
        if (c0584d6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c0584d6);
        }
        if (!Arrays.equals(this.f8120i, f8110o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f8120i);
        }
        if (!Arrays.equals(this.f8121j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f8121j);
        }
        C0506a6[] c0506a6Arr = this.f8122k;
        if (c0506a6Arr != null && c0506a6Arr.length > 0) {
            while (true) {
                C0506a6[] c0506a6Arr2 = this.f8122k;
                if (i3 >= c0506a6Arr2.length) {
                    break;
                }
                C0506a6 c0506a6 = c0506a6Arr2[i3];
                if (c0506a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c0506a6) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0713i6 c0713i6 = this.f8112a;
        if (c0713i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0713i6);
        }
        Y5 y5 = this.f8113b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f8114c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f8114c);
        }
        int i2 = this.f8115d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        C0661g6[] c0661g6Arr = this.f8116e;
        int i3 = 0;
        if (c0661g6Arr != null && c0661g6Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0661g6[] c0661g6Arr2 = this.f8116e;
                if (i6 >= c0661g6Arr2.length) {
                    break;
                }
                C0661g6 c0661g6 = c0661g6Arr2[i6];
                if (c0661g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0661g6);
                }
                i6++;
            }
        }
        if (!this.f8117f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f8117f);
        }
        int i7 = this.f8118g;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i7);
        }
        C0584d6 c0584d6 = this.f8119h;
        if (c0584d6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c0584d6);
        }
        if (!Arrays.equals(this.f8120i, f8110o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f8120i);
        }
        if (!Arrays.equals(this.f8121j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f8121j);
        }
        C0506a6[] c0506a6Arr = this.f8122k;
        if (c0506a6Arr != null && c0506a6Arr.length > 0) {
            while (true) {
                C0506a6[] c0506a6Arr2 = this.f8122k;
                if (i3 >= c0506a6Arr2.length) {
                    break;
                }
                C0506a6 c0506a6 = c0506a6Arr2[i3];
                if (c0506a6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c0506a6);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0609e6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0609e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f8112a == null) {
                        this.f8112a = new C0713i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f8112a);
                    break;
                case 18:
                    if (this.f8113b == null) {
                        this.f8113b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f8113b);
                    break;
                case 26:
                    this.f8114c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f8115d = readInt32;
                        break;
                    }
                case C0793l9.f8691M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0661g6[] c0661g6Arr = this.f8116e;
                    int length = c0661g6Arr == null ? 0 : c0661g6Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0661g6[] c0661g6Arr2 = new C0661g6[i2];
                    if (length != 0) {
                        System.arraycopy(c0661g6Arr, 0, c0661g6Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        C0661g6 c0661g6 = new C0661g6();
                        c0661g6Arr2[length] = c0661g6;
                        codedInputByteBufferNano.readMessage(c0661g6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0661g6 c0661g62 = new C0661g6();
                    c0661g6Arr2[length] = c0661g62;
                    codedInputByteBufferNano.readMessage(c0661g62);
                    this.f8116e = c0661g6Arr2;
                    break;
                case 50:
                    this.f8117f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f8118g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f8119h == null) {
                        this.f8119h = new C0584d6();
                    }
                    codedInputByteBufferNano.readMessage(this.f8119h);
                    break;
                case 74:
                    this.f8120i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f8121j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C0506a6[] c0506a6Arr = this.f8122k;
                    int length2 = c0506a6Arr == null ? 0 : c0506a6Arr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    C0506a6[] c0506a6Arr2 = new C0506a6[i3];
                    if (length2 != 0) {
                        System.arraycopy(c0506a6Arr, 0, c0506a6Arr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        C0506a6 c0506a6 = new C0506a6();
                        c0506a6Arr2[length2] = c0506a6;
                        codedInputByteBufferNano.readMessage(c0506a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C0506a6 c0506a62 = new C0506a6();
                    c0506a6Arr2[length2] = c0506a62;
                    codedInputByteBufferNano.readMessage(c0506a62);
                    this.f8122k = c0506a6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0609e6 a(byte[] bArr) {
        return (C0609e6) MessageNano.mergeFrom(new C0609e6(), bArr);
    }
}
