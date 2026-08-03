package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class NormalizedParameters {
    final java.lang.Object[] arguments;
    final java.lang.String message;
    final java.lang.Throwable throwable;

    public NormalizedParameters(java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        this.message = str;
        this.arguments = objArr;
        this.throwable = th;
    }

    public NormalizedParameters(java.lang.String str, java.lang.Object[] objArr) {
        this(str, objArr, null);
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.Object[] getArguments() {
        return this.arguments;
    }

    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public static java.lang.Throwable getThrowableCandidate(java.lang.Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            java.lang.Object obj = objArr[objArr.length - 1];
            if (obj instanceof java.lang.Throwable) {
                return (java.lang.Throwable) obj;
            }
        }
        return null;
    }

    public static java.lang.Object[] trimmedCopy(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new java.lang.IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        if (length > 0) {
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public static org.slf4j.helpers.NormalizedParameters normalize(java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        if (th != null) {
            return new org.slf4j.helpers.NormalizedParameters(str, objArr, th);
        }
        if (objArr == null || objArr.length == 0) {
            return new org.slf4j.helpers.NormalizedParameters(str, objArr, th);
        }
        java.lang.Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            return new org.slf4j.helpers.NormalizedParameters(str, org.slf4j.helpers.MessageFormatter.trimmedCopy(objArr), throwableCandidate);
        }
        return new org.slf4j.helpers.NormalizedParameters(str, objArr);
    }

    public static org.slf4j.helpers.NormalizedParameters normalize(org.slf4j.event.LoggingEvent loggingEvent) {
        return normalize(loggingEvent.getMessage(), loggingEvent.getArgumentArray(), loggingEvent.getThrowable());
    }
}
