package com.datadog.android.rum.internal.domain.display;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/display/SystemSettingsWrapper;", "", "Landroid/content/Context;", "applicationContext", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Landroid/content/Context;Lcom/datadog/android/api/InternalLogger;)V", "", "name", "", "getInt", "(Ljava/lang/String;)I", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemSettingsWrapper {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    public SystemSettingsWrapper(android.content.Context context, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    public final int getInt(final java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        try {
            return android.provider.Settings.System.getInt(this.getHighSpeedVideoSizes.getContentResolver(), name2);
        } catch (android.provider.Settings.SettingNotFoundException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.display.SystemSettingsWrapper$getInt$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Problem retrieving system value for ".concat(java.lang.String.valueOf(name2));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return Integer.MIN_VALUE;
        }
    }
}
