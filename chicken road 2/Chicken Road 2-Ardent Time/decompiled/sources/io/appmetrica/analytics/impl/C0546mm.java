package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546mm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0546mm[] f6445c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6446a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0520lm f6447b;

    public C0546mm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0546mm[] b() {
        if (f6445c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6445c == null) {
                        f6445c = new io.appmetrica.analytics.impl.C0546mm[0];
                    }
                } finally {
                }
            }
        }
        return f6445c;
    }

    public final io.appmetrica.analytics.impl.C0546mm a() {
        this.f6446a = "";
        this.f6447b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6446a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6446a);
        }
        io.appmetrica.analytics.impl.C0520lm c0520lm = this.f6447b;
        return c0520lm != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0520lm) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6446a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6446a);
        }
        io.appmetrica.analytics.impl.C0520lm c0520lm = this.f6447b;
        if (c0520lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0520lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0546mm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6446a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6447b == null) {
                    this.f6447b = new io.appmetrica.analytics.impl.C0520lm();
                }
                codedInputByteBufferNano.readMessage(this.f6447b);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0546mm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0546mm().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0546mm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0546mm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0546mm(), bArr);
    }
}
