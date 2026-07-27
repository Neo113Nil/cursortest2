package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916vm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0916vm[] f8527g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8528a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8529b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8530c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8531d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8532e;
    public int f;

    public C0916vm() {
        a();
    }

    public static C0916vm[] b() {
        if (f8527g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8527g == null) {
                        f8527g = new C0916vm[0];
                    }
                } finally {
                }
            }
        }
        return f8527g;
    }

    public final C0916vm a() {
        this.f8528a = false;
        this.f8529b = false;
        this.f8530c = false;
        this.f8531d = false;
        this.f8532e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f8531d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f8530c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f8529b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f8528a) + super.computeSerializedSize();
        boolean z3 = this.f8532e;
        if (z3) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z3);
        }
        int i3 = this.f;
        return i3 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i3) + computeBoolSize : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f8528a);
        codedOutputByteBufferNano.writeBool(2, this.f8529b);
        codedOutputByteBufferNano.writeBool(3, this.f8530c);
        codedOutputByteBufferNano.writeBool(4, this.f8531d);
        boolean z3 = this.f8532e;
        if (z3) {
            codedOutputByteBufferNano.writeBool(5, z3);
        }
        int i3 = this.f;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0916vm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0916vm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0916vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.f8528a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f8529b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f8530c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f8531d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f8532e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f = readInt32;
                }
            }
        }
        return this;
    }

    public static C0916vm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0916vm) MessageNano.mergeFrom(new C0916vm(), bArr);
    }
}
