package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/logic/remote/model/AuthenticationMethodDto;", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "toAuthenticationMethod", "(Lcom/payair/logic/remote/model/AuthenticationMethodDto;)Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AuthenticationMethodDtoKt {
    public static final com.payair.model.CompleteTokenizeData.AuthenticationMethod toAuthenticationMethod(com.payair.logic.remote.model.AuthenticationMethodDto authenticationMethodDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethodDto, "");
        java.lang.String id = authenticationMethodDto.getId();
        com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType enumByValue = com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.INSTANCE.enumByValue(authenticationMethodDto.getType());
        java.lang.String value = authenticationMethodDto.getValue();
        com.payair.logic.remote.model.IssuerMobileAppDto issuerMobileApp = authenticationMethodDto.getIssuerMobileApp();
        return new com.payair.model.CompleteTokenizeData.AuthenticationMethod(id, enumByValue, value, issuerMobileApp != null ? com.payair.logic.remote.model.IssuerMobileAppDtoKt.toIssuerMobileApp(issuerMobileApp) : null);
    }
}
