package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class DoubleByReference extends com.sun.jna.ptr.ByReference {
    public DoubleByReference() {
        this(0.0d);
    }

    public DoubleByReference(double d) {
        super(8);
        setValue(d);
    }

    public void setValue(double d) {
        getPointer().setDouble(0L, d);
    }

    public double getValue() {
        return getPointer().getDouble(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("double@0x%x=%s", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Double.valueOf(getValue()));
    }
}
