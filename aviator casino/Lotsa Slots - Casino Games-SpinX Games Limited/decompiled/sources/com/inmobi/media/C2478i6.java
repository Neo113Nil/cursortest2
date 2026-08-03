package com.inmobi.media;

/* renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2478i6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f5254a;
    public final java.lang.String b;

    public C2478i6(java.lang.String payload, java.util.ArrayList eventIDs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.f5254a = eventIDs;
        this.b = payload;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2478i6)) {
            return false;
        }
        com.inmobi.media.C2478i6 c2478i6 = (com.inmobi.media.C2478i6) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5254a, c2478i6.f5254a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2478i6.b);
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(false) + ((this.b.hashCode() + (this.f5254a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "EventPayload(eventIDs=" + this.f5254a + ", payload=" + this.b + ", shouldFlushOnFailure=false)";
    }
}
