package com.inmobi.media;

/* renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2423g3 implements com.inmobi.media.InterfaceC2659p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.HandlerC2526k3 f5210a;

    public C2423g3(com.inmobi.media.HandlerC2526k3 handlerC2526k3) {
        this.f5210a = handlerC2526k3;
    }

    @Override // com.inmobi.media.InterfaceC2659p3
    public final void a(com.inmobi.media.V2 click) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        com.inmobi.media.HandlerC2526k3 handlerC2526k3 = this.f5210a;
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 4;
        obtain.obj = click;
        handlerC2526k3.sendMessage(obtain);
    }

    @Override // com.inmobi.media.InterfaceC2659p3
    public final void a(com.inmobi.media.V2 click, com.inmobi.media.EnumC2372e6 enumC2372e6) {
        com.inmobi.media.EnumC2372e6 errorCode = com.inmobi.media.EnumC2372e6.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        java.lang.String str = click.b;
        com.inmobi.media.A3.b(click);
        this.f5210a.b(click);
    }
}
