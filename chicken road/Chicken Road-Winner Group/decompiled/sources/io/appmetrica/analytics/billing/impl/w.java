package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5190c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5191d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5192e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5193g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static volatile w[] f5194h;

    /* renamed from: a, reason: collision with root package name */
    public int f5195a;

    /* renamed from: b, reason: collision with root package name */
    public int f5196b;

    public w() {
        a();
    }

    public static w[] b() {
        if (f5194h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5194h == null) {
                        f5194h = new w[0];
                    }
                } finally {
                }
            }
        }
        return f5194h;
    }

    public final w a() {
        this.f5195a = 0;
        this.f5196b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5195a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int i4 = this.f5196b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5195a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        int i4 = this.f5196b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5195a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f5196b = readInt32;
                }
            }
        }
        return this;
    }

    public static w b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new w().mergeFrom(codedInputByteBufferNano);
    }

    public static w a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (w) MessageNano.mergeFrom(new w(), bArr);
    }
}
