package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaArrayAnnotationArgument extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument {
    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaArrayAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object[] objArr) {
        super(name2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument> getElements() {
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            arrayList.add(factory.create(obj, null));
        }
        return arrayList;
    }
}
