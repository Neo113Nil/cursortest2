package com.paypal.android.logger.handlers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/logger/handlers/LoggerAttributePrefixLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "prefix", "<init>", "(Ljava/lang/String;)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LoggerAttributePrefixLogHandler implements com.paypal.android.logger.LogHandler {
    private final java.lang.String prefix;

    public LoggerAttributePrefixLogHandler(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.prefix = str;
    }

    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        java.lang.Object obj = log.getAttributes().get("logger");
        if (obj != null) {
            java.util.Map<java.lang.String, java.lang.Object> attributes = log.getAttributes();
            java.lang.String str = this.prefix;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(obj);
            attributes.put("logger", sb.toString());
        }
    }
}
