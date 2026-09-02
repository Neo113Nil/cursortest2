package D;

/* loaded from: classes.dex */
public final class b extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f184b;

    public /* synthetic */ b(int i2, java.lang.Object obj) {
        this.f183a = i2;
        this.f184b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f183a) {
            case 0:
                h.d0 d0Var = (h.d0) this.f184b;
                d0Var.f185a = true;
                d0Var.notifyDataSetChanged();
                break;
            default:
                h.AbstractC0140I abstractC0140I = (h.AbstractC0140I) this.f184b;
                if (abstractC0140I.f3087v.isShowing()) {
                    abstractC0140I.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f183a) {
            case 0:
                h.d0 d0Var = (h.d0) this.f184b;
                d0Var.f185a = false;
                d0Var.notifyDataSetInvalidated();
                break;
            default:
                ((h.AbstractC0140I) this.f184b).dismiss();
                break;
        }
    }
}
