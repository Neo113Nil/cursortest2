package g4;

/* renamed from: g4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1140m implements N4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13212c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f13213a = f13212c;

    /* renamed from: b, reason: collision with root package name */
    public volatile N4.b f13214b;

    public C1140m(N4.b bVar) {
        this.f13214b = bVar;
    }

    @Override // N4.b
    public final Object get() {
        Object obj = this.f13213a;
        Object obj2 = f13212c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f13213a;
                    if (obj == obj2) {
                        obj = this.f13214b.get();
                        this.f13213a = obj;
                        this.f13214b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
