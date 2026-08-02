package w1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f17519a;

    static {
        ArrayList arrayList = new ArrayList();
        f17519a = arrayList;
        arrayList.add(D2.SESSION_ID);
        arrayList.add(D2.SESSION_INFO);
        arrayList.add(D2.REPORTED_ID);
    }

    public static int a(File file) {
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            byte[] bArr2 = new byte[length];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int read = fileInputStream.read(bArr, 0, length);
                if (read < length) {
                    int i7 = length - read;
                    while (i7 > 0) {
                        int read2 = fileInputStream.read(bArr2, 0, i7);
                        System.arraycopy(bArr2, 0, bArr, length - i7, read2);
                        i7 -= read2;
                    }
                }
                fileInputStream.close();
                return b(bArr);
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            AbstractC1706i0.q("Invalid frame data file: " + file + " => " + e7.toString());
            e7.toString();
            return 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(byte[] bArr) {
        D2 d22;
        D2 d23;
        D2 d24;
        int i7 = 3;
        int i8 = 4;
        ArrayList arrayList = f17519a;
        ArrayList arrayList2 = new ArrayList();
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            try {
                if (bArr.length <= i10) {
                    i8 = 2;
                    break;
                }
                if (bArr.length - i10 <= 0) {
                    break;
                }
                int i11 = i10 + 1;
                if (bArr.length - i11 < i7) {
                    break;
                }
                byte b7 = bArr[i11];
                byte b8 = bArr[i10 + 2];
                byte b9 = bArr[i10 + 3];
                byte[] bArr2 = new byte[i7];
                bArr2[0] = b7;
                bArr2[1] = b8;
                bArr2[2] = b9;
                int i12 = i10 + 4;
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr2, 0, bArr3, 1, i7);
                int i13 = ByteBuffer.wrap(bArr3).getInt();
                D2[] values = D2.values();
                int length = values.length;
                int i14 = 0;
                while (true) {
                    d22 = D2.UNKNOWN;
                    if (i14 >= length) {
                        d23 = d22;
                        break;
                    }
                    d23 = values[i14];
                    if (i13 == d23.f17357a) {
                        break;
                    }
                    i14++;
                }
                arrayList2.add(d23);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    D2 d25 = (D2) it.next();
                    if (i13 == d25.f17357a) {
                        treeSet.add(d25);
                    }
                }
                if (bArr.length - i12 < 8) {
                    break;
                }
                if (bArr.length - (i10 + 12) < 8) {
                    break;
                }
                int i15 = i10 + 20;
                byte[] bArr4 = new byte[4];
                if (bArr.length - i15 < 4) {
                    break;
                }
                System.arraycopy(bArr, i15, bArr4, 0, 4);
                int i16 = i10 + 24;
                int i17 = ByteBuffer.wrap(bArr4).getInt();
                byte[] bArr5 = new byte[i17];
                if (bArr.length - i16 < i17) {
                    break;
                }
                System.arraycopy(bArr, i16, bArr5, 0, i17);
                int i18 = i16 + i17;
                try {
                    new JSONObject(new String(bArr5));
                    if (bArr.length - i18 < 4) {
                        break;
                    }
                    i10 = i18 + 4;
                    i7 = 3;
                } catch (JSONException e7) {
                    StringBuilder sb = new StringBuilder("Invalid Frame Payload: ");
                    D2[] values2 = D2.values();
                    int length2 = values2.length;
                    while (true) {
                        if (i9 >= length2) {
                            d24 = d22;
                            break;
                        }
                        d24 = values2[i9];
                        if (i13 == d24.f17357a) {
                            break;
                        }
                        i9++;
                    }
                    sb.append(d24);
                    AbstractC1706i0.q(sb.toString());
                    e7.toString();
                    i8 = 5;
                    return i8 != 2 ? i8 : i8;
                }
            } catch (Exception e8) {
                e = e8;
                AbstractC1706i0.q("Invalid Payload: " + e.toString());
                e.toString();
                i8 = 5;
                if (i8 != 2) {
                }
            } catch (VirtualMachineError e9) {
                e = e9;
                AbstractC1706i0.q("Invalid Payload: " + e.toString());
                e.toString();
                i8 = 5;
                if (i8 != 2) {
                }
            }
        }
        if (i8 != 2 && treeSet.size() < arrayList.size()) {
            return 6;
        }
    }
}
