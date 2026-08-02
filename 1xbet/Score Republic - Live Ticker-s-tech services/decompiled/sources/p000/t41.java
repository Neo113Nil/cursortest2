package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t41 implements w41 {

    /* JADX INFO: renamed from: a */
    public final C0086c5 f7275a;

    /* JADX INFO: renamed from: b */
    public boolean f7276b;

    /* JADX INFO: renamed from: c */
    public Bundle f7277c;

    /* JADX INFO: renamed from: d */
    public final jc1 f7278d;

    public t41(C0086c5 c0086c5, hi1 hi1Var) {
        c0086c5.getClass();
        this.f7275a = c0086c5;
        this.f7278d = new jc1(new k00(2, hi1Var));
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Bundle mo264a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7277c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((u41) this.f7278d.m2847a()).f7671c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f7276b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((s41) entry.getValue()).getClass();
        throw null;
    }
}
