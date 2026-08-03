package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392gn {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f6008a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ho f6009b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0575o f6010c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wk f6011d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E5 f6012e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0276ca f6013f;

    public C0392gn(io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.Ho ho, io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.impl.Wk wk, io.appmetrica.analytics.impl.E5 e5, io.appmetrica.analytics.impl.C0276ca c0276ca) {
        this.f6008a = c0861z0;
        this.f6009b = ho;
        this.f6010c = c0575o;
        this.f6011d = wk;
        this.f6012e = e5;
        this.f6013f = c0276ca;
    }

    public static android.content.Intent a(android.app.Activity activity) {
        return (android.content.Intent) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new H0.b(16));
    }

    public static final android.content.Intent b(android.app.Activity activity) {
        return activity.getIntent();
    }

    public C0392gn(io.appmetrica.analytics.impl.C0861z0 c0861z0, io.appmetrica.analytics.impl.Ho ho) {
        this(c0861z0, ho, io.appmetrica.analytics.impl.C0244b4.l().a(), io.appmetrica.analytics.impl.C0244b4.l().o(), io.appmetrica.analytics.impl.C0244b4.l().h(), io.appmetrica.analytics.impl.C0244b4.l().k());
    }
}
