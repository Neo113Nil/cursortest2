package com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/data/TerminalStepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/terminal/domain/TerminalStepComponentConfig;", "<init>", "()V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TerminalStepComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;", "fragmentClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TerminalStepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalStepComponentConfig> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TerminalStepComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalStepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment step) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment.ContextualInfo> contextualInfo = step.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
                if (m16675toContextualInfoJkG0rbE != null) {
                    arrayList2.add(m16675toContextualInfoJkG0rbE);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment.Component component = step.getComponent();
        com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType terminalComponentType = component.getReviewPendingComponentFragment() != null ? com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.REVIEW_PENDING : component.getAdditionalInfoNeededComponentFragment() != null ? com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.ADDITIONAL_INFO_NEEDED : component.getRegionNotSupportedComponentFragment() != null ? com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.REGION_NOT_SUPPORTED : component.getProductNotSetupComponentFragment() != null ? com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalComponentType.PRODUCT_NOT_SETUP : null;
        if (terminalComponentType != null) {
            return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.domain.TerminalStepComponentConfig(m16608constructorimpl, terminalComponentType, defaultConstructorMarker), arrayList);
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Unknown terminal component type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, step.getComponent().get__typename())), null, null, 12, null);
        return null;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment> getFragmentClass() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment.class);
    }
}
