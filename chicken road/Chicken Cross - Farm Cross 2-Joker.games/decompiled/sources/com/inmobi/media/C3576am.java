package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3576am {

    /* renamed from: a, reason: collision with root package name */
    public final String f7016a;
    public final String b;

    public C3576am(String tableName, String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.f7016a = tableName;
        this.b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3576am)) {
            return false;
        }
        C3576am c3576am = (C3576am) obj;
        return Intrinsics.areEqual(this.f7016a, c3576am.f7016a) && Intrinsics.areEqual(this.b, c3576am.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7016a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f7016a + ", tableSchema=" + this.b + ")";
    }
}
