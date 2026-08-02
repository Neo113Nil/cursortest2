package com.paypal.oslo.feature.qrc.domain.session.resolver;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/resolver/ValidationErrorActionTypeResolver;", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/ActionTypeResolver;", "<init>", "()V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "qrcSession", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction;", "resolve", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ValidationErrorActionTypeResolver implements com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolver {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolver
    public final java.lang.Object resolve(com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction> continuation) {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason errorReason;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction requiredAction = qrcSession.getRequiredAction();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction errorAction = requiredAction instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction ? (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction.ErrorAction) requiredAction : null;
        return new com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.ValidationError((errorAction == null || (errorReason = errorAction.getErrorReason()) == null) ? null : errorReason.name(), errorAction != null ? errorAction.getIssue() : null);
    }
}
