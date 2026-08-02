package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\r\u001a\u00060\u000bR\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/MiscUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "resolveSystemInformation", "(Landroid/content/Context;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "", "resolveThemeColor", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Integer;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "jsonByteArray", "Lcom/google/gson/JsonObject;", "safeDeserializeToJsonObject$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/api/InternalLogger;[B)Lcom/google/gson/JsonObject;", "json", "", "key", "safeGetStringFromJsonObject$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/api/InternalLogger;Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", "DESERIALIZE_JSON_ERROR", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MiscUtils {
    public static final java.lang.String DESERIALIZE_JSON_ERROR = "Error deserializing json object";
    public static final com.datadog.android.sessionreplay.internal.utils.MiscUtils INSTANCE = new com.datadog.android.sessionreplay.internal.utils.MiscUtils();

    private MiscUtils() {
    }

    public final com.google.gson.JsonObject safeDeserializeToJsonObject$dd_sdk_android_session_replay_release(com.datadog.android.api.InternalLogger internalLogger, byte[] jsonByteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonByteArray, "");
        if (jsonByteArray.length == 0) {
            return null;
        }
        try {
            com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(new java.lang.String(jsonByteArray, kotlin.text.Charsets.UTF_8));
            if (parseString instanceof com.google.gson.JsonObject) {
                return (com.google.gson.JsonObject) parseString;
            }
            return null;
        } catch (com.google.gson.JsonParseException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.MiscUtils$safeDeserializeToJsonObject$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.utils.MiscUtils.DESERIALIZE_JSON_ERROR;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public final java.lang.String safeGetStringFromJsonObject$dd_sdk_android_session_replay_release(com.datadog.android.api.InternalLogger internalLogger, com.google.gson.JsonObject json, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            com.google.gson.JsonElement jsonElement = json.get(key);
            if (jsonElement != null) {
                return jsonElement.getAsString();
            }
            return null;
        } catch (java.lang.ClassCastException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.MiscUtils$safeGetStringFromJsonObject$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error getting string property from json";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.IllegalStateException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.MiscUtils$safeGetStringFromJsonObject$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error getting string property from json";
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public final java.lang.Integer resolveThemeColor(android.content.res.Resources.Theme theme) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(theme, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        theme.resolveAttribute(android.R.attr.windowBackground, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            return null;
        }
        return java.lang.Integer.valueOf(typedValue.data);
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.recorder.SystemInformation resolveSystemInformation$default(com.datadog.android.sessionreplay.internal.utils.MiscUtils miscUtils, android.content.Context context, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            buildSdkVersionProvider = com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT();
        }
        return miscUtils.resolveSystemInformation(context, buildSdkVersionProvider);
    }

    public final com.datadog.android.sessionreplay.recorder.SystemInformation resolveSystemInformation(android.content.Context context, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        long densityNormalized;
        long densityNormalized2;
        com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        float f = context.getResources().getDisplayMetrics().density;
        android.content.res.Resources.Theme theme = context.getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "");
        java.lang.Integer resolveThemeColor = resolveThemeColor(theme);
        java.lang.String formatColorAndAlphaAsHexString = resolveThemeColor != null ? com.datadog.android.sessionreplay.utils.DefaultColorStringFormatter.INSTANCE.formatColorAndAlphaAsHexString(resolveThemeColor.intValue(), 255) : null;
        java.lang.Object systemService = context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager == null) {
            globalBounds = new com.datadog.android.sessionreplay.utils.GlobalBounds(0L, 0L, 0L, 0L);
        } else {
            if (buildSdkVersionProvider.getIsAtLeastR()) {
                android.view.WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentWindowMetrics.getBounds(), "");
                densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized(r2.bottom - r2.top, f);
                densityNormalized2 = com.datadog.android.internal.utils.LongExtKt.densityNormalized(r2.right - r2.left, f);
            } else {
                windowManager.getDefaultDisplay().getSize(new android.graphics.Point());
                densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized(r1.y, f);
                densityNormalized2 = com.datadog.android.internal.utils.LongExtKt.densityNormalized(r1.x, f);
            }
            globalBounds = new com.datadog.android.sessionreplay.utils.GlobalBounds(0L, 0L, densityNormalized2, densityNormalized);
        }
        return new com.datadog.android.sessionreplay.recorder.SystemInformation(globalBounds, context.getResources().getConfiguration().orientation, f, formatColorAndAlphaAsHexString);
    }
}
