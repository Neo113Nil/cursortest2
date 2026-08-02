package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class LongByReference extends com.sun.jna.ptr.ByReference {
    public LongByReference() {
        this(0L);
    }

    public LongByReference(long j) {
        super(8);
        setValue(j);
    }

    public void setValue(long j) {
        getPointer().setLong(0L, j);
    }

    public long getValue() {
        return getPointer().getLong(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        return java.lang.String.format("long@0x%1$x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Long.valueOf(getValue()));
    }
}
