package io.appmetrica.analytics.impl;

import com.onesignal.session.internal.session.impl.SessionListener;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117xm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1117xm[] f9580c;

    /* renamed from: a, reason: collision with root package name */
    public long f9581a;

    /* renamed from: b, reason: collision with root package name */
    public long f9582b;

    public C1117xm() {
        a();
    }

    public static C1117xm[] b() {
        if (f9580c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9580c == null) {
                        f9580c = new C1117xm[0];
                    }
                } finally {
                }
            }
        }
        return f9580c;
    }

    public final C1117xm a() {
        this.f9581a = SessionListener.SECONDS_IN_A_DAY;
        this.f9582b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f9582b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f9581a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f9581a);
        codedOutputByteBufferNano.writeInt64(2, this.f9582b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1117xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f9581a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9582b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C1117xm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1117xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C1117xm a(byte[] bArr) {
        return (C1117xm) MessageNano.mergeFrom(new C1117xm(), bArr);
    }
}
