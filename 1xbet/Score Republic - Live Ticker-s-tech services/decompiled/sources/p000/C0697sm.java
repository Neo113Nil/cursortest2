package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0697sm {

    /* JADX INFO: renamed from: a */
    public static final Logger f7148a = Logger.getLogger(C0697sm.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C0697sm f7149b = new C0697sm();

    /* JADX INFO: renamed from: b */
    public static C0697sm m4537b() {
        ((bd1) AbstractC0623qm.f6536a).getClass();
        C0697sm c0697sm = (C0697sm) bd1.f836b.get();
        C0697sm c0697sm2 = f7149b;
        if (c0697sm == null) {
            c0697sm = c0697sm2;
        }
        return c0697sm == null ? c0697sm2 : c0697sm;
    }

    /* JADX INFO: renamed from: a */
    public final C0697sm m4538a() {
        ((bd1) AbstractC0623qm.f6536a).getClass();
        ThreadLocal threadLocal = bd1.f836b;
        C0697sm c0697sm = (C0697sm) threadLocal.get();
        C0697sm c0697sm2 = f7149b;
        if (c0697sm == null) {
            c0697sm = c0697sm2;
        }
        threadLocal.set(this);
        return c0697sm == null ? c0697sm2 : c0697sm;
    }

    /* JADX INFO: renamed from: c */
    public final void m4539c(C0697sm c0697sm) {
        if (c0697sm == null) {
            C0270h1.m2192h("toAttach");
            return;
        }
        bd1 bd1Var = (bd1) AbstractC0623qm.f6536a;
        ThreadLocal threadLocal = bd1.f836b;
        bd1Var.getClass();
        C0697sm c0697sm2 = (C0697sm) threadLocal.get();
        C0697sm c0697sm3 = f7149b;
        if (c0697sm2 == null) {
            c0697sm2 = c0697sm3;
        }
        if (c0697sm2 != this) {
            bd1.f835a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c0697sm != c0697sm3) {
            threadLocal.set(c0697sm);
        } else {
            threadLocal.set(null);
        }
    }
}
