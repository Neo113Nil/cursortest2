package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sm1 {

    /* JADX INFO: renamed from: a */
    public static final tm1 f7153a;

    static {
        tm1 tm1Var;
        try {
            tm1Var = ym1.f9392a;
        } catch (NoClassDefFoundError unused) {
            tm1Var = null;
        }
        if (tm1Var == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = tm1.f7532a[i];
                try {
                    tm1Var = (tm1) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        f7153a = tm1Var;
    }
}
