package com.unity3d.ads.core.domain.work;

/* compiled from: BackgroundWorker.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "workManager", "Landroidx/work/WorkManager;", "getWorkManager", "()Landroidx/work/WorkManager;", "invoke", "", "T", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "universalRequestWorkerData", "Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundWorker {
    public static final java.lang.String TAG = "UnityAdsBackgroundWorker";
    private final androidx.work.WorkManager workManager;

    public BackgroundWorker(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(applicationContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    public final androidx.work.WorkManager getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends com.unity3d.ads.core.domain.work.UniversalRequestJob> void invoke(com.unity3d.ads.core.domain.work.UniversalRequestWorkerData universalRequestWorkerData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestWorkerData, "universalRequestWorkerData");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.work.OneTimeWorkRequest build = new androidx.work.OneTimeWorkRequest.Builder(androidx.work.ListenableWorker.class).setInputData(universalRequestWorkerData.invoke()).addTag(TAG).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().enqueue(build);
    }
}
