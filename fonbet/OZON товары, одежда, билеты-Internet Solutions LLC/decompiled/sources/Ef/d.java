package Ef;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Jf.c[] f7867a;

    /* renamed from: b, reason: collision with root package name */
    private int f7868b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7869c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7870d = false;

    public d(Jf.c... cVarArr) {
        this.f7867a = cVarArr;
    }

    public static d g(Jf.c... cVarArr) {
        return new d(cVarArr);
    }

    public final d a(int i11) {
        this.f7869c = i11;
        return this;
    }

    public final d b(int i11) {
        this.f7868b = i11;
        return this;
    }

    public final Jf.c[] c() {
        return this.f7867a;
    }

    public final int d() {
        return this.f7869c;
    }

    public final int e() {
        return this.f7868b;
    }

    public final boolean f() {
        return this.f7870d;
    }

    public final d h() {
        this.f7870d = true;
        return this;
    }
}
