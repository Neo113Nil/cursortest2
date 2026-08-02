package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AnnotationsTypeAttribute extends kotlin.reflect.jvm.internal.impl.types.TypeAttribute<kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute> {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoFpsRanges;

    public AnnotationsTypeAttribute(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        this.getHighSpeedVideoFpsRanges = annotations;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute intersect(kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute add(kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(this.getHighSpeedVideoFpsRanges, annotationsTypeAttribute.getHighSpeedVideoFpsRanges));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute) {
            return kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute) obj).getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final kotlin.reflect.KClass<? extends kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute> getKey() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute.class);
    }
}
