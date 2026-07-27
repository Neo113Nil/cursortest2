package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Am extends MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f6540D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f6541E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f6542F = 1;

    /* renamed from: G, reason: collision with root package name */
    public static volatile Am[] f6543G;

    /* renamed from: A, reason: collision with root package name */
    public C1142ym f6544A;

    /* renamed from: B, reason: collision with root package name */
    public C1091wm[] f6545B;

    /* renamed from: C, reason: collision with root package name */
    public C1039um f6546C;

    /* renamed from: a, reason: collision with root package name */
    public String f6547a;

    /* renamed from: b, reason: collision with root package name */
    public long f6548b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f6549c;

    /* renamed from: d, reason: collision with root package name */
    public String f6550d;

    /* renamed from: e, reason: collision with root package name */
    public String f6551e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f6552f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f6553g;

    /* renamed from: h, reason: collision with root package name */
    public C1013tm[] f6554h;

    /* renamed from: i, reason: collision with root package name */
    public C1065vm f6555i;

    /* renamed from: j, reason: collision with root package name */
    public String f6556j;

    /* renamed from: k, reason: collision with root package name */
    public String f6557k;

    /* renamed from: l, reason: collision with root package name */
    public String f6558l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6559m;

    /* renamed from: n, reason: collision with root package name */
    public String f6560n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f6561o;

    /* renamed from: p, reason: collision with root package name */
    public C1167zm f6562p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6563q;

    /* renamed from: r, reason: collision with root package name */
    public String f6564r;

    /* renamed from: s, reason: collision with root package name */
    public long f6565s;

    /* renamed from: t, reason: collision with root package name */
    public long f6566t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6567u;

    /* renamed from: v, reason: collision with root package name */
    public C1117xm f6568v;

    /* renamed from: w, reason: collision with root package name */
    public int f6569w;

    /* renamed from: x, reason: collision with root package name */
    public int f6570x;

    /* renamed from: y, reason: collision with root package name */
    public C0987sm f6571y;
    public C0961rm z;

    public Am() {
        a();
    }

    public static Am[] b() {
        if (f6543G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6543G == null) {
                        f6543G = new Am[0];
                    }
                } finally {
                }
            }
        }
        return f6543G;
    }

    public final Am a() {
        this.f6547a = "";
        this.f6548b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f6549c = strArr;
        this.f6550d = "";
        this.f6551e = "";
        this.f6552f = strArr;
        this.f6553g = strArr;
        this.f6554h = C1013tm.b();
        this.f6555i = null;
        this.f6556j = "";
        this.f6557k = "";
        this.f6558l = "";
        this.f6559m = false;
        this.f6560n = "";
        this.f6561o = strArr;
        this.f6562p = null;
        this.f6563q = false;
        this.f6564r = "";
        this.f6565s = 0L;
        this.f6566t = 0L;
        this.f6567u = false;
        this.f6568v = null;
        this.f6569w = 600;
        this.f6570x = 1;
        this.f6571y = null;
        this.z = null;
        this.f6544A = null;
        this.f6545B = C1091wm.b();
        this.f6546C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6547a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6547a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f6548b) + computeSerializedSize;
        String[] strArr = this.f6549c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f6549c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i3++;
            }
            computeInt64Size = computeInt64Size + i6 + i7;
        }
        if (!this.f6550d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f6550d);
        }
        if (!this.f6551e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f6551e);
        }
        String[] strArr3 = this.f6552f;
        if (strArr3 != null && strArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr4 = this.f6552f;
                if (i8 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i8];
                if (str2 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i8++;
            }
            computeInt64Size = computeInt64Size + i9 + i10;
        }
        String[] strArr5 = this.f6553g;
        if (strArr5 != null && strArr5.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f6553g;
                if (i11 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i11];
                if (str3 != null) {
                    i13++;
                    i12 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i11++;
            }
            computeInt64Size = computeInt64Size + i12 + i13;
        }
        C1013tm[] c1013tmArr = this.f6554h;
        if (c1013tmArr != null && c1013tmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C1013tm[] c1013tmArr2 = this.f6554h;
                if (i14 >= c1013tmArr2.length) {
                    break;
                }
                C1013tm c1013tm = c1013tmArr2[i14];
                if (c1013tm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c1013tm) + computeInt64Size;
                }
                i14++;
            }
        }
        C1065vm c1065vm = this.f6555i;
        if (c1065vm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c1065vm);
        }
        if (!this.f6556j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f6556j);
        }
        if (!this.f6557k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f6557k);
        }
        if (!this.f6558l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f6558l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f6559m) + computeInt64Size;
        if (!this.f6560n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f6560n);
        }
        String[] strArr7 = this.f6561o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr8 = this.f6561o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    i17++;
                    i16 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i15++;
            }
            computeBoolSize = computeBoolSize + i16 + i17;
        }
        C1167zm c1167zm = this.f6562p;
        if (c1167zm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c1167zm);
        }
        boolean z = this.f6563q;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f6564r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f6564r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f6566t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f6565s) + computeBoolSize;
        boolean z5 = this.f6567u;
        if (z5) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z5);
        }
        C1117xm c1117xm = this.f6568v;
        if (c1117xm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c1117xm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f6570x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f6569w) + computeInt64Size2;
        C0987sm c0987sm = this.f6571y;
        if (c0987sm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0987sm);
        }
        C0961rm c0961rm = this.z;
        if (c0961rm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0961rm);
        }
        C1142ym c1142ym = this.f6544A;
        if (c1142ym != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c1142ym);
        }
        C1091wm[] c1091wmArr = this.f6545B;
        if (c1091wmArr != null && c1091wmArr.length > 0) {
            while (true) {
                C1091wm[] c1091wmArr2 = this.f6545B;
                if (i2 >= c1091wmArr2.length) {
                    break;
                }
                C1091wm c1091wm = c1091wmArr2[i2];
                if (c1091wm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c1091wm) + computeInt32Size;
                }
                i2++;
            }
        }
        C1039um c1039um = this.f6546C;
        return c1039um != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c1039um) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6547a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6547a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f6548b);
        String[] strArr = this.f6549c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f6549c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i3++;
            }
        }
        if (!this.f6550d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6550d);
        }
        if (!this.f6551e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f6551e);
        }
        String[] strArr3 = this.f6552f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.f6552f;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i6++;
            }
        }
        String[] strArr5 = this.f6553g;
        if (strArr5 != null && strArr5.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.f6553g;
                if (i7 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i7];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i7++;
            }
        }
        C1013tm[] c1013tmArr = this.f6554h;
        if (c1013tmArr != null && c1013tmArr.length > 0) {
            int i8 = 0;
            while (true) {
                C1013tm[] c1013tmArr2 = this.f6554h;
                if (i8 >= c1013tmArr2.length) {
                    break;
                }
                C1013tm c1013tm = c1013tmArr2[i8];
                if (c1013tm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c1013tm);
                }
                i8++;
            }
        }
        C1065vm c1065vm = this.f6555i;
        if (c1065vm != null) {
            codedOutputByteBufferNano.writeMessage(9, c1065vm);
        }
        if (!this.f6556j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f6556j);
        }
        if (!this.f6557k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f6557k);
        }
        if (!this.f6558l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f6558l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f6559m);
        if (!this.f6560n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f6560n);
        }
        String[] strArr7 = this.f6561o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr8 = this.f6561o;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i9++;
            }
        }
        C1167zm c1167zm = this.f6562p;
        if (c1167zm != null) {
            codedOutputByteBufferNano.writeMessage(16, c1167zm);
        }
        boolean z = this.f6563q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f6564r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f6564r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f6565s);
        codedOutputByteBufferNano.writeInt64(22, this.f6566t);
        boolean z5 = this.f6567u;
        if (z5) {
            codedOutputByteBufferNano.writeBool(23, z5);
        }
        C1117xm c1117xm = this.f6568v;
        if (c1117xm != null) {
            codedOutputByteBufferNano.writeMessage(24, c1117xm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f6569w);
        codedOutputByteBufferNano.writeInt32(26, this.f6570x);
        C0987sm c0987sm = this.f6571y;
        if (c0987sm != null) {
            codedOutputByteBufferNano.writeMessage(27, c0987sm);
        }
        C0961rm c0961rm = this.z;
        if (c0961rm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0961rm);
        }
        C1142ym c1142ym = this.f6544A;
        if (c1142ym != null) {
            codedOutputByteBufferNano.writeMessage(30, c1142ym);
        }
        C1091wm[] c1091wmArr = this.f6545B;
        if (c1091wmArr != null && c1091wmArr.length > 0) {
            while (true) {
                C1091wm[] c1091wmArr2 = this.f6545B;
                if (i2 >= c1091wmArr2.length) {
                    break;
                }
                C1091wm c1091wm = c1091wmArr2[i2];
                if (c1091wm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c1091wm);
                }
                i2++;
            }
        }
        C1039um c1039um = this.f6546C;
        if (c1039um != null) {
            codedOutputByteBufferNano.writeMessage(32, c1039um);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Am b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Am().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f6547a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f6548b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f6549c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f6549c = strArr2;
                    break;
                case 34:
                    this.f6550d = codedInputByteBufferNano.readString();
                    break;
                case C0793l9.f8691M /* 42 */:
                    this.f6551e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f6552f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f6552f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f6553g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i6 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i6];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i6 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f6553g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C1013tm[] c1013tmArr = this.f6554h;
                    int length4 = c1013tmArr == null ? 0 : c1013tmArr.length;
                    int i7 = repeatedFieldArrayLength4 + length4;
                    C1013tm[] c1013tmArr2 = new C1013tm[i7];
                    if (length4 != 0) {
                        System.arraycopy(c1013tmArr, 0, c1013tmArr2, 0, length4);
                    }
                    while (length4 < i7 - 1) {
                        C1013tm c1013tm = new C1013tm();
                        c1013tmArr2[length4] = c1013tm;
                        codedInputByteBufferNano.readMessage(c1013tm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C1013tm c1013tm2 = new C1013tm();
                    c1013tmArr2[length4] = c1013tm2;
                    codedInputByteBufferNano.readMessage(c1013tm2);
                    this.f6554h = c1013tmArr2;
                    break;
                case 74:
                    if (this.f6555i == null) {
                        this.f6555i = new C1065vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f6555i);
                    break;
                case 82:
                    this.f6556j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6557k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f6558l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f6559m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f6560n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f6561o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i8 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i8];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i8 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f6561o = strArr8;
                    break;
                case 130:
                    if (this.f6562p == null) {
                        this.f6562p = new C1167zm();
                    }
                    codedInputByteBufferNano.readMessage(this.f6562p);
                    break;
                case 136:
                    this.f6563q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f6564r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f6565s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f6566t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f6567u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f6568v == null) {
                        this.f6568v = new C1117xm();
                    }
                    codedInputByteBufferNano.readMessage(this.f6568v);
                    break;
                case 200:
                    this.f6569w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f6570x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f6571y == null) {
                        this.f6571y = new C0987sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f6571y);
                    break;
                case 234:
                    if (this.z == null) {
                        this.z = new C0961rm();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    break;
                case 242:
                    if (this.f6544A == null) {
                        this.f6544A = new C1142ym();
                    }
                    codedInputByteBufferNano.readMessage(this.f6544A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C1091wm[] c1091wmArr = this.f6545B;
                    int length6 = c1091wmArr == null ? 0 : c1091wmArr.length;
                    int i9 = repeatedFieldArrayLength6 + length6;
                    C1091wm[] c1091wmArr2 = new C1091wm[i9];
                    if (length6 != 0) {
                        System.arraycopy(c1091wmArr, 0, c1091wmArr2, 0, length6);
                    }
                    while (length6 < i9 - 1) {
                        C1091wm c1091wm = new C1091wm();
                        c1091wmArr2[length6] = c1091wm;
                        codedInputByteBufferNano.readMessage(c1091wm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C1091wm c1091wm2 = new C1091wm();
                    c1091wmArr2[length6] = c1091wm2;
                    codedInputByteBufferNano.readMessage(c1091wm2);
                    this.f6545B = c1091wmArr2;
                    break;
                case 258:
                    if (this.f6546C == null) {
                        this.f6546C = new C1039um();
                    }
                    codedInputByteBufferNano.readMessage(this.f6546C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static Am a(byte[] bArr) {
        return (Am) MessageNano.mergeFrom(new Am(), bArr);
    }
}
