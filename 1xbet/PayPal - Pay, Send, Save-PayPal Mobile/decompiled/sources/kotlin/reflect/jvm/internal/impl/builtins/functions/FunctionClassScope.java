package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public final class FunctionClassScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor functionClassDescriptor) {
        super(storageManager, functionClassDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionClassDescriptor, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor containingClass = getContainingClass();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingClass, "");
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind = ((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) containingClass).getFunctionTypeKind();
        return kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE) ? kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory.create((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) getContainingClass(), false)) : kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE) ? kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor.Factory.create((kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor) getContainingClass(), true)) : kotlin.collections.CollectionsKt.emptyList();
    }
}
