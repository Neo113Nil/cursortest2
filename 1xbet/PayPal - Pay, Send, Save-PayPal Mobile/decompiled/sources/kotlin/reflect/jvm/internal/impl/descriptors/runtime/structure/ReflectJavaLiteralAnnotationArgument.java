package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaLiteralAnnotationArgument extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument {
    private final java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaLiteralAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
        super(name2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.getHighSpeedVideoSizes = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    public final java.lang.Object getValue() {
        return this.getHighSpeedVideoSizes;
    }
}
