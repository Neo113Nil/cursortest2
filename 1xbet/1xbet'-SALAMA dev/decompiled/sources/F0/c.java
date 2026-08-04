package F0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2492d;

    public c(int i7, int i8, String str, String str2) {
        this.f2489a = i7;
        this.f2490b = i8;
        this.f2491c = str;
        this.f2492d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i7 = this.f2489a - cVar.f2489a;
        return i7 == 0 ? this.f2490b - cVar.f2490b : i7;
    }
}
