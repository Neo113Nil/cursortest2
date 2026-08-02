package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface ErrorReporter {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter DO_NOTHING = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.1
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void reportIncompleteHierarchy(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<java.lang.String> list) {
            if (classDescriptor == null) {
                getHighSpeedVideoFpsRanges(0);
            }
            if (list == null) {
                getHighSpeedVideoFpsRanges(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void reportCannotInferVisibility(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                getHighSpeedVideoFpsRanges(2);
            }
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    };

    void reportCannotInferVisibility(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor);

    void reportIncompleteHierarchy(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<java.lang.String> list);
}
