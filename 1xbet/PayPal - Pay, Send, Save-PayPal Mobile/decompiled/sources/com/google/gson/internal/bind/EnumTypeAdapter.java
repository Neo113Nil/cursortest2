package com.google.gson.internal.bind;

/* loaded from: classes4.dex */
class EnumTypeAdapter<T extends java.lang.Enum<T>> extends com.google.gson.TypeAdapter<T> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            java.lang.Class<? super T> rawType = typeToken.getRawType();
            if (!java.lang.Enum.class.isAssignableFrom(rawType) || rawType == java.lang.Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new com.google.gson.internal.bind.EnumTypeAdapter(rawType);
        }
    };
    private final java.util.Map<T, java.lang.String> constantToName;
    private final java.util.Map<java.lang.String, T> nameToConstant;
    private final java.util.Map<java.lang.String, T> stringToConstant;

    private EnumTypeAdapter(java.lang.Class<T> cls) {
        this.nameToConstant = new java.util.HashMap();
        this.stringToConstant = new java.util.HashMap();
        this.constantToName = new java.util.HashMap();
        try {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (java.lang.reflect.Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            java.lang.reflect.Field[] fieldArr = (java.lang.reflect.Field[]) java.util.Arrays.copyOf(declaredFields, i);
            java.lang.reflect.AccessibleObject.setAccessible(fieldArr, true);
            for (java.lang.reflect.Field field2 : fieldArr) {
                java.lang.Enum r4 = (java.lang.Enum) field2.get(null);
                java.lang.String name2 = r4.name();
                java.lang.String obj = r4.toString();
                com.google.gson.annotations.SerializedName serializedName = (com.google.gson.annotations.SerializedName) field2.getAnnotation(com.google.gson.annotations.SerializedName.class);
                if (serializedName != null) {
                    name2 = serializedName.value();
                    for (java.lang.String str : serializedName.alternate()) {
                        this.nameToConstant.put(str, r4);
                    }
                }
                this.nameToConstant.put(name2, r4);
                this.stringToConstant.put(obj, r4);
                this.constantToName.put(r4, name2);
            }
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.lang.String nextString = jsonReader.nextString();
        T t = this.nameToConstant.get(nextString);
        return t == null ? this.stringToConstant.get(nextString) : t;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
        jsonWriter.value(t == null ? null : this.constantToName.get(t));
    }
}
