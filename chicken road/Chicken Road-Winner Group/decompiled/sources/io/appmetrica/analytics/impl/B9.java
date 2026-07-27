package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class B9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile B9[] f5759e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5760a;

    /* renamed from: b, reason: collision with root package name */
    public int f5761b;

    /* renamed from: c, reason: collision with root package name */
    public int f5762c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5763d;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f5759e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5759e == null) {
                        f5759e = new B9[0];
                    }
                } finally {
                }
            }
        }
        return f5759e;
    }

    public final B9 a() {
        this.f5760a = false;
        this.f5761b = 0;
        this.f5762c = 0;
        this.f5763d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f5762c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f5761b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f5760a) + super.computeSerializedSize();
        int[] iArr = this.f5763d;
        if (iArr == null || iArr.length <= 0) {
            return computeUInt32Size;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f5763d;
            if (i3 >= iArr2.length) {
                return computeUInt32Size + i4 + iArr2.length;
            }
            i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i3]);
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f5760a);
        codedOutputByteBufferNano.writeUInt32(2, this.f5761b);
        codedOutputByteBufferNano.writeUInt32(3, this.f5762c);
        int[] iArr = this.f5763d;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f5763d;
                if (i3 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i3]);
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f5760a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f5761b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f5762c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f5763d;
                int length = iArr == null ? 0 : iArr.length;
                int i3 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i3];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i3 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f5763d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i4 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i4++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f5763d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i5 = i4 + length2;
                int[] iArr4 = new int[i5];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i5) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f5763d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
        return this;
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
