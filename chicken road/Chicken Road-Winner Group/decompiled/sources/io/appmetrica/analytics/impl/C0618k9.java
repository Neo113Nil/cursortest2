package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618k9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0618k9[] f7692c;

    /* renamed from: a, reason: collision with root package name */
    public int f7693a;

    /* renamed from: b, reason: collision with root package name */
    public String f7694b;

    public C0618k9() {
        a();
    }

    public static C0618k9[] b() {
        if (f7692c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7692c == null) {
                        f7692c = new C0618k9[0];
                    }
                } finally {
                }
            }
        }
        return f7692c;
    }

    public final C0618k9 a() {
        this.f7693a = 2;
        this.f7694b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7693a;
        if (i3 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
        }
        return !this.f7694b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f7694b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7693a;
        if (i3 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        if (!this.f7694b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7694b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0618k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f7693a = readInt32;
                            break;
                    }
                } else if (readTag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    this.f7694b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C0618k9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0618k9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0618k9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0618k9) MessageNano.mergeFrom(new C0618k9(), bArr);
    }
}
