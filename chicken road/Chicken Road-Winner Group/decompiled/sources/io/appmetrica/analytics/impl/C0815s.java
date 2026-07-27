package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f8250l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8251m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f8252n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8253o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f8254p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f8255q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f8256r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f8257s = 7;

    /* renamed from: t, reason: collision with root package name */
    public static volatile C0815s[] f8258t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f8259u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f8260v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8261a;

    /* renamed from: b, reason: collision with root package name */
    public r f8262b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8263c;

    /* renamed from: d, reason: collision with root package name */
    public int f8264d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8265e;
    public byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8266g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f8267h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f8268i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f8269j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f8270k;

    public C0815s() {
        if (!f8260v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f8260v) {
                        f8259u = InternalNano.bytesDefaultValue("manual");
                        f8260v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0815s[] b() {
        if (f8258t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8258t == null) {
                        f8258t = new C0815s[0];
                    }
                } finally {
                }
            }
        }
        return f8258t;
    }

    public final C0815s a() {
        this.f8261a = (byte[]) f8259u.clone();
        this.f8262b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8263c = bArr;
        this.f8264d = 0;
        this.f8265e = bArr;
        this.f = bArr;
        this.f8266g = bArr;
        this.f8267h = bArr;
        this.f8268i = bArr;
        this.f8269j = bArr;
        this.f8270k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f8261a, f8259u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8261a);
        }
        r rVar = this.f8262b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f8263c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8263c);
        }
        int i3 = this.f8264d;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        if (!Arrays.equals(this.f8265e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f8265e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f);
        }
        if (!Arrays.equals(this.f8266g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f8266g);
        }
        if (!Arrays.equals(this.f8267h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f8267h);
        }
        if (!Arrays.equals(this.f8268i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f8268i);
        }
        if (!Arrays.equals(this.f8269j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f8269j);
        }
        return !Arrays.equals(this.f8270k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f8270k) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8261a, f8259u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8261a);
        }
        r rVar = this.f8262b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f8263c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f8263c);
        }
        int i3 = this.f8264d;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        if (!Arrays.equals(this.f8265e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f8265e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f);
        }
        if (!Arrays.equals(this.f8266g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f8266g);
        }
        if (!Arrays.equals(this.f8267h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f8267h);
        }
        if (!Arrays.equals(this.f8268i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f8268i);
        }
        if (!Arrays.equals(this.f8269j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f8269j);
        }
        if (!Arrays.equals(this.f8270k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f8270k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0815s b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0815s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0815s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f8261a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f8262b == null) {
                        this.f8262b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f8262b);
                    break;
                case C0644l9.f7763G /* 26 */:
                    this.f8263c = codedInputByteBufferNano.readBytes();
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
                            this.f8264d = readInt32;
                            break;
                    }
                case C0644l9.f7768M /* 42 */:
                    this.f8265e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f8266g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f8267h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f8268i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f8269j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f8270k = codedInputByteBufferNano.readBytes();
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

    public static C0815s a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0815s) MessageNano.mergeFrom(new C0815s(), bArr);
    }
}
