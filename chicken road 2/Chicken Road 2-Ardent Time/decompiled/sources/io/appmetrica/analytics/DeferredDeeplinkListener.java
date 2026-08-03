package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f3372a;

        Error(java.lang.String str) {
            this.f3372a = str;
        }

        public java.lang.String getDescription() {
            return this.f3372a;
        }
    }

    void onDeeplinkLoaded(java.lang.String str);

    void onError(io.appmetrica.analytics.DeferredDeeplinkListener.Error error, java.lang.String str);
}
