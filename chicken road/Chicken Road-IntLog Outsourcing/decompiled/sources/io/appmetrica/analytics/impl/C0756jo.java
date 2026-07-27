package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756jo extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0756jo[] f8590e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8591a;

    /* renamed from: b, reason: collision with root package name */
    public double f8592b;

    /* renamed from: c, reason: collision with root package name */
    public double f8593c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8594d;

    public C0756jo() {
        a();
    }

    public static C0756jo[] b() {
        if (f8590e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8590e == null) {
                        f8590e = new C0756jo[0];
                    }
                } finally {
                }
            }
        }
        return f8590e;
    }

    public final C0756jo a() {
        this.f8591a = WireFormatNano.EMPTY_BYTES;
        this.f8592b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f8593c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f8594d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f8591a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8591a);
        }
        if (Double.doubleToLongBits(this.f8592b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f8592b);
        }
        if (Double.doubleToLongBits(this.f8593c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f8593c);
        }
        boolean z = this.f8594d;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f8591a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8591a);
        }
        if (Double.doubleToLongBits(this.f8592b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f8592b);
        }
        if (Double.doubleToLongBits(this.f8593c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(3, this.f8593c);
        }
        boolean z = this.f8594d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0756jo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8591a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f8592b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f8593c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8594d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0756jo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0756jo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0756jo a(byte[] bArr) {
        return (C0756jo) MessageNano.mergeFrom(new C0756jo(), bArr);
    }
}
