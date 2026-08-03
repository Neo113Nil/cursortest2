package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ab extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Ab[] f4045f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4046a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f4047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4048c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f4049d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f4050e;

    public Ab() {
        a();
    }

    public static io.appmetrica.analytics.impl.Ab[] b() {
        if (f4045f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4045f == null) {
                        f4045f = new io.appmetrica.analytics.impl.Ab[0];
                    }
                } finally {
                }
            }
        }
        return f4045f;
    }

    public final io.appmetrica.analytics.impl.Ab a() {
        this.f4046a = "";
        this.f4047b = "";
        this.f4048c = false;
        this.f4049d = "";
        this.f4050e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4046a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f4046a);
        }
        if (!this.f4047b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(19, this.f4047b);
        }
        boolean z2 = this.f4048c;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(22, z2);
        }
        if (!this.f4049d.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(25, this.f4049d);
        }
        return !this.f4050e.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(26, this.f4050e) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4046a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4046a);
        }
        if (!this.f4047b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f4047b);
        }
        boolean z2 = this.f4048c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(22, z2);
        }
        if (!this.f4049d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f4049d);
        }
        if (!this.f4050e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f4050e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Ab b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Ab().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ab mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4046a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f4047b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f4048c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f4049d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4050e = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Ab a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Ab) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Ab(), bArr);
    }
}
