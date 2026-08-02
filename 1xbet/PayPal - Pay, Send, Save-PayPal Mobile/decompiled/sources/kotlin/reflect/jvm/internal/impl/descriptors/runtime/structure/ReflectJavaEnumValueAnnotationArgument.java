package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument {
    private final java.lang.Enum<?> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Enum<?> r3) {
        super(name2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
        this.getHighSpeedVideoFpsRangesFor = r3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public final kotlin.reflect.jvm.internal.impl.name.ClassId getEnumClassId() {
        java.lang.Class<?> cls = this.getHighSpeedVideoFpsRangesFor.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public final kotlin.reflect.jvm.internal.impl.name.Name getEntryName() {
        return kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.getHighSpeedVideoFpsRangesFor.name());
    }
}
