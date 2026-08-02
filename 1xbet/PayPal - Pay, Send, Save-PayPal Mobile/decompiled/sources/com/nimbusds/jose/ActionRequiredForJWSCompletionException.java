package com.nimbusds.jose;

/* loaded from: classes4.dex */
public class ActionRequiredForJWSCompletionException extends com.nimbusds.jose.JOSEException {
    private final com.nimbusds.jose.CompletableJWSObjectSigning completableSigning;
    private final com.nimbusds.jose.JWSSignerOption option;

    public ActionRequiredForJWSCompletionException(java.lang.String str, com.nimbusds.jose.JWSSignerOption jWSSignerOption, com.nimbusds.jose.CompletableJWSObjectSigning completableJWSObjectSigning) {
        super(str);
        if (jWSSignerOption == null) {
            throw new java.lang.IllegalArgumentException("The triggering option must not be null");
        }
        this.option = jWSSignerOption;
        if (completableJWSObjectSigning == null) {
            throw new java.lang.IllegalArgumentException("The completable signing must not be null");
        }
        this.completableSigning = completableJWSObjectSigning;
    }

    public com.nimbusds.jose.JWSSignerOption getTriggeringOption() {
        return this.option;
    }

    public com.nimbusds.jose.CompletableJWSObjectSigning getCompletableJWSObjectSigning() {
        return this.completableSigning;
    }
}
