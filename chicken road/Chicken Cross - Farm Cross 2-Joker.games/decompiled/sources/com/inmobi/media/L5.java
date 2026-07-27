package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6688a;
    public final ArrayList b;
    public final int c;
    public final ExecutorService d;

    public L5(Context context, ArrayList tableInfos, int i, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter("com.im_11.4.0.db", "name");
        Intrinsics.checkNotNullParameter(tableInfos, "tableInfos");
        this.f6688a = context;
        this.b = tableInfos;
        this.c = i;
        this.d = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l5 = (L5) obj;
        return Intrinsics.areEqual(this.f6688a, l5.f6688a) && Intrinsics.areEqual("com.im_11.4.0.db", "com.im_11.4.0.db") && Intrinsics.areEqual(this.b, l5.b) && this.c == l5.c && Intrinsics.areEqual(this.d, l5.d);
    }

    public final int hashCode() {
        int a2 = Hj.a(this.c, (this.b.hashCode() + Hj.a(1, (((this.f6688a == null ? 0 : r0.hashCode()) * 31) - 1930424842) * 31, 31)) * 31, 31);
        ExecutorService executorService = this.d;
        return a2 + (executorService != null ? executorService.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f6688a + ", name=com.im_11.4.0.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + this.d + ")";
    }
}
