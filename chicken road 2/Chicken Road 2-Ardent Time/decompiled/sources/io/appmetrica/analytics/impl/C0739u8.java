package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739u8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6884g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6885h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6886i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6887j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6888k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6889l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6890m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6891n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0739u8[] f6892o;

    /* renamed from: a, reason: collision with root package name */
    public int f6893a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0713t8 f6894b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0661r8 f6895c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0687s8 f6896d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0300d8 f6897e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0454j8 f6898f;

    public C0739u8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0739u8[] b() {
        if (f6892o == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6892o == null) {
                        f6892o = new io.appmetrica.analytics.impl.C0739u8[0];
                    }
                } finally {
                }
            }
        }
        return f6892o;
    }

    public final io.appmetrica.analytics.impl.C0739u8 a() {
        this.f6893a = 0;
        this.f6894b = null;
        this.f6895c = null;
        this.f6896d = null;
        this.f6897e = null;
        this.f6898f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6893a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        io.appmetrica.analytics.impl.C0713t8 c0713t8 = this.f6894b;
        if (c0713t8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0713t8);
        }
        io.appmetrica.analytics.impl.C0661r8 c0661r8 = this.f6895c;
        if (c0661r8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0661r8);
        }
        io.appmetrica.analytics.impl.C0687s8 c0687s8 = this.f6896d;
        if (c0687s8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0687s8);
        }
        io.appmetrica.analytics.impl.C0300d8 c0300d8 = this.f6897e;
        if (c0300d8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, c0300d8);
        }
        io.appmetrica.analytics.impl.C0454j8 c0454j8 = this.f6898f;
        return c0454j8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, c0454j8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6893a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        io.appmetrica.analytics.impl.C0713t8 c0713t8 = this.f6894b;
        if (c0713t8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0713t8);
        }
        io.appmetrica.analytics.impl.C0661r8 c0661r8 = this.f6895c;
        if (c0661r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0661r8);
        }
        io.appmetrica.analytics.impl.C0687s8 c0687s8 = this.f6896d;
        if (c0687s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0687s8);
        }
        io.appmetrica.analytics.impl.C0300d8 c0300d8 = this.f6897e;
        if (c0300d8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0300d8);
        }
        io.appmetrica.analytics.impl.C0454j8 c0454j8 = this.f6898f;
        if (c0454j8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0454j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0739u8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0739u8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0739u8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
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
                        this.f6893a = readInt32;
                        break;
                }
            } else if (readTag == 18) {
                if (this.f6894b == null) {
                    this.f6894b = new io.appmetrica.analytics.impl.C0713t8();
                }
                codedInputByteBufferNano.readMessage(this.f6894b);
            } else if (readTag == 26) {
                if (this.f6895c == null) {
                    this.f6895c = new io.appmetrica.analytics.impl.C0661r8();
                }
                codedInputByteBufferNano.readMessage(this.f6895c);
            } else if (readTag == 34) {
                if (this.f6896d == null) {
                    this.f6896d = new io.appmetrica.analytics.impl.C0687s8();
                }
                codedInputByteBufferNano.readMessage(this.f6896d);
            } else if (readTag == 42) {
                if (this.f6897e == null) {
                    this.f6897e = new io.appmetrica.analytics.impl.C0300d8();
                }
                codedInputByteBufferNano.readMessage(this.f6897e);
            } else if (readTag != 50) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6898f == null) {
                    this.f6898f = new io.appmetrica.analytics.impl.C0454j8();
                }
                codedInputByteBufferNano.readMessage(this.f6898f);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0739u8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0739u8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0739u8(), bArr);
    }
}
