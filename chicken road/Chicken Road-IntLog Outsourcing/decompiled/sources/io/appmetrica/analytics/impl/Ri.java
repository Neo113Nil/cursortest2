package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ri extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f7380l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7381m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7382n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7383o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7384p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Ri[] f7385q;

    /* renamed from: a, reason: collision with root package name */
    public int f7386a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7387b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f7388c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7389d;

    /* renamed from: e, reason: collision with root package name */
    public Mi f7390e;

    /* renamed from: f, reason: collision with root package name */
    public long f7391f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7392g;

    /* renamed from: h, reason: collision with root package name */
    public int f7393h;

    /* renamed from: i, reason: collision with root package name */
    public int f7394i;

    /* renamed from: j, reason: collision with root package name */
    public Qi f7395j;

    /* renamed from: k, reason: collision with root package name */
    public Pi f7396k;

    public Ri() {
        a();
    }

    public static Ri[] b() {
        if (f7385q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7385q == null) {
                        f7385q = new Ri[0];
                    }
                } finally {
                }
            }
        }
        return f7385q;
    }

    public final Ri a() {
        this.f7386a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7387b = bArr;
        this.f7388c = bArr;
        this.f7389d = bArr;
        this.f7390e = null;
        this.f7391f = 0L;
        this.f7392g = false;
        this.f7393h = 0;
        this.f7394i = 1;
        this.f7395j = null;
        this.f7396k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f7386a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f7387b) + computeSerializedSize;
        byte[] bArr = this.f7388c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f7388c);
        }
        if (!Arrays.equals(this.f7389d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f7389d);
        }
        Mi mi = this.f7390e;
        if (mi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, mi);
        }
        long j2 = this.f7391f;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z = this.f7392g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i3 = this.f7393h;
        if (i3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i6 = this.f7394i;
        if (i6 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
        }
        Qi qi = this.f7395j;
        if (qi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, qi);
        }
        Pi pi = this.f7396k;
        return pi != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, pi) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f7386a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f7387b);
        byte[] bArr = this.f7388c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f7388c);
        }
        if (!Arrays.equals(this.f7389d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7389d);
        }
        Mi mi = this.f7390e;
        if (mi != null) {
            codedOutputByteBufferNano.writeMessage(6, mi);
        }
        long j2 = this.f7391f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z = this.f7392g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i3 = this.f7393h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i6 = this.f7394i;
        if (i6 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i6);
        }
        Qi qi = this.f7395j;
        if (qi != null) {
            codedOutputByteBufferNano.writeMessage(11, qi);
        }
        Pi pi = this.f7396k;
        if (pi != null) {
            codedOutputByteBufferNano.writeMessage(12, pi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ri b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ri().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ri mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f7386a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f7387b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f7388c = codedInputByteBufferNano.readBytes();
                    break;
                case C0793l9.f8691M /* 42 */:
                    this.f7389d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f7390e == null) {
                        this.f7390e = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f7390e);
                    break;
                case 56:
                    this.f7391f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f7392g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f7393h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f7394i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f7395j == null) {
                        this.f7395j = new Qi();
                    }
                    codedInputByteBufferNano.readMessage(this.f7395j);
                    break;
                case 98:
                    if (this.f7396k == null) {
                        this.f7396k = new Pi();
                    }
                    codedInputByteBufferNano.readMessage(this.f7396k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static Ri a(byte[] bArr) {
        return (Ri) MessageNano.mergeFrom(new Ri(), bArr);
    }
}
