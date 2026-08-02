package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class RuntimeErrorReporter implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeErrorReporter();

    private RuntimeErrorReporter() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void reportIncompleteHierarchy(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Incomplete hierarchy for class ");
        sb.append(classDescriptor.getName());
        sb.append(", unresolved classes ");
        sb.append(list);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void reportCannotInferVisibility(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        throw new java.lang.IllegalStateException("Cannot infer visibility for ".concat(java.lang.String.valueOf(callableMemberDescriptor)));
    }
}
