package com.sun.jna;

/* loaded from: classes16.dex */
public abstract class PointerType implements com.sun.jna.NativeMapped {
    private com.sun.jna.Pointer pointer;

    public PointerType() {
        this.pointer = com.sun.jna.Pointer.NULL;
    }

    protected PointerType(com.sun.jna.Pointer pointer) {
        this.pointer = pointer;
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Class<?> nativeType() {
        return com.sun.jna.Pointer.class;
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Object toNative() {
        return getPointer();
    }

    public com.sun.jna.Pointer getPointer() {
        return this.pointer;
    }

    public void setPointer(com.sun.jna.Pointer pointer) {
        this.pointer = pointer;
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext) {
        if (obj == null) {
            return null;
        }
        com.sun.jna.PointerType pointerType = (com.sun.jna.PointerType) com.sun.jna.Klass.getHighSpeedVideoFpsRangesFor(getClass());
        pointerType.pointer = (com.sun.jna.Pointer) obj;
        return pointerType;
    }

    public int hashCode() {
        com.sun.jna.Pointer pointer = this.pointer;
        if (pointer != null) {
            return pointer.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.sun.jna.PointerType)) {
            return false;
        }
        com.sun.jna.Pointer pointer = ((com.sun.jna.PointerType) obj).getPointer();
        com.sun.jna.Pointer pointer2 = this.pointer;
        if (pointer2 == null) {
            return pointer == null;
        }
        return pointer2.equals(pointer);
    }

    public java.lang.String toString() {
        if (this.pointer == null) {
            return "NULL";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.pointer.toString());
        sb.append(" (");
        sb.append(super.toString());
        sb.append(")");
        return sb.toString();
    }
}
