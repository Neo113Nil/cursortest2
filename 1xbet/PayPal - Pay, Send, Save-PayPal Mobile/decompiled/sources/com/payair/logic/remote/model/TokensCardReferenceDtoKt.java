package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/TokensCardReferenceDto;", "Lcom/payair/model/TokensCardReference;", "toTokensCardReference", "(Lcom/payair/logic/remote/model/TokensCardReferenceDto;)Lcom/payair/model/TokensCardReference;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TokensCardReferenceDtoKt {
    public static final com.payair.model.TokensCardReference toTokensCardReference(com.payair.logic.remote.model.TokensCardReferenceDto tokensCardReferenceDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokensCardReferenceDto, "");
        return new com.payair.model.TokensCardReference(tokensCardReferenceDto.getIssuerPanReference());
    }
}
