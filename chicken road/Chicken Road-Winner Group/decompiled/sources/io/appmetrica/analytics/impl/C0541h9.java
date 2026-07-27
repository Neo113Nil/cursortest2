package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541h9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0541h9[] f7412c;

    /* renamed from: a, reason: collision with root package name */
    public String f7413a;

    /* renamed from: b, reason: collision with root package name */
    public long f7414b;

    public C0541h9() {
        a();
    }

    public static C0541h9[] b() {
        if (f7412c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7412c == null) {
                        f7412c = new C0541h9[0];
                    }
                } finally {
                }
            }
        }
        return f7412c;
    }

    public final C0541h9 a() {
        this.f7413a = "";
        this.f7414b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f7414b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7413a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7413a);
        codedOutputByteBufferNano.writeUInt64(2, this.f7414b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0541h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7413a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7414b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C0541h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0541h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0541h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0541h9) MessageNano.mergeFrom(new C0541h9(), bArr);
    }
}
