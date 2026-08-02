package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AnnotationsTypeAttributeKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};
    private static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    public static final kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute getAnnotationsAttribute(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return (kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute) getHighSpeedVideoFpsRangesFor.getValue(typeAttributes, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : annotations;
    }

    static {
        kotlin.properties.ReadOnlyProperty generateNullableAccessor = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.generateNullableAccessor(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(generateNullableAccessor, "");
        getHighSpeedVideoFpsRangesFor = generateNullableAccessor;
    }
}
