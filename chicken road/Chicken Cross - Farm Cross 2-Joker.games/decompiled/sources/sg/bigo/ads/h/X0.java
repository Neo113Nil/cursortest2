package sg.bigo.ads.h;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public long f12862a;
    public boolean b;
    public boolean c;
    public final HashMap d = new HashMap();

    public static int a(int i, boolean z) {
        if (i == 1) {
            return z ? 2 : 1;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        return i == 5 ? 6 : 0;
    }

    public final void a(sg.bigo.ads.P.c cVar, int i, String str, int i2, int i3, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = (str + i2).hashCode();
        Long l = (Long) this.d.get(Integer.valueOf(hashCode));
        if (l == null) {
            return;
        }
        sg.bigo.ads.s1.b.a(cVar, a(i, false), 6, String.valueOf(hashCode), SystemClock.elapsedRealtime() - l.longValue(), true, i3, str2);
    }

    public final void b(int i, int i2, String str, sg.bigo.ads.P.c cVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = (str + i2).hashCode();
        if (((Long) this.d.get(Integer.valueOf(hashCode))) == null) {
            this.d.put(Integer.valueOf(hashCode), Long.valueOf(SystemClock.elapsedRealtime()));
            sg.bigo.ads.s1.b.a(cVar, a(i, false), 1, String.valueOf(hashCode), 0L, false, 0, (String) null);
        }
    }

    public final void a(int i, int i2, String str, sg.bigo.ads.P.c cVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = (str + i2).hashCode();
        Long l = (Long) this.d.get(Integer.valueOf(hashCode));
        if (l == null) {
            return;
        }
        sg.bigo.ads.s1.b.a(cVar, a(i, false), 5, String.valueOf(hashCode), SystemClock.elapsedRealtime() - l.longValue(), false, 0, (String) null);
    }

    public final void a(sg.bigo.ads.P.c cVar, boolean z, int i, String str) {
        if (this.c || this.f12862a <= 0) {
            return;
        }
        this.c = true;
        sg.bigo.ads.s1.b.a(cVar, a(1, z), 4, (String) null, SystemClock.elapsedRealtime() - this.f12862a, true, i, str);
    }
}
