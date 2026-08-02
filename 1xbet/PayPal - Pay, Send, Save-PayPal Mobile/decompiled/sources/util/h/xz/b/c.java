package util.h.xz.b;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: ˊ, reason: contains not printable characters */
    public int f2625;

    /* renamed from: ˎ, reason: contains not printable characters */
    public int f2626;

    /* renamed from: ˏ, reason: contains not printable characters */
    public int f2627;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27723(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m27724(int i) {
        util.h.xz.b.mb mbVar = util.h.xz.b.mb.f2632;
        return ((mbVar.f2633[0][(i >>> 24) & 255] + mbVar.f2633[1][(i >>> 16) & 255]) ^ mbVar.f2633[2][(i >>> 8) & 255]) + mbVar.f2633[3][i & 255];
    }
}
