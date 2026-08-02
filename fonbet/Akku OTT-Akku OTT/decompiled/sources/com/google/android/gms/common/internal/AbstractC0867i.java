package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.C0852b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0867i {
    public static final Object a = new Object();

    @Nullable
    public static m0 b;

    @Nullable
    @VisibleForTesting
    public static HandlerThread c;

    @NonNull
    public static m0 a(@NonNull Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new m0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public abstract C0852b b(j0 j0Var, c0 c0Var, String str, @Nullable Executor executor);

    public abstract void c(j0 j0Var, ServiceConnection serviceConnection);
}
