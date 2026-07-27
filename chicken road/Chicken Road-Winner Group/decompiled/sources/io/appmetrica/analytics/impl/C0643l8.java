package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643l8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0643l8[] f7755b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f7756a;

    public C0643l8() {
        a();
    }

    public static C0643l8[] b() {
        if (f7755b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7755b == null) {
                        f7755b = new C0643l8[0];
                    }
                } finally {
                }
            }
        }
        return f7755b;
    }

    public final C0643l8 a() {
        this.f7756a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f7756a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[][] bArr2 = this.f7756a;
            if (i3 >= bArr2.length) {
                return computeSerializedSize + i4 + i5;
            }
            byte[] bArr3 = bArr2[i3];
            if (bArr3 != null) {
                i5++;
                i4 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i4;
            }
            i3++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f7756a;
        if (bArr != null && bArr.length > 0) {
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f7756a;
                if (i3 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i3];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0643l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f7756a;
                int length = bArr == null ? 0 : bArr.length;
                int i3 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i3][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i3 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f7756a = bArr2;
            }
        }
        return this;
    }

    public static C0643l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0643l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0643l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0643l8) MessageNano.mergeFrom(new C0643l8(), bArr);
    }
}
