package com.inmobi.media;

/* renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2333ci implements com.inmobi.media.N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5143a;

    public C2333ci(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5143a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a(com.inmobi.media.I6 metrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "metrics");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5143a;
        float f = metrics.f4758a;
        com.inmobi.media.J6 j6 = metrics.b;
        java.lang.Object obj = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.lang.Object a2 = j6 != null ? com.inmobi.media.K6.a(j6) : kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.util.ArrayList arrayList = metrics.c;
        if (arrayList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.inmobi.media.K6.a((com.inmobi.media.J6) it.next()));
            }
            obj = new org.json.JSONArray((java.util.Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC2675pi.h("window.mraidview.broadcastEvent('exposureChange', " + f + ", " + a2 + ", " + obj + ");");
    }
}
