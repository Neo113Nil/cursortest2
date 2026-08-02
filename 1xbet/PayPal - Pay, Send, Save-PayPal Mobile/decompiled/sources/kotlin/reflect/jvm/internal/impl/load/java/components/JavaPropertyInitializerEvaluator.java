package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public interface JavaPropertyInitializerEvaluator {
    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> getInitializerConstant(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor);

    public static final class DoNothing implements kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator {
        public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing();

        private DoNothing() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> getInitializerConstant(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaField, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
            return null;
        }
    }
}
