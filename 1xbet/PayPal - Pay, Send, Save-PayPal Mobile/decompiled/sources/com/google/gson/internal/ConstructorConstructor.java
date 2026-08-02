package com.google.gson.internal;

/* loaded from: classes4.dex */
public final class ConstructorConstructor {
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> map, boolean z, java.util.List<com.google.gson.ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z;
        this.reflectionFilters = list;
    }

    static java.lang.String checkInstantiable(java.lang.Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (java.lang.reflect.Modifier.isInterface(modifiers)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            sb.append(cls.getName());
            return sb.toString();
        }
        if (!java.lang.reflect.Modifier.isAbstract(modifiers)) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ");
        sb2.append(cls.getName());
        sb2.append("\nSee ");
        sb2.append(com.google.gson.internal.TroubleshootingGuide.createUrl("r8-abstract-class"));
        return sb2.toString();
    }

    public final <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> typeToken) {
        return get(typeToken, true);
    }

    public final <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> typeToken, boolean z) {
        final java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        final com.google.gson.InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda0
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    java.lang.Object createInstance;
                    createInstance = com.google.gson.InstanceCreator.this.createInstance(type);
                    return createInstance;
                }
            };
        }
        final com.google.gson.InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda11
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    java.lang.Object createInstance;
                    createInstance = com.google.gson.InstanceCreator.this.createInstance(type);
                    return createInstance;
                }
            };
        }
        com.google.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (newSpecialCollectionConstructor != null) {
            return newSpecialCollectionConstructor;
        }
        com.google.gson.ReflectionAccessFilter.FilterResult filterResult = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (newDefaultImplementationConstructor != null) {
            return newDefaultImplementationConstructor;
        }
        final java.lang.String checkInstantiable = checkInstantiable(rawType);
        if (checkInstantiable != null) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda13
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$get$2(checkInstantiable);
                }
            };
        }
        if (!z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
            sb.append(rawType);
            sb.append("; Register an InstanceCreator or a TypeAdapter for this type.");
            final java.lang.String obj = sb.toString();
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda14
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$get$3(obj);
                }
            };
        }
        if (filterResult != com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to create instance of ");
            sb2.append(rawType);
            sb2.append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
            final java.lang.String obj2 = sb2.toString();
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda15
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$get$4(obj2);
                }
            };
        }
        return newUnsafeAllocator(rawType);
    }

    static /* synthetic */ java.lang.Object lambda$get$2(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    static /* synthetic */ java.lang.Object lambda$get$3(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    static /* synthetic */ java.lang.Object lambda$get$4(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor(final java.lang.reflect.Type type, java.lang.Class<? super T> cls) {
        if (java.util.EnumSet.class.isAssignableFrom(cls)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda2
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newSpecialCollectionConstructor$5(type);
                }
            };
        }
        if (cls == java.util.EnumMap.class) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda3
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newSpecialCollectionConstructor$6(type);
                }
            };
        }
        return null;
    }

    static /* synthetic */ java.lang.Object lambda$newSpecialCollectionConstructor$5(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof java.lang.Class) {
                return java.util.EnumSet.noneOf((java.lang.Class) type2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumSet type: ");
            sb.append(type.toString());
            throw new com.google.gson.JsonIOException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumSet type: ");
        sb2.append(type.toString());
        throw new com.google.gson.JsonIOException(sb2.toString());
    }

    static /* synthetic */ java.lang.Object lambda$newSpecialCollectionConstructor$6(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof java.lang.Class) {
                return new java.util.EnumMap((java.lang.Class) type2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumMap type: ");
            sb.append(type.toString());
            throw new com.google.gson.JsonIOException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumMap type: ");
        sb2.append(type.toString());
        throw new com.google.gson.JsonIOException(sb2.toString());
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> cls, com.google.gson.ReflectionAccessFilter.FilterResult filterResult) {
        final java.lang.String tryMakeAccessible;
        if (java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final java.lang.reflect.Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (filterResult != com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW && (!com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) || (filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL && !java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to invoke no-args constructor of ");
                sb.append(cls);
                sb.append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                final java.lang.String obj = sb.toString();
                return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda9
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final java.lang.Object construct() {
                        return com.google.gson.internal.ConstructorConstructor.lambda$newDefaultConstructor$7(obj);
                    }
                };
            }
            if (filterResult == com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW && (tryMakeAccessible = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(declaredConstructor)) != null) {
                return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda10
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final java.lang.Object construct() {
                        return com.google.gson.internal.ConstructorConstructor.lambda$newDefaultConstructor$8(tryMakeAccessible);
                    }
                };
            }
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda12
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newDefaultConstructor$9(declaredConstructor);
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    static /* synthetic */ java.lang.Object lambda$newDefaultConstructor$7(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    static /* synthetic */ java.lang.Object lambda$newDefaultConstructor$8(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    static /* synthetic */ java.lang.Object lambda$newDefaultConstructor$9(java.lang.reflect.Constructor constructor) {
        try {
            return constructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (java.lang.InstantiationException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to invoke constructor '");
            sb.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(constructor));
            sb.append("' with no args");
            throw new java.lang.RuntimeException(sb.toString(), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
            sb2.append(com.google.gson.internal.reflect.ReflectionHelper.constructorToString(constructor));
            sb2.append("' with no args");
            throw new java.lang.RuntimeException(sb2.toString(), e3.getCause());
        }
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type type, java.lang.Class<? super T> cls) {
        if (java.util.Collection.class.isAssignableFrom(cls)) {
            return (com.google.gson.internal.ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (java.util.Map.class.isAssignableFrom(cls)) {
            return (com.google.gson.internal.ObjectConstructor<T>) newMapConstructor(type, cls);
        }
        return null;
    }

    private static com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<? extends java.lang.Object>> newCollectionConstructor(java.lang.Class<?> cls) {
        if (cls.isAssignableFrom(java.util.ArrayList.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda16
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newCollectionConstructor$10();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.LinkedHashSet.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda17
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newCollectionConstructor$11();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.TreeSet.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda18
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newCollectionConstructor$12();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.ArrayDeque.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda19
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newCollectionConstructor$13();
                }
            };
        }
        return null;
    }

    static /* synthetic */ java.util.Collection lambda$newCollectionConstructor$10() {
        return new java.util.ArrayList();
    }

    static /* synthetic */ java.util.Collection lambda$newCollectionConstructor$11() {
        return new java.util.LinkedHashSet();
    }

    static /* synthetic */ java.util.Collection lambda$newCollectionConstructor$12() {
        return new java.util.TreeSet();
    }

    static /* synthetic */ java.util.Collection lambda$newCollectionConstructor$13() {
        return new java.util.ArrayDeque();
    }

    private static boolean hasStringKeyType(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            return true;
        }
        java.lang.reflect.Type[] actualTypeArguments = ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && com.google.gson.internal.GsonTypes.getRawType(actualTypeArguments[0]) == java.lang.String.class;
    }

    private static com.google.gson.internal.ObjectConstructor<? extends java.util.Map<? extends java.lang.Object, java.lang.Object>> newMapConstructor(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (cls.isAssignableFrom(com.google.gson.internal.LinkedTreeMap.class) && hasStringKeyType(type)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda4
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newMapConstructor$14();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.LinkedHashMap.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda5
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newMapConstructor$15();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.TreeMap.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda6
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newMapConstructor$16();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.concurrent.ConcurrentHashMap.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda7
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newMapConstructor$17();
                }
            };
        }
        if (cls.isAssignableFrom(java.util.concurrent.ConcurrentSkipListMap.class)) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda8
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newMapConstructor$18();
                }
            };
        }
        return null;
    }

    static /* synthetic */ java.util.Map lambda$newMapConstructor$14() {
        return new com.google.gson.internal.LinkedTreeMap();
    }

    static /* synthetic */ java.util.Map lambda$newMapConstructor$15() {
        return new java.util.LinkedHashMap();
    }

    static /* synthetic */ java.util.Map lambda$newMapConstructor$16() {
        return new java.util.TreeMap();
    }

    static /* synthetic */ java.util.Map lambda$newMapConstructor$17() {
        return new java.util.concurrent.ConcurrentHashMap();
    }

    static /* synthetic */ java.util.Map lambda$newMapConstructor$18() {
        return new java.util.concurrent.ConcurrentSkipListMap();
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newUnsafeAllocator(final java.lang.Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda20
                @Override // com.google.gson.internal.ObjectConstructor
                public final java.lang.Object construct() {
                    return com.google.gson.internal.ConstructorConstructor.lambda$newUnsafeAllocator$19(cls);
                }
            };
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
        sb.append(cls);
        sb.append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        final java.lang.String obj = sb.toString();
        if (cls.getDeclaredConstructors().length == 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
            obj = sb2.toString();
        }
        return new com.google.gson.internal.ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda1
            @Override // com.google.gson.internal.ObjectConstructor
            public final java.lang.Object construct() {
                return com.google.gson.internal.ConstructorConstructor.lambda$newUnsafeAllocator$20(obj);
            }
        };
    }

    static /* synthetic */ java.lang.Object lambda$newUnsafeAllocator$19(java.lang.Class cls) {
        try {
            return com.google.gson.internal.UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
            sb.append(cls);
            sb.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    static /* synthetic */ java.lang.Object lambda$newUnsafeAllocator$20(java.lang.String str) {
        throw new com.google.gson.JsonIOException(str);
    }

    public final java.lang.String toString() {
        return this.instanceCreators.toString();
    }
}
