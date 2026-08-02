package org.bouncycastle.crypto.agreement.jpake;

/* loaded from: classes17.dex */
public class JPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private final java.math.BigInteger getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputFormats;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private final java.math.BigInteger getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;
    private final java.math.BigInteger getOutputMinFrameDurationlomOqCM;
    private java.math.BigInteger getOutputSizes;
    private char[] getOutputSizeshNQ4ISI;
    private final java.security.SecureRandom getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private java.math.BigInteger isOutputSupportedForhNQ4ISI;

    public void validateRound3PayloadReceived(org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload jPAKERound3Payload, java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        int i = this.getOutputStallDurationlomOqCM;
        if (i >= 70) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Validation already attempted for round3 payload for");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i < 50) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Keying material must be calculated validated prior to validating Round3 payload for ");
            sb2.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateParticipantIdsDiffer(this.getHighSpeedVideoSizesFor, jPAKERound3Payload.getParticipantId());
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateParticipantIdsEqual(this.getOutputMinFrameDuration, jPAKERound3Payload.getParticipantId());
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateMacTag(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, bigInteger, this.getHighSpeedVideoFpsRangesFor, jPAKERound3Payload.getMacTag());
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = null;
        this.getInputFormats = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputStallDurationlomOqCM = 70;
    }

    public void validateRound2PayloadReceived(org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload jPAKERound2Payload) throws org.bouncycastle.crypto.CryptoException {
        int i = this.getOutputStallDurationlomOqCM;
        if (i >= 40) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Validation already attempted for round2 payload for");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i < 20) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Round1 payload must be validated prior to validating Round2 payload for ");
            sb2.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        java.math.BigInteger calculateGA = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateGA(this.getOutputFormats, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes = jPAKERound2Payload.getA();
        java.math.BigInteger[] knowledgeProofForX2s = jPAKERound2Payload.getKnowledgeProofForX2s();
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateParticipantIdsDiffer(this.getHighSpeedVideoSizesFor, jPAKERound2Payload.getParticipantId());
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateParticipantIdsEqual(this.getOutputMinFrameDuration, jPAKERound2Payload.getParticipantId());
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateGa(calculateGA);
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, calculateGA, this.getHighSpeedVideoSizes, knowledgeProofForX2s, jPAKERound2Payload.getParticipantId(), this.getHighSpeedVideoFpsRangesFor);
        this.getOutputStallDurationlomOqCM = 40;
    }

    public void validateRound1PayloadReceived(org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload jPAKERound1Payload) throws org.bouncycastle.crypto.CryptoException {
        if (this.getOutputStallDurationlomOqCM >= 20) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Validation already attempted for round1 payload for");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getOutputMinFrameDuration = jPAKERound1Payload.getParticipantId();
        this.getInputFormats = jPAKERound1Payload.getGx1();
        this.getInputSizeshNQ4ISI = jPAKERound1Payload.getGx2();
        java.math.BigInteger[] knowledgeProofForX1 = jPAKERound1Payload.getKnowledgeProofForX1();
        java.math.BigInteger[] knowledgeProofForX2 = jPAKERound1Payload.getKnowledgeProofForX2();
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateParticipantIdsDiffer(this.getHighSpeedVideoSizesFor, jPAKERound1Payload.getParticipantId());
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateGx4(this.getInputSizeshNQ4ISI);
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getInputFormats, knowledgeProofForX1, jPAKERound1Payload.getParticipantId(), this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, knowledgeProofForX2, jPAKERound1Payload.getParticipantId(), this.getHighSpeedVideoFpsRangesFor);
        this.getOutputStallDurationlomOqCM = 20;
    }

    public int getState() {
        return this.getOutputStallDurationlomOqCM;
    }

    public org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload createRound3PayloadToSend(java.math.BigInteger bigInteger) {
        int i = this.getOutputStallDurationlomOqCM;
        if (i >= 60) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Round3 payload already created for ");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i >= 50) {
            java.math.BigInteger calculateMacTag = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateMacTag(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, bigInteger, this.getHighSpeedVideoFpsRangesFor);
            this.getOutputStallDurationlomOqCM = 60;
            return new org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload(this.getHighSpeedVideoSizesFor, calculateMacTag);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Keying material must be calculated prior to creating Round3 payload for ");
        sb2.append(this.getHighSpeedVideoSizesFor);
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    public org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload createRound2PayloadToSend() {
        int i = this.getOutputStallDurationlomOqCM;
        if (i >= 30) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Round2 payload already created for ");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i < 20) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Round1 payload must be validated prior to creating Round2 payload for ");
            sb2.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        java.math.BigInteger calculateGA = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateGA(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getInputSizeshNQ4ISI);
        java.math.BigInteger calculateX2s = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateX2s(this.getOutputMinFrameDurationlomOqCM, this.isOutputSupportedForhNQ4ISI, org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateS(this.getOutputSizeshNQ4ISI));
        java.math.BigInteger calculateA = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateA(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, calculateGA, calculateX2s);
        java.math.BigInteger[] calculateZeroKnowledgeProof = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, calculateGA, calculateA, calculateX2s, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getOutputStallDuration);
        this.getOutputStallDurationlomOqCM = 30;
        return new org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload(this.getHighSpeedVideoSizesFor, calculateA, calculateZeroKnowledgeProof);
    }

    public org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload createRound1PayloadToSend() {
        if (this.getOutputStallDurationlomOqCM >= 10) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Round1 payload already created for ");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getOutputSizes = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.generateX1(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration);
        this.isOutputSupportedForhNQ4ISI = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.generateX2(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateGx(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputSizes);
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateGx(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.isOutputSupportedForhNQ4ISI);
        java.math.BigInteger[] calculateZeroKnowledgeProof = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizes, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getOutputStallDuration);
        java.math.BigInteger[] calculateZeroKnowledgeProof2 = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateZeroKnowledgeProof(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.isOutputSupportedForhNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getOutputStallDuration);
        this.getOutputStallDurationlomOqCM = 10;
        return new org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, calculateZeroKnowledgeProof, calculateZeroKnowledgeProof2);
    }

    public java.math.BigInteger calculateKeyingMaterial() {
        int i = this.getOutputStallDurationlomOqCM;
        if (i >= 50) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key already calculated for ");
            sb.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i < 40) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Round2 payload must be validated prior to creating key for ");
            sb2.append(this.getHighSpeedVideoSizesFor);
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        java.math.BigInteger calculateS = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateS(this.getOutputSizeshNQ4ISI);
        org.bouncycastle.util.Arrays.fill(this.getOutputSizeshNQ4ISI, (char) 0);
        this.getOutputSizeshNQ4ISI = null;
        java.math.BigInteger calculateKeyingMaterial = org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.calculateKeyingMaterial(this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, this.getInputSizeshNQ4ISI, this.isOutputSupportedForhNQ4ISI, calculateS, this.getHighSpeedVideoSizes);
        this.getOutputSizes = null;
        this.isOutputSupportedForhNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDurationlomOqCM = 50;
        return calculateKeyingMaterial;
    }

    public JPAKEParticipant(java.lang.String str, char[] cArr, org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(str, "participantId");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(cArr, "password");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(jPAKEPrimeOrderGroup, "p");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(digest, org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST);
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Password must not be empty.");
        }
        this.getHighSpeedVideoSizesFor = str;
        this.getOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.copyOf(cArr, cArr.length);
        this.getOutputFormats = jPAKEPrimeOrderGroup.getP();
        this.getOutputMinFrameDurationlomOqCM = jPAKEPrimeOrderGroup.getQ();
        this.getHighSpeedVideoFpsRanges = jPAKEPrimeOrderGroup.getG();
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getOutputStallDuration = secureRandom;
        this.getOutputStallDurationlomOqCM = 0;
    }

    public JPAKEParticipant(java.lang.String str, char[] cArr, org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup) {
        this(str, cArr, jPAKEPrimeOrderGroup, new org.bouncycastle.crypto.digests.SHA256Digest(), org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }

    public JPAKEParticipant(java.lang.String str, char[] cArr) {
        this(str, cArr, org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroups.NIST_3072);
    }
}
