package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends f {
    public final com.google.android.datatransport.runtime.time.a a;
    public final HashMap b;

    public b(com.google.android.datatransport.runtime.time.a aVar, HashMap hashMap) {
        this.a = aVar;
        this.b = hashMap;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.f
    public final com.google.android.datatransport.runtime.time.a a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.f
    public final Map<com.google.android.datatransport.e, f.a> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a()) && this.b.equals(fVar.c());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
