package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301d9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0301d9[] f5717c;

    /* renamed from: a, reason: collision with root package name */
    public int f5718a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5719b;

    public C0301d9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0301d9[] b() {
        if (f5717c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5717c == null) {
                        f5717c = new io.appmetrica.analytics.impl.C0301d9[0];
                    }
                } finally {
                }
            }
        }
        return f5717c;
    }

    public final io.appmetrica.analytics.impl.C0301d9 a() {
        this.f5718a = 2;
        this.f5719b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f5718a;
        if (i2 != 2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        return !this.f5719b.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f5719b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f5718a;
        if (i2 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!this.f5719b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5719b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0301d9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f5718a = readInt32;
                        break;
                }
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5719b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0301d9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0301d9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0301d9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0301d9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0301d9(), bArr);
    }
}
