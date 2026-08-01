package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Tq extends Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6880a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public /* synthetic */ Tq(Map map, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? CollectionsKt.emptyList() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tq)) {
            return false;
        }
        Tq tq = (Tq) obj;
        return Intrinsics.areEqual(this.f6880a, tq.f6880a) && Intrinsics.areEqual(this.b, tq.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6880a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.f6880a + ", trackers=" + this.b + ")";
    }

    public Tq(Map macros, List trackers) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f6880a = macros;
        this.b = trackers;
    }
}
