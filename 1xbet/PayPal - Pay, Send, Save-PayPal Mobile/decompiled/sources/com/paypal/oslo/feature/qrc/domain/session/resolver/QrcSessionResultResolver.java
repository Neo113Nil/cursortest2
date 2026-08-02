package com.paypal.oslo.feature.qrc.domain.session.resolver;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "qrcSession", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "resolve", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcSessionResultResolver {
    public static final int $stable = 0;

    @javax.inject.Inject
    public QrcSessionResultResolver() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resolve(com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>> continuation) {
        com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver$resolve$1 qrcSessionResultResolver$resolve$1;
        int i;
        com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction qrcSessionResultAction;
        if (continuation instanceof com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver$resolve$1) {
            qrcSessionResultResolver$resolve$1 = (com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver$resolve$1) continuation;
            if ((qrcSessionResultResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                qrcSessionResultResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = qrcSessionResultResolver$resolve$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qrcSessionResultResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolver actionTypeResolver = com.paypal.oslo.feature.qrc.domain.session.resolver.ActionTypeResolverKt.getActionTypeResolver(qrcSession);
                    if (actionTypeResolver == null) {
                        qrcSessionResultAction = null;
                        if (qrcSessionResultAction == null) {
                            return new arrow.core.Ior.Left(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.UnSupportedResultAction.INSTANCE);
                        }
                        if (qrcSessionResultAction instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) {
                            return new arrow.core.Ior.Right(qrcSessionResultAction);
                        }
                        if (qrcSessionResultAction instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) {
                            return new arrow.core.Ior.Left(qrcSessionResultAction);
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    qrcSessionResultResolver$resolve$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcSession);
                    qrcSessionResultResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = actionTypeResolver.resolve(qrcSession, qrcSessionResultResolver$resolve$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                qrcSessionResultAction = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction) obj;
                if (qrcSessionResultAction == null) {
                }
            }
        }
        qrcSessionResultResolver$resolve$1 = new com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver$resolve$1(this, continuation);
        java.lang.Object obj2 = qrcSessionResultResolver$resolve$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qrcSessionResultResolver$resolve$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        qrcSessionResultAction = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction) obj2;
        if (qrcSessionResultAction == null) {
        }
    }
}
