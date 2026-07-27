package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617k8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0617k8[] f7687e;

    /* renamed from: a, reason: collision with root package name */
    public C0850t8 f7688a;

    /* renamed from: b, reason: collision with root package name */
    public C0902v8 f7689b;

    /* renamed from: c, reason: collision with root package name */
    public C0669m8 f7690c;

    /* renamed from: d, reason: collision with root package name */
    public C0824s8 f7691d;

    public C0617k8() {
        a();
    }

    public static C0617k8[] b() {
        if (f7687e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7687e == null) {
                        f7687e = new C0617k8[0];
                    }
                } finally {
                }
            }
        }
        return f7687e;
    }

    public final C0617k8 a() {
        this.f7688a = null;
        this.f7689b = null;
        this.f7690c = null;
        this.f7691d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0850t8 c0850t8 = this.f7688a;
        if (c0850t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0850t8);
        }
        C0902v8 c0902v8 = this.f7689b;
        if (c0902v8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0902v8);
        }
        C0669m8 c0669m8 = this.f7690c;
        if (c0669m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0669m8);
        }
        C0824s8 c0824s8 = this.f7691d;
        return c0824s8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0824s8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0850t8 c0850t8 = this.f7688a;
        if (c0850t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0850t8);
        }
        C0902v8 c0902v8 = this.f7689b;
        if (c0902v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0902v8);
        }
        C0669m8 c0669m8 = this.f7690c;
        if (c0669m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0669m8);
        }
        C0824s8 c0824s8 = this.f7691d;
        if (c0824s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0824s8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0617k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f7688a == null) {
                    this.f7688a = new C0850t8();
                }
                codedInputByteBufferNano.readMessage(this.f7688a);
            } else if (readTag == 18) {
                if (this.f7689b == null) {
                    this.f7689b = new C0902v8();
                }
                codedInputByteBufferNano.readMessage(this.f7689b);
            } else if (readTag == 26) {
                if (this.f7690c == null) {
                    this.f7690c = new C0669m8();
                }
                codedInputByteBufferNano.readMessage(this.f7690c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7691d == null) {
                    this.f7691d = new C0824s8();
                }
                codedInputByteBufferNano.readMessage(this.f7691d);
            }
        }
        return this;
    }

    public static C0617k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0617k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0617k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0617k8) MessageNano.mergeFrom(new C0617k8(), bArr);
    }
}
