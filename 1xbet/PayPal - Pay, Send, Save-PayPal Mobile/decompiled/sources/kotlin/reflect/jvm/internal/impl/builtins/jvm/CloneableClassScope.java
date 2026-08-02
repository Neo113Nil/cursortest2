package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class CloneableClassScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope {
    private static final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        super(storageManager, classDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl create = kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl.create(getContainingClass(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), Camera2StreamConfigurationMap, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
        create.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, getContainingClass().getThisAsReceiverParameter(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(getContainingClass()).getAnyType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PROTECTED);
        return kotlin.collections.CollectionsKt.listOf(create);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.name.Name getCLONE_NAME() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Camera2StreamConfigurationMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("clone");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        Camera2StreamConfigurationMap = identifier;
    }
}
