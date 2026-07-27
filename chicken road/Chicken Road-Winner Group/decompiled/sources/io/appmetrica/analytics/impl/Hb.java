package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Hb extends MessageNano {
    public static volatile Hb[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f6022a;

    /* renamed from: b, reason: collision with root package name */
    public String f6023b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6024c;

    /* renamed from: d, reason: collision with root package name */
    public String f6025d;

    /* renamed from: e, reason: collision with root package name */
    public String f6026e;

    public Hb() {
        a();
    }

    public static Hb[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new Hb[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final Hb a() {
        this.f6022a = "";
        this.f6023b = "";
        this.f6024c = false;
        this.f6025d = "";
        this.f6026e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6022a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6022a);
        }
        if (!this.f6023b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f6023b);
        }
        boolean z3 = this.f6024c;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z3);
        }
        if (!this.f6025d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f6025d);
        }
        return !this.f6026e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f6026e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6022a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6022a);
        }
        if (!this.f6023b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f6023b);
        }
        boolean z3 = this.f6024c;
        if (z3) {
            codedOutputByteBufferNano.writeBool(22, z3);
        }
        if (!this.f6025d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f6025d);
        }
        if (!this.f6026e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f6026e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Hb b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6022a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f6023b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f6024c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f6025d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6026e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Hb a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hb) MessageNano.mergeFrom(new Hb(), bArr);
    }
}
