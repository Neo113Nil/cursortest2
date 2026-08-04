package X5;

import W5.g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    static {
        Logger.getLogger(w.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Z5.b bVar = (Z5.b) it.next();
            int i8 = i7 + 1;
            bArr[i7] = bVar.f7886a.t();
            i7 += 2;
            bArr[i8] = bVar.f7887b.t();
        }
        Logger logger = g2.f7224a;
        int i9 = 0;
        while (i9 < size) {
            byte[] bArr2 = bArr[i9];
            int i10 = i9 + 1;
            byte[] bArr3 = bArr[i10];
            byte[] bArr4 = g2.f7225b;
            if (g2.a(bArr2, bArr4)) {
                for (byte b7 : bArr3) {
                    if (b7 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i11 = 0; i11 < i9; i11++) {
                            arrayList2.add(bArr[i11]);
                        }
                        while (i9 < size) {
                            byte[] bArr5 = bArr[i9];
                            byte[] bArr6 = bArr[i9 + 1];
                            if (g2.a(bArr5, bArr4)) {
                                int i12 = 0;
                                for (int i13 = 0; i13 <= bArr6.length; i13++) {
                                    if (i13 == bArr6.length || bArr6[i13] == 44) {
                                        byte[] bArrA = F3.e.f2737c.a(new String(bArr6, i12, i13 - i12, D3.f.f1717a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i12 = i13 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i9 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i10] = F3.e.f2737c.a(new String(bArr3, D3.f.f1717a));
            }
            i9 += 2;
        }
        return bArr;
    }
}
