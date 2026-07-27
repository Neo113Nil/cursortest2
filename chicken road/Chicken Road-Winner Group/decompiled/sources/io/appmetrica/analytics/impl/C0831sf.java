package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831sf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8302c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8303d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8304e = 2;
    public static final int f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0831sf[] f8305g;

    /* renamed from: a, reason: collision with root package name */
    public C0780qf f8306a;

    /* renamed from: b, reason: collision with root package name */
    public C0805rf[] f8307b;

    public C0831sf() {
        a();
    }

    public static C0831sf[] b() {
        if (f8305g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8305g == null) {
                        f8305g = new C0831sf[0];
                    }
                } finally {
                }
            }
        }
        return f8305g;
    }

    public final C0831sf a() {
        this.f8306a = null;
        this.f8307b = C0805rf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0780qf c0780qf = this.f8306a;
        if (c0780qf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0780qf);
        }
        C0805rf[] c0805rfArr = this.f8307b;
        if (c0805rfArr != null && c0805rfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0805rf[] c0805rfArr2 = this.f8307b;
                if (i3 >= c0805rfArr2.length) {
                    break;
                }
                C0805rf c0805rf = c0805rfArr2[i3];
                if (c0805rf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0805rf) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0780qf c0780qf = this.f8306a;
        if (c0780qf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0780qf);
        }
        C0805rf[] c0805rfArr = this.f8307b;
        if (c0805rfArr != null && c0805rfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0805rf[] c0805rfArr2 = this.f8307b;
                if (i3 >= c0805rfArr2.length) {
                    break;
                }
                C0805rf c0805rf = c0805rfArr2[i3];
                if (c0805rf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0805rf);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0831sf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8306a == null) {
                    this.f8306a = new C0780qf();
                }
                codedInputByteBufferNano.readMessage(this.f8306a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0805rf[] c0805rfArr = this.f8307b;
                int length = c0805rfArr == null ? 0 : c0805rfArr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0805rf[] c0805rfArr2 = new C0805rf[i3];
                if (length != 0) {
                    System.arraycopy(c0805rfArr, 0, c0805rfArr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0805rf c0805rf = new C0805rf();
                    c0805rfArr2[length] = c0805rf;
                    codedInputByteBufferNano.readMessage(c0805rf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0805rf c0805rf2 = new C0805rf();
                c0805rfArr2[length] = c0805rf2;
                codedInputByteBufferNano.readMessage(c0805rf2);
                this.f8307b = c0805rfArr2;
            }
        }
        return this;
    }

    public static C0831sf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0831sf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0831sf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0831sf) MessageNano.mergeFrom(new C0831sf(), bArr);
    }
}
