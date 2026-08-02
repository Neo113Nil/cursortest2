package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class PointerByReference extends com.sun.jna.ptr.ByReference {
    public PointerByReference() {
        this(null);
    }

    public PointerByReference(com.sun.jna.Pointer pointer) {
        super(com.sun.jna.Native.POINTER_SIZE);
        setValue(pointer);
    }

    public void setValue(com.sun.jna.Pointer pointer) {
        getPointer().setPointer(0L, pointer);
    }

    public com.sun.jna.Pointer getValue() {
        return getPointer().getPointer(0L);
    }
}
