package M1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f1093a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1094b;

    public /* synthetic */ n(int i2, java.lang.Object[] objArr) {
        this.f1093a = i2;
        this.f1094b = objArr;
    }

    public boolean a() {
        return this.f1093a < ((java.util.ArrayList) this.f1094b).size();
    }

    public n(m0.b bVar, int i2) {
        p0.AbstractC0966r.c(bVar);
        this.f1094b = bVar;
        this.f1093a = i2;
    }

    public n(int i2) {
        if (i2 > 0) {
            this.f1094b = new java.lang.Object[i2];
            return;
        }
        throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
    }

    public n(java.util.ArrayList arrayList) {
        this.f1094b = arrayList;
    }
}
