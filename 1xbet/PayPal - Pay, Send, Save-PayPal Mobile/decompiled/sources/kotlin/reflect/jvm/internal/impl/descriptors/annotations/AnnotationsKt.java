package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes5.dex */
public final class AnnotationsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations composeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations2, "");
        return annotations.isEmpty() ? annotations2 : annotations2.isEmpty() ? annotations : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations(annotations, annotations2);
    }
}
