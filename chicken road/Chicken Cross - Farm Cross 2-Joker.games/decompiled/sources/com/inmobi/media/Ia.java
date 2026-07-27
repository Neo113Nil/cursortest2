package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ia {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f6623a;
    public final JSONArray b;
    public final C4019qc c;

    public Ia(JSONObject vitals, JSONArray logs, C4019qc data) {
        Intrinsics.checkNotNullParameter(vitals, "vitals");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f6623a = vitals;
        this.b = logs;
        this.c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return false;
        }
        Ia ia = (Ia) obj;
        return Intrinsics.areEqual(this.f6623a, ia.f6623a) && Intrinsics.areEqual(this.b, ia.b) && Intrinsics.areEqual(this.c, ia.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6623a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f6623a + ", logs=" + this.b + ", data=" + this.c + ")";
    }
}
