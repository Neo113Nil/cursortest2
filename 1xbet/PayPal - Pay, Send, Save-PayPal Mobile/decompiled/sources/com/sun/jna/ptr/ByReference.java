package com.sun.jna.ptr;

/* loaded from: classes16.dex */
public abstract class ByReference extends com.sun.jna.PointerType {
    protected ByReference(int i) {
        setPointer(new com.sun.jna.Memory(i));
    }

    @Override // com.sun.jna.PointerType
    public java.lang.String toString() {
        try {
            java.lang.Object invoke = getClass().getMethod("getValue", new java.lang.Class[0]).invoke(this, new java.lang.Object[0]);
            return invoke == null ? java.lang.String.format("null@0x%x", java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer()))) : java.lang.String.format("%s@0x%x=%s", invoke.getClass().getSimpleName(), java.lang.Long.valueOf(com.sun.jna.Pointer.nativeValue(getPointer())), invoke);
        } catch (java.lang.Exception e) {
            return java.lang.String.format("ByReference Contract violated - %s#getValue raised exception: %s", getClass().getName(), e.getMessage());
        }
    }
}
