package com.paypal.oslo.feature.oneonboarding.data.parser.registry;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0019\u0010\u0005\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u001a\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR0\u0010\u0012\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/StepComponentParserRegistry;", "", "", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lkotlin/jvm/JvmSuppressWildcards;", "parsers", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "step", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "getParserWithFragment", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;)Lkotlin/Pair;", "", "Lkotlin/reflect/KClass;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepComponentParserRegistry {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<? extends java.lang.Object>, com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public StepComponentParserRegistry(java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?>> set2 = set;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (java.lang.Object obj : set2) {
            linkedHashMap.put(((com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser) obj).getFragmentClass(), obj);
        }
        this.Camera2StreamConfigurationMap = linkedHashMap;
    }

    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, java.lang.Object> getParserWithFragment(com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step step) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.util.Collection memberProperties = kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(step.getClass()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : memberProperties) {
            if (kotlin.text.StringsKt.endsWith$default(((kotlin.reflect.KProperty1) obj).getName(), "Fragment", false, 2, (java.lang.Object) null)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            kotlin.reflect.KProperty1 kProperty1 = (kotlin.reflect.KProperty1) it.next();
            kotlin.reflect.jvm.KCallablesJvm.setAccessible(kProperty1, true);
            V call = kProperty1.call(step);
            pair = call != 0 ? kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(call.getClass()), call) : null;
            if (pair != null) {
                break;
            }
        }
        if (pair == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "No fragment found in step", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, step.get__typename())), null, 4, null);
            return null;
        }
        kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) pair.component1();
        java.lang.Object component2 = pair.component2();
        com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<?, ?> stepComponentParser = this.Camera2StreamConfigurationMap.get(kClass);
        if (stepComponentParser == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "No parser registered for fragment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fragmentClass", kClass.getSimpleName())), null, 4, null);
            return null;
        }
        return kotlin.TuplesKt.to(stepComponentParser, component2);
    }
}
