package com.vungle.ads.internal.task;

/* compiled from: ResendTpatJob.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/ResendTpatJob;", "Lcom/vungle/ads/internal/task/Job;", "context", "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "onRunJob", "", "bundle", "Landroid/os/Bundle;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "tpatSender", "Lcom/vungle/ads/internal/network/TpatSender;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ResendTpatJob implements com.vungle.ads.internal.task.Job {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.task.ResendTpatJob.Companion INSTANCE = new com.vungle.ads.internal.task.ResendTpatJob.Companion(null);
    public static final java.lang.String TAG = "ResendTpatJob";
    private final android.content.Context context;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;

    public ResendTpatJob(android.content.Context context, com.vungle.ads.internal.util.PathProvider pathProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.PathProvider getPathProvider() {
        return this.pathProvider;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.TpatSender m10470onRunJob$lambda0(kotlin.Lazy<com.vungle.ads.internal.network.TpatSender> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(android.os.Bundle bundle, com.vungle.ads.internal.task.JobRunner jobRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        m10470onRunJob$lambda0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.internal.task.ResendTpatJob$onRunJob$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.TpatSender invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.TpatSender.class);
            }
        })).resendStoredTpats$vungle_ads_release();
        return 0;
    }

    /* compiled from: ResendTpatJob.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/task/ResendTpatJob$Companion;", "", "()V", "TAG", "", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.vungle.ads.internal.task.JobInfo makeJobInfo() {
            return new com.vungle.ads.internal.task.JobInfo(com.vungle.ads.internal.task.ResendTpatJob.TAG).setPriority(0).setUpdateCurrent(true);
        }
    }
}
