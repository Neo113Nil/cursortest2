package org.bouncycastle.crypto.agreement.jpake;

/* loaded from: classes17.dex */
public class JPAKERound1Payload {
    private final java.math.BigInteger[] Camera2StreamConfigurationMap;
    private final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private final java.math.BigInteger[] getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.math.BigInteger getHighSpeedVideoSizes;

    public java.lang.String getParticipantId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger[] getKnowledgeProofForX2() {
        java.math.BigInteger[] bigIntegerArr = this.getHighSpeedVideoFpsRanges;
        return org.bouncycastle.util.Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public java.math.BigInteger[] getKnowledgeProofForX1() {
        java.math.BigInteger[] bigIntegerArr = this.Camera2StreamConfigurationMap;
        return org.bouncycastle.util.Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public java.math.BigInteger getGx2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getGx1() {
        return this.getHighSpeedVideoSizes;
    }

    public JPAKERound1Payload(java.lang.String str, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger[] bigIntegerArr, java.math.BigInteger[] bigIntegerArr2) {
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(str, "participantId");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger, "gx1");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger2, "gx2");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX1");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigIntegerArr2, "knowledgeProofForX2");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger2;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.copyOf(bigIntegerArr2, bigIntegerArr2.length);
    }
}
