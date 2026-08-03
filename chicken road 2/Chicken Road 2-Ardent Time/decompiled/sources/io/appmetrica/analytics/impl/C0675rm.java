package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675rm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0675rm[] f6756g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6758b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6760d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6761e;

    /* renamed from: f, reason: collision with root package name */
    public int f6762f;

    public C0675rm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0675rm[] b() {
        if (f6756g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6756g == null) {
                        f6756g = new io.appmetrica.analytics.impl.C0675rm[0];
                    }
                } finally {
                }
            }
        }
        return f6756g;
    }

    public final io.appmetrica.analytics.impl.C0675rm a() {
        this.f6757a = false;
        this.f6758b = false;
        this.f6759c = false;
        this.f6760d = false;
        this.f6761e = false;
        this.f6762f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(4, this.f6760d) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(3, this.f6759c) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(2, this.f6758b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, this.f6757a) + super.computeSerializedSize();
        boolean z2 = this.f6761e;
        if (z2) {
            computeBoolSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int i2 = this.f6762f;
        return i2 != -1 ? computeBoolSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(6, i2) : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f6757a);
        codedOutputByteBufferNano.writeBool(2, this.f6758b);
        codedOutputByteBufferNano.writeBool(3, this.f6759c);
        codedOutputByteBufferNano.writeBool(4, this.f6760d);
        boolean z2 = this.f6761e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int i2 = this.f6762f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0675rm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0675rm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0675rm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6757a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f6758b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f6759c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f6760d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f6761e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f6762f = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0675rm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0675rm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0675rm(), bArr);
    }
}
