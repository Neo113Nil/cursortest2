package io.appmetrica.analytics.billing.impl;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5209l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5210m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5211n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5212o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5213p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile z[] f5214q;

    /* renamed from: a, reason: collision with root package name */
    public int f5215a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5216b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5217c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5218d;

    /* renamed from: e, reason: collision with root package name */
    public u f5219e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5220g;

    /* renamed from: h, reason: collision with root package name */
    public int f5221h;

    /* renamed from: i, reason: collision with root package name */
    public int f5222i;

    /* renamed from: j, reason: collision with root package name */
    public y f5223j;

    /* renamed from: k, reason: collision with root package name */
    public x f5224k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f5214q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5214q == null) {
                        f5214q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f5214q;
    }

    public final z a() {
        this.f5215a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5216b = bArr;
        this.f5217c = bArr;
        this.f5218d = bArr;
        this.f5219e = null;
        this.f = 0L;
        this.f5220g = false;
        this.f5221h = 0;
        this.f5222i = 1;
        this.f5223j = null;
        this.f5224k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i3 = this.f5215a;
        if (i3 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i3);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f5216b) + computeSerializedSize;
        byte[] bArr = this.f5217c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f5217c);
        }
        if (!Arrays.equals(this.f5218d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f5218d);
        }
        u uVar = this.f5219e;
        if (uVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j3 = this.f;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j3);
        }
        boolean z3 = this.f5220g;
        if (z3) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z3);
        }
        int i4 = this.f5221h;
        if (i4 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i4);
        }
        int i5 = this.f5222i;
        if (i5 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i5);
        }
        y yVar = this.f5223j;
        if (yVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f5224k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i3 = this.f5215a;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i3);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f5216b);
        byte[] bArr = this.f5217c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f5217c);
        }
        if (!Arrays.equals(this.f5218d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f5218d);
        }
        u uVar = this.f5219e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j3 = this.f;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j3);
        }
        boolean z3 = this.f5220g;
        if (z3) {
            codedOutputByteBufferNano.writeBool(8, z3);
        }
        int i4 = this.f5221h;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i4);
        }
        int i5 = this.f5222i;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i5);
        }
        y yVar = this.f5223j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f5224k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f5215a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0644l9.f7763G /* 26 */:
                    this.f5216b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f5217c = codedInputByteBufferNano.readBytes();
                    break;
                case C0644l9.f7768M /* 42 */:
                    this.f5218d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f5219e == null) {
                        this.f5219e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f5219e);
                    break;
                case 56:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    this.f5220g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f5221h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f5222i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f5223j == null) {
                        this.f5223j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f5223j);
                    break;
                case 98:
                    if (this.f5224k == null) {
                        this.f5224k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f5224k);
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

    public static z a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
