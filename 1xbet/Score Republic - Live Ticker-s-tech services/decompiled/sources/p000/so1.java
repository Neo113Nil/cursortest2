package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class so1 {

    /* JADX INFO: renamed from: a */
    public static volatile so1 f7176a;

    /* JADX INFO: renamed from: b */
    public static final so1 f7177b;

    static {
        so1 so1Var = new so1();
        Map map = Collections.EMPTY_MAP;
        f7177b = so1Var;
    }

    /* JADX INFO: renamed from: a */
    public static so1 m4573a() {
        so1 so1Var = f7176a;
        if (so1Var != null) {
            return so1Var;
        }
        synchronized (so1.class) {
            try {
                so1 so1Var2 = f7176a;
                if (so1Var2 != null) {
                    return so1Var2;
                }
                int i = fo1.f2465a;
                so1 so1VarM5397x = wo1.m5397x();
                f7176a = so1VarM5397x;
                return so1VarM5397x;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
