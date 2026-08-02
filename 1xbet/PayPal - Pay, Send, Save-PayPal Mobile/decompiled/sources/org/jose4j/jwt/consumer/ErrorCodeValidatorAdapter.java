package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class ErrorCodeValidatorAdapter implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private org.jose4j.jwt.consumer.Validator getHighResolutionOutputSizeshNQ4ISI;

    public ErrorCodeValidatorAdapter(org.jose4j.jwt.consumer.Validator validator) {
        this.getHighResolutionOutputSizeshNQ4ISI = validator;
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException {
        java.lang.String validate = this.getHighResolutionOutputSizeshNQ4ISI.validate(jwtContext);
        if (validate == null) {
            return null;
        }
        return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(17, validate);
    }
}
