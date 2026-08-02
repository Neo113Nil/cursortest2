package com.squareup.moshi;

/* loaded from: classes3.dex */
final class ClassJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    public static final com.squareup.moshi.JsonAdapter.Factory getHighResolutionOutputSizeshNQ4ISI = new com.squareup.moshi.JsonAdapter.Factory() { // from class: com.squareup.moshi.ClassJsonAdapter.1
        @Override // com.squareup.moshi.JsonAdapter.Factory
        @javax.annotation.Nullable
        public com.squareup.moshi.JsonAdapter<?> create(java.lang.reflect.Type type, java.util.Set<? extends java.lang.annotation.Annotation> set, com.squareup.moshi.Moshi moshi) {
            com.squareup.moshi.Json json;
            if (!(type instanceof java.lang.Class) && !(type instanceof java.lang.reflect.ParameterizedType)) {
                return null;
            }
            java.lang.Class<?> rawType = com.squareup.moshi.Types.getRawType(type);
            if (rawType.isInterface() || rawType.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (com.squareup.moshi.internal.Util.isPlatformType(rawType)) {
                getHighSpeedVideoFpsRangesFor(type, java.util.List.class);
                getHighSpeedVideoFpsRangesFor(type, java.util.Set.class);
                getHighSpeedVideoFpsRangesFor(type, java.util.Map.class);
                getHighSpeedVideoFpsRangesFor(type, java.util.Collection.class);
                java.lang.String concat = "Platform ".concat(java.lang.String.valueOf(rawType));
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(concat);
                    sb.append(" in ");
                    sb.append(type);
                    concat = sb.toString();
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(concat);
                sb2.append(" requires explicit JsonAdapter to be registered");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (rawType.isAnonymousClass()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Cannot serialize anonymous class ");
                sb3.append(rawType.getName());
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            if (rawType.isLocalClass()) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Cannot serialize local class ");
                sb4.append(rawType.getName());
                throw new java.lang.IllegalArgumentException(sb4.toString());
            }
            if (rawType.getEnclosingClass() != null && !java.lang.reflect.Modifier.isStatic(rawType.getModifiers())) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Cannot serialize non-static nested class ");
                sb5.append(rawType.getName());
                throw new java.lang.IllegalArgumentException(sb5.toString());
            }
            if (java.lang.reflect.Modifier.isAbstract(rawType.getModifiers())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cannot serialize abstract class ");
                sb6.append(rawType.getName());
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
            if (com.squareup.moshi.internal.Util.isKotlin(rawType)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Cannot serialize Kotlin type ");
                sb7.append(rawType.getName());
                sb7.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                throw new java.lang.IllegalArgumentException(sb7.toString());
            }
            com.squareup.moshi.ClassFactory highSpeedVideoSizes = com.squareup.moshi.ClassFactory.getHighSpeedVideoSizes(rawType);
            java.util.TreeMap treeMap = new java.util.TreeMap();
            while (type != java.lang.Object.class) {
                java.lang.Class<?> rawType2 = com.squareup.moshi.Types.getRawType(type);
                boolean isPlatformType = com.squareup.moshi.internal.Util.isPlatformType(rawType2);
                for (java.lang.reflect.Field field : rawType2.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (!java.lang.reflect.Modifier.isStatic(modifiers) && !java.lang.reflect.Modifier.isTransient(modifiers) && ((java.lang.reflect.Modifier.isPublic(modifiers) || java.lang.reflect.Modifier.isProtected(modifiers) || !isPlatformType) && ((json = (com.squareup.moshi.Json) field.getAnnotation(com.squareup.moshi.Json.class)) == null || !json.ignore()))) {
                        java.lang.reflect.Type resolve = com.squareup.moshi.internal.Util.resolve(type, rawType2, field.getGenericType());
                        java.util.Set<? extends java.lang.annotation.Annotation> jsonAnnotations = com.squareup.moshi.internal.Util.jsonAnnotations(field);
                        java.lang.String name2 = field.getName();
                        com.squareup.moshi.JsonAdapter<T> adapter = moshi.adapter(resolve, jsonAnnotations, name2);
                        field.setAccessible(true);
                        java.lang.String jsonName = com.squareup.moshi.internal.Util.jsonName(name2, json);
                        com.squareup.moshi.ClassJsonAdapter.FieldBinding fieldBinding = new com.squareup.moshi.ClassJsonAdapter.FieldBinding(jsonName, field, adapter);
                        com.squareup.moshi.ClassJsonAdapter.FieldBinding fieldBinding2 = (com.squareup.moshi.ClassJsonAdapter.FieldBinding) treeMap.put(jsonName, fieldBinding);
                        if (fieldBinding2 != null) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Conflicting fields:\n    ");
                            sb8.append(fieldBinding2.getHighSpeedVideoFpsRanges);
                            sb8.append("\n    ");
                            sb8.append(fieldBinding.getHighSpeedVideoFpsRanges);
                            throw new java.lang.IllegalArgumentException(sb8.toString());
                        }
                    }
                }
                type = com.squareup.moshi.Types.getHighSpeedVideoSizes(type);
            }
            return new com.squareup.moshi.ClassJsonAdapter(highSpeedVideoSizes, treeMap).nullSafe();
        }

        private static void getHighSpeedVideoFpsRangesFor(java.lang.reflect.Type type, java.lang.Class<?> cls) {
            java.lang.Class<?> rawType = com.squareup.moshi.Types.getRawType(type);
            if (cls.isAssignableFrom(rawType)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No JsonAdapter for ");
                sb.append(type);
                sb.append(", you should probably use ");
                sb.append(cls.getSimpleName());
                sb.append(" instead of ");
                sb.append(rawType.getSimpleName());
                sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    };
    private final com.squareup.moshi.ClassJsonAdapter.FieldBinding<?>[] Camera2StreamConfigurationMap;
    private final com.squareup.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor;
    private final com.squareup.moshi.ClassFactory<T> getHighSpeedVideoSizes;

    ClassJsonAdapter(com.squareup.moshi.ClassFactory<T> classFactory, java.util.Map<java.lang.String, com.squareup.moshi.ClassJsonAdapter.FieldBinding<?>> map) {
        this.getHighSpeedVideoSizes = classFactory;
        this.Camera2StreamConfigurationMap = (com.squareup.moshi.ClassJsonAdapter.FieldBinding[]) map.values().toArray(new com.squareup.moshi.ClassJsonAdapter.FieldBinding[map.size()]);
        this.getHighSpeedVideoFpsRangesFor = com.squareup.moshi.JsonReader.Options.of((java.lang.String[]) map.keySet().toArray(new java.lang.String[map.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        try {
            T highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(this.getHighSpeedVideoFpsRangesFor);
                    if (selectName == -1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        com.squareup.moshi.ClassJsonAdapter.FieldBinding<?> fieldBinding = this.Camera2StreamConfigurationMap[selectName];
                        fieldBinding.getHighSpeedVideoFpsRanges.set(highResolutionOutputSizeshNQ4ISI, fieldBinding.getHighSpeedVideoSizes.fromJson(jsonReader));
                    }
                }
                jsonReader.endObject();
                return highResolutionOutputSizeshNQ4ISI;
            } catch (java.lang.IllegalAccessException unused) {
                throw new java.lang.AssertionError();
            }
        } catch (java.lang.IllegalAccessException unused2) {
            throw new java.lang.AssertionError();
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw com.squareup.moshi.internal.Util.rethrowCause(e2);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(com.squareup.moshi.JsonWriter jsonWriter, T t) throws java.io.IOException {
        try {
            jsonWriter.beginObject();
            for (com.squareup.moshi.ClassJsonAdapter.FieldBinding<?> fieldBinding : this.Camera2StreamConfigurationMap) {
                jsonWriter.name(fieldBinding.Camera2StreamConfigurationMap);
                fieldBinding.getHighSpeedVideoSizes.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) fieldBinding.getHighSpeedVideoFpsRanges.get(t));
            }
            jsonWriter.endObject();
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonAdapter(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(")");
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    static class FieldBinding<T> {
        final java.lang.String Camera2StreamConfigurationMap;
        final java.lang.reflect.Field getHighSpeedVideoFpsRanges;
        final com.squareup.moshi.JsonAdapter<T> getHighSpeedVideoSizes;

        FieldBinding(java.lang.String str, java.lang.reflect.Field field, com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = field;
            this.getHighSpeedVideoSizes = jsonAdapter;
        }
    }
}
