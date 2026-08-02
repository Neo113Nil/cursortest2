package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public interface JavaClassesTracker {
    void reportClass(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor javaClassDescriptor);

    public static final class Default implements kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker {
        public static final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public final void reportClass(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor javaClassDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassDescriptor, "");
        }
    }
}
