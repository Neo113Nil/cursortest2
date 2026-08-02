package com.google.gson;

/* loaded from: classes4.dex */
public final class FieldAttributes {
    private final java.lang.reflect.Field field;

    public FieldAttributes(java.lang.reflect.Field field) {
        this.field = (java.lang.reflect.Field) java.util.Objects.requireNonNull(field);
    }

    public final java.lang.Class<?> getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public final java.lang.String getName() {
        return this.field.getName();
    }

    public final java.lang.reflect.Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public final java.lang.Class<?> getDeclaredClass() {
        return this.field.getType();
    }

    public final <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> cls) {
        return (T) this.field.getAnnotation(cls);
    }

    public final java.util.Collection<java.lang.annotation.Annotation> getAnnotations() {
        return java.util.Arrays.asList(this.field.getAnnotations());
    }

    public final boolean hasModifier(int i) {
        return (i & this.field.getModifiers()) != 0;
    }

    public final java.lang.String toString() {
        return this.field.toString();
    }
}
