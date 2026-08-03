package com.inmobi.media;

/* renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2351da {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f5158a;
    public final org.json.JSONArray b;
    public final com.inmobi.media.C2904yb c;

    public C2351da(org.json.JSONObject vitals, org.json.JSONArray logs, com.inmobi.media.C2904yb data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitals, "vitals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.f5158a = vitals;
        this.b = logs;
        this.c = data;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2351da)) {
            return false;
        }
        com.inmobi.media.C2351da c2351da = (com.inmobi.media.C2351da) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5158a, c2351da.f5158a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2351da.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2351da.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5158a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "IncompleteLogData(vitals=" + this.f5158a + ", logs=" + this.b + ", data=" + this.c + ")";
    }
}
