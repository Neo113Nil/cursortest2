package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0021ak implements w41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f222b;

    public /* synthetic */ C0021ak(int i, Object obj) {
        this.f221a = i;
        this.f222b = obj;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Bundle mo264a() {
        int i = this.f221a;
        Object obj = this.f222b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                C0177ek c0177ek = ((AbstractActivityC0790v4) obj).f2781q;
                c0177ek.getClass();
                LinkedHashMap linkedHashMap = c0177ek.f2099b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0177ek.f2101d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0177ek.f2104g));
                return bundle;
            case 1:
                AbstractActivityC0790v4 abstractActivityC0790v4 = (AbstractActivityC0790v4) obj;
                while (AbstractActivityC0790v4.m5050k(((e50) abstractActivityC0790v4.f8056D.f793k).f1954q)) {
                }
                abstractActivityC0790v4.f8057E.m440d(ph0.ON_STOP);
                return new Bundle();
            default:
                return ((t50) obj).m4712V();
        }
    }
}
