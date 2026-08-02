package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0010\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0017*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010(\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/StatementsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/StatementsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;", "statementService", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/storage/FileStorage;", "fileStorage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsResponseMapper;", "responseMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/storage/FileStorage;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsResponseMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummaryRequest;", "request", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummary;", "getStatementSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementSummaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/StatementDetailsRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "getStatementDetails", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/StatementDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailsError;", "", "accountId", "statementId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementError;", "downloadStatement", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/storage/FileStorage;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsResponseMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion_"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementsRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository {

    @java.lang.Deprecated
    public static final int BUFFER_SIZE = 8192;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.Companion_ Companion_ = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.Companion_(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public StatementsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService statementService, com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage fileStorage, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper statementDetailsResponseMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsResponseMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.Camera2StreamConfigurationMap = statementService;
        this.getHighSpeedVideoFpsRanges = fileStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = statementDetailsResponseMapper;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    public final java.lang.Object getStatementSummary(final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<kotlin.Unit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary>> continuation) {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchDataHandlingPartialErrors$default(this, this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(statementSummaryRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(statementSummaryRequest.getCreditAccountId())), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.$r8$lambda$ZiMd28SWq_iNp63rcG8ZoIn42u0((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.Data) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.m18047$r8$lambda$a8SsCqD7KmzSa_NH83UZMJBtNk((com.paypal.oslo.core.network.graphql.error.CallError) obj);
            }
        }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.m18046$r8$lambda$MEmG5DO8AQeQDtVuJm9WjJAH6I((com.paypal.oslo.core.network.graphql.error.CallError) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.Data) obj3);
            }
        }, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.$r8$lambda$QTtIleYgcorLfGCvtOLjhpaDlJk(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation, 16, null);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    public final java.lang.Object getStatementDetails(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest statementDetailsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails>> continuation) {
        java.lang.String creditAccountId = statementDetailsRequest.getCreditAccountId();
        if (creditAccountId == null || kotlin.text.StringsKt.isBlank(creditAccountId)) {
            creditAccountId = null;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchDataHandlingPartialErrors$default(this, this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditStatementInput(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(statementDetailsRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(creditAccountId), statementDetailsRequest.getStatementId()), com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(statementDetailsRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(creditAccountId)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.$r8$lambda$dcUub22AhUhnWey6AQaPLTY8D6M(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.$r8$lambda$SE3n9vMXjaUcaSN4HljiyJ8BxIY(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj);
            }
        }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.m18048$r8$lambda$ipWlzRIt6G6iXh0PlNEFWkPcVY(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data) obj3);
            }
        }, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.$r8$lambda$h4PoSEJvpyE1QHsM5U3kcCZPBlI(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation, 16, null);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return !arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()).isEmpty() ? new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError.PartialDataAvailable(kotlin.collections.CollectionsKt.emptyList()) : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError.Default.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository
    public final java.lang.Object downloadStatement(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError, java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2(this, str, str2, null), continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/StatementsRepositoryImpl$Companion_;", "", "<init>", "()V", "", "BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$MEmG5D-O8AQeQDtVuJm9WjJAH6I, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m18046$r8$lambda$MEmG5DO8AQeQDtVuJm9WjJAH6I(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary domain;
        arrow.core.Ior rightIor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorHandler, "");
        return (data == null || (domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementsMapperKt.toDomain(data, partialErrorHandler.contains(com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.StatementsFields.SUMMARIES))) == null || (rightIor = arrow.core.IorKt.rightIor(domain)) == null) ? arrow.core.IorKt.leftIor(kotlin.Unit.INSTANCE) : rightIor;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QTtIleYgcorLfGCvtOLjhpaDlJk(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummaryRequest statementSummaryRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(statementSummaryRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$SE3n9vMXjaUcaSN4HljiyJ8BxIY(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRangesFor(callError));
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$ZiMd28SWq_iNp63rcG8ZoIn42u0(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementSummariesQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementSummary domain;
        arrow.core.Ior rightIor;
        return (data == null || (domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementsMapperKt.toDomain(data, false)) == null || (rightIor = arrow.core.IorKt.rightIor(domain)) == null) ? arrow.core.IorKt.leftIor(kotlin.Unit.INSTANCE) : rightIor;
    }

    /* renamed from: $r8$lambda$a8SsCqD7KmzSa_NH83UZMJ-BtNk, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m18047$r8$lambda$a8SsCqD7KmzSa_NH83UZMJBtNk(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return arrow.core.IorKt.leftIor(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$dcUub22AhUhnWey6AQaPLTY8D6M(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data data) {
        arrow.core.Ior rightIor;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails domain = data != null ? statementsRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.toDomain(data, null) : null;
        return (domain == null || (rightIor = arrow.core.IorKt.rightIor(domain)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError.InvalidResponse.INSTANCE) : rightIor;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h4PoSEJvpyE1QHsM5U3kcCZPBlI(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.StatementDetailsRequest statementDetailsRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(statementDetailsRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ipWlzRIt6-G6iXh0PlNEFWkPcVY, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m18048$r8$lambda$ipWlzRIt6G6iXh0PlNEFWkPcVY(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorHandler, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailsError highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(callError);
        if (data == null) {
            return arrow.core.IorKt.leftIor(highSpeedVideoFpsRangesFor);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails domain = statementsRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.toDomain(data, partialErrorHandler);
        return domain != null ? new arrow.core.Ior.Both(highSpeedVideoFpsRangesFor, domain) : arrow.core.IorKt.leftIor(highSpeedVideoFpsRangesFor);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError access$mapHttpError(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl, int i) {
        if (i == 401 || i == 403) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.Unauthorized.INSTANCE;
        }
        if (i == 404) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.NotFound.INSTANCE;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.Unknown("HTTP ".concat(java.lang.String.valueOf(i)));
    }
}
