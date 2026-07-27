package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Qi extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7337f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7338g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7339h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Qi[] f7340i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7341a;

    /* renamed from: b, reason: collision with root package name */
    public long f7342b;

    /* renamed from: c, reason: collision with root package name */
    public int f7343c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7344d;

    /* renamed from: e, reason: collision with root package name */
    public long f7345e;

    public Qi() {
        a();
    }

    public static Qi[] b() {
        if (f7340i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7340i == null) {
                        f7340i = new Qi[0];
                    }
                } finally {
                }
            }
        }
        return f7340i;
    }

    public final Qi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7341a = bArr;
        this.f7342b = 0L;
        this.f7343c = 0;
        this.f7344d = bArr;
        this.f7345e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7341a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7341a);
        }
        long j2 = this.f7342b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f7343c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!Arrays.equals(this.f7344d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f7344d);
        }
        long j6 = this.f7345e;
        return j6 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j6) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f7341a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7341a);
        }
        long j2 = this.f7342b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f7343c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!Arrays.equals(this.f7344d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f7344d);
        }
        long j6 = this.f7345e;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Qi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Qi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7341a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f7342b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f7343c = readInt32;
                }
            } else if (readTag == 34) {
                this.f7344d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7345e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static Qi a(byte[] bArr) {
        return (Qi) MessageNano.mergeFrom(new Qi(), bArr);
    }
}
