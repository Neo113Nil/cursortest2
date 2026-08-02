package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class DefaultTypeAttributeTranslator implements kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator {
    public static final kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator INSTANCE = new kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator();

    private DefaultTypeAttributeTranslator() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes toAttributes(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        if (annotations.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.create(kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute(annotations)));
    }
}
