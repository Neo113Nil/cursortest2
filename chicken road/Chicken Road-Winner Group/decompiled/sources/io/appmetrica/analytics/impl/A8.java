package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class A8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f5678g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5679h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5680i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5681j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5682k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5683l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5684m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5685n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile A8[] f5686o;

    /* renamed from: a, reason: collision with root package name */
    public int f5687a;

    /* renamed from: b, reason: collision with root package name */
    public C1004z8 f5688b;

    /* renamed from: c, reason: collision with root package name */
    public C0954x8 f5689c;

    /* renamed from: d, reason: collision with root package name */
    public C0979y8 f5690d;

    /* renamed from: e, reason: collision with root package name */
    public C0591j8 f5691e;
    public C0747p8 f;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (f5686o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5686o == null) {
                        f5686o = new A8[0];
                    }
                } finally {
                }
            }
        }
        return f5686o;
    }

    public final A8 a() {
        this.f5687a = 0;
        this.f5688b = null;
        this.f5689c = null;
        this.f5690d = null;
        this.f5691e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5687a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i3);
        }
        C1004z8 c1004z8 = this.f5688b;
        if (c1004z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1004z8);
        }
        C0954x8 c0954x8 = this.f5689c;
        if (c0954x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0954x8);
        }
        C0979y8 c0979y8 = this.f5690d;
        if (c0979y8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0979y8);
        }
        C0591j8 c0591j8 = this.f5691e;
        if (c0591j8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0591j8);
        }
        C0747p8 c0747p8 = this.f;
        return c0747p8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0747p8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5687a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i3);
        }
        C1004z8 c1004z8 = this.f5688b;
        if (c1004z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1004z8);
        }
        C0954x8 c0954x8 = this.f5689c;
        if (c0954x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0954x8);
        }
        C0979y8 c0979y8 = this.f5690d;
        if (c0979y8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0979y8);
        }
        C0591j8 c0591j8 = this.f5691e;
        if (c0591j8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0591j8);
        }
        C0747p8 c0747p8 = this.f;
        if (c0747p8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0747p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f5687a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f5688b == null) {
                        this.f5688b = new C1004z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5688b);
                } else if (readTag == 26) {
                    if (this.f5689c == null) {
                        this.f5689c = new C0954x8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5689c);
                } else if (readTag == 34) {
                    if (this.f5690d == null) {
                        this.f5690d = new C0979y8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5690d);
                } else if (readTag == 42) {
                    if (this.f5691e == null) {
                        this.f5691e = new C0591j8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5691e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f == null) {
                        this.f = new C0747p8();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                }
            }
        }
        return this;
    }

    public static A8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}
