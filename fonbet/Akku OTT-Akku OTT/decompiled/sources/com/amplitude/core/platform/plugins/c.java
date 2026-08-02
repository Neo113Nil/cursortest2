package com.amplitude.core.platform.plugins;

import com.amplitude.core.platform.k;
import com.amplitude.eventbridge.c;
import com.amplitude.eventbridge.d;
import com.amplitude.eventbridge.e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements k {
    public final k.a a = k.a.a;
    public d b;

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        com.amplitude.eventbridge.c cVar;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        c.a aVar = com.amplitude.eventbridge.c.Companion;
        String instanceName = amplitude.a.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        synchronized (com.amplitude.eventbridge.c.b) {
            try {
                LinkedHashMap linkedHashMap = com.amplitude.eventbridge.c.c;
                Object obj = linkedHashMap.get(instanceName);
                if (obj == null) {
                    obj = new com.amplitude.eventbridge.c();
                    linkedHashMap.put(instanceName, obj);
                }
                cVar = (com.amplitude.eventbridge.c) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = cVar.a;
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        com.amplitude.eventbridge.b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.Q != null) {
            d dVar = this.b;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventBridge");
                dVar = null;
            }
            e channel = e.a;
            Intrinsics.checkNotNullParameter(event, "<this>");
            com.amplitude.eventbridge.a event2 = new com.amplitude.eventbridge.a(event.a(), event.P, event.Q, event.R, event.S);
            dVar.getClass();
            Intrinsics.checkNotNullParameter(channel, "channel");
            Intrinsics.checkNotNullParameter(event2, "event");
            synchronized (dVar.a) {
                try {
                    LinkedHashMap linkedHashMap = dVar.b;
                    Object obj = linkedHashMap.get(channel);
                    if (obj == null) {
                        obj = new com.amplitude.eventbridge.b(channel);
                        linkedHashMap.put(channel, obj);
                    }
                    bVar = (com.amplitude.eventbridge.b) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Intrinsics.checkNotNullParameter(event2, "event");
            synchronized (bVar.b) {
                bVar.c.offer(event2);
            }
        }
        return event;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }
}
