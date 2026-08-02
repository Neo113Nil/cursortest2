package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private static final com.google.gson.TypeAdapterFactory TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final com.google.gson.TypeAdapterFactory TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.gson.TypeAdapterFactory> adapterFactoryMap = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    static class DummyTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            throw new java.lang.AssertionError("Factory should not be used");
        }
    }

    static {
        TREE_TYPE_CLASS_DUMMY_FACTORY = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.DummyTypeAdapterFactory();
        TREE_TYPE_FIELD_DUMMY_FACTORY = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    private static com.google.gson.annotations.JsonAdapter getAnnotation(java.lang.Class<?> cls) {
        return (com.google.gson.annotations.JsonAdapter) cls.getAnnotation(com.google.gson.annotations.JsonAdapter.class);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
        com.google.gson.annotations.JsonAdapter annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return (com.google.gson.TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, annotation, true);
    }

    private static java.lang.Object createAdapter(com.google.gson.internal.ConstructorConstructor constructorConstructor, java.lang.Class<?> cls) {
        return constructorConstructor.get(com.google.gson.reflect.TypeToken.get((java.lang.Class) cls), true).construct();
    }

    private com.google.gson.TypeAdapterFactory putFactoryAndGetCurrent(java.lang.Class<?> cls, com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        com.google.gson.TypeAdapterFactory putIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, typeAdapterFactory);
        return putIfAbsent != null ? putIfAbsent : typeAdapterFactory;
    }

    final com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor constructorConstructor, com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<?> typeToken, com.google.gson.annotations.JsonAdapter jsonAdapter, boolean z) {
        com.google.gson.TypeAdapterFactory typeAdapterFactory;
        com.google.gson.TypeAdapter<?> treeTypeAdapter;
        java.lang.Object createAdapter = createAdapter(constructorConstructor, jsonAdapter.value());
        boolean nullSafe = jsonAdapter.nullSafe();
        if (createAdapter instanceof com.google.gson.TypeAdapter) {
            treeTypeAdapter = (com.google.gson.TypeAdapter) createAdapter;
        } else if (createAdapter instanceof com.google.gson.TypeAdapterFactory) {
            com.google.gson.TypeAdapterFactory typeAdapterFactory2 = (com.google.gson.TypeAdapterFactory) createAdapter;
            if (z) {
                typeAdapterFactory2 = putFactoryAndGetCurrent(typeToken.getRawType(), typeAdapterFactory2);
            }
            treeTypeAdapter = typeAdapterFactory2.create(gson, typeToken);
        } else {
            boolean z2 = createAdapter instanceof com.google.gson.JsonSerializer;
            if (z2 || (createAdapter instanceof com.google.gson.JsonDeserializer)) {
                com.google.gson.JsonSerializer jsonSerializer = z2 ? (com.google.gson.JsonSerializer) createAdapter : null;
                com.google.gson.JsonDeserializer jsonDeserializer = createAdapter instanceof com.google.gson.JsonDeserializer ? (com.google.gson.JsonDeserializer) createAdapter : null;
                if (z) {
                    typeAdapterFactory = TREE_TYPE_CLASS_DUMMY_FACTORY;
                } else {
                    typeAdapterFactory = TREE_TYPE_FIELD_DUMMY_FACTORY;
                }
                treeTypeAdapter = new com.google.gson.internal.bind.TreeTypeAdapter<>(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, nullSafe);
                nullSafe = false;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(createAdapter.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(typeToken.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (treeTypeAdapter == null || !nullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    public final boolean isClassJsonAdapterFactory(com.google.gson.reflect.TypeToken<?> typeToken, com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        java.util.Objects.requireNonNull(typeToken);
        java.util.Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        java.lang.Class<? super java.lang.Object> rawType = typeToken.getRawType();
        com.google.gson.TypeAdapterFactory typeAdapterFactory2 = this.adapterFactoryMap.get(rawType);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2 == typeAdapterFactory;
        }
        com.google.gson.annotations.JsonAdapter annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        java.lang.Class<?> value = annotation.value();
        return com.google.gson.TypeAdapterFactory.class.isAssignableFrom(value) && putFactoryAndGetCurrent(rawType, (com.google.gson.TypeAdapterFactory) createAdapter(this.constructorConstructor, value)) == typeAdapterFactory;
    }
}
