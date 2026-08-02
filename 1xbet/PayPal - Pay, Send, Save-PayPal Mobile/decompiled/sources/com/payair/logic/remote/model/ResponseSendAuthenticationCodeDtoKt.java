package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/ResponseSendAuthenticationCodeDto;", "Lcom/payair/model/ActivateCodeResponse;", "toActivateCodeResponse", "(Lcom/payair/logic/remote/model/ResponseSendAuthenticationCodeDto;)Lcom/payair/model/ActivateCodeResponse;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseSendAuthenticationCodeDtoKt {
    public static final com.payair.model.ActivateCodeResponse toActivateCodeResponse(com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto responseSendAuthenticationCodeDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseSendAuthenticationCodeDto, "");
        return com.payair.model.ActivateCodeResponse.INSTANCE.enumByValue$core_release(responseSendAuthenticationCodeDto.getResult());
    }
}
