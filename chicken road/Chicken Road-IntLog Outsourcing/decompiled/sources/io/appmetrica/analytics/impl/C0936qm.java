package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936qm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0936qm[] f9116c;

    /* renamed from: a, reason: collision with root package name */
    public String f9117a;

    /* renamed from: b, reason: collision with root package name */
    public C0910pm f9118b;

    public C0936qm() {
        a();
    }

    public static C0936qm[] b() {
        if (f9116c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9116c == null) {
                        f9116c = new C0936qm[0];
                    }
                } finally {
                }
            }
        }
        return f9116c;
    }

    public final C0936qm a() {
        this.f9117a = "";
        this.f9118b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f9117a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9117a);
        }
        C0910pm c0910pm = this.f9118b;
        return c0910pm != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0910pm) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f9117a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9117a);
        }
        C0910pm c0910pm = this.f9118b;
        if (c0910pm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0910pm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0936qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9117a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9118b == null) {
                    this.f9118b = new C0910pm();
                }
                codedInputByteBufferNano.readMessage(this.f9118b);
            }
        }
    }

    public static C0936qm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0936qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0936qm a(byte[] bArr) {
        return (C0936qm) MessageNano.mergeFrom(new C0936qm(), bArr);
    }
}
