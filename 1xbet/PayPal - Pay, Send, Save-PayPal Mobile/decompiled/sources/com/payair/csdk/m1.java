package com.payair.csdk;

/* loaded from: classes10.dex */
public final class m1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.m1 f4283a = new com.payair.csdk.m1();

    public m1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto responseSendAuthenticationCodeDto = (com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseSendAuthenticationCodeDto, "");
        return com.payair.logic.remote.model.ResponseSendAuthenticationCodeDtoKt.toActivateCodeResponse(responseSendAuthenticationCodeDto);
    }
}
