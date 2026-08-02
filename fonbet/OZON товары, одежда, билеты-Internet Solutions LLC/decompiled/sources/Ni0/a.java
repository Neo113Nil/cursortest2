package Ni0;

import Ai0.c;
import Bi0.f;
import Oi0.a;
import Qi0.d;
import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f19592a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ai0.a f19593b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f19594c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Ai0.a f19595d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Ai0.b f19596e;

    public a(@NotNull f sendTrackCampaignEvent, @NotNull Ai0.a sendEventV2, @NotNull c sendTrinityEvents, @NotNull Ai0.a sendCustomEvents, @NotNull Ai0.b sendPageViewEvent) {
        Intrinsics.checkNotNullParameter(sendTrackCampaignEvent, "sendTrackCampaignEvent");
        Intrinsics.checkNotNullParameter(sendEventV2, "sendEventV2");
        Intrinsics.checkNotNullParameter(sendTrinityEvents, "sendTrinityEvents");
        Intrinsics.checkNotNullParameter(sendCustomEvents, "sendCustomEvents");
        Intrinsics.checkNotNullParameter(sendPageViewEvent, "sendPageViewEvent");
        this.f19592a = sendTrackCampaignEvent;
        this.f19593b = sendEventV2;
        this.f19594c = sendTrinityEvents;
        this.f19595d = sendCustomEvents;
        this.f19596e = sendPageViewEvent;
    }

    private static Pi0.a a(Ai0.a aVar, Qi0.a aVar2, String str, Pi0.a aVar3) {
        List<Qi0.c> c11 = aVar2.c();
        ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
        for (Qi0.c cVar : c11) {
            Intrinsics.g(cVar, "null cannot be cast to non-null type ru.ozon.tracker.debug.menu.presentation.screen.events.vo.FieldInputVO");
            arrayList.add((Qi0.b) cVar);
        }
        if (arrayList.size() >= 2) {
            String b11 = ((Qi0.b) arrayList.get(0)).b();
            Integer w02 = h.w0(((Qi0.b) arrayList.get(1)).b());
            if (!h.K(b11) && w02 != null && w02.intValue() > 0) {
                aVar.a(b11, w02.intValue());
                return Pi0.a.a(aVar3, null, null, null, null, null, new d(w02.intValue() + " шт. " + str + " затрекано", str), 31);
            }
        }
        return aVar3;
    }

    @NotNull
    public final Pi0.a b(@NotNull a.h intent, @NotNull Pi0.a currentState) {
        String b11;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (Intrinsics.d(intent, a.h.d.f20423a)) {
            f fVar = this.f19592a;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            List<Qi0.c> c11 = currentState.f().c();
            ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
            for (Qi0.c cVar : c11) {
                Intrinsics.g(cVar, "null cannot be cast to non-null type ru.ozon.tracker.debug.menu.presentation.screen.events.vo.FieldInputVO");
                arrayList.add((Qi0.b) cVar);
            }
            if (arrayList.size() >= 3) {
                String b12 = ((Qi0.b) arrayList.get(0)).b();
                String b13 = ((Qi0.b) arrayList.get(1)).b();
                String b14 = ((Qi0.b) arrayList.get(2)).b();
                if (!h.K(b12)) {
                    fVar.a(b12, b13, b14);
                    return Pi0.a.a(currentState, null, null, null, null, null, new d("TrackCampaign затрекан", "TrackCampaignEvent"), 31);
                }
            }
            return currentState;
        }
        if (Intrinsics.d(intent, a.h.b.f20421a)) {
            return a(this.f19593b, currentState.c(), "EventV2", currentState);
        }
        if (!Intrinsics.d(intent, a.h.e.f20424a)) {
            if (Intrinsics.d(intent, a.h.C0417a.f20420a)) {
                return a(this.f19595d, currentState.b(), "CustomEvent", currentState);
            }
            if (!Intrinsics.d(intent, a.h.c.f20422a)) {
                throw new o();
            }
            List<Qi0.c> c12 = currentState.e().c();
            ArrayList arrayList2 = new ArrayList(C7714v.z(c12, 10));
            for (Qi0.c cVar2 : c12) {
                Intrinsics.g(cVar2, "null cannot be cast to non-null type ru.ozon.tracker.debug.menu.presentation.screen.events.vo.FieldInputVO");
                arrayList2.add((Qi0.b) cVar2);
            }
            if (arrayList2.size() >= 2) {
                String b15 = ((Qi0.b) arrayList2.get(0)).b();
                String b16 = ((Qi0.b) arrayList2.get(1)).b();
                if (!h.K(b15) || !h.K(b16)) {
                    this.f19596e.a(b15, b16);
                    return Pi0.a.a(currentState, null, null, null, null, null, new d("PageViewEvent затрекан", "PageViewEvent"), 31);
                }
            }
            return currentState;
        }
        List<Qi0.c> c13 = currentState.g().c();
        if (c13.size() >= 3) {
            Qi0.c cVar3 = c13.get(0);
            Qi0.b bVar = cVar3 instanceof Qi0.b ? (Qi0.b) cVar3 : null;
            String b17 = bVar != null ? bVar.b() : null;
            Qi0.c cVar4 = c13.get(1);
            Qi0.b bVar2 = cVar4 instanceof Qi0.b ? (Qi0.b) cVar4 : null;
            Integer w02 = (bVar2 == null || (b11 = bVar2.b()) == null) ? null : h.w0(b11);
            Qi0.c cVar5 = c13.get(2);
            Qi0.f fVar2 = cVar5 instanceof Qi0.f ? (Qi0.f) cVar5 : null;
            Boolean valueOf = fVar2 != null ? Boolean.valueOf(fVar2.c()) : null;
            if (b17 != null && !h.K(b17) && w02 != null && w02.intValue() > 0 && valueOf != null) {
                this.f19594c.a(w02.intValue(), b17, valueOf.booleanValue());
                return Pi0.a.a(currentState, null, null, null, null, null, new d(w02.intValue() + " шт. TrinityEvent затрекано", "TrinityEvent"), 31);
            }
        }
        return currentState;
    }
}
