package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Am extends MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f5709D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f5710E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f5711F = 1;

    /* renamed from: G, reason: collision with root package name */
    public static volatile Am[] f5712G;

    /* renamed from: A, reason: collision with root package name */
    public C0993ym f5713A;

    /* renamed from: B, reason: collision with root package name */
    public C0942wm[] f5714B;

    /* renamed from: C, reason: collision with root package name */
    public C0890um f5715C;

    /* renamed from: a, reason: collision with root package name */
    public String f5716a;

    /* renamed from: b, reason: collision with root package name */
    public long f5717b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f5718c;

    /* renamed from: d, reason: collision with root package name */
    public String f5719d;

    /* renamed from: e, reason: collision with root package name */
    public String f5720e;
    public String[] f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f5721g;

    /* renamed from: h, reason: collision with root package name */
    public C0864tm[] f5722h;

    /* renamed from: i, reason: collision with root package name */
    public C0916vm f5723i;

    /* renamed from: j, reason: collision with root package name */
    public String f5724j;

    /* renamed from: k, reason: collision with root package name */
    public String f5725k;

    /* renamed from: l, reason: collision with root package name */
    public String f5726l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5727m;

    /* renamed from: n, reason: collision with root package name */
    public String f5728n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f5729o;

    /* renamed from: p, reason: collision with root package name */
    public C1018zm f5730p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5731q;

    /* renamed from: r, reason: collision with root package name */
    public String f5732r;

    /* renamed from: s, reason: collision with root package name */
    public long f5733s;

    /* renamed from: t, reason: collision with root package name */
    public long f5734t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5735u;

    /* renamed from: v, reason: collision with root package name */
    public C0968xm f5736v;

    /* renamed from: w, reason: collision with root package name */
    public int f5737w;

    /* renamed from: x, reason: collision with root package name */
    public int f5738x;
    public C0838sm y;

    /* renamed from: z, reason: collision with root package name */
    public C0812rm f5739z;

    public Am() {
        a();
    }

    public static Am[] b() {
        if (f5712G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5712G == null) {
                        f5712G = new Am[0];
                    }
                } finally {
                }
            }
        }
        return f5712G;
    }

    public final Am a() {
        this.f5716a = "";
        this.f5717b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f5718c = strArr;
        this.f5719d = "";
        this.f5720e = "";
        this.f = strArr;
        this.f5721g = strArr;
        this.f5722h = C0864tm.b();
        this.f5723i = null;
        this.f5724j = "";
        this.f5725k = "";
        this.f5726l = "";
        this.f5727m = false;
        this.f5728n = "";
        this.f5729o = strArr;
        this.f5730p = null;
        this.f5731q = false;
        this.f5732r = "";
        this.f5733s = 0L;
        this.f5734t = 0L;
        this.f5735u = false;
        this.f5736v = null;
        this.f5737w = 600;
        this.f5738x = 1;
        this.y = null;
        this.f5739z = null;
        this.f5713A = null;
        this.f5714B = C0942wm.b();
        this.f5715C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5716a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5716a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f5717b) + computeSerializedSize;
        String[] strArr = this.f5718c;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f5718c;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i4++;
            }
            computeInt64Size = computeInt64Size + i5 + i6;
        }
        if (!this.f5719d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f5719d);
        }
        if (!this.f5720e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f5720e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i7];
                if (str2 != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i7++;
            }
            computeInt64Size = computeInt64Size + i8 + i9;
        }
        String[] strArr5 = this.f5721g;
        if (strArr5 != null && strArr5.length > 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                String[] strArr6 = this.f5721g;
                if (i10 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i10];
                if (str3 != null) {
                    i12++;
                    i11 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i10++;
            }
            computeInt64Size = computeInt64Size + i11 + i12;
        }
        C0864tm[] c0864tmArr = this.f5722h;
        if (c0864tmArr != null && c0864tmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C0864tm[] c0864tmArr2 = this.f5722h;
                if (i13 >= c0864tmArr2.length) {
                    break;
                }
                C0864tm c0864tm = c0864tmArr2[i13];
                if (c0864tm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0864tm) + computeInt64Size;
                }
                i13++;
            }
        }
        C0916vm c0916vm = this.f5723i;
        if (c0916vm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0916vm);
        }
        if (!this.f5724j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f5724j);
        }
        if (!this.f5725k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f5725k);
        }
        if (!this.f5726l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f5726l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f5727m) + computeInt64Size;
        if (!this.f5728n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f5728n);
        }
        String[] strArr7 = this.f5729o;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr8 = this.f5729o;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    i16++;
                    i15 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i14++;
            }
            computeBoolSize = computeBoolSize + i15 + i16;
        }
        C1018zm c1018zm = this.f5730p;
        if (c1018zm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c1018zm);
        }
        boolean z3 = this.f5731q;
        if (z3) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z3);
        }
        if (!this.f5732r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f5732r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f5734t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f5733s) + computeBoolSize;
        boolean z4 = this.f5735u;
        if (z4) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z4);
        }
        C0968xm c0968xm = this.f5736v;
        if (c0968xm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0968xm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f5738x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f5737w) + computeInt64Size2;
        C0838sm c0838sm = this.y;
        if (c0838sm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0838sm);
        }
        C0812rm c0812rm = this.f5739z;
        if (c0812rm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0812rm);
        }
        C0993ym c0993ym = this.f5713A;
        if (c0993ym != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c0993ym);
        }
        C0942wm[] c0942wmArr = this.f5714B;
        if (c0942wmArr != null && c0942wmArr.length > 0) {
            while (true) {
                C0942wm[] c0942wmArr2 = this.f5714B;
                if (i3 >= c0942wmArr2.length) {
                    break;
                }
                C0942wm c0942wm = c0942wmArr2[i3];
                if (c0942wm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0942wm) + computeInt32Size;
                }
                i3++;
            }
        }
        C0890um c0890um = this.f5715C;
        return c0890um != null ? CodedOutputByteBufferNano.computeMessageSize(32, c0890um) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f5716a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5716a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f5717b);
        String[] strArr = this.f5718c;
        int i3 = 0;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f5718c;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i4++;
            }
        }
        if (!this.f5719d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5719d);
        }
        if (!this.f5720e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f5720e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i5++;
            }
        }
        String[] strArr5 = this.f5721g;
        if (strArr5 != null && strArr5.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr6 = this.f5721g;
                if (i6 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i6];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i6++;
            }
        }
        C0864tm[] c0864tmArr = this.f5722h;
        if (c0864tmArr != null && c0864tmArr.length > 0) {
            int i7 = 0;
            while (true) {
                C0864tm[] c0864tmArr2 = this.f5722h;
                if (i7 >= c0864tmArr2.length) {
                    break;
                }
                C0864tm c0864tm = c0864tmArr2[i7];
                if (c0864tm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0864tm);
                }
                i7++;
            }
        }
        C0916vm c0916vm = this.f5723i;
        if (c0916vm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0916vm);
        }
        if (!this.f5724j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f5724j);
        }
        if (!this.f5725k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f5725k);
        }
        if (!this.f5726l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f5726l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f5727m);
        if (!this.f5728n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f5728n);
        }
        String[] strArr7 = this.f5729o;
        if (strArr7 != null && strArr7.length > 0) {
            int i8 = 0;
            while (true) {
                String[] strArr8 = this.f5729o;
                if (i8 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i8];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i8++;
            }
        }
        C1018zm c1018zm = this.f5730p;
        if (c1018zm != null) {
            codedOutputByteBufferNano.writeMessage(16, c1018zm);
        }
        boolean z3 = this.f5731q;
        if (z3) {
            codedOutputByteBufferNano.writeBool(17, z3);
        }
        if (!this.f5732r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f5732r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f5733s);
        codedOutputByteBufferNano.writeInt64(22, this.f5734t);
        boolean z4 = this.f5735u;
        if (z4) {
            codedOutputByteBufferNano.writeBool(23, z4);
        }
        C0968xm c0968xm = this.f5736v;
        if (c0968xm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0968xm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f5737w);
        codedOutputByteBufferNano.writeInt32(26, this.f5738x);
        C0838sm c0838sm = this.y;
        if (c0838sm != null) {
            codedOutputByteBufferNano.writeMessage(27, c0838sm);
        }
        C0812rm c0812rm = this.f5739z;
        if (c0812rm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0812rm);
        }
        C0993ym c0993ym = this.f5713A;
        if (c0993ym != null) {
            codedOutputByteBufferNano.writeMessage(30, c0993ym);
        }
        C0942wm[] c0942wmArr = this.f5714B;
        if (c0942wmArr != null && c0942wmArr.length > 0) {
            while (true) {
                C0942wm[] c0942wmArr2 = this.f5714B;
                if (i3 >= c0942wmArr2.length) {
                    break;
                }
                C0942wm c0942wm = c0942wmArr2[i3];
                if (c0942wm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0942wm);
                }
                i3++;
            }
        }
        C0890um c0890um = this.f5715C;
        if (c0890um != null) {
            codedOutputByteBufferNano.writeMessage(32, c0890um);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Am b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Am().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f5716a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f5717b = codedInputByteBufferNano.readInt64();
                    break;
                case C0644l9.f7763G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f5718c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i3 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i3];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i3 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f5718c = strArr2;
                    break;
                case 34:
                    this.f5719d = codedInputByteBufferNano.readString();
                    break;
                case C0644l9.f7768M /* 42 */:
                    this.f5720e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i4 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i4];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f5721g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i5 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i5];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i5 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f5721g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0864tm[] c0864tmArr = this.f5722h;
                    int length4 = c0864tmArr == null ? 0 : c0864tmArr.length;
                    int i6 = repeatedFieldArrayLength4 + length4;
                    C0864tm[] c0864tmArr2 = new C0864tm[i6];
                    if (length4 != 0) {
                        System.arraycopy(c0864tmArr, 0, c0864tmArr2, 0, length4);
                    }
                    while (length4 < i6 - 1) {
                        C0864tm c0864tm = new C0864tm();
                        c0864tmArr2[length4] = c0864tm;
                        codedInputByteBufferNano.readMessage(c0864tm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0864tm c0864tm2 = new C0864tm();
                    c0864tmArr2[length4] = c0864tm2;
                    codedInputByteBufferNano.readMessage(c0864tm2);
                    this.f5722h = c0864tmArr2;
                    break;
                case 74:
                    if (this.f5723i == null) {
                        this.f5723i = new C0916vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5723i);
                    break;
                case 82:
                    this.f5724j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f5725k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f5726l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f5727m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f5728n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f5729o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i7 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i7];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i7 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f5729o = strArr8;
                    break;
                case 130:
                    if (this.f5730p == null) {
                        this.f5730p = new C1018zm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5730p);
                    break;
                case 136:
                    this.f5731q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f5732r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f5733s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f5734t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f5735u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f5736v == null) {
                        this.f5736v = new C0968xm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5736v);
                    break;
                case 200:
                    this.f5737w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f5738x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.y == null) {
                        this.y = new C0838sm();
                    }
                    codedInputByteBufferNano.readMessage(this.y);
                    break;
                case 234:
                    if (this.f5739z == null) {
                        this.f5739z = new C0812rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f5739z);
                    break;
                case 242:
                    if (this.f5713A == null) {
                        this.f5713A = new C0993ym();
                    }
                    codedInputByteBufferNano.readMessage(this.f5713A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0942wm[] c0942wmArr = this.f5714B;
                    int length6 = c0942wmArr == null ? 0 : c0942wmArr.length;
                    int i8 = repeatedFieldArrayLength6 + length6;
                    C0942wm[] c0942wmArr2 = new C0942wm[i8];
                    if (length6 != 0) {
                        System.arraycopy(c0942wmArr, 0, c0942wmArr2, 0, length6);
                    }
                    while (length6 < i8 - 1) {
                        C0942wm c0942wm = new C0942wm();
                        c0942wmArr2[length6] = c0942wm;
                        codedInputByteBufferNano.readMessage(c0942wm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0942wm c0942wm2 = new C0942wm();
                    c0942wmArr2[length6] = c0942wm2;
                    codedInputByteBufferNano.readMessage(c0942wm2);
                    this.f5714B = c0942wmArr2;
                    break;
                case 258:
                    if (this.f5715C == null) {
                        this.f5715C = new C0890um();
                    }
                    codedInputByteBufferNano.readMessage(this.f5715C);
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

    public static Am a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Am) MessageNano.mergeFrom(new Am(), bArr);
    }
}
