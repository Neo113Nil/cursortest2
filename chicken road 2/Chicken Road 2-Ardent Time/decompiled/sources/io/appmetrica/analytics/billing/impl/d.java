package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class d extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3458c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3459d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3460e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.d[] f3461f;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.c[] f3462a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3463b;

    public d() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.d[] b() {
        if (f3461f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3461f == null) {
                        f3461f = new io.appmetrica.analytics.billing.impl.d[0];
                    }
                } finally {
                }
            }
        }
        return f3461f;
    }

    public final io.appmetrica.analytics.billing.impl.d a() {
        this.f3462a = io.appmetrica.analytics.billing.impl.c.b();
        this.f3463b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.billing.impl.c[] cVarArr = this.f3462a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.billing.impl.c[] cVarArr2 = this.f3462a;
                if (i2 >= cVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.billing.impl.c cVar = cVarArr2[i2];
                if (cVar != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, cVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(2, this.f3463b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.billing.impl.c[] cVarArr = this.f3462a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.billing.impl.c[] cVarArr2 = this.f3462a;
                if (i2 >= cVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.billing.impl.c cVar = cVarArr2[i2];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i2++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f3463b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.d mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                io.appmetrica.analytics.billing.impl.c[] cVarArr = this.f3462a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.billing.impl.c[] cVarArr2 = new io.appmetrica.analytics.billing.impl.c[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.billing.impl.c cVar = new io.appmetrica.analytics.billing.impl.c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.billing.impl.c cVar2 = new io.appmetrica.analytics.billing.impl.c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f3462a = cVarArr2;
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3463b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.d b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.d().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.d a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.d) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.d(), bArr);
    }
}
