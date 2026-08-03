package com.inmobi.media;

/* renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2635o5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5367a;
    public final java.util.ArrayList b;
    public final int c;
    public final java.util.concurrent.ExecutorService d;

    public C2635o5(android.content.Context context, java.util.ArrayList tableInfos, int i, java.util.concurrent.ExecutorService executorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("com.im_11.2.0.db", "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableInfos, "tableInfos");
        this.f5367a = context;
        this.b = tableInfos;
        this.c = i;
        this.d = executorService;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2635o5)) {
            return false;
        }
        com.inmobi.media.C2635o5 c2635o5 = (com.inmobi.media.C2635o5) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5367a, c2635o5.f5367a) && kotlin.jvm.internal.Intrinsics.areEqual("com.im_11.2.0.db", "com.im_11.2.0.db") && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2635o5.b) && this.c == c2635o5.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2635o5.d);
    }

    public final int hashCode() {
        int a2 = com.inmobi.media.AbstractC2755si.a(this.c, (this.b.hashCode() + com.inmobi.media.AbstractC2755si.a(1, (((this.f5367a == null ? 0 : r0.hashCode()) * 31) - 1987683144) * 31, 31)) * 31, 31);
        java.util.concurrent.ExecutorService executorService = this.d;
        return a2 + (executorService != null ? executorService.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "DatabaseConfig(context=" + this.f5367a + ", name=com.im_11.2.0.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + this.d + ")";
    }
}
