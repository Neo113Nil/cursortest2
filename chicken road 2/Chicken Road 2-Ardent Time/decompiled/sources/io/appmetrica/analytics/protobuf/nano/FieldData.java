package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
class FieldData implements java.lang.Cloneable {
    private io.appmetrica.analytics.protobuf.nano.Extension<?, ?> cachedExtension;
    private java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> unknownFieldData;
    private java.lang.Object value;

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FieldData(io.appmetrica.analytics.protobuf.nano.Extension<?, T> extension, T t) {
        this.cachedExtension = extension;
        this.value = t;
    }

    private byte[] toByteArray() {
        byte[] bArr = new byte[computeSerializedSize()];
        writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.newInstance(bArr));
        return bArr;
    }

    public void addUnknownField(io.appmetrica.analytics.protobuf.nano.UnknownFieldData unknownFieldData) {
        this.unknownFieldData.add(unknownFieldData);
    }

    public int computeSerializedSize() {
        java.lang.Object obj = this.value;
        if (obj != null) {
            return this.cachedExtension.computeSerializedSize(obj);
        }
        java.util.Iterator<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> it = this.unknownFieldData.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().computeSerializedSize();
        }
        return i2;
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.protobuf.nano.FieldData)) {
            return false;
        }
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData = (io.appmetrica.analytics.protobuf.nano.FieldData) obj;
        if (this.value == null || fieldData.value == null) {
            java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list2 = this.unknownFieldData;
            if (list2 != null && (list = fieldData.unknownFieldData) != null) {
                return list2.equals(list);
            }
            try {
                return java.util.Arrays.equals(toByteArray(), fieldData.toByteArray());
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }
        io.appmetrica.analytics.protobuf.nano.Extension<?, ?> extension = this.cachedExtension;
        if (extension != fieldData.cachedExtension) {
            return false;
        }
        if (!extension.clazz.isArray()) {
            return this.value.equals(fieldData.value);
        }
        java.lang.Object obj2 = this.value;
        return obj2 instanceof byte[] ? java.util.Arrays.equals((byte[]) obj2, (byte[]) fieldData.value) : obj2 instanceof int[] ? java.util.Arrays.equals((int[]) obj2, (int[]) fieldData.value) : obj2 instanceof long[] ? java.util.Arrays.equals((long[]) obj2, (long[]) fieldData.value) : obj2 instanceof float[] ? java.util.Arrays.equals((float[]) obj2, (float[]) fieldData.value) : obj2 instanceof double[] ? java.util.Arrays.equals((double[]) obj2, (double[]) fieldData.value) : obj2 instanceof boolean[] ? java.util.Arrays.equals((boolean[]) obj2, (boolean[]) fieldData.value) : java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) fieldData.value);
    }

    public io.appmetrica.analytics.protobuf.nano.UnknownFieldData getUnknownField(int i2) {
        java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list = this.unknownFieldData;
        if (list != null && i2 < list.size()) {
            return this.unknownFieldData.get(i2);
        }
        return null;
    }

    public int getUnknownFieldSize() {
        java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list = this.unknownFieldData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getValue(io.appmetrica.analytics.protobuf.nano.Extension<?, T> extension) {
        if (this.value == null) {
            this.cachedExtension = extension;
            this.value = extension.getValueFrom(this.unknownFieldData);
            this.unknownFieldData = null;
        } else if (this.cachedExtension != extension) {
            throw new java.lang.IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return (T) this.value;
    }

    public int hashCode() {
        try {
            return java.util.Arrays.hashCode(toByteArray()) + 527;
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void setValue(io.appmetrica.analytics.protobuf.nano.Extension<?, T> extension, T t) {
        this.cachedExtension = extension;
        this.value = t;
        this.unknownFieldData = null;
    }

    public void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        java.lang.Object obj = this.value;
        if (obj != null) {
            this.cachedExtension.writeTo(obj, codedOutputByteBufferNano);
            return;
        }
        java.util.Iterator<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> it = this.unknownFieldData.iterator();
        while (it.hasNext()) {
            it.next().writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.protobuf.nano.FieldData m5clone() {
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData = new io.appmetrica.analytics.protobuf.nano.FieldData();
        try {
            fieldData.cachedExtension = this.cachedExtension;
            java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list = this.unknownFieldData;
            if (list == null) {
                fieldData.unknownFieldData = null;
            } else {
                fieldData.unknownFieldData.addAll(list);
            }
            java.lang.Object obj = this.value;
            if (obj != null) {
                if (obj instanceof io.appmetrica.analytics.protobuf.nano.MessageNano) {
                    fieldData.value = ((io.appmetrica.analytics.protobuf.nano.MessageNano) obj).mo3clone();
                } else if (obj instanceof byte[]) {
                    fieldData.value = ((byte[]) obj).clone();
                } else {
                    int i2 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        fieldData.value = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (obj instanceof boolean[]) {
                        fieldData.value = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        fieldData.value = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        fieldData.value = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        fieldData.value = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        fieldData.value = ((double[]) obj).clone();
                    } else if (obj instanceof io.appmetrica.analytics.protobuf.nano.MessageNano[]) {
                        io.appmetrica.analytics.protobuf.nano.MessageNano[] messageNanoArr = (io.appmetrica.analytics.protobuf.nano.MessageNano[]) obj;
                        io.appmetrica.analytics.protobuf.nano.MessageNano[] messageNanoArr2 = new io.appmetrica.analytics.protobuf.nano.MessageNano[messageNanoArr.length];
                        fieldData.value = messageNanoArr2;
                        while (i2 < messageNanoArr.length) {
                            messageNanoArr2[i2] = messageNanoArr[i2].mo3clone();
                            i2++;
                        }
                    }
                }
            }
            return fieldData;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public FieldData() {
        this.unknownFieldData = new java.util.ArrayList();
    }
}
