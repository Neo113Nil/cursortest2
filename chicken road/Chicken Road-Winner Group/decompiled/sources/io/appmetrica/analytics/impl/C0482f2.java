package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482f2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0482f2[] f7270c;

    /* renamed from: a, reason: collision with root package name */
    public String f7271a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7272b;

    public C0482f2() {
        a();
    }

    public static C0482f2[] b() {
        if (f7270c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7270c == null) {
                        f7270c = new C0482f2[0];
                    }
                } finally {
                }
            }
        }
        return f7270c;
    }

    public final C0482f2 a() {
        this.f7271a = "";
        this.f7272b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f7272b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7271a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7271a);
        codedOutputByteBufferNano.writeBool(2, this.f7272b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0482f2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7271a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7272b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0482f2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0482f2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0482f2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0482f2) MessageNano.mergeFrom(new C0482f2(), bArr);
    }
}
