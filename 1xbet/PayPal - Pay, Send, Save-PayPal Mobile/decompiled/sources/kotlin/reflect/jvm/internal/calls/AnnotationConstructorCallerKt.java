package kotlin.reflect.jvm.internal.calls;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001aI\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"transformKotlinToJvm", "", "expectedType", "Ljava/lang/Class;", "throwIllegalArgumentType", "", "index", "", "name", "", "expectedJvmType", "createAnnotationInstance", "T", "annotationClass", "values", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnnotationConstructorCallerKt {
    public static /* synthetic */ java.lang.Object createAnnotationInstance$default(java.lang.Class cls, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            java.util.Set keySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), new java.lang.Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    public static final <T> T createAnnotationInstance(final java.lang.Class<T> cls, final java.util.Map<java.lang.String, ? extends java.lang.Object> map, final java.util.List<java.lang.reflect.Method> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(map) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$0
            private final java.util.Map Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return java.lang.Integer.valueOf(kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap));
            }

            {
                this.Camera2StreamConfigurationMap = map;
            }
        });
        final kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(cls, map) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$1
            private final java.util.Map Camera2StreamConfigurationMap;
            private final java.lang.Class getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = cls;
                this.Camera2StreamConfigurationMap = map;
            }
        });
        T t = (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new java.lang.reflect.InvocationHandler(cls, map, lazy2, lazy, list) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$2
            private final java.util.Map Camera2StreamConfigurationMap;
            private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
            private final java.util.List getHighSpeedVideoFpsRanges;
            private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
            private final java.lang.Class getHighSpeedVideoSizes;

            @Override // java.lang.reflect.InvocationHandler
            public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                return kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, method, objArr);
            }

            {
                this.getHighSpeedVideoSizes = cls;
                this.Camera2StreamConfigurationMap = map;
                this.getHighSpeedVideoFpsRangesFor = lazy2;
                this.getHighResolutionOutputSizeshNQ4ISI = lazy;
                this.getHighSpeedVideoFpsRanges = list;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return t;
    }

    public static final /* synthetic */ java.lang.Void access$throwIllegalArgumentType(int i, java.lang.String str, java.lang.Class cls) {
        kotlin.reflect.KClass orCreateKotlinClass;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Class.class)) {
            orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass.class);
        } else {
            orCreateKotlinClass = (cls.isArray() && kotlin.jvm.internal.Intrinsics.areEqual(cls.getComponentType(), java.lang.Class.class)) ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass[].class) : kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass.getGetHighResolutionOutputSizeshNQ4ISI(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object[].class).getGetHighResolutionOutputSizeshNQ4ISI())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(orCreateKotlinClass.getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(kotlin.text.Typography.less);
            java.lang.Class<?> componentType = kotlin.jvm.JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentType, "");
            sb.append(kotlin.jvm.JvmClassMappingKt.getKotlinClass(componentType).getGetHighResolutionOutputSizeshNQ4ISI());
            sb.append(kotlin.text.Typography.greater);
            getHighResolutionOutputSizeshNQ4ISI = sb.toString();
        } else {
            getHighResolutionOutputSizeshNQ4ISI = orCreateKotlinClass.getGetHighResolutionOutputSizeshNQ4ISI();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(getHighResolutionOutputSizeshNQ4ISI);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static final /* synthetic */ java.lang.Object access$transformKotlinToJvm(java.lang.Object obj, java.lang.Class cls) {
        if (obj instanceof java.lang.Class) {
            return null;
        }
        if (obj instanceof kotlin.reflect.KClass) {
            obj = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) obj);
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr instanceof java.lang.Class[]) {
                return null;
            }
            if (objArr instanceof kotlin.reflect.KClass[]) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                kotlin.reflect.KClass[] kClassArr = (kotlin.reflect.KClass[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kClassArr.length);
                for (kotlin.reflect.KClass kClass : kClassArr) {
                    arrayList.add(kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass));
                }
                obj = arrayList.toArray(new java.lang.Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(java.util.Map map) {
        int hashCode;
        int i = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof boolean[]) {
                hashCode = java.util.Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                hashCode = java.util.Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                hashCode = java.util.Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                hashCode = java.util.Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                hashCode = java.util.Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                hashCode = java.util.Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                hashCode = java.util.Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                hashCode = java.util.Arrays.hashCode((double[]) value);
            } else {
                hashCode = value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode();
            }
            i += hashCode ^ (str.hashCode() * 127);
        }
        return i;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(java.lang.Class cls, java.util.Map map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        kotlin.collections.CollectionsKt.joinTo(map.entrySet(), sb, (r14 & 2) != 0 ? ", " : ", ", (r14 & 4) != 0 ? "" : "(", (r14 & 8) != 0 ? "" : ")", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$3
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.Camera2StreamConfigurationMap((java.util.Map.Entry) obj);
            }
        });
        return sb.toString();
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoSizes(java.lang.Class cls, java.util.Map map, kotlin.Lazy lazy, kotlin.Lazy lazy2, java.util.List list, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean areEqual;
        kotlin.reflect.KClass annotationClass;
        java.lang.String name2 = method.getName();
        if (name2 != null) {
            int hashCode = name2.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name2.equals("annotationType")) {
                        return cls;
                    }
                } else if (name2.equals("hashCode")) {
                    return java.lang.Integer.valueOf(((java.lang.Number) lazy2.getValue()).intValue());
                }
            } else if (name2.equals("toString")) {
                return (java.lang.String) lazy.getValue();
            }
        }
        boolean z = false;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(name2, "equals") || objArr == null || objArr.length != 1) {
            if (map.containsKey(name2)) {
                return map.get(name2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            sb.append(kotlin.collections.ArraysKt.toList(objArr));
            sb.append(')');
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
        java.lang.Object single = kotlin.collections.ArraysKt.single(objArr);
        java.lang.Class cls2 = null;
        java.lang.annotation.Annotation annotation = single instanceof java.lang.annotation.Annotation ? (java.lang.annotation.Annotation) single : null;
        if (annotation != null && (annotationClass = kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation)) != null) {
            cls2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(annotationClass);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, cls)) {
            java.util.List<java.lang.reflect.Method> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                for (java.lang.reflect.Method method2 : list2) {
                    java.lang.Object obj = map.get(method2.getName());
                    java.lang.Object invoke = method2.invoke(single, new java.lang.Object[0]);
                    if (obj instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((boolean[]) obj, (boolean[]) invoke);
                    } else if (obj instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((char[]) obj, (char[]) invoke);
                    } else if (obj instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((byte[]) obj, (byte[]) invoke);
                    } else if (obj instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((short[]) obj, (short[]) invoke);
                    } else if (obj instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((int[]) obj, (int[]) invoke);
                    } else if (obj instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((float[]) obj, (float[]) invoke);
                    } else if (obj instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((long[]) obj, (long[]) invoke);
                    } else if (obj instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((double[]) obj, (double[]) invoke);
                    } else if (obj instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        areEqual = java.util.Arrays.equals((java.lang.Object[]) obj, (java.lang.Object[]) invoke);
                    } else {
                        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(obj, invoke);
                    }
                    if (!areEqual) {
                        break;
                    }
                }
            }
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(java.util.Map.Entry entry) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj = java.util.Arrays.toString((boolean[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof char[]) {
            obj = java.util.Arrays.toString((char[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof byte[]) {
            obj = java.util.Arrays.toString((byte[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof short[]) {
            obj = java.util.Arrays.toString((short[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof int[]) {
            obj = java.util.Arrays.toString((int[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof float[]) {
            obj = java.util.Arrays.toString((float[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof long[]) {
            obj = java.util.Arrays.toString((long[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof double[]) {
            obj = java.util.Arrays.toString((double[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (value instanceof java.lang.Object[]) {
            obj = java.util.Arrays.toString((java.lang.Object[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        } else {
            obj = value.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('=');
        sb.append(obj);
        return sb.toString();
    }
}
