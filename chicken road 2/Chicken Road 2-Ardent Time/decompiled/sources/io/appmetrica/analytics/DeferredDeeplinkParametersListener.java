package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface DeferredDeeplinkParametersListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink parameters can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain valid deferred deeplink parameters."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f3374a;

        Error(java.lang.String str) {
            this.f3374a = str;
        }

        public java.lang.String getDescription() {
            return this.f3374a;
        }
    }

    void onError(io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error error, java.lang.String str);

    void onParametersLoaded(java.util.Map<java.lang.String, java.lang.String> map);
}
