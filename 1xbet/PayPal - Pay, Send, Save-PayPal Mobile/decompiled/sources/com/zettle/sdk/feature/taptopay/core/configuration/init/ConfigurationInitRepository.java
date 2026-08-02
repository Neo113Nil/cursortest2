package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;", "", "", "organizationId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result;", "getConfigurationInit", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Companion", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ConfigurationInitRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Companion.getHighResolutionOutputSizeshNQ4ISI;

    kotlinx.coroutines.flow.Flow<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> getConfigurationInit(java.lang.String organizationId);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result;", "", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result {
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.reason = failureReason;
            }

            /* renamed from: getReason$core_publicRelease, reason: from getter */
            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result;", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;", "configurationInit", "", "isCache", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;Z)V", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;", "getConfigurationInit", "()Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInitRemote;", "Z", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result {
            private final com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote configurationInit;
            private final boolean isCache;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote configurationInitRemote, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInitRemote, "");
                this.configurationInit = configurationInitRemote;
                this.isCache = z;
            }

            public final com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote getConfigurationInit() {
                return this.configurationInit;
            }

            /* renamed from: isCache, reason: from getter */
            public final boolean getIsCache() {
                return this.isCache;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Companion();

        private Companion() {
        }
    }
}
