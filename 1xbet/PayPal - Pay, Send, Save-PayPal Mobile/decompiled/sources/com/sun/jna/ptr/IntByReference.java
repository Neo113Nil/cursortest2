package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class IntByReference extends com.sun.jna.ptr.ByReference {
    public IntByReference() {
        this(0);
    }

    public IntByReference(int i) {
        super(4);
        setValue(i);
    }

    public void setValue(int i) {
        getPointer().setInt(0L, i);
    }

    public int getValue() {
        return getPointer().getInt(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("int@0x%1$x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Integer.valueOf(getValue()));
    }
}
