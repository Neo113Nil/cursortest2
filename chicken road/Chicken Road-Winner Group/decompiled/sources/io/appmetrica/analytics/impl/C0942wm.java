package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942wm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0942wm[] f8593c;

    /* renamed from: a, reason: collision with root package name */
    public String f8594a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8595b;

    public C0942wm() {
        a();
    }

    public static C0942wm[] b() {
        if (f8593c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8593c == null) {
                        f8593c = new C0942wm[0];
                    }
                } finally {
                }
            }
        }
        return f8593c;
    }

    public final C0942wm a() {
        this.f8594a = "";
        this.f8595b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8594a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8594a);
        }
        return !Arrays.equals(this.f8595b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f8595b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8594a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8594a);
        }
        if (!Arrays.equals(this.f8595b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8595b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0942wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8594a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8595b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0942wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0942wm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0942wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0942wm) MessageNano.mergeFrom(new C0942wm(), bArr);
    }
}
