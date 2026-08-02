package com.paypal.oslo.feature.oneonboarding.data.parser.registry;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0019\u0010\u0005\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\n\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000bJO\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2$\u0010\u0013\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "", "", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lkotlin/jvm/JvmSuppressWildcards;", "parsers", "<init>", "(Ljava/util/Set;)V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "getParserWithFragment", "(Ljava/lang/Object;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parseComponent", "T", "components", "Lkotlin/Function2;", "block", "parseComponents", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "Lkotlin/reflect/KClass;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewComponentParserRegistry {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<?>, com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ViewComponentParserRegistry(java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>> set2 = set;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (java.lang.Object obj : set2) {
            linkedHashMap.put(((com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser) obj).getFragmentClass(), obj);
        }
        this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
    }

    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parseComponent(java.lang.Object component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        kotlin.Pair<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>, java.lang.Object> parserWithFragment = getParserWithFragment(component);
        if (parserWithFragment == null) {
            return null;
        }
        com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?> component1 = parserWithFragment.component1();
        java.lang.Object component2 = parserWithFragment.component2();
        kotlin.jvm.internal.Intrinsics.checkNotNull(component1, "");
        return component1.parse(component2);
    }

    public final <T> T parseComponents(java.util.List<? extends java.lang.Object> components, kotlin.jvm.functions.Function2<? super java.util.List<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig>, ? super java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>, ? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = components.iterator();
        while (true) {
            kotlin.Unit unit = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parseComponent = parseComponent(it.next());
            if (parseComponent == null) {
                parseComponent = kotlin.TuplesKt.to(null, null);
            }
            com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig component1 = parseComponent.component1();
            java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> component2 = parseComponent.component2();
            if (component1 != null) {
                arrayList.add(component1);
                if (component2 != null) {
                    arrayList2.addAll(component2);
                }
                unit = kotlin.Unit.INSTANCE;
            }
            if (unit != null) {
                arrayList3.add(unit);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return block.invoke(arrayList, arrayList2);
    }

    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?>, java.lang.Object> getParserWithFragment(java.lang.Object component) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.util.Collection memberProperties = kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(component.getClass()));
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
            V call = kProperty1.call(component);
            pair = call != 0 ? kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(call.getClass()), call) : null;
            if (pair != null) {
                break;
            }
        }
        if (pair == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "No fragment found in component", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("componentClass", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(component.getClass()).getSimpleName())), null, 4, null);
            return null;
        }
        kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) pair.component1();
        java.lang.Object component2 = pair.component2();
        com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<?, ?> viewComponentParser = this.getHighSpeedVideoFpsRangesFor.get(kClass);
        if (viewComponentParser == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "No parser registered for fragment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fragmentClass", kClass.getSimpleName())), null, 4, null);
            return null;
        }
        return kotlin.TuplesKt.to(viewComponentParser, component2);
    }
}
