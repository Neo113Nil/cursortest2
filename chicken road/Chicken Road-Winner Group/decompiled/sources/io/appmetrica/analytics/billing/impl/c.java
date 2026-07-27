package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends MessageNano {
    public static volatile c[] f;

    /* renamed from: a, reason: collision with root package name */
    public int f5150a;

    /* renamed from: b, reason: collision with root package name */
    public String f5151b;

    /* renamed from: c, reason: collision with root package name */
    public String f5152c;

    /* renamed from: d, reason: collision with root package name */
    public long f5153d;

    /* renamed from: e, reason: collision with root package name */
    public long f5154e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new c[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final c a() {
        this.f5150a = 1;
        this.f5151b = "";
        this.f5152c = "";
        this.f5153d = 0L;
        this.f5154e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f5154e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f5153d) + CodedOutputByteBufferNano.computeStringSize(3, this.f5152c) + CodedOutputByteBufferNano.computeStringSize(2, this.f5151b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f5150a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f5150a);
        codedOutputByteBufferNano.writeString(2, this.f5151b);
        codedOutputByteBufferNano.writeString(3, this.f5152c);
        codedOutputByteBufferNano.writeUInt64(4, this.f5153d);
        codedOutputByteBufferNano.writeUInt64(5, this.f5154e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5150a = readInt32;
                }
            } else if (readTag == 18) {
                this.f5151b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f5152c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f5153d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f5154e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
