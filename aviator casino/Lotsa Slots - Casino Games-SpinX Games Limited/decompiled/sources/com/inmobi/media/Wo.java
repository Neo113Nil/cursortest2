package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wo extends com.inmobi.media.D2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f5040a;
    public final java.util.List b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public /* synthetic */ Wo(java.util.Map map, java.util.ArrayList arrayList, int i) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : arrayList);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Wo)) {
            return false;
        }
        com.inmobi.media.Wo wo = (com.inmobi.media.Wo) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5040a, wo.f5040a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, wo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5040a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "WithExtras(macros=" + this.f5040a + ", trackers=" + this.b + ")";
    }

    public Wo(java.util.Map macros, java.util.List trackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f5040a = macros;
        this.b = trackers;
    }
}
