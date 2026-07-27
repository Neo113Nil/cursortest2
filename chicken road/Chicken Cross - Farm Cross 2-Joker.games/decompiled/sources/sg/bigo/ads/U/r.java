package sg.bigo.ads.U;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f12567a;
    public final int b;

    public r(int i, int i2) {
        this.f12567a = i;
        this.b = i2;
    }

    public static r a(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        if ((f * 1.0f) / f2 > (1.0f * f3) / f4) {
            f4 = (f3 / f) * f2;
        } else {
            f3 = (f4 / f2) * f;
        }
        return new r((int) f3, (int) f4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.b == this.b && rVar.f12567a == this.f12567a;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.f12567a;
    }

    public final String toString() {
        return this.f12567a + "x" + this.b;
    }

    public final boolean a() {
        return this.f12567a > 0 && this.b > 0;
    }
}
