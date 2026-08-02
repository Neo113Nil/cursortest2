package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface SourceElement {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement NO_SOURCE = new kotlin.reflect.jvm.internal.impl.descriptors.SourceElement() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.1
        public final java.lang.String toString() {
            return "NO_SOURCE";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
            if (sourceFile != null) {
                return sourceFile;
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }
    };

    kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile();
}
