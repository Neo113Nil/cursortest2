package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"", "isUatMode", "", "clientId", "Lcom/izettle/android/auth/BackendEnvironment;", "makeProdEnvironment", "(ZLjava/lang/String;)Lcom/izettle/android/auth/BackendEnvironment;", "makeSandboxEnvironment", "makeStagingEnvironment"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MakeEnvironmentKt {
    public static final com.izettle.android.auth.BackendEnvironment makeSandboxEnvironment(final boolean z, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.izettle.android.auth.BackendEnvironment(str, z) { // from class: com.zettle.sdk.core.auth.MakeEnvironmentKt$makeSandboxEnvironment$1
            private final java.lang.String clientId;
            private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> fallbackUrls;
            private final java.lang.String serviceLookupUrl = "https://service-lookup.zettlesandbox.com/";

            {
                java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> sandboxUatFallbackUrls;
                this.clientId = str;
                if (!z) {
                    sandboxUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.sandboxFallbackUrls();
                } else {
                    sandboxUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.sandboxUatFallbackUrls();
                }
                this.fallbackUrls = sandboxUatFallbackUrls;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getClientId() {
                return this.clientId;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getServiceLookupUrl() {
                return this.serviceLookupUrl;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls() {
                return this.fallbackUrls;
            }
        };
    }

    public static final com.izettle.android.auth.BackendEnvironment makeStagingEnvironment(final boolean z, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.izettle.android.auth.BackendEnvironment(str, z) { // from class: com.zettle.sdk.core.auth.MakeEnvironmentKt$makeStagingEnvironment$1
            private final java.lang.String clientId;
            private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> fallbackUrls;
            private final java.lang.String serviceLookupUrl = "https://service-lookup.izettletest.com/";

            {
                java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> testUatFallbackUrls;
                this.clientId = str;
                if (!z) {
                    testUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.testFallbackUrls();
                } else {
                    testUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.testUatFallbackUrls();
                }
                this.fallbackUrls = testUatFallbackUrls;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getClientId() {
                return this.clientId;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getServiceLookupUrl() {
                return this.serviceLookupUrl;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls() {
                return this.fallbackUrls;
            }
        };
    }

    public static final com.izettle.android.auth.BackendEnvironment makeProdEnvironment(final boolean z, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.izettle.android.auth.BackendEnvironment(str, z) { // from class: com.zettle.sdk.core.auth.MakeEnvironmentKt$makeProdEnvironment$1
            private final java.lang.String clientId;
            private final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> fallbackUrls;
            private final java.lang.String serviceLookupUrl = "https://service-lookup.izettle.com/";

            {
                java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> prodUatFallbackUrls;
                this.clientId = str;
                if (!z) {
                    prodUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.prodFallbackUrls();
                } else {
                    prodUatFallbackUrls = com.zettle.sdk.core.auth.FallbackUrlsKt.prodUatFallbackUrls();
                }
                this.fallbackUrls = prodUatFallbackUrls;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getClientId() {
                return this.clientId;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.lang.String getServiceLookupUrl() {
                return this.serviceLookupUrl;
            }

            @Override // com.izettle.android.auth.BackendEnvironment
            public final java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls> getFallbackUrls() {
                return this.fallbackUrls;
            }
        };
    }
}
