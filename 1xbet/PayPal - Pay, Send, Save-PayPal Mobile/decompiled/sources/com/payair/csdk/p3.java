package com.payair.csdk;

/* loaded from: classes10.dex */
public final class p3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.p3 f4300a = new com.payair.csdk.p3();

    public p3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto responseGetAuthenticationMethodsDto = (com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseGetAuthenticationMethodsDto, "");
        return responseGetAuthenticationMethodsDto.toAuthenticationMethods();
    }
}
