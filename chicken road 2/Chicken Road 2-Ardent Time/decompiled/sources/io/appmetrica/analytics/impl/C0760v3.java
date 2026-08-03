package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760v3 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0760v3[] f6945c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6946a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6947b;

    public C0760v3() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0760v3[] b() {
        if (f6945c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6945c == null) {
                        f6945c = new io.appmetrica.analytics.impl.C0760v3[0];
                    }
                } finally {
                }
            }
        }
        return f6945c;
    }

    public final io.appmetrica.analytics.impl.C0760v3 a() {
        this.f6946a = "";
        this.f6947b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6946a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6946a);
        }
        return !this.f6947b.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f6947b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6946a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6946a);
        }
        if (!this.f6947b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6947b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0760v3 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6946a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6947b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0760v3 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0760v3().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0760v3 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0760v3) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0760v3(), bArr);
    }
}
