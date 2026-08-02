package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class JwtConsumerBuilder {
    private boolean ArtificialStackFrames;
    private boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private org.jose4j.jwt.consumer.TypeValidator f7055a;
    private boolean coroutineBoundary;
    private org.jose4j.jwt.consumer.AudValidator getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private org.jose4j.jwa.AlgorithmConstraints getHighSpeedVideoSizesFor;
    private org.jose4j.jwa.AlgorithmConstraints getInputFormats;
    private org.jose4j.jwt.consumer.JweCustomizer getInputSizeshNQ4ISI;
    private org.jose4j.jca.ProviderContext getOutputFormats;
    private org.jose4j.jwt.consumer.IssValidator getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private org.jose4j.jca.ProviderContext getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private org.jose4j.jwt.consumer.JwsCustomizer getOutputStallDuration;
    private org.jose4j.jwa.AlgorithmConstraints getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private boolean unwrapAs;
    private org.jose4j.keys.resolvers.VerificationKeyResolver getARTIFICIAL_FRAME_PACKAGE_NAME = new org.jose4j.jwt.consumer.SimpleKeyResolver(null);
    private org.jose4j.keys.resolvers.DecryptionKeyResolver getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwt.consumer.SimpleKeyResolver(null);
    private org.jose4j.jwt.consumer.NumericDateValidator getHighSpeedVideoSizes = new org.jose4j.jwt.consumer.NumericDateValidator();
    private java.util.List<org.jose4j.jwt.consumer.ErrorCodeValidator> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private boolean toString = true;
    private boolean CoroutineDebuggingKt = false;
    private boolean coroutineCreation = false;
    private boolean accessartificialFrame = false;

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setEnableRequireEncryption() {
        this.isOutputSupportedFor = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setEnableRequireIntegrity() {
        this.isOutputSupportedForhNQ4ISI = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setDisableRequireSignature() {
        this.toString = false;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setEnableLiberalContentTypeHandling() {
        this.getOutputMinFrameDurationlomOqCM = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setSkipSignatureVerification() {
        this.CoroutineDebuggingKt = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setSkipAllValidators() {
        this.coroutineCreation = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setSkipAllDefaultValidators() {
        this.accessartificialFrame = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJwsAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints algorithmConstraints) {
        this.getOutputStallDurationlomOqCM = algorithmConstraints;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints algorithmConstraints) {
        this.getInputFormats = algorithmConstraints;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweContentEncryptionAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints algorithmConstraints) {
        this.getHighSpeedVideoSizesFor = algorithmConstraints;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJwsAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType constraintType, java.lang.String... strArr) {
        this.getOutputStallDurationlomOqCM = new org.jose4j.jwa.AlgorithmConstraints(constraintType, strArr);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType constraintType, java.lang.String... strArr) {
        this.getInputFormats = new org.jose4j.jwa.AlgorithmConstraints(constraintType, strArr);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweContentEncryptionAlgorithmConstraints(org.jose4j.jwa.AlgorithmConstraints.ConstraintType constraintType, java.lang.String... strArr) {
        this.getHighSpeedVideoSizesFor = new org.jose4j.jwa.AlgorithmConstraints(constraintType, strArr);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setVerificationKey(java.security.Key key) {
        return setVerificationKeyResolver(new org.jose4j.jwt.consumer.SimpleKeyResolver(key));
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setVerificationKeyResolver(org.jose4j.keys.resolvers.VerificationKeyResolver verificationKeyResolver) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = verificationKeyResolver;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setSkipVerificationKeyResolutionOnNone() {
        this._CREATION = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setDecryptionKey(java.security.Key key) {
        return setDecryptionKeyResolver(new org.jose4j.jwt.consumer.SimpleKeyResolver(key));
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setDecryptionKeyResolver(org.jose4j.keys.resolvers.DecryptionKeyResolver decryptionKeyResolver) {
        this.getHighResolutionOutputSizeshNQ4ISI = decryptionKeyResolver;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedAudience(java.lang.String... strArr) {
        return setExpectedAudience(true, strArr);
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedAudience(boolean z, java.lang.String... strArr) {
        this.getHighSpeedVideoFpsRanges = new org.jose4j.jwt.consumer.AudValidator(new java.util.HashSet(java.util.Arrays.asList(strArr)), z);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setSkipDefaultAudienceValidation() {
        this.coroutineBoundary = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedIssuers(boolean z, java.lang.String... strArr) {
        this.getOutputMinFrameDuration = new org.jose4j.jwt.consumer.IssValidator(z, strArr);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedIssuer(boolean z, java.lang.String str) {
        this.getOutputMinFrameDuration = new org.jose4j.jwt.consumer.IssValidator(str, z);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedIssuer(java.lang.String str) {
        return setExpectedIssuer(true, str);
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRequireSubject() {
        this.ArtificialStackFrames = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedSubject(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
        return setRequireSubject();
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRequireJwtId() {
        this.unwrapAs = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRequireExpirationTime() {
        this.getHighSpeedVideoSizes.setRequireExp(true);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRequireIssuedAt() {
        this.getHighSpeedVideoSizes.setRequireIat(true);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setIssuedAtRestrictions(int i, int i2) {
        this.getHighSpeedVideoSizes.setIatAllowedSecondsInTheFuture(i);
        this.getHighSpeedVideoSizes.setIatAllowedSecondsInThePast(i2);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRequireNotBefore() {
        this.getHighSpeedVideoSizes.setRequireNbf(true);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setEvaluationTime(org.jose4j.jwt.NumericDate numericDate) {
        this.getHighSpeedVideoSizes.setEvaluationTime(numericDate);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setAllowedClockSkewInSeconds(int i) {
        this.getHighSpeedVideoSizes.setAllowedClockSkewSeconds(i);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setMaxFutureValidityInMinutes(int i) {
        this.getHighSpeedVideoSizes.setMaxFutureValidityInMinutes(i);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRelaxVerificationKeyValidation() {
        this.getValidOutputFormatsForInputhNQ4ISI = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setRelaxDecryptionKeyValidation() {
        this.getOutputSizeshNQ4ISI = true;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder registerValidator(org.jose4j.jwt.consumer.Validator validator) {
        this.Camera2StreamConfigurationMap.add(new org.jose4j.jwt.consumer.ErrorCodeValidatorAdapter(validator));
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder registerValidator(org.jose4j.jwt.consumer.ErrorCodeValidator errorCodeValidator) {
        this.Camera2StreamConfigurationMap.add(errorCodeValidator);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJwsCustomizer(org.jose4j.jwt.consumer.JwsCustomizer jwsCustomizer) {
        this.getOutputStallDuration = jwsCustomizer;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweCustomizer(org.jose4j.jwt.consumer.JweCustomizer jweCustomizer) {
        this.getInputSizeshNQ4ISI = jweCustomizer;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJwsProviderContext(org.jose4j.jca.ProviderContext providerContext) {
        this.getOutputSizes = providerContext;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setJweProviderContext(org.jose4j.jca.ProviderContext providerContext) {
        this.getOutputFormats = providerContext;
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumerBuilder setExpectedType(boolean z, java.lang.String str) {
        this.f7055a = new org.jose4j.jwt.consumer.TypeValidator(z, str);
        return this;
    }

    public org.jose4j.jwt.consumer.JwtConsumer build() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.coroutineCreation) {
            if (!this.accessartificialFrame) {
                if (!this.coroutineBoundary) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = new org.jose4j.jwt.consumer.AudValidator(java.util.Collections.emptySet(), false);
                    }
                    arrayList.add(this.getHighSpeedVideoFpsRanges);
                }
                if (this.getOutputMinFrameDuration == null) {
                    this.getOutputMinFrameDuration = new org.jose4j.jwt.consumer.IssValidator((java.lang.String) null, false);
                }
                arrayList.add(this.getOutputMinFrameDuration);
                arrayList.add(this.getHighSpeedVideoSizes);
                arrayList.add(this.getHighSpeedVideoFpsRangesFor == null ? new org.jose4j.jwt.consumer.SubValidator(this.ArtificialStackFrames) : new org.jose4j.jwt.consumer.SubValidator(this.getHighSpeedVideoFpsRangesFor));
                arrayList.add(new org.jose4j.jwt.consumer.JtiValidator(this.unwrapAs));
                org.jose4j.jwt.consumer.TypeValidator typeValidator = this.f7055a;
                if (typeValidator != null) {
                    arrayList.add(typeValidator);
                }
            }
            arrayList.addAll(this.Camera2StreamConfigurationMap);
        }
        org.jose4j.jwt.consumer.JwtConsumer jwtConsumer = new org.jose4j.jwt.consumer.JwtConsumer();
        jwtConsumer.getValidOutputFormatsForInputhNQ4ISI = arrayList;
        jwtConsumer.unwrapAs = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        jwtConsumer.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
        jwtConsumer.getOutputMinFrameDuration = this.getOutputStallDurationlomOqCM;
        jwtConsumer.getHighSpeedVideoFpsRanges = this.getInputFormats;
        jwtConsumer.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor;
        jwtConsumer.getOutputSizeshNQ4ISI = this.toString;
        jwtConsumer.getOutputMinFrameDurationlomOqCM = this.isOutputSupportedFor;
        jwtConsumer.getOutputStallDurationlomOqCM = this.isOutputSupportedForhNQ4ISI;
        jwtConsumer.getHighSpeedVideoSizesFor = this.getOutputMinFrameDurationlomOqCM;
        jwtConsumer.getOutputSizes = this.CoroutineDebuggingKt;
        jwtConsumer.setSkipVerificationKeyResolutionOnNone(this._CREATION);
        jwtConsumer.getOutputStallDuration = this.getValidOutputFormatsForInputhNQ4ISI;
        jwtConsumer.getOutputFormats = this.getOutputSizeshNQ4ISI;
        jwtConsumer.getInputFormats = this.getOutputStallDuration;
        jwtConsumer.Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI;
        jwtConsumer.getInputSizeshNQ4ISI = this.getOutputSizes;
        jwtConsumer.getHighSpeedVideoFpsRangesFor = this.getOutputFormats;
        return jwtConsumer;
    }
}
