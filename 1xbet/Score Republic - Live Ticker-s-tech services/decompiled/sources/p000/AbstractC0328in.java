package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328in {

    /* JADX INFO: renamed from: a */
    public static final List f3619a;

    static {
        try {
            Iterator it = Arrays.asList(new C0198f4()).iterator();
            it.getClass();
            f3619a = s61.m4485s(new C0548ol(new u61(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
