package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsResponseMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsMapper;", "statementDetailsMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "partialErrors", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Data;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetails;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailsMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsResponseMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public StatementDetailsResponseMapper(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsMapper statementDetailsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = statementDetailsMapper;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails toDomain$default(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.StatementDetailsResponseMapper statementDetailsResponseMapper, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            partialErrorHandler = null;
        }
        return statementDetailsResponseMapper.toDomain(data, partialErrorHandler);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetails toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrors) {
        java.lang.Object creditAccountId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement revolvingCreditStatement = data.getRevolvingCreditStatement();
        java.lang.String str = null;
        if (revolvingCreditStatement == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        if (revolvingCreditAccount != null && (creditAccountId = revolvingCreditAccount.getCreditAccountId()) != null) {
            str = creditAccountId.toString();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.toDomain(revolvingCreditStatement, partialErrors, str);
    }
}
