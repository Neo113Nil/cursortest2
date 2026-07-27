package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142ym extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1142ym[] f9603b;

    /* renamed from: a, reason: collision with root package name */
    public int f9604a;

    public C1142ym() {
        a();
    }

    public static C1142ym[] b() {
        if (f9603b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9603b == null) {
                        f9603b = new C1142ym[0];
                    }
                } finally {
                }
            }
        }
        return f9603b;
    }

    public final C1142ym a() {
        this.f9604a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f9604a;
        return i2 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f9604a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1142ym mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9604a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C1142ym a(byte[] bArr) {
        return (C1142ym) MessageNano.mergeFrom(new C1142ym(), bArr);
    }

    public static C1142ym b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1142ym().mergeFrom(codedInputByteBufferNano);
    }
}
