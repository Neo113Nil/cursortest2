package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004Be\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010G\u001a\u00020HH\u0096\u0001J\t\u0010I\u001a\u00020HH\u0096\u0001J\t\u0010J\u001a\u00020HH\u0096\u0001J\t\u0010K\u001a\u00020HH\u0096\u0001J\u0011\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020NH\u0096\u0001J\t\u0010O\u001a\u00020HH\u0096\u0001J\t\u0010P\u001a\u00020HH\u0096\u0001J+\u0010Q\u001a\u00020H2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U2\b\b\u0002\u0010V\u001a\u00020+H\u0096\u0001J\t\u0010W\u001a\u00020HH\u0096\u0001J\u0012\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020[H\u0002Jh\u0010\\\u001a\u00020H\"\u0004\b\u0001\u0010]2\f\u0010^\u001a\b\u0012\u0004\u0012\u0002H]0_2%\b\u0002\u0010`\u001a\u001f\u0012\u0013\u0012\u0011H]¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020H\u0018\u00010a2%\b\u0002\u0010e\u001a\u001f\u0012\u0013\u0012\u00110[¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(f\u0012\u0004\u0012\u00020H\u0018\u00010aJ\"\u0010g\u001a\b\u0012\u0004\u0012\u00020H0h2\u0006\u0010i\u001a\u00020\u001e2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020H0_J\u0006\u0010j\u001a\u00020HJ\u0014\u0010k\u001a\u00020H2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000mJ\u0011\u0010n\u001a\u00020H2\u0006\u0010o\u001a\u000202H\u0096\u0001J\t\u0010p\u001a\u00020+H\u0096\u0001J\u0011\u0010q\u001a\u00020+2\u0006\u0010r\u001a\u00020sH\u0096\u0001J\t\u0010t\u001a\u00020+H\u0096\u0001J%\u0010u\u001a\u00020H2\u0006\u0010v\u001a\u00020w2\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020H0aH\u0096\u0001J%\u0010z\u001a\u00020H2\u0006\u0010v\u001a\u00020{2\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020H0aH\u0096\u0001J\t\u0010}\u001a\u00020HH\u0096\u0001J\t\u0010~\u001a\u00020HH\u0096\u0001J\t\u0010\u007f\u001a\u00020HH\u0096\u0001J\u001f\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020Y2\u0007\u0010\u0083\u0001\u001a\u00020YH\u0096\u0001J\u0013\u0010\u0084\u0001\u001a\u00020H2\u0007\u0010v\u001a\u00030\u0085\u0001H\u0096\u0001J\n\u0010\u0086\u0001\u001a\u00020HH\u0096\u0001J\u0014\u0010\u0087\u0001\u001a\u00020H2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0096\u0001J\u0007\u0010\u008a\u0001\u001a\u00020HJ\n\u0010\u008b\u0001\u001a\u00020HH\u0096\u0001J\u0018\u0010\u008c\u0001\u001a\u00020H2\r\u0010\u0007\u001a\t\u0012\u0004\u0012\u00020\u00020\u008d\u0001H\u0016J!\u0010\u008c\u0001\u001a\u00020H2\r\u0010\u0007\u001a\t\u0012\u0004\u0012\u00020\u00020\u008d\u00012\u0006\u0010!\u001a\u00020\"H\u0096\u0001J=\u0010\u008c\u0001\u001a\u00020H\"\u0005\b\u0001\u0010\u008e\u00012\r\u0010\u0005\u001a\t\u0012\u0005\u0012\u0003H\u008e\u00010\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u000b\u0012\t\u0012\u0005\u0012\u0003H\u008e\u00010\u00000\bj\t\u0012\u0005\u0012\u0003H\u008e\u0001`\tJ\u0007\u0010\u008f\u0001\u001a\u00020HJ\u0016\u0010\u0090\u0001\u001a\u00020H2\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0096\u0001J\n\u0010\u0093\u0001\u001a\u00020HH\u0096\u0001J\n\u0010\u0094\u0001\u001a\u00020HH\u0096\u0001R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0012\u0010*\u001a\u00020+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010,R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u000202X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0012\u00105\u001a\u000206X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0012\u00109\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0012\u0010;\u001a\u00020<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u00020@X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0012\u0010C\u001a\u00020DX\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006\u0095\u0001"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "Data", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionFlowHandler;", "Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionHandler;", "dataProvider", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionFlow;", "parent", "transaction", "jobManager", "Lcom/discover/mpos/sdk/core/concurent/JobManager;", "executionHandler", "flowHandler", "(Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;Lcom/discover/mpos/sdk/flow/ExecutionFlow;Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;Lcom/discover/mpos/sdk/core/concurent/JobManager;Lcom/discover/mpos/sdk/transaction/internal/TransactionExecutionHandler;Lcom/discover/mpos/sdk/transaction/execution/TransactionFlowHandler;)V", "additionalData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getAdditionalData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "card", "Lcom/discover/mpos/sdk/card/Card;", "getCard", "()Lcom/discover/mpos/sdk/card/Card;", "config", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "getConfig", "()Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "executionTime", "", "getExecutionTime", "()J", "handler", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "getHandler", "()Lcom/discover/mpos/sdk/transaction/internal/InternalTransactionHandler;", "inputData", "getInputData", "()Ljava/lang/Object;", "inputData$delegate", "Lkotlin/Lazy;", "isCancelled", "", "()Z", "parameterP1", "", "getParameterP1", "()I", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "getProcessingData", "()Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "readerTime", "getReaderTime", "tearingRecoveryStorage", "Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "getTearingRecoveryStorage", "()Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "getTransactionData", "()Lcom/discover/mpos/sdk/transaction/TransactionData;", "unpredictableNumberGenerator", "Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "getUnpredictableNumberGenerator", "()Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "approve", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "clear", "clearTearingRecoveryStorage", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "decline", "deferredAuthorization", "endApplication", "status", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEndStatus;", "messageIdentifier", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest$MessageIdentifier;", "isDataRecordPresent", "endPostReadRecordBenchmark", "errorLogMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "executeAsync", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "task", "Lkotlin/Function0;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "r", "error", "t", "executeDelayed", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "executeNextStep", "executeStep", "step", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "fillPdolData", "transactionPdolData", "isEmpty", "isTearingRecoveryLogValidForRetrieval", "newData", "Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "isTearingRecoveryPossible", "onDataStorageProcessingRequest", "request", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageRequest;", "response", "Lcom/discover/mpos/sdk/data/external/readdatarecord/DataStorageResponse;", "onExtendedLoggingDataProcessingRequest", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataResponse;", "onlineRequest", "performTearingAnalysis", "releaseJobManager", "requestCAPublicKey", "Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "rid", "iccPKIndex", "requestUI", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "resetPostReadRecordBenchmark", "saveTransactionDetails", "tearingLogTransactionDetails", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "startPostReadRecordBenchmark", "startProcessingFlow", "Lcom/discover/mpos/sdk/transaction/execution/LinearTransactionExecutionFlow;", "T", "terminate", "tryAgain", "tryAgainOutcomeType", "Lcom/discover/mpos/sdk/transaction/outcome/TryAgainOutcomeType;", "tryAnotherInterface", "tryAnotherInterfaceOrDecline", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.g, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TransactionEx<Data> implements com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler, com.discover.mpos.sdk.transaction.internal.InternalTransaction, com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler {

    /* renamed from: a, reason: collision with root package name */
    final com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<Data> f3236a;
    private final kotlin.Lazy b;
    private final com.discover.mpos.sdk.flow.ExecutionFlow<com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> c;
    private final com.discover.mpos.sdk.transaction.execution.TransactionEx<?> d;
    private final com.discover.mpos.sdk.transaction.internal.InternalTransaction e;
    private final com.discover.mpos.sdk.core.concurent.JobManager f;
    private final com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler g;
    private final com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler h;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Data", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.g$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
        final /* synthetic */ kotlin.jvm.functions.Function1 b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            java.lang.String joinToString$default;
            java.lang.Throwable th2 = th;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th2, "");
            if (th2 instanceof com.discover.mpos.sdk.exceptions.InternalException) {
                joinToString$default = th2.getMessage();
            } else {
                java.lang.Throwable cause = th2.getCause();
                if (cause == null) {
                    cause = th2;
                }
                joinToString$default = kotlin.collections.ArraysKt.joinToString$default(cause.getStackTrace(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
            }
            new java.lang.Object[]{joinToString$default};
            if (!(th2 instanceof com.discover.mpos.sdk.core.concurent.exception.JobResultProcessingException)) {
                kotlin.jvm.functions.Function1 function1 = this.b;
                if (function1 != null) {
                    function1.invoke(th2);
                } else {
                    com.discover.mpos.sdk.transaction.execution.TransactionEx.this.a(com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType.REGULAR);
                }
            } else if (!(th2.getCause() instanceof java.util.concurrent.CancellationException)) {
                com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(com.discover.mpos.sdk.transaction.execution.TransactionEx.this, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.functions.Function1 function1) {
            super(1);
            this.b = function1;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "Data", "it", "invoke", "(Lkotlin/Unit;)V", "com/discover/mpos/sdk/transaction/execution/TransactionEx$executeDelayed$1$2"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.g$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.functions.Function0 f3238a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.f3238a.invoke();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.functions.Function0 function0) {
            super(1);
            this.f3238a = function0;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Data", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.g$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.execution.TransactionEx.c f3239a = new com.discover.mpos.sdk.transaction.execution.TransactionEx.c();

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            return kotlin.Unit.INSTANCE;
        }

        c() {
            super(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TransactionEx(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<Data> transactionExecutionDataProvider, com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.transaction.execution.TransactionEx<Data>> executionFlow, com.discover.mpos.sdk.transaction.execution.TransactionEx<?> transactionEx, com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.core.concurent.JobManager jobManager, com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler transactionExecutionHandler, com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler transactionFlowHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionFlowHandler, "");
        this.f3236a = transactionExecutionDataProvider;
        this.c = executionFlow;
        this.d = transactionEx;
        this.e = internalTransaction;
        this.f = jobManager;
        this.g = transactionExecutionHandler;
        this.h = transactionFlowHandler;
        this.b = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.transaction.execution.TransactionEx.d());
    }

    public /* synthetic */ TransactionEx(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider transactionExecutionDataProvider, com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction, com.discover.mpos.sdk.core.concurent.JobManager jobManager, com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler transactionExecutionHandler) {
        this(transactionExecutionDataProvider, executionFlow, null, internalTransaction, jobManager, transactionExecutionHandler, new com.discover.mpos.sdk.transaction.execution.TransactionExecutionFlowHandler(internalTransaction, transactionExecutionHandler));
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Data", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.g$d */
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<Data> {
        @Override // kotlin.jvm.functions.Function0
        public final Data invoke() {
            return com.discover.mpos.sdk.transaction.execution.TransactionEx.this.f3236a.a(com.discover.mpos.sdk.transaction.execution.TransactionEx.this);
        }

        d() {
            super(0);
        }
    }

    public final <T> void a(com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<T> transactionExecutionDataProvider, com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.transaction.execution.TransactionEx<T>> executionFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutionDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        com.discover.mpos.sdk.core.concurent.JobManager jobManager = this.f;
        new com.discover.mpos.sdk.transaction.execution.TransactionEx(transactionExecutionDataProvider, executionFlow, this, this.e, jobManager, this.g, this.h).r();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTransactionExecutionFlow, "");
        a(new com.discover.mpos.sdk.transaction.execution.TransactionProvider(), linearTransactionExecutionFlow);
    }

    public final void r() {
        if (this.e.l()) {
            return;
        }
        this.c.a(this);
    }

    public final void s() {
        this.c.a();
        com.discover.mpos.sdk.transaction.execution.TransactionEx<?> transactionEx = this.d;
        if (transactionEx != null) {
            transactionEx.t();
        }
    }

    public final void t() {
        if (this.e.l()) {
            return;
        }
        if (this.c.b()) {
            s();
        } else {
            this.c.b(this);
        }
    }

    public final com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> a(long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.discover.mpos.sdk.core.concurent.DiscoverJob<kotlin.Unit> job = this.f.getJob(j);
        com.discover.mpos.sdk.core.concurent.DiscoverJob.DefaultImpls.execute$default(job, com.discover.mpos.sdk.transaction.execution.TransactionEx.c.f3239a, new com.discover.mpos.sdk.transaction.execution.TransactionEx.b(function0), null, 4, null);
        return job;
    }

    public static /* synthetic */ void a(com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        transactionEx.a(function0, function1, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) null);
    }

    public final <R> void a(kotlin.jvm.functions.Function0<? extends R> function0, kotlin.jvm.functions.Function1<? super R, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.discover.mpos.sdk.core.concurent.JobManager.DefaultImpls.getJob$default(this.f, 0L, 1, null).execute(function0, function1, new com.discover.mpos.sdk.transaction.execution.TransactionEx.a(function12));
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void z() {
        this.h.z();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void y() {
        this.h.y();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void x() {
        this.h.x();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void w() {
        this.h.w();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void v() {
        this.h.v();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void u() {
        this.h.u();
    }

    public final Data q() {
        return (Data) this.b.getValue();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void p() {
        this.e.p();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final boolean o() {
        return this.e.o();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final com.discover.mpos.sdk.data.TearingRecoveryStorage n() {
        return this.e.n();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final com.discover.mpos.sdk.security.unpredictablenumber.UnpredictableNumberGenerator m() {
        return this.e.m();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final boolean l() {
        return this.e.l();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler k() {
        return this.e.k();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final com.discover.mpos.sdk.transaction.processing.ProcessingData j() {
        return this.e.j();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final com.discover.mpos.sdk.card.Card i() {
        return this.e.i();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void h() {
        this.e.h();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final com.discover.mpos.sdk.transaction.TransactionData getTransactionData() {
        return this.e.getTransactionData();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final long getReaderTime() {
        return this.e.getReaderTime();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final long getExecutionTime() {
        return this.e.getExecutionTime();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration getConfig() {
        return this.e.getConfig();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void g() {
        this.e.g();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void f() {
        this.e.f();
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void e() {
        this.e.e();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean d() {
        return this.e.d();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.e.clear();
    }

    @Override // com.discover.mpos.sdk.transaction.Transaction
    public final void cancel() {
        this.e.cancel();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c() {
        return this.e.c();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolData b() {
        return this.e.b();
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final boolean a(com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData tearingRecoveryLogMatchingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingRecoveryLogMatchingData, "");
        return this.e.a(tearingRecoveryLogMatchingData);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolData, "");
        this.e.a(pdolData);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiRequest, "");
        this.g.a(uiRequest);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType tryAgainOutcomeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tryAgainOutcomeType, "");
        this.h.a(tryAgainOutcomeType);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final void a(com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionOutcome, "");
        this.g.a(transactionOutcome);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.InternalTransaction
    public final void a(com.discover.mpos.sdk.transaction.execution.LinearTransactionExecutionFlow<com.discover.mpos.sdk.transaction.internal.InternalTransaction> linearTransactionExecutionFlow, com.discover.mpos.sdk.transaction.internal.InternalTransactionHandler internalTransactionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearTransactionExecutionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTransactionHandler, "");
        this.e.a(linearTransactionExecutionFlow, internalTransactionHandler);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final void a(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tearingLogTransactionDetails, "");
        this.e.a(tearingLogTransactionDetails);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void a(int i, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier messageIdentifier, boolean z) {
        this.h.a(i, messageIdentifier, z);
    }

    @Override // com.discover.mpos.sdk.transaction.internal.TransactionExecutionHandler
    public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return this.g.a(str, str2);
    }

    @Override // com.discover.mpos.sdk.data.TearingRecoveryStorage
    public final int a() {
        return this.e.a();
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler
    public final void A() {
        this.h.A();
    }
}
