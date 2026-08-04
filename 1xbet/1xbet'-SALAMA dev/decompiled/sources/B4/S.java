package B4;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S f1125g = new S(0, 0, 0, 0, null, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I f1131f;

    public S(int i7, int i8, long j, long j3, I i9, int i10) {
        this.f1126a = i7;
        this.f1127b = i8;
        this.f1128c = j;
        this.f1129d = j3;
        this.f1130e = i10;
        this.f1131f = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s7 = (S) obj;
        if (this.f1126a != s7.f1126a || this.f1127b != s7.f1127b || this.f1128c != s7.f1128c || this.f1129d != s7.f1129d || this.f1130e != s7.f1130e) {
            return false;
        }
        I i7 = s7.f1131f;
        I i8 = this.f1131f;
        if (i8 != null) {
            return i8.equals(i7);
        }
        return i7 == null;
    }

    public final int hashCode() {
        int i7 = ((this.f1126a * 31) + this.f1127b) * 31;
        long j = this.f1128c;
        int i8 = (i7 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f1129d;
        int iE = (p136t.e.e(this.f1130e) + ((i8 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        I i9 = this.f1131f;
        return iE + (i9 != null ? i9.hashCode() : 0);
    }
}
