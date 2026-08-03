package io.appmetrica.analytics.remotepermissions.impl;

/* loaded from: classes.dex */
public final class f extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.remotepermissions.impl.f[] f7479b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f7480a;

    public f() {
        a();
    }

    public static io.appmetrica.analytics.remotepermissions.impl.f[] b() {
        if (f7479b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7479b == null) {
                        f7479b = new io.appmetrica.analytics.remotepermissions.impl.f[0];
                    }
                } finally {
                }
            }
        }
        return f7479b;
    }

    public final io.appmetrica.analytics.remotepermissions.impl.f a() {
        this.f7480a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f7480a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[][] bArr2 = this.f7480a;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i4++;
                i3 = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f7480a;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f7480a;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.remotepermissions.impl.f mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f7480a;
                int length = bArr == null ? 0 : bArr.length;
                int i2 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i2][];
                if (length != 0) {
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i2 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f7480a = bArr2;
            }
        }
    }

    public static io.appmetrica.analytics.remotepermissions.impl.f b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.remotepermissions.impl.f().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.remotepermissions.impl.f a(byte[] bArr) {
        return (io.appmetrica.analytics.remotepermissions.impl.f) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.remotepermissions.impl.f(), bArr);
    }
}
