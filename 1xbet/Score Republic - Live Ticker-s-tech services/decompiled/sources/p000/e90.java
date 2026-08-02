package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e90 extends AbstractC0575pb {

    /* JADX INFO: renamed from: z */
    public final Set f2017z;

    /* JADX WARN: Illegal instructions before constructor call */
    public e90(Context context, Looper looper, int i, C0902y5 c0902y5, j90 j90Var, k90 k90Var) {
        j72 j72VarM2823a = j72.m2823a(context);
        h90 h90Var = h90.f3130e;
        p80.m3863h(j90Var);
        p80.m3863h(k90Var);
        super(context, looper, j72VarM2823a, h90Var, i, new an0(12, j90Var), new jg0(20, k90Var), (String) c0902y5.f9157d);
        Set set = (Set) c0902y5.f9155b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                C0270h1.m2191g("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.f2017z = set;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: e */
    public final Account mo1391e() {
        return null;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: g */
    public final Executor mo1392g() {
        return null;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: k */
    public final Set mo1393k() {
        return this.f2017z;
    }
}
