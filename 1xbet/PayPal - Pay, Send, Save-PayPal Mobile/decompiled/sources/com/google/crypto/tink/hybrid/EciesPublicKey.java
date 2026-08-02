package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EciesPublicKey extends com.google.crypto.tink.hybrid.HybridPublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;

    @javax.annotation.Nullable
    private final java.security.spec.ECPoint nistPublicPoint;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.hybrid.EciesParameters parameters;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.Bytes x25519PublicPointBytes;

    private EciesPublicKey(com.google.crypto.tink.hybrid.EciesParameters eciesParameters, @javax.annotation.Nullable java.security.spec.ECPoint eCPoint, @javax.annotation.Nullable com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.util.Bytes bytes2, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = eciesParameters;
        this.nistPublicPoint = eCPoint;
        this.x25519PublicPointBytes = bytes;
        this.outputPrefix = bytes2;
        this.idRequirement = num;
    }

    private static void validateIdRequirement(com.google.crypto.tink.hybrid.EciesParameters.Variant variant, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (!variant.equals(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX) && num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'idRequirement' must be non-null for ");
            sb.append(variant);
            sb.append(" variant.");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (variant.equals(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX) && num != null) {
            throw new java.security.GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    private static java.security.spec.EllipticCurve getParameterSpecNistCurve(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) {
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP256Params().getCurve();
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP384Params().getCurve();
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP521Params().getCurve();
        }
        throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(java.lang.String.valueOf(curveType)));
    }

    private static com.google.crypto.tink.util.Bytes createOutputPrefix(com.google.crypto.tink.hybrid.EciesParameters.Variant variant, @javax.annotation.Nullable java.lang.Integer num) {
        if (variant == com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (num == null) {
            throw new java.lang.IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(java.lang.String.valueOf(variant)));
        }
        if (variant == com.google.crypto.tink.hybrid.EciesParameters.Variant.CRUNCHY) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        if (variant == com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        throw new java.lang.IllegalStateException("Unknown EciesParameters.Variant: ".concat(java.lang.String.valueOf(variant)));
    }

    public static com.google.crypto.tink.hybrid.EciesPublicKey createForCurveX25519(com.google.crypto.tink.hybrid.EciesParameters eciesParameters, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (!eciesParameters.getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
            throw new java.security.GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        validateIdRequirement(eciesParameters.getVariant(), num);
        if (bytes.size() != 32) {
            throw new java.security.GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        return new com.google.crypto.tink.hybrid.EciesPublicKey(eciesParameters, null, bytes, createOutputPrefix(eciesParameters.getVariant(), num), num);
    }

    public static com.google.crypto.tink.hybrid.EciesPublicKey createForNistCurve(com.google.crypto.tink.hybrid.EciesParameters eciesParameters, java.security.spec.ECPoint eCPoint, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (eciesParameters.getCurveType().equals(com.google.crypto.tink.hybrid.EciesParameters.CurveType.X25519)) {
            throw new java.security.GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        validateIdRequirement(eciesParameters.getVariant(), num);
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPoint, getParameterSpecNistCurve(eciesParameters.getCurveType()));
        return new com.google.crypto.tink.hybrid.EciesPublicKey(eciesParameters, eCPoint, null, createOutputPrefix(eciesParameters.getVariant(), num), num);
    }

    @javax.annotation.Nullable
    public final java.security.spec.ECPoint getNistCurvePoint() {
        return this.nistPublicPoint;
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.util.Bytes getX25519CurvePointBytes() {
        return this.x25519PublicPointBytes;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.hybrid.EciesParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.hybrid.EciesPublicKey)) {
            return false;
        }
        com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey = (com.google.crypto.tink.hybrid.EciesPublicKey) key;
        return this.parameters.equals(eciesPublicKey.parameters) && java.util.Objects.equals(this.x25519PublicPointBytes, eciesPublicKey.x25519PublicPointBytes) && java.util.Objects.equals(this.nistPublicPoint, eciesPublicKey.nistPublicPoint) && java.util.Objects.equals(this.idRequirement, eciesPublicKey.idRequirement);
    }
}
