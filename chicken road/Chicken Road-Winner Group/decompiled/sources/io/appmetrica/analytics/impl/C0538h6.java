package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538h6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0538h6[] f7403g;

    /* renamed from: a, reason: collision with root package name */
    public String f7404a;

    /* renamed from: b, reason: collision with root package name */
    public int f7405b;

    /* renamed from: c, reason: collision with root package name */
    public long f7406c;

    /* renamed from: d, reason: collision with root package name */
    public String f7407d;

    /* renamed from: e, reason: collision with root package name */
    public int f7408e;
    public C0512g6[] f;

    public C0538h6() {
        a();
    }

    public static C0538h6[] b() {
        if (f7403g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7403g == null) {
                        f7403g = new C0538h6[0];
                    }
                } finally {
                }
            }
        }
        return f7403g;
    }

    public final C0538h6 a() {
        this.f7404a = "";
        this.f7405b = 0;
        this.f7406c = 0L;
        this.f7407d = "";
        this.f7408e = 0;
        this.f = C0512g6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f7406c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f7405b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7404a) + super.computeSerializedSize();
        if (!this.f7407d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7407d);
        }
        int i3 = this.f7408e;
        if (i3 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        C0512g6[] c0512g6Arr = this.f;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f;
                if (i4 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i4];
                if (c0512g6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c0512g6) + computeSInt64Size;
                }
                i4++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7404a);
        codedOutputByteBufferNano.writeSInt32(2, this.f7405b);
        codedOutputByteBufferNano.writeSInt64(3, this.f7406c);
        if (!this.f7407d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7407d);
        }
        int i3 = this.f7408e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        C0512g6[] c0512g6Arr = this.f;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f;
                if (i4 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i4];
                if (c0512g6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c0512g6);
                }
                i4++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0538h6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0538h6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0538h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7404a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f7405b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f7406c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f7407d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f7408e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C0512g6[] c0512g6Arr = this.f;
                int length = c0512g6Arr == null ? 0 : c0512g6Arr.length;
                int i3 = repeatedFieldArrayLength + length;
                C0512g6[] c0512g6Arr2 = new C0512g6[i3];
                if (length != 0) {
                    System.arraycopy(c0512g6Arr, 0, c0512g6Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    C0512g6 c0512g6 = new C0512g6();
                    c0512g6Arr2[length] = c0512g6;
                    codedInputByteBufferNano.readMessage(c0512g6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0512g6 c0512g62 = new C0512g6();
                c0512g6Arr2[length] = c0512g62;
                codedInputByteBufferNano.readMessage(c0512g62);
                this.f = c0512g6Arr2;
            }
        }
        return this;
    }

    public static C0538h6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0538h6) MessageNano.mergeFrom(new C0538h6(), bArr);
    }
}
