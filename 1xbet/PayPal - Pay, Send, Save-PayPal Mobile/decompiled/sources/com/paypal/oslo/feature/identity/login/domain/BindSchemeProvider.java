package com.paypal.oslo.feature.identity.login.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider;", "", "", "getBindSchemeAvailable", "()Ljava/lang/String;", "getBindSchemeEnrolled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface BindSchemeProvider {
    public static final java.lang.String BIND_SCHEME_AVAILABLE = "bindSchemeAvailable";
    public static final java.lang.String BIND_SCHEME_ENROLLED = "bindSchemeEnrolled";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider.Companion INSTANCE = com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider.Companion.Camera2StreamConfigurationMap;

    java.lang.String getBindSchemeAvailable();

    java.lang.Object getBindSchemeEnrolled(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/BindSchemeProvider$Companion;", "", "<init>", "()V", "", "BIND_SCHEME_AVAILABLE", "Ljava/lang/String;", "BIND_SCHEME_ENROLLED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String BIND_SCHEME_AVAILABLE = "bindSchemeAvailable";
        public static final java.lang.String BIND_SCHEME_ENROLLED = "bindSchemeEnrolled";
        static final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider.Companion();

        private Companion() {
        }
    }
}
