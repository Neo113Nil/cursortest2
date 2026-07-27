package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460e6 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f7214l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7215m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0460e6[] f7216n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f7217o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f7218p;

    /* renamed from: a, reason: collision with root package name */
    public C0564i6 f7219a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f7220b;

    /* renamed from: c, reason: collision with root package name */
    public String f7221c;

    /* renamed from: d, reason: collision with root package name */
    public int f7222d;

    /* renamed from: e, reason: collision with root package name */
    public C0512g6[] f7223e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public int f7224g;

    /* renamed from: h, reason: collision with root package name */
    public C0435d6 f7225h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f7226i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f7227j;

    /* renamed from: k, reason: collision with root package name */
    public C0357a6[] f7228k;

    public C0460e6() {
        if (!f7218p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7218p) {
                        f7217o = InternalNano.bytesDefaultValue("JVM");
                        f7218p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0460e6[] b() {
        if (f7216n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7216n == null) {
                        f7216n = new C0460e6[0];
                    }
                } finally {
                }
            }
        }
        return f7216n;
    }

    public final C0460e6 a() {
        this.f7219a = null;
        this.f7220b = null;
        this.f7221c = "";
        this.f7222d = -1;
        this.f7223e = C0512g6.b();
        this.f = "";
        this.f7224g = 0;
        this.f7225h = null;
        this.f7226i = (byte[]) f7217o.clone();
        this.f7227j = WireFormatNano.EMPTY_BYTES;
        this.f7228k = C0357a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0564i6 c0564i6 = this.f7219a;
        if (c0564i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0564i6);
        }
        Y5 y5 = this.f7220b;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y5);
        }
        if (!this.f7221c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7221c);
        }
        int i3 = this.f7222d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        C0512g6[] c0512g6Arr = this.f7223e;
        int i4 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7223e;
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
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        int i6 = this.f7224g;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        C0435d6 c0435d6 = this.f7225h;
        if (c0435d6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c0435d6);
        }
        if (!Arrays.equals(this.f7226i, f7217o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7226i);
        }
        if (!Arrays.equals(this.f7227j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7227j);
        }
        C0357a6[] c0357a6Arr = this.f7228k;
        if (c0357a6Arr != null && c0357a6Arr.length > 0) {
            while (true) {
                C0357a6[] c0357a6Arr2 = this.f7228k;
                if (i4 >= c0357a6Arr2.length) {
                    break;
                }
                C0357a6 c0357a6 = c0357a6Arr2[i4];
                if (c0357a6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c0357a6) + computeSerializedSize;
                }
                i4++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0564i6 c0564i6 = this.f7219a;
        if (c0564i6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0564i6);
        }
        Y5 y5 = this.f7220b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        if (!this.f7221c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7221c);
        }
        int i3 = this.f7222d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        C0512g6[] c0512g6Arr = this.f7223e;
        int i4 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7223e;
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
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        int i6 = this.f7224g;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        C0435d6 c0435d6 = this.f7225h;
        if (c0435d6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c0435d6);
        }
        if (!Arrays.equals(this.f7226i, f7217o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7226i);
        }
        if (!Arrays.equals(this.f7227j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7227j);
        }
        C0357a6[] c0357a6Arr = this.f7228k;
        if (c0357a6Arr != null && c0357a6Arr.length > 0) {
            while (true) {
                C0357a6[] c0357a6Arr2 = this.f7228k;
                if (i4 >= c0357a6Arr2.length) {
                    break;
                }
                C0357a6 c0357a6 = c0357a6Arr2[i4];
                if (c0357a6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c0357a6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0460e6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0460e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0460e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f7219a == null) {
                        this.f7219a = new C0564i6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7219a);
                    break;
                case 18:
                    if (this.f7220b == null) {
                        this.f7220b = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7220b);
                    break;
                case C0644l9.f7763G /* 26 */:
                    this.f7221c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f7222d = readInt32;
                        break;
                    }
                case C0644l9.f7768M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0512g6[] c0512g6Arr = this.f7223e;
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
                    this.f7223e = c0512g6Arr2;
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f7224g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f7225h == null) {
                        this.f7225h = new C0435d6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7225h);
                    break;
                case 74:
                    this.f7226i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f7227j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C0357a6[] c0357a6Arr = this.f7228k;
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
                    this.f7228k = c0357a6Arr2;
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

    public static C0460e6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0460e6) MessageNano.mergeFrom(new C0460e6(), bArr);
    }
}
