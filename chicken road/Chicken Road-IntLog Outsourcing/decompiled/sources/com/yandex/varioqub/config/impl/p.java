package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0793l9;

/* loaded from: classes.dex */
public final class p extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public String f5435a;

    /* renamed from: b, reason: collision with root package name */
    public String f5436b;

    /* renamed from: c, reason: collision with root package name */
    public n[] f5437c;

    /* renamed from: d, reason: collision with root package name */
    public String f5438d;

    /* renamed from: e, reason: collision with root package name */
    public String f5439e;

    /* renamed from: f, reason: collision with root package name */
    public String f5440f;

    /* renamed from: g, reason: collision with root package name */
    public String f5441g;

    /* renamed from: h, reason: collision with root package name */
    public String f5442h;

    /* renamed from: i, reason: collision with root package name */
    public String f5443i;

    /* renamed from: j, reason: collision with root package name */
    public o[] f5444j;

    /* renamed from: k, reason: collision with root package name */
    public String f5445k;

    /* renamed from: l, reason: collision with root package name */
    public String f5446l;

    /* renamed from: m, reason: collision with root package name */
    public String f5447m;

    /* renamed from: n, reason: collision with root package name */
    public String f5448n;

    public p() {
        a();
    }

    public final void a() {
        this.f5435a = "";
        this.f5436b = "";
        if (n.f5429c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n.f5429c == null) {
                        n.f5429c = new n[0];
                    }
                } finally {
                }
            }
        }
        this.f5437c = n.f5429c;
        this.f5438d = "";
        this.f5439e = "";
        this.f5440f = "";
        this.f5441g = "";
        this.f5442h = "";
        this.f5443i = "";
        this.f5444j = o.b();
        this.f5445k = "";
        this.f5446l = "";
        this.f5447m = "";
        this.f5448n = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5435a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5435a);
        }
        if (!this.f5436b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5436b);
        }
        n[] nVarArr = this.f5437c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                n[] nVarArr2 = this.f5437c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i3];
                if (nVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, nVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        if (!this.f5438d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f5438d);
        }
        if (!this.f5439e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f5439e);
        }
        if (!this.f5440f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f5440f);
        }
        if (!this.f5441g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f5441g);
        }
        if (!this.f5442h.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f5442h);
        }
        if (!this.f5443i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f5443i);
        }
        o[] oVarArr = this.f5444j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f5444j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i2];
                if (oVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, oVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        if (!this.f5445k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f5445k);
        }
        if (!this.f5446l.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(12, this.f5446l);
        }
        if (!this.f5447m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f5447m);
        }
        return !this.f5448n.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(14, this.f5448n) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f5435a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f5436b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    n[] nVarArr = this.f5437c;
                    int length = nVarArr == null ? 0 : nVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    n[] nVarArr2 = new n[i2];
                    if (length != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        n nVar = new n();
                        nVarArr2[length] = nVar;
                        codedInputByteBufferNano.readMessage(nVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    n nVar2 = new n();
                    nVarArr2[length] = nVar2;
                    codedInputByteBufferNano.readMessage(nVar2);
                    this.f5437c = nVarArr2;
                    break;
                case 34:
                    this.f5438d = codedInputByteBufferNano.readString();
                    break;
                case C0793l9.f8691M /* 42 */:
                    this.f5439e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f5440f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f5441g = codedInputByteBufferNano.readString();
                    break;
                case 66:
                    this.f5442h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.f5443i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    o[] oVarArr = this.f5444j;
                    int length2 = oVarArr == null ? 0 : oVarArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    o[] oVarArr2 = new o[i3];
                    if (length2 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        o oVar = new o();
                        oVarArr2[length2] = oVar;
                        codedInputByteBufferNano.readMessage(oVar);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    o oVar2 = new o();
                    oVarArr2[length2] = oVar2;
                    codedInputByteBufferNano.readMessage(oVar2);
                    this.f5444j = oVarArr2;
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f5445k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f5446l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.f5447m = codedInputByteBufferNano.readString();
                    break;
                case 114:
                    this.f5448n = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5435a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5435a);
        }
        if (!this.f5436b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5436b);
        }
        n[] nVarArr = this.f5437c;
        int i2 = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                n[] nVarArr2 = this.f5437c;
                if (i3 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i3];
                if (nVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, nVar);
                }
                i3++;
            }
        }
        if (!this.f5438d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5438d);
        }
        if (!this.f5439e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f5439e);
        }
        if (!this.f5440f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f5440f);
        }
        if (!this.f5441g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f5441g);
        }
        if (!this.f5442h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f5442h);
        }
        if (!this.f5443i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f5443i);
        }
        o[] oVarArr = this.f5444j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f5444j;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i2];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, oVar);
                }
                i2++;
            }
        }
        if (!this.f5445k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f5445k);
        }
        if (!this.f5446l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f5446l);
        }
        if (!this.f5447m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f5447m);
        }
        if (!this.f5448n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f5448n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
