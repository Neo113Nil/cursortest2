package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class TypeIntersectionScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private TypeIntersectionScope(java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getWorkerScope() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name2, lookupLocation), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name2, lookupLocation), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors = super.getContributedDescriptors(descriptorKindFilter, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : contributedDescriptors) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
        return kotlin.collections.CollectionsKt.plus(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj2) {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) obj2);
            }
        }), (java.lang.Iterable) list2);
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String str, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection2 = collection;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope());
            }
            kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> listOfNonEmptyScopes = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.listOfNonEmptyScopes(arrayList);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createOrSingle$descriptors = kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion.createOrSingle$descriptors(str, listOfNonEmptyScopes);
            return listOfNonEmptyScopes.size() <= 1 ? createOrSingle$descriptors : new kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope(str, createOrSingle$descriptors, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        return simpleFunctionDescriptor;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        return propertyDescriptor;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        return callableDescriptor;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String str, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
        return Companion.create(str, collection);
    }

    public /* synthetic */ TypeIntersectionScope(java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }
}
