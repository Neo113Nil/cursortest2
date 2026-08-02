package p000;

import android.app.Application;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: co */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105co implements ly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1300a;

    /* JADX INFO: renamed from: b */
    public final C0293ho f1301b;

    public /* synthetic */ C0105co(C0293ho c0293ho, int i) {
        this.f1300a = i;
        this.f1301b = c0293ho;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f1300a;
        C0293ho c0293ho = this.f1301b;
        switch (i) {
            case 0:
                C0858wz c0858wz = (C0858wz) c0293ho.f3265b.get();
                if (c0858wz != null) {
                    return c0858wz;
                }
                C0270h1.m2192h("Cannot return null from a non-@Nullable component method");
                return null;
            case 1:
                C0093cc c0093cc = (C0093cc) c0293ho.f3266c.get();
                if (c0093cc != null) {
                    return c0093cc;
                }
                C0270h1.m2192h("Cannot return null from a non-@Nullable component method");
                return null;
            case 2:
                LinkedHashMap linkedHashMap = new LinkedHashMap(11);
                linkedHashMap.put("IMAGE_ONLY_PORTRAIT", c0293ho.f3267d);
                linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", c0293ho.f3268e);
                linkedHashMap.put("MODAL_LANDSCAPE", c0293ho.f3269f);
                linkedHashMap.put("MODAL_PORTRAIT", c0293ho.f3270g);
                linkedHashMap.put("CARD_LANDSCAPE", c0293ho.f3271h);
                linkedHashMap.put("CARD_PORTRAIT", c0293ho.f3272i);
                linkedHashMap.put("BANNER_PORTRAIT", c0293ho.f3273j);
                linkedHashMap.put("BANNER_LANDSCAPE", c0293ho.f3274k);
                Map mapUnmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
                if (mapUnmodifiableMap != null) {
                    return mapUnmodifiableMap;
                }
                C0270h1.m2192h("Cannot return null from a non-@Nullable component method");
                return null;
            default:
                Application application = (Application) c0293ho.f3264a.get();
                if (application != null) {
                    return application;
                }
                C0270h1.m2192h("Cannot return null from a non-@Nullable component method");
                return null;
        }
    }
}
