package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface M4 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f7787a;

        public a(String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.f7787a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7787a.put(key, value);
        }

        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.f7787a);
        }
    }

    void a(EnumC4707w5 enumC4707w5, Be be);

    void a(EnumC4707w5 enumC4707w5, String str);

    public static final class b implements M4 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4745y7 f7788a;
        private final a b;

        public b(InterfaceC4745y7 eventManager, a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f7788a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.M4
        public void a(EnumC4707w5 eventName, String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> a2 = this.b.a();
            a2.put("spId", instanceId);
            this.f7788a.a(new C4689v5(eventName, new JSONObject(MapsKt.toMap(a2))));
        }

        @Override // com.ironsource.M4
        public void a(EnumC4707w5 eventName, Be be) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> a2 = this.b.a();
            if (be != null) {
                a2.put(IronSourceConstants.EVENTS_EXT1, be.toString());
            }
            this.f7788a.a(new C4689v5(eventName, new JSONObject(MapsKt.toMap(a2))));
        }
    }
}
