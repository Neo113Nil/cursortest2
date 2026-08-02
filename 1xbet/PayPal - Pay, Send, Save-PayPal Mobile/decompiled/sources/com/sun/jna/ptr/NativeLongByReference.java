package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public class NativeLongByReference extends com.sun.jna.ptr.ByReference {
    public NativeLongByReference() {
        this(new com.sun.jna.NativeLong(0L));
    }

    public NativeLongByReference(com.sun.jna.NativeLong nativeLong) {
        super(com.sun.jna.NativeLong.SIZE);
        setValue(nativeLong);
    }

    public void setValue(com.sun.jna.NativeLong nativeLong) {
        getPointer().setNativeLong(0L, nativeLong);
    }

    public com.sun.jna.NativeLong getValue() {
        return getPointer().getNativeLong(0L);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public java.lang.String toString() {
        if (com.sun.jna.NativeLong.SIZE > 4) {
            return java.lang.String.format("NativeLong@0x1$%x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Long.valueOf(getValue().longValue()));
        }
        return java.lang.String.format("NativeLong@0x1$%x=0x%2$x (%2$d)", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), java.lang.Integer.valueOf(getValue().intValue()));
    }
}
