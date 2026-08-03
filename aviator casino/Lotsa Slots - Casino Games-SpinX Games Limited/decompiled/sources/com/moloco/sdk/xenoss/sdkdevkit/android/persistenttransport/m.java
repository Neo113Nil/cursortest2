package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class m implements com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.WorkManager f8005a;

    public m(android.content.Context context) {
        androidx.work.WorkManager b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            b2 = a(context);
        } catch (java.lang.IllegalStateException e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e, false, 8, null);
            b2 = b(context);
        }
        this.f8005a = b2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l
    public androidx.work.Operation a(androidx.work.WorkRequest workRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        androidx.work.Operation enqueue = this.f8005a.enqueue(workRequest);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
        return enqueue;
    }

    public final androidx.work.WorkManager b(android.content.Context context) {
        androidx.work.Configuration build = new androidx.work.Configuration.Builder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        try {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
            try {
                androidx.work.WorkManager.initialize(context, build);
            } catch (java.lang.IllegalStateException e) {
                e = e;
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e, false, 8, null);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
                return a(context);
            }
        } catch (java.lang.IllegalStateException e2) {
            e = e2;
        }
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
        try {
            return a(context);
        } catch (java.lang.IllegalStateException e3) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
            throw new java.lang.IllegalStateException("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e3);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> a(java.util.UUID id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> workInfoById = this.f8005a.getWorkInfoById(id);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workInfoById, "getWorkInfoById(...)");
        return workInfoById;
    }

    public final androidx.work.WorkManager a(android.content.Context context) {
        androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        return workManager;
    }
}
