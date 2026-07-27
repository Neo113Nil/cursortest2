package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696n9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7917d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7918e = 1;
    public static final int f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7919g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7920h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7921i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7922j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7923k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7924l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7925m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7926n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7927o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f7928p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0696n9[] f7929q;

    /* renamed from: a, reason: collision with root package name */
    public long f7930a;

    /* renamed from: b, reason: collision with root package name */
    public C0670m9 f7931b;

    /* renamed from: c, reason: collision with root package name */
    public C0644l9[] f7932c;

    public C0696n9() {
        a();
    }

    public static C0696n9[] b() {
        if (f7929q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7929q == null) {
                        f7929q = new C0696n9[0];
                    }
                } finally {
                }
            }
        }
        return f7929q;
    }

    public final C0696n9 a() {
        this.f7930a = 0L;
        this.f7931b = null;
        this.f7932c = C0644l9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f7930a) + super.computeSerializedSize();
        C0670m9 c0670m9 = this.f7931b;
        if (c0670m9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0670m9);
        }
        C0644l9[] c0644l9Arr = this.f7932c;
        if (c0644l9Arr != null && c0644l9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0644l9[] c0644l9Arr2 = this.f7932c;
                if (i3 >= c0644l9Arr2.length) {
                    break;
                }
                C0644l9 c0644l9 = c0644l9Arr2[i3];
                if (c0644l9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0644l9) + computeUInt64Size;
                }
                i3++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f7930a);
        C0670m9 c0670m9 = this.f7931b;
        if (c0670m9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0670m9);
        }
        C0644l9[] c0644l9Arr = this.f7932c;
        if (c0644l9Arr != null && c0644l9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0644l9[] c0644l9Arr2 = this.f7932c;
                if (i3 >= c0644l9Arr2.length) {
                    break;
                }
                C0644l9 c0644l9 = c0644l9Arr2[i3];
                if (c0644l9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0644l9);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0696n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f7930a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f7931b == null) {
                    this.f7931b = new C0670m9();
                }
                codedInputByteBufferNano.readMessage(this.f7931b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0644l9[] c0644l9Arr = this.f7932c;
                int length = c0644l9Arr == null ? 0 : c0644l9Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0644l9[] c0644l9Arr2 = new C0644l9[i3];
                if (length != 0) {
                    System.arraycopy(c0644l9Arr, 0, c0644l9Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0644l9 c0644l9 = new C0644l9();
                    c0644l9Arr2[length] = c0644l9;
                    codedInputByteBufferNano.readMessage(c0644l9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0644l9 c0644l92 = new C0644l9();
                c0644l9Arr2[length] = c0644l92;
                codedInputByteBufferNano.readMessage(c0644l92);
                this.f7932c = c0644l9Arr2;
            }
        }
        return this;
    }

    public static C0696n9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0696n9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0696n9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0696n9) MessageNano.mergeFrom(new C0696n9(), bArr);
    }
}
