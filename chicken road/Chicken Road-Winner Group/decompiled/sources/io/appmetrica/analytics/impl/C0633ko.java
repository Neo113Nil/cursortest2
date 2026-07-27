package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633ko extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0633ko[] f7726b;

    /* renamed from: a, reason: collision with root package name */
    public C0556ho[] f7727a;

    public C0633ko() {
        a();
    }

    public static C0633ko[] b() {
        if (f7726b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7726b == null) {
                        f7726b = new C0633ko[0];
                    }
                } finally {
                }
            }
        }
        return f7726b;
    }

    public final C0633ko a() {
        this.f7727a = C0556ho.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0556ho[] c0556hoArr = this.f7727a;
        if (c0556hoArr != null && c0556hoArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0556ho[] c0556hoArr2 = this.f7727a;
                if (i3 >= c0556hoArr2.length) {
                    break;
                }
                C0556ho c0556ho = c0556hoArr2[i3];
                if (c0556ho != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0556ho) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0556ho[] c0556hoArr = this.f7727a;
        if (c0556hoArr != null && c0556hoArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0556ho[] c0556hoArr2 = this.f7727a;
                if (i3 >= c0556hoArr2.length) {
                    break;
                }
                C0556ho c0556ho = c0556hoArr2[i3];
                if (c0556ho != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0556ho);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0633ko mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C0556ho[] c0556hoArr = this.f7727a;
                int length = c0556hoArr == null ? 0 : c0556hoArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0556ho[] c0556hoArr2 = new C0556ho[i3];
                if (length != 0) {
                    System.arraycopy(c0556hoArr, 0, c0556hoArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0556ho c0556ho = new C0556ho();
                    c0556hoArr2[length] = c0556ho;
                    codedInputByteBufferNano.readMessage(c0556ho);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0556ho c0556ho2 = new C0556ho();
                c0556hoArr2[length] = c0556ho2;
                codedInputByteBufferNano.readMessage(c0556ho2);
                this.f7727a = c0556hoArr2;
            }
        }
        return this;
    }

    public static C0633ko b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0633ko().mergeFrom(codedInputByteBufferNano);
    }

    public static C0633ko a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0633ko) MessageNano.mergeFrom(new C0633ko(), bArr);
    }
}
