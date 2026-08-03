package com.ironsource;

/* loaded from: classes5.dex */
public interface P4 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.Map<java.lang.String, java.lang.Object> f5918a;

        public a(java.lang.String providerName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.f5918a = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, providerName), kotlin.TuplesKt.to(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(java.lang.String key, java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f5918a.put(key, value);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> a() {
            return kotlin.collections.MapsKt.toMutableMap(this.f5918a);
        }
    }

    void a(com.ironsource.EnumC3378y5 enumC3378y5, com.ironsource.De de);

    void a(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.String str);

    public static final class b implements com.ironsource.P4 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.B7 f5919a;
        private final com.ironsource.P4.a b;

        public b(com.ironsource.B7 eventManager, com.ironsource.P4.a eventBaseData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f5919a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.P4
        public void a(com.ironsource.EnumC3378y5 eventName, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            java.util.Map<java.lang.String, java.lang.Object> a2 = this.b.a();
            a2.put("spId", instanceId);
            this.f5919a.a(new com.ironsource.C3360x5(eventName, new org.json.JSONObject(kotlin.collections.MapsKt.toMap(a2))));
        }

        @Override // com.ironsource.P4
        public void a(com.ironsource.EnumC3378y5 eventName, com.ironsource.De de) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            java.util.Map<java.lang.String, java.lang.Object> a2 = this.b.a();
            if (de != null) {
                a2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, de.toString());
            }
            this.f5919a.a(new com.ironsource.C3360x5(eventName, new org.json.JSONObject(kotlin.collections.MapsKt.toMap(a2))));
        }
    }
}
