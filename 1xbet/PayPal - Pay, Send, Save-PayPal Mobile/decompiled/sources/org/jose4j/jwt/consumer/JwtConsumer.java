package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class JwtConsumer {
    org.jose4j.jwt.consumer.JweCustomizer Camera2StreamConfigurationMap;
    org.jose4j.jwa.AlgorithmConstraints getHighResolutionOutputSizeshNQ4ISI;
    org.jose4j.jwa.AlgorithmConstraints getHighSpeedVideoFpsRanges;
    org.jose4j.jca.ProviderContext getHighSpeedVideoFpsRangesFor;
    org.jose4j.keys.resolvers.DecryptionKeyResolver getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    org.jose4j.jwt.consumer.JwsCustomizer getInputFormats;
    org.jose4j.jca.ProviderContext getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    org.jose4j.jwa.AlgorithmConstraints getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    boolean getOutputSizeshNQ4ISI = true;
    boolean getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    java.util.List<org.jose4j.jwt.consumer.ErrorCodeValidator> getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    org.jose4j.keys.resolvers.VerificationKeyResolver unwrapAs;

    JwtConsumer() {
    }

    public void setSkipVerificationKeyResolutionOnNone(boolean z) {
        this.isOutputSupportedFor = z;
    }

    public org.jose4j.jwt.JwtClaims processToClaims(java.lang.String str) throws org.jose4j.jwt.consumer.InvalidJwtException {
        return process(str).getJwtClaims();
    }

    public void processContext(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.consumer.InvalidJwtException {
        org.jose4j.jwt.consumer.ErrorCodeValidator.Error error;
        java.util.ArrayList arrayList = new java.util.ArrayList(jwtContext.getJoseObjects());
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            java.util.List subList = arrayList.subList(size + 1, arrayList.size());
            java.util.List<org.jose4j.jwx.JsonWebStructure> unmodifiableList = java.util.Collections.unmodifiableList(subList);
            org.jose4j.jwx.JsonWebStructure jsonWebStructure = (org.jose4j.jwx.JsonWebStructure) arrayList.get(size);
            if (jsonWebStructure instanceof org.jose4j.jws.JsonWebSignature) {
                try {
                    org.jose4j.jws.JsonWebSignature jsonWebSignature = (org.jose4j.jws.JsonWebSignature) jsonWebStructure;
                    boolean equals = "none".equals(jsonWebSignature.getAlgorithmHeaderValue());
                    if (!this.getOutputSizes) {
                        org.jose4j.jca.ProviderContext providerContext = this.getInputSizeshNQ4ISI;
                        if (providerContext != null) {
                            jsonWebSignature.setProviderContext(providerContext);
                        }
                        if (this.getOutputStallDuration) {
                            jsonWebSignature.setDoKeyValidation(false);
                        }
                        org.jose4j.jwa.AlgorithmConstraints algorithmConstraints = this.getOutputMinFrameDuration;
                        if (algorithmConstraints != null) {
                            jsonWebSignature.setAlgorithmConstraints(algorithmConstraints);
                        }
                        if (!equals || !this.isOutputSupportedFor) {
                            jsonWebSignature.setKey(this.unwrapAs.resolveKey(jsonWebSignature, unmodifiableList));
                        }
                        org.jose4j.jwt.consumer.JwsCustomizer jwsCustomizer = this.getInputFormats;
                        if (jwsCustomizer != null) {
                            jwsCustomizer.customize(jsonWebSignature, unmodifiableList);
                        }
                        if (!jsonWebSignature.verifySignature()) {
                            throw new org.jose4j.jwt.consumer.InvalidJwtSignatureException(jsonWebSignature, jwtContext);
                        }
                    }
                    if (!equals) {
                        z = true;
                    }
                } catch (org.jose4j.jwt.consumer.InvalidJwtException e) {
                    throw e;
                } catch (org.jose4j.lang.JoseException e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to process");
                    if (!subList.isEmpty()) {
                        sb.append(" nested");
                    }
                    sb.append(" JOSE object (cause: ");
                    sb.append(e2);
                    sb.append("): ");
                    sb.append(jsonWebStructure);
                    throw new org.jose4j.jwt.consumer.InvalidJwtException("JWT processing failed.", new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb.toString()), e2, jwtContext);
                } catch (java.lang.Exception e3) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected exception encountered while processing");
                    if (!subList.isEmpty()) {
                        sb2.append(" nested");
                    }
                    sb2.append(" JOSE object (");
                    sb2.append(e3);
                    sb2.append("): ");
                    sb2.append(jsonWebStructure);
                    throw new org.jose4j.jwt.consumer.InvalidJwtException("JWT processing failed.", new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb2.toString()), e3, jwtContext);
                }
            } else {
                org.jose4j.jwe.JsonWebEncryption jsonWebEncryption = (org.jose4j.jwe.JsonWebEncryption) jsonWebStructure;
                org.jose4j.jwa.AlgorithmConstraints algorithmConstraints2 = this.getHighSpeedVideoFpsRanges;
                if (algorithmConstraints2 != null) {
                    algorithmConstraints2.checkConstraint(jsonWebEncryption.getAlgorithmHeaderValue());
                }
                org.jose4j.jwa.AlgorithmConstraints algorithmConstraints3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (algorithmConstraints3 != null) {
                    algorithmConstraints3.checkConstraint(jsonWebEncryption.getEncryptionMethodHeaderParameter());
                }
                z3 = jsonWebEncryption.getKeyManagementModeAlgorithm().getKeyPersuasion() == org.jose4j.keys.KeyPersuasion.SYMMETRIC;
                z2 = true;
            }
        }
        if (this.getOutputSizeshNQ4ISI && !z) {
            java.util.List singletonList = java.util.Collections.singletonList(new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(10, "Missing signature."));
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The JWT has no signature but the JWT Consumer is configured to require one: ");
            sb3.append(jwtContext.getJwt());
            throw new org.jose4j.jwt.consumer.InvalidJwtException(sb3.toString(), singletonList, jwtContext);
        }
        if (this.getOutputMinFrameDurationlomOqCM && !z2) {
            java.util.List singletonList2 = java.util.Collections.singletonList(new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(19, "No encryption."));
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The JWT has no encryption but the JWT Consumer is configured to require it: ");
            sb4.append(jwtContext.getJwt());
            throw new org.jose4j.jwt.consumer.InvalidJwtException(sb4.toString(), singletonList2, jwtContext);
        }
        if (this.getOutputStallDurationlomOqCM && !z && !z3) {
            java.util.List singletonList3 = java.util.Collections.singletonList(new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(20, "Missing Integrity Protection"));
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("The JWT has no integrity protection (signature/MAC or symmetric AEAD encryption) but the JWT Consumer is configured to require it: ");
            sb5.append(jwtContext.getJwt());
            throw new org.jose4j.jwt.consumer.InvalidJwtException(sb5.toString(), singletonList3, jwtContext);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (org.jose4j.jwt.consumer.ErrorCodeValidator errorCodeValidator : this.getValidOutputFormatsForInputhNQ4ISI) {
            try {
                error = errorCodeValidator.validate(jwtContext);
            } catch (org.jose4j.jwt.MalformedClaimException e4) {
                error = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(18, e4.getMessage());
            } catch (java.lang.Exception e5) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Unexpected exception thrown from validator ");
                sb6.append(errorCodeValidator.getClass().getName());
                sb6.append(": ");
                sb6.append(org.jose4j.lang.ExceptionHelp.toStringWithCausesAndAbbreviatedStack(e5, getClass()));
                error = new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb6.toString());
            }
            if (error != null) {
                arrayList2.add(error);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("JWT (claims->");
        sb7.append(jwtContext.getJwtClaims().getRawJson());
        sb7.append(") rejected due to invalid claims or other invalid content.");
        throw new org.jose4j.jwt.consumer.InvalidJwtException(sb7.toString(), arrayList2, jwtContext);
    }

    public org.jose4j.jwt.consumer.JwtContext process(java.lang.String str) throws org.jose4j.jwt.consumer.InvalidJwtException {
        java.lang.String payload;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.jose4j.jwt.JwtClaims jwtClaims = null;
        org.jose4j.jwt.consumer.JwtContext jwtContext = new org.jose4j.jwt.consumer.JwtContext(str, null, java.util.Collections.unmodifiableList(linkedList));
        java.lang.String str2 = str;
        while (jwtClaims == null) {
            try {
                try {
                    try {
                        org.jose4j.jwx.JsonWebStructure fromCompactSerialization = org.jose4j.jwx.JsonWebStructure.fromCompactSerialization(str2);
                        if (fromCompactSerialization instanceof org.jose4j.jws.JsonWebSignature) {
                            payload = ((org.jose4j.jws.JsonWebSignature) fromCompactSerialization).getUnverifiedPayload();
                        } else {
                            org.jose4j.jwe.JsonWebEncryption jsonWebEncryption = (org.jose4j.jwe.JsonWebEncryption) fromCompactSerialization;
                            org.jose4j.jca.ProviderContext providerContext = this.getHighSpeedVideoFpsRangesFor;
                            if (providerContext != null) {
                                jsonWebEncryption.setProviderContext(providerContext);
                            }
                            if (this.getOutputFormats) {
                                jsonWebEncryption.setDoKeyValidation(false);
                            }
                            org.jose4j.jwa.AlgorithmConstraints algorithmConstraints = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (algorithmConstraints != null) {
                                jsonWebEncryption.setContentEncryptionAlgorithmConstraints(algorithmConstraints);
                            }
                            java.util.List<org.jose4j.jwx.JsonWebStructure> unmodifiableList = java.util.Collections.unmodifiableList(linkedList);
                            jsonWebEncryption.setKey(this.getHighSpeedVideoSizes.resolveKey(jsonWebEncryption, unmodifiableList));
                            org.jose4j.jwa.AlgorithmConstraints algorithmConstraints2 = this.getHighSpeedVideoFpsRanges;
                            if (algorithmConstraints2 != null) {
                                jsonWebEncryption.setAlgorithmConstraints(algorithmConstraints2);
                            }
                            org.jose4j.jwt.consumer.JweCustomizer jweCustomizer = this.Camera2StreamConfigurationMap;
                            if (jweCustomizer != null) {
                                jweCustomizer.customize(jsonWebEncryption, unmodifiableList);
                            }
                            payload = jsonWebEncryption.getPayload();
                        }
                        java.lang.String contentTypeHeaderValue = fromCompactSerialization.getContentTypeHeaderValue();
                        if (contentTypeHeaderValue == null || (!contentTypeHeaderValue.equalsIgnoreCase(com.paypal.android.threeds.utils.NetworkUtil.JWT) && !contentTypeHeaderValue.equalsIgnoreCase("application/jwt"))) {
                            try {
                                jwtClaims = org.jose4j.jwt.JwtClaims.parse(payload, jwtContext);
                                jwtContext.getHighSpeedVideoSizes = jwtClaims;
                            } catch (org.jose4j.jwt.consumer.InvalidJwtException e) {
                                if (this.getHighSpeedVideoSizesFor) {
                                    try {
                                        org.jose4j.jwx.JsonWebStructure.fromCompactSerialization(str);
                                    } catch (org.jose4j.lang.JoseException unused) {
                                        throw e;
                                    }
                                } else {
                                    throw e;
                                }
                            }
                            linkedList.addFirst(fromCompactSerialization);
                        }
                        str2 = payload;
                        linkedList.addFirst(fromCompactSerialization);
                    } catch (java.lang.Exception e2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected exception encountered while processing");
                        if (!linkedList.isEmpty()) {
                            sb.append(" nested");
                        }
                        sb.append(" JOSE object (");
                        sb.append(e2);
                        sb.append("): ");
                        sb.append(str2);
                        throw new org.jose4j.jwt.consumer.InvalidJwtException("JWT processing failed.", new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb.toString()), e2, jwtContext);
                    }
                } catch (org.jose4j.lang.JoseException e3) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to process");
                    if (!linkedList.isEmpty()) {
                        sb2.append(" nested");
                    }
                    sb2.append(" JOSE object (cause: ");
                    sb2.append(e3);
                    sb2.append("): ");
                    sb2.append(str2);
                    throw new org.jose4j.jwt.consumer.InvalidJwtException("JWT processing failed.", new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, sb2.toString()), e3, jwtContext);
                }
            } catch (org.jose4j.jwt.consumer.InvalidJwtException e4) {
                throw e4;
            }
        }
        processContext(jwtContext);
        return jwtContext;
    }
}
