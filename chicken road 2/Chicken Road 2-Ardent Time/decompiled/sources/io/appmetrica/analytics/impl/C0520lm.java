package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520lm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0520lm[] f6373b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6374a;

    public C0520lm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0520lm[] b() {
        if (f6373b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6373b == null) {
                        f6373b = new io.appmetrica.analytics.impl.C0520lm[0];
                    }
                } finally {
                }
            }
        }
        return f6373b;
    }

    public final io.appmetrica.analytics.impl.C0520lm a() {
        this.f6374a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f6374a.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6374a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6374a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6374a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0520lm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6374a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0520lm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0520lm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0520lm(), bArr);
    }

    public static io.appmetrica.analytics.impl.C0520lm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0520lm().mergeFrom(codedInputByteBufferNano);
    }
}
