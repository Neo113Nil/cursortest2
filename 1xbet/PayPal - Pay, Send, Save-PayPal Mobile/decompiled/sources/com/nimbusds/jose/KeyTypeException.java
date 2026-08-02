package com.nimbusds.jose;

/* loaded from: classes10.dex */
public class KeyTypeException extends com.nimbusds.jose.KeyException {
    public KeyTypeException(java.lang.Class<? extends java.security.Key> cls) {
        super("Invalid key: Must be an instance of ".concat(java.lang.String.valueOf(cls)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyTypeException(java.lang.Class<? extends java.security.Key> cls, java.lang.Class<?>... clsArr) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key: Must be an instance of ");
        sb.append(cls);
        sb.append(" and implement all of the following interfaces ");
        sb.append(java.util.Arrays.toString(clsArr));
    }
}
