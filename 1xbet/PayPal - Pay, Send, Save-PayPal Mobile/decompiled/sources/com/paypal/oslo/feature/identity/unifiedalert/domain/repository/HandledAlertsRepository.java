package com.paypal.oslo.feature.identity.unifiedalert.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "", "", "documentId", "userId", "", "expiresAtEpoch", "", "isHandled", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addHandledAlert"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HandledAlertsRepository {
    java.lang.Object addHandledAlert(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object isHandled(java.lang.String str, java.lang.String str2, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
