package com.paypal.oslo.feature.identity.unifiedalert.domain;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH¦@¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u0018\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/TriggerAction;", "onTriggerReceived", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alert", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "onFetchCompleted", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onFetchAborted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "documentId", "userId", "", "expiresAtEpoch", "markHandled", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFlowCompleted", "", "isAlertPresenting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AlertDeduplicationManager {
    java.lang.Object isAlertPresenting(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object markHandled(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object onFetchAborted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object onFetchCompleted(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction> continuation);

    java.lang.Object onFlowCompleted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object onTriggerReceived(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction> continuation);
}
