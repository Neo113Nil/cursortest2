package p048g4;

import N4.b;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13218c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f13219a = f13218c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f13220b;

    public m(b bVar) {
        this.f13220b = bVar;
    }

    @Override // N4.b
    public final Object get() {
        Object obj = this.f13219a;
        Object obj2 = f13218c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f13219a;
                    if (obj == obj2) {
                        obj = this.f13220b.get();
                        this.f13219a = obj;
                        this.f13220b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
