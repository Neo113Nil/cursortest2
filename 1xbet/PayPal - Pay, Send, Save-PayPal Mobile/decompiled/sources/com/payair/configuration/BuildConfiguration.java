package com.payair.configuration;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/payair/configuration/BuildConfiguration;", "Lcom/payair/configuration/ClientConfigurationInterface;", "<init>", "()V", "", "getBackendBasePath", "()Ljava/lang/String;", "getMdesFirebaseId", "", "getMpWalletVersion", "()I", "getPayairFirebaseInstanceId"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuildConfiguration implements com.payair.configuration.ClientConfigurationInterface {
    @Override // com.payair.configuration.ClientConfigurationInterface
    public final java.lang.String getBackendBasePath() {
        return "";
    }

    @Override // com.payair.configuration.ClientConfigurationInterface
    public final java.lang.String getMdesFirebaseId() {
        return com.payair.csdk.BuildConfig.MdesFirebaseId;
    }

    @Override // com.payair.configuration.ClientConfigurationInterface
    public final int getMpWalletVersion() {
        return 1;
    }

    @Override // com.payair.configuration.ClientConfigurationInterface
    public final java.lang.String getPayairFirebaseInstanceId() {
        return com.payair.csdk.BuildConfig.PayairFirebaseId;
    }
}
