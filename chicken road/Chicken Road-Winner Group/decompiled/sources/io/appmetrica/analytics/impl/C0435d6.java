package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435d6 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0435d6[] f7141b;

    /* renamed from: a, reason: collision with root package name */
    public String f7142a;

    public C0435d6() {
        a();
    }

    public static C0435d6[] b() {
        if (f7141b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7141b == null) {
                        f7141b = new C0435d6[0];
                    }
                } finally {
                }
            }
        }
        return f7141b;
    }

    public final C0435d6 a() {
        this.f7142a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f7142a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7142a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0435d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7142a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0435d6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0435d6) MessageNano.mergeFrom(new C0435d6(), bArr);
    }

    public static C0435d6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0435d6().mergeFrom(codedInputByteBufferNano);
    }
}
