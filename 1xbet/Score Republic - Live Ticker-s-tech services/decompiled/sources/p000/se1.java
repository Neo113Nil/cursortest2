package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class se1 {

    /* JADX INFO: renamed from: e */
    public static volatile C0218fo f7104e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0766uh f7105a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0766uh f7106b;

    /* JADX INFO: renamed from: c */
    public final C0035ar f7107c;

    /* JADX INFO: renamed from: d */
    public final ng1 f7108d;

    public se1(InterfaceC0766uh interfaceC0766uh, InterfaceC0766uh interfaceC0766uh2, C0035ar c0035ar, ng1 ng1Var, f71 f71Var) {
        this.f7105a = interfaceC0766uh;
        this.f7106b = interfaceC0766uh2;
        this.f7107c = c0035ar;
        this.f7108d = ng1Var;
        ((Executor) f71Var.f2334k).execute(new RunnableC0944za(12, f71Var));
    }

    /* JADX INFO: renamed from: a */
    public static se1 m4516a() {
        C0218fo c0218fo = f7104e;
        if (c0218fo != null) {
            return (se1) c0218fo.f2464o.get();
        }
        C0270h1.m2191g("Not initialized!");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m4517b(Context context) {
        if (f7104e == null) {
            synchronized (se1.class) {
                try {
                    if (f7104e == null) {
                        C0181eo c0181eo = new C0181eo();
                        context.getClass();
                        c0181eo.f2151k = context;
                        f7104e = c0181eo.m1480e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final pe1 m4518c(C0873xd c0873xd) {
        Set setUnmodifiableSet = c0873xd instanceof C0873xd ? Collections.unmodifiableSet(C0873xd.f8889d) : Collections.singleton(new C0818vw("proto"));
        qd0 qd0VarM4283a = C0648ra.m4283a();
        c0873xd.getClass();
        qd0VarM4283a.f6471k = "cct";
        String str = c0873xd.f8892a;
        String str2 = c0873xd.f8893b;
        if (str2 == null) {
            str2 = "";
        }
        qd0VarM4283a.f6472l = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new pe1(setUnmodifiableSet, qd0VarM4283a.m4073e(), this);
    }
}
