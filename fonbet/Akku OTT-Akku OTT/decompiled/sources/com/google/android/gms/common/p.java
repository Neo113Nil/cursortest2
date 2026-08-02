package com.google.android.gms.common;

import android.util.Log;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class p {
    public static final List a(Throwable th) {
        if (th instanceof fman.ge.smart_auth.b) {
            fman.ge.smart_auth.b bVar = (fman.ge.smart_auth.b) th;
            return CollectionsKt.listOf(bVar.a, bVar.b, bVar.c);
        }
        return CollectionsKt.listOf((Object[]) new String[]{th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th)});
    }

    public static int b(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
