package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077w8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C1077w8[] f9509e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9510a;

    /* renamed from: b, reason: collision with root package name */
    public C0792l8 f9511b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9512c;

    /* renamed from: d, reason: collision with root package name */
    public C0947r8 f9513d;

    public C1077w8() {
        a();
    }

    public static C1077w8[] b() {
        if (f9509e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9509e == null) {
                        f9509e = new C1077w8[0];
                    }
                } finally {
                }
            }
        }
        return f9509e;
    }

    public final C1077w8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9510a = bArr;
        this.f9511b = null;
        this.f9512c = bArr;
        this.f9513d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9510a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9510a);
        }
        C0792l8 c0792l8 = this.f9511b;
        if (c0792l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0792l8);
        }
        if (!Arrays.equals(this.f9512c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f9512c);
        }
        C0947r8 c0947r8 = this.f9513d;
        return c0947r8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c0947r8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f9510a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9510a);
        }
        C0792l8 c0792l8 = this.f9511b;
        if (c0792l8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0792l8);
        }
        if (!Arrays.equals(this.f9512c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f9512c);
        }
        C0947r8 c0947r8 = this.f9513d;
        if (c0947r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0947r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1077w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9510a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f9511b == null) {
                    this.f9511b = new C0792l8();
                }
                codedInputByteBufferNano.readMessage(this.f9511b);
            } else if (readTag == 26) {
                this.f9512c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9513d == null) {
                    this.f9513d = new C0947r8();
                }
                codedInputByteBufferNano.readMessage(this.f9513d);
            }
        }
    }

    public static C1077w8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1077w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1077w8 a(byte[] bArr) {
        return (C1077w8) MessageNano.mergeFrom(new C1077w8(), bArr);
    }
}
