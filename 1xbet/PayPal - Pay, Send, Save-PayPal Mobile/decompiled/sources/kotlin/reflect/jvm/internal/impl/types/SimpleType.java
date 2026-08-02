package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class SimpleType extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType implements kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes);

    public SimpleType() {
        super(null);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.StringsKt.append(sb, "[", kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            kotlin.collections.CollectionsKt.joinTo(getArguments(), sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "<", (r14 & 8) != 0 ? "" : ">", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        }
        if (isMarkedNullable()) {
            sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        }
        return sb.toString();
    }
}
