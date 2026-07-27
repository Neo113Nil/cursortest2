package J;

import android.database.DataSetObserver;
import l.H;
import l.d0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1337b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f1336a = i2;
        this.f1337b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1336a) {
            case 0:
                d0 d0Var = (d0) this.f1337b;
                d0Var.f1338a = true;
                d0Var.notifyDataSetChanged();
                break;
            default:
                H h3 = (H) this.f1337b;
                if (h3.f10791v.isShowing()) {
                    h3.d();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1336a) {
            case 0:
                d0 d0Var = (d0) this.f1337b;
                d0Var.f1338a = false;
                d0Var.notifyDataSetInvalidated();
                break;
            default:
                ((H) this.f1337b).dismiss();
                break;
        }
    }
}
