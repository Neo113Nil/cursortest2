package com.vungle.ads.internal.task;

/* compiled from: JobCreator.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/task/JobCreator;", "", "create", "Lcom/vungle/ads/internal/task/Job;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface JobCreator {
    com.vungle.ads.internal.task.Job create(java.lang.String tag) throws com.vungle.ads.internal.task.UnknownTagException;
}
