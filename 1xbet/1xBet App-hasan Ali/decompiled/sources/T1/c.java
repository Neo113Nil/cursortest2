package T1;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f5616k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5617l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5618m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5619n;

    public c(int i, int i5, String str, String str2) {
        this.f5616k = i;
        this.f5617l = i5;
        this.f5618m = str;
        this.f5619n = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i = this.f5616k - cVar.f5616k;
        return i == 0 ? this.f5617l - cVar.f5617l : i;
    }
}
