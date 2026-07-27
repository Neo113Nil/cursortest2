package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748p9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0748p9[] f8060e;

    /* renamed from: a, reason: collision with root package name */
    public long f8061a;

    /* renamed from: b, reason: collision with root package name */
    public int f8062b;

    /* renamed from: c, reason: collision with root package name */
    public long f8063c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8064d;

    public C0748p9() {
        a();
    }

    public static C0748p9[] b() {
        if (f8060e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8060e == null) {
                        f8060e = new C0748p9[0];
                    }
                } finally {
                }
            }
        }
        return f8060e;
    }

    public final C0748p9 a() {
        this.f8061a = 0L;
        this.f8062b = 0;
        this.f8063c = 0L;
        this.f8064d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f8062b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8061a) + super.computeSerializedSize();
        long j3 = this.f8063c;
        if (j3 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j3);
        }
        boolean z3 = this.f8064d;
        return z3 ? CodedOutputByteBufferNano.computeBoolSize(4, z3) + computeSInt32Size : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f8061a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8062b);
        long j3 = this.f8063c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j3);
        }
        boolean z3 = this.f8064d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0748p9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8061a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f8062b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f8063c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8064d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0748p9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0748p9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0748p9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0748p9) MessageNano.mergeFrom(new C0748p9(), bArr);
    }
}
