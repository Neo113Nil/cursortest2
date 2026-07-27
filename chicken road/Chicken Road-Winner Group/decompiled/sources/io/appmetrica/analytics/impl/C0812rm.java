package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812rm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0812rm[] f8248b;

    /* renamed from: a, reason: collision with root package name */
    public C0787qm[] f8249a;

    public C0812rm() {
        a();
    }

    public static C0812rm[] b() {
        if (f8248b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8248b == null) {
                        f8248b = new C0812rm[0];
                    }
                } finally {
                }
            }
        }
        return f8248b;
    }

    public final C0812rm a() {
        this.f8249a = C0787qm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0787qm[] c0787qmArr = this.f8249a;
        if (c0787qmArr != null && c0787qmArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0787qm[] c0787qmArr2 = this.f8249a;
                if (i3 >= c0787qmArr2.length) {
                    break;
                }
                C0787qm c0787qm = c0787qmArr2[i3];
                if (c0787qm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0787qm) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0787qm[] c0787qmArr = this.f8249a;
        if (c0787qmArr != null && c0787qmArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0787qm[] c0787qmArr2 = this.f8249a;
                if (i3 >= c0787qmArr2.length) {
                    break;
                }
                C0787qm c0787qm = c0787qmArr2[i3];
                if (c0787qm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0787qm);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0812rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0787qm[] c0787qmArr = this.f8249a;
                int length = c0787qmArr == null ? 0 : c0787qmArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0787qm[] c0787qmArr2 = new C0787qm[i3];
                if (length != 0) {
                    System.arraycopy(c0787qmArr, 0, c0787qmArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0787qm c0787qm = new C0787qm();
                    c0787qmArr2[length] = c0787qm;
                    codedInputByteBufferNano.readMessage(c0787qm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0787qm c0787qm2 = new C0787qm();
                c0787qmArr2[length] = c0787qm2;
                codedInputByteBufferNano.readMessage(c0787qm2);
                this.f8249a = c0787qmArr2;
            }
        }
        return this;
    }

    public static C0812rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0812rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0812rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0812rm) MessageNano.mergeFrom(new C0812rm(), bArr);
    }
}
