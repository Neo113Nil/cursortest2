package com.paypal.android.logger.formatters;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/logger/formatters/DefaultLogFormatter;", "Lcom/paypal/android/logger/formatters/LogFormatter;", "<init>", "()V", "Lcom/paypal/android/logger/Log;", "log", "", "format", "(Lcom/paypal/android/logger/Log;)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultLogFormatter implements com.paypal.android.logger.formatters.LogFormatter {
    @Override // com.paypal.android.logger.formatters.LogFormatter
    public final java.lang.String format(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        if (log.getPiiAttributes().isEmpty()) {
            java.lang.String message = log.getMessage();
            java.util.Map<java.lang.String, java.lang.Object> attributes = log.getAttributes();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(message);
            sb.append(" [");
            sb.append(attributes);
            sb.append("]");
            return sb.toString();
        }
        java.lang.String message2 = log.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> attributes2 = log.getAttributes();
        java.util.Map<java.lang.String, java.lang.Object> piiAttributes = log.getPiiAttributes();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(message2);
        sb2.append(" [");
        sb2.append(attributes2);
        sb2.append(" pii:");
        sb2.append(piiAttributes);
        sb2.append("]");
        return sb2.toString();
    }
}
