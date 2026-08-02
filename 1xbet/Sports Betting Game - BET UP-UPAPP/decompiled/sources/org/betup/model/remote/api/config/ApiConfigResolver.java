package org.betup.model.remote.api.config;

/* loaded from: classes2.dex */
public final class ApiConfigResolver {
    private ApiConfigResolver() {
    }

    public static ApiConfig getApiConfig() {
        if ("release".equals("debug")) {
            return new LocalApiConfig();
        }
        if ("release".equals("release")) {
            return new ProdApiConfig();
        }
        return new TestApiConfig();
    }
}
