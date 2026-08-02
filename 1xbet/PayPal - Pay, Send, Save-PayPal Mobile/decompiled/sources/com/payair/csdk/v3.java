package com.payair.csdk;

/* loaded from: classes10.dex */
public final class v3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.v3 f4327a = new com.payair.csdk.v3();

    public v3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.TokensCardReferenceDto tokensCardReferenceDto = (com.payair.logic.remote.model.TokensCardReferenceDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokensCardReferenceDto, "");
        return com.payair.logic.remote.model.TokensCardReferenceDtoKt.toTokensCardReference(tokensCardReferenceDto);
    }
}
