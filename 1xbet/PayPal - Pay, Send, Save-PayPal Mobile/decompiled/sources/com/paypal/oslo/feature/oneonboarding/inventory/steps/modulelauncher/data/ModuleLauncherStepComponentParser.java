package com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/data/ModuleLauncherStepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/modulelauncher/domain/ModuleLauncherStepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "viewComponentRegistry", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;)V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ModuleLauncherStepComponentFragment;)Lkotlin/Pair;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModuleLauncherStepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment> fragmentClass;
    private final com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ModuleLauncherStepComponentParser(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewComponentParserRegistry, "");
        this.getHighSpeedVideoFpsRangesFor = viewComponentParserRegistry;
        this.fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment.class);
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(step.getComponent());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parseComponent = this.getHighSpeedVideoFpsRangesFor.parseComponent((com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment.Component) it.next());
            if (parseComponent != null) {
                arrayList.add(parseComponent);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) ((kotlin.Pair) it2.next()).getFirst());
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList5, (java.lang.Iterable) ((kotlin.Pair) it3.next()).getSecond());
        }
        java.util.ArrayList arrayList6 = arrayList5;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (arrayList4.isEmpty()) {
            return null;
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.steps.modulelauncher.domain.ModuleLauncherStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId()), arrayList4, defaultConstructorMarker), arrayList6);
    }
}
