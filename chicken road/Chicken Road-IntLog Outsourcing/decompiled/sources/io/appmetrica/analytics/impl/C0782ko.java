package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782ko extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0782ko[] f8647b;

    /* renamed from: a, reason: collision with root package name */
    public C0705ho[] f8648a;

    public C0782ko() {
        a();
    }

    public static C0782ko[] b() {
        if (f8647b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8647b == null) {
                        f8647b = new C0782ko[0];
                    }
                } finally {
                }
            }
        }
        return f8647b;
    }

    public final C0782ko a() {
        this.f8648a = C0705ho.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0705ho[] c0705hoArr = this.f8648a;
        if (c0705hoArr != null && c0705hoArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0705ho[] c0705hoArr2 = this.f8648a;
                if (i2 >= c0705hoArr2.length) {
                    break;
                }
                C0705ho c0705ho = c0705hoArr2[i2];
                if (c0705ho != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0705ho) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0705ho[] c0705hoArr = this.f8648a;
        if (c0705hoArr != null && c0705hoArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0705ho[] c0705hoArr2 = this.f8648a;
                if (i2 >= c0705hoArr2.length) {
                    break;
                }
                C0705ho c0705ho = c0705hoArr2[i2];
                if (c0705ho != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0705ho);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0782ko mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C0705ho[] c0705hoArr = this.f8648a;
                int length = c0705hoArr == null ? 0 : c0705hoArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0705ho[] c0705hoArr2 = new C0705ho[i2];
                if (length != 0) {
                    System.arraycopy(c0705hoArr, 0, c0705hoArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0705ho c0705ho = new C0705ho();
                    c0705hoArr2[length] = c0705ho;
                    codedInputByteBufferNano.readMessage(c0705ho);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0705ho c0705ho2 = new C0705ho();
                c0705hoArr2[length] = c0705ho2;
                codedInputByteBufferNano.readMessage(c0705ho2);
                this.f8648a = c0705hoArr2;
            }
        }
    }

    public static C0782ko b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0782ko().mergeFrom(codedInputByteBufferNano);
    }

    public static C0782ko a(byte[] bArr) {
        return (C0782ko) MessageNano.mergeFrom(new C0782ko(), bArr);
    }
}
