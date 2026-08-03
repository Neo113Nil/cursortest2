package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class O extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.screenshot.impl.O[] f7509d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7510a;

    /* renamed from: b, reason: collision with root package name */
    public long f7511b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f7512c;

    public O() {
        a();
    }

    public static io.appmetrica.analytics.screenshot.impl.O[] b() {
        if (f7509d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7509d == null) {
                        f7509d = new io.appmetrica.analytics.screenshot.impl.O[0];
                    }
                } finally {
                }
            }
        }
        return f7509d;
    }

    public final io.appmetrica.analytics.screenshot.impl.O a() {
        this.f7510a = true;
        this.f7511b = 5L;
        this.f7512c = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7510a;
        if (!z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        long j2 = this.f7511b;
        if (j2 != 5) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        java.lang.String[] strArr = this.f7512c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.f7512c;
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
        boolean z2 = this.f7510a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        long j2 = this.f7511b;
        if (j2 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        java.lang.String[] strArr = this.f7512c;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f7512c;
                if (i2 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.O mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7510a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f7511b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                java.lang.String[] strArr = this.f7512c;
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
                this.f7512c = strArr2;
            }
        }
    }

    public static io.appmetrica.analytics.screenshot.impl.O b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.screenshot.impl.O().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.screenshot.impl.O a(byte[] bArr) {
        return (io.appmetrica.analytics.screenshot.impl.O) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.O(), bArr);
    }
}
