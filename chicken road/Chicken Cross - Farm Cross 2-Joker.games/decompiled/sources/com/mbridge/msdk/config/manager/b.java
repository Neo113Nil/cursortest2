package com.mbridge.msdk.config.manager;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ComponentSDKInitManager.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f9118a = new AtomicBoolean(false);

    public static void a(Context context, Map<String, Object> map, final com.mbridge.msdk.config.manager.callback.a aVar) {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            if (c.n().d() == null) {
                c.n().b(context);
            }
            if (!MBDownloadManager.getInstance().isInitialize()) {
                v0.f();
            }
            if (aVar == null) {
                try {
                    Object obj = map.get("callback");
                    if (obj instanceof com.mbridge.msdk.config.manager.callback.a) {
                        aVar = (com.mbridge.msdk.config.manager.callback.a) obj;
                    }
                } catch (Throwable th) {
                    q0.b("ComponentSDKInitManager", th.getMessage());
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("callback", new com.mbridge.msdk.config.manager.callback.a() { // from class: com.mbridge.msdk.config.manager.b$$ExternalSyntheticLambda0
                @Override // com.mbridge.msdk.config.manager.callback.a
                public final void a(Map map2) {
                    b.a(com.mbridge.msdk.config.manager.callback.a.this, currentTimeMillis, map2);
                }
            });
            if (map == null) {
                map = new HashMap<>();
            }
            HashMap hashMap2 = new HashMap(map);
            if (!hashMap2.containsKey("app_id")) {
                hashMap2.put("app_id", com.mbridge.msdk.config.component.common.util.b.a(context).a("app_id", ""));
            }
            if (!hashMap2.containsKey(MBridgeConstans.APP_KEY)) {
                hashMap2.put(MBridgeConstans.APP_KEY, com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_KEY, ""));
            }
            hashMap2.put("sdk_context", hashMap);
            a.c().a(com.mbridge.msdk.config.component.common.util.c.a(), "c0", hashMap2);
            if (a.c().d()) {
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_sdk_init_start", new HashMap());
            }
        } catch (Throwable th2) {
            q0.b("ComponentSDKInitManager", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.mbridge.msdk.config.manager.callback.a aVar, long j, Map map) {
        String str;
        f9118a.compareAndSet(false, true);
        a.c().f.set(2);
        a.c().k.get().a((com.mbridge.msdk.config.component.common.util.a<Integer>) 2);
        if (map != null) {
            Object obj = map.get("init_status");
            int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 1;
            Object obj2 = map.get("reason");
            if (!(obj2 instanceof String)) {
                str = "";
            } else {
                str = String.valueOf(obj2);
            }
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", Integer.valueOf(intValue));
                hashMap.put("reason", str);
                hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - j));
                aVar.a(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("result", Integer.valueOf(intValue));
            hashMap2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - j));
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_sdk_init_end", hashMap2);
        }
    }
}
