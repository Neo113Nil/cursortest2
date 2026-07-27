package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556ho extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7459e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7460g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7461h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile C0556ho[] f7462i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7463a;

    /* renamed from: b, reason: collision with root package name */
    public int f7464b;

    /* renamed from: c, reason: collision with root package name */
    public C0581io f7465c;

    /* renamed from: d, reason: collision with root package name */
    public C0607jo f7466d;

    public C0556ho() {
        a();
    }

    public static C0556ho[] b() {
        if (f7462i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7462i == null) {
                        f7462i = new C0556ho[0];
                    }
                } finally {
                }
            }
        }
        return f7462i;
    }

    public final C0556ho a() {
        this.f7463a = WireFormatNano.EMPTY_BYTES;
        this.f7464b = 0;
        this.f7465c = null;
        this.f7466d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f7464b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f7463a) + super.computeSerializedSize();
        C0581io c0581io = this.f7465c;
        if (c0581io != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0581io);
        }
        C0607jo c0607jo = this.f7466d;
        return c0607jo != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0607jo) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f7463a);
        codedOutputByteBufferNano.writeInt32(2, this.f7464b);
        C0581io c0581io = this.f7465c;
        if (c0581io != null) {
            codedOutputByteBufferNano.writeMessage(3, c0581io);
        }
        C0607jo c0607jo = this.f7466d;
        if (c0607jo != null) {
            codedOutputByteBufferNano.writeMessage(4, c0607jo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0556ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7463a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f7464b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f7465c == null) {
                    this.f7465c = new C0581io();
                }
                codedInputByteBufferNano.readMessage(this.f7465c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7466d == null) {
                    this.f7466d = new C0607jo();
                }
                codedInputByteBufferNano.readMessage(this.f7466d);
            }
        }
        return this;
    }

    public static C0556ho b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0556ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0556ho a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0556ho) MessageNano.mergeFrom(new C0556ho(), bArr);
    }
}
