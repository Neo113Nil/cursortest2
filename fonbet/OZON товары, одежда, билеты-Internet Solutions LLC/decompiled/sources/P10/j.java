package P10;

import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes7.dex */
public final class j extends i.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List<i> f21654a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<i> f21655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f21656c;

    j(List<i> list, List<i> list2, k kVar) {
        this.f21654a = list;
        this.f21655b = list2;
        this.f21656c = kVar;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areContentsTheSame(int i11, int i12) {
        return this.f21656c.areContentsTheSame(this.f21654a.get(i11), this.f21655b.get(i12));
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areItemsTheSame(int i11, int i12) {
        return this.f21656c.areItemsTheSame(this.f21654a.get(i11), this.f21655b.get(i12));
    }

    @Override // androidx.recyclerview.widget.i.b
    public final Object getChangePayload(int i11, int i12) {
        return this.f21656c.getChangePayload(this.f21654a.get(i11), this.f21655b.get(i12));
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getNewListSize() {
        return this.f21655b.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getOldListSize() {
        return this.f21654a.size();
    }
}
