package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566i8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0566i8[] f7487c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7488a;

    /* renamed from: b, reason: collision with root package name */
    public C0669m8 f7489b;

    public C0566i8() {
        a();
    }

    public static C0566i8[] b() {
        if (f7487c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7487c == null) {
                        f7487c = new C0566i8[0];
                    }
                } finally {
                }
            }
        }
        return f7487c;
    }

    public final C0566i8 a() {
        this.f7488a = WireFormatNano.EMPTY_BYTES;
        this.f7489b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7488a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7488a);
        }
        C0669m8 c0669m8 = this.f7489b;
        return c0669m8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0669m8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7488a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7488a);
        }
        C0669m8 c0669m8 = this.f7489b;
        if (c0669m8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0669m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0566i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7488a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7489b == null) {
                    this.f7489b = new C0669m8();
                }
                codedInputByteBufferNano.readMessage(this.f7489b);
            }
        }
        return this;
    }

    public static C0566i8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0566i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0566i8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0566i8) MessageNano.mergeFrom(new C0566i8(), bArr);
    }
}
