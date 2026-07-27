package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512g6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0512g6[] f7330g;

    /* renamed from: a, reason: collision with root package name */
    public String f7331a;

    /* renamed from: b, reason: collision with root package name */
    public String f7332b;

    /* renamed from: c, reason: collision with root package name */
    public int f7333c;

    /* renamed from: d, reason: collision with root package name */
    public String f7334d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7335e;
    public int f;

    public C0512g6() {
        a();
    }

    public static C0512g6[] b() {
        if (f7330g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7330g == null) {
                        f7330g = new C0512g6[0];
                    }
                } finally {
                }
            }
        }
        return f7330g;
    }

    public final C0512g6 a() {
        this.f7331a = "";
        this.f7332b = "";
        this.f7333c = -1;
        this.f7334d = "";
        this.f7335e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7331a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7331a);
        }
        if (!this.f7332b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7332b);
        }
        int i3 = this.f7333c;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i3);
        }
        if (!this.f7334d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7334d);
        }
        boolean z3 = this.f7335e;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z3);
        }
        int i4 = this.f;
        return i4 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i4) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7331a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7331a);
        }
        if (!this.f7332b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7332b);
        }
        int i3 = this.f7333c;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i3);
        }
        if (!this.f7334d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7334d);
        }
        boolean z3 = this.f7335e;
        if (z3) {
            codedOutputByteBufferNano.writeBool(5, z3);
        }
        int i4 = this.f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0512g6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0512g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0512g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7331a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f7332b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f7333c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f7334d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f7335e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C0512g6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0512g6) MessageNano.mergeFrom(new C0512g6(), bArr);
    }
}
