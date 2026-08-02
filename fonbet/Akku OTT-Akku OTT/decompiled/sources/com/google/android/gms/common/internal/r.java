package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class r {

    @Nullable
    public static r b;
    public static final C0876s c = new C0876s(0, false, false, 0, 0);

    @Nullable
    public C0876s a;

    @NonNull
    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (b == null) {
                    b = new r();
                }
                rVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
