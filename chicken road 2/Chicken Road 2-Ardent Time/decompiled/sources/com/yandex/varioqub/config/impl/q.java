package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class q extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.yandex.varioqub.config.impl.q[] f2715c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2716a;

    /* renamed from: b, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.s[] f2717b;

    public q() {
        a();
    }

    public final void a() {
        this.f2716a = "";
        if (com.yandex.varioqub.config.impl.s.f2722d == null) {
            synchronized (com.yandex.varioqub.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (com.yandex.varioqub.config.impl.s.f2722d == null) {
                        com.yandex.varioqub.config.impl.s.f2722d = new com.yandex.varioqub.config.impl.s[0];
                    }
                } finally {
                }
            }
        }
        this.f2717b = com.yandex.varioqub.config.impl.s.f2722d;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2716a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2716a);
        }
        com.yandex.varioqub.config.impl.s[] sVarArr = this.f2717b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.s[] sVarArr2 = this.f2717b;
                if (i2 >= sVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.s sVar = sVarArr2[i2];
                if (sVar != null) {
                    computeSerializedSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, sVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2716a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = com.yandex.varioqub.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                com.yandex.varioqub.config.impl.s[] sVarArr = this.f2717b;
                int length = sVarArr == null ? 0 : sVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                com.yandex.varioqub.config.impl.s[] sVarArr2 = new com.yandex.varioqub.config.impl.s[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(sVarArr, 0, sVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    com.yandex.varioqub.config.impl.s sVar = new com.yandex.varioqub.config.impl.s();
                    sVarArr2[length] = sVar;
                    codedInputByteBufferNano.readMessage(sVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                com.yandex.varioqub.config.impl.s sVar2 = new com.yandex.varioqub.config.impl.s();
                sVarArr2[length] = sVar2;
                codedInputByteBufferNano.readMessage(sVar2);
                this.f2717b = sVarArr2;
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2716a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2716a);
        }
        com.yandex.varioqub.config.impl.s[] sVarArr = this.f2717b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.s[] sVarArr2 = this.f2717b;
                if (i2 >= sVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.s sVar = sVarArr2[i2];
                if (sVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, sVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
