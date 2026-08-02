package com.amplitude.core.platform.intercept;

import com.amplitude.core.utilities.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public final class b implements c {
    public final u a;

    public b(u storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
    }

    @Override // com.amplitude.core.platform.intercept.c
    public final Object a(Continuation<? super com.amplitude.core.events.a> continuation) {
        List<Object> a = this.a.a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<com.amplitude.core.events.BaseEvent>>");
        if (a.isEmpty() || ((List) a.get(0)).isEmpty()) {
            return null;
        }
        List list = (List) a.get(0);
        com.amplitude.core.events.a aVar = (com.amplitude.core.events.a) list.get(0);
        Map<String, Object> map = aVar.Q;
        Intrinsics.checkNotNull(map);
        com.amplitude.core.events.d[] dVarArr = com.amplitude.core.events.d.a;
        Object obj = map.get("$set");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
        Map a2 = i.a(TypeIntrinsics.asMutableMap(obj));
        List events = list.subList(1, list.size());
        Intrinsics.checkNotNullParameter(events, "events");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            Map<String, Object> map2 = ((com.amplitude.core.events.a) it.next()).Q;
            Intrinsics.checkNotNull(map2);
            com.amplitude.core.events.d[] dVarArr2 = com.amplitude.core.events.d.a;
            Object obj2 = map2.get("$set");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            linkedHashMap.putAll(i.a(TypeIntrinsics.asMutableMap(obj2)));
        }
        a2.putAll(linkedHashMap);
        Map<String, Object> map3 = aVar.Q;
        Intrinsics.checkNotNull(map3);
        map3.put("$set", a2);
        return aVar;
    }

    @Override // com.amplitude.core.platform.intercept.c
    public final Object b(Continuation<? super Unit> continuation) {
        u uVar = this.a;
        synchronized (uVar.b) {
            uVar.a.clear();
        }
        return Unit.INSTANCE;
    }
}
