package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740u9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0740u9[] f6899e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6900a;

    /* renamed from: b, reason: collision with root package name */
    public int f6901b;

    /* renamed from: c, reason: collision with root package name */
    public int f6902c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f6903d;

    public C0740u9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0740u9[] b() {
        if (f6899e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6899e == null) {
                        f6899e = new io.appmetrica.analytics.impl.C0740u9[0];
                    }
                } finally {
                }
            }
        }
        return f6899e;
    }

    public final io.appmetrica.analytics.impl.C0740u9 a() {
        this.f6900a = false;
        this.f6901b = 0;
        this.f6902c = 0;
        this.f6903d = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(3, this.f6902c) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(2, this.f6901b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, this.f6900a) + super.computeSerializedSize();
        int[] iArr = this.f6903d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f6903d;
            if (i2 >= iArr2.length) {
                return computeUInt32Size + i3 + iArr2.length;
            }
            i3 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i2]);
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f6900a);
        codedOutputByteBufferNano.writeUInt32(2, this.f6901b);
        codedOutputByteBufferNano.writeUInt32(3, this.f6902c);
        int[] iArr = this.f6903d;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f6903d;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i2]);
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0740u9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6900a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f6901b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f6902c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f6903d;
                int length = iArr == null ? 0 : iArr.length;
                int i2 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i2 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f6903d = iArr2;
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i3 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i3++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f6903d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i4 = i3 + length2;
                int[] iArr4 = new int[i4];
                if (length2 != 0) {
                    java.lang.System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i4) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f6903d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0740u9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0740u9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0740u9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0740u9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0740u9(), bArr);
    }
}
