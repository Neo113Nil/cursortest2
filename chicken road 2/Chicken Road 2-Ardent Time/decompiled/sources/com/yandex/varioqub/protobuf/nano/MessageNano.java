package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
public abstract class MessageNano {
    protected volatile int cachedSize = -1;

    public static final <T extends com.yandex.varioqub.protobuf.nano.MessageNano> T mergeFrom(T t, byte[] bArr) {
        return (T) mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final boolean messageNanoEquals(com.yandex.varioqub.protobuf.nano.MessageNano messageNano, com.yandex.varioqub.protobuf.nano.MessageNano messageNano2) {
        int serializedSize;
        if (messageNano == messageNano2) {
            return true;
        }
        if (messageNano == null || messageNano2 == null || messageNano.getClass() != messageNano2.getClass() || messageNano2.getSerializedSize() != (serializedSize = messageNano.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(messageNano, bArr, 0, serializedSize);
        toByteArray(messageNano2, bArr2, 0, serializedSize);
        return java.util.Arrays.equals(bArr, bArr2);
    }

    public static final byte[] toByteArray(com.yandex.varioqub.protobuf.nano.MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(messageNano, bArr, 0, serializedSize);
        return bArr;
    }

    public int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano);

    public java.lang.String toString() {
        return com.yandex.varioqub.protobuf.nano.MessageNanoPrinter.print(this);
    }

    public void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
    }

    public static final <T extends com.yandex.varioqub.protobuf.nano.MessageNano> T mergeFrom(T t, byte[] bArr, int i2, int i3) {
        try {
            com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano newInstance = com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano.newInstance(bArr, i2, i3);
            t.mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return t;
        } catch (com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException e2) {
            throw e2;
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.yandex.varioqub.protobuf.nano.MessageNano mo0clone() {
        return (com.yandex.varioqub.protobuf.nano.MessageNano) super.clone();
    }

    public static final void toByteArray(com.yandex.varioqub.protobuf.nano.MessageNano messageNano, byte[] bArr, int i2, int i3) {
        try {
            com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano newInstance = com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.newInstance(bArr, i2, i3);
            messageNano.writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
