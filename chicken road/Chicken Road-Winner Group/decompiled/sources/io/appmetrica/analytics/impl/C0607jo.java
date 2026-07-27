package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607jo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0607jo[] f7671e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7672a;

    /* renamed from: b, reason: collision with root package name */
    public double f7673b;

    /* renamed from: c, reason: collision with root package name */
    public double f7674c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7675d;

    public C0607jo() {
        a();
    }

    public static C0607jo[] b() {
        if (f7671e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7671e == null) {
                        f7671e = new C0607jo[0];
                    }
                } finally {
                }
            }
        }
        return f7671e;
    }

    public final C0607jo a() {
        this.f7672a = WireFormatNano.EMPTY_BYTES;
        this.f7673b = 0.0d;
        this.f7674c = 0.0d;
        this.f7675d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7672a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7672a);
        }
        if (Double.doubleToLongBits(this.f7673b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f7673b);
        }
        if (Double.doubleToLongBits(this.f7674c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f7674c);
        }
        boolean z3 = this.f7675d;
        return z3 ? CodedOutputByteBufferNano.computeBoolSize(4, z3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7672a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7672a);
        }
        if (Double.doubleToLongBits(this.f7673b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f7673b);
        }
        if (Double.doubleToLongBits(this.f7674c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f7674c);
        }
        boolean z3 = this.f7675d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0607jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7672a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f7673b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f7674c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7675d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0607jo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0607jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0607jo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0607jo) MessageNano.mergeFrom(new C0607jo(), bArr);
    }
}
