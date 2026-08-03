package com.inmobi.media;

/* renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2387ek {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5184a;
    public final java.lang.String b;

    public C2387ek(java.lang.String tableName, java.lang.String tableSchema) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.f5184a = tableName;
        this.b = tableSchema;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2387ek)) {
            return false;
        }
        com.inmobi.media.C2387ek c2387ek = (com.inmobi.media.C2387ek) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5184a, c2387ek.f5184a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2387ek.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5184a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TableInfo(tableName=" + this.f5184a + ", tableSchema=" + this.b + ")";
    }
}
