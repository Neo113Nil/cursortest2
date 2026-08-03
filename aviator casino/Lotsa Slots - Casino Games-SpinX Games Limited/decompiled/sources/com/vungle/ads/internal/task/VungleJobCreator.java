package com.vungle.ads.internal.task;

/* compiled from: VungleJobCreator.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobCreator;", "Lcom/vungle/ads/internal/task/JobCreator;", "context", "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "create", "Lcom/vungle/ads/internal/task/Job;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleJobCreator implements com.vungle.ads.internal.task.JobCreator {
    private final android.content.Context context;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;

    public VungleJobCreator(android.content.Context context, com.vungle.ads.internal.util.PathProvider pathProvider) {
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

    @Override // com.vungle.ads.internal.task.JobCreator
    public com.vungle.ads.internal.task.Job create(java.lang.String tag) throws com.vungle.ads.internal.task.UnknownTagException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            throw new com.vungle.ads.internal.task.UnknownTagException("Job tag is null");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, com.vungle.ads.internal.task.CleanupJob.TAG)) {
            return new com.vungle.ads.internal.task.CleanupJob(this.context, this.pathProvider);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tag, com.vungle.ads.internal.task.ResendTpatJob.TAG)) {
            return new com.vungle.ads.internal.task.ResendTpatJob(this.context, this.pathProvider);
        }
        throw new com.vungle.ads.internal.task.UnknownTagException("Unknown Job Type " + tag);
    }
}
