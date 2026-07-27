package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787qm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0787qm[] f8173c;

    /* renamed from: a, reason: collision with root package name */
    public String f8174a;

    /* renamed from: b, reason: collision with root package name */
    public C0761pm f8175b;

    public C0787qm() {
        a();
    }

    public static C0787qm[] b() {
        if (f8173c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8173c == null) {
                        f8173c = new C0787qm[0];
                    }
                } finally {
                }
            }
        }
        return f8173c;
    }

    public final C0787qm a() {
        this.f8174a = "";
        this.f8175b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8174a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8174a);
        }
        C0761pm c0761pm = this.f8175b;
        return c0761pm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0761pm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8174a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8174a);
        }
        C0761pm c0761pm = this.f8175b;
        if (c0761pm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0761pm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0787qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8174a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8175b == null) {
                    this.f8175b = new C0761pm();
                }
                codedInputByteBufferNano.readMessage(this.f8175b);
            }
        }
        return this;
    }

    public static C0787qm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0787qm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0787qm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0787qm) MessageNano.mergeFrom(new C0787qm(), bArr);
    }
}
