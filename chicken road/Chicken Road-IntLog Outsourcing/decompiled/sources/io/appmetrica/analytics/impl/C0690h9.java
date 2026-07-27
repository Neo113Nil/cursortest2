package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690h9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0690h9[] f8315c;

    /* renamed from: a, reason: collision with root package name */
    public String f8316a;

    /* renamed from: b, reason: collision with root package name */
    public long f8317b;

    public C0690h9() {
        a();
    }

    public static C0690h9[] b() {
        if (f8315c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8315c == null) {
                        f8315c = new C0690h9[0];
                    }
                } finally {
                }
            }
        }
        return f8315c;
    }

    public final C0690h9 a() {
        this.f8316a = "";
        this.f8317b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f8317b) + CodedOutputByteBufferNano.computeStringSize(1, this.f8316a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8316a);
        codedOutputByteBufferNano.writeUInt64(2, this.f8317b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0690h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8316a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8317b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C0690h9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0690h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0690h9 a(byte[] bArr) {
        return (C0690h9) MessageNano.mergeFrom(new C0690h9(), bArr);
    }
}
