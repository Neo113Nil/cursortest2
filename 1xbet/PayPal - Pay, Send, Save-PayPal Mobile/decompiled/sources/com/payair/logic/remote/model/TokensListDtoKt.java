package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/TokenDto;", "Lcom/payair/model/Token;", "toToken", "(Lcom/payair/logic/remote/model/TokenDto;)Lcom/payair/model/Token;", "Lcom/payair/logic/remote/model/TokensListDto;", "Lcom/payair/model/TokensList;", "toTokensList", "(Lcom/payair/logic/remote/model/TokensListDto;)Lcom/payair/model/TokensList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TokensListDtoKt {
    public static final com.payair.model.Token toToken(com.payair.logic.remote.model.TokenDto tokenDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDto, "");
        return new com.payair.model.Token(tokenDto.getNetworkTokenReference(), tokenDto.getTokenStatus());
    }

    public static final com.payair.model.TokensList toTokensList(com.payair.logic.remote.model.TokensListDto tokensListDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokensListDto, "");
        java.util.List<com.payair.logic.remote.model.TokenDto> tokens = tokensListDto.getTokens();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tokens, 10));
        java.util.Iterator<T> it = tokens.iterator();
        while (it.hasNext()) {
            arrayList.add(toToken((com.payair.logic.remote.model.TokenDto) it.next()));
        }
        return new com.payair.model.TokensList(arrayList);
    }
}
