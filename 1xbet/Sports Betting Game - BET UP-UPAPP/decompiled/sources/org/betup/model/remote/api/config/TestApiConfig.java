package org.betup.model.remote.api.config;

/* loaded from: classes2.dex */
public class TestApiConfig implements ApiConfig {
    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getApiBaseUrl() {
        return "https://qbetapp.info/api/v6/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getStrapiApiBaseUrl() {
        return "https://cms.qbetapp.info/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getNewApiBaseUrl() {
        return "https://qbetapp.info/api/v7/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getMessagingBaseUrl() {
        return "https://messaging.qbetapp.info/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getGamesBaseUrl() {
        return "https://games.qbetapp.info/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getAnalyticsBaseUrl() {
        return "https://analytics.qbetapp.info/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getPrivacyPolicyUrl() {
        return "https://betup.org/privacy/privacy.html";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getStrapiUrl() {
        return "https://cms.qbetapp.info";
    }
}
