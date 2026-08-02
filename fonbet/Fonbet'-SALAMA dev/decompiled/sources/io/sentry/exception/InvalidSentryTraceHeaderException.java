package io.sentry.exception;

import w1.L;

/* loaded from: classes2.dex */
public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = -8353316997083420940L;
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(String str) {
        this(str, null);
    }

    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }

    public InvalidSentryTraceHeaderException(String str, Throwable th) {
        super(L.i("sentry-trace header does not conform to expected format: ", str), th);
        this.sentryTraceHeader = str;
    }
}
