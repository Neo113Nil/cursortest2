package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961rm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0961rm[] f9192b;

    /* renamed from: a, reason: collision with root package name */
    public C0936qm[] f9193a;

    public C0961rm() {
        a();
    }

    public static C0961rm[] b() {
        if (f9192b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9192b == null) {
                        f9192b = new C0961rm[0];
                    }
                } finally {
                }
            }
        }
        return f9192b;
    }

    public final C0961rm a() {
        this.f9193a = C0936qm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0936qm[] c0936qmArr = this.f9193a;
        if (c0936qmArr != null && c0936qmArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0936qm[] c0936qmArr2 = this.f9193a;
                if (i2 >= c0936qmArr2.length) {
                    break;
                }
                C0936qm c0936qm = c0936qmArr2[i2];
                if (c0936qm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0936qm) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0936qm[] c0936qmArr = this.f9193a;
        if (c0936qmArr != null && c0936qmArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0936qm[] c0936qmArr2 = this.f9193a;
                if (i2 >= c0936qmArr2.length) {
                    break;
                }
                C0936qm c0936qm = c0936qmArr2[i2];
                if (c0936qm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0936qm);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0961rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0936qm[] c0936qmArr = this.f9193a;
                int length = c0936qmArr == null ? 0 : c0936qmArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0936qm[] c0936qmArr2 = new C0936qm[i2];
                if (length != 0) {
                    System.arraycopy(c0936qmArr, 0, c0936qmArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0936qm c0936qm = new C0936qm();
                    c0936qmArr2[length] = c0936qm;
                    codedInputByteBufferNano.readMessage(c0936qm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0936qm c0936qm2 = new C0936qm();
                c0936qmArr2[length] = c0936qm2;
                codedInputByteBufferNano.readMessage(c0936qm2);
                this.f9193a = c0936qmArr2;
            }
        }
    }

    public static C0961rm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0961rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0961rm a(byte[] bArr) {
        return (C0961rm) MessageNano.mergeFrom(new C0961rm(), bArr);
    }
}
