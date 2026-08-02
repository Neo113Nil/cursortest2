package p000;

import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch1 {
    static {
        Logger.getLogger(ch1.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m934a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        int size2 = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            qa0 qa0Var = (qa0) obj;
            int i3 = i + 1;
            bArr[i] = qa0Var.f6440a.mo2563j();
            i += 2;
            bArr[i3] = qa0Var.f6441b.mo2563j();
        }
        byte[] bArr2 = qe1.f6482b;
        int i4 = 0;
        while (i4 < size) {
            byte[] bArr3 = bArr[i4];
            int i5 = i4 + 1;
            byte[] bArr4 = bArr[i5];
            if (qe1.m4091a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i6 = 0; i6 < i4; i6++) {
                            arrayList2.add(bArr[i6]);
                        }
                        while (i4 < size) {
                            byte[] bArr5 = bArr[i4];
                            byte[] bArr6 = bArr[i4 + 1];
                            if (qe1.m4091a(bArr5, bArr2)) {
                                int i7 = 0;
                                for (int i8 = 0; i8 <= bArr6.length; i8++) {
                                    if (i8 == bArr6.length || bArr6[i8] == 44) {
                                        byte[] bArrM3196a = C0427lb.f4748d.m3196a(new String(bArr6, i7, i8 - i7, AbstractC0358jg.f3919a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrM3196a);
                                        i7 = i8 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i4 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i5] = C0427lb.f4748d.m3196a(new String(bArr4, AbstractC0358jg.f3919a));
            }
            i4 += 2;
        }
        return bArr;
    }
}
