package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ThrowingScope extends kotlin.reflect.jvm.internal.impl.types.error.ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind, java.lang.String... strArr) {
        super(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScopeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final /* bridge */ /* synthetic */ java.util.Collection getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        return getContributedFunctions(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ java.util.Collection getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        return getContributedVariables(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDebugMessage());
        sb.append(", required name: ");
        sb.append(name2);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDebugMessage());
        sb.append(", required name: ");
        sb.append(name2);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDebugMessage());
        sb.append(", required name: ");
        sb.append(name2);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        throw new java.lang.IllegalStateException(getDebugMessage());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        throw new java.lang.IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThrowingScope{");
        sb.append(getDebugMessage());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
