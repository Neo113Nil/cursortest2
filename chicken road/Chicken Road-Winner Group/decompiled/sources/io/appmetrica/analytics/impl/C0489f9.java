package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489f9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0489f9[] f7279c;

    /* renamed from: a, reason: collision with root package name */
    public String f7280a;

    /* renamed from: b, reason: collision with root package name */
    public String f7281b;

    public C0489f9() {
        a();
    }

    public static C0489f9[] b() {
        if (f7279c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7279c == null) {
                        f7279c = new C0489f9[0];
                    }
                } finally {
                }
            }
        }
        return f7279c;
    }

    public final C0489f9 a() {
        this.f7280a = "";
        this.f7281b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f7281b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7280a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7280a);
        codedOutputByteBufferNano.writeString(2, this.f7281b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0489f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7280a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7281b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0489f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0489f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0489f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0489f9) MessageNano.mergeFrom(new C0489f9(), bArr);
    }
}
