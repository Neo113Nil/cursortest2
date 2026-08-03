package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class r extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2718a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2719b;

    /* renamed from: c, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.q[] f2720c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2721d;

    public r() {
        a();
    }

    public final void a() {
        this.f2718a = "";
        this.f2719b = "";
        if (com.yandex.varioqub.config.impl.q.f2715c == null) {
            synchronized (com.yandex.varioqub.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (com.yandex.varioqub.config.impl.q.f2715c == null) {
                        com.yandex.varioqub.config.impl.q.f2715c = new com.yandex.varioqub.config.impl.q[0];
                    }
                } finally {
                }
            }
        }
        this.f2720c = com.yandex.varioqub.config.impl.q.f2715c;
        this.f2721d = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2718a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2718a);
        }
        if (!this.f2719b.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f2719b);
        }
        com.yandex.varioqub.config.impl.q[] qVarArr = this.f2720c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.q[] qVarArr2 = this.f2720c;
                if (i2 >= qVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.q qVar = qVarArr2[i2];
                if (qVar != null) {
                    computeSerializedSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, qVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return !this.f2721d.equals("") ? computeSerializedSize + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f2721d) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2718a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f2719b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = com.yandex.varioqub.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                com.yandex.varioqub.config.impl.q[] qVarArr = this.f2720c;
                int length = qVarArr == null ? 0 : qVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                com.yandex.varioqub.config.impl.q[] qVarArr2 = new com.yandex.varioqub.config.impl.q[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    com.yandex.varioqub.config.impl.q qVar = new com.yandex.varioqub.config.impl.q();
                    qVarArr2[length] = qVar;
                    codedInputByteBufferNano.readMessage(qVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                com.yandex.varioqub.config.impl.q qVar2 = new com.yandex.varioqub.config.impl.q();
                qVarArr2[length] = qVar2;
                codedInputByteBufferNano.readMessage(qVar2);
                this.f2720c = qVarArr2;
            } else if (readTag == 34) {
                this.f2721d = codedInputByteBufferNano.readString();
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2718a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2718a);
        }
        if (!this.f2719b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2719b);
        }
        com.yandex.varioqub.config.impl.q[] qVarArr = this.f2720c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.q[] qVarArr2 = this.f2720c;
                if (i2 >= qVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.q qVar = qVarArr2[i2];
                if (qVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, qVar);
                }
                i2++;
            }
        }
        if (!this.f2721d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f2721d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
