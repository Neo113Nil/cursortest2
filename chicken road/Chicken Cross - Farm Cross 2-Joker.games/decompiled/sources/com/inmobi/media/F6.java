package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F6 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6550a;
    public final String b;

    public F6(String payload, ArrayList eventIDs) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f6550a = eventIDs;
        this.b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f6 = (F6) obj;
        return Intrinsics.areEqual(this.f6550a, f6.f6550a) && Intrinsics.areEqual(this.b, f6.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.f6550a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.f6550a + ", payload=" + this.b + ", shouldFlushOnFailure=false)";
    }
}
