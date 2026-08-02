package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/ResponseRequestAuthenticationCodeDto;", "Lcom/payair/model/RequestAuthenticationCodeResponse;", "toRequestAuthenticationCodeResponse", "(Lcom/payair/logic/remote/model/ResponseRequestAuthenticationCodeDto;)Lcom/payair/model/RequestAuthenticationCodeResponse;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResponseRequestAuthenticationCodeDtoKt {
    public static final com.payair.model.RequestAuthenticationCodeResponse toRequestAuthenticationCodeResponse(com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto responseRequestAuthenticationCodeDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseRequestAuthenticationCodeDto, "");
        return new com.payair.model.RequestAuthenticationCodeResponse(responseRequestAuthenticationCodeDto.getMaxOTPVerificationAllowed(), responseRequestAuthenticationCodeDto.getMaxOTPRequestsAllowed(), responseRequestAuthenticationCodeDto.getCodeExpiration(), responseRequestAuthenticationCodeDto.getThreeDSecureActivationUrl());
    }
}
