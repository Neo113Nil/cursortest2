package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805rf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0805rf[] f8225d;

    /* renamed from: a, reason: collision with root package name */
    public String f8226a;

    /* renamed from: b, reason: collision with root package name */
    public String f8227b;

    /* renamed from: c, reason: collision with root package name */
    public int f8228c;

    public C0805rf() {
        a();
    }

    public static C0805rf[] b() {
        if (f8225d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8225d == null) {
                        f8225d = new C0805rf[0];
                    }
                } finally {
                }
            }
        }
        return f8225d;
    }

    public final C0805rf a() {
        this.f8226a = "";
        this.f8227b = "";
        this.f8228c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8226a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8226a);
        }
        if (!this.f8227b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8227b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f8228c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8226a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8226a);
        }
        if (!this.f8227b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8227b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f8228c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0805rf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8226a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8227b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8228c = readInt32;
                }
            }
        }
        return this;
    }

    public static C0805rf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0805rf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0805rf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0805rf) MessageNano.mergeFrom(new C0805rf(), bArr);
    }
}
