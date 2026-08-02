package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.nimbusds.jose.shaded.gson.TypeAdapterFactory {
    private final com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
        com.nimbusds.jose.shaded.gson.annotations.JsonAdapter jsonAdapter = (com.nimbusds.jose.shaded.gson.annotations.JsonAdapter) typeToken.getRawType().getAnnotation(com.nimbusds.jose.shaded.gson.annotations.JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (com.nimbusds.jose.shaded.gson.TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }

    final com.nimbusds.jose.shaded.gson.TypeAdapter<?> getTypeAdapter(com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor constructorConstructor, com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<?> typeToken, com.nimbusds.jose.shaded.gson.annotations.JsonAdapter jsonAdapter) {
        com.nimbusds.jose.shaded.gson.TypeAdapter<?> treeTypeAdapter;
        java.lang.Object construct = constructorConstructor.get(com.nimbusds.jose.shaded.gson.reflect.TypeToken.get((java.lang.Class) jsonAdapter.value())).construct();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (construct instanceof com.nimbusds.jose.shaded.gson.TypeAdapter) {
            treeTypeAdapter = (com.nimbusds.jose.shaded.gson.TypeAdapter) construct;
        } else if (construct instanceof com.nimbusds.jose.shaded.gson.TypeAdapterFactory) {
            treeTypeAdapter = ((com.nimbusds.jose.shaded.gson.TypeAdapterFactory) construct).create(gson, typeToken);
        } else {
            boolean z = construct instanceof com.nimbusds.jose.shaded.gson.JsonSerializer;
            if (z || (construct instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer)) {
                treeTypeAdapter = new com.nimbusds.jose.shaded.gson.internal.bind.TreeTypeAdapter<>(z ? (com.nimbusds.jose.shaded.gson.JsonSerializer) construct : null, construct instanceof com.nimbusds.jose.shaded.gson.JsonDeserializer ? (com.nimbusds.jose.shaded.gson.JsonDeserializer) construct : null, gson, typeToken, null, nullSafe);
                nullSafe = false;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(construct.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(typeToken.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (treeTypeAdapter == null || !nullSafe) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
