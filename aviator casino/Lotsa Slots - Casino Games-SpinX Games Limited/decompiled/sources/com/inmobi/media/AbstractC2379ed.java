package com.inmobi.media;

/* renamed from: com.inmobi.media.ed, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2379ed {
    public static final java.util.List a(com.inmobi.media.C2304bh c2304bh) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2304bh, "<this>");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(c2304bh.b, (short) 0), kotlin.TuplesKt.to(c2304bh.f5125a.getTitleView(), (short) 3), kotlin.TuplesKt.to(c2304bh.f5125a.getDescriptionView(), (short) 4), kotlin.TuplesKt.to(c2304bh.f5125a.getIconView(), (short) 5), kotlin.TuplesKt.to(c2304bh.f5125a.getCtaView(), (short) 6), kotlin.TuplesKt.to(c2304bh.c, (short) 7), kotlin.TuplesKt.to(c2304bh.f5125a.getRatingView(), (short) 8), kotlin.TuplesKt.to(c2304bh.f5125a.getAdvertiserView(), (short) 9)});
    }

    public static final void a(com.inmobi.media.C2304bh c2304bh, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2304bh, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("NativeRenderedState", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
        if (interfaceC2772t9 == null) {
            return;
        }
        java.util.List<kotlin.Pair> a2 = a(c2304bh);
        android.view.ViewGroup parentView = c2304bh.f5125a.getParentView();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (kotlin.Pair pair : a2) {
            android.view.View view = (android.view.View) pair.component1();
            short shortValue = ((java.lang.Number) pair.component2()).shortValue();
            if (view != null) {
                boolean z = view.getVisibility() == 0;
                jSONArray.put(((int) shortValue) + " - " + z + io.ktor.sse.ServerSentEventKt.SPACE + com.inmobi.media.Mn.a(view, parentView));
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("NativeRenderedState", jSONArray2);
    }
}
