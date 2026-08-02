package org.betup.model.remote.api.config;

/* loaded from: classes2.dex */
public interface ApiConfig {
    public static final int DEFAULT_REQUEST_TIMEOUT_IN_SEC = 22;
    public static final int DEFAULT_RETRY_COUNT = 2;
    public static final int RETRY_COUNT_FOR_CRITICAL_REQUESTS = 3;

    String getAnalyticsBaseUrl();

    String getApiBaseUrl();

    String getGamesBaseUrl();

    String getMessagingBaseUrl();

    String getNewApiBaseUrl();

    String getPrivacyPolicyUrl();

    String getStrapiApiBaseUrl();

    String getStrapiUrl();
}
