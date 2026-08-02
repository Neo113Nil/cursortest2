package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument {
    private final java.lang.Class<?> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClassObjectAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Class<?> cls) {
        super(name2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.Camera2StreamConfigurationMap = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getReferencedType() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory.create(this.Camera2StreamConfigurationMap);
    }
}
