package com.payair.csdk;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.k1 f4273a = new com.payair.csdk.k1();

    public k1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto responseRequestAuthenticationCodeDto = (com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseRequestAuthenticationCodeDto, "");
        return com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDtoKt.toRequestAuthenticationCodeResponse(responseRequestAuthenticationCodeDto);
    }
}
