package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721o8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0721o8[] f7980c;

    /* renamed from: a, reason: collision with root package name */
    public int f7981a;

    /* renamed from: b, reason: collision with root package name */
    public C0617k8 f7982b;

    public C0721o8() {
        a();
    }

    public static C0721o8[] b() {
        if (f7980c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7980c == null) {
                        f7980c = new C0721o8[0];
                    }
                } finally {
                }
            }
        }
        return f7980c;
    }

    public final C0721o8 a() {
        this.f7981a = 0;
        this.f7982b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7981a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        C0617k8 c0617k8 = this.f7982b;
        return c0617k8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0617k8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7981a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        C0617k8 c0617k8 = this.f7982b;
        if (c0617k8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0617k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0721o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7981a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7982b == null) {
                    this.f7982b = new C0617k8();
                }
                codedInputByteBufferNano.readMessage(this.f7982b);
            }
        }
        return this;
    }

    public static C0721o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0721o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0721o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0721o8) MessageNano.mergeFrom(new C0721o8(), bArr);
    }
}
