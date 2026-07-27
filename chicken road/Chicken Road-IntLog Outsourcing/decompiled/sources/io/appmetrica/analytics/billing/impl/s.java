package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class s extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile s[] f5983c;

    /* renamed from: a, reason: collision with root package name */
    public int f5984a;

    /* renamed from: b, reason: collision with root package name */
    public int f5985b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f5983c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5983c == null) {
                        f5983c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f5983c;
    }

    public final s a() {
        this.f5984a = 86400;
        this.f5985b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f5984a;
        if (i2 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        int i3 = this.f5985b;
        return i3 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f5984a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        int i3 = this.f5985b;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5984a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5985b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
