package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508g2 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0508g2[] f7321d;

    /* renamed from: a, reason: collision with root package name */
    public C0482f2[] f7322a;

    /* renamed from: b, reason: collision with root package name */
    public C0456e2 f7323b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f7324c;

    public C0508g2() {
        a();
    }

    public static C0508g2[] b() {
        if (f7321d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7321d == null) {
                        f7321d = new C0508g2[0];
                    }
                } finally {
                }
            }
        }
        return f7321d;
    }

    public final C0508g2 a() {
        this.f7322a = C0482f2.b();
        this.f7323b = null;
        this.f7324c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0482f2[] c0482f2Arr = this.f7322a;
        int i3 = 0;
        if (c0482f2Arr != null && c0482f2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482f2[] c0482f2Arr2 = this.f7322a;
                if (i4 >= c0482f2Arr2.length) {
                    break;
                }
                C0482f2 c0482f2 = c0482f2Arr2[i4];
                if (c0482f2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0482f2) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0456e2 c0456e2 = this.f7323b;
        if (c0456e2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0456e2);
        }
        String[] strArr = this.f7324c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f7324c;
            if (i3 >= strArr2.length) {
                return computeSerializedSize + i5 + i6;
            }
            String str = strArr2[i3];
            if (str != null) {
                i6++;
                i5 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i5;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0482f2[] c0482f2Arr = this.f7322a;
        int i3 = 0;
        if (c0482f2Arr != null && c0482f2Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482f2[] c0482f2Arr2 = this.f7322a;
                if (i4 >= c0482f2Arr2.length) {
                    break;
                }
                C0482f2 c0482f2 = c0482f2Arr2[i4];
                if (c0482f2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0482f2);
                }
                i4++;
            }
        }
        C0456e2 c0456e2 = this.f7323b;
        if (c0456e2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0456e2);
        }
        String[] strArr = this.f7324c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f7324c;
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
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0508g2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0482f2[] c0482f2Arr = this.f7322a;
                int length = c0482f2Arr == null ? 0 : c0482f2Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0482f2[] c0482f2Arr2 = new C0482f2[i3];
                if (length != 0) {
                    System.arraycopy(c0482f2Arr, 0, c0482f2Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0482f2 c0482f2 = new C0482f2();
                    c0482f2Arr2[length] = c0482f2;
                    codedInputByteBufferNano.readMessage(c0482f2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0482f2 c0482f22 = new C0482f2();
                c0482f2Arr2[length] = c0482f22;
                codedInputByteBufferNano.readMessage(c0482f22);
                this.f7322a = c0482f2Arr2;
            } else if (readTag == 18) {
                if (this.f7323b == null) {
                    this.f7323b = new C0456e2();
                }
                codedInputByteBufferNano.readMessage(this.f7323b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f7324c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i4];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f7324c = strArr2;
            }
        }
        return this;
    }

    public static C0508g2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0508g2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0508g2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0508g2) MessageNano.mergeFrom(new C0508g2(), bArr);
    }
}
