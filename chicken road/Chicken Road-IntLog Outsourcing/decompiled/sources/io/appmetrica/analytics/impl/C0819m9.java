package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819m9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8777d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8778e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8779f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0819m9[] f8780g;

    /* renamed from: a, reason: collision with root package name */
    public C0897p9 f8781a;

    /* renamed from: b, reason: collision with root package name */
    public String f8782b;

    /* renamed from: c, reason: collision with root package name */
    public int f8783c;

    public C0819m9() {
        a();
    }

    public static C0819m9[] b() {
        if (f8780g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8780g == null) {
                        f8780g = new C0819m9[0];
                    }
                } finally {
                }
            }
        }
        return f8780g;
    }

    public final C0819m9 a() {
        this.f8781a = null;
        this.f8782b = "";
        this.f8783c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0897p9 c0897p9 = this.f8781a;
        if (c0897p9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0897p9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f8782b) + computeSerializedSize;
        int i2 = this.f8783c;
        return i2 != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i2) : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0897p9 c0897p9 = this.f8781a;
        if (c0897p9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0897p9);
        }
        codedOutputByteBufferNano.writeString(2, this.f8782b);
        int i2 = this.f8783c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0819m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f8781a == null) {
                    this.f8781a = new C0897p9();
                }
                codedInputByteBufferNano.readMessage(this.f8781a);
            } else if (readTag == 18) {
                this.f8782b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f8783c = readInt32;
                }
            }
        }
    }

    public static C0819m9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0819m9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0819m9 a(byte[] bArr) {
        return (C0819m9) MessageNano.mergeFrom(new C0819m9(), bArr);
    }
}
