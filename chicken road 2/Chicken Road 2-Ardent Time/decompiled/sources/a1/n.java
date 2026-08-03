package a1;

/* loaded from: classes.dex */
public class n implements a1.j {
    private static final byte BIGINT = 5;
    private static final byte BYTE_ARRAY = 8;
    private static final byte DOUBLE = 6;
    private static final byte DOUBLE_ARRAY = 11;
    private static final byte FALSE = 2;
    private static final byte FLOAT_ARRAY = 14;
    public static final a1.n INSTANCE = new a1.n();
    private static final byte INT = 3;
    private static final byte INT_ARRAY = 9;
    private static final byte LIST = 12;
    private static final boolean LITTLE_ENDIAN;
    private static final byte LONG = 4;
    private static final byte LONG_ARRAY = 10;
    private static final byte MAP = 13;
    private static final byte NULL = 0;
    private static final byte STRING = 7;
    private static final java.lang.String TAG = "StandardMessageCodec#";
    private static final byte TRUE = 1;
    private static final java.nio.charset.Charset UTF8;

    static {
        LITTLE_ENDIAN = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
        UTF8 = java.nio.charset.Charset.forName("UTF8");
    }

    public static void readAlignment(java.nio.ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static byte[] readBytes(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[readSize(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static int readSize(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static void writeAlignment(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        int size = byteArrayOutputStream.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static void writeBytes(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        writeSize(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static void writeChar(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
        } else {
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2);
        }
    }

    public static void writeDouble(java.io.ByteArrayOutputStream byteArrayOutputStream, double d2) {
        writeLong(byteArrayOutputStream, java.lang.Double.doubleToLongBits(d2));
    }

    public static void writeFloat(java.io.ByteArrayOutputStream byteArrayOutputStream, float f2) {
        writeInt(byteArrayOutputStream, java.lang.Float.floatToIntBits(f2));
    }

    public static void writeInt(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2 >>> 16);
            byteArrayOutputStream.write(i2 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i2 >>> 24);
        byteArrayOutputStream.write(i2 >>> 16);
        byteArrayOutputStream.write(i2 >>> 8);
        byteArrayOutputStream.write(i2);
    }

    public static void writeLong(java.io.ByteArrayOutputStream byteArrayOutputStream, long j2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write((byte) j2);
            byteArrayOutputStream.write((byte) (j2 >>> 8));
            byteArrayOutputStream.write((byte) (j2 >>> 16));
            byteArrayOutputStream.write((byte) (j2 >>> 24));
            byteArrayOutputStream.write((byte) (j2 >>> 32));
            byteArrayOutputStream.write((byte) (j2 >>> 40));
            byteArrayOutputStream.write((byte) (j2 >>> 48));
            byteArrayOutputStream.write((byte) (j2 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j2 >>> 56));
        byteArrayOutputStream.write((byte) (j2 >>> 48));
        byteArrayOutputStream.write((byte) (j2 >>> 40));
        byteArrayOutputStream.write((byte) (j2 >>> 32));
        byteArrayOutputStream.write((byte) (j2 >>> 24));
        byteArrayOutputStream.write((byte) (j2 >>> 16));
        byteArrayOutputStream.write((byte) (j2 >>> 8));
        byteArrayOutputStream.write((byte) j2);
    }

    public static void writeSize(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (i2 < 254) {
            byteArrayOutputStream.write(i2);
        } else if (i2 <= 65535) {
            byteArrayOutputStream.write(254);
            writeChar(byteArrayOutputStream, i2);
        } else {
            byteArrayOutputStream.write(kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
            writeInt(byteArrayOutputStream, i2);
        }
    }

    @Override // a1.j
    public java.lang.Object decodeMessage(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object readValue = readValue(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return readValue;
    }

    @Override // a1.j
    public java.nio.ByteBuffer encodeMessage(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        a1.m mVar = new a1.m();
        writeValue(mVar, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    public final java.lang.Object readValue(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return readValueOfType(byteBuffer.get(), byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap] */
    public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object arrayList;
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return java.lang.Boolean.TRUE;
            case 2:
                return java.lang.Boolean.FALSE;
            case 3:
                return java.lang.Integer.valueOf(byteBuffer.getInt());
            case 4:
                return java.lang.Long.valueOf(byteBuffer.getLong());
            case 5:
                return new java.math.BigInteger(new java.lang.String(readBytes(byteBuffer), UTF8), 16);
            case 6:
                readAlignment(byteBuffer, 8);
                return java.lang.Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new java.lang.String(readBytes(byteBuffer), UTF8);
            case 8:
                return readBytes(byteBuffer);
            case 9:
                int readSize = readSize(byteBuffer);
                int[] iArr = new int[readSize];
                readAlignment(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((readSize * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int readSize2 = readSize(byteBuffer);
                long[] jArr = new long[readSize2];
                readAlignment(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((readSize2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int readSize3 = readSize(byteBuffer);
                double[] dArr = new double[readSize3];
                readAlignment(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((readSize3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int readSize4 = readSize(byteBuffer);
                arrayList = new java.util.ArrayList(readSize4);
                while (i2 < readSize4) {
                    arrayList.add(readValue(byteBuffer));
                    i2++;
                }
                break;
            case 13:
                int readSize5 = readSize(byteBuffer);
                arrayList = new java.util.HashMap();
                while (i2 < readSize5) {
                    arrayList.put(readValue(byteBuffer), readValue(byteBuffer));
                    i2++;
                }
                break;
            case 14:
                int readSize6 = readSize(byteBuffer);
                float[] fArr = new float[readSize6];
                readAlignment(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((readSize6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            byteArrayOutputStream.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof java.lang.Number) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) {
                byteArrayOutputStream.write(3);
                writeInt(byteArrayOutputStream, ((java.lang.Number) obj).intValue());
                return;
            }
            if (obj instanceof java.lang.Long) {
                byteArrayOutputStream.write(4);
                writeLong(byteArrayOutputStream, ((java.lang.Long) obj).longValue());
                return;
            }
            if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
                byteArrayOutputStream.write(6);
                writeAlignment(byteArrayOutputStream, 8);
                writeDouble(byteArrayOutputStream, ((java.lang.Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof java.math.BigInteger)) {
                    throw new java.lang.IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                writeBytes(byteArrayOutputStream, ((java.math.BigInteger) obj).toString(16).getBytes(UTF8));
                return;
            }
        }
        if (obj instanceof java.lang.CharSequence) {
            byteArrayOutputStream.write(7);
            writeBytes(byteArrayOutputStream, obj.toString().getBytes(UTF8));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            writeBytes(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            writeSize(byteArrayOutputStream, iArr.length);
            writeAlignment(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i2 < length) {
                writeInt(byteArrayOutputStream, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            writeSize(byteArrayOutputStream, jArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                writeLong(byteArrayOutputStream, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            writeSize(byteArrayOutputStream, dArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                writeDouble(byteArrayOutputStream, dArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof java.util.List) {
            byteArrayOutputStream.write(12);
            java.util.List list = (java.util.List) obj;
            writeSize(byteArrayOutputStream, list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                writeValue(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            byteArrayOutputStream.write(13);
            java.util.Map map = (java.util.Map) obj;
            writeSize(byteArrayOutputStream, map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                writeValue(byteArrayOutputStream, entry.getKey());
                writeValue(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new java.lang.IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        writeSize(byteArrayOutputStream, fArr.length);
        writeAlignment(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            writeFloat(byteArrayOutputStream, fArr[i2]);
            i2++;
        }
    }
}
