package Q;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f462a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f465d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f467f;

    public p(com.google.android.gms.common.internal.a aVar, int i2, Bundle bundle) {
        this.f467f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f464c = aVar;
        this.f462a = bool;
        this.f463b = false;
        this.f465d = i2;
        this.f466e = bundle;
    }

    public abstract void a(N.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f462a = null;
        }
        synchronized (this.f464c.f742k) {
            this.f464c.f742k.remove(this);
        }
    }
}
