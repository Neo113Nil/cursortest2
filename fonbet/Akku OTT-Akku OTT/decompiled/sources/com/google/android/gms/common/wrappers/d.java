package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class d {
    public static final d b;

    @Nullable
    public c a;

    static {
        d dVar = new d();
        dVar.a = null;
        b = dVar;
    }

    @NonNull
    public static c a(@NonNull Context context) {
        c cVar;
        d dVar = b;
        synchronized (dVar) {
            try {
                if (dVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    dVar.a = new c(context);
                }
                cVar = dVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
