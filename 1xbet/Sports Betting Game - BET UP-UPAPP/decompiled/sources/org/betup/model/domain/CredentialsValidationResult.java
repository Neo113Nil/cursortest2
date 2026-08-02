package org.betup.model.domain;

/* loaded from: classes2.dex */
public class CredentialsValidationResult {
    private final String error;
    private final boolean isSuccess;

    public CredentialsValidationResult(boolean isSuccess, String error) {
        this.isSuccess = isSuccess;
        this.error = error;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public String getError() {
        return this.error;
    }
}
