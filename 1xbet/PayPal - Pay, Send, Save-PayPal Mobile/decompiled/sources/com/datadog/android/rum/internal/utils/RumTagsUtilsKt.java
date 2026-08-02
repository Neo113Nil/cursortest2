package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/context/DatadogContext;", "context", "", "buildDDTagsString", "(Lcom/datadog/android/api/context/DatadogContext;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumTagsUtilsKt {
    public static final java.lang.String buildDDTagsString(com.datadog.android.api.context.DatadogContext datadogContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("service:".concat(java.lang.String.valueOf(datadogContext.getService())));
        sb.append(",");
        sb.append("version:".concat(java.lang.String.valueOf(datadogContext.getVersion())));
        sb.append(",");
        sb.append("sdk_version:".concat(java.lang.String.valueOf(datadogContext.getSdkVersion())));
        sb.append(",");
        sb.append("env:".concat(java.lang.String.valueOf(datadogContext.getEnv())));
        if (datadogContext.getVariant().length() > 0) {
            sb.append(",");
            sb.append("variant:".concat(java.lang.String.valueOf(datadogContext.getVariant())));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
