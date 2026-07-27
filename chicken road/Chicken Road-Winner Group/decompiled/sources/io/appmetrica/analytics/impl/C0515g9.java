package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515g9 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f7352j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7353k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7354l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C0515g9[] f7355m;

    /* renamed from: a, reason: collision with root package name */
    public double f7356a;

    /* renamed from: b, reason: collision with root package name */
    public double f7357b;

    /* renamed from: c, reason: collision with root package name */
    public long f7358c;

    /* renamed from: d, reason: collision with root package name */
    public int f7359d;

    /* renamed from: e, reason: collision with root package name */
    public int f7360e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f7361g;

    /* renamed from: h, reason: collision with root package name */
    public int f7362h;

    /* renamed from: i, reason: collision with root package name */
    public String f7363i;

    public C0515g9() {
        a();
    }

    public static C0515g9[] b() {
        if (f7355m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7355m == null) {
                        f7355m = new C0515g9[0];
                    }
                } finally {
                }
            }
        }
        return f7355m;
    }

    public final C0515g9 a() {
        this.f7356a = 0.0d;
        this.f7357b = 0.0d;
        this.f7358c = 0L;
        this.f7359d = 0;
        this.f7360e = 0;
        this.f = 0;
        this.f7361g = 0;
        this.f7362h = 0;
        this.f7363i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f7357b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f7356a) + super.computeSerializedSize();
        long j3 = this.f7358c;
        if (j3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i3 = this.f7359d;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i3);
        }
        int i4 = this.f7360e;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i5);
        }
        int i6 = this.f7361g;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        int i7 = this.f7362h;
        if (i7 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i7);
        }
        return !this.f7363i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f7363i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f7356a);
        codedOutputByteBufferNano.writeDouble(2, this.f7357b);
        long j3 = this.f7358c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i3 = this.f7359d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i3);
        }
        int i4 = this.f7360e;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i5);
        }
        int i6 = this.f7361g;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        int i7 = this.f7362h;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i7);
        }
        if (!this.f7363i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f7363i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0515g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0515g9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0515g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.f7356a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f7357b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f7358c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f7359d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f7360e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f7361g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7362h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7363i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0515g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0515g9) MessageNano.mergeFrom(new C0515g9(), bArr);
    }
}
