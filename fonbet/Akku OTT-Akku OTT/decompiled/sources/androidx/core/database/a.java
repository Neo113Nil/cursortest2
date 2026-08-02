package androidx.core.database;

import com.facebook.appevents.integrity.h;
import com.facebook.internal.C0715k;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import com.google.android.gms.internal.measurement.zzlm;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements C0715k.a {
    public static int a(int i, int i2, int i3) {
        return zzlm.zzz(i) + i2 + i3;
    }

    public static String c(long j, String str) {
        return str + j;
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            h hVar = h.a;
            if (com.facebook.internal.instrument.crashshield.a.b(h.class)) {
                return;
            }
            try {
                if (h.b) {
                    return;
                }
                h hVar2 = h.a;
                hVar2.getClass();
                boolean z2 = false;
                if (!com.facebook.internal.instrument.crashshield.a.b(hVar2)) {
                    try {
                        n k = p.k(w.b(), false);
                        if (k != null) {
                            hVar2.a(k.s);
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, hVar2);
                    }
                }
                if (h.c.isEmpty()) {
                    if (!h.d.isEmpty()) {
                    }
                    h.b = z2;
                }
                z2 = true;
                h.b = z2;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, h.class);
            }
        }
    }
}
