package org.betup.games.doubles.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sdk.api.model.VKApiUserFull;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.databinding.AdapterBlackDoubleGameRouletteItemBinding;
import org.betup.databinding.AdapterRedDoubleGameRouletteItemBinding;
import org.betup.databinding.AdapterZeroDoubleGameRouletteItemBinding;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.games.doubles.model.rest.RouletteDoubleGameModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RouletteDoubleGameAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0014\u0010\u001a\u001a\u00020\u00102\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bJ\u0016\u0010\u001c\u001a\u00020\u00102\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$HistoryViewHolder;", "list", "", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "isInfiniteScroll", "", "()Z", "setInfiniteScroll", "(Z)V", "getItemViewType", "addSessionList", "", "replaceSessionList", VastTagName.COMPANION, "RedHistoryViewHolder", "BlackHistoryViewHolder", "ZeroHistoryViewHolder", "HistoryViewHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RouletteDoubleGameAdapter extends RecyclerView.Adapter<HistoryViewHolder> {
    private boolean isInfiniteScroll;
    private final List<RouletteDoubleGameModel> list;
    public static final int $stable = 8;

    /* compiled from: RouletteDoubleGameAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DoubleBetType.values().length];
            try {
                iArr[DoubleBetType.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DoubleBetType.ZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DoubleBetType.BLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouletteDoubleGameAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RouletteDoubleGameAdapter(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }

    public final List<RouletteDoubleGameModel> getList() {
        return this.list;
    }

    public RouletteDoubleGameAdapter(List<RouletteDoubleGameModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.isInfiniteScroll = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Companion.ViewTypes.RED_ADAPTER.ordinal()) {
            AdapterRedDoubleGameRouletteItemBinding inflate = AdapterRedDoubleGameRouletteItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new RedHistoryViewHolder(this, inflate);
        }
        if (viewType == Companion.ViewTypes.ZERO_ADAPTER.ordinal()) {
            AdapterZeroDoubleGameRouletteItemBinding inflate2 = AdapterZeroDoubleGameRouletteItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new ZeroHistoryViewHolder(this, inflate2);
        }
        AdapterBlackDoubleGameRouletteItemBinding inflate3 = AdapterBlackDoubleGameRouletteItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new BlackHistoryViewHolder(this, inflate3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HistoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<RouletteDoubleGameModel> list = this.list;
        holder.bind(list.get(position % list.size()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.isInfiniteScroll) {
            return Integer.MAX_VALUE;
        }
        return this.list.size();
    }

    /* renamed from: isInfiniteScroll, reason: from getter */
    public final boolean getIsInfiniteScroll() {
        return this.isInfiniteScroll;
    }

    public final void setInfiniteScroll(boolean z) {
        this.isInfiniteScroll = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        List<RouletteDoubleGameModel> list = this.list;
        int i = WhenMappings.$EnumSwitchMapping$0[list.get(position % list.size()).getBetType().ordinal()];
        if (i == 1) {
            return Companion.ViewTypes.RED_ADAPTER.ordinal();
        }
        if (i == 2) {
            return Companion.ViewTypes.ZERO_ADAPTER.ordinal();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Companion.ViewTypes.BLACK_ADAPTER.ordinal();
    }

    /* compiled from: RouletteDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$RedHistoryViewHolder;", "Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterRedDoubleGameRouletteItemBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter;Lorg/betup/databinding/AdapterRedDoubleGameRouletteItemBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterRedDoubleGameRouletteItemBinding;", "bind", "", "rouletteModel", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RedHistoryViewHolder extends HistoryViewHolder {
        private final AdapterRedDoubleGameRouletteItemBinding binding;
        final /* synthetic */ RouletteDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RedHistoryViewHolder(RouletteDoubleGameAdapter rouletteDoubleGameAdapter, AdapterRedDoubleGameRouletteItemBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = rouletteDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterRedDoubleGameRouletteItemBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.RouletteDoubleGameAdapter.HistoryViewHolder
        public void bind(RouletteDoubleGameModel rouletteModel) {
            Intrinsics.checkNotNullParameter(rouletteModel, "rouletteModel");
            this.binding.ordinalTv.setText(String.valueOf(rouletteModel.getOrdinal()));
        }
    }

    /* compiled from: RouletteDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$BlackHistoryViewHolder;", "Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterBlackDoubleGameRouletteItemBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter;Lorg/betup/databinding/AdapterBlackDoubleGameRouletteItemBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterBlackDoubleGameRouletteItemBinding;", "bind", "", "rouletteModel", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BlackHistoryViewHolder extends HistoryViewHolder {
        private final AdapterBlackDoubleGameRouletteItemBinding binding;
        final /* synthetic */ RouletteDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BlackHistoryViewHolder(RouletteDoubleGameAdapter rouletteDoubleGameAdapter, AdapterBlackDoubleGameRouletteItemBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = rouletteDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterBlackDoubleGameRouletteItemBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.RouletteDoubleGameAdapter.HistoryViewHolder
        public void bind(RouletteDoubleGameModel rouletteModel) {
            Intrinsics.checkNotNullParameter(rouletteModel, "rouletteModel");
            this.binding.ordinalTv.setText(String.valueOf(rouletteModel.getOrdinal()));
        }
    }

    /* compiled from: RouletteDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$ZeroHistoryViewHolder;", "Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterZeroDoubleGameRouletteItemBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter;Lorg/betup/databinding/AdapterZeroDoubleGameRouletteItemBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterZeroDoubleGameRouletteItemBinding;", "bind", "", "rouletteModel", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ZeroHistoryViewHolder extends HistoryViewHolder {
        private final AdapterZeroDoubleGameRouletteItemBinding binding;
        final /* synthetic */ RouletteDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ZeroHistoryViewHolder(RouletteDoubleGameAdapter rouletteDoubleGameAdapter, AdapterZeroDoubleGameRouletteItemBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = rouletteDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterZeroDoubleGameRouletteItemBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.RouletteDoubleGameAdapter.HistoryViewHolder
        public void bind(RouletteDoubleGameModel rouletteModel) {
            Intrinsics.checkNotNullParameter(rouletteModel, "rouletteModel");
            this.binding.ordinalTv.setText(String.valueOf(rouletteModel.getOrdinal()));
        }
    }

    public final void addSessionList(List<RouletteDoubleGameModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        int size = this.list.size();
        this.list.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public final void replaceSessionList(List<RouletteDoubleGameModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    /* compiled from: RouletteDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lorg/betup/games/doubles/ui/RouletteDoubleGameAdapter$HistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/view/View;)V", "bind", "", "rouletteModel", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class HistoryViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public abstract void bind(RouletteDoubleGameModel rouletteModel);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }
}
