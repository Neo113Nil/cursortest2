package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367ag extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6989e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6990g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0367ag[] f6991h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6992a;

    /* renamed from: b, reason: collision with root package name */
    public long f6993b;

    /* renamed from: c, reason: collision with root package name */
    public long f6994c;

    /* renamed from: d, reason: collision with root package name */
    public int f6995d;

    public C0367ag() {
        a();
    }

    public static C0367ag[] b() {
        if (f6991h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6991h == null) {
                        f6991h = new C0367ag[0];
                    }
                } finally {
                }
            }
        }
        return f6991h;
    }

    public final C0367ag a() {
        this.f6992a = WireFormatNano.EMPTY_BYTES;
        this.f6993b = 0L;
        this.f6994c = 0L;
        this.f6995d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f6992a) + super.computeSerializedSize();
        long j3 = this.f6993b;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
        }
        long j4 = this.f6994c;
        if (j4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i3 = this.f6995d;
        return i3 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i3) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f6992a);
        long j3 = this.f6993b;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j3);
        }
        long j4 = this.f6994c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i3 = this.f6995d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0367ag mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6992a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f6993b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f6994c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6995d = readInt32;
                }
            }
        }
        return this;
    }

    public static C0367ag b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0367ag().mergeFrom(codedInputByteBufferNano);
    }

    public static C0367ag a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0367ag) MessageNano.mergeFrom(new C0367ag(), bArr);
    }
}
