package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Pk extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Pk[] f7288b;

    /* renamed from: a, reason: collision with root package name */
    public Qk[] f7289a;

    public Pk() {
        a();
    }

    public static Pk[] b() {
        if (f7288b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7288b == null) {
                        f7288b = new Pk[0];
                    }
                } finally {
                }
            }
        }
        return f7288b;
    }

    public final Pk a() {
        this.f7289a = Qk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Qk[] qkArr = this.f7289a;
        if (qkArr != null && qkArr.length > 0) {
            int i2 = 0;
            while (true) {
                Qk[] qkArr2 = this.f7289a;
                if (i2 >= qkArr2.length) {
                    break;
                }
                Qk qk = qkArr2[i2];
                if (qk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, qk) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Qk[] qkArr = this.f7289a;
        if (qkArr != null && qkArr.length > 0) {
            int i2 = 0;
            while (true) {
                Qk[] qkArr2 = this.f7289a;
                if (i2 >= qkArr2.length) {
                    break;
                }
                Qk qk = qkArr2[i2];
                if (qk != null) {
                    codedOutputByteBufferNano.writeMessage(1, qk);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                Qk[] qkArr = this.f7289a;
                int length = qkArr == null ? 0 : qkArr.length;
                int i2 = repeatedFieldArrayLength + length;
                Qk[] qkArr2 = new Qk[i2];
                if (length != 0) {
                    System.arraycopy(qkArr, 0, qkArr2, 0, length);
                }
                while (length < i2 - 1) {
                    Qk qk = new Qk();
                    qkArr2[length] = qk;
                    codedInputByteBufferNano.readMessage(qk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Qk qk2 = new Qk();
                qkArr2[length] = qk2;
                codedInputByteBufferNano.readMessage(qk2);
                this.f7289a = qkArr2;
            }
        }
    }

    public static Pk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Pk().mergeFrom(codedInputByteBufferNano);
    }

    public static Pk a(byte[] bArr) {
        return (Pk) MessageNano.mergeFrom(new Pk(), bArr);
    }
}
