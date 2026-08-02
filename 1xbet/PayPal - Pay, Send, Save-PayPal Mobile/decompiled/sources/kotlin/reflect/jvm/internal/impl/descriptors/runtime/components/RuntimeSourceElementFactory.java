package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class RuntimeSourceElementFactory implements kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement {
        private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement getHighSpeedVideoFpsRangesFor;

        public RuntimeSourceElement(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement reflectJavaElement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectJavaElement, "");
            this.getHighSpeedVideoFpsRangesFor = reflectJavaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement getJavaElement() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getName());
            sb.append(": ");
            sb.append(getJavaElement());
            return sb.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceFile, "");
            return sourceFile;
        }
    }

    private RuntimeSourceElementFactory() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement source(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaElement, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement) javaElement);
    }
}
