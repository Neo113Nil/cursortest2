package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e*(\b\u0002\u0010\u0011\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00102\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0010"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Class;I)I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/internal/CtorCache;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/internal/CtorCache;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function1;", "Ctor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache Camera2StreamConfigurationMap;
    private static final int getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges((java.lang.Class<?>) java.lang.Throwable.class, -1);

    static {
        kotlinx.coroutines.internal.WeakMapCtorCache weakMapCtorCache;
        try {
            weakMapCtorCache = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED() ? kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE : kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE;
        } catch (java.lang.Throwable unused) {
            weakMapCtorCache = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE;
        }
        Camera2StreamConfigurationMap = weakMapCtorCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends java.lang.Throwable> E tryCopyException(E e) {
        java.lang.Object m23436constructorimpl;
        if (e instanceof kotlinx.coroutines.CopyableThrowable) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(((kotlinx.coroutines.CopyableThrowable) e).createCopy());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            return (E) m23436constructorimpl;
        }
        return (E) Camera2StreamConfigurationMap.get(e.getClass()).invoke(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, java.lang.Throwable th) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable th2 = (java.lang.Throwable) function1.invoke(th);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(th.getMessage(), th2.getMessage()) && !kotlin.jvm.internal.Intrinsics.areEqual(th2.getMessage(), th.toString())) {
                th2 = null;
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(th2);
        } catch (java.lang.Throwable th3) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th3));
        }
        return (java.lang.Throwable) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    private static final int getHighSpeedVideoFpsRanges(java.lang.Class<?> cls, int i) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int i2 = 0;
            do {
                int i3 = 0;
                for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                    if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(i2));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = java.lang.Integer.valueOf(i);
        }
        return ((java.lang.Number) m23436constructorimpl).intValue();
    }

    public static /* synthetic */ java.lang.Throwable $r8$lambda$2WnEaEbRS_jgn5zxW2M9wSfYUhc(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
        java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static /* synthetic */ java.lang.Throwable $r8$lambda$HDTDWXeEwBmO1DYmg_dY7NcRVoc(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
        return (java.lang.Throwable) newInstance;
    }

    public static /* synthetic */ java.lang.Throwable $r8$lambda$YCulj4fnQ73RVsCU6X0tr4WSTEc(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th.getMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
        java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }

    public static /* synthetic */ java.lang.Throwable $r8$lambda$twfIcVUsAnsEQswo7ziCHj_2OpY(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Object newInstance = constructor.newInstance(th.getMessage(), th);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
        return (java.lang.Throwable) newInstance;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$createConstructor(java.lang.Class cls) {
        java.lang.Object obj;
        kotlin.jvm.functions.Function1 function1;
        kotlin.Pair pair;
        kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Void invoke(java.lang.Throwable th) {
                return null;
            }
        };
        if (getHighResolutionOutputSizeshNQ4ISI == getHighSpeedVideoFpsRanges((java.lang.Class<?>) cls, 0)) {
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
                    final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return kotlinx.coroutines.internal.ExceptionsConstructorKt.$r8$lambda$2WnEaEbRS_jgn5zxW2M9wSfYUhc(constructor, (java.lang.Throwable) obj2);
                        }
                    };
                    pair = kotlin.TuplesKt.to(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            java.lang.Throwable highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = kotlinx.coroutines.internal.ExceptionsConstructorKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj2);
                            return highSpeedVideoFpsRanges;
                        }
                    }, 0);
                } else if (length2 == 1) {
                    java.lang.Class<?> cls2 = parameterTypes[0];
                    if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.String.class)) {
                        final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlinx.coroutines.internal.ExceptionsConstructorKt.$r8$lambda$YCulj4fnQ73RVsCU6X0tr4WSTEc(constructor, (java.lang.Throwable) obj2);
                            }
                        };
                        pair = kotlin.TuplesKt.to(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                java.lang.Throwable highSpeedVideoFpsRanges;
                                highSpeedVideoFpsRanges = kotlinx.coroutines.internal.ExceptionsConstructorKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj2);
                                return highSpeedVideoFpsRanges;
                            }
                        }, 2);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.Throwable.class)) {
                        final kotlin.jvm.functions.Function1 function14 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlinx.coroutines.internal.ExceptionsConstructorKt.$r8$lambda$HDTDWXeEwBmO1DYmg_dY7NcRVoc(constructor, (java.lang.Throwable) obj2);
                            }
                        };
                        pair = kotlin.TuplesKt.to(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                java.lang.Throwable highSpeedVideoFpsRanges;
                                highSpeedVideoFpsRanges = kotlinx.coroutines.internal.ExceptionsConstructorKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj2);
                                return highSpeedVideoFpsRanges;
                            }
                        }, 1);
                    } else {
                        pair = kotlin.TuplesKt.to(null, -1);
                    }
                } else if (length2 == 2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[1], java.lang.Throwable.class)) {
                        final kotlin.jvm.functions.Function1 function15 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return kotlinx.coroutines.internal.ExceptionsConstructorKt.$r8$lambda$twfIcVUsAnsEQswo7ziCHj_2OpY(constructor, (java.lang.Throwable) obj2);
                            }
                        };
                        pair = kotlin.TuplesKt.to(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                java.lang.Throwable highSpeedVideoFpsRanges;
                                highSpeedVideoFpsRanges = kotlinx.coroutines.internal.ExceptionsConstructorKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj2);
                                return highSpeedVideoFpsRanges;
                            }
                        }, 3);
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
            if (pair2 != null && (function1 = (kotlin.jvm.functions.Function1) pair2.getFirst()) != null) {
                return function1;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }
}
