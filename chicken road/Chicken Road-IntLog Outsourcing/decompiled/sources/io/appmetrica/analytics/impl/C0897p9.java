package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897p9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0897p9[] f8996e;

    /* renamed from: a, reason: collision with root package name */
    public long f8997a;

    /* renamed from: b, reason: collision with root package name */
    public int f8998b;

    /* renamed from: c, reason: collision with root package name */
    public long f8999c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9000d;

    public C0897p9() {
        a();
    }

    public static C0897p9[] b() {
        if (f8996e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8996e == null) {
                        f8996e = new C0897p9[0];
                    }
                } finally {
                }
            }
        }
        return f8996e;
    }

    public final C0897p9 a() {
        this.f8997a = 0L;
        this.f8998b = 0;
        this.f8999c = 0L;
        this.f9000d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f8998b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8997a) + super.computeSerializedSize();
        long j2 = this.f8999c;
        if (j2 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j2);
        }
        boolean z = this.f9000d;
        return z ? computeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f8997a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8998b);
        long j2 = this.f8999c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j2);
        }
        boolean z = this.f9000d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0897p9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f8997a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f8998b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f8999c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9000d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0897p9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0897p9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0897p9 a(byte[] bArr) {
        return (C0897p9) MessageNano.mergeFrom(new C0897p9(), bArr);
    }
}
