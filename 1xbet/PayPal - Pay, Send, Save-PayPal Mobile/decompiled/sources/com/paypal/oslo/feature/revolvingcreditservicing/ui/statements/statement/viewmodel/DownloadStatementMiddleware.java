package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/DownloadStatementMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;", "downloadStatementUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState$Downloading;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState$Downloading;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/statements/DownloadStatementUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DownloadStatementMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DownloadStatementMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadStatementUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = downloadStatementUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState statementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(statementState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState statementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(statementState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState.Downloading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState.Downloading) statementState, function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState.Downloading downloading, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware$downloadStatement$1 downloadStatementMiddleware$downloadStatement$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware$downloadStatement$1) {
            downloadStatementMiddleware$downloadStatement$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware$downloadStatement$1) continuation;
            if ((downloadStatementMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                downloadStatementMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = downloadStatementMiddleware$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadStatementMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.DownloadStatementRequest downloadStatementRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.DownloadStatementRequest(downloading.getArgs().getAccountId(), downloading.getArgs().getStatementId());
                    downloadStatementMiddleware$downloadStatement$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloading);
                    downloadStatementMiddleware$downloadStatement$1.getHighSpeedVideoSizes = function1;
                    downloadStatementMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = downloadStatementUseCase.invoke(downloadStatementRequest, downloadStatementMiddleware$downloadStatement$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) downloadStatementMiddleware$downloadStatement$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadSuccess((java.lang.String) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnDownloadFailure.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        downloadStatementMiddleware$downloadStatement$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware$downloadStatement$1(this, continuation);
        java.lang.Object obj2 = downloadStatementMiddleware$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadStatementMiddleware$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
