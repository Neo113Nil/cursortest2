package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: tx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745tx implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7621a;

    public /* synthetic */ C0745tx(int i) {
        this.f7621a = i;
    }

    @Override // p000.ny0
    public final Object get() {
        switch (this.f7621a) {
            case 0:
                return new ja0(2, Executors.newSingleThreadExecutor());
            default:
                aa0 aa0Var = new aa0(20);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    C0270h1.m2192h("Null flags");
                    return null;
                }
                map.put(dx0.f1868j, new C0537oa(30000L, 86400000L, set));
                if (set == null) {
                    C0270h1.m2192h("Null flags");
                    return null;
                }
                map.put(dx0.f1870l, new C0537oa(1000L, 86400000L, set));
                if (set == null) {
                    C0270h1.m2192h("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(h51.f3065k)));
                if (setUnmodifiableSet == null) {
                    C0270h1.m2192h("Null flags");
                    return null;
                }
                map.put(dx0.f1869k, new C0537oa(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= dx0.values().length) {
                    new HashMap();
                    return new C0500na(aa0Var, map);
                }
                C0270h1.m2191g("Not all priorities have been configured");
                return null;
        }
    }
}
