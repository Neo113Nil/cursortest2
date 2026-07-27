package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Pk extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Pk[] f6431b;

    /* renamed from: a, reason: collision with root package name */
    public Qk[] f6432a;

    public Pk() {
        a();
    }

    public static Pk[] b() {
        if (f6431b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6431b == null) {
                        f6431b = new Pk[0];
                    }
                } finally {
                }
            }
        }
        return f6431b;
    }

    public final Pk a() {
        this.f6432a = Qk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Qk[] qkArr = this.f6432a;
        if (qkArr != null && qkArr.length > 0) {
            int i3 = 0;
            while (true) {
                Qk[] qkArr2 = this.f6432a;
                if (i3 >= qkArr2.length) {
                    break;
                }
                Qk qk = qkArr2[i3];
                if (qk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, qk) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Qk[] qkArr = this.f6432a;
        if (qkArr != null && qkArr.length > 0) {
            int i3 = 0;
            while (true) {
                Qk[] qkArr2 = this.f6432a;
                if (i3 >= qkArr2.length) {
                    break;
                }
                Qk qk = qkArr2[i3];
                if (qk != null) {
                    codedOutputByteBufferNano.writeMessage(1, qk);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                Qk[] qkArr = this.f6432a;
                int length = qkArr == null ? 0 : qkArr.length;
                int i3 = repeatedFieldArrayLength + length;
                Qk[] qkArr2 = new Qk[i3];
                if (length != 0) {
                    System.arraycopy(qkArr, 0, qkArr2, 0, length);
                }
                while (length < i3 - 1) {
                    Qk qk = new Qk();
                    qkArr2[length] = qk;
                    codedInputByteBufferNano.readMessage(qk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Qk qk2 = new Qk();
                qkArr2[length] = qk2;
                codedInputByteBufferNano.readMessage(qk2);
                this.f6432a = qkArr2;
            }
        }
        return this;
    }

    public static Pk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Pk().mergeFrom(codedInputByteBufferNano);
    }

    public static Pk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Pk) MessageNano.mergeFrom(new Pk(), bArr);
    }
}
