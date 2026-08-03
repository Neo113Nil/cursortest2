package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4594a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.DeferredDeeplinkListener f4595b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.DeferredDeeplinkParametersListener f4596c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.J7 f4597d;

    public L7(boolean z2) {
        this.f4594a = z2;
    }

    public final void a(int i2) {
        io.appmetrica.analytics.impl.J7 j7 = this.f4597d;
        java.lang.String str = j7 == null ? null : j7.f4490c;
        io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener = this.f4595b;
        if (deferredDeeplinkListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            deferredDeeplinkListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? io.appmetrica.analytics.DeferredDeeplinkListener.Error.UNKNOWN : io.appmetrica.analytics.DeferredDeeplinkListener.Error.NO_REFERRER : io.appmetrica.analytics.DeferredDeeplinkListener.Error.PARSE_ERROR : io.appmetrica.analytics.DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(str, ""));
            this.f4595b = null;
        }
        io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f4596c;
        if (deferredDeeplinkParametersListener != null) {
            if (i2 == 0) {
                throw null;
            }
            int i4 = i2 - 1;
            deferredDeeplinkParametersListener.onError(i4 != 0 ? i4 != 1 ? i4 != 2 ? io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.UNKNOWN : io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.NO_REFERRER : io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.PARSE_ERROR : io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(str, ""));
            this.f4596c = null;
        }
    }

    public final void a() {
        io.appmetrica.analytics.impl.J7 j7 = this.f4597d;
        if (j7 != null) {
            java.lang.String str = j7.f4489b;
            if (str != null) {
                io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener = this.f4595b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f4595b = null;
                }
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(this.f4597d.f4488a)) {
                    java.util.Map<java.lang.String, java.lang.String> map = this.f4597d.f4488a;
                    io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f4596c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f4596c = null;
                        return;
                    }
                    return;
                }
                java.lang.String str2 = this.f4597d.f4490c;
                io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f4596c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(str2, ""));
                    this.f4596c = null;
                    return;
                }
                return;
            }
            if (j7.f4490c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
