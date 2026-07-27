package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class x extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile x[] f6005d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6006a;

    /* renamed from: b, reason: collision with root package name */
    public w f6007b;

    /* renamed from: c, reason: collision with root package name */
    public v f6008c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f6005d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6005d == null) {
                        f6005d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f6005d;
    }

    public final x a() {
        this.f6006a = false;
        this.f6007b = null;
        this.f6008c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f6006a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        w wVar = this.f6007b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f6008c;
        return vVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, vVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f6006a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        w wVar = this.f6007b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f6008c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6006a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f6007b == null) {
                    this.f6007b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f6007b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6008c == null) {
                    this.f6008c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f6008c);
            }
        }
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
