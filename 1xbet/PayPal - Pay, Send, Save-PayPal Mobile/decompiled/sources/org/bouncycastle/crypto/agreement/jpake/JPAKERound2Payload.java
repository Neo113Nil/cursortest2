package org.bouncycastle.crypto.agreement.jpake;

/* loaded from: classes17.dex */
public class JPAKERound2Payload {
    private final java.math.BigInteger[] Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.math.BigInteger getHighSpeedVideoFpsRanges;

    public java.lang.String getParticipantId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger[] getKnowledgeProofForX2s() {
        java.math.BigInteger[] bigIntegerArr = this.Camera2StreamConfigurationMap;
        return org.bouncycastle.util.Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public java.math.BigInteger getA() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public JPAKERound2Payload(java.lang.String str, java.math.BigInteger bigInteger, java.math.BigInteger[] bigIntegerArr) {
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(str, "participantId");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger, "a");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX2s");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }
}
