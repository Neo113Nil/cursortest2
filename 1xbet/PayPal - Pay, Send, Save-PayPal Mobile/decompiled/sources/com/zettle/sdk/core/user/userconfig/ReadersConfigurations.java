package com.zettle.sdk.core.user.userconfig;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R.\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/zettle/sdk/core/user/userconfig/ReadersConfigurations;", "", "", "getAccountTypeSelectionEnabled", "()Z", "accountTypeSelectionEnabled", "", "", "Lcom/zettle/sdk/core/user/AmountRange;", "getAmountLimits", "()Ljava/util/Map;", "amountLimits", "getEnabled", "()Ljava/lang/Boolean;", "enabled", "Lcom/zettle/sdk/core/user/Installments;", "getInstallments", "()Lcom/zettle/sdk/core/user/Installments;", "installments", "", "getNetworkTimeoutSeconds", "()Ljava/lang/Long;", "networkTimeoutSeconds", "Lcom/zettle/sdk/core/user/Offline;", "getOffline", "()Lcom/zettle/sdk/core/user/Offline;", "offline", "Lcom/zettle/sdk/core/user/ReaderProvisioning;", "getReaderProvisioning", "()Lcom/zettle/sdk/core/user/ReaderProvisioning;", "readerProvisioning", "Lcom/zettle/sdk/core/user/ReaderConfig;", "getReaderSettings", "readerSettings"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ReadersConfigurations {
    boolean getAccountTypeSelectionEnabled();

    java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.zettle.sdk.core.user.AmountRange>> getAmountLimits();

    java.lang.Boolean getEnabled();

    com.zettle.sdk.core.user.Installments getInstallments();

    java.lang.Long getNetworkTimeoutSeconds();

    com.zettle.sdk.core.user.Offline getOffline();

    com.zettle.sdk.core.user.ReaderProvisioning getReaderProvisioning();

    java.util.Map<java.lang.String, com.zettle.sdk.core.user.ReaderConfig> getReaderSettings();
}
