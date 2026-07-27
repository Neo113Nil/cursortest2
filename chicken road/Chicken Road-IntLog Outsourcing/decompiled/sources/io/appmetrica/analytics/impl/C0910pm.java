package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910pm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0910pm[] f9032b;

    /* renamed from: a, reason: collision with root package name */
    public String f9033a;

    public C0910pm() {
        a();
    }

    public static C0910pm[] b() {
        if (f9032b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9032b == null) {
                        f9032b = new C0910pm[0];
                    }
                } finally {
                }
            }
        }
        return f9032b;
    }

    public final C0910pm a() {
        this.f9033a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f9033a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f9033a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9033a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9033a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0910pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9033a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0910pm a(byte[] bArr) {
        return (C0910pm) MessageNano.mergeFrom(new C0910pm(), bArr);
    }

    public static C0910pm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0910pm().mergeFrom(codedInputByteBufferNano);
    }
}
