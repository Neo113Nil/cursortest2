package com.payair.csdk;

/* loaded from: classes10.dex */
public final class z3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String str) {
        super(1);
        this.f4345a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseTransactionHistoryDto responseTransactionHistoryDto = (com.payair.logic.remote.model.ResponseTransactionHistoryDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseTransactionHistoryDto, "");
        return com.payair.logic.remote.model.ResponseTransactionHistoryDtoKt.toTransactions(responseTransactionHistoryDto, this.f4345a);
    }
}
