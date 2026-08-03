package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Z5[] f5376g;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5377a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5378b;

    /* renamed from: c, reason: collision with root package name */
    public int f5379c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f5380d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5381e;

    /* renamed from: f, reason: collision with root package name */
    public int f5382f;

    public Z5() {
        a();
    }

    public static io.appmetrica.analytics.impl.Z5[] b() {
        if (f5376g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5376g == null) {
                        f5376g = new io.appmetrica.analytics.impl.Z5[0];
                    }
                } finally {
                }
            }
        }
        return f5376g;
    }

    public final io.appmetrica.analytics.impl.Z5 a() {
        this.f5377a = "";
        this.f5378b = "";
        this.f5379c = -1;
        this.f5380d = "";
        this.f5381e = false;
        this.f5382f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5377a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5377a);
        }
        if (!this.f5378b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5378b);
        }
        int i2 = this.f5379c;
        if (i2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32Size(3, i2);
        }
        if (!this.f5380d.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f5380d);
        }
        boolean z2 = this.f5381e;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int i3 = this.f5382f;
        return i3 != -1 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32Size(6, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5377a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5377a);
        }
        if (!this.f5378b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5378b);
        }
        int i2 = this.f5379c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i2);
        }
        if (!this.f5380d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5380d);
        }
        boolean z2 = this.f5381e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int i3 = this.f5382f;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Z5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Z5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5377a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5378b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f5379c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f5380d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f5381e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5382f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Z5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Z5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Z5(), bArr);
    }
}
