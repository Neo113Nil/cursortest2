package com.paypal.oslo.feature.searchandintelligence.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/config/SearchAndIntelligenceFlags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "stageSseEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getStageSseEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "stageSseEnabled", "mockQuickStartPromptsEnabled$delegate", "getMockQuickStartPromptsEnabled", "mockQuickStartPromptsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchAndIntelligenceFlags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags.class, "stageSseEnabled", "getStageSseEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags.class, "mockQuickStartPromptsEnabled", "getMockQuickStartPromptsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: mockQuickStartPromptsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty mockQuickStartPromptsEnabled;

    /* renamed from: stageSseEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty stageSseEnabled;

    private SearchAndIntelligenceFlags() {
        super("s_and_i");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getStageSseEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) stageSseEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMockQuickStartPromptsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) mockQuickStartPromptsEnabled.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags searchAndIntelligenceFlags = new com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags();
        INSTANCE = searchAndIntelligenceFlags;
        stageSseEnabled = searchAndIntelligenceFlags.create("stage_sse_enabled");
        mockQuickStartPromptsEnabled = searchAndIntelligenceFlags.create("mock_quick_start_prompts_enabled");
        $stable = 8;
    }
}
