package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "<init>", "()V", "", "asString", "()Ljava/lang/String;", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class JvmFunctionSignature {
    /* renamed from: asString */
    public abstract java.lang.String getGetHighSpeedVideoFpsRangesFor();

    private JvmFunctionSignature() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "", "methodName", "getMethodName", "()Ljava/lang/String;", "methodDesc", "getMethodDesc", "asString", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class KotlinFunction extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.getHighSpeedVideoSizes = method;
            this.getHighSpeedVideoFpsRangesFor = method.asString();
        }

        public final java.lang.String getMethodName() {
            return this.getHighSpeedVideoSizes.getName();
        }

        public final java.lang.String getMethodDesc() {
            return this.getHighSpeedVideoSizes.getDesc();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: asString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "asString", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class KotlinConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.getHighSpeedVideoSizes = method;
            this.getHighSpeedVideoFpsRangesFor = method.asString();
        }

        public final java.lang.String getConstructorDesc() {
            return this.getHighSpeedVideoSizes.getDesc();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: asString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "asString", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class JavaMethod extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.reflect.Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(java.lang.reflect.Method method) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.method = method;
        }

        public final java.lang.reflect.Method getMethod() {
            return this.method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: asString */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return kotlin.reflect.jvm.internal.RuntimeTypeMapperKt.access$getSignature(this.method);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "asString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "getConstructor", "()Ljava/lang/reflect/Constructor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class JavaConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.reflect.Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(java.lang.reflect.Constructor<?> constructor) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
            this.constructor = constructor;
        }

        public final java.lang.reflect.Constructor<?> getConstructor() {
            return this.constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: asString */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            java.lang.Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            return kotlin.collections.ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor.getHighSpeedVideoFpsRangesFor((java.lang.Class) obj);
                }
            }, 24, (java.lang.Object) null);
        }

        static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRangesFor(java.lang.Class cls) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(cls);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FakeJavaAnnotationConstructor extends kotlin.reflect.jvm.internal.JvmFunctionSignature {
        private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<java.lang.reflect.Method> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(java.lang.Class<?> cls) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            this.getHighResolutionOutputSizeshNQ4ISI = cls;
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
            this.getHighSpeedVideoFpsRangesFor = kotlin.collections.ArraysKt.sortedWith(declaredMethods, new java.util.Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(((java.lang.reflect.Method) t).getName(), ((java.lang.reflect.Method) t2).getName());
                }
            });
        }

        public final java.util.List<java.lang.reflect.Method> getMethods() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* renamed from: asString */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoFpsRangesFor, "", "<init>(", ")V", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor.getHighResolutionOutputSizeshNQ4ISI((java.lang.reflect.Method) obj);
                }
            }, 24, null);
        }

        static /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Method method) {
            java.lang.Class<?> returnType = method.getReturnType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
            return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(returnType);
        }
    }

    public /* synthetic */ JvmFunctionSignature(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
