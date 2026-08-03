package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770vd {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6968a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ka f6969b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0818x9 f6970c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ae f6971d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0626po f6972e;

    /* renamed from: f, reason: collision with root package name */
    public volatile io.appmetrica.analytics.internal.IdentifiersResult f6973f;

    public C0770vd(android.content.Context context, io.appmetrica.analytics.impl.Ka ka) {
        this(context, ka, io.appmetrica.analytics.impl.AbstractC0796wd.a(context), new io.appmetrica.analytics.impl.Ae(context), new io.appmetrica.analytics.impl.C0626po());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult a() {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = this.f6973f;
        if (identifiersResult != null && identifiersResult.status == io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK) {
            io.appmetrica.analytics.impl.C0626po c0626po = this.f6972e;
            java.lang.String str = identifiersResult.id;
            c0626po.getClass();
            if (io.appmetrica.analytics.impl.C0626po.a(str)) {
                return identifiersResult;
            }
        }
        try {
            io.appmetrica.analytics.impl.C0818x9 c0818x9 = this.f6970c;
            c0818x9.f7103a.lock();
            c0818x9.f7104b.a();
            identifiersResult = this.f6973f;
        } catch (java.lang.Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK) {
            io.appmetrica.analytics.impl.C0626po c0626po2 = this.f6972e;
            java.lang.String str2 = identifiersResult.id;
            c0626po2.getClass();
            if (io.appmetrica.analytics.impl.C0626po.a(str2)) {
                io.appmetrica.analytics.impl.C0818x9 c0818x92 = this.f6970c;
                c0818x92.f7104b.b();
                c0818x92.f7103a.unlock();
                return identifiersResult == null ? identifiersResult : new io.appmetrica.analytics.internal.IdentifiersResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        java.lang.String a2 = io.appmetrica.analytics.impl.Ja.a(io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(this.f6971d.f4057a, "uuid.dat"));
        this.f6972e.getClass();
        if (!io.appmetrica.analytics.impl.C0626po.a(a2)) {
            a2 = this.f6971d.a(this.f6969b.a(this.f6968a));
        }
        this.f6972e.getClass();
        if (io.appmetrica.analytics.impl.C0626po.a(a2)) {
            io.appmetrica.analytics.internal.IdentifiersResult identifiersResult2 = new io.appmetrica.analytics.internal.IdentifiersResult(a2, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK, null);
            try {
                this.f6973f = identifiersResult2;
            } catch (java.lang.Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        io.appmetrica.analytics.impl.C0818x9 c0818x922 = this.f6970c;
        c0818x922.f7104b.b();
        c0818x922.f7103a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C0770vd(android.content.Context context, io.appmetrica.analytics.impl.Ka ka, io.appmetrica.analytics.impl.C0818x9 c0818x9, io.appmetrica.analytics.impl.Ae ae, io.appmetrica.analytics.impl.C0626po c0626po) {
        this.f6968a = context;
        this.f6969b = ka;
        this.f6970c = c0818x9;
        this.f6971d = ae;
        this.f6972e = c0626po;
        try {
            c0818x9.a();
            ae.a();
            c0818x9.b();
        } catch (java.lang.Throwable unused) {
            this.f6970c.b();
        }
    }
}
