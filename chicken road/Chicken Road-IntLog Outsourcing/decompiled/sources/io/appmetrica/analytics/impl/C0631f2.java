package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631f2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0631f2[] f8165c;

    /* renamed from: a, reason: collision with root package name */
    public String f8166a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8167b;

    public C0631f2() {
        a();
    }

    public static C0631f2[] b() {
        if (f8165c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8165c == null) {
                        f8165c = new C0631f2[0];
                    }
                } finally {
                }
            }
        }
        return f8165c;
    }

    public final C0631f2 a() {
        this.f8166a = "";
        this.f8167b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f8167b) + CodedOutputByteBufferNano.computeStringSize(1, this.f8166a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f8166a);
        codedOutputByteBufferNano.writeBool(2, this.f8167b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0631f2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8166a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8167b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0631f2 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0631f2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0631f2 a(byte[] bArr) {
        return (C0631f2) MessageNano.mergeFrom(new C0631f2(), bArr);
    }
}
