package S0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1352a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1355d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f1356e;
    public final /* synthetic */ com.google.android.gms.common.internal.a f;

    public o(com.google.android.gms.common.internal.a aVar, int i3, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f1354c = aVar;
        this.f1352a = bool;
        this.f1353b = false;
        this.f1355d = i3;
        this.f1356e = bundle;
    }

    public abstract void a(P0.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1352a = null;
        }
        synchronized (this.f1354c.f2581k) {
            this.f1354c.f2581k.remove(this);
        }
    }
}
