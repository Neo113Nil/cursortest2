package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class O extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile O[] f9977d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9978a;

    /* renamed from: b, reason: collision with root package name */
    public long f9979b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f9980c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f9977d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9977d == null) {
                        f9977d = new O[0];
                    }
                } finally {
                }
            }
        }
        return f9977d;
    }

    public final O a() {
        this.f9978a = true;
        this.f9979b = 5L;
        this.f9980c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9978a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        long j2 = this.f9979b;
        if (j2 != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        String[] strArr = this.f9980c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f9980c;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i3 + i6;
            }
            String str = strArr2[i2];
            if (str != null) {
                i6++;
                i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f9978a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j2 = this.f9979b;
        if (j2 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        String[] strArr = this.f9980c;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f9980c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f9978a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f9979b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f9980c;
                int length = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i2];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i2 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f9980c = strArr2;
            }
        }
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
