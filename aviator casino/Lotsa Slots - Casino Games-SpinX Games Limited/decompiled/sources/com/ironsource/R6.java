package com.ironsource;

/* loaded from: classes5.dex */
public final class R6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.T9 f5946a;

    public R6(com.ironsource.T9 globalDataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f5946a = globalDataWriter;
    }

    public final void a(org.json.JSONObject metaDataJson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.i)) {
            try {
                java.lang.Object remove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.i);
                kotlin.jvm.internal.Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList = (java.util.ArrayList) remove;
                if (arrayList.isEmpty()) {
                    return;
                }
                java.lang.Object obj = arrayList.get(0);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.f5946a.e((java.lang.String) obj);
            } catch (java.lang.ClassCastException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
