package com.datadog.android.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/core/configuration/HostsSanitizer;", "", "<init>", "()V", "", "", "hosts", "feature", "sanitizeHosts", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HostsSanitizer {
    public static final java.lang.String ERROR_MALFORMED_HOST_IP_ADDRESS = "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.";
    public static final java.lang.String ERROR_MALFORMED_URL = "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"";
    public static final java.lang.String WARNING_USING_URL = "You are using a url \"%s\" instead of a host to setup %s tracking. You should use instead a valid host name: \"%s\"";

    public final java.util.List<java.lang.String> sanitizeHosts(java.util.List<java.lang.String> hosts, final java.lang.String feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hosts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.text.Regex regex = new kotlin.text.Regex("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$");
        kotlin.text.Regex regex2 = new kotlin.text.Regex("^(http|https)://(.*)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final java.lang.String str : hosts) {
            java.lang.String str2 = str;
            if (regex2.matches(str2)) {
                try {
                    final java.net.URL url = new java.net.URL(str);
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.configuration.HostsSanitizer.WARNING_USING_URL, java.util.Arrays.copyOf(new java.lang.Object[]{str, feature, url.getHost()}, 3));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    str = url.getHost();
                } catch (java.net.MalformedURLException e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.configuration.HostsSanitizer.ERROR_MALFORMED_URL, java.util.Arrays.copyOf(new java.lang.Object[]{str, feature}, 2));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                }
            } else if (!regex.matches(str2)) {
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_HOST)) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$3
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.configuration.HostsSanitizer.ERROR_MALFORMED_HOST_IP_ADDRESS, java.util.Arrays.copyOf(new java.lang.Object[]{str, feature}, 2));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    str = null;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
