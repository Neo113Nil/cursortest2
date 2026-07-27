package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Eg implements K {

    /* renamed from: a, reason: collision with root package name */
    public final String f6751a;

    /* renamed from: b, reason: collision with root package name */
    public final Dg f6752b;

    public Eg(String str) {
        this(str, new Dg());
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context) {
        return a(context, new C0617ee());
    }

    public final AdTrackingInfoResult b(Context context) {
        int i2 = AdvIdentifiersProvider.f6382a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f6751a);
        Dg dg = this.f6752b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        dg.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = C5.f6619a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.Companion.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public Eg(String str, Dg dg) {
        this.f6751a = str;
        this.f6752b = dg;
    }

    @Override // io.appmetrica.analytics.impl.K
    public final AdTrackingInfoResult a(Context context, Li li) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            Ln ln = (Ln) li;
            ln.f7113c = 0;
            adTrackingInfoResult = null;
            while (ln.b()) {
                try {
                    return b(context);
                } catch (InvocationTargetException e3) {
                    String message = e3.getTargetException() != null ? e3.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f6751a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((Ln) li).f7112b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f6751a + " adv_id: " + th.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((Ln) li).f7112b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
