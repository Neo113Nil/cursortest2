package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644l9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f7757A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f7758B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f7759C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f7760D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f7761E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f7762F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f7763G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f7764H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f7765I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f7766J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f7767K = 38;
    public static final int L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f7768M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f7769N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f7770O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f7771P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f7772Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f7773R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f7774S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C0644l9[] f7775T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f7776t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f7777u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f7778v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f7779w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f7780x = 7;
    public static final int y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7781z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f7782a;

    /* renamed from: b, reason: collision with root package name */
    public long f7783b;

    /* renamed from: c, reason: collision with root package name */
    public int f7784c;

    /* renamed from: d, reason: collision with root package name */
    public String f7785d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7786e;
    public C0515g9 f;

    /* renamed from: g, reason: collision with root package name */
    public C0618k9 f7787g;

    /* renamed from: h, reason: collision with root package name */
    public String f7788h;

    /* renamed from: i, reason: collision with root package name */
    public int f7789i;

    /* renamed from: j, reason: collision with root package name */
    public int f7790j;

    /* renamed from: k, reason: collision with root package name */
    public int f7791k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f7792l;

    /* renamed from: m, reason: collision with root package name */
    public int f7793m;

    /* renamed from: n, reason: collision with root package name */
    public long f7794n;

    /* renamed from: o, reason: collision with root package name */
    public long f7795o;

    /* renamed from: p, reason: collision with root package name */
    public int f7796p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7797q;

    /* renamed from: r, reason: collision with root package name */
    public long f7798r;

    /* renamed from: s, reason: collision with root package name */
    public C0592j9[] f7799s;

    public C0644l9() {
        a();
    }

    public static C0644l9[] b() {
        if (f7775T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7775T == null) {
                        f7775T = new C0644l9[0];
                    }
                } finally {
                }
            }
        }
        return f7775T;
    }

    public final C0644l9 a() {
        this.f7782a = 0L;
        this.f7783b = 0L;
        this.f7784c = 0;
        this.f7785d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7786e = bArr;
        this.f = null;
        this.f7787g = null;
        this.f7788h = "";
        this.f7789i = 0;
        this.f7790j = 0;
        this.f7791k = -1;
        this.f7792l = bArr;
        this.f7793m = -1;
        this.f7794n = 0L;
        this.f7795o = 0L;
        this.f7796p = 0;
        this.f7797q = false;
        this.f7798r = 1L;
        this.f7799s = C0592j9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f7784c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f7783b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f7782a) + super.computeSerializedSize();
        if (!this.f7785d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7785d);
        }
        byte[] bArr = this.f7786e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f7786e);
        }
        C0515g9 c0515g9 = this.f;
        if (c0515g9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0515g9);
        }
        C0618k9 c0618k9 = this.f7787g;
        if (c0618k9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0618k9);
        }
        if (!this.f7788h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f7788h);
        }
        int i3 = this.f7789i;
        if (i3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i3);
        }
        int i4 = this.f7790j;
        if (i4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i4);
        }
        int i5 = this.f7791k;
        if (i5 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i5);
        }
        if (!Arrays.equals(this.f7792l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f7792l);
        }
        int i6 = this.f7793m;
        if (i6 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i6);
        }
        long j3 = this.f7794n;
        if (j3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j3);
        }
        long j4 = this.f7795o;
        if (j4 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j4);
        }
        int i7 = this.f7796p;
        if (i7 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i7);
        }
        boolean z3 = this.f7797q;
        if (z3) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z3);
        }
        long j5 = this.f7798r;
        if (j5 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j5);
        }
        C0592j9[] c0592j9Arr = this.f7799s;
        if (c0592j9Arr != null && c0592j9Arr.length > 0) {
            int i8 = 0;
            while (true) {
                C0592j9[] c0592j9Arr2 = this.f7799s;
                if (i8 >= c0592j9Arr2.length) {
                    break;
                }
                C0592j9 c0592j9 = c0592j9Arr2[i8];
                if (c0592j9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0592j9) + computeUInt32Size;
                }
                i8++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f7782a);
        codedOutputByteBufferNano.writeUInt64(2, this.f7783b);
        codedOutputByteBufferNano.writeUInt32(3, this.f7784c);
        if (!this.f7785d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7785d);
        }
        byte[] bArr = this.f7786e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7786e);
        }
        C0515g9 c0515g9 = this.f;
        if (c0515g9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0515g9);
        }
        C0618k9 c0618k9 = this.f7787g;
        if (c0618k9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0618k9);
        }
        if (!this.f7788h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f7788h);
        }
        int i3 = this.f7789i;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i3);
        }
        int i4 = this.f7790j;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i4);
        }
        int i5 = this.f7791k;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i5);
        }
        if (!Arrays.equals(this.f7792l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f7792l);
        }
        int i6 = this.f7793m;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i6);
        }
        long j3 = this.f7794n;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j3);
        }
        long j4 = this.f7795o;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j4);
        }
        int i7 = this.f7796p;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i7);
        }
        boolean z3 = this.f7797q;
        if (z3) {
            codedOutputByteBufferNano.writeBool(23, z3);
        }
        long j5 = this.f7798r;
        if (j5 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j5);
        }
        C0592j9[] c0592j9Arr = this.f7799s;
        if (c0592j9Arr != null && c0592j9Arr.length > 0) {
            int i8 = 0;
            while (true) {
                C0592j9[] c0592j9Arr2 = this.f7799s;
                if (i8 >= c0592j9Arr2.length) {
                    break;
                }
                C0592j9 c0592j9 = c0592j9Arr2[i8];
                if (c0592j9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0592j9);
                }
                i8++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0644l9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0644l9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0644l9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f7782a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f7783b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f7784c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f7785d = codedInputByteBufferNano.readString();
                    break;
                case f7768M /* 42 */:
                    this.f7786e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new C0515g9();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                    break;
                case 58:
                    if (this.f7787g == null) {
                        this.f7787g = new C0618k9();
                    }
                    codedInputByteBufferNano.readMessage(this.f7787g);
                    break;
                case 66:
                    this.f7788h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f7789i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f7790j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f7791k = readInt322;
                        break;
                    }
                case 114:
                    this.f7792l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f7793m = readInt323;
                        break;
                    }
                case 128:
                    this.f7794n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f7795o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f7796p = readInt324;
                        break;
                    }
                case 184:
                    this.f7797q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f7798r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0592j9[] c0592j9Arr = this.f7799s;
                    int length = c0592j9Arr == null ? 0 : c0592j9Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0592j9[] c0592j9Arr2 = new C0592j9[i3];
                    if (length != 0) {
                        System.arraycopy(c0592j9Arr, 0, c0592j9Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0592j9 c0592j9 = new C0592j9();
                        c0592j9Arr2[length] = c0592j9;
                        codedInputByteBufferNano.readMessage(c0592j9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0592j9 c0592j92 = new C0592j9();
                    c0592j9Arr2[length] = c0592j92;
                    codedInputByteBufferNano.readMessage(c0592j92);
                    this.f7799s = c0592j9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0644l9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0644l9) MessageNano.mergeFrom(new C0644l9(), bArr);
    }
}
