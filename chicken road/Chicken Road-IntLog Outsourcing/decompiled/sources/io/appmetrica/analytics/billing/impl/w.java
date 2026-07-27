package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class w extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5997c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5998d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5999e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6000f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6001g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile w[] f6002h;

    /* renamed from: a, reason: collision with root package name */
    public int f6003a;

    /* renamed from: b, reason: collision with root package name */
    public int f6004b;

    public w() {
        a();
    }

    public static w[] b() {
        if (f6002h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6002h == null) {
                        f6002h = new w[0];
                    }
                } finally {
                }
            }
        }
        return f6002h;
    }

    public final w a() {
        this.f6003a = 0;
        this.f6004b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6003a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f6004b;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6003a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f6004b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6003a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f6004b = readInt32;
                }
            }
        }
    }

    public static w b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new w().mergeFrom(codedInputByteBufferNano);
    }

    public static w a(byte[] bArr) {
        return (w) MessageNano.mergeFrom(new w(), bArr);
    }
}
