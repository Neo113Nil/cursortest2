package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class FieldArray implements java.lang.Cloneable {
    private static final io.appmetrica.analytics.protobuf.nano.FieldData DELETED = new io.appmetrica.analytics.protobuf.nano.FieldData();
    private io.appmetrica.analytics.protobuf.nano.FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i2) {
        int i3 = this.mSize - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.mFieldNumbers[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    private void gc() {
        int i2 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr = this.mData;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            io.appmetrica.analytics.protobuf.nano.FieldData fieldData = fieldDataArr[i4];
            if (fieldData != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    fieldDataArr[i3] = fieldData;
                    fieldDataArr[i4] = null;
                }
                i3++;
            }
        }
        this.mGarbage = false;
        this.mSize = i3;
    }

    private int idealByteArraySize(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    private int idealIntArraySize(int i2) {
        return idealByteArraySize(i2 * 4) / 4;
    }

    public io.appmetrica.analytics.protobuf.nano.FieldData dataAt(int i2) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i2];
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.protobuf.nano.FieldArray)) {
            return false;
        }
        io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = (io.appmetrica.analytics.protobuf.nano.FieldArray) obj;
        if (size() != fieldArray.size()) {
            return false;
        }
        return arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public io.appmetrica.analytics.protobuf.nano.FieldData get(int i2) {
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData;
        int binarySearch = binarySearch(i2);
        if (binarySearch < 0 || (fieldData = this.mData[binarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int i2 = 17;
        for (int i3 = 0; i3 < this.mSize; i3++) {
            i2 = (((i2 * 31) + this.mFieldNumbers[i3]) * 31) + this.mData[i3].hashCode();
        }
        return i2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int i2, io.appmetrica.analytics.protobuf.nano.FieldData fieldData) {
        int binarySearch = binarySearch(i2);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        int i3 = ~binarySearch;
        int i4 = this.mSize;
        if (i3 < i4) {
            io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i3] == DELETED) {
                this.mFieldNumbers[i3] = i2;
                fieldDataArr[i3] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i4 >= this.mFieldNumbers.length) {
            gc();
            i3 = ~binarySearch(i2);
        }
        int i5 = this.mSize;
        if (i5 >= this.mFieldNumbers.length) {
            int idealIntArraySize = idealIntArraySize(i5 + 1);
            int[] iArr = new int[idealIntArraySize];
            io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr2 = new io.appmetrica.analytics.protobuf.nano.FieldData[idealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr3 = this.mData;
            java.lang.System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i6 = this.mSize - i3;
        if (i6 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i7 = i3 + 1;
            java.lang.System.arraycopy(iArr3, i3, iArr3, i7, i6);
            io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr4 = this.mData;
            java.lang.System.arraycopy(fieldDataArr4, i3, fieldDataArr4, i7, this.mSize - i3);
        }
        this.mFieldNumbers[i3] = i2;
        this.mData[i3] = fieldData;
        this.mSize++;
    }

    public void remove(int i2) {
        int binarySearch = binarySearch(i2);
        if (binarySearch >= 0) {
            io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr = this.mData;
            io.appmetrica.analytics.protobuf.nano.FieldData fieldData = fieldDataArr[binarySearch];
            io.appmetrica.analytics.protobuf.nano.FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[binarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public FieldArray(int i2) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(i2);
        this.mFieldNumbers = new int[idealIntArraySize];
        this.mData = new io.appmetrica.analytics.protobuf.nano.FieldData[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr, io.appmetrica.analytics.protobuf.nano.FieldData[] fieldDataArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!fieldDataArr[i3].equals(fieldDataArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.protobuf.nano.FieldArray m4clone() {
        int size = size();
        io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = new io.appmetrica.analytics.protobuf.nano.FieldArray(size);
        java.lang.System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i2 = 0; i2 < size; i2++) {
            io.appmetrica.analytics.protobuf.nano.FieldData fieldData = this.mData[i2];
            if (fieldData != null) {
                fieldArray.mData[i2] = fieldData.m5clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
