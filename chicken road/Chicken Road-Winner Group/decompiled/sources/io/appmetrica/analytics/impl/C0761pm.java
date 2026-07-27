package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761pm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0761pm[] f8095b;

    /* renamed from: a, reason: collision with root package name */
    public String f8096a;

    public C0761pm() {
        a();
    }

    public static C0761pm[] b() {
        if (f8095b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8095b == null) {
                        f8095b = new C0761pm[0];
                    }
                } finally {
                }
            }
        }
        return f8095b;
    }

    public final C0761pm a() {
        this.f8096a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f8096a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f8096a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8096a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8096a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0761pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8096a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0761pm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0761pm) MessageNano.mergeFrom(new C0761pm(), bArr);
    }

    public static C0761pm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0761pm().mergeFrom(codedInputByteBufferNano);
    }
}
