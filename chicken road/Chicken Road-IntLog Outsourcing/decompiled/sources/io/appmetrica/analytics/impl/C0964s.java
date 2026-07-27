package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f9194l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f9195m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f9196n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f9197o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9198p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f9199q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f9200r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f9201s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile C0964s[] f9202t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f9203u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f9204v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9205a;

    /* renamed from: b, reason: collision with root package name */
    public r f9206b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9207c;

    /* renamed from: d, reason: collision with root package name */
    public int f9208d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f9209e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f9210f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f9211g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f9212h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f9213i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f9214j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f9215k;

    public C0964s() {
        if (!f9204v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f9204v) {
                        f9203u = InternalNano.bytesDefaultValue("manual");
                        f9204v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0964s[] b() {
        if (f9202t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9202t == null) {
                        f9202t = new C0964s[0];
                    }
                } finally {
                }
            }
        }
        return f9202t;
    }

    public final C0964s a() {
        this.f9205a = (byte[]) f9203u.clone();
        this.f9206b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9207c = bArr;
        this.f9208d = 0;
        this.f9209e = bArr;
        this.f9210f = bArr;
        this.f9211g = bArr;
        this.f9212h = bArr;
        this.f9213i = bArr;
        this.f9214j = bArr;
        this.f9215k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f9205a, f9203u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9205a);
        }
        r rVar = this.f9206b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f9207c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f9207c);
        }
        int i2 = this.f9208d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        if (!Arrays.equals(this.f9209e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f9209e);
        }
        if (!Arrays.equals(this.f9210f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f9210f);
        }
        if (!Arrays.equals(this.f9211g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f9211g);
        }
        if (!Arrays.equals(this.f9212h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f9212h);
        }
        if (!Arrays.equals(this.f9213i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f9213i);
        }
        if (!Arrays.equals(this.f9214j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f9214j);
        }
        return !Arrays.equals(this.f9215k, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f9215k) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f9205a, f9203u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9205a);
        }
        r rVar = this.f9206b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f9207c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f9207c);
        }
        int i2 = this.f9208d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        if (!Arrays.equals(this.f9209e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f9209e);
        }
        if (!Arrays.equals(this.f9210f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f9210f);
        }
        if (!Arrays.equals(this.f9211g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f9211g);
        }
        if (!Arrays.equals(this.f9212h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f9212h);
        }
        if (!Arrays.equals(this.f9213i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f9213i);
        }
        if (!Arrays.equals(this.f9214j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f9214j);
        }
        if (!Arrays.equals(this.f9215k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f9215k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0964s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0964s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0964s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f9205a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f9206b == null) {
                        this.f9206b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f9206b);
                    break;
                case 26:
                    this.f9207c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f9208d = readInt32;
                            break;
                    }
                case C0793l9.f8691M /* 42 */:
                    this.f9209e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f9210f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f9211g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f9212h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f9213i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f9214j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f9215k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0964s a(byte[] bArr) {
        return (C0964s) MessageNano.mergeFrom(new C0964s(), bArr);
    }
}
