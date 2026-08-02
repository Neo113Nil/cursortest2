package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public abstract class ReflectJavaAnnotationArgument implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory Factory = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory(null);
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;

    private ReflectJavaAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        this.getHighResolutionOutputSizeshNQ4ISI = name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Factory {
        private Factory() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument create(java.lang.Object obj, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(obj.getClass()) ? new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaEnumValueAnnotationArgument(name2, (java.lang.Enum) obj) : obj instanceof java.lang.annotation.Annotation ? new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationAsAnnotationArgument(name2, (java.lang.annotation.Annotation) obj) : obj instanceof java.lang.Object[] ? new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaArrayAnnotationArgument(name2, (java.lang.Object[]) obj) : obj instanceof java.lang.Class ? new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassObjectAnnotationArgument(name2, (java.lang.Class) obj) : new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaLiteralAnnotationArgument(name2, obj);
        }

        public /* synthetic */ Factory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReflectJavaAnnotationArgument(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(name2);
    }
}
