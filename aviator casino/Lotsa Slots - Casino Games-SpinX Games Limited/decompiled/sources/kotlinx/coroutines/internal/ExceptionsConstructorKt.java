package kotlinx.coroutines.internal;

/* compiled from: ExceptionsConstructor.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00042\u0006\u0010\t\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\n\u001a2\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\u0002`\f\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u000eH\u0002\u001a.\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\u0002`\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0082\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¨\u0006\u0015"}, d2 = {"throwableFields", "", "Ctor", "Lkotlin/Function1;", "", "ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "tryCopyException", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "createConstructor", "Lkotlinx/coroutines/internal/Ctor;", "clz", "Ljava/lang/Class;", "safeCtor", "block", "fieldsCountOrDefault", "defaultValue", "fieldsCount", "accumulator", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(java.lang.Throwable.class, -1);

    static {
        kotlinx.coroutines.internal.WeakMapCtorCache weakMapCtorCache;
        try {
            weakMapCtorCache = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED() ? kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE : kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE;
        } catch (java.lang.Throwable unused) {
            weakMapCtorCache = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE;
        }
        ctorCache = weakMapCtorCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends java.lang.Throwable> E tryCopyException(E e) {
        java.lang.Object m10798constructorimpl;
        if (e instanceof kotlinx.coroutines.CopyableThrowable) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(((kotlinx.coroutines.CopyableThrowable) e).createCopy());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            return (E) m10798constructorimpl;
        }
        return (E) ctorCache.get(e.getClass()).invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> cls) {
        java.lang.Object obj;
        kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function1;
        kotlin.Pair pair;
        kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            final java.lang.reflect.Constructor<?> constructor = constructors[i];
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        java.lang.Throwable createConstructor$lambda$7$lambda$6;
                        createConstructor$lambda$7$lambda$6 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (java.lang.Throwable) obj2);
                        return createConstructor$lambda$7$lambda$6;
                    }
                }), 0);
            } else if (length2 == 1) {
                java.lang.Class<?> cls2 = parameterTypes[0];
                if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.String.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            java.lang.Throwable createConstructor$lambda$7$lambda$3;
                            createConstructor$lambda$7$lambda$3 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (java.lang.Throwable) obj2);
                            return createConstructor$lambda$7$lambda$3;
                        }
                    }), 2);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            java.lang.Throwable createConstructor$lambda$7$lambda$4;
                            createConstructor$lambda$7$lambda$4 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (java.lang.Throwable) obj2);
                            return createConstructor$lambda$7$lambda$4;
                        }
                    }), 1);
                } else {
                    pair = kotlin.TuplesKt.to(null, -1);
                }
            } else if (length2 == 2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[1], java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            java.lang.Throwable createConstructor$lambda$7$lambda$1;
                            createConstructor$lambda$7$lambda$1 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (java.lang.Throwable) obj2);
                            return createConstructor$lambda$7$lambda$1;
                        }
                    }), 3);
                } else {
                    pair = kotlin.TuplesKt.to(null, -1);
                }
            } else {
                pair = kotlin.TuplesKt.to(null, -1);
            }
            arrayList.add(pair);
            i++;
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((java.lang.Number) ((kotlin.Pair) obj).getSecond()).intValue();
                do {
                    java.lang.Object next = it.next();
                    int intValue2 = ((java.lang.Number) ((kotlin.Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.Pair pair2 = (kotlin.Pair) obj;
        return (pair2 == null || (function1 = (kotlin.jvm.functions.Function1) pair2.getFirst()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable createConstructor$lambda$7$lambda$1(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th.getMessage(), th);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (java.lang.Throwable) newInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable createConstructor$lambda$7$lambda$3(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th.getMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable createConstructor$lambda$7$lambda$4(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (java.lang.Throwable) newInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable createConstructor$lambda$7$lambda$6(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(final kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> function1) {
        return new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Throwable safeCtor$lambda$9;
                safeCtor$lambda$9 = kotlinx.coroutines.internal.ExceptionsConstructorKt.safeCtor$lambda$9(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj);
                return safeCtor$lambda$9;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable safeCtor$lambda$9(kotlin.jvm.functions.Function1 function1, java.lang.Throwable th) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable th2 = (java.lang.Throwable) function1.invoke(th);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(th.getMessage(), th2.getMessage()) && !kotlin.jvm.internal.Intrinsics.areEqual(th2.getMessage(), th.toString())) {
                th2 = null;
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(th2);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
        return (java.lang.Throwable) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> cls, int i) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = valueOf;
        }
        return ((java.lang.Number) m10798constructorimpl).intValue();
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class cls, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCount(java.lang.Class<?> cls, int i) {
        do {
            int length = cls.getDeclaredFields().length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!java.lang.reflect.Modifier.isStatic(r0[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
