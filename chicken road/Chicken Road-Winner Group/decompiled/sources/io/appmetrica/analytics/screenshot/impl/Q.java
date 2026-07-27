package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Q extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Q[] f9003d;

    /* renamed from: a, reason: collision with root package name */
    public N f9004a;

    /* renamed from: b, reason: collision with root package name */
    public P f9005b;

    /* renamed from: c, reason: collision with root package name */
    public O f9006c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f9003d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9003d == null) {
                        f9003d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f9003d;
    }

    public final Q a() {
        this.f9004a = null;
        this.f9005b = null;
        this.f9006c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n3 = this.f9004a;
        if (n3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n3);
        }
        P p3 = this.f9005b;
        if (p3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p3);
        }
        O o3 = this.f9006c;
        return o3 != null ? CodedOutputByteBufferNano.computeMessageSize(3, o3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n3 = this.f9004a;
        if (n3 != null) {
            codedOutputByteBufferNano.writeMessage(1, n3);
        }
        P p3 = this.f9005b;
        if (p3 != null) {
            codedOutputByteBufferNano.writeMessage(2, p3);
        }
        O o3 = this.f9006c;
        if (o3 != null) {
            codedOutputByteBufferNano.writeMessage(3, o3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f9004a == null) {
                    this.f9004a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f9004a);
            } else if (readTag == 18) {
                if (this.f9005b == null) {
                    this.f9005b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f9005b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f9006c == null) {
                    this.f9006c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f9006c);
            }
        }
        return this;
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
