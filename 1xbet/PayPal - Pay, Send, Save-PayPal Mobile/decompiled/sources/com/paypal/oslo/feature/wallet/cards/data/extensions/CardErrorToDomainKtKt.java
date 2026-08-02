package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t0\b*\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError;", "toCardServerErrors", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)Ljava/util/List;", "", "", "", "", "Lkotlin/Triple;", "extractErrorDetails", "(Ljava/util/Map;)Ljava/util/List;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "error", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$InvalidRequest;", "mapInvalidRequest", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Ljava/util/List;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardServerError$UnprocessableEntity;", "mapUnprocessableEntity", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;", "mapToCardField", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardField;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardErrorToDomainKtKt {
    public static final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> toCardServerErrors(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()));
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("code") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode unknownCode = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode(str, graphQLError.getMessage());
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "INVALID_REQUEST")) {
            java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> nonEmptyListOrNull = arrow.core.NonEmptyListKt.toNonEmptyListOrNull(mapInvalidRequest(graphQLError));
            return nonEmptyListOrNull == null ? arrow.core.NonEmptyListKt.nonEmptyListOf(unknownCode, new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode[0]) : nonEmptyListOrNull;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "UNPROCESSABLE_ENTITY")) {
            java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError> nonEmptyListOrNull2 = arrow.core.NonEmptyListKt.toNonEmptyListOrNull(mapUnprocessableEntity(graphQLError));
            return nonEmptyListOrNull2 == null ? arrow.core.NonEmptyListKt.nonEmptyListOf(unknownCode, new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode[0]) : nonEmptyListOrNull2;
        }
        return arrow.core.NonEmptyListKt.nonEmptyListOf(unknownCode, new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnknownCode[0]);
    }

    public static final java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> extractErrorDetails(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.Object obj = map != null ? map.get("details") : null;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        if (list == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof java.util.Map) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList<java.util.Map> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (java.util.Map map2 : arrayList2) {
            java.lang.Object obj3 = map2.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            java.lang.Object obj4 = map2.get("field");
            java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            java.lang.Object obj5 = map2.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            arrayList3.add(new kotlin.Triple(str, str2, obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null));
        }
        return arrayList3;
    }

    public static final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest> mapInvalidRequest(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> extractErrorDetails = extractErrorDetails(graphQLError.getExtensions());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(extractErrorDetails, 10));
        java.util.Iterator<T> it = extractErrorDetails.iterator();
        while (it.hasNext()) {
            kotlin.Triple triple = (kotlin.Triple) it.next();
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component2();
            com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField mapToCardField = str2 != null ? mapToCardField(str2) : null;
            if (str != null) {
                unknown = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.FieldValidation(str, str2, mapToCardField);
            } else {
                unknown = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.InvalidRequest.Unknown(str, str2);
            }
            arrayList.add(unknown);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
    
        r1 = com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.MaxCardAdded.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r2.equals("RISK_DENIED_DUE_TO_INSTRUMENT_COUNT_LIMIT_EXCEEDED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r2.equals("CARD_NOT_ALLOWED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cc, code lost:
    
        r1 = com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.RiskDeclined.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r2.equals("CARD_NUMBER_BLOCKED_BIN") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r2.equals("ISSUER_DECLINE") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r2.equals("MAX_ACCOUNT_COUNT_VERIFIED_REJECTED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r2.equals("INSTRUMENT_BLOCKED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r2.equals(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r2.equals("MAX_ACCOUNT_COUNT_REJECTED") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r2.equals("EXPIRED_CARD") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r2.equals("INSTRUMENT_COUNT_LIMIT_EXCEEDED") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r2.equals("ISSUER_DECLINE_ISSUER_DECLINE") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r2.equals("DEBIT_CARD_NOT_ACCEPTED") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r2.equals("INSTRUMENT_COUNT_LIMIT_EXCEEDED_VERIFIED") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity> mapUnprocessableEntity(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        java.util.List<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> extractErrorDetails = extractErrorDetails(graphQLError.getExtensions());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(extractErrorDetails, 10));
        java.util.Iterator<T> it = extractErrorDetails.iterator();
        while (it.hasNext()) {
            kotlin.Triple triple = (kotlin.Triple) it.next();
            java.lang.String str = (java.lang.String) triple.component1();
            java.lang.String str2 = (java.lang.String) triple.component3();
            if (str != null) {
                switch (str.hashCode()) {
                    case -2062661681:
                        break;
                    case -1728748513:
                        break;
                    case -1658295777:
                        break;
                    case -711828798:
                        if (str.equals("SHARED_INSTRUMENT_CONSENT_REQUIRED")) {
                            unknown = com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.SharedInstrumentConsentRequired.INSTANCE;
                            break;
                        }
                        break;
                    case -511175670:
                        break;
                    case -503455845:
                        break;
                    case -188411125:
                        break;
                    case 120360308:
                        break;
                    case 206282136:
                        break;
                    case 339882832:
                        break;
                    case 436779405:
                        break;
                    case 1350416717:
                        break;
                    case 1632916058:
                        break;
                    case 1790888168:
                        break;
                }
                arrayList.add(unknown);
            }
            unknown = new com.paypal.oslo.feature.wallet.cards.domain.model.CardServerError.UnprocessableEntity.Unknown(str, str2);
            arrayList.add(unknown);
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField mapToCardField(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1436471787:
                if (!str.equals("Instrument Account Number")) {
                    return null;
                }
                break;
            case 98915:
                if (str.equals(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv)) {
                    return com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField.CVV;
                }
                return null;
            case 475919162:
                if (str.equals("expiry_date")) {
                    return com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField.EXPIRY;
                }
                return null;
            case 578603864:
                if (!str.equals(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.CARD_DETAILS_CARD_NUMBER)) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return com.paypal.oslo.feature.wallet.cards.domain.add.model.CardField.NUMBER;
    }
}
