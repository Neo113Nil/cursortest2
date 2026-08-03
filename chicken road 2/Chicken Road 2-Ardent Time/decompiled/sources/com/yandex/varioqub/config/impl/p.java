package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class p extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2701a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2702b;

    /* renamed from: c, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.n[] f2703c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2704d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2705e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2706f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2707g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f2708h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f2709i;

    /* renamed from: j, reason: collision with root package name */
    public com.yandex.varioqub.config.impl.o[] f2710j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f2711k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f2712l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f2713m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f2714n;

    public p() {
        a();
    }

    public final void a() {
        this.f2701a = "";
        this.f2702b = "";
        if (com.yandex.varioqub.config.impl.n.f2695c == null) {
            synchronized (com.yandex.varioqub.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (com.yandex.varioqub.config.impl.n.f2695c == null) {
                        com.yandex.varioqub.config.impl.n.f2695c = new com.yandex.varioqub.config.impl.n[0];
                    }
                } finally {
                }
            }
        }
        this.f2703c = com.yandex.varioqub.config.impl.n.f2695c;
        this.f2704d = "";
        this.f2705e = "";
        this.f2706f = "";
        this.f2707g = "";
        this.f2708h = "";
        this.f2709i = "";
        this.f2710j = com.yandex.varioqub.config.impl.o.b();
        this.f2711k = "";
        this.f2712l = "";
        this.f2713m = "";
        this.f2714n = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2701a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2701a);
        }
        if (!this.f2702b.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f2702b);
        }
        com.yandex.varioqub.config.impl.n[] nVarArr = this.f2703c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.n[] nVarArr2 = this.f2703c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.n nVar = nVarArr2[i3];
                if (nVar != null) {
                    computeSerializedSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, nVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        if (!this.f2704d.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f2704d);
        }
        if (!this.f2705e.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(5, this.f2705e);
        }
        if (!this.f2706f.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(6, this.f2706f);
        }
        if (!this.f2707g.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(7, this.f2707g);
        }
        if (!this.f2708h.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(8, this.f2708h);
        }
        if (!this.f2709i.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(9, this.f2709i);
        }
        com.yandex.varioqub.config.impl.o[] oVarArr = this.f2710j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                com.yandex.varioqub.config.impl.o[] oVarArr2 = this.f2710j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.o oVar = oVarArr2[i2];
                if (oVar != null) {
                    computeSerializedSize = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(10, oVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        if (!this.f2711k.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(11, this.f2711k);
        }
        if (!this.f2712l.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(12, this.f2712l);
        }
        if (!this.f2713m.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(13, this.f2713m);
        }
        return !this.f2714n.equals("") ? computeSerializedSize + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(14, this.f2714n) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f2701a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f2702b = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    int repeatedFieldArrayLength = com.yandex.varioqub.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    com.yandex.varioqub.config.impl.n[] nVarArr = this.f2703c;
                    int length = nVarArr == null ? 0 : nVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    com.yandex.varioqub.config.impl.n[] nVarArr2 = new com.yandex.varioqub.config.impl.n[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        com.yandex.varioqub.config.impl.n nVar = new com.yandex.varioqub.config.impl.n();
                        nVarArr2[length] = nVar;
                        codedInputByteBufferNano.readMessage(nVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    com.yandex.varioqub.config.impl.n nVar2 = new com.yandex.varioqub.config.impl.n();
                    nVarArr2[length] = nVar2;
                    codedInputByteBufferNano.readMessage(nVar2);
                    this.f2703c = nVarArr2;
                    break;
                case 34:
                    this.f2704d = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    this.f2705e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f2706f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f2707g = codedInputByteBufferNano.readString();
                    break;
                case 66:
                    this.f2708h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.f2709i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = com.yandex.varioqub.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    com.yandex.varioqub.config.impl.o[] oVarArr = this.f2710j;
                    int length2 = oVarArr == null ? 0 : oVarArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    com.yandex.varioqub.config.impl.o[] oVarArr2 = new com.yandex.varioqub.config.impl.o[i3];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(oVarArr, 0, oVarArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        com.yandex.varioqub.config.impl.o oVar = new com.yandex.varioqub.config.impl.o();
                        oVarArr2[length2] = oVar;
                        codedInputByteBufferNano.readMessage(oVar);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    com.yandex.varioqub.config.impl.o oVar2 = new com.yandex.varioqub.config.impl.o();
                    oVarArr2[length2] = oVar2;
                    codedInputByteBufferNano.readMessage(oVar2);
                    this.f2710j = oVarArr2;
                    break;
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f2711k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f2712l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.f2713m = codedInputByteBufferNano.readString();
                    break;
                case 114:
                    this.f2714n = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2701a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2701a);
        }
        if (!this.f2702b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2702b);
        }
        com.yandex.varioqub.config.impl.n[] nVarArr = this.f2703c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                com.yandex.varioqub.config.impl.n[] nVarArr2 = this.f2703c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.n nVar = nVarArr2[i3];
                if (nVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, nVar);
                }
                i3++;
            }
        }
        if (!this.f2704d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f2704d);
        }
        if (!this.f2705e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f2705e);
        }
        if (!this.f2706f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f2706f);
        }
        if (!this.f2707g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f2707g);
        }
        if (!this.f2708h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f2708h);
        }
        if (!this.f2709i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f2709i);
        }
        com.yandex.varioqub.config.impl.o[] oVarArr = this.f2710j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                com.yandex.varioqub.config.impl.o[] oVarArr2 = this.f2710j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                com.yandex.varioqub.config.impl.o oVar = oVarArr2[i2];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, oVar);
                }
                i2++;
            }
        }
        if (!this.f2711k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f2711k);
        }
        if (!this.f2712l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f2712l);
        }
        if (!this.f2713m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f2713m);
        }
        if (!this.f2714n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f2714n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
