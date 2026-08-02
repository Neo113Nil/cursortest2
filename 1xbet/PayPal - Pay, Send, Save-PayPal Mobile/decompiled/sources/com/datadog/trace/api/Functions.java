package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class Functions {
    public static final com.datadog.android.trace.internal.compat.function.Function<java.lang.String, com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> UTF8_ENCODE = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.Functions$$ExternalSyntheticLambda0
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create((java.lang.String) obj);
        }
    };

    private Functions() {
    }

    public static final class LowerCase implements com.datadog.android.trace.internal.compat.function.Function<java.lang.String, java.lang.String> {
        public static final com.datadog.trace.api.Functions.LowerCase INSTANCE = new com.datadog.trace.api.Functions.LowerCase();

        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.String apply(java.lang.String str) {
            return str.toLowerCase(java.util.Locale.ROOT);
        }
    }
}
