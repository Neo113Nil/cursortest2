package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993ym extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0993ym[] f8644b;

    /* renamed from: a, reason: collision with root package name */
    public int f8645a;

    public C0993ym() {
        a();
    }

    public static C0993ym[] b() {
        if (f8644b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8644b == null) {
                        f8644b = new C0993ym[0];
                    }
                } finally {
                }
            }
        }
        return f8644b;
    }

    public final C0993ym a() {
        this.f8645a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f8645a;
        return i3 != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f8645a;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0993ym mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8645a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0993ym a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0993ym) MessageNano.mergeFrom(new C0993ym(), bArr);
    }

    public static C0993ym b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0993ym().mergeFrom(codedInputByteBufferNano);
    }
}
