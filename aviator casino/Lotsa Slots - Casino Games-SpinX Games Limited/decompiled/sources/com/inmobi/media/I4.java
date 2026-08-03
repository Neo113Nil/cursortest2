package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I4 implements com.inmobi.media.InterfaceC2846w4 {
    @Override // com.inmobi.media.InterfaceC2846w4
    public final void a(com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "access$getTAG$p(...)");
            com.inmobi.media.O4 o42 = com.inmobi.media.O4.f4868a;
            java.lang.String str = com.inmobi.media.O4.f;
            java.util.List<java.lang.String> skipFields = com.inmobi.media.O4.c().getContextualData().getSkipFields();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(com.inmobi.media.P4.j);
            arrayList.removeAll(skipFields);
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            com.inmobi.media.O4.f = joinToString$default;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(joinToString$default, str)) {
                o42.f();
            }
            com.inmobi.media.O4.a();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
