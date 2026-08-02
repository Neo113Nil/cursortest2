package com.google.common.reflect;

/* loaded from: classes9.dex */
public abstract class TypeToken<T> extends com.google.common.reflect.TypeCapture<T> implements java.io.Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.reflect.TypeResolver covariantTypeResolver;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.reflect.TypeResolver invariantTypeResolver;
    private final java.lang.reflect.Type runtimeType;

    enum TypeFilter implements com.google.common.base.Predicate<com.google.common.reflect.TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(com.google.common.reflect.TypeToken<?> typeToken) {
                return ((((com.google.common.reflect.TypeToken) typeToken).runtimeType instanceof java.lang.reflect.TypeVariable) || (((com.google.common.reflect.TypeToken) typeToken).runtimeType instanceof java.lang.reflect.WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(com.google.common.reflect.TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    protected TypeToken() {
        java.lang.reflect.Type capture = capture();
        this.runtimeType = capture;
        com.google.common.base.Preconditions.checkState(!(capture instanceof java.lang.reflect.TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", capture);
    }

    protected TypeToken(java.lang.Class<?> cls) {
        java.lang.reflect.Type capture = super.capture();
        if (capture instanceof java.lang.Class) {
            this.runtimeType = capture;
        } else {
            this.runtimeType = com.google.common.reflect.TypeResolver.covariantly(cls).resolveType(capture);
        }
    }

    private TypeToken(java.lang.reflect.Type type) {
        this.runtimeType = (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type);
    }

    public static <T> com.google.common.reflect.TypeToken<T> of(java.lang.Class<T> cls) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(cls);
    }

    public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type type) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(type);
    }

    public final java.lang.Class<? super T> getRawType() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return (java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType();
        }
        return getRawTypes().iterator().next();
    }

    public final java.lang.reflect.Type getType() {
        return this.runtimeType;
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> typeParameter, com.google.common.reflect.TypeToken<X> typeToken) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(new com.google.common.reflect.TypeResolver().where(com.google.common.collect.ImmutableMap.of(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeParameter.typeVariable), typeToken.runtimeType)).resolveType(this.runtimeType));
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> typeParameter, java.lang.Class<X> cls) {
        return where(typeParameter, of((java.lang.Class) cls));
    }

    public final com.google.common.reflect.TypeToken<?> resolveType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        return of(getInvariantTypeResolver().resolveType(type));
    }

    private com.google.common.reflect.TypeToken<?> resolveSupertype(java.lang.reflect.Type type) {
        com.google.common.reflect.TypeToken<?> of = of(getCovariantTypeResolver().resolveType(type));
        of.covariantTypeResolver = this.covariantTypeResolver;
        of.invariantTypeResolver = this.invariantTypeResolver;
        return of;
    }

    final com.google.common.reflect.TypeToken<? super T> getGenericSuperclass() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return boundAsSuperclass(((java.lang.reflect.TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return boundAsSuperclass(((java.lang.reflect.WildcardType) type).getUpperBounds()[0]);
        }
        java.lang.reflect.Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (com.google.common.reflect.TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    private com.google.common.reflect.TypeToken<? super T> boundAsSuperclass(java.lang.reflect.Type type) {
        com.google.common.reflect.TypeToken<? super T> typeToken = (com.google.common.reflect.TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    final com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> getGenericInterfaces() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return boundsAsInterfaces(((java.lang.reflect.TypeVariable) type).getBounds());
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return boundsAsInterfaces(((java.lang.reflect.WildcardType) type).getUpperBounds());
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.reflect.Type type2 : getRawType().getGenericInterfaces()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) resolveSupertype(type2));
        }
        return builder.build();
    }

    private com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> boundsAsInterfaces(java.lang.reflect.Type[] typeArr) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.reflect.Type type : typeArr) {
            com.google.common.reflect.TypeToken<?> of = of(type);
            if (of.getRawType().isInterface()) {
                builder.add((com.google.common.collect.ImmutableList.Builder) of);
            }
        }
        return builder.build();
    }

    public final com.google.common.reflect.TypeToken<T>.TypeSet getTypes() {
        return new com.google.common.reflect.TypeToken.TypeSet();
    }

    public final com.google.common.reflect.TypeToken<? super T> getSupertype(java.lang.Class<? super T> cls) {
        com.google.common.base.Preconditions.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((java.lang.reflect.TypeVariable) type).getBounds());
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((java.lang.reflect.WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return (com.google.common.reflect.TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final com.google.common.reflect.TypeToken<? extends T> getSubtype(java.lang.Class<?> cls) {
        com.google.common.base.Preconditions.checkArgument(!(this.runtimeType instanceof java.lang.reflect.TypeVariable), "Cannot get subtype of type variable <%s>", this);
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((java.lang.reflect.WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        com.google.common.base.Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        com.google.common.reflect.TypeToken<? extends T> typeToken = (com.google.common.reflect.TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        com.google.common.base.Preconditions.checkArgument(typeToken.isSubtypeOf((com.google.common.reflect.TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final boolean isSupertypeOf(com.google.common.reflect.TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final boolean isSupertypeOf(java.lang.reflect.Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final boolean isSubtypeOf(com.google.common.reflect.TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSubtypeOf(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        if (type instanceof java.lang.reflect.WildcardType) {
            return any(((java.lang.reflect.WildcardType) type).getLowerBounds()).isSupertypeOf(this.runtimeType);
        }
        java.lang.reflect.Type type2 = this.runtimeType;
        if (type2 instanceof java.lang.reflect.WildcardType) {
            return any(((java.lang.reflect.WildcardType) type2).getUpperBounds()).isSubtypeOf(type);
        }
        if (type2 instanceof java.lang.reflect.TypeVariable) {
            return type2.equals(type) || any(((java.lang.reflect.TypeVariable) this.runtimeType).getBounds()).isSubtypeOf(type);
        }
        if (type2 instanceof java.lang.reflect.GenericArrayType) {
            return of(type).isSupertypeOfArray((java.lang.reflect.GenericArrayType) this.runtimeType);
        }
        if (type instanceof java.lang.Class) {
            return someRawTypeIsSubclassOf((java.lang.Class) type);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return isSubtypeOfParameterizedType((java.lang.reflect.ParameterizedType) type);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return isSubtypeOfArrayType((java.lang.reflect.GenericArrayType) type);
        }
        return false;
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        java.lang.reflect.Type type = this.runtimeType;
        return (type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive();
    }

    public final com.google.common.reflect.TypeToken<T> wrap() {
        return isPrimitive() ? of(com.google.common.primitives.Primitives.wrap((java.lang.Class) this.runtimeType)) : this;
    }

    private boolean isWrapper() {
        return com.google.common.primitives.Primitives.allWrapperTypes().contains(this.runtimeType);
    }

    public final com.google.common.reflect.TypeToken<T> unwrap() {
        return isWrapper() ? of(com.google.common.primitives.Primitives.unwrap((java.lang.Class) this.runtimeType)) : this;
    }

    public final com.google.common.reflect.TypeToken<?> getComponentType() {
        java.lang.reflect.Type componentType = com.google.common.reflect.Types.getComponentType(this.runtimeType);
        if (componentType == null) {
            return null;
        }
        return of(componentType);
    }

    public final com.google.common.reflect.Invokable<T, java.lang.Object> method(java.lang.reflect.Method method) {
        com.google.common.base.Preconditions.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new com.google.common.reflect.Invokable.MethodInvokable<T>(method) { // from class: com.google.common.reflect.TypeToken.1
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type getGenericReturnType() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveType(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericParameterTypes() {
                return com.google.common.reflect.TypeToken.this.getInvariantTypeResolver().resolveTypesInPlace(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericExceptionTypes() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveTypesInPlace(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public com.google.common.reflect.TypeToken<T> getOwnerType() {
                return com.google.common.reflect.TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getOwnerType());
                sb.append(".");
                sb.append(super.toString());
                return sb.toString();
            }
        };
    }

    public final com.google.common.reflect.Invokable<T, T> constructor(java.lang.reflect.Constructor<?> constructor) {
        com.google.common.base.Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new com.google.common.reflect.Invokable.ConstructorInvokable<T>(constructor) { // from class: com.google.common.reflect.TypeToken.2
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type getGenericReturnType() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveType(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericParameterTypes() {
                return com.google.common.reflect.TypeToken.this.getInvariantTypeResolver().resolveTypesInPlace(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericExceptionTypes() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveTypesInPlace(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public com.google.common.reflect.TypeToken<T> getOwnerType() {
                return com.google.common.reflect.TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getOwnerType());
                sb.append("(");
                sb.append(com.google.common.base.Joiner.on(", ").join(getGenericParameterTypes()));
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public class TypeSet extends com.google.common.collect.ForwardingSet<com.google.common.reflect.TypeToken<? super T>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> types;

        TypeSet() {
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            return new com.google.common.reflect.TypeToken.InterfaceSet(this);
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            return new com.google.common.reflect.TypeToken.ClassSet();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE.collectTypes((com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>>) com.google.common.reflect.TypeToken.this)).filter(com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.types = set;
            return set;
        }

        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes()));
        }
    }

    final class InterfaceSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient com.google.common.reflect.TypeToken<T>.TypeSet allTypes;
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> interfaces;

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            return delegate();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
            return delegate();
        }

        InterfaceSet(com.google.common.reflect.TypeToken<T>.TypeSet typeSet) {
            super();
            this.allTypes = typeSet;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.interfaces;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(this.allTypes).filter(com.google.common.reflect.TypeToken.TypeFilter.INTERFACE_ONLY).toSet();
            this.interfaces = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes())).filter(new com.google.common.base.Predicate() { // from class: com.google.common.reflect.TypeToken$InterfaceSet$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    boolean isInterface;
                    isInterface = ((java.lang.Class) obj).isInterface();
                    return isInterface;
                }
            }).toSet();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            throw new java.lang.UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private java.lang.Object readResolve() {
            return com.google.common.reflect.TypeToken.this.getTypes().interfaces();
        }
    }

    final class ClassSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> classes;

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            return this;
        }

        private ClassSet() {
            super();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            return delegate();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ java.util.Collection delegate() {
            return delegate();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.classes;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE.classesOnly().collectTypes((com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>>) com.google.common.reflect.TypeToken.this)).filter(com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.classes = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.classesOnly().collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes()));
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            throw new java.lang.UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private java.lang.Object readResolve() {
            return com.google.common.reflect.TypeToken.this.getTypes().classes();
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.reflect.TypeToken) {
            return this.runtimeType.equals(((com.google.common.reflect.TypeToken) obj).runtimeType);
        }
        return false;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public java.lang.String toString() {
        return com.google.common.reflect.Types.toString(this.runtimeType);
    }

    protected java.lang.Object writeReplace() {
        return of(new com.google.common.reflect.TypeResolver().resolveType(this.runtimeType));
    }

    final com.google.common.reflect.TypeToken<T> rejectTypeVariables() {
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.TypeToken.3
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.google.common.reflect.TypeToken.this.runtimeType);
                sb.append("contains a type variable and is not safe for the operation");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
                visit(wildcardType.getLowerBounds());
                visit(wildcardType.getUpperBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
                visit(parameterizedType.getActualTypeArguments());
                visit(parameterizedType.getOwnerType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
                visit(genericArrayType.getGenericComponentType());
            }
        }.visit(this.runtimeType);
        return this;
    }

    private boolean someRawTypeIsSubclassOf(java.lang.Class<?> cls) {
        com.google.common.collect.UnmodifiableIterator<java.lang.Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.Class<? super java.lang.Object> rawType = of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        java.lang.reflect.TypeVariable<java.lang.Class<? super java.lang.Object>>[] typeParameters = rawType.getTypeParameters();
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!of(getCovariantTypeResolver().resolveType(typeParameters[i])).is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return java.lang.reflect.Modifier.isStatic(((java.lang.Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSubtypeOfArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                return of((java.lang.Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return of(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSupertypeOfArray(java.lang.reflect.GenericArrayType genericArrayType) {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(java.lang.Object[].class);
            }
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((java.lang.reflect.GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean is(java.lang.reflect.Type type, java.lang.reflect.TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType canonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (java.lang.reflect.WildcardType) type);
            return every(canonicalizeWildcardType.getUpperBounds()).isSupertypeOf(this.runtimeType) && every(canonicalizeWildcardType.getLowerBounds()).isSubtypeOf(this.runtimeType);
        }
        return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
    }

    private static java.lang.reflect.Type canonicalizeTypeArg(java.lang.reflect.TypeVariable<?> typeVariable, java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.WildcardType) {
            return canonicalizeWildcardType(typeVariable, (java.lang.reflect.WildcardType) type);
        }
        return canonicalizeWildcardsInType(type);
    }

    private static java.lang.reflect.Type canonicalizeWildcardsInType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((java.lang.reflect.ParameterizedType) type);
        }
        return type instanceof java.lang.reflect.GenericArrayType ? com.google.common.reflect.Types.newArrayType(canonicalizeWildcardsInType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static java.lang.reflect.WildcardType canonicalizeWildcardType(java.lang.reflect.TypeVariable<?> typeVariable, java.lang.reflect.WildcardType wildcardType) {
        java.lang.reflect.Type[] bounds = typeVariable.getBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).isSubtypeOf(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new com.google.common.reflect.Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]));
    }

    private static java.lang.reflect.ParameterizedType canonicalizeWildcardsInParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.Class cls = (java.lang.Class) parameterizedType.getRawType();
        java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = cls.getTypeParameters();
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return com.google.common.reflect.Types.newParameterizedTypeWithOwner(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static com.google.common.reflect.TypeToken.Bounds every(java.lang.reflect.Type[] typeArr) {
        return new com.google.common.reflect.TypeToken.Bounds(typeArr, false);
    }

    private static com.google.common.reflect.TypeToken.Bounds any(java.lang.reflect.Type[] typeArr) {
        return new com.google.common.reflect.TypeToken.Bounds(typeArr, true);
    }

    static final class Bounds {
        private final java.lang.reflect.Type[] bounds;
        private final boolean target;

        Bounds(java.lang.reflect.Type[] typeArr, boolean z) {
            this.bounds = typeArr;
            this.target = z;
        }

        final boolean isSubtypeOf(java.lang.reflect.Type type) {
            for (java.lang.reflect.Type type2 : this.bounds) {
                boolean isSubtypeOf = com.google.common.reflect.TypeToken.of(type2).isSubtypeOf(type);
                boolean z = this.target;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.target;
        }

        final boolean isSupertypeOf(java.lang.reflect.Type type) {
            com.google.common.reflect.TypeToken<?> of = com.google.common.reflect.TypeToken.of(type);
            for (java.lang.reflect.Type type2 : this.bounds) {
                boolean isSubtypeOf = of.isSubtypeOf(type2);
                boolean z = this.target;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            return !this.target;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.ImmutableSet<java.lang.Class<? super T>> getRawTypes() {
        final com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        new com.google.common.reflect.TypeVisitor(this) { // from class: com.google.common.reflect.TypeToken.4
            final /* synthetic */ com.google.common.reflect.TypeToken this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
                visit(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
                visit(wildcardType.getUpperBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
                builder.add((com.google.common.collect.ImmutableSet.Builder) parameterizedType.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> cls) {
                builder.add((com.google.common.collect.ImmutableSet.Builder) cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
                builder.add((com.google.common.collect.ImmutableSet.Builder) com.google.common.reflect.Types.getArrayClass(com.google.common.reflect.TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
            }
        }.visit(this.runtimeType);
        return builder.build();
    }

    private boolean isOwnedBySubtypeOf(java.lang.reflect.Type type) {
        java.util.Iterator<com.google.common.reflect.TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            java.lang.reflect.Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private java.lang.reflect.Type getOwnerTypeIfPresent() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) type).getOwnerType();
        }
        if (type instanceof java.lang.Class) {
            return ((java.lang.Class) type).getEnclosingClass();
        }
        return null;
    }

    static <T> com.google.common.reflect.TypeToken<? extends T> toGenericType(java.lang.Class<T> cls) {
        if (cls.isArray()) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(com.google.common.reflect.Types.newArrayType(toGenericType(cls.getComponentType()).runtimeType));
        }
        java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = cls.getTypeParameters();
        java.lang.reflect.Type type = (!cls.isMemberClass() || java.lang.reflect.Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(com.google.common.reflect.Types.newParameterizedTypeWithOwner(type, cls, typeParameters));
        }
        return of((java.lang.Class) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.TypeResolver getCovariantTypeResolver() {
        com.google.common.reflect.TypeResolver typeResolver = this.covariantTypeResolver;
        if (typeResolver != null) {
            return typeResolver;
        }
        com.google.common.reflect.TypeResolver covariantly = com.google.common.reflect.TypeResolver.covariantly(this.runtimeType);
        this.covariantTypeResolver = covariantly;
        return covariantly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.TypeResolver getInvariantTypeResolver() {
        com.google.common.reflect.TypeResolver typeResolver = this.invariantTypeResolver;
        if (typeResolver != null) {
            return typeResolver;
        }
        com.google.common.reflect.TypeResolver invariantly = com.google.common.reflect.TypeResolver.invariantly(this.runtimeType);
        this.invariantTypeResolver = invariantly;
        return invariantly;
    }

    private com.google.common.reflect.TypeToken<? super T> getSupertypeFromUpperBounds(java.lang.Class<? super T> cls, java.lang.reflect.Type[] typeArr) {
        for (java.lang.reflect.Type type : typeArr) {
            com.google.common.reflect.TypeToken<?> of = of(type);
            if (of.isSubtypeOf(cls)) {
                return (com.google.common.reflect.TypeToken<? super T>) of.getSupertype(cls);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls);
        sb.append(" isn't a super type of ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private com.google.common.reflect.TypeToken<? extends T> getSubtypeFromLowerBounds(java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        if (typeArr.length > 0) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls);
        sb.append(" isn't a subclass of ");
        sb.append(this);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private com.google.common.reflect.TypeToken<? super T> getArraySupertype(java.lang.Class<? super T> cls) {
        com.google.common.reflect.TypeToken<?> componentType = getComponentType();
        if (componentType == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" isn't a super type of ");
            sb.append(this);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return (com.google.common.reflect.TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype((java.lang.Class) java.util.Objects.requireNonNull(cls.getComponentType())).runtimeType));
    }

    private com.google.common.reflect.TypeToken<? extends T> getArraySubtype(java.lang.Class<?> cls) {
        java.lang.Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls);
            sb.append(" does not appear to be a subtype of ");
            sb.append(this);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return (com.google.common.reflect.TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(((com.google.common.reflect.TypeToken) java.util.Objects.requireNonNull(getComponentType())).getSubtype(componentType).runtimeType));
    }

    private java.lang.reflect.Type resolveTypeArgsForSubclass(java.lang.Class<?> cls) {
        if ((this.runtimeType instanceof java.lang.Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        com.google.common.reflect.TypeToken genericType = toGenericType(cls);
        return new com.google.common.reflect.TypeResolver().where(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).resolveType(genericType.runtimeType);
    }

    private static java.lang.reflect.Type newArrayClassOrGenericArrayType(java.lang.reflect.Type type) {
        return com.google.common.reflect.Types.JavaVersion.JAVA7.newArrayType(type);
    }

    static final class SimpleTypeToken<T> extends com.google.common.reflect.TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(java.lang.reflect.Type type) {
            super(type);
        }
    }

    static abstract class TypeCollector<K> {
        static final com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>> FOR_GENERIC_TYPE = new com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Class<?> getRawType(com.google.common.reflect.TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Iterable<? extends com.google.common.reflect.TypeToken<?>> getInterfaces(com.google.common.reflect.TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public com.google.common.reflect.TypeToken<?> getSuperclass(com.google.common.reflect.TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        };
        static final com.google.common.reflect.TypeToken.TypeCollector<java.lang.Class<?>> FOR_RAW_TYPE = new com.google.common.reflect.TypeToken.TypeCollector<java.lang.Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Class<?> getRawType(java.lang.Class<?> cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Iterable<? extends java.lang.Class<?>> getInterfaces(java.lang.Class<?> cls) {
                return java.util.Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Class<?> getSuperclass(java.lang.Class<?> cls) {
                return cls.getSuperclass();
            }
        };

        abstract java.lang.Iterable<? extends K> getInterfaces(K k);

        abstract java.lang.Class<?> getRawType(K k);

        abstract K getSuperclass(K k);

        private TypeCollector() {
        }

        final com.google.common.reflect.TypeToken.TypeCollector<K> classesOnly() {
            return new com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector<K>(this) { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
                @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
                java.lang.Iterable<? extends K> getInterfaces(K k) {
                    return com.google.common.collect.ImmutableSet.of();
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector
                com.google.common.collect.ImmutableList<K> collectTypes(java.lang.Iterable<? extends K> iterable) {
                    com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                    for (K k : iterable) {
                        if (!getRawType(k).isInterface()) {
                            builder.add((com.google.common.collect.ImmutableList.Builder) k);
                        }
                    }
                    return super.collectTypes((java.lang.Iterable) builder.build());
                }
            };
        }

        final com.google.common.collect.ImmutableList<K> collectTypes(K k) {
            return collectTypes((java.lang.Iterable) com.google.common.collect.ImmutableList.of(k));
        }

        com.google.common.collect.ImmutableList<K> collectTypes(java.lang.Iterable<? extends K> iterable) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                collectTypes(it.next(), hashMap);
            }
            return sortKeysByValue(hashMap, com.google.common.collect.Ordering.natural().reverse());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int collectTypes(K k, java.util.Map<? super K, java.lang.Integer> map) {
            java.lang.Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = getRawType(k).isInterface();
            java.util.Iterator<? extends K> it = getInterfaces(k).iterator();
            int i = isInterface;
            while (it.hasNext()) {
                i = java.lang.Math.max(i, collectTypes(it.next(), map));
            }
            K superclass = getSuperclass(k);
            int i2 = i;
            if (superclass != null) {
                i2 = java.lang.Math.max(i, collectTypes(superclass, map));
            }
            int i3 = i2 + 1;
            map.put(k, java.lang.Integer.valueOf(i3));
            return i3;
        }

        private static <K, V> com.google.common.collect.ImmutableList<K> sortKeysByValue(final java.util.Map<K, V> map, final java.util.Comparator<? super V> comparator) {
            return (com.google.common.collect.ImmutableList<K>) new com.google.common.collect.Ordering<K>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(K k, K k2) {
                    return comparator.compare(java.util.Objects.requireNonNull(map.get(k)), java.util.Objects.requireNonNull(map.get(k2)));
                }
            }.immutableSortedCopy(map.keySet());
        }

        static class ForwardingTypeCollector<K> extends com.google.common.reflect.TypeToken.TypeCollector<K> {
            private final com.google.common.reflect.TypeToken.TypeCollector<K> delegate;

            ForwardingTypeCollector(com.google.common.reflect.TypeToken.TypeCollector<K> typeCollector) {
                super();
                this.delegate = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Class<?> getRawType(K k) {
                return this.delegate.getRawType(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Iterable<? extends K> getInterfaces(K k) {
                return this.delegate.getInterfaces(k);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            K getSuperclass(K k) {
                return this.delegate.getSuperclass(k);
            }
        }
    }
}
