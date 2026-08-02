package com.paypal.oslo.downloads.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/api/DownloadQueries;", "", "Lcom/paypal/oslo/downloads/api/model/DownloadId;", "downloadId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "observeDownload-3wgKXB0", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "observeDownload", "", "Lcom/paypal/oslo/downloads/api/model/DownloadInfo;", "observeAllDownloads", "()Lkotlinx/coroutines/flow/Flow;", "getDownload-N7k_Iqk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDownload", "getAllDownloads", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadStatistics;", "getStatistics"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadQueries {
    java.lang.Object getAllDownloads(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.downloads.api.model.DownloadInfo>> continuation);

    /* renamed from: getDownload-N7k_Iqk, reason: not valid java name */
    java.lang.Object mo11713getDownloadN7k_Iqk(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadInfo> continuation);

    java.lang.Object getStatistics(kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadStatistics> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.downloads.api.model.DownloadInfo>> observeAllDownloads();

    /* renamed from: observeDownload-3wgKXB0, reason: not valid java name */
    kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> mo11714observeDownload3wgKXB0(java.lang.String downloadId);
}
