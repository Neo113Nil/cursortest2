package org.betup.ui.fragment.home.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.sdk.controller.f;
import com.vk.sdk.api.model.VKApiUserFull;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.databinding.HomeMatchAdAdapterBinding;
import org.betup.model.remote.entity.analytics.HomeMatchAd;
import org.betup.ui.fragment.home.adapter.HomeMatchAdAdapter;
import org.betup.utils.PicassoHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchAdAdapter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"BF\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u000e2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0014\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeMatchAdAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/ui/fragment/home/adapter/HomeMatchAdAdapter$Holder;", "pager", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "onAdClickTracking", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", f.b.c, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getPager", "()Landroidx/recyclerview/widget/RecyclerView;", "setPager", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "add", "homeMatchAdsList", "", "Holder", "HomeMatchAdLinkType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchAdAdapter extends RecyclerView.Adapter<Holder> {
    public static final int $stable = 8;
    private final List<HomeMatchAd> list;
    private final Function1<String, Unit> onAdClickTracking;
    private RecyclerView pager;

    public final RecyclerView getPager() {
        return this.pager;
    }

    public final void setPager(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.pager = recyclerView;
    }

    public /* synthetic */ HomeMatchAdAdapter(RecyclerView recyclerView, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* compiled from: HomeMatchAdAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeMatchAdAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/betup/databinding/HomeMatchAdAdapterBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeMatchAdAdapter;Lorg/betup/databinding/HomeMatchAdAdapterBinding;)V", "getBinding", "()Lorg/betup/databinding/HomeMatchAdAdapterBinding;", "bind", "", "item", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Holder extends RecyclerView.ViewHolder {
        private final HomeMatchAdAdapterBinding binding;
        final /* synthetic */ HomeMatchAdAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(HomeMatchAdAdapter homeMatchAdAdapter, HomeMatchAdAdapterBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeMatchAdAdapter;
            this.binding = binding;
        }

        public final HomeMatchAdAdapterBinding getBinding() {
            return this.binding;
        }

        public final void bind(final HomeMatchAd item) {
            Intrinsics.checkNotNullParameter(item, "item");
            HomeMatchAdAdapterBinding homeMatchAdAdapterBinding = this.binding;
            final HomeMatchAdAdapter homeMatchAdAdapter = this.this$0;
            PicassoHelper.with(homeMatchAdAdapterBinding.getRoot().getContext()).setImageUrl(item.getImageUrl()).setImageView(homeMatchAdAdapterBinding.iconIv).load();
            homeMatchAdAdapterBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.HomeMatchAdAdapter$Holder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeMatchAdAdapter.Holder.bind$lambda$4$lambda$3(HomeMatchAd.this, homeMatchAdAdapter, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$4$lambda$3(HomeMatchAd homeMatchAd, HomeMatchAdAdapter homeMatchAdAdapter, View view) {
            Function1 function1;
            String id = homeMatchAd.getId();
            if (id != null && (function1 = homeMatchAdAdapter.onAdClickTracking) != null) {
                function1.invoke(id);
            }
            int linkType = homeMatchAd.getLinkType();
            if (linkType == HomeMatchAdLinkType.MATCH.ordinal()) {
                EventBus eventBus = EventBus.getDefault();
                NavigateMessage.Target target = NavigateMessage.Target.MATCH_DETAILS;
                Bundle bundle = new Bundle();
                bundle.putInt("matchId", homeMatchAd.getLinkId());
                Unit unit = Unit.INSTANCE;
                eventBus.post(new NavigateMessage(target, bundle));
                return;
            }
            if (linkType == HomeMatchAdLinkType.LEAGUE.ordinal()) {
                EventBus eventBus2 = EventBus.getDefault();
                NavigateMessage.Target target2 = NavigateMessage.Target.LEAGUE_MATCHES;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("id", homeMatchAd.getLinkId());
                bundle2.putBoolean("isLive", false);
                bundle2.putString("filter", "All");
                bundle2.putBoolean("isFavorite", false);
                Unit unit2 = Unit.INSTANCE;
                eventBus2.post(new NavigateMessage(target2, bundle2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeMatchAdAdapter(RecyclerView pager, List<HomeMatchAd> list, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(pager, "pager");
        Intrinsics.checkNotNullParameter(list, "list");
        this.pager = pager;
        this.list = list;
        this.onAdClickTracking = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HomeMatchAdAdapterBinding inflate = HomeMatchAdAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new Holder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
        if (this.pager.getAdapter() == null) {
            RecyclerView recyclerView = this.pager;
            int size = this.list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(false);
            }
            recyclerView.setAdapter(new HomeMatchAdPagesAdapter(arrayList, position));
            return;
        }
        RecyclerView.Adapter adapter = this.pager.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.ui.fragment.home.adapter.HomeMatchAdPagesAdapter");
        ((HomeMatchAdPagesAdapter) adapter).changeCurrentPage(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public final void add(List<HomeMatchAd> homeMatchAdsList) {
        Intrinsics.checkNotNullParameter(homeMatchAdsList, "homeMatchAdsList");
        this.list.addAll(homeMatchAdsList);
        notifyItemInserted(homeMatchAdsList.size());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeMatchAdAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeMatchAdAdapter$HomeMatchAdLinkType;", "", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "NONE", "MATCH", "LEAGUE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class HomeMatchAdLinkType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HomeMatchAdLinkType[] $VALUES;
        public static final HomeMatchAdLinkType NONE = new HomeMatchAdLinkType("NONE", 0, 0);
        public static final HomeMatchAdLinkType MATCH = new HomeMatchAdLinkType("MATCH", 1, 1);
        public static final HomeMatchAdLinkType LEAGUE = new HomeMatchAdLinkType("LEAGUE", 2, 2);

        private static final /* synthetic */ HomeMatchAdLinkType[] $values() {
            return new HomeMatchAdLinkType[]{NONE, MATCH, LEAGUE};
        }

        public static EnumEntries<HomeMatchAdLinkType> getEntries() {
            return $ENTRIES;
        }

        private HomeMatchAdLinkType(String str, int i, int i2) {
        }

        static {
            HomeMatchAdLinkType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static HomeMatchAdLinkType valueOf(String str) {
            return (HomeMatchAdLinkType) Enum.valueOf(HomeMatchAdLinkType.class, str);
        }

        public static HomeMatchAdLinkType[] values() {
            return (HomeMatchAdLinkType[]) $VALUES.clone();
        }
    }
}
