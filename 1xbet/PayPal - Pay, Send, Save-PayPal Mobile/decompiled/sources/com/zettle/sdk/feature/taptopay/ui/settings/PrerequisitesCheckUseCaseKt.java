package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCase$Companion;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "externalConfig", "", "isTest", "Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCase;", "create", "(Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCase$Companion;Landroid/content/Context;Lcom/zettle/sdk/commons/util/ExternalConfig;Z)Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCase;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PrerequisitesCheckUseCaseKt {
    public static final com.zettle.sdk.feature.taptopay.ui.settings.PrerequisitesCheckUseCase create(com.zettle.sdk.feature.taptopay.ui.settings.PrerequisitesCheckUseCase.Companion companion, android.content.Context context, com.zettle.sdk.commons.util.ExternalConfig externalConfig, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.zettle.sdk.feature.taptopay.ui.settings.PrerequisitesCheckUseCaseImpl(context, externalConfig, z);
    }
}
