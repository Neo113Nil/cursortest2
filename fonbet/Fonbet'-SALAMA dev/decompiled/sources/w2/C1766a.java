package w2;

import A1.C0045t0;
import C1.C0095a;
import java.util.ArrayList;
import v2.AbstractC1664a;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17952c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17953d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17954e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17955f;

    public C1766a(ArrayList arrayList, int i7, int i8, int i9, float f7, String str) {
        this.f17950a = arrayList;
        this.f17951b = i7;
        this.f17952c = i8;
        this.f17953d = i9;
        this.f17954e = f7;
        this.f17955f = str;
    }

    public static C1766a a(C0095a c0095a) {
        byte[] bArr;
        int i7;
        int i8;
        float f7;
        String str;
        try {
            c0095a.E(4);
            int t7 = (c0095a.t() & 3) + 1;
            if (t7 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int t8 = c0095a.t() & 31;
            int i9 = 0;
            while (true) {
                bArr = AbstractC1664a.f17084a;
                if (i9 >= t8) {
                    break;
                }
                int y4 = c0095a.y();
                int i10 = c0095a.f1463a;
                c0095a.E(y4);
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                byte[] bArr3 = new byte[y4 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, y4);
                arrayList.add(bArr3);
                i9++;
            }
            int t9 = c0095a.t();
            for (int i11 = 0; i11 < t9; i11++) {
                int y5 = c0095a.y();
                int i12 = c0095a.f1463a;
                c0095a.E(y5);
                byte[] bArr4 = (byte[]) c0095a.f1465c;
                byte[] bArr5 = new byte[y5 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, y5);
                arrayList.add(bArr5);
            }
            if (t8 > 0) {
                v2.l y7 = AbstractC1664a.y((byte[]) arrayList.get(0), t7, ((byte[]) arrayList.get(0)).length);
                int i13 = y7.f17124e;
                int i14 = y7.f17125f;
                float f8 = y7.f17126g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(y7.f17120a), Integer.valueOf(y7.f17121b), Integer.valueOf(y7.f17122c));
                i7 = i13;
                i8 = i14;
                f7 = f8;
            } else {
                i7 = -1;
                i8 = -1;
                f7 = 1.0f;
                str = null;
            }
            return new C1766a(arrayList, t7, i7, i8, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C0045t0.a(e7, "Error parsing AVC config");
        }
    }
}
