package com.payair.csdk;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.b1 f4232a = new com.payair.csdk.b1();

    public b1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.ResponseCompleteTokenizeDto responseCompleteTokenizeDto = (com.payair.logic.remote.model.ResponseCompleteTokenizeDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCompleteTokenizeDto, "");
        return com.payair.logic.remote.model.ResponseCompleteTokenizeDtoKt.toCompleteTokenizeData(responseCompleteTokenizeDto);
    }
}
