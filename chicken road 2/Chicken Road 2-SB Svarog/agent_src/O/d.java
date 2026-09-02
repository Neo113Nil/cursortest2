package O;

import java.util.Locale;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f285a;

    /* renamed from: b, reason: collision with root package name */
    public int f286b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f287c;

    /* renamed from: d, reason: collision with root package name */
    public final C.e f288d;

    public d(H.b bVar) {
        C.e eVar = new C.e(bVar, "flutter/lifecycle", P.o.f371b, null);
        this.f285a = 0;
        this.f286b = 0;
        this.f287c = true;
        this.f288d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f285a;
        if (i4 == i2 && z2 == this.f287c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f287c = z2;
            return;
        }
        int a2 = AbstractC0071c.a(i2);
        if (a2 != 0) {
            if (a2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (a2 != 2 && a2 != 3 && a2 != 4) {
                i3 = 0;
            }
            this.f285a = i2;
            this.f287c = z2;
            if (i3 != this.f286b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i3 == 1) {
                str = "DETACHED";
            } else if (i3 == 2) {
                str = "RESUMED";
            } else if (i3 == 3) {
                str = "INACTIVE";
            } else if (i3 == 4) {
                str = "HIDDEN";
            } else {
                if (i3 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f288d.g(sb.toString(), null);
            this.f286b = i3;
            return;
        }
        i3 = i2;
        this.f285a = i2;
        this.f287c = z2;
        if (i3 != this.f286b) {
        }
    }
}
