package androidx.window.core;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/window/core/PredicateAdapter;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "Ljava/lang/Class;", "predicateClassOrNull$window_release", "()Ljava/lang/Class;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "predicate", "buildPredicate", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "firstClazz", "secondClazz", "Lkotlin/Function2;", "buildPairPredicate", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/ClassLoader;", "getHighSpeedVideoFpsRanges", "BaseHandler", "PredicateStubHandler", "PairPredicateStubHandler"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PredicateAdapter {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ClassLoader getHighSpeedVideoFpsRanges;

    public PredicateAdapter(java.lang.ClassLoader classLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        this.getHighSpeedVideoFpsRanges = classLoader;
    }

    public final <T> java.lang.Object buildPredicate(kotlin.reflect.KClass<T> clazz, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        androidx.window.core.PredicateAdapter.PredicateStubHandler predicateStubHandler = new androidx.window.core.PredicateAdapter.PredicateStubHandler(clazz, predicate);
        java.lang.ClassLoader classLoader = this.getHighSpeedVideoFpsRanges;
        java.lang.Class<?> loadClass = classLoader.loadClass("java.util.function.Predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{loadClass}, predicateStubHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
        return newProxyInstance;
    }

    public final <T, U> java.lang.Object buildPairPredicate(kotlin.reflect.KClass<T> firstClazz, kotlin.reflect.KClass<U> secondClazz, kotlin.jvm.functions.Function2<? super T, ? super U, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstClazz, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondClazz, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        androidx.window.core.PredicateAdapter.PairPredicateStubHandler pairPredicateStubHandler = new androidx.window.core.PredicateAdapter.PairPredicateStubHandler(firstClazz, secondClazz, predicate);
        java.lang.ClassLoader classLoader = this.getHighSpeedVideoFpsRanges;
        java.lang.Class<?> loadClass = classLoader.loadClass("java.util.function.Predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{loadClass}, pairPredicateStubHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
        return newProxyInstance;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Landroidx/window/core/PredicateAdapter$BaseHandler;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "Lkotlin/reflect/KClass;", "p0", "<init>", "(Lkotlin/reflect/KClass;)V", "Ljava/lang/reflect/Method;", "p1", "", "p2", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlin/reflect/KClass;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class BaseHandler<T> implements java.lang.reflect.InvocationHandler {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.reflect.KClass<T> Camera2StreamConfigurationMap;

        public abstract boolean getHighSpeedVideoFpsRanges(java.lang.Object p0, T p1);

        public BaseHandler(kotlin.reflect.KClass<T> kClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            this.Camera2StreamConfigurationMap = kClass;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(p1.getName(), "test") && p1.getReturnType().equals(java.lang.Boolean.TYPE) && p2 != null && p2.length == 1) {
                return java.lang.Boolean.valueOf(getHighSpeedVideoFpsRanges(p0, kotlin.reflect.KClasses.cast(this.Camera2StreamConfigurationMap, p2 != null ? p2[0] : null)));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(p1.getName(), "equals") && p1.getReturnType().equals(java.lang.Boolean.TYPE) && p2 != null && p2.length == 1) {
                java.lang.Object obj = p2 != null ? p2[0] : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                return java.lang.Boolean.valueOf(p0 == obj);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(p1.getName(), "hashCode") && p1.getReturnType().equals(java.lang.Integer.TYPE) && p2 == null) {
                return java.lang.Integer.valueOf(hashCode());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(p1.getName(), "toString") && p1.getReturnType().equals(java.lang.String.class) && p2 == null) {
                return toString();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected method call object:");
            sb.append(p0);
            sb.append(", method: ");
            sb.append(p1);
            sb.append(", args: ");
            sb.append(p2);
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/window/core/PredicateAdapter$PredicateStubHandler;", "", "T", "Landroidx/window/core/PredicateAdapter$BaseHandler;", "Lkotlin/reflect/KClass;", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PredicateStubHandler<T> extends androidx.window.core.PredicateAdapter.BaseHandler<T> {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> Camera2StreamConfigurationMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PredicateStubHandler(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
            super(kClass);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.Camera2StreamConfigurationMap = function1;
        }

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public final boolean getHighSpeedVideoFpsRanges(java.lang.Object p0, T p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return this.Camera2StreamConfigurationMap.invoke(p1).booleanValue();
        }

        public final int hashCode() {
            return this.Camera2StreamConfigurationMap.hashCode();
        }

        public final java.lang.String toString() {
            return this.Camera2StreamConfigurationMap.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0004B=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/window/core/PredicateAdapter$PairPredicateStubHandler;", "", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "Landroidx/window/core/PredicateAdapter$BaseHandler;", "Landroid/util/Pair;", "Lkotlin/reflect/KClass;", "p0", "p1", "Lkotlin/Function2;", "", "p2", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function2;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lkotlin/reflect/KClass;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PairPredicateStubHandler<T, U> extends androidx.window.core.PredicateAdapter.BaseHandler<android.util.Pair<?, ?>> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlin.reflect.KClass<U> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.reflect.KClass<T> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function2<T, U, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

        @Override // androidx.window.core.PredicateAdapter.BaseHandler
        public final /* synthetic */ boolean getHighSpeedVideoFpsRanges(java.lang.Object obj, android.util.Pair<?, ?> pair) {
            android.util.Pair<?, ?> pair2 = pair;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair2, "");
            return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.reflect.KClasses.cast(this.Camera2StreamConfigurationMap, pair2.first), kotlin.reflect.KClasses.cast(this.getHighSpeedVideoFpsRangesFor, pair2.second))).booleanValue();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PairPredicateStubHandler(kotlin.reflect.KClass<T> kClass, kotlin.reflect.KClass<U> kClass2, kotlin.jvm.functions.Function2<? super T, ? super U, java.lang.Boolean> function2) {
            super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.util.Pair.class));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            this.Camera2StreamConfigurationMap = kClass;
            this.getHighSpeedVideoFpsRangesFor = kClass2;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI.toString();
        }
    }

    public final java.lang.Class<?> predicateClassOrNull$window_release() {
        try {
            java.lang.Class<?> loadClass = this.getHighSpeedVideoFpsRanges.loadClass("java.util.function.Predicate");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadClass, "");
            return loadClass;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
