package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513lf extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0513lf[] f6357f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6358a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6359b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6360c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6361d;

    /* renamed from: e, reason: collision with root package name */
    public int f6362e;

    public C0513lf() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0513lf[] b() {
        if (f6357f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6357f == null) {
                        f6357f = new io.appmetrica.analytics.impl.C0513lf[0];
                    }
                } finally {
                }
            }
        }
        return f6357f;
    }

    public final io.appmetrica.analytics.impl.C0513lf a() {
        this.f6358a = "";
        this.f6359b = "";
        this.f6360c = false;
        this.f6361d = false;
        this.f6362e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6358a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6358a);
        }
        if (!this.f6359b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f6359b);
        }
        boolean z2 = this.f6360c;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(3, z2);
        }
        boolean z3 = this.f6361d;
        if (z3) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(4, z3);
        }
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(5, this.f6362e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6358a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6358a);
        }
        if (!this.f6359b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6359b);
        }
        boolean z2 = this.f6360c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        boolean z3 = this.f6361d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f6362e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0513lf b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0513lf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0513lf mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6358a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6359b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f6360c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f6361d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6362e = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0513lf a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0513lf) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0513lf(), bArr);
    }
}
