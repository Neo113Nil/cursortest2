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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.databinding.AdapterBlackDoubleGameHistoryBinding;
import org.betup.databinding.AdapterRedDoubleGameHistoryBinding;
import org.betup.databinding.AdapterZeroDoubleGameHistoryBinding;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.games.doubles.model.rest.SessionHistoryDoubleGame;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HistoryDoubleGameAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0007J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$HistoryViewHolder;", "list", "", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "getItemViewType", "addSessionList", "", "addSession", VastTagName.COMPANION, "RedHistoryViewHolder", "BlackHistoryViewHolder", "ZeroHistoryViewHolder", "HistoryViewHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HistoryDoubleGameAdapter extends RecyclerView.Adapter<HistoryViewHolder> {
    private final List<SessionHistoryDoubleGame> list;
    public static final int $stable = 8;

    /* compiled from: HistoryDoubleGameAdapter.kt */
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
    public HistoryDoubleGameAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HistoryDoubleGameAdapter(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }

    public HistoryDoubleGameAdapter(List<SessionHistoryDoubleGame> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Companion.ViewTypes.RED_ADAPTER.ordinal()) {
            AdapterRedDoubleGameHistoryBinding inflate = AdapterRedDoubleGameHistoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new RedHistoryViewHolder(this, inflate);
        }
        if (viewType == Companion.ViewTypes.ZERO_ADAPTER.ordinal()) {
            AdapterZeroDoubleGameHistoryBinding inflate2 = AdapterZeroDoubleGameHistoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new ZeroHistoryViewHolder(this, inflate2);
        }
        AdapterBlackDoubleGameHistoryBinding inflate3 = AdapterBlackDoubleGameHistoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new BlackHistoryViewHolder(this, inflate3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HistoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.list.get(position).getBetType().ordinal()];
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

    /* compiled from: HistoryDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$RedHistoryViewHolder;", "Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterRedDoubleGameHistoryBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter;Lorg/betup/databinding/AdapterRedDoubleGameHistoryBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterRedDoubleGameHistoryBinding;", "bind", "", "sessionHistoryDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RedHistoryViewHolder extends HistoryViewHolder {
        private final AdapterRedDoubleGameHistoryBinding binding;
        final /* synthetic */ HistoryDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RedHistoryViewHolder(HistoryDoubleGameAdapter historyDoubleGameAdapter, AdapterRedDoubleGameHistoryBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = historyDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterRedDoubleGameHistoryBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.HistoryDoubleGameAdapter.HistoryViewHolder
        public void bind(SessionHistoryDoubleGame sessionHistoryDoubleGame) {
            Intrinsics.checkNotNullParameter(sessionHistoryDoubleGame, "sessionHistoryDoubleGame");
            this.binding.ordinalTv.setText(String.valueOf(sessionHistoryDoubleGame.getOrdinal()));
        }
    }

    /* compiled from: HistoryDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$BlackHistoryViewHolder;", "Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterBlackDoubleGameHistoryBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter;Lorg/betup/databinding/AdapterBlackDoubleGameHistoryBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterBlackDoubleGameHistoryBinding;", "bind", "", "sessionHistoryDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BlackHistoryViewHolder extends HistoryViewHolder {
        private final AdapterBlackDoubleGameHistoryBinding binding;
        final /* synthetic */ HistoryDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BlackHistoryViewHolder(HistoryDoubleGameAdapter historyDoubleGameAdapter, AdapterBlackDoubleGameHistoryBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = historyDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterBlackDoubleGameHistoryBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.HistoryDoubleGameAdapter.HistoryViewHolder
        public void bind(SessionHistoryDoubleGame sessionHistoryDoubleGame) {
            Intrinsics.checkNotNullParameter(sessionHistoryDoubleGame, "sessionHistoryDoubleGame");
            this.binding.ordinalTv.setText(String.valueOf(sessionHistoryDoubleGame.getOrdinal()));
        }
    }

    /* compiled from: HistoryDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$ZeroHistoryViewHolder;", "Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$HistoryViewHolder;", "binding", "Lorg/betup/databinding/AdapterZeroDoubleGameHistoryBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter;Lorg/betup/databinding/AdapterZeroDoubleGameHistoryBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterZeroDoubleGameHistoryBinding;", "bind", "", "sessionHistoryDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ZeroHistoryViewHolder extends HistoryViewHolder {
        private final AdapterZeroDoubleGameHistoryBinding binding;
        final /* synthetic */ HistoryDoubleGameAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ZeroHistoryViewHolder(HistoryDoubleGameAdapter historyDoubleGameAdapter, AdapterZeroDoubleGameHistoryBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = historyDoubleGameAdapter;
            View rootView = binding.getRoot().getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            this.binding = binding;
        }

        public final AdapterZeroDoubleGameHistoryBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.games.doubles.ui.HistoryDoubleGameAdapter.HistoryViewHolder
        public void bind(SessionHistoryDoubleGame sessionHistoryDoubleGame) {
            Intrinsics.checkNotNullParameter(sessionHistoryDoubleGame, "sessionHistoryDoubleGame");
            this.binding.ordinalTv.setText(String.valueOf(sessionHistoryDoubleGame.getOrdinal()));
        }
    }

    public final void addSessionList(List<SessionHistoryDoubleGame> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.addAll(0, list);
        notifyItemRangeInserted(0, list.size());
    }

    public final void addSession(SessionHistoryDoubleGame list) {
        Intrinsics.checkNotNullParameter(list, "list");
        addSessionList(CollectionsKt.listOf(list));
    }

    /* compiled from: HistoryDoubleGameAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lorg/betup/games/doubles/ui/HistoryDoubleGameAdapter$HistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/view/View;)V", "bind", "", "sessionHistoryDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class HistoryViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public abstract void bind(SessionHistoryDoubleGame sessionHistoryDoubleGame);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }
}
