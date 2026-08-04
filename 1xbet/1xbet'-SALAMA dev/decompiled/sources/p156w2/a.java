package p156w2;

import A1.C0045t0;
import C1.C0095a;
import java.util.ArrayList;
import p151v2.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17961f;

    public a(ArrayList arrayList, int i7, int i8, int i9, float f7, String str) {
        this.f17956a = arrayList;
        this.f17957b = i7;
        this.f17958c = i8;
        this.f17959d = i9;
        this.f17960e = f7;
        this.f17961f = str;
    }

    public static a a(C0095a c0095a) throws C0045t0 {
        byte[] bArr;
        int i7;
        int i8;
        float f7;
        String str;
        try {
            c0095a.E(4);
            int iT = (c0095a.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = c0095a.t() & 31;
            int i9 = 0;
            while (true) {
                bArr = p151v2.a.f17090a;
                if (i9 >= iT2) {
                    break;
                }
                int iY = c0095a.y();
                int i10 = c0095a.f1463a;
                c0095a.E(iY);
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                byte[] bArr3 = new byte[iY + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, iY);
                arrayList.add(bArr3);
                i9++;
            }
            int iT3 = c0095a.t();
            for (int i11 = 0; i11 < iT3; i11++) {
                int iY2 = c0095a.y();
                int i12 = c0095a.f1463a;
                c0095a.E(iY2);
                byte[] bArr4 = (byte[]) c0095a.f1465c;
                byte[] bArr5 = new byte[iY2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, iY2);
                arrayList.add(bArr5);
            }
            if (iT2 > 0) {
                l lVarY = p151v2.a.y((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i13 = lVarY.f17130e;
                int i14 = lVarY.f17131f;
                float f8 = lVarY.f17132g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(lVarY.f17126a), Integer.valueOf(lVarY.f17127b), Integer.valueOf(lVarY.f17128c));
                i7 = i13;
                i8 = i14;
                f7 = f8;
            } else {
                i7 = -1;
                i8 = -1;
                f7 = 1.0f;
                str = null;
            }
            return new a(arrayList, iT, i7, i8, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C0045t0.a(e7, "Error parsing AVC config");
        }
    }
}
