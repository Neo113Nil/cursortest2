package com.google.common.reflect;

/* loaded from: classes9.dex */
final class Types {
    private static final com.google.common.base.Joiner COMMA_JOINER = com.google.common.base.Joiner.on(", ").useForNull("null");

    static java.lang.reflect.Type newArrayType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            com.google.common.base.Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return supertypeOf(newArrayType(lowerBounds[0]));
            }
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            com.google.common.base.Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
            return subtypeOf(newArrayType(upperBounds[0]));
        }
        return com.google.common.reflect.Types.JavaVersion.CURRENT.newArrayType(type);
    }

    static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type... typeArr) {
        if (type == null) {
            return newParameterizedType(cls, typeArr);
        }
        com.google.common.base.Preconditions.checkNotNull(typeArr);
        com.google.common.base.Preconditions.checkArgument(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new com.google.common.reflect.Types.ParameterizedTypeImpl(type, cls, typeArr);
    }

    static java.lang.reflect.ParameterizedType newParameterizedType(java.lang.Class<?> cls, java.lang.reflect.Type... typeArr) {
        return new com.google.common.reflect.Types.ParameterizedTypeImpl(com.google.common.reflect.Types.ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            final java.lang.Class<?> getOwnerType(java.lang.Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            final java.lang.Class<?> getOwnerType(java.lang.Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        static final com.google.common.reflect.Types.ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        abstract java.lang.Class<?> getOwnerType(java.lang.Class<?> cls);

        private static com.google.common.reflect.Types.ClassOwnership detectJvmBehavior() {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) java.util.Objects.requireNonNull((java.lang.reflect.ParameterizedType) new com.google.common.reflect.Types.ClassOwnership.C1LocalClass<java.lang.String>() { // from class: com.google.common.reflect.Types.ClassOwnership.3
            }.getClass().getGenericSuperclass());
            for (com.google.common.reflect.Types.ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(com.google.common.reflect.Types.ClassOwnership.C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new java.lang.AssertionError();
        }
    }

    static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newArtificialTypeVariable(D d, java.lang.String str, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new java.lang.reflect.Type[]{java.lang.Object.class};
        }
        return newTypeVariableImpl(d, str, typeArr);
    }

    static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type type) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(new java.lang.reflect.Type[0], new java.lang.reflect.Type[]{type});
    }

    static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type type) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(new java.lang.reflect.Type[]{type}, new java.lang.reflect.Type[]{java.lang.Object.class});
    }

    static java.lang.String toString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    static java.lang.reflect.Type getComponentType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.Types.1
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
                atomicReference.set(com.google.common.reflect.Types.subtypeOfComponentType(typeVariable.getBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
                atomicReference.set(com.google.common.reflect.Types.subtypeOfComponentType(wildcardType.getUpperBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }
        }.visit(type);
        return (java.lang.reflect.Type) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Type subtypeOfComponentType(java.lang.reflect.Type[] typeArr) {
        for (java.lang.reflect.Type type : typeArr) {
            java.lang.reflect.Type componentType = getComponentType(type);
            if (componentType != null) {
                if (componentType instanceof java.lang.Class) {
                    java.lang.Class cls = (java.lang.Class) componentType;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return subtypeOf(componentType);
            }
        }
        return null;
    }

    static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.componentType = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.reflect.Types.toString(this.componentType));
            sb.append(okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof java.lang.reflect.GenericArrayType) {
                return java.util.Objects.equals(getGenericComponentType(), ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> argumentsList;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.Class<?> rawType;

        ParameterizedTypeImpl(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
            com.google.common.base.Preconditions.checkNotNull(cls);
            com.google.common.base.Preconditions.checkArgument(typeArr.length == cls.getTypeParameters().length);
            com.google.common.reflect.Types.disallowPrimitiveType(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return com.google.common.reflect.Types.toArray(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getOwnerType() {
            return this.ownerType;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.ownerType != null && com.google.common.reflect.Types.JavaVersion.CURRENT.jdkTypeDuplicatesOwnerName()) {
                sb.append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName(this.ownerType));
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            }
            sb.append(this.rawType.getName());
            sb.append(kotlin.text.Typography.less);
            com.google.common.base.Joiner joiner = com.google.common.reflect.Types.COMMA_JOINER;
            com.google.common.collect.ImmutableList<java.lang.reflect.Type> immutableList = this.argumentsList;
            final com.google.common.reflect.Types.JavaVersion javaVersion = com.google.common.reflect.Types.JavaVersion.CURRENT;
            java.util.Objects.requireNonNull(javaVersion);
            sb.append(joiner.join(com.google.common.collect.Iterables.transform(immutableList, new com.google.common.base.Function() { // from class: com.google.common.reflect.Types$ParameterizedTypeImpl$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.reflect.Types.JavaVersion.this.typeName((java.lang.reflect.Type) obj);
                }
            })));
            sb.append(kotlin.text.Typography.greater);
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && java.util.Objects.equals(getOwnerType(), parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    private static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newTypeVariableImpl(D d, java.lang.String str, java.lang.reflect.Type[] typeArr) {
        return (java.lang.reflect.TypeVariable) com.google.common.reflect.Reflection.newProxy(java.lang.reflect.TypeVariable.class, new com.google.common.reflect.Types.TypeVariableInvocationHandler(new com.google.common.reflect.Types.TypeVariableImpl(d, str, typeArr)));
    }

    static final class TypeVariableInvocationHandler implements java.lang.reflect.InvocationHandler {
        private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.reflect.Method> typeVariableMethods;
        private final com.google.common.reflect.Types.TypeVariableImpl<?> typeVariableImpl;

        static {
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            for (java.lang.reflect.Method method : com.google.common.reflect.Types.TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(com.google.common.reflect.Types.TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (java.security.AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            typeVariableMethods = builder.buildKeepingLast();
        }

        TypeVariableInvocationHandler(com.google.common.reflect.Types.TypeVariableImpl<?> typeVariableImpl) {
            this.typeVariableImpl = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            java.lang.String name2 = method.getName();
            java.lang.reflect.Method method2 = typeVariableMethods.get(name2);
            if (method2 == null) {
                throw new java.lang.UnsupportedOperationException(name2);
            }
            try {
                return method2.invoke(this.typeVariableImpl, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    static final class TypeVariableImpl<D extends java.lang.reflect.GenericDeclaration> {
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> bounds;
        private final D genericDeclaration;

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3867name;

        TypeVariableImpl(D d, java.lang.String str, java.lang.reflect.Type[] typeArr) {
            com.google.common.reflect.Types.disallowPrimitiveType(typeArr, "bound for type variable");
            this.genericDeclaration = (D) com.google.common.base.Preconditions.checkNotNull(d);
            this.f3867name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            this.bounds = com.google.common.collect.ImmutableList.copyOf(typeArr);
        }

        @com.google.errorprone.annotations.Keep
        public final java.lang.reflect.Type[] getBounds() {
            return com.google.common.reflect.Types.toArray(this.bounds);
        }

        @com.google.errorprone.annotations.Keep
        public final D getGenericDeclaration() {
            return this.genericDeclaration;
        }

        @com.google.errorprone.annotations.Keep
        public final java.lang.String getName() {
            return this.f3867name;
        }

        @com.google.errorprone.annotations.Keep
        public final java.lang.String getTypeName() {
            return this.f3867name;
        }

        public final java.lang.String toString() {
            return this.f3867name;
        }

        public final int hashCode() {
            return this.genericDeclaration.hashCode() ^ this.f3867name.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) {
                if (obj != null && java.lang.reflect.Proxy.isProxyClass(obj.getClass()) && (java.lang.reflect.Proxy.getInvocationHandler(obj) instanceof com.google.common.reflect.Types.TypeVariableInvocationHandler)) {
                    com.google.common.reflect.Types.TypeVariableImpl typeVariableImpl = ((com.google.common.reflect.Types.TypeVariableInvocationHandler) java.lang.reflect.Proxy.getInvocationHandler(obj)).typeVariableImpl;
                    if (this.f3867name.equals(typeVariableImpl.getName()) && this.genericDeclaration.equals(typeVariableImpl.getGenericDeclaration()) && this.bounds.equals(typeVariableImpl.bounds)) {
                        return true;
                    }
                }
                return false;
            }
            if (obj instanceof java.lang.reflect.TypeVariable) {
                java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) obj;
                if (this.f3867name.equals(typeVariable.getName()) && this.genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> lowerBounds;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> upperBounds;

        WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            com.google.common.reflect.Types.disallowPrimitiveType(typeArr, "lower bound for wildcard");
            com.google.common.reflect.Types.disallowPrimitiveType(typeArr2, "upper bound for wildcard");
            this.lowerBounds = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(typeArr);
            this.upperBounds = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(typeArr2);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            return com.google.common.reflect.Types.toArray(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return com.google.common.reflect.Types.toArray(this.upperBounds);
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.lang.reflect.WildcardType)) {
                return false;
            }
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
            return this.lowerBounds.equals(java.util.Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(java.util.Arrays.asList(wildcardType.getUpperBounds()));
        }

        public final int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
            com.google.common.collect.UnmodifiableIterator<java.lang.reflect.Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                java.lang.reflect.Type next = it.next();
                sb.append(" super ");
                sb.append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName(next));
            }
            for (java.lang.reflect.Type type : com.google.common.reflect.Types.filterUpperBounds(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Type[] toArray(java.util.Collection<java.lang.reflect.Type> collection) {
        return (java.lang.reflect.Type[]) collection.toArray(new java.lang.reflect.Type[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Iterable<java.lang.reflect.Type> filterUpperBounds(java.lang.Iterable<java.lang.reflect.Type> iterable) {
        return com.google.common.collect.Iterables.filter(iterable, com.google.common.base.Predicates.not(com.google.common.base.Predicates.equalTo(java.lang.Object.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void disallowPrimitiveType(java.lang.reflect.Type[] typeArr, java.lang.String str) {
        for (java.lang.reflect.Type type : typeArr) {
            if (type instanceof java.lang.Class) {
                com.google.common.base.Preconditions.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (java.lang.Class) type, str);
            }
        }
    }

    static java.lang.Class<?> getArrayClass(java.lang.Class<?> cls) {
        return java.lang.reflect.Array.newInstance(cls, 0).getClass();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
      (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:645) com.google.common.reflect.Types.JavaVersion.CURRENT com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public final java.lang.reflect.GenericArrayType newArrayType(java.lang.reflect.Type type) {
                return new com.google.common.reflect.Types.GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                com.google.common.base.Preconditions.checkNotNull(type);
                if (!(type instanceof java.lang.Class)) {
                    return type;
                }
                java.lang.Class cls = (java.lang.Class) type;
                return cls.isArray() ? new com.google.common.reflect.Types.GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type newArrayType(java.lang.reflect.Type type) {
                if (type instanceof java.lang.Class) {
                    return com.google.common.reflect.Types.getArrayClass((java.lang.Class) type);
                }
                return new com.google.common.reflect.Types.GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type newArrayType(java.lang.reflect.Type type) {
                return JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return JAVA7.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.String typeName(java.lang.reflect.Type type) {
                return type.getTypeName();
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            final boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type newArrayType(java.lang.reflect.Type type) {
                return JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return JAVA8.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            final java.lang.String typeName(java.lang.reflect.Type type) {
                return type.getTypeName();
            }
        };

        static final com.google.common.reflect.Types.JavaVersion CURRENT;

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract java.lang.reflect.Type newArrayType(java.lang.reflect.Type type);

        abstract java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type);

        private JavaVersion() {
        }

        public static com.google.common.reflect.Types.JavaVersion valueOf(java.lang.String str) {
            return (com.google.common.reflect.Types.JavaVersion) java.lang.Enum.valueOf(com.google.common.reflect.Types.JavaVersion.class, str);
        }

        public static com.google.common.reflect.Types.JavaVersion[] values() {
            return (com.google.common.reflect.Types.JavaVersion[]) $VALUES.clone();
        }

        static {
            if (java.lang.reflect.AnnotatedElement.class.isAssignableFrom(java.lang.reflect.TypeVariable.class)) {
                if (new com.google.common.reflect.TypeCapture<java.util.Map.Entry<java.lang.String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = r2;
                    return;
                } else {
                    CURRENT = r3;
                    return;
                }
            }
            if (new com.google.common.reflect.TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.capture() instanceof java.lang.Class) {
                CURRENT = r1;
            } else {
                CURRENT = r0;
            }
        }

        final com.google.common.collect.ImmutableList<java.lang.reflect.Type> usedInGenericType(java.lang.reflect.Type[] typeArr) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (java.lang.reflect.Type type : typeArr) {
                builder.add((com.google.common.collect.ImmutableList.Builder) usedInGenericType(type));
            }
            return builder.build();
        }

        java.lang.String typeName(java.lang.reflect.Type type) {
            return com.google.common.reflect.Types.toString(type);
        }
    }

    static final class NativeTypeVariableEquals<X> {
        static final boolean NATIVE_TYPE_VARIABLE_ONLY = !com.google.common.reflect.Types.NativeTypeVariableEquals.class.getTypeParameters()[0].equals(com.google.common.reflect.Types.newArtificialTypeVariable(com.google.common.reflect.Types.NativeTypeVariableEquals.class, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, new java.lang.reflect.Type[0]));

        private NativeTypeVariableEquals() {
        }
    }

    private Types() {
    }
}
