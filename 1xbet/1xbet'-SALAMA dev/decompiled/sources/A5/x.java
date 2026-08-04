package A5;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class x implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f685a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f687c;

    static {
        f686b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f687c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i7) {
        int iPosition = byteBuffer.position() % i7;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i7) - iPosition);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i7 = byteBuffer.get() & 255;
        if (i7 < 254) {
            return i7;
        }
        return i7 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        int size = byteArrayOutputStream.size() % i7;
        if (size != 0) {
            for (int i8 = 0; i8 < i7 - size; i8++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (f686b) {
            byteArrayOutputStream.write(i7);
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7 >>> 16);
            byteArrayOutputStream.write(i7 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i7 >>> 24);
        byteArrayOutputStream.write(i7 >>> 16);
        byteArrayOutputStream.write(i7 >>> 8);
        byteArrayOutputStream.write(i7);
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f686b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        if (i7 < 254) {
            byteArrayOutputStream.write(i7);
            return;
        }
        if (i7 > 65535) {
            byteArrayOutputStream.write(255);
            h(byteArrayOutputStream, i7);
            return;
        }
        byteArrayOutputStream.write(254);
        if (f686b) {
            byteArrayOutputStream.write(i7);
            byteArrayOutputStream.write(i7 >>> 8);
        } else {
            byteArrayOutputStream.write(i7 >>> 8);
            byteArrayOutputStream.write(i7);
        }
    }

    @Override // A5.n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        k(wVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wVar.size());
        byteBufferAllocateDirect.put(wVar.a(), 0, wVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // A5.n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objE = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objE;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b7, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f687c;
        int i7 = 0;
        switch (b7) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int iD = d(byteBuffer);
                int[] iArr = new int[iD];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((iD * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int iD2 = d(byteBuffer);
                long[] jArr = new long[iD2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((iD2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int iD3 = d(byteBuffer);
                double[] dArr = new double[iD3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((iD3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int iD4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD4);
                while (i7 < iD4) {
                    arrayList.add(e(byteBuffer));
                    i7++;
                }
                return arrayList;
            case 13:
                int iD5 = d(byteBuffer);
                HashMap map = new HashMap();
                while (i7 < iD5) {
                    map.put(e(byteBuffer), e(byteBuffer));
                    i7++;
                }
                return map;
            case 14:
                int iD6 = d(byteBuffer);
                float[] fArr = new float[iD6];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((iD6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i7 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z4 = obj instanceof Number;
        Charset charset = f687c;
        if (z4) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                h(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                i(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                g(byteArrayOutputStream, 8);
                i(byteArrayOutputStream, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(byteArrayOutputStream, bytes.length);
                byteArrayOutputStream.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(byteArrayOutputStream, bytes2.length);
            byteArrayOutputStream.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            byte[] bArr = (byte[]) obj;
            j(byteArrayOutputStream, bArr.length);
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            j(byteArrayOutputStream, iArr.length);
            g(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i7 < length) {
                h(byteArrayOutputStream, iArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            j(byteArrayOutputStream, jArr.length);
            g(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i7 < length2) {
                i(byteArrayOutputStream, jArr[i7]);
                i7++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            j(byteArrayOutputStream, dArr.length);
            g(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i7 < length3) {
                i(byteArrayOutputStream, Double.doubleToLongBits(dArr[i7]));
                i7++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            j(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            j(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(byteArrayOutputStream, entry.getKey());
                k(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        j(byteArrayOutputStream, fArr.length);
        g(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i7 < length4) {
            h(byteArrayOutputStream, Float.floatToIntBits(fArr[i7]));
            i7++;
        }
    }
}
