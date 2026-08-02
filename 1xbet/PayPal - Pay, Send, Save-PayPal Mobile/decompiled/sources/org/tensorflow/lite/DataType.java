package org.tensorflow.lite;

/* loaded from: classes18.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);

    private final int getHighSpeedVideoFpsRanges;

    DataType(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final int byteSize() {
        switch (this) {
            case FLOAT32:
            case INT32:
                return 4;
            case UINT8:
            case INT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
            case BOOL:
                return -1;
            case INT16:
                return 2;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataType error: DataType ");
                sb.append(this);
                sb.append(" is not supported yet");
                throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
