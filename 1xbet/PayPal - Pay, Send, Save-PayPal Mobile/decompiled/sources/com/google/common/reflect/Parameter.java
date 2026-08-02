package com.google.common.reflect;

/* loaded from: classes9.dex */
public final class Parameter implements java.lang.reflect.AnnotatedElement {
    private final java.lang.Object annotatedType;
    private final com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> annotations;
    private final com.google.common.reflect.Invokable<?, ?> declaration;
    private final int position;
    private final com.google.common.reflect.TypeToken<?> type;

    Parameter(com.google.common.reflect.Invokable<?, ?> invokable, int i, com.google.common.reflect.TypeToken<?> typeToken, java.lang.annotation.Annotation[] annotationArr, java.lang.Object obj) {
        this.declaration = invokable;
        this.position = i;
        this.type = typeToken;
        this.annotations = com.google.common.collect.ImmutableList.copyOf(annotationArr);
        this.annotatedType = obj;
    }

    public final com.google.common.reflect.TypeToken<?> getType() {
        return this.type;
    }

    public final com.google.common.reflect.Invokable<?, ?> getDeclaringInvokable() {
        return this.declaration;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> cls) {
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.collect.UnmodifiableIterator<java.lang.annotation.Annotation> it = this.annotations.iterator();
        while (it.hasNext()) {
            java.lang.annotation.Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(java.lang.Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
        return (java.lang.annotation.Annotation[]) this.annotations.toArray(new java.lang.annotation.Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(java.lang.Class<A> cls) {
        com.google.common.base.Preconditions.checkNotNull(cls);
        return (A) com.google.common.collect.FluentIterable.from(this.annotations).filter(cls).first().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends java.lang.annotation.Annotation> A[] getDeclaredAnnotationsByType(java.lang.Class<A> cls) {
        return (A[]) ((java.lang.annotation.Annotation[]) com.google.common.collect.FluentIterable.from(this.annotations).filter(cls).toArray(cls));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.reflect.Parameter)) {
            return false;
        }
        com.google.common.reflect.Parameter parameter = (com.google.common.reflect.Parameter) obj;
        return this.position == parameter.position && this.declaration.equals(parameter.declaration);
    }

    public final int hashCode() {
        return this.position;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.type);
        sb.append(" arg");
        sb.append(this.position);
        return sb.toString();
    }
}
