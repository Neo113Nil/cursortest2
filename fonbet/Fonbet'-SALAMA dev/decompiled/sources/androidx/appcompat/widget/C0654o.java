package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654o extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f8719b;

    public /* synthetic */ C0654o(ActivityChooserView activityChooserView, int i7) {
        this.f8718a = i7;
        this.f8719b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f8718a) {
            case 0:
                super.onChanged();
                this.f8719b.f8249a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                this.f8719b.f8249a.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.f8718a) {
            case 0:
                super.onInvalidated();
                this.f8719b.f8249a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
