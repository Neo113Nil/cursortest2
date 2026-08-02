package com.google.common.reflect;

/* loaded from: classes9.dex */
public abstract class TypeParameter<T> extends com.google.common.reflect.TypeCapture<T> {
    final java.lang.reflect.TypeVariable<?> typeVariable;

    protected TypeParameter() {
        java.lang.reflect.Type capture = capture();
        com.google.common.base.Preconditions.checkArgument(capture instanceof java.lang.reflect.TypeVariable, "%s should be a type variable.", capture);
        this.typeVariable = (java.lang.reflect.TypeVariable) capture;
    }

    public final int hashCode() {
        return this.typeVariable.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.common.reflect.TypeParameter) {
            return this.typeVariable.equals(((com.google.common.reflect.TypeParameter) obj).typeVariable);
        }
        return false;
    }

    public java.lang.String toString() {
        return this.typeVariable.toString();
    }
}
