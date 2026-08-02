package com.payair.csdk;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4333a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ androidx.fragment.app.FragmentActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity) {
        super(1);
        this.f4333a = str;
        this.b = str2;
        this.c = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.hce.HCERegisterListener hCERegisterListener = (com.payair.hce.HCERegisterListener) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hCERegisterListener, "");
        new com.payair.hce.HCERegistration().register(hCERegisterListener, this.f4333a, "", this.b, this.c);
        return kotlin.Unit.INSTANCE;
    }
}
