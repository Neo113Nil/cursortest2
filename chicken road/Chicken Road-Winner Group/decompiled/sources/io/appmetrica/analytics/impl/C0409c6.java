package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409c6 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f7085k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7086l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0409c6[] f7087m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f7088n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f7089o;

    /* renamed from: a, reason: collision with root package name */
    public C0564i6 f7090a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f7091b;

    /* renamed from: c, reason: collision with root package name */
    public String f7092c;

    /* renamed from: d, reason: collision with root package name */
    public int f7093d;

    /* renamed from: e, reason: collision with root package name */
    public C0512g6[] f7094e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0383b6 f7095g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f7096h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f7097i;

    /* renamed from: j, reason: collision with root package name */
    public C0357a6[] f7098j;

    public C0409c6() {
        if (!f7089o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7089o) {
                        f7088n = InternalNano.bytesDefaultValue("JVM");
                        f7089o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0409c6[] b() {
        if (f7087m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7087m == null) {
                        f7087m = new C0409c6[0];
                    }
                } finally {
                }
            }
        }
        return f7087m;
    }

    public final C0409c6 a() {
        this.f7090a = null;
        this.f7091b = null;
        this.f7092c = "";
        this.f7093d = -1;
        this.f7094e = C0512g6.b();
        this.f = 0;
        this.f7095g = null;
        this.f7096h = (byte[]) f7088n.clone();
        this.f7097i = WireFormatNano.EMPTY_BYTES;
        this.f7098j = C0357a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0564i6 c0564i6 = this.f7090a;
        if (c0564i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0564i6);
        }
        Y5 y5 = this.f7091b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f7092c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7092c);
        }
        int i3 = this.f7093d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        C0512g6[] c0512g6Arr = this.f7094e;
        int i4 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7094e;
                if (i5 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i5];
                if (c0512g6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0512g6) + computeSerializedSize;
                }
                i5++;
            }
        }
        int i6 = this.f;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i6);
        }
        C0383b6 c0383b6 = this.f7095g;
        if (c0383b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c0383b6);
        }
        if (!Arrays.equals(this.f7096h, f7088n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7096h);
        }
        if (!Arrays.equals(this.f7097i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7097i);
        }
        C0357a6[] c0357a6Arr = this.f7098j;
        if (c0357a6Arr != null && c0357a6Arr.length > 0) {
            while (true) {
                C0357a6[] c0357a6Arr2 = this.f7098j;
                if (i4 >= c0357a6Arr2.length) {
                    break;
                }
                C0357a6 c0357a6 = c0357a6Arr2[i4];
                if (c0357a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0357a6) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0564i6 c0564i6 = this.f7090a;
        if (c0564i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0564i6);
        }
        Y5 y5 = this.f7091b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f7092c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7092c);
        }
        int i3 = this.f7093d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        C0512g6[] c0512g6Arr = this.f7094e;
        int i4 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7094e;
                if (i5 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i5];
                if (c0512g6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0512g6);
                }
                i5++;
            }
        }
        int i6 = this.f;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i6);
        }
        C0383b6 c0383b6 = this.f7095g;
        if (c0383b6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0383b6);
        }
        if (!Arrays.equals(this.f7096h, f7088n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7096h);
        }
        if (!Arrays.equals(this.f7097i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7097i);
        }
        C0357a6[] c0357a6Arr = this.f7098j;
        if (c0357a6Arr != null && c0357a6Arr.length > 0) {
            while (true) {
                C0357a6[] c0357a6Arr2 = this.f7098j;
                if (i4 >= c0357a6Arr2.length) {
                    break;
                }
                C0357a6 c0357a6 = c0357a6Arr2[i4];
                if (c0357a6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0357a6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0409c6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0409c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0409c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f7090a == null) {
                        this.f7090a = new C0564i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7090a);
                    break;
                case 18:
                    if (this.f7091b == null) {
                        this.f7091b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7091b);
                    break;
                case C0644l9.f7763G /* 26 */:
                    this.f7092c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7093d = readInt32;
                        break;
                    }
                case C0644l9.f7768M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0512g6[] c0512g6Arr = this.f7094e;
                    int length = c0512g6Arr == null ? 0 : c0512g6Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0512g6[] c0512g6Arr2 = new C0512g6[i3];
                    if (length != 0) {
                        System.arraycopy(c0512g6Arr, 0, c0512g6Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0512g6 c0512g6 = new C0512g6();
                        c0512g6Arr2[length] = c0512g6;
                        codedInputByteBufferNano.readMessage(c0512g6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0512g6 c0512g62 = new C0512g6();
                    c0512g6Arr2[length] = c0512g62;
                    codedInputByteBufferNano.readMessage(c0512g62);
                    this.f7094e = c0512g6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f7095g == null) {
                        this.f7095g = new C0383b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7095g);
                    break;
                case 66:
                    this.f7096h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f7097i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C0357a6[] c0357a6Arr = this.f7098j;
                    int length2 = c0357a6Arr == null ? 0 : c0357a6Arr.length;
                    int i4 = repeatedFieldArrayLength2 + length2;
                    C0357a6[] c0357a6Arr2 = new C0357a6[i4];
                    if (length2 != 0) {
                        System.arraycopy(c0357a6Arr, 0, c0357a6Arr2, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        C0357a6 c0357a6 = new C0357a6();
                        c0357a6Arr2[length2] = c0357a6;
                        codedInputByteBufferNano.readMessage(c0357a6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C0357a6 c0357a62 = new C0357a6();
                    c0357a6Arr2[length2] = c0357a62;
                    codedInputByteBufferNano.readMessage(c0357a62);
                    this.f7098j = c0357a6Arr2;
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

    public static C0409c6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0409c6) MessageNano.mergeFrom(new C0409c6(), bArr);
    }
}
