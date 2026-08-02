package p000;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0030a;
import java.util.LinkedHashSet;
import p000.bu0;
import p000.fu0;
import p000.ph0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 {

    /* JADX INFO: renamed from: a */
    public final Runnable f2874a;

    /* JADX INFO: renamed from: b */
    public final jc1 f2875b = new jc1(new C0325ik(2, this));

    public gu0(Runnable runnable) {
        this.f2874a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1, xh0] */
    /* JADX INFO: renamed from: a */
    public final void m2151a(l50 l50Var, yh0 yh0Var) {
        yh0Var.getClass();
        l50Var.getClass();
        final C0030a c0030aMo862d = yh0Var.mo862d();
        if (c0030aMo862d.f551c == qh0.f6497j) {
            return;
        }
        final bu0 bu0Var = new bu0(l50Var, new cu0(l50Var, yh0Var));
        l50Var.f4679a.add(bu0Var);
        bu0Var.m777b(false);
        f71 f71Var = ((eu0) this.f2875b.m2847a()).f2184c;
        f71Var.getClass();
        if (((LinkedHashSet) f71Var.f2336m).add(bu0Var)) {
            mr0 mr0Var = (mr0) f71Var.f2335l;
            mr0Var.getClass();
            if (bu0Var.f989c != null) {
                throw new IllegalArgumentException(("Handler '" + bu0Var + "' is already registered with a dispatcher").toString());
            }
            mr0Var.f5140e.addFirst(bu0Var);
            bu0Var.f989c = f71Var;
            mr0Var.m3427b();
        }
        final ?? r1 = new uh0(this, c0030aMo862d) { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ C0030a f297k;

            {
                this.f297k = c0030aMo862d;
            }

            @Override // p000.uh0
            /* JADX INFO: renamed from: d */
            public final void mo328d(yh0 yh0Var2, ph0 ph0Var) {
                int i = fu0.f2500a[ph0Var.ordinal()];
                bu0 bu0Var2 = this.f296j;
                if (i == 1) {
                    bu0Var2.m777b(true);
                    return;
                }
                if (i == 2) {
                    bu0Var2.m777b(false);
                } else {
                    if (i != 3) {
                        return;
                    }
                    bu0Var2.m776a();
                    this.f297k.m442f(this);
                }
            }
        };
        c0030aMo862d.m437a(r1);
        l50Var.f4681c.add(new AutoCloseable() { // from class: du0
            @Override // java.lang.AutoCloseable
            public final void close() {
                c0030aMo862d.m442f(r1);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final f71 m2152b() {
        return ((eu0) this.f2875b.m2847a()).f2184c;
    }

    /* JADX INFO: renamed from: c */
    public final void m2153c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        jc1 jc1Var = this.f2875b;
        ((eu0) jc1Var.m2847a()).f2184c.m1657c(new yt0(onBackInvokedDispatcher, 0), 1);
        ((eu0) jc1Var.m2847a()).f2184c.m1657c(new yt0(onBackInvokedDispatcher, 1000000), 0);
    }
}
