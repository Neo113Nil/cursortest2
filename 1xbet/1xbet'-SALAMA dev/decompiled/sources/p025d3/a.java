package p025d3;

import android.content.Context;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.c;
import p113p3.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12395a = 1;

    public final synchronized int c() {
        int i7;
        try {
            i7 = f12395a;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                c cVar = c.f11215d;
                int iD = cVar.d(applicationContext, 12451000);
                if (iD == 0) {
                    i7 = 4;
                    f12395a = 4;
                } else if (cVar.a(applicationContext, iD, null) != null || d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f12395a = 2;
                } else {
                    i7 = 3;
                    f12395a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }
}
