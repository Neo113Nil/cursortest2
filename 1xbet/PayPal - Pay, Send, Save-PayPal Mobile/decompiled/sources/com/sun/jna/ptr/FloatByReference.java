package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class FloatByReference extends com.sun.jna.ptr.ByReference {
    public FloatByReference() {
        this(0.0f);
    }

    public FloatByReference(float f) {
        super(4);
        setValue(f);
    }

    public void setValue(float f) {
        getPointer().setFloat(0L, f);
    }

    public float getValue() {
        return getPointer().getFloat(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("float@0x%x=%s", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Float.valueOf(getValue()));
    }
}
