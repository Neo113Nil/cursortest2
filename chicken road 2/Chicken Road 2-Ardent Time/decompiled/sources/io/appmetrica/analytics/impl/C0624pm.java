package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624pm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0624pm[] f6663c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6664a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String[] f6665b;

    public C0624pm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0624pm[] b() {
        if (f6663c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6663c == null) {
                        f6663c = new io.appmetrica.analytics.impl.C0624pm[0];
                    }
                } finally {
                }
            }
        }
        return f6663c;
    }

    public final io.appmetrica.analytics.impl.C0624pm a() {
        this.f6664a = "";
        this.f6665b = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6664a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6664a);
        }
        java.lang.String[] strArr = this.f6665b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.f6665b;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            java.lang.String str = strArr2[i2];
            if (str != null) {
                i4++;
                i3 = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6664a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6664a);
        }
        java.lang.String[] strArr = this.f6665b;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f6665b;
                if (i2 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0624pm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6664a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                java.lang.String[] strArr = this.f6665b;
                int length = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength + length;
                java.lang.String[] strArr2 = new java.lang.String[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i2 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f6665b = strArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0624pm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0624pm().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0624pm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0624pm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0624pm(), bArr);
    }
}
