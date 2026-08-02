package com.payair.csdk;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(java.lang.String str) {
        super(1);
        this.f4338a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.hce.HCERegisterListener hCERegisterListener = (com.payair.hce.HCERegisterListener) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hCERegisterListener, "");
        new com.payair.hce.HCERegistration().registerMastercard(hCERegisterListener, this.f4338a);
        return kotlin.Unit.INSTANCE;
    }
}
