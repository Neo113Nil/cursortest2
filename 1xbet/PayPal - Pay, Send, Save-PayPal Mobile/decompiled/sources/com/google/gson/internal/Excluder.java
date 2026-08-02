package com.google.gson.internal;

/* loaded from: classes4.dex */
public final class Excluder implements com.google.gson.TypeAdapterFactory, java.lang.Cloneable {
    public static final com.google.gson.internal.Excluder DEFAULT = new com.google.gson.internal.Excluder();
    public static final double IGNORE_VERSIONS = -1.0d;
    public boolean requireExpose;
    public double version = -1.0d;
    public int modifiers = 136;
    public boolean serializeInnerClasses = true;
    public java.util.List<com.google.gson.ExclusionStrategy> serializationStrategies = java.util.Collections.emptyList();
    public java.util.List<com.google.gson.ExclusionStrategy> deserializationStrategies = java.util.Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.google.gson.internal.Excluder m10463clone() {
        try {
            return (com.google.gson.internal.Excluder) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final com.google.gson.internal.Excluder withVersion(double d) {
        com.google.gson.internal.Excluder m10463clone = m10463clone();
        m10463clone.version = d;
        return m10463clone;
    }

    public final com.google.gson.internal.Excluder withModifiers(int... iArr) {
        com.google.gson.internal.Excluder m10463clone = m10463clone();
        m10463clone.modifiers = 0;
        for (int i : iArr) {
            m10463clone.modifiers = i | m10463clone.modifiers;
        }
        return m10463clone;
    }

    public final com.google.gson.internal.Excluder disableInnerClassSerialization() {
        com.google.gson.internal.Excluder m10463clone = m10463clone();
        m10463clone.serializeInnerClasses = false;
        return m10463clone;
    }

    public final com.google.gson.internal.Excluder excludeFieldsWithoutExposeAnnotation() {
        com.google.gson.internal.Excluder m10463clone = m10463clone();
        m10463clone.requireExpose = true;
        return m10463clone;
    }

    public final com.google.gson.internal.Excluder withExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        com.google.gson.internal.Excluder m10463clone = m10463clone();
        if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.serializationStrategies);
            m10463clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.deserializationStrategies);
            m10463clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return m10463clone;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> com.google.gson.TypeAdapter<T> create(final com.google.gson.Gson gson, final com.google.gson.reflect.TypeToken<T> typeToken) {
        java.lang.Class<? super T> rawType = typeToken.getRawType();
        final boolean excludeClass = excludeClass(rawType, true);
        final boolean excludeClass2 = excludeClass(rawType, false);
        if (excludeClass || excludeClass2) {
            return new com.google.gson.TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                private volatile com.google.gson.TypeAdapter<T> delegate;

                @Override // com.google.gson.TypeAdapter
                /* renamed from: read */
                public T read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                    if (excludeClass2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return delegate().read2(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
                    if (excludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, t);
                    }
                }

                private com.google.gson.TypeAdapter<T> delegate() {
                    com.google.gson.TypeAdapter<T> typeAdapter = this.delegate;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    com.google.gson.TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(com.google.gson.internal.Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
            };
        }
        return null;
    }

    public final boolean excludeField(java.lang.reflect.Field field, boolean z) {
        com.google.gson.annotations.Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != -1.0d && !isValidVersion((com.google.gson.annotations.Since) field.getAnnotation(com.google.gson.annotations.Since.class), (com.google.gson.annotations.Until) field.getAnnotation(com.google.gson.annotations.Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.requireExpose && ((expose = (com.google.gson.annotations.Expose) field.getAnnotation(com.google.gson.annotations.Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) || excludeClass(field.getType(), z)) {
            return true;
        }
        java.util.List<com.google.gson.ExclusionStrategy> list = z ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.FieldAttributes fieldAttributes = new com.google.gson.FieldAttributes(field);
        java.util.Iterator<com.google.gson.ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public final boolean excludeClass(java.lang.Class<?> cls, boolean z) {
        if (this.version != -1.0d && !isValidVersion((com.google.gson.annotations.Since) cls.getAnnotation(com.google.gson.annotations.Since.class), (com.google.gson.annotations.Until) cls.getAnnotation(com.google.gson.annotations.Until.class))) {
            return true;
        }
        if (!this.serializeInnerClasses && isInnerClass(cls)) {
            return true;
        }
        if (!z && !java.lang.Enum.class.isAssignableFrom(cls) && com.google.gson.internal.reflect.ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        java.util.Iterator<com.google.gson.ExclusionStrategy> it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInnerClass(java.lang.Class<?> cls) {
        return cls.isMemberClass() && !com.google.gson.internal.reflect.ReflectionHelper.isStatic(cls);
    }

    private boolean isValidVersion(com.google.gson.annotations.Since since, com.google.gson.annotations.Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    private boolean isValidSince(com.google.gson.annotations.Since since) {
        if (since != null) {
            return this.version >= since.value();
        }
        return true;
    }

    private boolean isValidUntil(com.google.gson.annotations.Until until) {
        if (until != null) {
            return this.version < until.value();
        }
        return true;
    }
}
