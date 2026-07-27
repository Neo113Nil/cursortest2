package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980sf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9249c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9250d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9251e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9252f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0980sf[] f9253g;

    /* renamed from: a, reason: collision with root package name */
    public C0929qf f9254a;

    /* renamed from: b, reason: collision with root package name */
    public C0954rf[] f9255b;

    public C0980sf() {
        a();
    }

    public static C0980sf[] b() {
        if (f9253g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9253g == null) {
                        f9253g = new C0980sf[0];
                    }
                } finally {
                }
            }
        }
        return f9253g;
    }

    public final C0980sf a() {
        this.f9254a = null;
        this.f9255b = C0954rf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0929qf c0929qf = this.f9254a;
        if (c0929qf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0929qf);
        }
        C0954rf[] c0954rfArr = this.f9255b;
        if (c0954rfArr != null && c0954rfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0954rf[] c0954rfArr2 = this.f9255b;
                if (i2 >= c0954rfArr2.length) {
                    break;
                }
                C0954rf c0954rf = c0954rfArr2[i2];
                if (c0954rf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0954rf) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0929qf c0929qf = this.f9254a;
        if (c0929qf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0929qf);
        }
        C0954rf[] c0954rfArr = this.f9255b;
        if (c0954rfArr != null && c0954rfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0954rf[] c0954rfArr2 = this.f9255b;
                if (i2 >= c0954rfArr2.length) {
                    break;
                }
                C0954rf c0954rf = c0954rfArr2[i2];
                if (c0954rf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0954rf);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0980sf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f9254a == null) {
                    this.f9254a = new C0929qf();
                }
                codedInputByteBufferNano.readMessage(this.f9254a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0954rf[] c0954rfArr = this.f9255b;
                int length = c0954rfArr == null ? 0 : c0954rfArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0954rf[] c0954rfArr2 = new C0954rf[i2];
                if (length != 0) {
                    System.arraycopy(c0954rfArr, 0, c0954rfArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0954rf c0954rf = new C0954rf();
                    c0954rfArr2[length] = c0954rf;
                    codedInputByteBufferNano.readMessage(c0954rf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0954rf c0954rf2 = new C0954rf();
                c0954rfArr2[length] = c0954rf2;
                codedInputByteBufferNano.readMessage(c0954rf2);
                this.f9255b = c0954rfArr2;
            }
        }
    }

    public static C0980sf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0980sf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0980sf a(byte[] bArr) {
        return (C0980sf) MessageNano.mergeFrom(new C0980sf(), bArr);
    }
}
