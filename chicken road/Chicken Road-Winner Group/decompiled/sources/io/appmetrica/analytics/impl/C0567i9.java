package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567i9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0567i9[] f7490n;

    /* renamed from: a, reason: collision with root package name */
    public String f7491a;

    /* renamed from: b, reason: collision with root package name */
    public String f7492b;

    /* renamed from: c, reason: collision with root package name */
    public String f7493c;

    /* renamed from: d, reason: collision with root package name */
    public int f7494d;

    /* renamed from: e, reason: collision with root package name */
    public String f7495e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7496g;

    /* renamed from: h, reason: collision with root package name */
    public int f7497h;

    /* renamed from: i, reason: collision with root package name */
    public String f7498i;

    /* renamed from: j, reason: collision with root package name */
    public String f7499j;

    /* renamed from: k, reason: collision with root package name */
    public int f7500k;

    /* renamed from: l, reason: collision with root package name */
    public C0541h9[] f7501l;

    /* renamed from: m, reason: collision with root package name */
    public String f7502m;

    public C0567i9() {
        a();
    }

    public static C0567i9[] b() {
        if (f7490n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7490n == null) {
                        f7490n = new C0567i9[0];
                    }
                } finally {
                }
            }
        }
        return f7490n;
    }

    public final C0567i9 a() {
        this.f7491a = "";
        this.f7492b = "";
        this.f7493c = "";
        this.f7494d = 0;
        this.f7495e = "";
        this.f = "";
        this.f7496g = false;
        this.f7497h = 0;
        this.f7498i = "";
        this.f7499j = "";
        this.f7500k = 0;
        this.f7501l = C0541h9.b();
        this.f7502m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7491a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7491a);
        }
        if (!this.f7492b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7492b);
        }
        if (!this.f7493c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7493c);
        }
        int i3 = this.f7494d;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        if (!this.f7495e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f7495e);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f);
        }
        boolean z3 = this.f7496g;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z3);
        }
        int i4 = this.f7497h;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i4);
        }
        if (!this.f7498i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f7498i);
        }
        if (!this.f7499j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f7499j);
        }
        int i5 = this.f7500k;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i5);
        }
        C0541h9[] c0541h9Arr = this.f7501l;
        if (c0541h9Arr != null && c0541h9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0541h9[] c0541h9Arr2 = this.f7501l;
                if (i6 >= c0541h9Arr2.length) {
                    break;
                }
                C0541h9 c0541h9 = c0541h9Arr2[i6];
                if (c0541h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0541h9) + computeSerializedSize;
                }
                i6++;
            }
        }
        return !this.f7502m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f7502m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7491a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7491a);
        }
        if (!this.f7492b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7492b);
        }
        if (!this.f7493c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7493c);
        }
        int i3 = this.f7494d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        if (!this.f7495e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7495e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f);
        }
        boolean z3 = this.f7496g;
        if (z3) {
            codedOutputByteBufferNano.writeBool(17, z3);
        }
        int i4 = this.f7497h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i4);
        }
        if (!this.f7498i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f7498i);
        }
        if (!this.f7499j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f7499j);
        }
        int i5 = this.f7500k;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i5);
        }
        C0541h9[] c0541h9Arr = this.f7501l;
        if (c0541h9Arr != null && c0541h9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0541h9[] c0541h9Arr2 = this.f7501l;
                if (i6 >= c0541h9Arr2.length) {
                    break;
                }
                C0541h9 c0541h9 = c0541h9Arr2[i6];
                if (c0541h9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0541h9);
                }
                i6++;
            }
        }
        if (!this.f7502m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f7502m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0567i9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0567i9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0567i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f7491a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f7492b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f7493c = codedInputByteBufferNano.readString();
                    break;
                case C0644l9.L /* 40 */:
                    this.f7494d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f7495e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f7496g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f7497h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f7498i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f7499j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f7500k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0541h9[] c0541h9Arr = this.f7501l;
                    int length = c0541h9Arr == null ? 0 : c0541h9Arr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    C0541h9[] c0541h9Arr2 = new C0541h9[i3];
                    if (length != 0) {
                        System.arraycopy(c0541h9Arr, 0, c0541h9Arr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        C0541h9 c0541h9 = new C0541h9();
                        c0541h9Arr2[length] = c0541h9;
                        codedInputByteBufferNano.readMessage(c0541h9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0541h9 c0541h92 = new C0541h9();
                    c0541h9Arr2[length] = c0541h92;
                    codedInputByteBufferNano.readMessage(c0541h92);
                    this.f7501l = c0541h9Arr2;
                    break;
                case 194:
                    this.f7502m = codedInputByteBufferNano.readString();
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

    public static C0567i9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0567i9) MessageNano.mergeFrom(new C0567i9(), bArr);
    }
}
