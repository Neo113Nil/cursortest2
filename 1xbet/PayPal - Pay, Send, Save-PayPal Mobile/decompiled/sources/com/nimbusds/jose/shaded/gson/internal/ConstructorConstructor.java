package com.nimbusds.jose.shaded.gson.internal;

/* loaded from: classes4.dex */
public final class ConstructorConstructor {
    private final java.util.Map<java.lang.reflect.Type, com.nimbusds.jose.shaded.gson.InstanceCreator<?>> instanceCreators;
    private final java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.nimbusds.jose.shaded.gson.InstanceCreator<?>> map, boolean z, java.util.List<com.nimbusds.jose.shaded.gson.ReflectionAccessFilter> list) {
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
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
        sb2.append(cls.getName());
        return sb2.toString();
    }

    public final <T> com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> get(com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        final java.lang.reflect.Type type = typeToken.getType();
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        final com.nimbusds.jose.shaded.gson.InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.1
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) instanceCreator.createInstance(type);
                }
            };
        }
        final com.nimbusds.jose.shaded.gson.InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.2
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) instanceCreator2.createInstance(type);
                }
            };
        }
        com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (newSpecialCollectionConstructor != null) {
            return newSpecialCollectionConstructor;
        }
        com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult filterResult = com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (newDefaultImplementationConstructor != null) {
            return newDefaultImplementationConstructor;
        }
        final java.lang.String checkInstantiable = checkInstantiable(rawType);
        if (checkInstantiable != null) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.3
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(checkInstantiable);
                }
            };
        }
        if (filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.ALLOW) {
            return newUnsafeAllocator(rawType);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
        sb.append(rawType);
        sb.append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        final java.lang.String obj = sb.toString();
        return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.4
            @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
            public T construct() {
                throw new com.nimbusds.jose.shaded.gson.JsonIOException(obj);
            }
        };
    }

    private static <T> com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor(final java.lang.reflect.Type type, java.lang.Class<? super T> cls) {
        if (java.util.EnumSet.class.isAssignableFrom(cls)) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.5
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    java.lang.reflect.Type type2 = type;
                    if (type2 instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof java.lang.Class) {
                            return (T) java.util.EnumSet.noneOf((java.lang.Class) type3);
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumSet type: ");
                        sb.append(type.toString());
                        throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString());
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumSet type: ");
                    sb2.append(type.toString());
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb2.toString());
                }
            };
        }
        if (cls == java.util.EnumMap.class) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.6
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    java.lang.reflect.Type type2 = type;
                    if (type2 instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof java.lang.Class) {
                            return (T) new java.util.EnumMap((java.lang.Class) type3);
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumMap type: ");
                        sb.append(type.toString());
                        throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb.toString());
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumMap type: ");
                    sb2.append(type.toString());
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(sb2.toString());
                }
            };
        }
        return null;
    }

    private static <T> com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> cls, com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult filterResult) {
        final java.lang.String tryMakeAccessible;
        if (java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final java.lang.reflect.Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (filterResult != com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.ALLOW && (!com.nimbusds.jose.shaded.gson.internal.ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) || (filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL && !java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to invoke no-args constructor of ");
                sb.append(cls);
                sb.append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                final java.lang.String obj = sb.toString();
                return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.7
                    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                    public T construct() {
                        throw new com.nimbusds.jose.shaded.gson.JsonIOException(obj);
                    }
                };
            }
            if (filterResult == com.nimbusds.jose.shaded.gson.ReflectionAccessFilter.FilterResult.ALLOW && (tryMakeAccessible = com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(declaredConstructor)) != null) {
                return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.8
                    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                    public T construct() {
                        throw new com.nimbusds.jose.shaded.gson.JsonIOException(tryMakeAccessible);
                    }
                };
            }
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.9
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    try {
                        return (T) declaredConstructor.newInstance(new java.lang.Object[0]);
                    } catch (java.lang.IllegalAccessException e) {
                        throw com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
                    } catch (java.lang.InstantiationException e2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke constructor '");
                        sb2.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(declaredConstructor));
                        sb2.append("' with no args");
                        throw new java.lang.RuntimeException(sb2.toString(), e2);
                    } catch (java.lang.reflect.InvocationTargetException e3) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to invoke constructor '");
                        sb3.append(com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper.constructorToString(declaredConstructor));
                        sb3.append("' with no args");
                        throw new java.lang.RuntimeException(sb3.toString(), e3.getCause());
                    }
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type type, java.lang.Class<? super T> cls) {
        if (java.util.Collection.class.isAssignableFrom(cls)) {
            if (java.util.SortedSet.class.isAssignableFrom(cls)) {
                return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.10
                    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                    public T construct() {
                        return (T) new java.util.TreeSet();
                    }
                };
            }
            if (java.util.Set.class.isAssignableFrom(cls)) {
                return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.11
                    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                    public T construct() {
                        return (T) new java.util.LinkedHashSet();
                    }
                };
            }
            if (java.util.Queue.class.isAssignableFrom(cls)) {
                return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.12
                    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                    public T construct() {
                        return (T) new java.util.ArrayDeque();
                    }
                };
            }
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.13
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new java.util.ArrayList();
                }
            };
        }
        if (!java.util.Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.14
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new java.util.concurrent.ConcurrentSkipListMap();
                }
            };
        }
        if (java.util.concurrent.ConcurrentMap.class.isAssignableFrom(cls)) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.15
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new java.util.concurrent.ConcurrentHashMap();
                }
            };
        }
        if (java.util.SortedMap.class.isAssignableFrom(cls)) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.16
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new java.util.TreeMap();
                }
            };
        }
        if ((type instanceof java.lang.reflect.ParameterizedType) && !java.lang.String.class.isAssignableFrom(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get(((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.17
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    return (T) new java.util.LinkedHashMap();
                }
            };
        }
        return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.18
            @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
            public T construct() {
                return (T) new com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap();
            }
        };
    }

    private <T> com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T> newUnsafeAllocator(final java.lang.Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.19
                @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public T construct() {
                    try {
                        return (T) com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator.INSTANCE.newInstance(cls);
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
                        sb.append(cls);
                        sb.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                        throw new java.lang.RuntimeException(sb.toString(), e);
                    }
                }
            };
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create instance of ");
        sb.append(cls);
        sb.append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        final java.lang.String obj = sb.toString();
        return new com.nimbusds.jose.shaded.gson.internal.ObjectConstructor<T>() { // from class: com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor.20
            @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
            public T construct() {
                throw new com.nimbusds.jose.shaded.gson.JsonIOException(obj);
            }
        };
    }

    public final java.lang.String toString() {
        return this.instanceCreators.toString();
    }
}
