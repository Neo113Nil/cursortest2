package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968xm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0968xm[] f8621c;

    /* renamed from: a, reason: collision with root package name */
    public long f8622a;

    /* renamed from: b, reason: collision with root package name */
    public long f8623b;

    public C0968xm() {
        a();
    }

    public static C0968xm[] b() {
        if (f8621c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8621c == null) {
                        f8621c = new C0968xm[0];
                    }
                } finally {
                }
            }
        }
        return f8621c;
    }

    public final C0968xm a() {
        this.f8622a = 86400L;
        this.f8623b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f8623b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f8622a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f8622a);
        codedOutputByteBufferNano.writeInt64(2, this.f8623b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0968xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8622a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8623b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0968xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0968xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0968xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0968xm) MessageNano.mergeFrom(new C0968xm(), bArr);
    }
}
