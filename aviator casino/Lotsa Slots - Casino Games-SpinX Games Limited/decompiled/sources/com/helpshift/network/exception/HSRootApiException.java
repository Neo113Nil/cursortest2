package com.helpshift.network.exception;

/* loaded from: classes2.dex */
public class HSRootApiException extends java.lang.RuntimeException {
    public final java.lang.String errorMessage;
    public final java.lang.Exception exception;
    public final transient com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType;

    public interface ExceptionType {
    }

    private HSRootApiException(java.lang.Exception exc, com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType, java.lang.String str) {
        super(str, exc);
        this.exception = exc;
        this.exceptionType = exceptionType;
        this.errorMessage = str;
    }

    public static com.helpshift.network.exception.HSRootApiException wrap(java.lang.Exception exc) {
        return wrap(exc, null);
    }

    public static com.helpshift.network.exception.HSRootApiException wrap(java.lang.Exception exc, com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType) {
        return wrap(exc, exceptionType, null);
    }

    public static com.helpshift.network.exception.HSRootApiException wrap(java.lang.Exception exc, com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType, java.lang.String str) {
        if (exc instanceof com.helpshift.network.exception.HSRootApiException) {
            com.helpshift.network.exception.HSRootApiException hSRootApiException = (com.helpshift.network.exception.HSRootApiException) exc;
            java.lang.Exception exc2 = hSRootApiException.exception;
            if (exceptionType == null) {
                exceptionType = hSRootApiException.exceptionType;
            }
            if (str == null) {
                str = hSRootApiException.errorMessage;
            }
            exc = exc2;
        } else if (exceptionType == null) {
            exceptionType = com.helpshift.network.exception.UnexpectedException.GENERIC;
        }
        return new com.helpshift.network.exception.HSRootApiException(exc, exceptionType, str);
    }

    public int getServerStatusCode() {
        com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType = this.exceptionType;
        if (exceptionType instanceof com.helpshift.network.exception.NetworkException) {
            return ((com.helpshift.network.exception.NetworkException) exceptionType).serverStatusCode;
        }
        return 0;
    }

    public boolean shouldLog() {
        return this.exception != null;
    }
}
