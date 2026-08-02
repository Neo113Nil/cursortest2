package W5;

import java.util.Locale;
import l.C1373k;

/* loaded from: classes2.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7026a;

    /* renamed from: b, reason: collision with root package name */
    public int f7027b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7028c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7029d;

    public S1(C1373k c1373k) {
        w1.F0 f02 = new w1.F0(c1373k, "flutter/lifecycle", A5.z.f691b, (Object) null, 1);
        this.f7026a = 0;
        this.f7027b = 0;
        this.f7028c = true;
        this.f7029d = f02;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i7, boolean z4) {
        int i8;
        String str;
        int i9 = this.f7026a;
        if (i9 == i7 && z4 == this.f7028c) {
            return;
        }
        if (i7 == 0 && i9 == 0) {
            this.f7028c = z4;
            return;
        }
        int e7 = t.e.e(i7);
        if (e7 != 0) {
            if (e7 == 1) {
                i8 = z4 ? 2 : 3;
            } else if (e7 != 2 && e7 != 3 && e7 != 4) {
                i8 = 0;
            }
            this.f7026a = i7;
            this.f7028c = z4;
            if (i8 != this.f7027b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i8 == 1) {
                str = "DETACHED";
            } else if (i8 == 2) {
                str = "RESUMED";
            } else if (i8 == 3) {
                str = "INACTIVE";
            } else if (i8 == 4) {
                str = "HIDDEN";
            } else {
                if (i8 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            ((w1.F0) this.f7029d).L(sb.toString(), null);
            this.f7027b = i8;
            return;
        }
        i8 = i7;
        this.f7026a = i7;
        this.f7028c = z4;
        if (i8 != this.f7027b) {
        }
    }

    public S1(boolean z4, int i7, int i8, h2 h2Var) {
        this.f7028c = z4;
        this.f7026a = i7;
        this.f7027b = i8;
        this.f7029d = h2Var;
    }
}
