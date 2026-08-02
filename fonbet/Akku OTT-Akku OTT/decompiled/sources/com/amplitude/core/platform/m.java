package com.amplitude.core.platform;

import com.amplitude.core.platform.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTimeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeline.kt\ncom/amplitude/core/platform/Timeline\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,74:1\n215#2,2:75\n215#2,2:77\n*S KotlinDebug\n*F\n+ 1 Timeline.kt\ncom/amplitude/core/platform/Timeline\n*L\n59#1:75,2\n69#1:77,2\n*E\n"})
/* loaded from: classes3.dex */
public class m {
    public final Map<k.a, i> a = MapsKt.mapOf(TuplesKt.to(k.a.a, new i(null)), TuplesKt.to(k.a.b, new i(null)), TuplesKt.to(k.a.c, new i(null)), TuplesKt.to(k.a.d, new i(null)));
    public com.amplitude.core.b b;

    public final void a(k plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.c(c());
        i iVar = this.a.get(plugin.getType());
        if (iVar != null) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            iVar.a.add(plugin);
        }
    }

    public final com.amplitude.core.events.a b(k.a type, com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(type, "type");
        i iVar = this.a.get(type);
        if (event == null) {
            return event;
        }
        if (iVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<k> it = iVar.a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (event != null) {
                if (next instanceof a) {
                    try {
                        ((a) next).i(event);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (next instanceof h) {
                    event = next.f(event);
                    if (event instanceof com.amplitude.core.events.c) {
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.amplitude.core.events.IdentifyEvent");
                        event = ((h) next).a((com.amplitude.core.events.c) event);
                    } else if (event instanceof com.amplitude.core.events.b) {
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.amplitude.core.events.GroupIdentifyEvent");
                        event = ((h) next).g((com.amplitude.core.events.b) event);
                    } else if (event instanceof com.amplitude.core.events.g) {
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.amplitude.core.events.RevenueEvent");
                        event = ((h) next).d((com.amplitude.core.events.g) event);
                    } else if (event != null) {
                        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.amplitude.core.events.BaseEvent");
                        event = ((h) next).e(event);
                    }
                } else {
                    event = next.f(event);
                }
            }
        }
        return event;
    }

    public final com.amplitude.core.b c() {
        com.amplitude.core.b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    public void d(com.amplitude.core.events.a incomingEvent) {
        Intrinsics.checkNotNullParameter(incomingEvent, "incomingEvent");
        if (c().a.f) {
            return;
        }
        b(k.a.c, b(k.a.b, b(k.a.a, incomingEvent)));
    }
}
