package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final net.idrnd.face.iad.capture.internal.n0 f6985a;

    public m0(net.idrnd.face.iad.capture.internal.n0 n0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "");
        this.f6985a = n0Var;
    }

    public final java.util.ArrayList a(net.idrnd.face.iad.capture.internal.u2 u2Var, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u2Var, "");
        if (i2 < 0 || i2 >= 101) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = u2Var.b;
        int i4 = u2Var.c;
        int i5 = i / 2;
        int i6 = i3 / 2;
        int i7 = i3 - i5;
        int i8 = i4 / 2;
        int i9 = i4 - i5;
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.CENTER_TOP, net.idrnd.face.iad.capture.internal.y1.c().a(i6).b(i5)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.CENTER_CENTER, net.idrnd.face.iad.capture.internal.y1.c().a(i6).b(i8)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.CENTER_BOTTOM, net.idrnd.face.iad.capture.internal.y1.c().a(i6).b(i9)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.LEFT_TOP, net.idrnd.face.iad.capture.internal.y1.c().a(i5).b(i5)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.LEFT_CENTER, net.idrnd.face.iad.capture.internal.y1.c().a(i5).b(i8)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.LEFT_BOTTOM, net.idrnd.face.iad.capture.internal.y1.c().a(i5).b(i9)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.RIGHT_TOP, net.idrnd.face.iad.capture.internal.y1.c().a(i7).b(i5)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.RIGHT_CENTER, net.idrnd.face.iad.capture.internal.y1.c().a(i7).b(i8)), kotlin.TuplesKt.to(net.idrnd.face.iad.capture.internal.c1.RIGHT_BOTTOM, net.idrnd.face.iad.capture.internal.y1.c().a(i7).b(i9)));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(mapOf.size()));
        for (java.util.Map.Entry entry : mapOf.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            com.google.protobuf.GeneratedMessageLite build = ((net.idrnd.face.iad.capture.internal.x1) value).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            net.idrnd.face.iad.capture.internal.y1 y1Var = (net.idrnd.face.iad.capture.internal.y1) build;
            linkedHashMap.put(key, new android.graphics.Rect(y1Var.a() - i5, y1Var.b() - i5, y1Var.a() + i5, y1Var.b() + i5));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            net.idrnd.face.iad.capture.internal.c1 c1Var = (net.idrnd.face.iad.capture.internal.c1) entry2.getKey();
            android.graphics.Rect rect = (android.graphics.Rect) entry2.getValue();
            arrayList.add((net.idrnd.face.iad.capture.internal.k1) net.idrnd.face.iad.capture.internal.k1.a().a(com.google.protobuf.kotlin.ByteStringsKt.toByteString(this.f6985a.a(u2Var, i2, rect))).a(net.idrnd.face.iad.capture.internal.c2.a().b(i).a(i)).a(net.idrnd.face.iad.capture.internal.y1.c().a(rect.left).b(rect.top)).a(c1Var).build());
        }
        return arrayList;
    }
}
