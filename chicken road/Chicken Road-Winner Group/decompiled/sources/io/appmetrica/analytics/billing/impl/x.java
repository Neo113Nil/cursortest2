package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class x extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile x[] f5197d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5198a;

    /* renamed from: b, reason: collision with root package name */
    public w f5199b;

    /* renamed from: c, reason: collision with root package name */
    public v f5200c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f5197d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5197d == null) {
                        f5197d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f5197d;
    }

    public final x a() {
        this.f5198a = false;
        this.f5199b = null;
        this.f5200c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z3 = this.f5198a;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z3);
        }
        w wVar = this.f5199b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f5200c;
        return vVar != null ? CodedOutputByteBufferNano.computeMessageSize(3, vVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z3 = this.f5198a;
        if (z3) {
            codedOutputByteBufferNano.writeBool(1, z3);
        }
        w wVar = this.f5199b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f5200c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5198a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f5199b == null) {
                    this.f5199b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f5199b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f5200c == null) {
                    this.f5200c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f5200c);
            }
        }
        return this;
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
