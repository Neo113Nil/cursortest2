package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        return substitute(typeSubstitutor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorClassDescriptor(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        super(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorModule(), name2, kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS, kotlin.collections.CollectionsKt.emptyList(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl create = kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl.create(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        create.initialize(kotlin.collections.CollectionsKt.emptyList(), kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        java.lang.String obj = create.getName().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScope createErrorScope = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(errorScopeKind, obj, "");
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScope errorScope = createErrorScope;
        create.setReturnType(new kotlin.reflect.jvm.internal.impl.types.error.ErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CLASS, new java.lang.String[0]), errorScope, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CLASS, null, false, new java.lang.String[0], 24, null));
        initialize(errorScope, kotlin.collections.SetsKt.setOf(create), create);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        java.lang.String obj = getName().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(errorScopeKind, obj, typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    public final java.lang.String toString() {
        java.lang.String asString = getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }
}
