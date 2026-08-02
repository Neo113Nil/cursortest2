package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public interface MemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion Companion = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getHighSpeedVideoFpsRanges;

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames();

    public static final class DefaultImpls {
        public static void recordLookup(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.recordLookup(memberScope, name2, lookupLocation);
        }
    }

    public static final class Empty extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
        public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
            return kotlin.collections.SetsKt.emptySet();
        }
    }

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion();
        private static final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.name.Name) obj));
            }
        };

        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> getALL_NAME_FILTER() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        static /* synthetic */ boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return true;
        }
    }
}
