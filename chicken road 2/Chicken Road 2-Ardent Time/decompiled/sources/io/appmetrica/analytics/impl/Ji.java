package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ji extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f4504c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4505d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4506e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4507f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4508g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Ji[] f4509h;

    /* renamed from: a, reason: collision with root package name */
    public int f4510a;

    /* renamed from: b, reason: collision with root package name */
    public int f4511b;

    public Ji() {
        a();
    }

    public static io.appmetrica.analytics.impl.Ji[] b() {
        if (f4509h == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4509h == null) {
                        f4509h = new io.appmetrica.analytics.impl.Ji[0];
                    }
                } finally {
                }
            }
        }
        return f4509h;
    }

    public final io.appmetrica.analytics.impl.Ji a() {
        this.f4510a = 0;
        this.f4511b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4510a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f4511b;
        return i3 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4510a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f4511b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ji mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4510a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f4511b = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.Ji b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Ji a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Ji) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Ji(), bArr);
    }
}
