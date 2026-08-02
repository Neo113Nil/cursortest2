package com.google.common.reflect;

/* loaded from: classes9.dex */
public final class TypeResolver {
    private final com.google.common.reflect.TypeResolver.TypeTable typeTable;

    public TypeResolver() {
        this.typeTable = new com.google.common.reflect.TypeResolver.TypeTable();
    }

    private TypeResolver(com.google.common.reflect.TypeResolver.TypeTable typeTable) {
        this.typeTable = typeTable;
    }

    static com.google.common.reflect.TypeResolver covariantly(java.lang.reflect.Type type) {
        return new com.google.common.reflect.TypeResolver().where(com.google.common.reflect.TypeResolver.TypeMappingIntrospector.getTypeMappings(type));
    }

    static com.google.common.reflect.TypeResolver invariantly(java.lang.reflect.Type type) {
        return new com.google.common.reflect.TypeResolver().where(com.google.common.reflect.TypeResolver.TypeMappingIntrospector.getTypeMappings(com.google.common.reflect.TypeResolver.WildcardCapturer.INSTANCE.capture(type)));
    }

    public final com.google.common.reflect.TypeResolver where(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        populateTypeMappings(hashMap, (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type), (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type2));
        return where(hashMap);
    }

    final com.google.common.reflect.TypeResolver where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> map) {
        return new com.google.common.reflect.TypeResolver(this.typeTable.where(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void populateTypeMappings(final java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> map, java.lang.reflect.Type type, final java.lang.reflect.Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
                map.put(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeVariable), type2);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
                java.lang.reflect.Type type3 = type2;
                if (type3 instanceof java.lang.reflect.WildcardType) {
                    java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type3;
                    java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                    java.lang.reflect.Type[] upperBounds2 = wildcardType2.getUpperBounds();
                    java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
                    java.lang.reflect.Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                    com.google.common.base.Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                    for (int i = 0; i < upperBounds.length; i++) {
                        com.google.common.reflect.TypeResolver.populateTypeMappings(map, upperBounds[i], upperBounds2[i]);
                    }
                    for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                        com.google.common.reflect.TypeResolver.populateTypeMappings(map, lowerBounds[i2], lowerBounds2[i2]);
                    }
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
                java.lang.reflect.Type type3 = type2;
                if (type3 instanceof java.lang.reflect.WildcardType) {
                    return;
                }
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) com.google.common.reflect.TypeResolver.expectArgument(java.lang.reflect.ParameterizedType.class, type3);
                if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                    com.google.common.reflect.TypeResolver.populateTypeMappings(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                }
                com.google.common.base.Preconditions.checkArgument(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                java.lang.reflect.Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                com.google.common.base.Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    com.google.common.reflect.TypeResolver.populateTypeMappings(map, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
                java.lang.reflect.Type type3 = type2;
                if (type3 instanceof java.lang.reflect.WildcardType) {
                    return;
                }
                java.lang.reflect.Type componentType = com.google.common.reflect.Types.getComponentType(type3);
                com.google.common.base.Preconditions.checkArgument(componentType != null, "%s is not an array type.", type2);
                com.google.common.reflect.TypeResolver.populateTypeMappings(map, genericArrayType.getGenericComponentType(), componentType);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> cls) {
                if (type2 instanceof java.lang.reflect.WildcardType) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No type mapping from ");
                sb.append(cls);
                sb.append(" to ");
                sb.append(type2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }.visit(type);
    }

    public final java.lang.reflect.Type resolveType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        if (type instanceof java.lang.reflect.TypeVariable) {
            return this.typeTable.resolve((java.lang.reflect.TypeVariable) type);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return resolveParameterizedType((java.lang.reflect.ParameterizedType) type);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return resolveGenericArrayType((java.lang.reflect.GenericArrayType) type);
        }
        return type instanceof java.lang.reflect.WildcardType ? resolveWildcardType((java.lang.reflect.WildcardType) type) : type;
    }

    final java.lang.reflect.Type[] resolveTypesInPlace(java.lang.reflect.Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]);
        }
        return typeArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.reflect.Type[] resolveTypes(java.lang.reflect.Type[] typeArr) {
        java.lang.reflect.Type[] typeArr2 = new java.lang.reflect.Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = resolveType(typeArr[i]);
        }
        return typeArr2;
    }

    private java.lang.reflect.WildcardType resolveWildcardType(java.lang.reflect.WildcardType wildcardType) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(resolveTypes(wildcardType.getLowerBounds()), resolveTypes(wildcardType.getUpperBounds()));
    }

    private java.lang.reflect.Type resolveGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
        return com.google.common.reflect.Types.newArrayType(resolveType(genericArrayType.getGenericComponentType()));
    }

    private java.lang.reflect.ParameterizedType resolveParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
        java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
        return com.google.common.reflect.Types.newParameterizedTypeWithOwner(ownerType == null ? null : resolveType(ownerType), (java.lang.Class) resolveType(parameterizedType.getRawType()), resolveTypes(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T expectArgument(java.lang.Class<T> cls, java.lang.Object obj) {
        try {
            return cls.cast(obj);
        } catch (java.lang.ClassCastException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj);
            sb.append(" is not a ");
            sb.append(cls.getSimpleName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    static class TypeTable {
        private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> map;

        TypeTable() {
            this.map = com.google.common.collect.ImmutableMap.of();
        }

        private TypeTable(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> immutableMap) {
            this.map = immutableMap;
        }

        final com.google.common.reflect.TypeResolver.TypeTable where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> map) {
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            builder.putAll(this.map);
            for (java.util.Map.Entry<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> entry : map.entrySet()) {
                com.google.common.reflect.TypeResolver.TypeVariableKey key = entry.getKey();
                java.lang.reflect.Type value = entry.getValue();
                com.google.common.base.Preconditions.checkArgument(!key.equalsType(value), "Type variable %s bound to itself", key);
                builder.put(key, value);
            }
            return new com.google.common.reflect.TypeResolver.TypeTable(builder.buildOrThrow());
        }

        final java.lang.reflect.Type resolve(final java.lang.reflect.TypeVariable<?> typeVariable) {
            return resolveInternal(typeVariable, new com.google.common.reflect.TypeResolver.TypeTable(this) { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                final /* synthetic */ com.google.common.reflect.TypeResolver.TypeTable this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public java.lang.reflect.Type resolveInternal(java.lang.reflect.TypeVariable<?> typeVariable2, com.google.common.reflect.TypeResolver.TypeTable typeTable) {
                    return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : this.resolveInternal(typeVariable2, typeTable);
                }
            });
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
        java.lang.reflect.Type resolveInternal(java.lang.reflect.TypeVariable<?> typeVariable, com.google.common.reflect.TypeResolver.TypeTable typeTable) {
            java.lang.reflect.Type type = this.map.get(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeVariable));
            if (type == null) {
                java.lang.reflect.Type[] bounds = typeVariable.getBounds();
                if (bounds.length == 0) {
                    return typeVariable;
                }
                java.lang.reflect.Type[] resolveTypes = new com.google.common.reflect.TypeResolver(typeTable).resolveTypes(bounds);
                return (com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY && java.util.Arrays.equals(bounds, resolveTypes)) ? typeVariable : com.google.common.reflect.Types.newArtificialTypeVariable(typeVariable.getGenericDeclaration(), typeVariable.getName(), resolveTypes);
            }
            return new com.google.common.reflect.TypeResolver(typeTable).resolveType(type);
        }
    }

    static final class TypeMappingIntrospector extends com.google.common.reflect.TypeVisitor {
        private final java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> mappings = new java.util.HashMap();

        private TypeMappingIntrospector() {
        }

        static com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> getTypeMappings(java.lang.reflect.Type type) {
            com.google.common.base.Preconditions.checkNotNull(type);
            com.google.common.reflect.TypeResolver.TypeMappingIntrospector typeMappingIntrospector = new com.google.common.reflect.TypeResolver.TypeMappingIntrospector();
            typeMappingIntrospector.visit(type);
            return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) typeMappingIntrospector.mappings);
        }

        @Override // com.google.common.reflect.TypeVisitor
        final void visitClass(java.lang.Class<?> cls) {
            visit(cls.getGenericSuperclass());
            visit(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        final void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
            java.lang.Class cls = (java.lang.Class) parameterizedType.getRawType();
            java.lang.reflect.TypeVariable[] typeParameters = cls.getTypeParameters();
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            com.google.common.base.Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                map(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeParameters[i]), actualTypeArguments[i]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        final void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
            visit(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        final void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
            visit(wildcardType.getUpperBounds());
        }

        private void map(com.google.common.reflect.TypeResolver.TypeVariableKey typeVariableKey, java.lang.reflect.Type type) {
            if (this.mappings.containsKey(typeVariableKey)) {
                return;
            }
            java.lang.reflect.Type type2 = type;
            while (type2 != null) {
                if (typeVariableKey.equalsType(type2)) {
                    while (type != null) {
                        type = this.mappings.remove(com.google.common.reflect.TypeResolver.TypeVariableKey.forLookup(type));
                    }
                    return;
                }
                type2 = this.mappings.get(com.google.common.reflect.TypeResolver.TypeVariableKey.forLookup(type2));
            }
            this.mappings.put(typeVariableKey, type);
        }
    }

    static class WildcardCapturer {
        static final com.google.common.reflect.TypeResolver.WildcardCapturer INSTANCE = new com.google.common.reflect.TypeResolver.WildcardCapturer();
        private final java.util.concurrent.atomic.AtomicInteger id;

        private WildcardCapturer() {
            this(new java.util.concurrent.atomic.AtomicInteger());
        }

        private WildcardCapturer(java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.id = atomicInteger;
        }

        final java.lang.reflect.Type capture(java.lang.reflect.Type type) {
            com.google.common.base.Preconditions.checkNotNull(type);
            if ((type instanceof java.lang.Class) || (type instanceof java.lang.reflect.TypeVariable)) {
                return type;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return com.google.common.reflect.Types.newArrayType(notForTypeVariable().capture(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.Class cls = (java.lang.Class) parameterizedType.getRawType();
                java.lang.reflect.TypeVariable<?>[] typeParameters = cls.getTypeParameters();
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = forTypeVariable(typeParameters[i]).capture(actualTypeArguments[i]);
                }
                return com.google.common.reflect.Types.newParameterizedTypeWithOwner(notForTypeVariable().captureNullable(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? captureAsTypeVariable(wildcardType.getUpperBounds()) : type;
            }
            throw new java.lang.AssertionError("must have been one of the known types");
        }

        java.lang.reflect.TypeVariable<?> captureAsTypeVariable(java.lang.reflect.Type[] typeArr) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("capture#");
            sb.append(this.id.incrementAndGet());
            sb.append("-of ? extends ");
            sb.append(com.google.common.base.Joiner.on(kotlin.text.Typography.amp).join(typeArr));
            return com.google.common.reflect.Types.newArtificialTypeVariable(com.google.common.reflect.TypeResolver.WildcardCapturer.class, sb.toString(), typeArr);
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer forTypeVariable(final java.lang.reflect.TypeVariable<?> typeVariable) {
            return new com.google.common.reflect.TypeResolver.WildcardCapturer(this, this.id) { // from class: com.google.common.reflect.TypeResolver.WildcardCapturer.1
                final /* synthetic */ com.google.common.reflect.TypeResolver.WildcardCapturer this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
                java.lang.reflect.TypeVariable<?> captureAsTypeVariable(java.lang.reflect.Type[] typeArr) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(java.util.Arrays.asList(typeArr));
                    linkedHashSet.addAll(java.util.Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(java.lang.Object.class);
                    }
                    return super.captureAsTypeVariable((java.lang.reflect.Type[]) linkedHashSet.toArray(new java.lang.reflect.Type[0]));
                }
            };
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer notForTypeVariable() {
            return new com.google.common.reflect.TypeResolver.WildcardCapturer(this.id);
        }

        private java.lang.reflect.Type captureNullable(java.lang.reflect.Type type) {
            if (type == null) {
                return null;
            }
            return capture(type);
        }
    }

    static final class TypeVariableKey {
        private final java.lang.reflect.TypeVariable<?> var;

        TypeVariableKey(java.lang.reflect.TypeVariable<?> typeVariable) {
            this.var = (java.lang.reflect.TypeVariable) com.google.common.base.Preconditions.checkNotNull(typeVariable);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.var.getGenericDeclaration(), this.var.getName());
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.reflect.TypeResolver.TypeVariableKey) {
                return equalsTypeVariable(((com.google.common.reflect.TypeResolver.TypeVariableKey) obj).var);
            }
            return false;
        }

        public final java.lang.String toString() {
            return this.var.toString();
        }

        static com.google.common.reflect.TypeResolver.TypeVariableKey forLookup(java.lang.reflect.Type type) {
            if (type instanceof java.lang.reflect.TypeVariable) {
                return new com.google.common.reflect.TypeResolver.TypeVariableKey((java.lang.reflect.TypeVariable) type);
            }
            return null;
        }

        final boolean equalsType(java.lang.reflect.Type type) {
            if (type instanceof java.lang.reflect.TypeVariable) {
                return equalsTypeVariable((java.lang.reflect.TypeVariable) type);
            }
            return false;
        }

        private boolean equalsTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
            return this.var.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.var.getName().equals(typeVariable.getName());
        }
    }
}
