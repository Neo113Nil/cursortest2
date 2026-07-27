package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564i6 extends MessageNano {
    public static volatile C0564i6[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f7480a;

    /* renamed from: b, reason: collision with root package name */
    public String f7481b;

    /* renamed from: c, reason: collision with root package name */
    public C0512g6[] f7482c;

    /* renamed from: d, reason: collision with root package name */
    public C0564i6 f7483d;

    /* renamed from: e, reason: collision with root package name */
    public C0564i6[] f7484e;

    public C0564i6() {
        a();
    }

    public static C0564i6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0564i6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C0564i6 a() {
        this.f7480a = "";
        this.f7481b = "";
        this.f7482c = C0512g6.b();
        this.f7483d = null;
        this.f7484e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f7480a) + super.computeSerializedSize();
        if (!this.f7481b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7481b);
        }
        C0512g6[] c0512g6Arr = this.f7482c;
        int i3 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7482c;
                if (i4 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i4];
                if (c0512g6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c0512g6) + computeStringSize;
                }
                i4++;
            }
        }
        C0564i6 c0564i6 = this.f7483d;
        if (c0564i6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0564i6);
        }
        C0564i6[] c0564i6Arr = this.f7484e;
        if (c0564i6Arr != null && c0564i6Arr.length > 0) {
            while (true) {
                C0564i6[] c0564i6Arr2 = this.f7484e;
                if (i3 >= c0564i6Arr2.length) {
                    break;
                }
                C0564i6 c0564i62 = c0564i6Arr2[i3];
                if (c0564i62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0564i62) + computeStringSize;
                }
                i3++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7480a);
        if (!this.f7481b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7481b);
        }
        C0512g6[] c0512g6Arr = this.f7482c;
        int i3 = 0;
        if (c0512g6Arr != null && c0512g6Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C0512g6[] c0512g6Arr2 = this.f7482c;
                if (i4 >= c0512g6Arr2.length) {
                    break;
                }
                C0512g6 c0512g6 = c0512g6Arr2[i4];
                if (c0512g6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0512g6);
                }
                i4++;
            }
        }
        C0564i6 c0564i6 = this.f7483d;
        if (c0564i6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0564i6);
        }
        C0564i6[] c0564i6Arr = this.f7484e;
        if (c0564i6Arr != null && c0564i6Arr.length > 0) {
            while (true) {
                C0564i6[] c0564i6Arr2 = this.f7484e;
                if (i3 >= c0564i6Arr2.length) {
                    break;
                }
                C0564i6 c0564i62 = c0564i6Arr2[i3];
                if (c0564i62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0564i62);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0564i6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0564i6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0564i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7480a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f7481b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0512g6[] c0512g6Arr = this.f7482c;
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
                this.f7482c = c0512g6Arr2;
            } else if (readTag == 34) {
                if (this.f7483d == null) {
                    this.f7483d = new C0564i6();
                }
                codedInputByteBufferNano.readMessage(this.f7483d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0564i6[] c0564i6Arr = this.f7484e;
                int length2 = c0564i6Arr == null ? 0 : c0564i6Arr.length;
                int i4 = repeatedFieldArrayLength2 + length2;
                C0564i6[] c0564i6Arr2 = new C0564i6[i4];
                if (length2 != 0) {
                    System.arraycopy(c0564i6Arr, 0, c0564i6Arr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    C0564i6 c0564i6 = new C0564i6();
                    c0564i6Arr2[length2] = c0564i6;
                    codedInputByteBufferNano.readMessage(c0564i6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0564i6 c0564i62 = new C0564i6();
                c0564i6Arr2[length2] = c0564i62;
                codedInputByteBufferNano.readMessage(c0564i62);
                this.f7484e = c0564i6Arr2;
            }
        }
        return this;
    }

    public static C0564i6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0564i6) MessageNano.mergeFrom(new C0564i6(), bArr);
    }
}
