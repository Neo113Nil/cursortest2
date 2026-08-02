package com.payair.csdk;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.logic.implementation.AndroidPaymentService f4224a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.payair.logic.implementation.AndroidPaymentService androidPaymentService) {
        super(0);
        this.f4224a = androidPaymentService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        android.content.Context context;
        context = this.f4224a.f4437a;
        return new android.content.ComponentName(context, (java.lang.Class<?>) com.payair.hce.PayairWalletHceService.class);
    }
}
