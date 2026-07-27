package S1;

import T1.t;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1383a;

    /* renamed from: b, reason: collision with root package name */
    public int f1384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1385c;

    /* renamed from: d, reason: collision with root package name */
    public final D0.a f1386d;

    public a(K1.b bVar) {
        D0.a aVar = new D0.a((T1.f) bVar, "flutter/lifecycle", (T1.k) t.f1476b, (P0.j) null);
        this.f1383a = 0;
        this.f1384b = 0;
        this.f1385c = true;
        this.f1386d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i3, boolean z3) {
        int i4;
        String str;
        int i5 = this.f1383a;
        if (i5 == i3 && z3 == this.f1385c) {
            return;
        }
        if (i3 == 0 && i5 == 0) {
            this.f1385c = z3;
            return;
        }
        int b3 = M.j.b(i3);
        if (b3 != 0) {
            if (b3 == 1) {
                i4 = z3 ? 2 : 3;
            } else if (b3 != 2 && b3 != 3 && b3 != 4) {
                i4 = 0;
            }
            this.f1383a = i3;
            this.f1385c = z3;
            if (i4 != this.f1384b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i4 == 1) {
                str = "DETACHED";
            } else if (i4 == 2) {
                str = "RESUMED";
            } else if (i4 == 3) {
                str = "INACTIVE";
            } else if (i4 == 4) {
                str = "HIDDEN";
            } else {
                if (i4 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f1386d.f(sb.toString(), null);
            this.f1384b = i4;
            return;
        }
        i4 = i3;
        this.f1383a = i3;
        this.f1385c = z3;
        if (i4 != this.f1384b) {
        }
    }
}
