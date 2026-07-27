package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722o9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0722o9[] f7983e;

    /* renamed from: a, reason: collision with root package name */
    public int f7984a;

    /* renamed from: b, reason: collision with root package name */
    public int f7985b;

    /* renamed from: c, reason: collision with root package name */
    public String f7986c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7987d;

    public C0722o9() {
        a();
    }

    public static C0722o9[] b() {
        if (f7983e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7983e == null) {
                        f7983e = new C0722o9[0];
                    }
                } finally {
                }
            }
        }
        return f7983e;
    }

    public final C0722o9 a() {
        this.f7984a = 0;
        this.f7985b = 0;
        this.f7986c = "";
        this.f7987d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f7984a;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int i4 = this.f7985b;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i4);
        }
        if (!this.f7986c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7986c);
        }
        boolean z3 = this.f7987d;
        return z3 ? CodedOutputByteBufferNano.computeBoolSize(4, z3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f7984a;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        int i4 = this.f7985b;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i4);
        }
        if (!this.f7986c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7986c);
        }
        boolean z3 = this.f7987d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0722o9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7984a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f7985b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f7986c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7987d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0722o9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0722o9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0722o9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0722o9) MessageNano.mergeFrom(new C0722o9(), bArr);
    }
}
