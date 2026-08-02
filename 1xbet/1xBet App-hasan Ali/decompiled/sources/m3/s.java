package m3;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f18101a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2095e f18103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18104d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f18105e;
    public final /* synthetic */ AbstractC2095e f;

    public s(AbstractC2095e abstractC2095e, int i, Bundle bundle) {
        this.f = abstractC2095e;
        Boolean bool = Boolean.TRUE;
        this.f18103c = abstractC2095e;
        this.f18101a = bool;
        this.f18102b = false;
        this.f18104d = i;
        this.f18105e = bundle;
    }

    public abstract void a(j3.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f18101a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f18103c.f18032l) {
            this.f18103c.f18032l.remove(this);
        }
    }
}
