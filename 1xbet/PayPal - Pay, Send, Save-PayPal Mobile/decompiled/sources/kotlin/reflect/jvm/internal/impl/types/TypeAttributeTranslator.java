package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public interface TypeAttributeTranslator {
    kotlin.reflect.jvm.internal.impl.types.TypeAttributes toAttributes(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

    public static final class DefaultImpls {
        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeAttributes toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator typeAttributeTranslator, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i & 2) != 0) {
                typeConstructor = null;
            }
            if ((i & 4) != 0) {
                declarationDescriptor = null;
            }
            return typeAttributeTranslator.toAttributes(annotations, typeConstructor, declarationDescriptor);
        }
    }
}
