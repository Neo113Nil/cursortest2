package Ve;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Dm extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    public C4617sf f28879a;

    public Dm(Kp... adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f28879a = new C4617sf(C7705l.f0(adapters), kotlin.collections.K.f71697a);
    }

    public final void f(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List adapters = this.f28879a.f32049a;
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(data, "data");
        C4617sf c4617sf = new C4617sf(adapters, data);
        i.c a11 = androidx.recyclerview.widget.i.a(new Zj(this.f28879a, c4617sf), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(diffCallback)");
        Intrinsics.checkNotNullParameter(c4617sf, "<set-?>");
        this.f28879a = c4617sf;
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getShimmersCount() {
        return this.f28879a.f32050b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        return this.f28879a.a(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4617sf c4617sf = this.f28879a;
        Kp kp2 = (Kp) c4617sf.f32049a.get(c4617sf.a(i11));
        List items = this.f28879a.f32050b;
        kp2.getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(items, "items");
        X4.a aVar = ((C4223ep) holder).f30952a;
        Object obj = items.get(i11);
        Intrinsics.g(obj, "null cannot be cast to non-null type T of spay.sdk.presentation.base.ViewBindingDelegateAdapter");
        kp2.b(aVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [fd.n, kotlin.jvm.internal.q] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Kp kp2 = (Kp) this.f28879a.f32049a.get(i11);
        kp2.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        X4.a aVar = (X4.a) kp2.f29370a.invoke(layoutInflater, parent, Boolean.FALSE);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C4223ep(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4617sf c4617sf = this.f28879a;
        ((Kp) c4617sf.f32049a.get(holder.getItemViewType())).getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(((C4223ep) holder).f30952a, "<this>");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewDetachedFromWindow(RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4617sf c4617sf = this.f28879a;
        ((Kp) c4617sf.f32049a.get(holder.getItemViewType())).getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(((C4223ep) holder).f30952a, "<this>");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4617sf c4617sf = this.f28879a;
        ((Kp) c4617sf.f32049a.get(holder.getItemViewType())).getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(((C4223ep) holder).f30952a, "<this>");
    }
}
