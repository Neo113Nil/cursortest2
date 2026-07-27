package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581io extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0581io[] f7555c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7556a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7557b;

    public C0581io() {
        a();
    }

    public static C0581io[] b() {
        if (f7555c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7555c == null) {
                        f7555c = new C0581io[0];
                    }
                } finally {
                }
            }
        }
        return f7555c;
    }

    public final C0581io a() {
        this.f7556a = false;
        this.f7557b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z3 = this.f7556a;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z3);
        }
        boolean z4 = this.f7557b;
        return z4 ? CodedOutputByteBufferNano.computeBoolSize(2, z4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z3 = this.f7556a;
        if (z3) {
            codedOutputByteBufferNano.writeBool(1, z3);
        }
        boolean z4 = this.f7557b;
        if (z4) {
            codedOutputByteBufferNano.writeBool(2, z4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0581io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7556a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7557b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0581io b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0581io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0581io a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0581io) MessageNano.mergeFrom(new C0581io(), bArr);
    }
}
