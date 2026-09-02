package i1;

/* renamed from: i1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197p implements x1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3323b;

    public /* synthetic */ C0197p(int i2, java.lang.Object obj) {
        this.f3322a = i2;
        this.f3323b = obj;
    }

    @Override // x1.c
    public final java.util.Iterator iterator() {
        switch (this.f3322a) {
            case 0:
                return ((java.util.List) this.f3323b).iterator();
            default:
                return (java.util.Iterator) this.f3323b;
        }
    }
}
