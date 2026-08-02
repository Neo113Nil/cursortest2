package com.nimbusds.jose;

/* loaded from: classes4.dex */
public class KeyLengthException extends com.nimbusds.jose.KeyException {
    private final com.nimbusds.jose.Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(java.lang.String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    public KeyLengthException(com.nimbusds.jose.Algorithm algorithm) {
        this(0, algorithm);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyLengthException(int i, com.nimbusds.jose.Algorithm algorithm) {
        super(r0.toString());
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i > 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The expected key length is ");
            sb2.append(i);
            sb2.append(" bits");
            str = sb2.toString();
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (algorithm != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" (for ");
            sb3.append(algorithm);
            sb3.append(" algorithm)");
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        this.expectedLength = i;
        this.alg = algorithm;
    }

    public int getExpectedKeyLength() {
        return this.expectedLength;
    }

    public com.nimbusds.jose.Algorithm getAlgorithm() {
        return this.alg;
    }
}
