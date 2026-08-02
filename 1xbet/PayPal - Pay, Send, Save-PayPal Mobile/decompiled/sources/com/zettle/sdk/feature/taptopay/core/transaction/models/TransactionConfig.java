package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048!X \u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8!X \u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "", "<init>", "()V", "", "conversationContext", "mutate$core_publicRelease", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "getConversationContext$core_publicRelease", "()Ljava/lang/String;", "Lcom/zettle/sdk/commons/network/NetworkClient;", "getNetwork$core_publicRelease", "()Lcom/zettle/sdk/commons/network/NetworkClient;", "network", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TransactionConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig.Companion(null);

    /* renamed from: getConversationContext$core_publicRelease */
    public abstract java.lang.String getGetHighSpeedVideoFpsRanges();

    /* renamed from: getNetwork$core_publicRelease */
    public abstract com.zettle.sdk.commons.network.NetworkClient getGetHighSpeedVideoFpsRangesFor();

    public abstract com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig mutate$core_publicRelease(java.lang.String conversationContext);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig$Companion;", "", "<init>", "()V", "", "context", "Lcom/zettle/sdk/commons/network/NetworkClient;", "network", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;", "invoke$core_publicRelease", "(Ljava/lang/String;Lcom/zettle/sdk/commons/network/NetworkClient;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfig invoke$core_publicRelease(java.lang.String context, com.zettle.sdk.commons.network.NetworkClient network) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionConfigImpl(context, network);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
