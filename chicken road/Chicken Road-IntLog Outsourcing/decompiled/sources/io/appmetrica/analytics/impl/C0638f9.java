package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638f9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0638f9[] f8174c;

    /* renamed from: a, reason: collision with root package name */
    public String f8175a;

    /* renamed from: b, reason: collision with root package name */
    public String f8176b;

    public C0638f9() {
        a();
    }

    public static C0638f9[] b() {
        if (f8174c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8174c == null) {
                        f8174c = new C0638f9[0];
                    }
                } finally {
                }
            }
        }
        return f8174c;
    }

    public final C0638f9 a() {
        this.f8175a = "";
        this.f8176b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f8176b) + CodedOutputByteBufferNano.computeStringSize(1, this.f8175a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8175a);
        codedOutputByteBufferNano.writeString(2, this.f8176b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0638f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8175a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8176b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0638f9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0638f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0638f9 a(byte[] bArr) {
        return (C0638f9) MessageNano.mergeFrom(new C0638f9(), bArr);
    }
}
