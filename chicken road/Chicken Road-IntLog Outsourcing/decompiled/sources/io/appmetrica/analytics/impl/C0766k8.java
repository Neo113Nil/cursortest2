package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766k8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0766k8[] f8606e;

    /* renamed from: a, reason: collision with root package name */
    public C0999t8 f8607a;

    /* renamed from: b, reason: collision with root package name */
    public C1051v8 f8608b;

    /* renamed from: c, reason: collision with root package name */
    public C0818m8 f8609c;

    /* renamed from: d, reason: collision with root package name */
    public C0973s8 f8610d;

    public C0766k8() {
        a();
    }

    public static C0766k8[] b() {
        if (f8606e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8606e == null) {
                        f8606e = new C0766k8[0];
                    }
                } finally {
                }
            }
        }
        return f8606e;
    }

    public final C0766k8 a() {
        this.f8607a = null;
        this.f8608b = null;
        this.f8609c = null;
        this.f8610d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0999t8 c0999t8 = this.f8607a;
        if (c0999t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0999t8);
        }
        C1051v8 c1051v8 = this.f8608b;
        if (c1051v8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c1051v8);
        }
        C0818m8 c0818m8 = this.f8609c;
        if (c0818m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0818m8);
        }
        C0973s8 c0973s8 = this.f8610d;
        return c0973s8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c0973s8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0999t8 c0999t8 = this.f8607a;
        if (c0999t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0999t8);
        }
        C1051v8 c1051v8 = this.f8608b;
        if (c1051v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1051v8);
        }
        C0818m8 c0818m8 = this.f8609c;
        if (c0818m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0818m8);
        }
        C0973s8 c0973s8 = this.f8610d;
        if (c0973s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0973s8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0766k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f8607a == null) {
                    this.f8607a = new C0999t8();
                }
                codedInputByteBufferNano.readMessage(this.f8607a);
            } else if (readTag == 18) {
                if (this.f8608b == null) {
                    this.f8608b = new C1051v8();
                }
                codedInputByteBufferNano.readMessage(this.f8608b);
            } else if (readTag == 26) {
                if (this.f8609c == null) {
                    this.f8609c = new C0818m8();
                }
                codedInputByteBufferNano.readMessage(this.f8609c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8610d == null) {
                    this.f8610d = new C0973s8();
                }
                codedInputByteBufferNano.readMessage(this.f8610d);
            }
        }
    }

    public static C0766k8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0766k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0766k8 a(byte[] bArr) {
        return (C0766k8) MessageNano.mergeFrom(new C0766k8(), bArr);
    }
}
