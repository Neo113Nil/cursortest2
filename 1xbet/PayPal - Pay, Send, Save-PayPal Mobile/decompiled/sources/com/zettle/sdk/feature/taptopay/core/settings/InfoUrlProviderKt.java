package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider$Companion;", "Landroid/content/Context;", "applicationContext", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider$Companion;Landroid/content/Context;Lcom/zettle/sdk/core/user/UserModule;)Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InfoUrlProviderKt {
    public static final com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider create(com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider.Companion companion, android.content.Context context, com.zettle.sdk.core.user.UserModule userModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        return new com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProviderImpl(context, userModule);
    }
}
