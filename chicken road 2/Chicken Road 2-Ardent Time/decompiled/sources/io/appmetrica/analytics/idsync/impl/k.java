package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class k extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.idsync.impl.k[] f3935j;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3936a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.idsync.impl.j f3937b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3938c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.idsync.impl.i[] f3939d;

    /* renamed from: e, reason: collision with root package name */
    public long f3940e;

    /* renamed from: f, reason: collision with root package name */
    public long f3941f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3942g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3943h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f3944i;

    public k() {
        a();
    }

    public static io.appmetrica.analytics.idsync.impl.k[] b() {
        if (f3935j == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3935j == null) {
                        f3935j = new io.appmetrica.analytics.idsync.impl.k[0];
                    }
                } finally {
                }
            }
        }
        return f3935j;
    }

    public final io.appmetrica.analytics.idsync.impl.k a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f3936a = bArr;
        this.f3937b = null;
        this.f3938c = bArr;
        this.f3939d = io.appmetrica.analytics.idsync.impl.i.b();
        this.f3940e = 86400000L;
        this.f3941f = 3600000L;
        this.f3942g = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_INT_ARRAY;
        this.f3943h = true;
        this.f3944i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f3936a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f3936a);
        }
        io.appmetrica.analytics.idsync.impl.j jVar = this.f3937b;
        if (jVar != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, jVar);
        }
        if (!java.util.Arrays.equals(this.f3938c, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(3, this.f3938c);
        }
        io.appmetrica.analytics.idsync.impl.i[] iVarArr = this.f3939d;
        int i2 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.idsync.impl.i[] iVarArr2 = this.f3939d;
                if (i3 >= iVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.idsync.impl.i iVar = iVarArr2[i3];
                if (iVar != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, iVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        long j2 = this.f3940e;
        if (j2 != 86400000) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(5, j2);
        }
        long j3 = this.f3941f;
        if (j3 != 3600000) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(6, j3);
        }
        int[] iArr2 = this.f3942g;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f3942g;
                if (i2 >= iArr.length) {
                    break;
                }
                i4 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr[i2]);
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i4 + iArr.length;
        }
        boolean z2 = this.f3943h;
        if (!z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        return !this.f3944i.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(9, this.f3944i) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f3936a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f3936a);
        }
        io.appmetrica.analytics.idsync.impl.j jVar = this.f3937b;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(2, jVar);
        }
        if (!java.util.Arrays.equals(this.f3938c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f3938c);
        }
        io.appmetrica.analytics.idsync.impl.i[] iVarArr = this.f3939d;
        int i2 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.idsync.impl.i[] iVarArr2 = this.f3939d;
                if (i3 >= iVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.idsync.impl.i iVar = iVarArr2[i3];
                if (iVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, iVar);
                }
                i3++;
            }
        }
        long j2 = this.f3940e;
        if (j2 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        long j3 = this.f3941f;
        if (j3 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j3);
        }
        int[] iArr = this.f3942g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f3942g;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i2]);
                i2++;
            }
        }
        boolean z2 = this.f3943h;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        if (!this.f3944i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f3944i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.idsync.impl.k b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.idsync.impl.k().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.k mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f3936a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f3937b == null) {
                        this.f3937b = new io.appmetrica.analytics.idsync.impl.j();
                    }
                    codedInputByteBufferNano.readMessage(this.f3937b);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f3938c = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    io.appmetrica.analytics.idsync.impl.i[] iVarArr = this.f3939d;
                    int length = iVarArr == null ? 0 : iVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    io.appmetrica.analytics.idsync.impl.i[] iVarArr2 = new io.appmetrica.analytics.idsync.impl.i[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        io.appmetrica.analytics.idsync.impl.i iVar = new io.appmetrica.analytics.idsync.impl.i();
                        iVarArr2[length] = iVar;
                        codedInputByteBufferNano.readMessage(iVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    io.appmetrica.analytics.idsync.impl.i iVar2 = new io.appmetrica.analytics.idsync.impl.i();
                    iVarArr2[length] = iVar2;
                    codedInputByteBufferNano.readMessage(iVar2);
                    this.f3939d = iVarArr2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                    this.f3940e = codedInputByteBufferNano.readUInt64();
                    break;
                case 48:
                    this.f3941f = codedInputByteBufferNano.readUInt64();
                    break;
                case 56:
                    int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                    int[] iArr = this.f3942g;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    int[] iArr2 = new int[i3];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        iArr2[length2] = codedInputByteBufferNano.readUInt32();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    this.f3942g = iArr2;
                    break;
                case 58:
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i4 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readUInt32();
                        i4++;
                    }
                    codedInputByteBufferNano.rewindToPosition(position);
                    int[] iArr3 = this.f3942g;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i5 = i4 + length3;
                    int[] iArr4 = new int[i5];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i5) {
                        iArr4[length3] = codedInputByteBufferNano.readUInt32();
                        length3++;
                    }
                    this.f3942g = iArr4;
                    codedInputByteBufferNano.popLimit(pushLimit);
                    break;
                case 64:
                    this.f3943h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.f3944i = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.idsync.impl.k a(byte[] bArr) {
        return (io.appmetrica.analytics.idsync.impl.k) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.idsync.impl.k(), bArr);
    }
}
