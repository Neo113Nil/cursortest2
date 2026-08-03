package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430i9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0430i9[] f6088e;

    /* renamed from: a, reason: collision with root package name */
    public long f6089a;

    /* renamed from: b, reason: collision with root package name */
    public int f6090b;

    /* renamed from: c, reason: collision with root package name */
    public long f6091c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6092d;

    public C0430i9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0430i9[] b() {
        if (f6088e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6088e == null) {
                        f6088e = new io.appmetrica.analytics.impl.C0430i9[0];
                    }
                } finally {
                }
            }
        }
        return f6088e;
    }

    public final io.appmetrica.analytics.impl.C0430i9 a() {
        this.f6089a = 0L;
        this.f6090b = 0;
        this.f6091c = 0L;
        this.f6092d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32Size(2, this.f6090b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(1, this.f6089a) + super.computeSerializedSize();
        long j2 = this.f6091c;
        if (j2 != 0) {
            computeSInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(3, j2);
        }
        boolean z2 = this.f6092d;
        return z2 ? computeSInt32Size + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6089a);
        codedOutputByteBufferNano.writeSInt32(2, this.f6090b);
        long j2 = this.f6091c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j2);
        }
        boolean z2 = this.f6092d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0430i9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6089a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f6090b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f6091c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6092d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0430i9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0430i9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0430i9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0430i9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0430i9(), bArr);
    }
}
