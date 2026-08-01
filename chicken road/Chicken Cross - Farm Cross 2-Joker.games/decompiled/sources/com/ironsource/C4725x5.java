package com.ironsource;

import com.ironsource.E0;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4725x5 implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8756a;
    private final E0 b;
    private final List<D0> c;
    private final X8 d;
    private final C4731xb e;
    private final C4485jg f;
    private final R1 g;
    private final O h;
    private final C4557ng i;
    private final Sc j;

    public C4725x5(IronSource.a adFormat, E0.b level, List<? extends D0> eventsInterfaces, AbstractC4455i3 abstractC4455i3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f8756a = adFormat;
        E0 e0 = new E0(adFormat, level, this, abstractC4455i3);
        this.b = e0;
        this.c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        X8 x8 = e0.e;
        Intrinsics.checkNotNullExpressionValue(x8, "wrapper.init");
        this.d = x8;
        C4731xb c4731xb = e0.f;
        Intrinsics.checkNotNullExpressionValue(c4731xb, "wrapper.load");
        this.e = c4731xb;
        C4485jg c4485jg = e0.g;
        Intrinsics.checkNotNullExpressionValue(c4485jg, "wrapper.token");
        this.f = c4485jg;
        R1 r1 = e0.h;
        Intrinsics.checkNotNullExpressionValue(r1, "wrapper.auction");
        this.g = r1;
        O o = e0.i;
        Intrinsics.checkNotNullExpressionValue(o, "wrapper.adInteraction");
        this.h = o;
        C4557ng c4557ng = e0.j;
        Intrinsics.checkNotNullExpressionValue(c4557ng, "wrapper.troubleshoot");
        this.i = c4557ng;
        Sc sc = e0.k;
        Intrinsics.checkNotNullExpressionValue(sc, "wrapper.operational");
        this.j = sc;
    }

    public final O a() {
        return this.h;
    }

    public final R1 b() {
        return this.g;
    }

    public final List<D0> c() {
        return this.c;
    }

    public final X8 d() {
        return this.d;
    }

    public final C4731xb e() {
        return this.e;
    }

    public final Sc f() {
        return this.j;
    }

    public final C4485jg g() {
        return this.f;
    }

    public final C4557ng h() {
        return this.i;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        Iterator<D0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> a2 = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(a2, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a2);
        }
        return hashMap;
    }

    public /* synthetic */ C4725x5(IronSource.a aVar, E0.b bVar, List list, AbstractC4455i3 abstractC4455i3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC4455i3);
    }

    public final void a(D0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f8756a == IronSource.a.BANNER) {
                this.e.d();
            } else {
                this.e.a(false);
            }
        }
    }
}
