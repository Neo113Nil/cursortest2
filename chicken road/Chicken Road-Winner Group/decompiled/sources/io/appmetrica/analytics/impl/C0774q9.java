package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774q9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f8132g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8133h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8134i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0774q9[] f8135j;

    /* renamed from: a, reason: collision with root package name */
    public C0696n9[] f8136a;

    /* renamed from: b, reason: collision with root package name */
    public C0567i9 f8137b;

    /* renamed from: c, reason: collision with root package name */
    public C0489f9[] f8138c;

    /* renamed from: d, reason: collision with root package name */
    public C0722o9[] f8139d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f8140e;
    public byte[][] f;

    public C0774q9() {
        a();
    }

    public static C0774q9[] b() {
        if (f8135j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8135j == null) {
                        f8135j = new C0774q9[0];
                    }
                } finally {
                }
            }
        }
        return f8135j;
    }

    public final C0774q9 a() {
        this.f8136a = C0696n9.b();
        this.f8137b = null;
        this.f8138c = C0489f9.b();
        this.f8139d = C0722o9.b();
        this.f8140e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0696n9[] c0696n9Arr = this.f8136a;
        int i3 = 0;
        if (c0696n9Arr != null && c0696n9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0696n9[] c0696n9Arr2 = this.f8136a;
                if (i4 >= c0696n9Arr2.length) {
                    break;
                }
                C0696n9 c0696n9 = c0696n9Arr2[i4];
                if (c0696n9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0696n9) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0567i9 c0567i9 = this.f8137b;
        if (c0567i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0567i9);
        }
        C0489f9[] c0489f9Arr = this.f8138c;
        if (c0489f9Arr != null && c0489f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0489f9[] c0489f9Arr2 = this.f8138c;
                if (i5 >= c0489f9Arr2.length) {
                    break;
                }
                C0489f9 c0489f9 = c0489f9Arr2[i5];
                if (c0489f9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0489f9) + computeSerializedSize;
                }
                i5++;
            }
        }
        C0722o9[] c0722o9Arr = this.f8139d;
        if (c0722o9Arr != null && c0722o9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0722o9[] c0722o9Arr2 = this.f8139d;
                if (i6 >= c0722o9Arr2.length) {
                    break;
                }
                C0722o9 c0722o9 = c0722o9Arr2[i6];
                if (c0722o9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0722o9) + computeSerializedSize;
                }
                i6++;
            }
        }
        String[] strArr = this.f8140e;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr2 = this.f8140e;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i7++;
            }
            computeSerializedSize = computeSerializedSize + i8 + i9;
        }
        byte[][] bArr = this.f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            if (i3 >= bArr2.length) {
                return computeSerializedSize + i10 + i11;
            }
            byte[] bArr3 = bArr2[i3];
            if (bArr3 != null) {
                i11++;
                i10 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i10;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0696n9[] c0696n9Arr = this.f8136a;
        int i3 = 0;
        if (c0696n9Arr != null && c0696n9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0696n9[] c0696n9Arr2 = this.f8136a;
                if (i4 >= c0696n9Arr2.length) {
                    break;
                }
                C0696n9 c0696n9 = c0696n9Arr2[i4];
                if (c0696n9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0696n9);
                }
                i4++;
            }
        }
        C0567i9 c0567i9 = this.f8137b;
        if (c0567i9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0567i9);
        }
        C0489f9[] c0489f9Arr = this.f8138c;
        if (c0489f9Arr != null && c0489f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0489f9[] c0489f9Arr2 = this.f8138c;
                if (i5 >= c0489f9Arr2.length) {
                    break;
                }
                C0489f9 c0489f9 = c0489f9Arr2[i5];
                if (c0489f9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0489f9);
                }
                i5++;
            }
        }
        C0722o9[] c0722o9Arr = this.f8139d;
        if (c0722o9Arr != null && c0722o9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C0722o9[] c0722o9Arr2 = this.f8139d;
                if (i6 >= c0722o9Arr2.length) {
                    break;
                }
                C0722o9 c0722o9 = c0722o9Arr2[i6];
                if (c0722o9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0722o9);
                }
                i6++;
            }
        }
        String[] strArr = this.f8140e;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f8140e;
                if (i7 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i7];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i7++;
            }
        }
        byte[][] bArr = this.f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f;
                if (i3 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i3];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0774q9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0774q9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0774q9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0696n9[] c0696n9Arr = this.f8136a;
                int length = c0696n9Arr == null ? 0 : c0696n9Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0696n9[] c0696n9Arr2 = new C0696n9[i3];
                if (length != 0) {
                    System.arraycopy(c0696n9Arr, 0, c0696n9Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0696n9 c0696n9 = new C0696n9();
                    c0696n9Arr2[length] = c0696n9;
                    codedInputByteBufferNano.readMessage(c0696n9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0696n9 c0696n92 = new C0696n9();
                c0696n9Arr2[length] = c0696n92;
                codedInputByteBufferNano.readMessage(c0696n92);
                this.f8136a = c0696n9Arr2;
            } else if (readTag == 34) {
                if (this.f8137b == null) {
                    this.f8137b = new C0567i9();
                }
                codedInputByteBufferNano.readMessage(this.f8137b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0489f9[] c0489f9Arr = this.f8138c;
                int length2 = c0489f9Arr == null ? 0 : c0489f9Arr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                C0489f9[] c0489f9Arr2 = new C0489f9[i4];
                if (length2 != 0) {
                    System.arraycopy(c0489f9Arr, 0, c0489f9Arr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    C0489f9 c0489f9 = new C0489f9();
                    c0489f9Arr2[length2] = c0489f9;
                    codedInputByteBufferNano.readMessage(c0489f9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0489f9 c0489f92 = new C0489f9();
                c0489f9Arr2[length2] = c0489f92;
                codedInputByteBufferNano.readMessage(c0489f92);
                this.f8138c = c0489f9Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0722o9[] c0722o9Arr = this.f8139d;
                int length3 = c0722o9Arr == null ? 0 : c0722o9Arr.length;
                int i5 = repeatedFieldArrayLength3 + length3;
                C0722o9[] c0722o9Arr2 = new C0722o9[i5];
                if (length3 != 0) {
                    System.arraycopy(c0722o9Arr, 0, c0722o9Arr2, 0, length3);
                }
                while (length3 < i5 - 1) {
                    C0722o9 c0722o9 = new C0722o9();
                    c0722o9Arr2[length3] = c0722o9;
                    codedInputByteBufferNano.readMessage(c0722o9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0722o9 c0722o92 = new C0722o9();
                c0722o9Arr2[length3] = c0722o92;
                codedInputByteBufferNano.readMessage(c0722o92);
                this.f8139d = c0722o9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f8140e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i6 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i6];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i6 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f8140e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i7 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i7][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i7 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f = bArr2;
            }
        }
        return this;
    }

    public static C0774q9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0774q9) MessageNano.mergeFrom(new C0774q9(), bArr);
    }
}
