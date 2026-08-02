package com.paypal.oslo.downloads.worker;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/downloads/worker/WorkerHelper;", "", "<init>", "()V", "", "totalBytes", "", "shouldUseForegroundService", "(J)Z", "", "configJson", "shouldShowNotification", "(Ljava/lang/String;J)Z", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "error", "getErrorType", "(Lcom/paypal/oslo/downloads/api/model/DownloadError;)Ljava/lang/String;", "downloadId", "Landroid/app/Notification;", "notification", "Landroidx/work/ForegroundInfo;", "createForegroundInfo", "(Ljava/lang/String;Landroid/app/Notification;)Landroidx/work/ForegroundInfo;", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkerHelper {
    public static final com.paypal.oslo.downloads.worker.WorkerHelper INSTANCE = new com.paypal.oslo.downloads.worker.WorkerHelper();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.downloads.worker.WorkerHelper$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.downloads.worker.WorkerHelper.m11760$r8$lambda$QWZzuFy_evhW4SMrrAcT7_jjY((kotlinx.serialization.json.JsonBuilder) obj);
        }
    }, 1, null);

    public final boolean shouldUseForegroundService(long totalBytes) {
        return totalBytes <= 0 || totalBytes > 10000000;
    }

    private WorkerHelper() {
    }

    public final boolean shouldShowNotification(java.lang.String configJson, long totalBytes) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configJson, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.worker.WorkerHelper workerHelper = this;
            kotlinx.serialization.json.Json json = getHighSpeedVideoFpsRangesFor;
            json.getSerializersModule();
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(((com.paypal.oslo.downloads.impl.data.ConfigJson) json.decodeFromString(com.paypal.oslo.downloads.impl.data.ConfigJson.INSTANCE.serializer(), configJson)).getShowNotification()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = java.lang.Boolean.TRUE;
        }
        return ((java.lang.Boolean) m23436constructorimpl).booleanValue() || totalBytes <= 0 || totalBytes > 2000000;
    }

    public final java.lang.String getErrorType(com.paypal.oslo.downloads.api.model.DownloadError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.NetworkError) {
            return com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE;
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError) {
            return "AUTH";
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.StorageError) {
            return "STORAGE";
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.ValidationError) {
            return "VALIDATION";
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.ServerError) {
            return "SERVER";
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.SystemRestrictionError) {
            return "SYSTEM";
        }
        if (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.UnknownError) {
            return "UNKNOWN";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final androidx.work.ForegroundInfo createForegroundInfo(java.lang.String downloadId, android.app.Notification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return new androidx.work.ForegroundInfo(downloadId.hashCode(), notification, 1);
        }
        return new androidx.work.ForegroundInfo(downloadId.hashCode(), notification);
    }

    /* renamed from: $r8$lambda$Q-WZzuFy_evhW4SMrrAc-T7_jjY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11760$r8$lambda$QWZzuFy_evhW4SMrrAcT7_jjY(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
