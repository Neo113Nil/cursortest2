package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/ResponseStartTokenizeAllCardsDto;", "Lcom/payair/model/StartTokenizeAllCardsData;", "toStartTokenizeAllCardsData", "(Lcom/payair/logic/remote/model/ResponseStartTokenizeAllCardsDto;)Lcom/payair/model/StartTokenizeAllCardsData;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseStartTokenizeAllCardsDtoKt {
    public static final com.payair.model.StartTokenizeAllCardsData toStartTokenizeAllCardsData(com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto responseStartTokenizeAllCardsDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseStartTokenizeAllCardsDto, "");
        java.util.List<com.payair.logic.remote.model.TokenizationSessionDto> tokenizationSessions = responseStartTokenizeAllCardsDto.getTokenizationSessions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tokenizationSessions, 10));
        for (com.payair.logic.remote.model.TokenizationSessionDto tokenizationSessionDto : tokenizationSessions) {
            arrayList.add(new com.payair.model.TokenizationSession(tokenizationSessionDto.getTermsAndConditionsAssetId(), tokenizationSessionDto.getTokenizationSessionId(), tokenizationSessionDto.getCardReference(), tokenizationSessionDto.getLast4digits(), tokenizationSessionDto.getAssetUrl(), tokenizationSessionDto.getExpirationTimestamp(), tokenizationSessionDto.getCardNetwork()));
        }
        return new com.payair.model.StartTokenizeAllCardsData(arrayList);
    }
}
