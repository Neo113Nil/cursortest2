package org.betup.ui.fragment.home.adapter;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sdk.api.model.VKApiUserFull;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.databinding.HomeMatchAdPageAdapterBinding;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchAdPagesAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007J\b\u0010\u0014\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeMatchAdPagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/ui/fragment/home/adapter/HomeMatchAdPagesAdapter$Holder;", "pagesCount", "", "", "currentPage", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;I)V", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "selectedIndex", "changeCurrentPage", "getItemCount", "Holder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchAdPagesAdapter extends RecyclerView.Adapter<Holder> {
    public static final int $stable = 8;
    private int currentPage;
    private List<Boolean> pagesCount;
    private int selectedIndex;

    /* compiled from: HomeMatchAdPagesAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeMatchAdPagesAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/betup/databinding/HomeMatchAdPageAdapterBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeMatchAdPagesAdapter;Lorg/betup/databinding/HomeMatchAdPageAdapterBinding;)V", "getBinding", "()Lorg/betup/databinding/HomeMatchAdPageAdapterBinding;", "bind", "", "position", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends RecyclerView.ViewHolder {
        private final HomeMatchAdPageAdapterBinding binding;
        final /* synthetic */ HomeMatchAdPagesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(HomeMatchAdPagesAdapter homeMatchAdPagesAdapter, HomeMatchAdPageAdapterBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeMatchAdPagesAdapter;
            this.binding = binding;
        }

        public final HomeMatchAdPageAdapterBinding getBinding() {
            return this.binding;
        }

        public final void bind(int position) {
            ColorStateList colorStateList;
            HomeMatchAdPageAdapterBinding homeMatchAdPageAdapterBinding = this.binding;
            HomeMatchAdPagesAdapter homeMatchAdPagesAdapter = this.this$0;
            View view = homeMatchAdPageAdapterBinding.adBannerIndexV;
            if (position == homeMatchAdPagesAdapter.selectedIndex) {
                colorStateList = AppCompatResources.getColorStateList(this.binding.getRoot().getContext(), R.color.active_btn);
            } else {
                colorStateList = AppCompatResources.getColorStateList(this.binding.getRoot().getContext(), R.color.inactive_btn);
            }
            view.setBackgroundTintList(colorStateList);
        }
    }

    public HomeMatchAdPagesAdapter(List<Boolean> pagesCount, int i) {
        Intrinsics.checkNotNullParameter(pagesCount, "pagesCount");
        this.pagesCount = pagesCount;
        this.currentPage = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HomeMatchAdPageAdapterBinding inflate = HomeMatchAdPageAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new Holder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    public final void changeCurrentPage(int position) {
        int i = this.selectedIndex;
        this.selectedIndex = position;
        notifyItemChanged(i);
        notifyItemChanged(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.pagesCount.size();
    }
}
