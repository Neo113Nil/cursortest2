package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404h9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0404h9[] f6042e;

    /* renamed from: a, reason: collision with root package name */
    public int f6043a;

    /* renamed from: b, reason: collision with root package name */
    public int f6044b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f6045c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6046d;

    public C0404h9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0404h9[] b() {
        if (f6042e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6042e == null) {
                        f6042e = new io.appmetrica.analytics.impl.C0404h9[0];
                    }
                } finally {
                }
            }
        }
        return f6042e;
    }

    public final io.appmetrica.analytics.impl.C0404h9 a() {
        this.f6043a = 0;
        this.f6044b = 0;
        this.f6045c = "";
        this.f6046d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6043a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f6044b;
        if (i3 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(2, i3);
        }
        if (!this.f6045c.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f6045c);
        }
        boolean z2 = this.f6046d;
        return z2 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6043a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f6044b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        if (!this.f6045c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6045c);
        }
        boolean z2 = this.f6046d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0404h9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6043a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f6044b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f6045c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6046d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0404h9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0404h9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0404h9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0404h9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0404h9(), bArr);
    }
}
