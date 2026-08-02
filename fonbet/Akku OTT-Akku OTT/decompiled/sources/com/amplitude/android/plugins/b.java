package com.amplitude.android.plugins;

import com.amplitude.analytics.connector.a;
import com.amplitude.core.platform.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b implements k {
    public static final a Companion = new a();
    public final k.a a = k.a.a;
    public com.amplitude.analytics.connector.a b;

    public static final class a {
    }

    /* renamed from: com.amplitude.android.plugins.b$b, reason: collision with other inner class name */
    public static final class C0037b extends Lambda implements Function1<com.amplitude.analytics.connector.b, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.amplitude.analytics.connector.b bVar) {
            com.amplitude.analytics.connector.b bVar2 = bVar;
            Intrinsics.checkNotNullParameter(bVar2, "<name for destructuring parameter 0>");
            bVar2.getClass();
            com.amplitude.core.events.a aVar = new com.amplitude.core.events.a();
            Intrinsics.checkNotNullParameter(null, "<set-?>");
            aVar.O = null;
            throw null;
        }
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        String str = amplitude.a.e;
        com.amplitude.analytics.connector.a.Companion.getClass();
        com.amplitude.analytics.connector.a a2 = a.C0033a.a(str);
        this.b = a2;
        com.amplitude.analytics.connector.c cVar = a2.b;
        C0037b c0037b = new C0037b(1);
        synchronized (cVar.a) {
            arrayList = new ArrayList();
            cVar.b.drainTo(arrayList);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            c0037b.invoke((com.amplitude.analytics.connector.b) it.next());
            throw null;
        }
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> map = event.Q;
        if (map == null || map.isEmpty() || Intrinsics.areEqual(event.a(), "$exposure")) {
            return event;
        }
        HashMap actions = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                try {
                    actions.put(key, (Map) value);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                }
            }
        }
        com.amplitude.analytics.connector.a aVar = this.b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connector");
            aVar = null;
        }
        com.amplitude.analytics.connector.e eVar = aVar.a;
        ReentrantReadWriteLock.ReadLock readLock = eVar.a.readLock();
        readLock.lock();
        try {
            com.amplitude.analytics.connector.d dVar = eVar.b;
            readLock.unlock();
            String str = dVar.a;
            String str2 = dVar.b;
            Map<String, Object> map2 = dVar.c;
            Intrinsics.checkNotNullParameter(actions, "actions");
            Map mutableMap = MapsKt.toMutableMap(map2);
            for (Map.Entry entry2 : actions.entrySet()) {
                String str3 = (String) entry2.getKey();
                Map map3 = (Map) entry2.getValue();
                int hashCode = str3.hashCode();
                if (hashCode != 1186238) {
                    if (hashCode != 146417720) {
                        if (hashCode == 1142092165 && str3.equals("$unset")) {
                            Iterator it = map3.entrySet().iterator();
                            while (it.hasNext()) {
                                mutableMap.remove(((Map.Entry) it.next()).getKey());
                            }
                        }
                    } else if (str3.equals("$clearAll")) {
                        mutableMap.clear();
                    }
                } else if (str3.equals("$set")) {
                    mutableMap.putAll(map3);
                }
            }
            eVar.a(new com.amplitude.analytics.connector.d(str, str2, (Map<String, ? extends Object>) mutableMap));
            return event;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }
}
