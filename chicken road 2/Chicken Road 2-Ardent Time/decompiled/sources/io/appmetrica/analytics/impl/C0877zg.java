package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877zg implements io.appmetrica.analytics.impl.K {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7187a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0851yg f7188b;

    public C0877zg(java.lang.String str) {
        this(str, new io.appmetrica.analytics.impl.C0851yg());
    }

    @Override // io.appmetrica.analytics.impl.K
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(android.content.Context context) {
        return a(context, new io.appmetrica.analytics.impl.Xd());
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult b(android.content.Context context) {
        int i2 = io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider.f3881a;
        java.lang.reflect.Method method = io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider.class.getMethod("requestIdentifiers", android.content.Context.class, android.os.Bundle.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f7187a);
        io.appmetrica.analytics.impl.C0851yg c0851yg = this.f7188b;
        java.lang.Object[] objArr = {context, bundle};
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo = null;
        android.os.Bundle bundle2 = (android.os.Bundle) method.invoke(null, objArr);
        c0851yg.getClass();
        if (bundle2 == null) {
            return null;
        }
        android.os.Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            java.lang.Object obj = io.appmetrica.analytics.impl.AbstractC0762v5.f6948a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new java.lang.IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo((io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? java.lang.Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(adTrackingInfo, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.Companion.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public C0877zg(java.lang.String str, io.appmetrica.analytics.impl.C0851yg c0851yg) {
        this.f7187a = str;
        this.f7188b = c0851yg;
    }

    @Override // io.appmetrica.analytics.impl.K
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(android.content.Context context, io.appmetrica.analytics.impl.Gi gi) {
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult;
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult2;
        if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            io.appmetrica.analytics.impl.Jn jn = (io.appmetrica.analytics.impl.Jn) gi;
            jn.f4522c = 0;
            adTrackingInfoResult = null;
            while (jn.b()) {
                try {
                    return b(context);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    java.lang.String message = e2.getTargetException() != null ? e2.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "exception while fetching " + this.f7187a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        java.lang.Thread.sleep(((io.appmetrica.analytics.impl.Jn) gi).f4521b);
                    } catch (java.lang.InterruptedException unused) {
                    }
                } catch (java.lang.Throwable th) {
                    adTrackingInfoResult2 = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "exception while fetching " + this.f7187a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    java.lang.Thread.sleep(((io.appmetrica.analytics.impl.Jn) gi).f4521b);
                }
            }
        } else {
            adTrackingInfoResult = new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
