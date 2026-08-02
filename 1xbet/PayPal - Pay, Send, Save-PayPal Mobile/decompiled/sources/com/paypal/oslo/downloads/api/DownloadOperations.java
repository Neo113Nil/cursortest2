package com.paypal.oslo.downloads.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/api/DownloadOperations;", "", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "request", "Lcom/paypal/oslo/downloads/api/model/DownloadId;", "download-xebedEM", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "downloadId", "", "pause-N7k_Iqk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "resume-N7k_Iqk", "resume", "cancel-N7k_Iqk", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "retry-N7k_Iqk", "retry", "", "clearCompleted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCache", "delete-N7k_Iqk", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadOperations {
    /* renamed from: cancel-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11707cancelN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object clearCache(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    java.lang.Object clearCompleted(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    /* renamed from: delete-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11708deleteN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    /* renamed from: download-xebedEM, reason: not valid java name */
    java.lang.Object mo11709downloadxebedEM(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadId> continuation);

    /* renamed from: pause-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11710pauseN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    /* renamed from: resume-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11711resumeN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    /* renamed from: retry-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11712retryN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
