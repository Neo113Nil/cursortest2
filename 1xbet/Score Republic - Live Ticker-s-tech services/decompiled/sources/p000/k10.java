package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k10 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4247j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ l10 f4248k;

    public /* synthetic */ k10(l10 l10Var, int i) {
        this.f4247j = i;
        this.f4248k = l10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0389ka c0389kaM1622Y;
        C0389ka c0389kaM3145g;
        int i = this.f4247j;
        l10 l10Var = this.f4248k;
        switch (i) {
            case 0:
                l10Var.m3139a();
                return;
            case 1:
                Object obj = l10.f4629m;
                synchronized (obj) {
                    try {
                        w00 w00Var = l10Var.f4630a;
                        w00Var.m5224a();
                        C0312i6 c0312i6M2533e = C0312i6.m2533e(w00Var.f8318a);
                        try {
                            c0389kaM1622Y = l10Var.f4632c.m1622Y();
                            if (c0312i6M2533e != null) {
                                c0312i6M2533e.m2552x();
                            }
                        } catch (Throwable th) {
                            if (c0312i6M2533e != null) {
                                c0312i6M2533e.m2552x();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i2 = c0389kaM1622Y.f4323b;
                    if (i2 == 5) {
                        c0389kaM3145g = l10Var.m3145g(c0389kaM1622Y);
                    } else {
                        if (i2 == 3) {
                            c0389kaM3145g = l10Var.m3145g(c0389kaM1622Y);
                        } else if (!l10Var.f4633d.m1212a(c0389kaM1622Y)) {
                            return;
                        } else {
                            c0389kaM3145g = l10Var.m3140b(c0389kaM1622Y);
                        }
                    }
                    synchronized (obj) {
                        try {
                            w00 w00Var2 = l10Var.f4630a;
                            w00Var2.m5224a();
                            C0312i6 c0312i6M2533e2 = C0312i6.m2533e(w00Var2.f8318a);
                            try {
                                l10Var.f4632c.m1613P(c0389kaM3145g);
                                if (c0312i6M2533e2 != null) {
                                    c0312i6M2533e2.m2552x();
                                }
                            } catch (Throwable th3) {
                                if (c0312i6M2533e2 != null) {
                                    c0312i6M2533e2.m2552x();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (l10Var) {
                        try {
                            if (l10Var.f4640k.size() != 0 && !TextUtils.equals(c0389kaM1622Y.f4322a, c0389kaM3145g.f4322a)) {
                                Iterator it = l10Var.f4640k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (c0389kaM3145g.f4323b == 4) {
                        String str = c0389kaM3145g.f4322a;
                        synchronized (l10Var) {
                            l10Var.f4639j = str;
                        }
                    }
                    int i3 = c0389kaM3145g.f4323b;
                    if (i3 == 5) {
                        l10Var.m3146h(new n10());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        l10Var.m3146h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        l10Var.m3147i(c0389kaM3145g);
                        return;
                    }
                } catch (n10 e) {
                    l10Var.m3146h(e);
                    return;
                }
            default:
                l10Var.m3139a();
                return;
        }
    }
}
