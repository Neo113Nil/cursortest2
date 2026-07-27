package sg.bigo.ads.r;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13264a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final C5449b j = new C5449b(this);
    public final int k;
    public final int l;

    public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f13264a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.k = i10;
        this.l = i11;
    }

    public int a() {
        int i = this.b;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return i;
        }
        return 1;
    }

    public int b() {
        int i = this.b;
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return i;
        }
        return 1;
    }

    public int c() {
        return 9;
    }

    public boolean d() {
        return false;
    }

    public static int a(c cVar) {
        if (cVar == null) {
            return 0;
        }
        if (cVar.d()) {
            return 1;
        }
        int a2 = cVar.a();
        int i = 3;
        if (a2 == 3 || a2 == 4) {
            return 2;
        }
        if (a2 != 5) {
            i = 6;
            if (a2 != 6) {
                return 4;
            }
        }
        return i;
    }
}
