package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050v7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C1050v7[] f9444k;

    /* renamed from: a, reason: collision with root package name */
    public int f9445a;

    /* renamed from: b, reason: collision with root package name */
    public double f9446b;

    /* renamed from: c, reason: collision with root package name */
    public double f9447c;

    /* renamed from: d, reason: collision with root package name */
    public int f9448d;

    /* renamed from: e, reason: collision with root package name */
    public int f9449e;

    /* renamed from: f, reason: collision with root package name */
    public int f9450f;

    /* renamed from: g, reason: collision with root package name */
    public int f9451g;

    /* renamed from: h, reason: collision with root package name */
    public long f9452h;

    /* renamed from: i, reason: collision with root package name */
    public String f9453i;

    /* renamed from: j, reason: collision with root package name */
    public String f9454j;

    public C1050v7() {
        a();
    }

    public static C1050v7[] b() {
        if (f9444k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9444k == null) {
                        f9444k = new C1050v7[0];
                    }
                } finally {
                }
            }
        }
        return f9444k;
    }

    public final C1050v7 a() {
        this.f9445a = -1;
        this.f9446b = -1.0d;
        this.f9447c = -1.0d;
        this.f9448d = -1;
        this.f9449e = -1;
        this.f9450f = -1;
        this.f9451g = -1;
        this.f9452h = -1L;
        this.f9453i = "";
        this.f9454j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f9445a;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (Double.doubleToLongBits(this.f9446b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f9446b);
        }
        if (Double.doubleToLongBits(this.f9447c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f9447c);
        }
        int i3 = this.f9448d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        int i6 = this.f9449e;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i6);
        }
        int i7 = this.f9450f;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i7);
        }
        int i8 = this.f9451g;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i8);
        }
        long j2 = this.f9452h;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        if (!this.f9453i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f9453i);
        }
        return !this.f9454j.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f9454j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f9445a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (Double.doubleToLongBits(this.f9446b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f9446b);
        }
        if (Double.doubleToLongBits(this.f9447c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f9447c);
        }
        int i3 = this.f9448d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        int i6 = this.f9449e;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i6);
        }
        int i7 = this.f9450f;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i7);
        }
        int i8 = this.f9451g;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i8);
        }
        long j2 = this.f9452h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        if (!this.f9453i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f9453i);
        }
        if (!this.f9454j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f9454j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C1050v7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1050v7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1050v7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f9445a = readInt32;
                        break;
                    }
                case 17:
                    this.f9446b = codedInputByteBufferNano.readDouble();
                    break;
                case C0793l9.f8684F /* 25 */:
                    this.f9447c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f9448d = codedInputByteBufferNano.readInt32();
                    break;
                case C0793l9.f8690L /* 40 */:
                    this.f9449e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f9450f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f9451g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f9452h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f9453i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f9454j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C1050v7 a(byte[] bArr) {
        return (C1050v7) MessageNano.mergeFrom(new C1050v7(), bArr);
    }
}
