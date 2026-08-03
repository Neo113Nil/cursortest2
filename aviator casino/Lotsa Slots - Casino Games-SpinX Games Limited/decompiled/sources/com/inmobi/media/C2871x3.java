package com.inmobi.media;

/* renamed from: com.inmobi.media.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2871x3 implements com.inmobi.media.InterfaceC2659p3 {
    @Override // com.inmobi.media.InterfaceC2659p3
    public final void a(com.inmobi.media.V2 click) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        java.lang.String str = click.b;
        java.util.LinkedHashMap linkedHashMap = com.inmobi.media.A3.j;
        com.inmobi.media.C2260a0 c2260a0 = (com.inmobi.media.C2260a0) linkedHashMap.get(java.lang.Integer.valueOf(click.f5007a));
        if (c2260a0 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
            c2260a0.f5091a.a(c2260a0.b);
        }
        linkedHashMap.remove(java.lang.Integer.valueOf(click.f5007a));
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2845w3(click, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC2659p3
    public final void a(com.inmobi.media.V2 click, com.inmobi.media.EnumC2372e6 errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
        java.lang.String str = click.b;
        if (click.f == 0) {
            com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.A3.a(click, errorCode.name());
        }
        com.inmobi.media.A3 a33 = com.inmobi.media.A3.f4593a;
        com.inmobi.media.A3.b(click);
        com.inmobi.media.A3.f();
    }
}
