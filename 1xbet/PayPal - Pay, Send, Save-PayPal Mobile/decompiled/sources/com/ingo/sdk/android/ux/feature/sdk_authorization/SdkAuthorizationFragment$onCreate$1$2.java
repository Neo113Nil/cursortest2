package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SdkAuthorizationFragment$onCreate$1$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Fragment got configuration ".concat(java.lang.String.valueOf(configurationResponse)), null, 2, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse) {
        getHighSpeedVideoFpsRangesFor(configurationResponse);
        return kotlin.Unit.INSTANCE;
    }

    SdkAuthorizationFragment$onCreate$1$2(java.lang.Object obj) {
        super(1, obj, com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.class, "onConfigurationResponse", "onConfigurationResponse(Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;)V", 0);
    }
}
