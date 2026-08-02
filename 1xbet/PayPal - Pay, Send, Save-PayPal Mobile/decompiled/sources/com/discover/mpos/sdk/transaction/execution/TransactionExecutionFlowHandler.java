package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J$\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionFlowHandler;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionFlowHandler;", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "handler", "Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionHandler;", "outcomeFactory", "Lcom/discover/mpos/sdk/transaction/execution/OutcomeFactory;", "(Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionHandler;Lcom/discover/mpos/sdk/transaction/execution/OutcomeFactory;)V", "approve", "", "checkTransactionOnlineProcessingCapability", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "debugTag", "", "decline", "deferredAuthorization", "endApplication", "status", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEndStatus;", "messageIdentifier", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest$MessageIdentifier;", "isDataRecordPresent", "", "isAnotherInterfaceSupported", "onlineRequest", "performTearingAnalysis", "sendTryAnotherInterfaceOutcome", "tryAgain", "tryAgainOutcomeType", "Lcom/discover/mpos/sdk/transaction/outcome/TryAgainOutcomeType;", "tryAnotherInterface", "tryAnotherInterfaceOrDecline", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.i, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionExecutionFlowHandler implements com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.transaction.internal.InternalTransaction f3241a;
    private final com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler b;
    private final com.discover.mpos.sdk.transaction.execution.OutcomeFactory c;

    private TransactionExecutionFlowHandler(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler transactionExecutionHandler, com.discover.mpos.sdk.transaction.execution.OutcomeFactory outcomeFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeFactory, "");
        this.f3241a = internalTransaction;
        this.b = transactionExecutionHandler;
        this.c = outcomeFactory;
    }

    public /* synthetic */ TransactionExecutionFlowHandler(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler transactionExecutionHandler) {
        this(internalTransaction, transactionExecutionHandler, new com.discover.mpos.sdk.transaction.execution.OutcomeFactory(internalTransaction));
    }

    private final void a(com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
        if (this.f3241a.l()) {
            return;
        }
        this.b.a(transactionOutcome);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void v() {
        com.discover.mpos.sdk.transaction.execution.OutcomeFactory outcomeFactory = this.c;
        com.discover.mpos.sdk.transaction.outcome.EntryPointStart entryPointStart = null;
        com.discover.mpos.sdk.transaction.outcome.OnlineResponseData onlineResponseData = null;
        com.discover.mpos.sdk.transaction.outcome.CardholderVerificationMethod cardholderVerificationMethod = null;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = null;
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType.DECLINED, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(entryPointStart, onlineResponseData, cardholderVerificationMethod, outcomeFactory.a(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.NOT_AUTHORISED), uiRequest, outcomeFactory.b().append(outcomeFactory.f3232a.b(com.discover.mpos.sdk.core.emv.tlv.Tag.PAYMENT_ACCOUNT_REFERENCE.getTag())).append(outcomeFactory.a()).build(), outcomeFactory.f3232a.r(), null, null, null, 0L, outcomeFactory.e(), 1943, null)));
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void u() {
        com.discover.mpos.sdk.transaction.execution.OutcomeFactory outcomeFactory = this.c;
        com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType = com.discover.mpos.sdk.transaction.outcome.OutcomeType.APPROVED;
        com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters = outcomeFactory.f3232a.f;
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(outcomeType, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, outcomeParameters != null ? outcomeParameters.getCardholderVerificationMethod() : null, outcomeFactory.a(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.APPROVED), null, new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(outcomeFactory.b()).append(outcomeFactory.c()).append(outcomeFactory.d()).append(outcomeFactory.a()).build(), outcomeFactory.f3232a.r(), null, null, null, 0L, outcomeFactory.e(), 1939, null)));
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void x() {
        com.discover.mpos.sdk.transaction.execution.OutcomeFactory outcomeFactory = this.c;
        com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType = com.discover.mpos.sdk.transaction.outcome.OutcomeType.ONLINE_REQUEST;
        com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters = outcomeFactory.f3232a.f;
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(outcomeType, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, outcomeParameters != null ? outcomeParameters.getCardholderVerificationMethod() : null, outcomeFactory.a(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.AUTHORISING_PLEASE_WAIT), null, new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(outcomeFactory.b()).append(outcomeFactory.c()).append(outcomeFactory.d()).append(outcomeFactory.a()).build(), outcomeFactory.f3232a.r(), null, null, null, 0L, outcomeFactory.e(), 1939, null)));
    }

    private final boolean a() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.f3241a.j().n().getTerminalTransactionQualifiers();
        if (terminalTransactionQualifiers == null) {
            return true;
        }
        new java.lang.Object[]{java.lang.Boolean.valueOf(terminalTransactionQualifiers.getIsEmvCcSupported())};
        new java.lang.Object[]{java.lang.Boolean.valueOf(terminalTransactionQualifiers.getIsMsModeSupported())};
        return terminalTransactionQualifiers.getIsEmvCcSupported() || terminalTransactionQualifiers.getIsMsModeSupported();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void z() {
        if (a()) {
            b();
        } else {
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
        }
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void A() {
        if (a()) {
            b();
        } else {
            v();
        }
    }

    private final void b() {
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = null;
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType.TRY_ANOTHER_INTERFACE, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, null, new com.discover.mpos.sdk.transaction.outcome.UiRequest(com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.PLEASE_INSERT_OR_SWIPE_CARD, com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.READY_TO_READ, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), uiRequest, new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(this.c.a()).build(), this.c.f3232a.r(), com.discover.mpos.sdk.transaction.outcome.AlternateInterface.CONTACT_CHIP_OR_MAG_STRIPE, null, null, 0L, this.c.e(), 1815, null)));
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType tryAgainOutcomeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tryAgainOutcomeType, "");
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType.TRY_AGAIN, tryAgainOutcomeType.outcomeParameters()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier messageIdentifier, boolean z) {
        com.discover.mpos.sdk.transaction.outcome.UiRequest.Status status;
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append;
        com.discover.mpos.sdk.transaction.outcome.UiRequest.Status status2;
        com.discover.mpos.sdk.transaction.execution.OutcomeFactory outcomeFactory = this.c;
        com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType = com.discover.mpos.sdk.transaction.outcome.OutcomeType.END_APPLICATION;
        if (i != 0) {
            int i2 = com.discover.mpos.sdk.transaction.execution.d.f3233a[i - 1];
            if (i2 == 1) {
                status2 = com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.NOT_READY;
            } else if (i2 == 2) {
                status2 = com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.READY_TO_READ;
            } else if (i2 == 3) {
                status2 = com.discover.mpos.sdk.transaction.outcome.UiRequest.Status.PROCESSING_ERROR;
            }
            status = status2;
            com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = new com.discover.mpos.sdk.transaction.outcome.UiRequest(messageIdentifier, status, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            if (!z) {
                append = outcomeFactory.b().append(outcomeFactory.a());
            } else {
                append = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(outcomeFactory.a());
            }
            a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(outcomeType, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, null, uiRequest, null, append.build(), i != com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b ? outcomeFactory.f3232a.r() : null, null, null, null, 0L, outcomeFactory.e(), 1943, null)));
        }
        status = null;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2 = new com.discover.mpos.sdk.transaction.outcome.UiRequest(messageIdentifier, status, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        if (!z) {
        }
        a(new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(outcomeType, new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters(null, null, null, uiRequest2, null, append.build(), i != com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b ? outcomeFactory.f3232a.r() : null, null, null, null, 0L, outcomeFactory.e(), 1943, null)));
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void y() {
        if (this.f3241a.o()) {
            a(com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType.TEARING_RECOVERY);
        } else {
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(this, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.INSERT_SWIPE_OR_TRY_ANOTHER_CARD, false, 4);
        }
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void w() {
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = this.f3241a.j().h.c;
        java.lang.Boolean valueOf = candidate != null ? java.lang.Boolean.valueOf(candidate.getDeferredAuthorizationSupported()) : null;
        new java.lang.Object[]{valueOf};
        if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.TRUE)) {
            A();
            return;
        }
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = this.f3241a.j();
        new java.lang.Object[]{java.lang.Boolean.valueOf(j.m().getIsReaderOfflineOnly())};
        if (j.m().getIsReaderOfflineOnly()) {
            new java.lang.Object[]{java.lang.Boolean.valueOf(j.j().d())};
            if (j.j().d()) {
                A();
                return;
            } else {
                v();
                return;
            }
        }
        x();
    }
}
