package p000;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 {

    /* JADX INFO: renamed from: a */
    public final f50 f5827a;

    /* JADX INFO: renamed from: b */
    public final qd0 f5828b;

    /* JADX INFO: renamed from: c */
    public final HashMap f5829c;

    public op0(Context context, qd0 qd0Var) {
        f50 f50Var = new f50(12, context);
        this.f5829c = new HashMap();
        this.f5827a = f50Var;
        this.f5828b = qd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized me1 m3727a(String str) {
        if (this.f5829c.containsKey(str)) {
            return (me1) this.f5829c.get(str);
        }
        CctBackendFactory cctBackendFactoryM1606I = this.f5827a.m1606I(str);
        if (cctBackendFactoryM1606I == null) {
            return null;
        }
        qd0 qd0Var = this.f5828b;
        me1 me1VarCreate = cctBackendFactoryM1606I.create(new C0795v9((Context) qd0Var.f6471k, (InterfaceC0766uh) qd0Var.f6472l, (InterfaceC0766uh) qd0Var.f6473m, str));
        this.f5829c.put(str, me1VarCreate);
        return me1VarCreate;
    }
}
