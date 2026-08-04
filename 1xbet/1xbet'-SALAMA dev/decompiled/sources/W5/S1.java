package W5;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7029d;

    public S1(p078l.k kVar) {
        p155w1.F0 f7 = new p155w1.F0(kVar, "flutter/lifecycle", A5.z.f691b, (Object) null, 1);
        this.f7026a = 0;
        this.f7027b = 0;
        this.f7028c = true;
        this.f7029d = f7;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
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
        int iE = p136t.e.e(i7);
        if (iE != 0) {
            if (iE == 1) {
                i8 = z4 ? 2 : 3;
            } else if (iE == 2 || iE == 3 || iE == 4) {
                i8 = i7;
            } else {
                i8 = 0;
            }
        } else {
            i8 = i7;
        }
        this.f7026a = i7;
        this.f7028c = z4;
        if (i8 == this.f7027b) {
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
        ((p155w1.F0) this.f7029d).L(sb.toString(), null);
        this.f7027b = i8;
    }

    public S1(boolean z4, int i7, int i8, h2 h2Var) {
        this.f7028c = z4;
        this.f7026a = i7;
        this.f7027b = i8;
        this.f7029d = h2Var;
    }
}
