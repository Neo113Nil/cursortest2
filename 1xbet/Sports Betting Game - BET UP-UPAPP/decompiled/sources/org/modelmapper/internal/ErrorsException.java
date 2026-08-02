package org.modelmapper.internal;

/* loaded from: classes4.dex */
class ErrorsException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private final Errors errors;

    ErrorsException(Errors errors) {
        this.errors = errors;
    }

    public Errors getErrors() {
        return this.errors;
    }
}
