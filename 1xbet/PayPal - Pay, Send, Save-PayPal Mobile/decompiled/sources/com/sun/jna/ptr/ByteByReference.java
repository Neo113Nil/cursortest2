package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class ByteByReference extends com.sun.jna.ptr.ByReference {
    public ByteByReference() {
        this((byte) 0);
    }

    public ByteByReference(byte b) {
        super(1);
        setValue(b);
    }

    public void setValue(byte b) {
        getPointer().setByte(0L, b);
    }

    public byte getValue() {
        return getPointer().getByte(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("byte@0x%1$x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Byte.valueOf(getValue()));
    }
}
