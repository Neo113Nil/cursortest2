package com.payair.csdk;

/* loaded from: classes10.dex */
public final class t3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.t3 f4318a = new com.payair.csdk.t3();

    public t3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.TokensListDto tokensListDto = (com.payair.logic.remote.model.TokensListDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokensListDto, "");
        return com.payair.logic.remote.model.TokensListDtoKt.toTokensList(tokensListDto);
    }
}
