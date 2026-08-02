package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class QTESLAParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String PROVABLY_SECURE_I = org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(5);
    public static final java.lang.String PROVABLY_SECURE_III = org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getName(6);
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public java.lang.String getSecurityCategory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public QTESLAParameterSpec(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
