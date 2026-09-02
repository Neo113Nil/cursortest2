package p0;

/* renamed from: p0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0963o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f8278a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8280c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8281d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f8282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8283f;

    public AbstractC0963o(com.google.android.gms.common.internal.a aVar, int i2, android.os.Bundle bundle) {
        this.f8283f = aVar;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f8280c = aVar;
        this.f8278a = bool;
        this.f8279b = false;
        this.f8281d = i2;
        this.f8282e = bundle;
    }

    public abstract void a(m0.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f8278a = null;
        }
        synchronized (this.f8280c.f2609k) {
            this.f8280c.f2609k.remove(this);
        }
    }
}
