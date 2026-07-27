package N1;

/* loaded from: classes.dex */
public final class m implements Y1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2025c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2026a = f2025c;

    /* renamed from: b, reason: collision with root package name */
    public volatile Y1.a f2027b;

    public m(Y1.a aVar) {
        this.f2027b = aVar;
    }

    @Override // Y1.a
    public final Object get() {
        Object obj = this.f2026a;
        Object obj2 = f2025c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f2026a;
                    if (obj == obj2) {
                        obj = this.f2027b.get();
                        this.f2026a = obj;
                        this.f2027b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
