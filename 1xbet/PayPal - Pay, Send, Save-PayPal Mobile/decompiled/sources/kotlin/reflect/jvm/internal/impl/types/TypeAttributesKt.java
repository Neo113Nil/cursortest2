package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeAttributesKt {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeAttributes toDefaultAttributes(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator.DefaultImpls.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator.INSTANCE, annotations, null, null, 6, null);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeAttributes replaceAnnotations(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        if (kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.getAnnotations(typeAttributes) == annotations) {
            return typeAttributes;
        }
        kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute annotationsAttribute = kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.getAnnotationsAttribute(typeAttributes);
        if (annotationsAttribute != null && (remove = typeAttributes.remove(annotationsAttribute)) != null) {
            typeAttributes = remove;
        }
        return (annotations.iterator().hasNext() || !annotations.isEmpty()) ? typeAttributes.plus(new kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute(annotations)) : typeAttributes;
    }
}
