package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes3.dex */
public interface TypeParameterResolver {
    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter);

    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY();

        private EMPTY() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeParameter, "");
            return null;
        }
    }
}
