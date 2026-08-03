package j1;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917a implements java.util.Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final j1.C0917a f7943b = new j1.C0917a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j1.C0917a f7944c = new j1.C0917a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7945a;

    public /* synthetic */ C0917a(int i2) {
        this.f7945a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f7945a) {
            case 0:
                java.lang.Comparable a2 = (java.lang.Comparable) obj;
                java.lang.Comparable b2 = (java.lang.Comparable) obj2;
                kotlin.jvm.internal.i.e(a2, "a");
                kotlin.jvm.internal.i.e(b2, "b");
                return a2.compareTo(b2);
            default:
                java.lang.Comparable a3 = (java.lang.Comparable) obj;
                java.lang.Comparable b3 = (java.lang.Comparable) obj2;
                kotlin.jvm.internal.i.e(a3, "a");
                kotlin.jvm.internal.i.e(b3, "b");
                return b3.compareTo(a3);
        }
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
        switch (this.f7945a) {
            case 0:
                return f7944c;
            default:
                return f7943b;
        }
    }
}
