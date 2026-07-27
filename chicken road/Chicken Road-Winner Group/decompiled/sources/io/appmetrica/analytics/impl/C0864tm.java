package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0864tm[] f8374c;

    /* renamed from: a, reason: collision with root package name */
    public String f8375a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f8376b;

    public C0864tm() {
        a();
    }

    public static C0864tm[] b() {
        if (f8374c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8374c == null) {
                        f8374c = new C0864tm[0];
                    }
                } finally {
                }
            }
        }
        return f8374c;
    }

    public final C0864tm a() {
        this.f8375a = "";
        this.f8376b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8375a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8375a);
        }
        String[] strArr = this.f8376b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f8376b;
            if (i3 >= strArr2.length) {
                return computeSerializedSize + i4 + i5;
            }
            String str = strArr2[i3];
            if (str != null) {
                i5++;
                i4 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i4;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8375a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8375a);
        }
        String[] strArr = this.f8376b;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f8376b;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0864tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8375a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f8376b;
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
                this.f8376b = strArr2;
            }
        }
        return this;
    }

    public static C0864tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0864tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0864tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0864tm) MessageNano.mergeFrom(new C0864tm(), bArr);
    }
}
