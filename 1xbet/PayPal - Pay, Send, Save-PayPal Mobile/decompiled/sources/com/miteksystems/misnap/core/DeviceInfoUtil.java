package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoUtil;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceInfoUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.DeviceInfoUtil.Companion INSTANCE = new com.miteksystems.misnap.core.DeviceInfoUtil.Companion(null);
    private static final com.miteksystems.misnap.core.MibiData.Session getHighResolutionOutputSizeshNQ4ISI = com.miteksystems.misnap.core.MibiData.INSTANCE.bindSession();
    private static final com.miteksystems.misnap.core.internal.DeviceInfoProvider getHighSpeedVideoSizes = new com.miteksystems.misnap.core.internal.DeviceInfoProvider();

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.core.DeviceInfoResult getDeviceInfo(android.content.Context context, java.lang.String str) {
        return INSTANCE.getDeviceInfo(context, str);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/miteksystems/misnap/core/DeviceInfoUtil$Companion;", "", "()V", "deviceInfoProvider", "Lcom/miteksystems/misnap/core/internal/DeviceInfoProvider;", "mibiDataSession", "Lcom/miteksystems/misnap/core/MibiData$Session;", "getDeviceInfo", "Lcom/miteksystems/misnap/core/DeviceInfoResult;", "context", "Landroid/content/Context;", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.core.DeviceInfoResult getDeviceInfo(android.content.Context context, java.lang.String license) {
            java.lang.Object m23436constructorimpl;
            java.lang.Object m23436constructorimpl2;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
            com.miteksystems.misnap.core.LicenseUtil.Companion companion = com.miteksystems.misnap.core.LicenseUtil.INSTANCE;
            if (!companion.isLibraryLoaded() || !com.miteksystems.misnap.core.a.a.INSTANCE.a()) {
                com.miteksystems.misnap.core.DeviceInfoUtil.getHighResolutionOutputSizeshNQ4ISI.addUxpEvent("EDILL", new java.lang.String[0]);
                return com.miteksystems.misnap.core.DeviceInfoResult.Failure.LibraryLoad.INSTANCE;
            }
            try {
                boolean isExpired = companion.isExpired(license);
                java.util.List<com.miteksystems.misnap.core.MiSnapFeature> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.miteksystems.misnap.core.MiSnapFeature[]{com.miteksystems.misnap.core.MiSnapFeature.ID, com.miteksystems.misnap.core.MiSnapFeature.FACE, com.miteksystems.misnap.core.MiSnapFeature.VOICE, com.miteksystems.misnap.core.MiSnapFeature.DEPOSIT});
                if (!(listOf instanceof java.util.Collection) || !listOf.isEmpty()) {
                    for (com.miteksystems.misnap.core.MiSnapFeature miSnapFeature : listOf) {
                        try {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            com.miteksystems.misnap.core.LicenseUtil.INSTANCE.featureEnabled(license, miSnapFeature.getCom.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE java.lang.String());
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
                            java.util.List a2 = com.miteksystems.misnap.core.a.a.INSTANCE.a(com.miteksystems.misnap.core.DeviceInfoUtil.getHighSpeedVideoSizes.a(context));
                            if (a2.isEmpty()) {
                                com.miteksystems.misnap.core.DeviceInfoUtil.getHighResolutionOutputSizeshNQ4ISI.addUxpEvent("EDIEF", new java.lang.String[0]);
                                return com.miteksystems.misnap.core.DeviceInfoResult.Failure.Execution.INSTANCE;
                            }
                            com.miteksystems.misnap.core.DeviceInfoUtil.getHighResolutionOutputSizeshNQ4ISI.addUxpEvent("DIRPS", new java.lang.String[0]);
                            return new com.miteksystems.misnap.core.DeviceInfoResult.Success(a2, isExpired);
                        }
                    }
                }
                try {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    com.miteksystems.misnap.core.LicenseUtil.INSTANCE.featureEnabled(license, com.miteksystems.misnap.core.MiSnapFeature.ID.getCom.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE java.lang.String());
                    m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl2);
                if (m23439exceptionOrNullimpl == null || (str = m23439exceptionOrNullimpl.getMessage()) == null) {
                    str = "Unknown license error.";
                }
                com.miteksystems.misnap.core.DeviceInfoUtil.getHighResolutionOutputSizeshNQ4ISI.addUxpEvent("EDILF", new java.lang.String[0]);
                return new com.miteksystems.misnap.core.DeviceInfoResult.Failure.License(str);
            } catch (com.miteksystems.misnap.core.LicenseException e) {
                com.miteksystems.misnap.core.DeviceInfoUtil.getHighResolutionOutputSizeshNQ4ISI.addUxpEvent("EDILF", new java.lang.String[0]);
                return new com.miteksystems.misnap.core.DeviceInfoResult.Failure.License(e.getMessage());
            }
        }

        private Companion() {
        }
    }

    private DeviceInfoUtil() {
    }
}
