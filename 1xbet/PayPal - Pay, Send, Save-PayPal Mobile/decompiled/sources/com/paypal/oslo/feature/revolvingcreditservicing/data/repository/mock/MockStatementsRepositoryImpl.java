package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0002! B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockStatementsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/StatementsRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummaryRequest;", "request", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;", "getStatementSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/StatementDetailsRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "getStatementDetails", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/StatementDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "", "accountId", "statementId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementError;", "downloadStatement", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "MockTransaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockStatementsRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository {

    @java.lang.Deprecated
    public static final int DECEMBER = 12;

    @java.lang.Deprecated
    public static final long DELAY = 2500;

    @java.lang.Deprecated
    public static final long DOWNLOAD_DELAY = 2000;

    @java.lang.Deprecated
    public static final int FIRST_YEAR = 2025;

    @java.lang.Deprecated
    public static final java.lang.String GBP = "GBP";

    @java.lang.Deprecated
    public static final int MOCKED_ITEMS_SIZE = 5;

    @java.lang.Deprecated
    public static final int NOVEMBER = 11;

    @java.lang.Deprecated
    public static final int ONE = 1;

    @java.lang.Deprecated
    public static final int POSITION_WITH_TERMS_CHANGED = 2;

    @java.lang.Deprecated
    public static final int SECOND_YEAR = 2024;

    @java.lang.Deprecated
    public static final java.lang.String USD = "USD";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockStatementsRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getStatementSummary(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<kotlin.Unit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$getStatementSummary$1 mockStatementsRepositoryImpl$getStatementSummary$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest2;
        java.lang.String str;
        int i2;
        int i3;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$getStatementSummary$1) {
            mockStatementsRepositoryImpl$getStatementSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$getStatementSummary$1) continuation;
            if ((mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    statementSummaryRequest2 = statementSummaryRequest;
                    mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoSizes = statementSummaryRequest2;
                    mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(DELAY, mockStatementsRepositoryImpl$getStatementSummary$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest) mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    statementSummaryRequest2 = statementSummaryRequest3;
                }
                if (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[statementSummaryRequest2.getCreditProductIdentifier().ordinal()] != 3) {
                    str = "GBP";
                } else {
                    str = "USD";
                }
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                i2 = 0;
                while (i2 < 5) {
                    int i4 = i2 + 1;
                    java.lang.String concat = "2025-".concat(java.lang.String.valueOf(i4));
                    java.time.Instant instant = java.time.LocalDate.of(FIRST_YEAR, 11, i4).atStartOfDay(java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC)).toInstant();
                    java.time.Instant instant2 = java.time.LocalDate.of(FIRST_YEAR, 12, i4).atStartOfDay(java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC)).toInstant();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("23");
                    sb.append(i2);
                    sb.append(".89");
                    createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem(concat, instant, instant2, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(str, sb.toString()), i2 == 2));
                    i2 = i4;
                }
                i3 = 0;
                while (i3 < 5) {
                    int i5 = i3 + 1;
                    java.lang.String concat2 = "2024-".concat(java.lang.String.valueOf(i5));
                    java.time.Instant instant3 = java.time.LocalDate.of(SECOND_YEAR, 1, i5).atStartOfDay(java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC)).toInstant();
                    java.time.Instant instant4 = java.time.LocalDate.of(SECOND_YEAR, 2, i5).atStartOfDay(java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC)).toInstant();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
                    sb2.append(i3);
                    sb2.append(".89");
                    createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementItem(concat2, instant3, instant4, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(str, sb2.toString()), i3 == 2));
                    i3 = i5;
                }
                return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary(kotlin.collections.CollectionsKt.build(createListBuilder)));
            }
        }
        mockStatementsRepositoryImpl$getStatementSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$getStatementSummary$1(this, continuation);
        java.lang.Object obj2 = mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockStatementsRepositoryImpl$getStatementSummary$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[statementSummaryRequest2.getCreditProductIdentifier().ordinal()] != 3) {
        }
        java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
        i2 = 0;
        while (i2 < 5) {
        }
        i3 = 0;
        while (i3 < 5) {
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary(kotlin.collections.CollectionsKt.build(createListBuilder2)));
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    public final java.lang.Object getStatementDetails(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest statementDetailsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails statementDetails;
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[statementDetailsRequest.getCreditProductIdentifier().ordinal()];
        if (i != 1 && i == 2) {
            statementDetails = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary(java.time.Instant.parse("2025-11-18T00:00:00Z"), java.time.Instant.parse("2025-12-18T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "3245.67"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1000.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "856.33"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "45.50"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "3147.50"), java.time.Instant.parse("2026-01-15T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "75.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "3167.50"), "http://www.paypal.com/learnmore", "23.99%"), null, false, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancing(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity("SF-001", "Nike", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1299.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "866.00"), java.time.Instant.parse("2026-03-15T00:00:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus.ACTIVE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.NO_INTEREST), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity("SF-002", "Walmart", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "599.99"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "199.99"), java.time.Instant.parse("2026-02-01T00:00:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus.ACTIVE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.NO_INTEREST)})), getHighSpeedVideoFpsRanges(), null, 36, null);
        } else {
            statementDetails = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary(java.time.Instant.parse("2025-11-18T00:00:00Z"), java.time.Instant.parse("2025-12-18T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1856.42"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1039.58"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "0.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2396.00"), java.time.Instant.parse("2026-01-15T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "35.00"), null, null, null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackSummary(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "28.42"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier("3%", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "18.50")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier("2%", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "9.92"))}), null, null), false, null, getHighSpeedVideoFpsRanges(), null, 36, null);
        }
        return new arrow.core.Ior.Right(statementDetails);
    }

    private static java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> getHighSpeedVideoFpsRanges() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction[]{new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction("TXN-001", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "125.50"), java.time.Instant.parse("2025-12-15T10:30:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE, "Amazon.com", null, null), new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction("TXN-002", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "89.99"), java.time.Instant.parse("2025-12-12T14:15:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE, "Target", null, "3%"), new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction("TXN-003", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "45.00"), java.time.Instant.parse("2025-12-10T09:00:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE, "Shell Gas Station", null, "2%"), new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction("TXN-004", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "-500.00"), java.time.Instant.parse("2025-12-05T12:00:00Z"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT, "Payment - Thank You", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument(null, "Bank Account", "1234")), null)});
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0082\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001dR\u001c\u0010%\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u001e\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010&\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00106\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010\u001dR\"\u00102\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b:\u0010;R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010\u001dR\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b>\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockStatementsRepositoryImpl$MockTransaction;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "p1", "Ljava/time/Instant;", "p2", "", "p3", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "p4", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "p5", "p6", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionFundingInstrument;", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getId", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/time/Instant;", "getCreationDate", "()Ljava/time/Instant;", "getHighSpeedVideoFpsRangesFor", "Z", "isCancellable", "()Z", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getOutputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getTransactionImage", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "getTransactionName", "Ljava/util/List;", "getTransactionFundingInstruments", "()Ljava/util/List;", "getInputFormats", "getTransactionCashbackPercentage", "getReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class MockTransaction implements com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getInputFormats;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.time.Instant getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getHighSpeedVideoFpsRanges;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getOutputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getInputSizeshNQ4ISI;
        private final java.lang.String getOutputMinFrameDuration;

        public MockTransaction(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType, java.lang.String str2, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> list, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = currencyAmount;
            this.getHighSpeedVideoFpsRangesFor = instant;
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoFpsRanges = transactionType;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = str2;
            this.getOutputFormats = list;
            this.getHighSpeedVideoSizesFor = str3;
            this.getInputFormats = null;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getId, reason: from getter */
        public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getAmount, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getCreationDate, reason: from getter */
        public final java.time.Instant getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: isCancellable, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getTransactionType, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getTransactionImage, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getGetInputSizeshNQ4ISI() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getTransactionName, reason: from getter */
        public final java.lang.String getGetOutputMinFrameDuration() {
            return this.getOutputMinFrameDuration;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments() {
            return this.getOutputFormats;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getTransactionCashbackPercentage, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoSizesFor() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction
        /* renamed from: getReferenceId, reason: from getter */
        public final java.lang.String getGetInputFormats() {
            return this.getInputFormats;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.Camera2StreamConfigurationMap;
            java.time.Instant instant = this.getHighSpeedVideoFpsRangesFor;
            boolean z = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = this.getInputSizeshNQ4ISI;
            java.lang.String str2 = this.getOutputMinFrameDuration;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> list = this.getOutputFormats;
            java.lang.String str3 = this.getHighSpeedVideoSizesFor;
            java.lang.String str4 = this.getInputFormats;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MockTransaction(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(str);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(currencyAmount);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(instant);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(z);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(transactionType);
            sb.append(", getInputSizeshNQ4ISI=");
            sb.append(creditImage);
            sb.append(", getOutputMinFrameDuration=");
            sb.append(str2);
            sb.append(", getOutputFormats=");
            sb.append(list);
            sb.append(", getHighSpeedVideoSizesFor=");
            sb.append(str3);
            sb.append(", getInputFormats=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.Camera2StreamConfigurationMap;
            int hashCode2 = currencyAmount == null ? 0 : currencyAmount.hashCode();
            java.time.Instant instant = this.getHighSpeedVideoFpsRangesFor;
            int hashCode3 = instant == null ? 0 : instant.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
            int hashCode5 = this.getHighSpeedVideoFpsRanges.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage creditImage = this.getInputSizeshNQ4ISI;
            int hashCode6 = creditImage == null ? 0 : creditImage.hashCode();
            java.lang.String str = this.getOutputMinFrameDuration;
            int hashCode7 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> list = this.getOutputFormats;
            int hashCode8 = list == null ? 0 : list.hashCode();
            java.lang.String str2 = this.getHighSpeedVideoSizesFor;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.getInputFormats;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction mockTransaction = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.MockTransaction) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, mockTransaction.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, mockTransaction.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, mockTransaction.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoSizes == mockTransaction.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == mockTransaction.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, mockTransaction.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, mockTransaction.getOutputMinFrameDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, mockTransaction.getOutputFormats) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, mockTransaction.getHighSpeedVideoSizesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, mockTransaction.getInputFormats);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadStatement(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$downloadStatement$1 mockStatementsRepositoryImpl$downloadStatement$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$downloadStatement$1) {
            mockStatementsRepositoryImpl$downloadStatement$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$downloadStatement$1) continuation;
            if ((mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockStatementsRepositoryImpl$downloadStatement$1.Camera2StreamConfigurationMap = str;
                    mockStatementsRepositoryImpl$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockStatementsRepositoryImpl$downloadStatement$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) mockStatementsRepositoryImpl$downloadStatement$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) mockStatementsRepositoryImpl$downloadStatement$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.io.File file = new java.io.File(this.getHighResolutionOutputSizeshNQ4ISI.getFilesDir(), "downloads");
                file.mkdirs();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("statement_");
                sb.append(str);
                sb.append("_");
                sb.append(str2);
                sb.append(".pdf");
                java.io.File file2 = new java.io.File(file, sb.toString());
                kotlin.io.FilesKt.writeText$default(file2, "%PDF-1.4\n1 0 obj<</Type/Catalog/Pages 2 0 R>>endobj\n2 0 obj<</Type/Pages/Kids[3 0 R]/Count 1>>endobj\n3 0 obj<</Type/Page/MediaBox[0 0 612 792]/Parent 2 0 R/Resources<<>>>>endobj\nxref\n0 4\n0000000000 65535 f\n0000000009 00000 n\n0000000056 00000 n\n0000000115 00000 n\ntrailer<</Size 4/Root 1 0 R>>\nstartxref\n206\n%%EOF", null, 2, null);
                return arrow.core.EitherKt.right(file2.getAbsolutePath());
            }
        }
        mockStatementsRepositoryImpl$downloadStatement$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl$downloadStatement$1(this, continuation);
        java.lang.Object obj2 = mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockStatementsRepositoryImpl$downloadStatement$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.io.File file3 = new java.io.File(this.getHighResolutionOutputSizeshNQ4ISI.getFilesDir(), "downloads");
        file3.mkdirs();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("statement_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append(".pdf");
        java.io.File file22 = new java.io.File(file3, sb2.toString());
        kotlin.io.FilesKt.writeText$default(file22, "%PDF-1.4\n1 0 obj<</Type/Catalog/Pages 2 0 R>>endobj\n2 0 obj<</Type/Pages/Kids[3 0 R]/Count 1>>endobj\n3 0 obj<</Type/Page/MediaBox[0 0 612 792]/Parent 2 0 R/Resources<<>>>>endobj\nxref\n0 4\n0000000000 65535 f\n0000000009 00000 n\n0000000056 00000 n\n0000000115 00000 n\ntrailer<</Size 4/Root 1 0 R>>\nstartxref\n206\n%%EOF", null, 2, null);
        return arrow.core.EitherKt.right(file22.getAbsolutePath());
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockStatementsRepositoryImpl$Companion;", "", "<init>", "()V", "", "DELAY", "J", "DOWNLOAD_DELAY", "", "FIRST_YEAR", com.visa.cbp.getEncExpo.warmup, "SECOND_YEAR", "", "USD", "Ljava/lang/String;", "GBP", "MOCKED_ITEMS_SIZE", "POSITION_WITH_TERMS_CHANGED", "ONE", "NOVEMBER", "DECEMBER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
