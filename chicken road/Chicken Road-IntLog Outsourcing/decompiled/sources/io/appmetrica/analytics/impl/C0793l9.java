package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793l9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f8679A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f8680B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f8681C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f8682D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f8683E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f8684F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f8685G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f8686H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f8687I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f8688J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f8689K = 38;

    /* renamed from: L, reason: collision with root package name */
    public static final int f8690L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f8691M = 42;
    public static final int N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f8692O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f8693P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f8694Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f8695R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f8696S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C0793l9[] f8697T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f8698t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f8699u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f8700v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f8701w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f8702x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f8703y = 13;
    public static final int z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f8704a;

    /* renamed from: b, reason: collision with root package name */
    public long f8705b;

    /* renamed from: c, reason: collision with root package name */
    public int f8706c;

    /* renamed from: d, reason: collision with root package name */
    public String f8707d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8708e;

    /* renamed from: f, reason: collision with root package name */
    public C0664g9 f8709f;

    /* renamed from: g, reason: collision with root package name */
    public C0767k9 f8710g;

    /* renamed from: h, reason: collision with root package name */
    public String f8711h;

    /* renamed from: i, reason: collision with root package name */
    public int f8712i;

    /* renamed from: j, reason: collision with root package name */
    public int f8713j;

    /* renamed from: k, reason: collision with root package name */
    public int f8714k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f8715l;

    /* renamed from: m, reason: collision with root package name */
    public int f8716m;

    /* renamed from: n, reason: collision with root package name */
    public long f8717n;

    /* renamed from: o, reason: collision with root package name */
    public long f8718o;

    /* renamed from: p, reason: collision with root package name */
    public int f8719p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8720q;

    /* renamed from: r, reason: collision with root package name */
    public long f8721r;

    /* renamed from: s, reason: collision with root package name */
    public C0741j9[] f8722s;

    public C0793l9() {
        a();
    }

    public static C0793l9[] b() {
        if (f8697T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8697T == null) {
                        f8697T = new C0793l9[0];
                    }
                } finally {
                }
            }
        }
        return f8697T;
    }

    public final C0793l9 a() {
        this.f8704a = 0L;
        this.f8705b = 0L;
        this.f8706c = 0;
        this.f8707d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8708e = bArr;
        this.f8709f = null;
        this.f8710g = null;
        this.f8711h = "";
        this.f8712i = 0;
        this.f8713j = 0;
        this.f8714k = -1;
        this.f8715l = bArr;
        this.f8716m = -1;
        this.f8717n = 0L;
        this.f8718o = 0L;
        this.f8719p = 0;
        this.f8720q = false;
        this.f8721r = 1L;
        this.f8722s = C0741j9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f8706c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f8705b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8704a) + super.computeSerializedSize();
        if (!this.f8707d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f8707d);
        }
        byte[] bArr = this.f8708e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f8708e);
        }
        C0664g9 c0664g9 = this.f8709f;
        if (c0664g9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0664g9);
        }
        C0767k9 c0767k9 = this.f8710g;
        if (c0767k9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0767k9);
        }
        if (!this.f8711h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f8711h);
        }
        int i2 = this.f8712i;
        if (i2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i2);
        }
        int i3 = this.f8713j;
        if (i3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i3);
        }
        int i6 = this.f8714k;
        if (i6 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i6);
        }
        if (!Arrays.equals(this.f8715l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f8715l);
        }
        int i7 = this.f8716m;
        if (i7 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i7);
        }
        long j2 = this.f8717n;
        if (j2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j2);
        }
        long j6 = this.f8718o;
        if (j6 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j6);
        }
        int i8 = this.f8719p;
        if (i8 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i8);
        }
        boolean z5 = this.f8720q;
        if (z5) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z5);
        }
        long j7 = this.f8721r;
        if (j7 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j7);
        }
        C0741j9[] c0741j9Arr = this.f8722s;
        if (c0741j9Arr != null && c0741j9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C0741j9[] c0741j9Arr2 = this.f8722s;
                if (i9 >= c0741j9Arr2.length) {
                    break;
                }
                C0741j9 c0741j9 = c0741j9Arr2[i9];
                if (c0741j9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0741j9) + computeUInt32Size;
                }
                i9++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f8704a);
        codedOutputByteBufferNano.writeUInt64(2, this.f8705b);
        codedOutputByteBufferNano.writeUInt32(3, this.f8706c);
        if (!this.f8707d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8707d);
        }
        byte[] bArr = this.f8708e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f8708e);
        }
        C0664g9 c0664g9 = this.f8709f;
        if (c0664g9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0664g9);
        }
        C0767k9 c0767k9 = this.f8710g;
        if (c0767k9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0767k9);
        }
        if (!this.f8711h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f8711h);
        }
        int i2 = this.f8712i;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i2);
        }
        int i3 = this.f8713j;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i3);
        }
        int i6 = this.f8714k;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i6);
        }
        if (!Arrays.equals(this.f8715l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f8715l);
        }
        int i7 = this.f8716m;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i7);
        }
        long j2 = this.f8717n;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j2);
        }
        long j6 = this.f8718o;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j6);
        }
        int i8 = this.f8719p;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i8);
        }
        boolean z5 = this.f8720q;
        if (z5) {
            codedOutputByteBufferNano.writeBool(23, z5);
        }
        long j7 = this.f8721r;
        if (j7 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j7);
        }
        C0741j9[] c0741j9Arr = this.f8722s;
        if (c0741j9Arr != null && c0741j9Arr.length > 0) {
            int i9 = 0;
            while (true) {
                C0741j9[] c0741j9Arr2 = this.f8722s;
                if (i9 >= c0741j9Arr2.length) {
                    break;
                }
                C0741j9 c0741j9 = c0741j9Arr2[i9];
                if (c0741j9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0741j9);
                }
                i9++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0793l9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0793l9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0793l9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f8704a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f8705b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f8706c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f8707d = codedInputByteBufferNano.readString();
                    break;
                case f8691M /* 42 */:
                    this.f8708e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f8709f == null) {
                        this.f8709f = new C0664g9();
                    }
                    codedInputByteBufferNano.readMessage(this.f8709f);
                    break;
                case 58:
                    if (this.f8710g == null) {
                        this.f8710g = new C0767k9();
                    }
                    codedInputByteBufferNano.readMessage(this.f8710g);
                    break;
                case 66:
                    this.f8711h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f8712i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f8713j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f8714k = readInt322;
                        break;
                    }
                case 114:
                    this.f8715l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f8716m = readInt323;
                        break;
                    }
                case 128:
                    this.f8717n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f8718o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f8719p = readInt324;
                        break;
                    }
                case 184:
                    this.f8720q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f8721r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0741j9[] c0741j9Arr = this.f8722s;
                    int length = c0741j9Arr == null ? 0 : c0741j9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0741j9[] c0741j9Arr2 = new C0741j9[i2];
                    if (length != 0) {
                        System.arraycopy(c0741j9Arr, 0, c0741j9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        C0741j9 c0741j9 = new C0741j9();
                        c0741j9Arr2[length] = c0741j9;
                        codedInputByteBufferNano.readMessage(c0741j9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0741j9 c0741j92 = new C0741j9();
                    c0741j9Arr2[length] = c0741j92;
                    codedInputByteBufferNano.readMessage(c0741j92);
                    this.f8722s = c0741j9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0793l9 a(byte[] bArr) {
        return (C0793l9) MessageNano.mergeFrom(new C0793l9(), bArr);
    }
}
