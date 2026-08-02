package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.dynamite.DynamiteModule;

@Deprecated
/* loaded from: classes4.dex */
public final class a extends g<GoogleSignInOptions> {

    @VisibleForTesting
    public static int a = 1;

    public final synchronized int a() {
        int i;
        try {
            i = a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                C0855e c0855e = C0855e.d;
                int c = c0855e.c(applicationContext, 12451000);
                if (c == 0) {
                    i = 4;
                    a = 4;
                } else if (c0855e.a(applicationContext, c, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    a = 2;
                } else {
                    i = 3;
                    a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
