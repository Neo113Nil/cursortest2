package n;

import android.database.DataSetObserver;

/* renamed from: n.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2127c0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2131e0 f18217a;

    public C2127c0(AbstractC2131e0 abstractC2131e0) {
        this.f18217a = abstractC2131e0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC2131e0 abstractC2131e0 = this.f18217a;
        if (abstractC2131e0.f18227F.isShowing()) {
            abstractC2131e0.b();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f18217a.dismiss();
    }
}
