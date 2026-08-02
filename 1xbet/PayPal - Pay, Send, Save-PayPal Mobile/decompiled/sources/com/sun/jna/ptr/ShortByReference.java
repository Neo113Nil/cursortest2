package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class ShortByReference extends com.sun.jna.ptr.ByReference {
    public ShortByReference() {
        this((short) 0);
    }

    public ShortByReference(short s) {
        super(2);
        setValue(s);
    }

    public void setValue(short s) {
        getPointer().setShort(0L, s);
    }

    public short getValue() {
        return getPointer().getShort(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("short@0x%1$x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Short.valueOf(getValue()));
    }
}
