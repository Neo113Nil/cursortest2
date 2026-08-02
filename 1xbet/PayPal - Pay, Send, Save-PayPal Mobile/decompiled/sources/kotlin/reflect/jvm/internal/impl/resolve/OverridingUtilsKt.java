package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> java.util.Collection<H> selectMostSpecificInEachOverridableGroup(java.util.Collection<? extends H> collection, kotlin.jvm.functions.Function1<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (collection.size() <= 1) {
            return collection;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.SmartSet create = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        while (true) {
            java.util.LinkedList linkedList2 = linkedList;
            if (!linkedList2.isEmpty()) {
                java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) linkedList);
                final kotlin.reflect.jvm.internal.impl.utils.SmartSet create2 = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
                java.util.Collection<a.d> extractMembersOverridableInBothWays = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.extractMembersOverridableInBothWays(first, linkedList2, function1, new kotlin.jvm.functions.Function1(create2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                    private final kotlin.reflect.jvm.internal.impl.utils.SmartSet getHighResolutionOutputSizeshNQ4ISI;

                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj) {
                        return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, obj);
                    }

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = create2;
                    }
                });
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extractMembersOverridableInBothWays, "");
                if (extractMembersOverridableInBothWays.size() == 1 && create2.isEmpty()) {
                    java.lang.Object single = kotlin.collections.CollectionsKt.single(extractMembersOverridableInBothWays);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(single, "");
                    create.add(single);
                } else {
                    a.d dVar = (java.lang.Object) kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, function1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dVar, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke = function1.invoke(dVar);
                    kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSet = create2;
                    for (a.d dVar2 : extractMembersOverridableInBothWays) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(dVar2);
                        if (!kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.isMoreSpecific(invoke, function1.invoke(dVar2))) {
                            smartSet.add(dVar2);
                        }
                    }
                    if (!smartSet.isEmpty()) {
                        create.addAll(smartSet);
                    }
                    create.add(dVar);
                }
            } else {
                return create;
            }
        }
    }

    static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSet, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        smartSet.add(obj);
        return kotlin.Unit.INSTANCE;
    }
}
