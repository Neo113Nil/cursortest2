package com.google.common.reflect;

/* loaded from: classes9.dex */
abstract class TypeVisitor {
    private final java.util.Set<java.lang.reflect.Type> visited = new java.util.HashSet();

    void visitClass(java.lang.Class<?> cls) {
    }

    void visitGenericArrayType(java.lang.reflect.GenericArrayType genericArrayType) {
    }

    void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
    }

    void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
    }

    void visitWildcardType(java.lang.reflect.WildcardType wildcardType) {
    }

    TypeVisitor() {
    }

    public final void visit(java.lang.reflect.Type... typeArr) {
        for (java.lang.reflect.Type type : typeArr) {
            if (type != null && this.visited.add(type)) {
                if (type instanceof java.lang.reflect.TypeVariable) {
                    try {
                        visitTypeVariable((java.lang.reflect.TypeVariable) type);
                    } catch (java.lang.Throwable th) {
                        this.visited.remove(type);
                        throw th;
                    }
                } else if (type instanceof java.lang.reflect.WildcardType) {
                    visitWildcardType((java.lang.reflect.WildcardType) type);
                } else if (type instanceof java.lang.reflect.ParameterizedType) {
                    visitParameterizedType((java.lang.reflect.ParameterizedType) type);
                } else if (type instanceof java.lang.Class) {
                    visitClass((java.lang.Class) type);
                } else if (type instanceof java.lang.reflect.GenericArrayType) {
                    visitGenericArrayType((java.lang.reflect.GenericArrayType) type);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Unknown type: ");
                    sb.append(type);
                    throw new java.lang.AssertionError(sb.toString());
                }
            }
        }
    }
}
