package com.zettle.sdk.core.user.userconfig;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t0\tj\u0002`\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019"}, d2 = {"Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "", "<init>", "()V", "", "", "getBetaFeatures", "()Ljava/util/Set;", "betaFeatures", "", "Lcom/zettle/sdk/core/user/CurrencyCode;", "Lcom/zettle/sdk/core/user/TransactionConfigEntry;", "Lcom/zettle/sdk/core/user/userconfig/ConfigByCurrency;", "getConfigByCurrency", "()Ljava/util/Map;", "configByCurrency", "getCurrency", "()Lcom/zettle/sdk/core/user/CurrencyCode;", "currency", "getManualAppEvents", "manualAppEvents", "getUserUUID", "()Ljava/lang/String;", "userUUID", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UserConfig {
    public abstract java.util.Set<java.lang.String> getBetaFeatures();

    public abstract java.util.Map<com.zettle.sdk.core.user.CurrencyCode, java.util.Map<java.lang.String, com.zettle.sdk.core.user.TransactionConfigEntry>> getConfigByCurrency();

    public abstract com.zettle.sdk.core.user.CurrencyCode getCurrency();

    public abstract java.util.Map<java.lang.String, java.lang.String> getManualAppEvents();

    public abstract java.lang.String getUserUUID();

    private UserConfig() {
    }

    public /* synthetic */ UserConfig(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
