package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Vd f5140a = new io.appmetrica.analytics.impl.Vd();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f5141b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f5142c = io.appmetrica.analytics.coreutils.internal.network.UserAgent.getFor(io.appmetrica.analytics.BuildConfig.LIBRARY_PACKAGE_NAME, "8.0.0", "50147728");

    public final synchronized io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder a(io.appmetrica.analytics.impl.Td td) {
        java.lang.Object obj;
        try {
            java.util.LinkedHashMap linkedHashMap = f5141b;
            obj = linkedHashMap.get(td);
            if (obj == null) {
                obj = new io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder(new io.appmetrica.analytics.impl.C0793wa(io.appmetrica.analytics.impl.C0560na.f6484I.y(), td), td.name());
                linkedHashMap.put(td, obj);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder) obj;
    }

    public static final io.appmetrica.analytics.networktasks.internal.NetworkTask a(io.appmetrica.analytics.impl.X4 x4) {
        io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter();
        io.appmetrica.analytics.impl.Zg zg = new io.appmetrica.analytics.impl.Zg(aESRSARequestBodyEncrypter);
        io.appmetrica.analytics.impl.C0846yb c0846yb = new io.appmetrica.analytics.impl.C0846yb(x4);
        return new io.appmetrica.analytics.networktasks.internal.NetworkTask(new io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor(), new io.appmetrica.analytics.impl.C0607p5(x4.f5255a), new io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy(f5140a.a(io.appmetrica.analytics.impl.Td.REPORT)), new io.appmetrica.analytics.impl.C0748uh(x4, zg, c0846yb, new io.appmetrica.analytics.networktasks.internal.FullUrlFormer(zg, c0846yb), new io.appmetrica.analytics.networktasks.internal.RequestDataHolder(), new io.appmetrica.analytics.networktasks.internal.ResponseDataHolder(new io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker()), x4.i(), x4.p(), x4.u(), aESRSARequestBodyEncrypter), u0.AbstractC0995a.q(new io.appmetrica.analytics.impl.C0496ko()), f5142c);
    }
}
