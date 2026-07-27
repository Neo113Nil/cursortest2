package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Pi extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Pi[] f7282d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7283a;

    /* renamed from: b, reason: collision with root package name */
    public Oi f7284b;

    /* renamed from: c, reason: collision with root package name */
    public Ni f7285c;

    public Pi() {
        a();
    }

    public static Pi[] b() {
        if (f7282d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7282d == null) {
                        f7282d = new Pi[0];
                    }
                } finally {
                }
            }
        }
        return f7282d;
    }

    public final Pi a() {
        this.f7283a = false;
        this.f7284b = null;
        this.f7285c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f7283a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Oi oi = this.f7284b;
        if (oi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, oi);
        }
        Ni ni = this.f7285c;
        return ni != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, ni) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f7283a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Oi oi = this.f7284b;
        if (oi != null) {
            codedOutputByteBufferNano.writeMessage(2, oi);
        }
        Ni ni = this.f7285c;
        if (ni != null) {
            codedOutputByteBufferNano.writeMessage(3, ni);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7283a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f7284b == null) {
                    this.f7284b = new Oi();
                }
                codedInputByteBufferNano.readMessage(this.f7284b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7285c == null) {
                    this.f7285c = new Ni();
                }
                codedInputByteBufferNano.readMessage(this.f7285c);
            }
        }
    }

    public static Pi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Pi().mergeFrom(codedInputByteBufferNano);
    }

    public static Pi a(byte[] bArr) {
        return (Pi) MessageNano.mergeFrom(new Pi(), bArr);
    }
}
