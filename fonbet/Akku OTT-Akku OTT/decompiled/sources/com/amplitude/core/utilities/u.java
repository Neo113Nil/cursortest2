package com.amplitude.core.utilities;

import com.amplitude.core.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.internal.C1086c;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class u implements com.amplitude.core.k {
    public final ArrayList a = new ArrayList();
    public final Object b = new Object();
    public final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final List<Object> a() {
        List list;
        synchronized (this.b) {
            list = CollectionsKt.toList(this.a);
            this.a.clear();
            Unit unit = Unit.INSTANCE;
        }
        return CollectionsKt.listOf(list);
    }

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final Object b(Object obj, Continuation<? super String> continuation) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.amplitude.core.events.BaseEvent>");
        List events = (List) obj;
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            jSONArray.put(w.a((com.amplitude.core.events.a) it.next()));
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    @Override // com.amplitude.core.k, com.amplitude.core.utilities.n
    public final Object c(ContinuationImpl continuationImpl) {
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.k
    public final Unit d(k.a aVar, String str) {
        this.c.put(aVar.a, str);
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.k
    public final String f(k.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.c.get(key.a);
    }

    @Override // com.amplitude.core.k
    public final com.amplitude.core.utilities.http.h g(com.amplitude.core.platform.b eventPipeline, com.amplitude.android.h configuration, C1086c scope, C1101n0 storageDispatcher) {
        Intrinsics.checkNotNullParameter(eventPipeline, "eventPipeline");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storageDispatcher, "storageDispatcher");
        return new t(eventPipeline, configuration, scope, storageDispatcher);
    }

    @Override // com.amplitude.core.k
    public final Object h(com.amplitude.core.events.a aVar, ContinuationImpl continuationImpl) {
        synchronized (this.b) {
            this.a.add(aVar);
        }
        return Unit.INSTANCE;
    }
}
