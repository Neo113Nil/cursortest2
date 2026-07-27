package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class D3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile D3[] f5827c;

    /* renamed from: a, reason: collision with root package name */
    public String f5828a;

    /* renamed from: b, reason: collision with root package name */
    public String f5829b;

    public D3() {
        a();
    }

    public static D3[] b() {
        if (f5827c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5827c == null) {
                        f5827c = new D3[0];
                    }
                } finally {
                }
            }
        }
        return f5827c;
    }

    public final D3 a() {
        this.f5828a = "";
        this.f5829b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5828a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5828a);
        }
        return !this.f5829b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f5829b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f5828a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5828a);
        }
        if (!this.f5829b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5829b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5828a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f5829b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static D3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D3().mergeFrom(codedInputByteBufferNano);
    }

    public static D3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D3) MessageNano.mergeFrom(new D3(), bArr);
    }
}
