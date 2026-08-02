package com.github.droibit.flutter.plugins.customtabs;

import android.util.Log;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class h {
    public static final List a(Throwable th) {
        if (th instanceof g) {
            g gVar = (g) th;
            return CollectionsKt.listOf(gVar.a, gVar.b, null);
        }
        return CollectionsKt.listOf((Object[]) new String[]{th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th)});
    }
}
