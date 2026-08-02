package com.amplitude.core.platform;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {
    public final o a;
    public final com.amplitude.core.events.a b;

    public n(o type, com.amplitude.core.events.a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && Intrinsics.areEqual(this.b, nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.amplitude.core.events.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + this.a + ", event=" + this.b + ')';
    }
}
