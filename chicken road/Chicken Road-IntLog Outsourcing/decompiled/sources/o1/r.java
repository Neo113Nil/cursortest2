package o1;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f11594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11597d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f11598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11599f;

    public r(com.google.android.gms.common.internal.a aVar, int i2, Bundle bundle) {
        this.f11599f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f11596c = aVar;
        this.f11594a = bool;
        this.f11595b = false;
        this.f11597d = i2;
        this.f11598e = bundle;
    }

    public abstract void a(l1.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f11594a = null;
        }
        synchronized (this.f11596c.f5008p) {
            this.f11596c.f5008p.remove(this);
        }
    }
}
