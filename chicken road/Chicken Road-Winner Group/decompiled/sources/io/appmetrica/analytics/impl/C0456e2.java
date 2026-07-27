package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456e2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7180c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7181d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7182e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7183g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7184h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7185i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7186j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7187k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static volatile C0456e2[] f7188l;

    /* renamed from: a, reason: collision with root package name */
    public int f7189a;

    /* renamed from: b, reason: collision with root package name */
    public int f7190b;

    public C0456e2() {
        a();
    }

    public static C0456e2[] b() {
        if (f7188l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7188l == null) {
                        f7188l = new C0456e2[0];
                    }
                } finally {
                }
            }
        }
        return f7188l;
    }

    public final C0456e2 a() {
        this.f7189a = 0;
        this.f7190b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f7190b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f7189a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f7189a);
        codedOutputByteBufferNano.writeInt32(3, this.f7190b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0456e2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f7189a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f7190b = readInt322;
                }
            }
        }
        return this;
    }

    public static C0456e2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0456e2().mergeFrom(codedInputByteBufferNano);
    }

    public static C0456e2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0456e2) MessageNano.mergeFrom(new C0456e2(), bArr);
    }
}
