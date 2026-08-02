package org.betup.model.remote.api.config;

/* loaded from: classes2.dex */
public class ProdApiConfig implements ApiConfig {
    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getApiBaseUrl() {
        return "https://betup.org/api/v6/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getStrapiApiBaseUrl() {
        return "https://cms.betup.org/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getNewApiBaseUrl() {
        return "https://betup.org/api/v7/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getMessagingBaseUrl() {
        return "https://messaging.betup.org/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getGamesBaseUrl() {
        return "https://games.betup.org/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getAnalyticsBaseUrl() {
        return "https://analytics.betup.org/api/";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getPrivacyPolicyUrl() {
        return "https://betup.org/privacy/privacy.html";
    }

    @Override // org.betup.model.remote.api.config.ApiConfig
    public String getStrapiUrl() {
        return "https://cms.betup.org";
    }
}
