package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780qf extends MessageNano {
    public static volatile C0780qf[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f8155a;

    /* renamed from: b, reason: collision with root package name */
    public String f8156b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8157c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8158d;

    /* renamed from: e, reason: collision with root package name */
    public int f8159e;

    public C0780qf() {
        a();
    }

    public static C0780qf[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0780qf[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C0780qf a() {
        this.f8155a = "";
        this.f8156b = "";
        this.f8157c = false;
        this.f8158d = false;
        this.f8159e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f8155a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8155a);
        }
        if (!this.f8156b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8156b);
        }
        boolean z3 = this.f8157c;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z3);
        }
        boolean z4 = this.f8158d;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z4);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f8159e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8155a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8155a);
        }
        if (!this.f8156b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8156b);
        }
        boolean z3 = this.f8157c;
        if (z3) {
            codedOutputByteBufferNano.writeBool(3, z3);
        }
        boolean z4 = this.f8158d;
        if (z4) {
            codedOutputByteBufferNano.writeBool(4, z4);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f8159e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0780qf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0780qf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0780qf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8155a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f8156b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f8157c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f8158d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f8159e = readInt32;
                }
            }
        }
        return this;
    }

    public static C0780qf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0780qf) MessageNano.mergeFrom(new C0780qf(), bArr);
    }
}
