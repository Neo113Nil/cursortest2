package p155w1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f17525a;

    static {
        ArrayList arrayList = new ArrayList();
        f17525a = arrayList;
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
                int i7 = fileInputStream.read(bArr, 0, length);
                if (i7 < length) {
                    int i8 = length - i7;
                    while (i8 > 0) {
                        int i9 = fileInputStream.read(bArr2, 0, i8);
                        System.arraycopy(bArr2, 0, bArr, length - i8, i9);
                        i8 -= i9;
                    }
                }
                fileInputStream.close();
                return b(bArr);
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            AbstractC0997i0.q("Invalid frame data file: " + file + " => " + e7.toString());
            e7.toString();
            return 3;
        }
    }

    public static int b(byte[] bArr) {
        D2 d7;
        D2 d8;
        D2 d9;
        int i7 = 3;
        int i8 = 4;
        ArrayList<D2> arrayList = f17525a;
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
                D2[] d2ArrValues = D2.values();
                int length = d2ArrValues.length;
                int i14 = 0;
                while (true) {
                    d7 = D2.UNKNOWN;
                    if (i14 >= length) {
                        d8 = d7;
                        break;
                    }
                    d8 = d2ArrValues[i14];
                    if (i13 == d8.f17363a) {
                        break;
                    }
                    i14++;
                }
                arrayList2.add(d8);
                for (D2 d10 : arrayList) {
                    if (i13 == d10.f17363a) {
                        treeSet.add(d10);
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
                    D2[] d2ArrValues2 = D2.values();
                    int length2 = d2ArrValues2.length;
                    while (true) {
                        if (i9 >= length2) {
                            d9 = d7;
                            break;
                        }
                        d9 = d2ArrValues2[i9];
                        if (i13 == d9.f17363a) {
                            break;
                        }
                        i9++;
                    }
                    sb.append(d9);
                    AbstractC0997i0.q(sb.toString());
                    e7.toString();
                    i8 = 5;
                    return i8 != 2 ? i8 : i8;
                }
            } catch (Exception e8) {
                e = e8;
                AbstractC0997i0.q("Invalid Payload: " + e.toString());
                e.toString();
                i8 = 5;
            } catch (VirtualMachineError e9) {
                e = e9;
                AbstractC0997i0.q("Invalid Payload: " + e.toString());
                e.toString();
                i8 = 5;
            }
        }
        if (i8 != 2 && treeSet.size() < arrayList.size()) {
            return 6;
        }
    }
}
