package I;

import android.database.DataSetObserver;
import l.K;
import l.f0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f564b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f563a = i3;
        this.f564b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f563a) {
            case 0:
                f0 f0Var = (f0) this.f564b;
                f0Var.f565a = true;
                f0Var.notifyDataSetChanged();
                break;
            default:
                K k3 = (K) this.f564b;
                if (k3.f9732v.isShowing()) {
                    k3.d();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f563a) {
            case 0:
                f0 f0Var = (f0) this.f564b;
                f0Var.f565a = false;
                f0Var.notifyDataSetInvalidated();
                break;
            default:
                ((K) this.f564b).dismiss();
                break;
        }
    }
}
