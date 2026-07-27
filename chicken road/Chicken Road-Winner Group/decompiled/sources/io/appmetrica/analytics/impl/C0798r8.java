package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798r8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0798r8[] f8202c;

    /* renamed from: a, reason: collision with root package name */
    public C0773q8[] f8203a;

    /* renamed from: b, reason: collision with root package name */
    public int f8204b;

    public C0798r8() {
        a();
    }

    public static C0798r8[] b() {
        if (f8202c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8202c == null) {
                        f8202c = new C0798r8[0];
                    }
                } finally {
                }
            }
        }
        return f8202c;
    }

    public final C0798r8 a() {
        this.f8203a = C0773q8.b();
        this.f8204b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0773q8[] c0773q8Arr = this.f8203a;
        if (c0773q8Arr != null && c0773q8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0773q8[] c0773q8Arr2 = this.f8203a;
                if (i3 >= c0773q8Arr2.length) {
                    break;
                }
                C0773q8 c0773q8 = c0773q8Arr2[i3];
                if (c0773q8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0773q8) + computeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f8204b;
        return i4 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0773q8[] c0773q8Arr = this.f8203a;
        if (c0773q8Arr != null && c0773q8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0773q8[] c0773q8Arr2 = this.f8203a;
                if (i3 >= c0773q8Arr2.length) {
                    break;
                }
                C0773q8 c0773q8 = c0773q8Arr2[i3];
                if (c0773q8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0773q8);
                }
                i3++;
            }
        }
        int i4 = this.f8204b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0798r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0773q8[] c0773q8Arr = this.f8203a;
                int length = c0773q8Arr == null ? 0 : c0773q8Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0773q8[] c0773q8Arr2 = new C0773q8[i3];
                if (length != 0) {
                    System.arraycopy(c0773q8Arr, 0, c0773q8Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0773q8 c0773q8 = new C0773q8();
                    c0773q8Arr2[length] = c0773q8;
                    codedInputByteBufferNano.readMessage(c0773q8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0773q8 c0773q82 = new C0773q8();
                c0773q8Arr2[length] = c0773q82;
                codedInputByteBufferNano.readMessage(c0773q82);
                this.f8203a = c0773q8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8204b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0798r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0798r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0798r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0798r8) MessageNano.mergeFrom(new C0798r8(), bArr);
    }
}
