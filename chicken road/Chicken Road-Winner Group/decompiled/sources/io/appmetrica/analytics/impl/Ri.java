package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ri extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f6516l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6517m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6518n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6519o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6520p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Ri[] f6521q;

    /* renamed from: a, reason: collision with root package name */
    public int f6522a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6523b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6524c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6525d;

    /* renamed from: e, reason: collision with root package name */
    public Mi f6526e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6527g;

    /* renamed from: h, reason: collision with root package name */
    public int f6528h;

    /* renamed from: i, reason: collision with root package name */
    public int f6529i;

    /* renamed from: j, reason: collision with root package name */
    public Qi f6530j;

    /* renamed from: k, reason: collision with root package name */
    public Pi f6531k;

    public Ri() {
        a();
    }

    public static Ri[] b() {
        if (f6521q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6521q == null) {
                        f6521q = new Ri[0];
                    }
                } finally {
                }
            }
        }
        return f6521q;
    }

    public final Ri a() {
        this.f6522a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6523b = bArr;
        this.f6524c = bArr;
        this.f6525d = bArr;
        this.f6526e = null;
        this.f = 0L;
        this.f6527g = false;
        this.f6528h = 0;
        this.f6529i = 1;
        this.f6530j = null;
        this.f6531k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f6522a;
        if (i3 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f6523b) + computeSerializedSize;
        byte[] bArr = this.f6524c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6524c);
        }
        if (!Arrays.equals(this.f6525d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6525d);
        }
        Mi mi = this.f6526e;
        if (mi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, mi);
        }
        long j3 = this.f;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j3);
        }
        boolean z3 = this.f6527g;
        if (z3) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z3);
        }
        int i4 = this.f6528h;
        if (i4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
        }
        int i5 = this.f6529i;
        if (i5 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
        }
        Qi qi = this.f6530j;
        if (qi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, qi);
        }
        Pi pi = this.f6531k;
        return pi != null ? CodedOutputByteBufferNano.computeMessageSize(12, pi) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f6522a;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f6523b);
        byte[] bArr = this.f6524c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6524c);
        }
        if (!Arrays.equals(this.f6525d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6525d);
        }
        Mi mi = this.f6526e;
        if (mi != null) {
            codedOutputByteBufferNano.writeMessage(6, mi);
        }
        long j3 = this.f;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j3);
        }
        boolean z3 = this.f6527g;
        if (z3) {
            codedOutputByteBufferNano.writeBool(8, z3);
        }
        int i4 = this.f6528h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i4);
        }
        int i5 = this.f6529i;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i5);
        }
        Qi qi = this.f6530j;
        if (qi != null) {
            codedOutputByteBufferNano.writeMessage(11, qi);
        }
        Pi pi = this.f6531k;
        if (pi != null) {
            codedOutputByteBufferNano.writeMessage(12, pi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ri b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ri().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ri mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f6522a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0644l9.f7763G /* 26 */:
                    this.f6523b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f6524c = codedInputByteBufferNano.readBytes();
                    break;
                case C0644l9.f7768M /* 42 */:
                    this.f6525d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f6526e == null) {
                        this.f6526e = new Mi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6526e);
                    break;
                case 56:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f6527g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f6528h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f6529i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f6530j == null) {
                        this.f6530j = new Qi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6530j);
                    break;
                case 98:
                    if (this.f6531k == null) {
                        this.f6531k = new Pi();
                    }
                    codedInputByteBufferNano.readMessage(this.f6531k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static Ri a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ri) MessageNano.mergeFrom(new Ri(), bArr);
    }
}
