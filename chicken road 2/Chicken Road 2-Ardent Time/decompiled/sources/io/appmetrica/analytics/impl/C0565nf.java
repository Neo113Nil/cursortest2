package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565nf extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6526c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6527d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6528e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6529f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0565nf[] f6530g;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0513lf f6531a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0539mf[] f6532b;

    public C0565nf() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0565nf[] b() {
        if (f6530g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6530g == null) {
                        f6530g = new io.appmetrica.analytics.impl.C0565nf[0];
                    }
                } finally {
                }
            }
        }
        return f6530g;
    }

    public final io.appmetrica.analytics.impl.C0565nf a() {
        this.f6531a = null;
        this.f6532b = io.appmetrica.analytics.impl.C0539mf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0513lf c0513lf = this.f6531a;
        if (c0513lf != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0513lf);
        }
        io.appmetrica.analytics.impl.C0539mf[] c0539mfArr = this.f6532b;
        if (c0539mfArr != null && c0539mfArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0539mf[] c0539mfArr2 = this.f6532b;
                if (i2 >= c0539mfArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0539mf c0539mf = c0539mfArr2[i2];
                if (c0539mf != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0539mf) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0513lf c0513lf = this.f6531a;
        if (c0513lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0513lf);
        }
        io.appmetrica.analytics.impl.C0539mf[] c0539mfArr = this.f6532b;
        if (c0539mfArr != null && c0539mfArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0539mf[] c0539mfArr2 = this.f6532b;
                if (i2 >= c0539mfArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0539mf c0539mf = c0539mfArr2[i2];
                if (c0539mf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0539mf);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0565nf mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6531a == null) {
                    this.f6531a = new io.appmetrica.analytics.impl.C0513lf();
                }
                codedInputByteBufferNano.readMessage(this.f6531a);
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                io.appmetrica.analytics.impl.C0539mf[] c0539mfArr = this.f6532b;
                int length = c0539mfArr == null ? 0 : c0539mfArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0539mf[] c0539mfArr2 = new io.appmetrica.analytics.impl.C0539mf[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0539mfArr, 0, c0539mfArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0539mf c0539mf = new io.appmetrica.analytics.impl.C0539mf();
                    c0539mfArr2[length] = c0539mf;
                    codedInputByteBufferNano.readMessage(c0539mf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0539mf c0539mf2 = new io.appmetrica.analytics.impl.C0539mf();
                c0539mfArr2[length] = c0539mf2;
                codedInputByteBufferNano.readMessage(c0539mf2);
                this.f6532b = c0539mfArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0565nf b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0565nf().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0565nf a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0565nf) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0565nf(), bArr);
    }
}
