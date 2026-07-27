package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile m[] f6424h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6425a;

    /* renamed from: b, reason: collision with root package name */
    public l f6426b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6427c;

    /* renamed from: d, reason: collision with root package name */
    public k[] f6428d;

    /* renamed from: e, reason: collision with root package name */
    public long f6429e;

    /* renamed from: f, reason: collision with root package name */
    public long f6430f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f6431g;

    public m() {
        a();
    }

    public static m[] b() {
        if (f6424h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6424h == null) {
                        f6424h = new m[0];
                    }
                } finally {
                }
            }
        }
        return f6424h;
    }

    public final m a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6425a = bArr;
        this.f6426b = null;
        this.f6427c = bArr;
        this.f6428d = k.b();
        this.f6429e = 86400000L;
        this.f6430f = 3600000L;
        this.f6431g = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6425a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6425a);
        }
        l lVar = this.f6426b;
        if (lVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, lVar);
        }
        if (!Arrays.equals(this.f6427c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f6427c);
        }
        k[] kVarArr = this.f6428d;
        int i2 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                k[] kVarArr2 = this.f6428d;
                if (i3 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i3];
                if (kVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, kVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        long j2 = this.f6429e;
        if (j2 != 86400000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j2);
        }
        long j6 = this.f6430f;
        if (j6 != 3600000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j6);
        }
        int[] iArr = this.f6431g;
        if (iArr == null || iArr.length <= 0) {
            return computeSerializedSize;
        }
        int i6 = 0;
        while (true) {
            int[] iArr2 = this.f6431g;
            if (i2 >= iArr2.length) {
                return computeSerializedSize + i6 + iArr2.length;
            }
            i6 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr2[i2]);
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6425a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6425a);
        }
        l lVar = this.f6426b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        if (!Arrays.equals(this.f6427c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f6427c);
        }
        k[] kVarArr = this.f6428d;
        int i2 = 0;
        if (kVarArr != null && kVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                k[] kVarArr2 = this.f6428d;
                if (i3 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i3];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, kVar);
                }
                i3++;
            }
        }
        long j2 = this.f6429e;
        if (j2 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        long j6 = this.f6430f;
        if (j6 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j6);
        }
        int[] iArr = this.f6431g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f6431g;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i2]);
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6425a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f6426b == null) {
                    this.f6426b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f6426b);
            } else if (readTag == 26) {
                this.f6427c = codedInputByteBufferNano.readBytes();
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                k[] kVarArr = this.f6428d;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i2];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f6428d = kVarArr2;
            } else if (readTag == 40) {
                this.f6429e = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 48) {
                this.f6430f = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 56) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                int[] iArr = this.f6431g;
                int length2 = iArr == null ? 0 : iArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                int[] iArr2 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                iArr2[length2] = codedInputByteBufferNano.readUInt32();
                this.f6431g = iArr2;
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i6 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readUInt32();
                    i6++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f6431g;
                int length3 = iArr3 == null ? 0 : iArr3.length;
                int i7 = i6 + length3;
                int[] iArr4 = new int[i7];
                if (length3 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length3);
                }
                while (length3 < i7) {
                    iArr4[length3] = codedInputByteBufferNano.readUInt32();
                    length3++;
                }
                this.f6431g = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
    }

    public static m a(byte[] bArr) {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
