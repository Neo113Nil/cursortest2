package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MemoryEventFilter.java */
/* loaded from: classes6.dex */
public class n implements f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f9996a = new ConcurrentHashMap<>();

    /* compiled from: MemoryEventFilter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f9997a;

        public a(boolean z) {
            this.f9997a = z;
        }

        public boolean a() {
            return this.f9997a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String g = eVar.g();
                if (this.f9996a.containsKey(g)) {
                    aVar = this.f9996a.get(g);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(g));
                    this.f9996a.put(g, aVar2);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    return aVar.a();
                }
                return false;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e);
                }
            }
        }
        return false;
    }
}
