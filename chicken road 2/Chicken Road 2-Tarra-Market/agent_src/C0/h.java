package C0;

import java.util.Locale;
import p.AbstractC0819i;
import u0.C0840b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f61a;

    /* renamed from: b, reason: collision with root package name */
    public int f62b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63c;

    /* renamed from: d, reason: collision with root package name */
    public final t f64d;

    public h(C0840b c0840b) {
        t tVar = new t(c0840b, "flutter/lifecycle", D0.o.f170b, null);
        this.f61a = 0;
        this.f62b = 0;
        this.f63c = true;
        this.f64d = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f61a;
        if (i4 == i2 && z2 == this.f63c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f63c = z2;
            return;
        }
        int c2 = AbstractC0819i.c(i2);
        if (c2 != 0) {
            if (c2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (c2 != 2 && c2 != 3 && c2 != 4) {
                i3 = 0;
            }
            this.f61a = i2;
            this.f63c = z2;
            if (i3 != this.f62b) {
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
            this.f64d.h(sb.toString(), null);
            this.f62b = i3;
            return;
        }
        i3 = i2;
        this.f61a = i2;
        this.f63c = z2;
        if (i3 != this.f62b) {
        }
    }
}
