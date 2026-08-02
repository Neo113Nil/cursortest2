package d3;

import android.content.Context;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.g;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960a extends l {

    /* renamed from: a, reason: collision with root package name */
    public static int f12389a = 1;

    public final synchronized int c() {
        int i7;
        try {
            i7 = f12389a;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
                int d7 = cVar.d(applicationContext, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (d7 == 0) {
                    i7 = 4;
                    f12389a = 4;
                } else if (cVar.a(applicationContext, d7, null) != null || p3.d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f12389a = 2;
                } else {
                    i7 = 3;
                    f12389a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }
}
