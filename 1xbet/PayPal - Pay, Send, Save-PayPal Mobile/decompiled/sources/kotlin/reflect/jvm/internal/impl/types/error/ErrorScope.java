package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public class ErrorScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind getHighSpeedVideoSizes;

    public ErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScopeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        this.getHighSpeedVideoSizes = errorScopeKind;
        java.lang.String debugMessage = errorScopeKind.getDebugMessage();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String format = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        this.getHighSpeedVideoFpsRanges = format;
    }

    protected final java.lang.String getDebugMessage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.lang.String format = java.lang.String.format(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS.getDebugText(), java.util.Arrays.copyOf(new java.lang.Object[]{name2}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special(format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
        return new kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor(special);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorPropertyGroup();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return kotlin.collections.SetsKt.setOf(new kotlin.reflect.jvm.internal.impl.types.error.ErrorFunctionDescriptor(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorClass()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorScope{");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
    }
}
