package com.paypal.oslo.downloads.impl.data.dao;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\bH¦@¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\f2\u0006\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u000eJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u000bJ6\u0010\u001c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b \u0010!J^\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b&\u0010'J<\u0010*\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b*\u0010+J*\u0010-\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b-\u0010.J*\u00101\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b1\u00102J<\u00103\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b3\u0010+J*\u00104\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b4\u0010.J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b5\u0010\u000bJ\u0018\u00106\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\bH¦@¢\u0006\u0004\b6\u0010\u000bJ\u0018\u00107\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\bH¦@¢\u0006\u0004\b7\u0010\u000bJ\u001e\u00109\u001a\u00020/2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH¦@¢\u0006\u0004\b9\u0010:À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "", "Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;", "entity", "", "insert", "(Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "id", "getById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeById", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAll", "()Lkotlinx/coroutines/flow/Flow;", "state", "getByState", "observeByState", "tag", "getByTag", "pauseReason", "", "updatedAt", "updateState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadedBytes", "totalBytes", "updateProgress", "(Ljava/lang/String;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filePath", "fileUri", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "completedAt", "markCompleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "errorType", "errorMessage", "markFailed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "workRequestId", "updateWorkRequestId", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "retryCount", "updateRetryCount", "(Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStateWithError", "updateStateAndIncrementRetry", "deleteById", "deleteByState", "countByState", "states", "countByStates", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadDao {
    java.lang.Object countByState(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    java.lang.Object countByStates(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    java.lang.Object deleteById(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteByState(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity>> continuation);

    java.lang.Object getById(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.data.entity.DownloadEntity> continuation);

    java.lang.Object getByState(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity>> continuation);

    java.lang.Object getByTag(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity>> continuation);

    java.lang.Object insert(com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object markCompleted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j, long j2, long j3, long j4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object markFailed(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity>> observeAll();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity> observeById(java.lang.String id);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.downloads.impl.data.entity.DownloadEntity>> observeByState(java.lang.String state);

    java.lang.Object update(com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateProgress(java.lang.String str, long j, long j2, long j3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateRetryCount(java.lang.String str, int i, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateState(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateStateAndIncrementRetry(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateStateWithError(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateWorkRequestId(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object updateState$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        java.lang.String str4 = str3;
        if ((i & 8) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return downloadDao.updateState(str, str2, str4, j, continuation);
    }

    static /* synthetic */ java.lang.Object updateProgress$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, long j, long j2, long j3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return downloadDao.updateProgress(str, j, j2, (i & 8) != 0 ? java.lang.System.currentTimeMillis() : j3, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateProgress");
    }

    static /* synthetic */ java.lang.Object markCompleted$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j, long j2, long j3, long j4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return downloadDao.markCompleted(str, str2, str3, str4, str5, j, j2, (i & 128) != 0 ? java.lang.System.currentTimeMillis() : j3, (i & 256) != 0 ? java.lang.System.currentTimeMillis() : j4, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markCompleted");
    }

    static /* synthetic */ java.lang.Object markFailed$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return downloadDao.markFailed(str, str2, str3, str4, (i & 16) != 0 ? java.lang.System.currentTimeMillis() : j, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markFailed");
    }

    static /* synthetic */ java.lang.Object updateWorkRequestId$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateWorkRequestId");
        }
        if ((i & 4) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return downloadDao.updateWorkRequestId(str, str2, j, continuation);
    }

    static /* synthetic */ java.lang.Object updateRetryCount$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, int i, long j, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRetryCount");
        }
        if ((i2 & 4) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return downloadDao.updateRetryCount(str, i, j, continuation);
    }

    static /* synthetic */ java.lang.Object updateStateWithError$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return downloadDao.updateStateWithError(str, str2, str3, str4, (i & 16) != 0 ? java.lang.System.currentTimeMillis() : j, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStateWithError");
    }

    static /* synthetic */ java.lang.Object updateStateAndIncrementRetry$default(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStateAndIncrementRetry");
        }
        if ((i & 4) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return downloadDao.updateStateAndIncrementRetry(str, str2, j, continuation);
    }
}
