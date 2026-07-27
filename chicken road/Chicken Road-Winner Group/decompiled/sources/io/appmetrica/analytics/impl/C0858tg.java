package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858tg extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8363e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8364g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0858tg[] f8365h;

    /* renamed from: a, reason: collision with root package name */
    public String f8366a;

    /* renamed from: b, reason: collision with root package name */
    public long f8367b;

    /* renamed from: c, reason: collision with root package name */
    public long f8368c;

    /* renamed from: d, reason: collision with root package name */
    public int f8369d;

    public C0858tg() {
        a();
    }

    public static C0858tg[] b() {
        if (f8365h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8365h == null) {
                        f8365h = new C0858tg[0];
                    }
                } finally {
                }
            }
        }
        return f8365h;
    }

    public final C0858tg a() {
        this.f8366a = "";
        this.f8367b = 0L;
        this.f8368c = 0L;
        this.f8369d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8366a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8366a);
        }
        long j3 = this.f8367b;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j3);
        }
        long j4 = this.f8368c;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j4);
        }
        int i3 = this.f8369d;
        return i3 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8366a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8366a);
        }
        long j3 = this.f8367b;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j3);
        }
        long j4 = this.f8368c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j4);
        }
        int i3 = this.f8369d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0858tg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8366a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f8367b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f8368c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f8369d = readInt32;
                }
            }
        }
        return this;
    }

    public static C0858tg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0858tg().mergeFrom(codedInputByteBufferNano);
    }

    public static C0858tg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0858tg) MessageNano.mergeFrom(new C0858tg(), bArr);
    }
}
