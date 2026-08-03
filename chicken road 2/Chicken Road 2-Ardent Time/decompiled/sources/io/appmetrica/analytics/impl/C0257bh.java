package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257bh extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0797we f5581b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage f5582c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0837y2 f5583d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0268c2 f5584e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0655r2 f5585f;

    public C0257bh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0797we c0797we) {
        this(x4, c0797we, ((io.appmetrica.analytics.impl.Rm) io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.T1.class)).create(x4.getContext()), new io.appmetrica.analytics.impl.C0837y2(x4.getContext()), new io.appmetrica.analytics.impl.C0268c2(), new io.appmetrica.analytics.impl.C0655r2(x4.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
        x4.f5256b.toString();
        if (!x4.t.c() || !x4.x()) {
            return false;
        }
        io.appmetrica.analytics.impl.T1 t12 = (io.appmetrica.analytics.impl.T1) this.f5582c.read();
        java.util.List list = t12.f4992a;
        io.appmetrica.analytics.impl.C0811x2 c0811x2 = t12.f4993b;
        io.appmetrica.analytics.impl.C0837y2 c0837y2 = this.f5583d;
        c0837y2.getClass();
        io.appmetrica.analytics.impl.T1 t13 = null;
        io.appmetrica.analytics.impl.C0811x2 a2 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(28) ? io.appmetrica.analytics.impl.C0733u2.a(c0837y2.f7133a, c0837y2.f7134b) : null;
        java.util.List list2 = t12.f4994c;
        java.util.List list3 = (java.util.List) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f5585f.f6714a, "getting available providers", "location manager", java.util.Collections.emptyList(), new io.appmetrica.analytics.impl.C0630q2());
        io.appmetrica.analytics.impl.C0797we c0797we = this.f5581b;
        android.content.Context context = this.f4907a.f5255a;
        c0797we.getClass();
        java.util.ArrayList a3 = new io.appmetrica.analytics.impl.Pi(context, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager()).a();
        if (io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(a3, list)) {
            a3 = null;
        }
        if (a3 != null || !io.appmetrica.analytics.impl.AbstractC0522lo.a(c0811x2, a2) || !io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a3 != null) {
                list = a3;
            }
            t13 = new io.appmetrica.analytics.impl.T1(list, a2, list3);
        }
        if (t13 != null) {
            io.appmetrica.analytics.impl.C0481k9 c0481k9 = x4.f5268n;
            io.appmetrica.analytics.impl.P5 a4 = io.appmetrica.analytics.impl.P5.a(p5, t13.f4992a, t13.f4993b, this.f5584e, t13.f4994c);
            c0481k9.a(a4, io.appmetrica.analytics.impl.Rk.a(c0481k9.f6266c.b(a4), a4.f4821i));
            long currentTimeSeconds = c0481k9.f6272i.currentTimeSeconds();
            c0481k9.f6274k = currentTimeSeconds;
            c0481k9.f6264a.a(currentTimeSeconds).b();
            this.f5582c.save(t13);
            return false;
        }
        if (!x4.A()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0481k9 c0481k92 = x4.f5268n;
        io.appmetrica.analytics.impl.P5 a5 = io.appmetrica.analytics.impl.P5.a(p5, t12.f4992a, t12.f4993b, this.f5584e, t12.f4994c);
        c0481k92.a(a5, io.appmetrica.analytics.impl.Rk.a(c0481k92.f6266c.b(a5), a5.f4821i));
        long currentTimeSeconds2 = c0481k92.f6272i.currentTimeSeconds();
        c0481k92.f6274k = currentTimeSeconds2;
        c0481k92.f6264a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0257bh(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0797we c0797we, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage protobufStateStorage, io.appmetrica.analytics.impl.C0837y2 c0837y2, io.appmetrica.analytics.impl.C0268c2 c0268c2, io.appmetrica.analytics.impl.C0655r2 c0655r2) {
        super(x4);
        this.f5581b = c0797we;
        this.f5582c = protobufStateStorage;
        this.f5583d = c0837y2;
        this.f5584e = c0268c2;
        this.f5585f = c0655r2;
    }
}
