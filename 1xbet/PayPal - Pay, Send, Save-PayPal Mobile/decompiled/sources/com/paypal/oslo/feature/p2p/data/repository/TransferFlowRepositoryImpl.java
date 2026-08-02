package com.paypal.oslo.feature.p2p.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\n0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\tH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\tH\u0016¢\u0006\u0004\b+\u0010\u000eJ)\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020.0\n0\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J;\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002050\n0\t2\u0006\u00101\u001a\u00020\u00142\u0006\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b6\u00107J9\u0010<\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010;0\n0\t2\u0006\u00108\u001a\u00020\u00142\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001409H\u0016¢\u0006\u0004\b<\u0010=J4\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020B0A2\u0006\u00101\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u00142\u0006\u0010@\u001a\u00020?H\u0096@¢\u0006\u0004\bC\u0010DJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020B0A2\b\u0010\u001e\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\b\"\u0010FJ1\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n0\t2\u0006\u00108\u001a\u00020\u00142\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020;0\n0\t2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010UR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020*0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010U"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/TransferFlowRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/p2p/data/mapper/TransferFlowMappers;", "mappers", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/p2p/data/mapper/TransferFlowMappers;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;", "startTransferAttempt", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;", "updatePaymentReceiverInput", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updatePaymentTransferAttemptReceiver", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;)Lkotlinx/coroutines/flow/Flow;", "", "id", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "fxQuoteId", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateAmountAndIntentResult;", "updatePaymentTransferAttemptAmountAndIntent", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "getPaymentTransferAttempt", "attempt", "", "setPaymentTransferAttempt", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;)V", "", "isAmountAndIntentUpdateInitiated", "Lcom/paypal/oslo/feature/p2p/domain/model/Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "updatePaymentTransferAttemptNote", "(Lcom/paypal/oslo/feature/p2p/domain/model/Note;)Lkotlinx/coroutines/flow/Flow;", "attemptId", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_TYPE, "shippingAddressId", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "updatePaymentTransferType", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "", "preferredFundingInstrumentIds", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "addFinancialInstrumentsToPaymentTransferAttempt", "(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "provider", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateConversionProviderResult;", "updateCurrencyConversionProvider", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData;", "resolutionData", "resolvePaymentContingency", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData;)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;", "input", "resolvePlanContingency", "(Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/TransferFlowMappers;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransferFlowRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers Camera2StreamConfigurationMap;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TransferFlowRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowMappers, "");
        this.getHighSpeedVideoSizes = lazy;
        this.Camera2StreamConfigurationMap = transferFlowMappers;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt>> startTransferAttempt() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$startTransferAttempt$1(this, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>> updatePaymentTransferAttemptReceiver(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput updatePaymentReceiverInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentReceiverInput, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptReceiver$1(updatePaymentReceiverInput, this, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult>> updatePaymentTransferAttemptAmountAndIntent(java.lang.String id, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent, java.lang.String fxQuoteId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1(this, intent, id, amount, fxQuoteId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0137 A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0188 A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fb A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0240 A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248 A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0250 A[Catch: all -> 0x0069, RaiseCancellationException -> 0x006c, TryCatch #3 {RaiseCancellationException -> 0x006c, all -> 0x0069, blocks: (B:11:0x0062, B:13:0x012d, B:16:0x0137, B:17:0x0178, B:19:0x0188, B:21:0x01a7, B:22:0x01ad, B:24:0x01b7, B:26:0x01bd, B:28:0x01c3, B:30:0x01cb, B:32:0x01d1, B:34:0x01d9, B:36:0x01df, B:40:0x01ed, B:42:0x01f5, B:44:0x01fb, B:45:0x0211, B:47:0x0240, B:50:0x0248, B:52:0x01f0, B:55:0x0250, B:56:0x025f, B:61:0x0155, B:62:0x0172, B:63:0x0177), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$executeUpdateAmountAndIntent$1 transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent2;
        arrow.core.raise.IorRaise iorRaise2;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.Data data;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption> allowedOptions;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption allowedOption;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource> fundingSources;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource fundingSource;
        com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent3 = paymentTransferIntent;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$executeUpdateAmountAndIntent$1) {
            transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1 = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$executeUpdateAmountAndIntent$1) continuation;
            if ((transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedFor & Integer.MIN_VALUE) != 0) {
                transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedFor -= 2147483648;
                java.lang.Object obj2 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.m17175$r8$lambda$hp8aDnzHmu1_sZSjp4UWwC8cNg((com.paypal.oslo.feature.p2p.domain.error.TransferError) obj3, (com.paypal.oslo.feature.p2p.domain.error.TransferError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(amount.getCurrencyCode(), amount.getAmount());
                        if (paymentTransferIntent3 == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND) {
                            paymentTransferIntent2 = com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.SEND;
                        } else {
                            paymentTransferIntent2 = com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.REQUEST;
                        }
                        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptAmountAndIntentInput updatePaymentTransferAttemptAmountAndIntentInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptAmountAndIntentInput(str, moneyInput, null, paymentTransferIntent2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2), 4, null);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation updatePaymentTransferAttemptAmountAndIntentMutation = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation(updatePaymentTransferAttemptAmountAndIntentInput);
                        com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptAmountAndIntent = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getUpdatePaymentTransferAttemptAmountAndIntent();
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getInputSizeshNQ4ISI = paymentTransferIntent3;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputSizeshNQ4ISI = function2;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputSizes = atomicReference;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputMinFrameDurationlomOqCM = defaultRaise;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputStallDurationlomOqCM = iorRaise;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePaymentTransferAttemptAmountAndIntentInput);
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputMinFrameDuration = iorRaise;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.Camera2StreamConfigurationMap = 0;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoSizes = 0;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoFpsRanges = 0;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoFpsRangesFor = 0;
                        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedFor = 1;
                        java.lang.Object executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, updatePaymentTransferAttemptAmountAndIntentMutation, updatePaymentTransferAttemptAmountAndIntent, transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1);
                        if (executeMutation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = executeMutation;
                        iorRaise2 = iorRaise;
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoFpsRanges;
                    int i4 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighSpeedVideoSizes;
                    int i5 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.Camera2StreamConfigurationMap;
                    arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputMinFrameDuration;
                    iorRaise2 = (arrow.core.raise.IorRaise) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputStallDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputMinFrameDurationlomOqCM;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputSizes;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent4 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        iorRaise = iorRaise3;
                        paymentTransferIntent3 = paymentTransferIntent4;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        function2 = function22;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_ERROR_GRAPHQL);
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (both instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_ERROR_GRAPHQL);
                        both = new arrow.core.Ior.Both(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE, ((arrow.core.Ior.Both) both).getRightValue());
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                arrow.core.raise.IorRaise iorRaise4 = iorRaise2;
                data = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.Data) graphQLData.getData();
                if (data != null) {
                    com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE;
                    com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logNoDataError(graphQLData, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_ERROR_NO_DATA);
                    iorRaise4.raise(dataNotFound);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.PaymentTransferAttempt paymentTransferAttempt = data.getUpdatePaymentTransferAttemptAmountAndIntent().getPaymentTransferAttempt();
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt mapPaymentTransferAttempt = this.Camera2StreamConfigurationMap.getAmountAndIntentMapper().mapPaymentTransferAttempt(iorRaise4, paymentTransferAttempt);
                com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper fundingOptionsMapper = this.Camera2StreamConfigurationMap.getFundingOptionsMapper();
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
                com.paypal.oslo.feature.p2p.domain.model.FundingOptions map = fundingOptionsMapper.map(fundingOptions != null ? fundingOptions.getP2PFundingOptionsFragment() : null);
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.FundingOptions fundingOptions2 = paymentTransferAttempt.getFundingOptions();
                if (fundingOptions2 != null && (p2PFundingOptionsFragment = fundingOptions2.getP2PFundingOptionsFragment()) != null && (allowedOptions = p2PFundingOptionsFragment.getAllowedOptions()) != null && (allowedOption = (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) allowedOptions)) != null && (fundingSources = allowedOption.getFundingSources()) != null && (fundingSource = (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingSources)) != null && (currencyConversionProvider = fundingSource.getCurrencyConversionProvider()) != null) {
                    int i7 = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[currencyConversionProvider.ordinal()];
                    if (i7 == 1) {
                        conversionProvider2 = com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.PAYPAL;
                    } else if (i7 == 2) {
                        conversionProvider2 = com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.ISSUER;
                    }
                    conversionProvider = conversionProvider2;
                    com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.FxQuote fxQuote = paymentTransferAttempt.getFxQuote();
                    com.paypal.oslo.feature.p2p.domain.model.FxQuote copy$default = fxQuote != null ? com.paypal.oslo.feature.p2p.domain.model.FxQuote.copy$default(this.Camera2StreamConfigurationMap.getAmountAndIntentFxQuoteMapper().map(fxQuote), null, null, null, null, conversionProvider, 15, null) : null;
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(mapPaymentTransferAttempt);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", paymentTransferIntent3.toString())), null, 4, null);
                    com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult updateAmountAndIntentResult = new com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult(mapPaymentTransferAttempt, map, copy$default);
                    defaultRaise2.complete();
                    arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj3 = atomicReference2.get();
                    return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(updateAmountAndIntentResult) : new arrow.core.Ior.Both(obj3, updateAmountAndIntentResult);
                }
                conversionProvider = null;
                com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.FxQuote fxQuote2 = paymentTransferAttempt.getFxQuote();
                if (fxQuote2 != null) {
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(mapPaymentTransferAttempt);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", paymentTransferIntent3.toString())), null, 4, null);
                com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult updateAmountAndIntentResult2 = new com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult(mapPaymentTransferAttempt, map, copy$default);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj32 = atomicReference2.get();
                if (obj32 != arrow.core.EmptyValue.INSTANCE) {
                }
            }
        }
        transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$executeUpdateAmountAndIntent$1(this, continuation);
        java.lang.Object obj22 = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transferFlowRepositoryImpl$executeUpdateAmountAndIntent$1.isOutputSupportedFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        arrow.core.raise.IorRaise iorRaise42 = iorRaise2;
        data = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptAmountAndIntentMutation.Data) graphQLData2.getData();
        if (data != null) {
        }
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> getPaymentTransferAttempt() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final void setPaymentTransferAttempt(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt attempt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attempt, "");
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.TRUE);
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(attempt);
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isAmountAndIntentUpdateInitiated() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>> updatePaymentTransferAttemptNote(com.paypal.oslo.feature.p2p.domain.model.Note note) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(note, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptNote$1(note, this, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult>> updatePaymentTransferType(java.lang.String attemptId, com.paypal.oslo.feature.p2p.domain.model.PaymentType transferType, java.lang.String shippingAddressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferType, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferType$1(transferType, attemptId, shippingAddressId, this, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.FundingOptions>> addFinancialInstrumentsToPaymentTransferAttempt(java.lang.String transferAttemptId, java.util.List<java.lang.String> preferredFundingInstrumentIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredFundingInstrumentIds, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$addFinancialInstrumentsToPaymentTransferAttempt$1(transferAttemptId, preferredFundingInstrumentIds, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCurrencyConversionProvider(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updateCurrencyConversionProvider$1 transferFlowRepositoryImpl$updateCurrencyConversionProvider$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider;
        com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption2;
        arrow.core.Ior ior;
        java.lang.String str3 = str;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updateCurrencyConversionProvider$1) {
            transferFlowRepositoryImpl$updateCurrencyConversionProvider$1 = (com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updateCurrencyConversionProvider$1) continuation;
            if ((transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_CONVERSION_PROVIDER_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, str2), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, conversionOption.name())), null, 4, null);
                    int i2 = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[conversionOption.ordinal()];
                    if (i2 == 1) {
                        currencyConversionProvider = com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.PAYPAL;
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        currencyConversionProvider = com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.ISSUER;
                    }
                    com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput(str3, str2, currencyConversionProvider);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation updatePaymentTransferAttemptCurrencyConversionProviderMutation = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation(updatePaymentTransferAttemptCurrencyConversionProviderInput);
                    com.paypal.oslo.core.network.graphql.RiskSourceId updatePaymentTransferAttemptCurrencyConversion = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getUpdatePaymentTransferAttemptCurrencyConversion();
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighSpeedVideoFpsRanges = str3;
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    conversionOption2 = conversionOption;
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighSpeedVideoSizes = conversionOption2;
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConversionProvider);
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePaymentTransferAttemptCurrencyConversionProviderInput);
                    transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, updatePaymentTransferAttemptCurrencyConversionProviderMutation, updatePaymentTransferAttemptCurrencyConversion, transferFlowRepositoryImpl$updateCurrencyConversionProvider$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption3 = (com.paypal.oslo.feature.p2p.domain.model.ConversionOption) transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighSpeedVideoSizes;
                    java.lang.String str4 = (java.lang.String) transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    conversionOption2 = conversionOption3;
                    str3 = str4;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.logCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue(), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_CONVERSION_PROVIDER_ERROR_NETWORK, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_CONVERSION_PROVIDER_ERROR_DATA);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_CONVERSION_PROVIDER_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, conversionOption2.name())), null, 4, null);
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data) graphQLData.getData());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_CONVERSION_PROVIDER_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, conversionOption2.name())), null, 4, null);
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data) graphQLData2.getData());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        transferFlowRepositoryImpl$updateCurrencyConversionProvider$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updateCurrencyConversionProvider$1(this, continuation);
        java.lang.Object obj2 = transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transferFlowRepositoryImpl$updateCurrencyConversionProvider$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data p0) {
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment;
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions map;
        if (p0 == null || (updatePaymentTransferAttemptCurrencyConversionProvider = p0.getUpdatePaymentTransferAttemptCurrencyConversionProvider()) == null || (paymentTransferAttempt = updatePaymentTransferAttemptCurrencyConversionProvider.getPaymentTransferAttempt()) == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE);
        }
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
        if (fundingOptions == null || (p2PFundingOptionsFragment = fundingOptions.getP2PFundingOptionsFragment()) == null || (map = this.Camera2StreamConfigurationMap.getFundingOptionsMapper().map(p2PFundingOptionsFragment)) == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE);
        }
        if (map.getAllowedOptions().isEmpty()) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound.INSTANCE);
        }
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote = paymentTransferAttempt.getFxQuote();
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult(map, fxQuote != null ? this.Camera2StreamConfigurationMap.getConversionProviderFxQuoteMapper().map(fxQuote) : null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>> resolvePaymentContingency(java.lang.String transferAttemptId, com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData resolutionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolutionData, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePaymentContingency$1(resolutionData, transferAttemptId, this, null));
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.FundingOptions>> resolvePlanContingency(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$resolvePlanContingency$1(input, this, null));
    }

    /* renamed from: $r8$lambda$hp8aDnzHmu1_sZSjp4UWwC8cN-g, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError m17175$r8$lambda$hp8aDnzHmu1_sZSjp4UWwC8cNg(com.paypal.oslo.feature.p2p.domain.error.TransferError transferError, com.paypal.oslo.feature.p2p.domain.error.TransferError transferError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferError2, "");
        return transferError;
    }

    public static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput access$buildContingencyResolutionInput(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ContingencyAction contingencyAction, com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData contingencyResolutionData) {
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction;
        com.paypal.oslo.api.graphql.schema.type.ScamWarningCustomerDecision scamWarningCustomerDecision;
        int i = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$3[contingencyAction.ordinal()];
        if (i == 1) {
            paymentContingencyAction = com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.USER_DATA_COLLECTION_REQUIRED;
        } else if (i == 2) {
            paymentContingencyAction = com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.DISPLAY_SCAM_WARNING;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UNHANDLED_CONTINGENCY_ACTION, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", contingencyAction.toString())), null, 4, null);
            paymentContingencyAction = com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.UNKNOWN__;
        }
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction2 = paymentContingencyAction;
        if (contingencyResolutionData instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput) {
            com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput receiverNameInput = (com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput) contingencyResolutionData;
            return new com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput(str, paymentContingencyAction2, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionResolutionInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(receiverNameInput.getGivenName()), com.apollographql.apollo.api.Optional.INSTANCE.present(receiverNameInput.getSurname()), null, null, null, null, 121, null)))), null, null, 24, null);
        }
        if (!(contingencyResolutionData instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int i2 = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$4[((com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice) contingencyResolutionData).getCustomerChoice().ordinal()];
        if (i2 == 1) {
            scamWarningCustomerDecision = com.paypal.oslo.api.graphql.schema.type.ScamWarningCustomerDecision.ACCEPT_PAYMENT_TYPE;
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            scamWarningCustomerDecision = com.paypal.oslo.api.graphql.schema.type.ScamWarningCustomerDecision.UPDATE_PAYMENT_TYPE_TO_PURCHASE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput(str, paymentContingencyAction2, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningResolutionInput(scamWarningCustomerDecision)), 12, null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver access$mapContingencyResponse(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType;
        com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver = paymentTransferAttempt.getReceiver();
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType2 = null;
        com.paypal.oslo.feature.p2p.domain.model.Receiver map = receiver != null ? transferFlowRepositoryImpl.Camera2StreamConfigurationMap.getContingencyReceiverMapper().map(receiver) : null;
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement domain = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapperKt.toDomain(paymentTransferAttempt.getTransferTypeSelectionRequirement());
        java.lang.String obj = paymentTransferAttempt.getId().toString();
        java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> supportedTransferTypes = paymentTransferAttempt.getSupportedTransferTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType supportedTransferType : supportedTransferTypes) {
            int i = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$2[supportedTransferType.getType().ordinal()];
            if (i == 1) {
                paymentTxType = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
            } else if (i == 2) {
                paymentTxType = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UNKNOWN_PAYMENT_TRANSFER_TYPE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", supportedTransferType.getType().toString())), null, 4, null);
                paymentTxType = null;
            }
            com.paypal.oslo.feature.p2p.domain.model.TransferType transferType = paymentTxType != null ? new com.paypal.oslo.feature.p2p.domain.model.TransferType(paymentTxType, supportedTransferType.getDefault()) : null;
            if (transferType != null) {
                arrayList.add(transferType);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType = paymentTransferAttempt.getSelectedTransferType();
        if (selectedTransferType != null) {
            int i2 = com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl.WhenMappings.$EnumSwitchMapping$2[selectedTransferType.ordinal()];
            if (i2 == 1) {
                paymentTxType2 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
            } else if (i2 == 2) {
                paymentTxType2 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
            }
        }
        return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver(obj, arrayList2, paymentTxType2, null, map, null, null, domain, null, null, 864, null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult access$mapUpdateTransferTypeResult(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.Data data) {
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentLinkFragment paymentLinkFragment;
        com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment;
        java.lang.Object id;
        com.paypal.oslo.feature.p2p.domain.model.PaymentType map = transferFlowRepositoryImpl.Camera2StreamConfigurationMap.getTransferTypeMapper().map(data);
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.PaymentTransferAttempt paymentTransferAttempt = data.getUpdatePaymentTransferAttemptTransferType().getPaymentTransferAttempt();
        com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper fundingOptionsMapper = transferFlowRepositoryImpl.Camera2StreamConfigurationMap.getFundingOptionsMapper();
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions map2 = fundingOptionsMapper.map(fundingOptions != null ? fundingOptions.getP2PFundingOptionsFragment() : null);
        java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.ShippingAddress> shippingAddresses = paymentTransferAttempt.getShippingAddresses();
        if (shippingAddresses != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = shippingAddresses.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment2 = ((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.ShippingAddress) it.next()).getShippingAddressFragment();
                if (shippingAddressFragment2 != null) {
                    arrayList.add(shippingAddressFragment2);
                }
            }
            list = com.paypal.oslo.feature.p2p.data.mapper.ShippingAddressMapper.INSTANCE.toDomainList(arrayList, "");
        } else {
            list = null;
        }
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.SelectedShippingAddress selectedShippingAddress = paymentTransferAttempt.getSelectedShippingAddress();
        java.lang.String obj = (selectedShippingAddress == null || (shippingAddressFragment = selectedShippingAddress.getShippingAddressFragment()) == null || (id = shippingAddressFragment.getId()) == null) ? null : id.toString();
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.InstrumentAdditionConfig instrumentAdditionConfig = paymentTransferAttempt.getInstrumentAdditionConfig();
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig instrumentAdditionConfig2 = instrumentAdditionConfig != null ? new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig(com.paypal.oslo.feature.p2p.data.mapper.InstrumentAdditionConfigMapperKt.toDomainStatus(instrumentAdditionConfig.getStatus())) : null;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptTransferTypeMutation.PaymentLink paymentLink = paymentTransferAttempt.getPaymentLink();
        return new com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult(map, map2, list, obj, instrumentAdditionConfig2, (paymentLink == null || (paymentLinkFragment = paymentLink.getPaymentLinkFragment()) == null) ? null : com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLinkFragment.getUrl(), paymentLinkFragment.getExpirationTime()));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.ISSUER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.values().length];
            try {
                iArr4[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.USER_DATA_COLLECTION_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr4[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr4[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice.values().length];
            try {
                iArr5[com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice.ACCEPT_PAYMENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr5[com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice.UPDATE_PAYMENT_TYPE_TO_PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
