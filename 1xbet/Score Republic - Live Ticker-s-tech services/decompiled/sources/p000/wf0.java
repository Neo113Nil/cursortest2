package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ tg0[] f8532d;

    /* JADX INFO: renamed from: a */
    public final String f8533a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f8534b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0921yo f8535c;

    static {
        sx0 sx0Var = new sx0(C0135de.f1631j, wf0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        l01.f4622a.getClass();
        f8532d = new tg0[]{sx0Var};
    }

    public wf0(Context context, String str) {
        jg0 jg0Var;
        C0841wi c0841wi;
        context.getClass();
        this.f8533a = str;
        this.f8534b = new ThreadLocal();
        int i = 0;
        jg0 jg0Var2 = new jg0(11, new tf0(this, i));
        tf0 tf0Var = new tf0(this, 1);
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        InterfaceC0180en c0841wi2 = ExecutorC0701sq.f7187l;
        mb1 mb1Var = new mb1();
        c0841wi2.getClass();
        if (mb1Var != C0301hw.f3348j) {
            InterfaceC0180en interfaceC0180enMo1468m = c0841wi2.mo1468m(mb1Var.getKey());
            C0301hw c0301hw = C0301hw.f3348j;
            if (interfaceC0180enMo1468m == c0301hw) {
                c0841wi2 = mb1Var;
            } else {
                o31 o31Var = o31.f5604l;
                AbstractC0292hn abstractC0292hn = (AbstractC0292hn) interfaceC0180enMo1468m.mo1466j(o31Var);
                if (abstractC0292hn == null) {
                    c0841wi = new C0841wi(interfaceC0180enMo1468m, mb1Var);
                } else {
                    InterfaceC0180en interfaceC0180enMo1468m2 = interfaceC0180enMo1468m.mo1468m(o31Var);
                    if (interfaceC0180enMo1468m2 == c0301hw) {
                        c0841wi2 = new C0841wi(mb1Var, abstractC0292hn);
                    } else {
                        c0841wi = new C0841wi(new C0841wi(interfaceC0180enMo1468m2, mb1Var), abstractC0292hn);
                    }
                }
                c0841wi2 = c0841wi;
            }
        }
        C0734tm c0734tmM3339e = m80.m3339e(c0841wi2);
        qw0 qw0Var = new qw0(str, jg0Var2, tf0Var, c0734tmM3339e);
        f8532d[0].getClass();
        jg0 jg0Var3 = qw0Var.f6627c;
        if (jg0Var3 == null) {
            synchronized (qw0Var.f6626b) {
                try {
                    if (qw0Var.f6627c == null) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        List list = (List) tf0Var.mo170i(applicationContext);
                        pw0 pw0Var = new pw0(applicationContext, qw0Var, 0);
                        list.getClass();
                        qw0Var.f6627c = new jg0(9, new jg0(9, new C0848wp(new l00(new k00(1, pw0Var)), vt1.m5193e(new C0662ro(list, null, i)), jg0Var2, c0734tmM3339e)));
                    }
                    jg0Var = qw0Var.f6627c;
                    jg0Var.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            jg0Var3 = jg0Var;
        }
        this.f8535c = jg0Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m5324a(h60 h60Var) {
    }
}
