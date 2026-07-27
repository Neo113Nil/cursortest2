package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5610c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5611d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile o[] f5612e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5613a;

    /* renamed from: b, reason: collision with root package name */
    public n f5614b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f5612e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5612e == null) {
                        f5612e = new o[0];
                    }
                } finally {
                }
            }
        }
        return f5612e;
    }

    public final o a() {
        this.f5613a = false;
        this.f5614b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z3 = this.f5613a;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z3);
        }
        n nVar = this.f5614b;
        return nVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, nVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z3 = this.f5613a;
        if (z3) {
            codedOutputByteBufferNano.writeBool(1, z3);
        }
        n nVar = this.f5614b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5613a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f5614b == null) {
                    this.f5614b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f5614b);
            }
        }
        return this;
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }
}
