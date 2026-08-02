package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Companion;", "Lcom/zettle/sdk/commons/network/NetworkClient;", "client", "Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;", "runTimeCaching", "Lcom/zettle/sdk/commons/network/ResponseParser;", "responseParser", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Companion;Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;Lcom/zettle/sdk/commons/network/ResponseParser;)Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationInitRepositoryImplKt {
    public static final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository create(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Companion companion, com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching runTimeCaching, com.zettle.sdk.commons.network.ResponseParser responseParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runTimeCaching, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl(networkClient, runTimeCaching, responseParser);
    }
}
