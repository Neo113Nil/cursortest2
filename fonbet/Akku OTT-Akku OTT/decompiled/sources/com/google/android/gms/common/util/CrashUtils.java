package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean addDynamiteErrorToDropBox(@NonNull Context context, @NonNull Throwable th) {
        try {
            C0875q.g(context);
            C0875q.g(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
