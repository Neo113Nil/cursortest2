package com.google.crypto.tink.hybrid;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class HpkePublicKey extends com.google.crypto.tink.hybrid.HybridPublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.hybrid.HpkeParameters parameters;
    private final com.google.crypto.tink.util.Bytes publicKeyBytes;

    private HpkePublicKey(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters, com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.util.Bytes bytes2, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = hpkeParameters;
        this.publicKeyBytes = bytes;
        this.outputPrefix = bytes2;
        this.idRequirement = num;
    }

    private static void validateIdRequirement(com.google.crypto.tink.hybrid.HpkeParameters.Variant variant, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (!variant.equals(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX) && num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'idRequirement' must be non-null for ");
            sb.append(variant);
            sb.append(" variant.");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (variant.equals(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX) && num != null) {
            throw new java.security.GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    private static void validatePublicKeyByteLength(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        int size = bytes.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encoded public key byte length for ");
        sb.append(kemId);
        sb.append(" must be %d, not ");
        sb.append(size);
        java.lang.String obj = sb.toString();
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            if (size != 65) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 65));
            }
            return;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            if (size != 97) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 97));
            }
        } else if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            if (size != 133) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE)));
            }
        } else {
            if (kemId != com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
                throw new java.security.GeneralSecurityException("Unable to validate public key length for ".concat(java.lang.String.valueOf(kemId)));
            }
            if (size != 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format(obj, 32));
            }
        }
    }

    private static boolean isNistKem(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
        return kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512;
    }

    private static java.security.spec.EllipticCurve getNistCurve(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP256Params().getCurve();
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP384Params().getCurve();
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.google.crypto.tink.subtle.EllipticCurves.getNistP521Params().getCurve();
        }
        throw new java.lang.IllegalArgumentException("Unable to determine NIST curve type for ".concat(java.lang.String.valueOf(kemId)));
    }

    private static void validatePublicKeyOnCurve(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        if (isNistKem(kemId)) {
            java.security.spec.EllipticCurve nistCurve = getNistCurve(kemId);
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(com.google.crypto.tink.subtle.EllipticCurves.pointDecode(nistCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bytes.toByteArray()), nistCurve);
        }
    }

    private static void validatePublicKey(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        validatePublicKeyByteLength(kemId, bytes);
        validatePublicKeyOnCurve(kemId, bytes);
    }

    private static com.google.crypto.tink.util.Bytes createOutputPrefix(com.google.crypto.tink.hybrid.HpkeParameters.Variant variant, @javax.annotation.Nullable java.lang.Integer num) {
        if (variant == com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (num == null) {
            throw new java.lang.IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(java.lang.String.valueOf(variant)));
        }
        if (variant == com.google.crypto.tink.hybrid.HpkeParameters.Variant.CRUNCHY) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        if (variant == com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        throw new java.lang.IllegalStateException("Unknown HpkeParameters.Variant: ".concat(java.lang.String.valueOf(variant)));
    }

    public static com.google.crypto.tink.hybrid.HpkePublicKey create(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        validateIdRequirement(hpkeParameters.getVariant(), num);
        validatePublicKey(hpkeParameters.getKemId(), bytes);
        return new com.google.crypto.tink.hybrid.HpkePublicKey(hpkeParameters, bytes, createOutputPrefix(hpkeParameters.getVariant(), num), num);
    }

    public final com.google.crypto.tink.util.Bytes getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.hybrid.HybridPublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.hybrid.HpkeParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.hybrid.HpkePublicKey)) {
            return false;
        }
        com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey = (com.google.crypto.tink.hybrid.HpkePublicKey) key;
        return this.parameters.equals(hpkePublicKey.parameters) && this.publicKeyBytes.equals(hpkePublicKey.publicKeyBytes) && java.util.Objects.equals(this.idRequirement, hpkePublicKey.idRequirement);
    }
}
