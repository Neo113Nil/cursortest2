package org.betup.ui.fragment.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ironsource.C3473f8;
import com.ironsource.C3664q2;
import com.ironsource.X3;
import com.vk.sdk.api.model.VKApiUserFull;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.github.vnicius.glowshapedrawable.Glow;
import io.github.vnicius.glowshapedrawable.GlowShapeDrawable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.databinding.BigButtonNavigationAdapterBinding;
import org.betup.databinding.DefaultButtonNavigationAdapterBinding;
import org.betup.databinding.MediumButtonMinigamesBinding;
import org.betup.databinding.MediumButtonNavigationAdapterBinding;
import org.betup.ui.fragment.home.adapter.HomeNavigationAdapter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeNavigationAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000b\u001f !\"#$%&'()B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001cR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "list", "", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "viewType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$NavigationViewType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$NavigationViewType;)V", "getViewType", "()Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$NavigationViewType;", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "getItemCount", C3664q2.v, "itemType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "hide", "changeVisibility", C3473f8.k, "", "setActive", "isActive", VastTagName.COMPANION, "HomeNavigationHolder", "TopHomeNavigationHolder", "MiddleHomeNavigationHolder", "BottomHomeNavigationHolder", "BottomMiniGamesHomeNavigationHolder", "HomeNavigationItem", "TopNavigationItem", "MiddleNavigationItem", "BottomNavigationItem", "NavigationViewType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeNavigationAdapter extends RecyclerView.Adapter<HomeNavigationHolder> {
    private final List<HomeNavigationItem> list;
    private final NavigationViewType viewType;
    public static final int $stable = 8;

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "", "itemType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "getItemType", "()Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "title", "", "getTitle", "()I", X3.i.H0, "getIcon", C3473f8.k, "", "()Z", "setVisible", "(Z)V", "isActive", "setActive", "action", "Lkotlin/Function0;", "", "getAction", "()Lkotlin/jvm/functions/Function0;", "NavigationItemType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HomeNavigationItem {

        /* compiled from: HomeNavigationAdapter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface NavigationItemType {
        }

        Function0<Unit> getAction();

        int getIcon();

        NavigationItemType getItemType();

        int getTitle();

        /* renamed from: isActive */
        boolean getIsActive();

        /* renamed from: isVisible */
        boolean getIsVisible();

        void setActive(boolean z);

        void setVisible(boolean z);
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomNavigationItem.BottomNavigationItemType.values().length];
            try {
                iArr[BottomNavigationItem.BottomNavigationItemType.MINIGAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final NavigationViewType getViewType() {
        return this.viewType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeNavigationAdapter(List<? extends HomeNavigationItem> list, NavigationViewType viewType) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.list = list;
        this.viewType = viewType;
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/viewbinding/ViewBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;Landroidx/viewbinding/ViewBinding;)V", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "bind", "", "item", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class HomeNavigationHolder extends RecyclerView.ViewHolder {
        private final ViewBinding binding;
        final /* synthetic */ HomeNavigationAdapter this$0;

        public abstract void bind(HomeNavigationItem item);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeNavigationHolder(HomeNavigationAdapter homeNavigationAdapter, ViewBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeNavigationAdapter;
            this.binding = binding;
        }

        public ViewBinding getBinding() {
            return this.binding;
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopHomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;", "binding", "Lorg/betup/databinding/DefaultButtonNavigationAdapterBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;Lorg/betup/databinding/DefaultButtonNavigationAdapterBinding;)V", "getBinding", "()Lorg/betup/databinding/DefaultButtonNavigationAdapterBinding;", "bind", "", "item", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TopHomeNavigationHolder extends HomeNavigationHolder {
        private final DefaultButtonNavigationAdapterBinding binding;
        final /* synthetic */ HomeNavigationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopHomeNavigationHolder(HomeNavigationAdapter homeNavigationAdapter, DefaultButtonNavigationAdapterBinding binding) {
            super(homeNavigationAdapter, binding);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeNavigationAdapter;
            this.binding = binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public DefaultButtonNavigationAdapterBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public void bind(final HomeNavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            DefaultButtonNavigationAdapterBinding binding = getBinding();
            binding.iconIv.setImageDrawable(AppCompatResources.getDrawable(binding.getRoot().getContext(), item.getIcon()));
            binding.btnTitleTv.setText(binding.getRoot().getContext().getString(item.getTitle()));
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$TopHomeNavigationHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeNavigationAdapter.TopHomeNavigationHolder.bind$lambda$1$lambda$0(HomeNavigationAdapter.HomeNavigationItem.this, view);
                }
            });
            binding.getRoot().setVisibility(item.getIsVisible() ? 0 : 8);
            binding.getRoot().setEnabled(item.getIsActive());
            ImageView imageView = binding.iconIv;
            boolean isActive = item.getIsActive();
            int i = R.color.secondary_text;
            imageView.setImageTintList(isActive ? null : AppCompatResources.getColorStateList(binding.getRoot().getContext(), R.color.secondary_text));
            TextView textView = binding.btnTitleTv;
            Context context = binding.getRoot().getContext();
            if (item.getIsActive()) {
                i = R.color.active_text;
            }
            textView.setTextColor(AppCompatResources.getColorStateList(context, i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(HomeNavigationItem homeNavigationItem, View view) {
            homeNavigationItem.getAction().invoke();
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleHomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;", "binding", "Lorg/betup/databinding/BigButtonNavigationAdapterBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;Lorg/betup/databinding/BigButtonNavigationAdapterBinding;)V", "getBinding", "()Lorg/betup/databinding/BigButtonNavigationAdapterBinding;", "bind", "", "item", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class MiddleHomeNavigationHolder extends HomeNavigationHolder {
        private final BigButtonNavigationAdapterBinding binding;
        final /* synthetic */ HomeNavigationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiddleHomeNavigationHolder(HomeNavigationAdapter homeNavigationAdapter, BigButtonNavigationAdapterBinding binding) {
            super(homeNavigationAdapter, binding);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeNavigationAdapter;
            this.binding = binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public BigButtonNavigationAdapterBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public void bind(final HomeNavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            MiddleNavigationItem middleNavigationItem = (MiddleNavigationItem) item;
            BigButtonNavigationAdapterBinding binding = getBinding();
            binding.btnTitleTv.setText(binding.getRoot().getContext().getString(middleNavigationItem.getTitle()));
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$MiddleHomeNavigationHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeNavigationAdapter.MiddleHomeNavigationHolder.bind$lambda$3$lambda$0(HomeNavigationAdapter.HomeNavigationItem.this, view);
                }
            });
            binding.getRoot().setVisibility(middleNavigationItem.getIsVisible() ? 0 : 8);
            binding.getRoot().setEnabled(middleNavigationItem.getIsActive());
            ImageView imageView = binding.iconIv;
            boolean isActive = middleNavigationItem.getIsActive();
            int i = R.color.secondary_text;
            imageView.setImageTintList(isActive ? null : AppCompatResources.getColorStateList(binding.getRoot().getContext(), R.color.secondary_text));
            TextView textView = binding.btnTitleTv;
            Context context = binding.getRoot().getContext();
            if (middleNavigationItem.getIsActive()) {
                i = R.color.active_text;
            }
            textView.setTextColor(AppCompatResources.getColorStateList(context, i));
            GlowShapeDrawable glowShapeDrawable = new GlowShapeDrawable();
            glowShapeDrawable.setGlow(new Glow(null, Integer.valueOf(getBinding().getRoot().getContext().getResources().getColor(R.color.active_btn, getBinding().getRoot().getContext().getTheme())), (int) getBinding().getRoot().getContext().getResources().getDimension(R.dimen.fab_stroke_width), 1, null));
            glowShapeDrawable.setCornerRadius(getBinding().getRoot().getContext().getResources().getDimension(R.dimen.corner_radius_rounded));
            View view = getBinding().indicatorV;
            view.setLayerType(1, glowShapeDrawable.getPaint());
            view.setBackground(glowShapeDrawable);
            if (middleNavigationItem.getPosition() != 0) {
                getBinding().indicatorV.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$3$lambda$0(HomeNavigationItem homeNavigationItem, View view) {
            homeNavigationItem.getAction().invoke();
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomHomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;", "binding", "Lorg/betup/databinding/MediumButtonNavigationAdapterBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;Lorg/betup/databinding/MediumButtonNavigationAdapterBinding;)V", "getBinding", "()Lorg/betup/databinding/MediumButtonNavigationAdapterBinding;", "bind", "", "item", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BottomHomeNavigationHolder extends HomeNavigationHolder {
        private final MediumButtonNavigationAdapterBinding binding;
        final /* synthetic */ HomeNavigationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomHomeNavigationHolder(HomeNavigationAdapter homeNavigationAdapter, MediumButtonNavigationAdapterBinding binding) {
            super(homeNavigationAdapter, binding);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeNavigationAdapter;
            this.binding = binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public MediumButtonNavigationAdapterBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public void bind(final HomeNavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            MediumButtonNavigationAdapterBinding binding = getBinding();
            binding.iconIv.setImageDrawable(AppCompatResources.getDrawable(binding.getRoot().getContext(), item.getIcon()));
            binding.btnTitleTv.setText(binding.getRoot().getContext().getString(item.getTitle()));
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$BottomHomeNavigationHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeNavigationAdapter.BottomHomeNavigationHolder.bind$lambda$1$lambda$0(HomeNavigationAdapter.HomeNavigationItem.this, view);
                }
            });
            binding.getRoot().setVisibility(item.getIsVisible() ? 0 : 8);
            binding.getRoot().setEnabled(item.getIsActive());
            ImageView imageView = binding.iconIv;
            boolean isActive = item.getIsActive();
            int i = R.color.secondary_text;
            imageView.setImageTintList(isActive ? null : AppCompatResources.getColorStateList(binding.getRoot().getContext(), R.color.secondary_text));
            TextView textView = binding.btnTitleTv;
            Context context = binding.getRoot().getContext();
            if (item.getIsActive()) {
                i = R.color.active_text;
            }
            textView.setTextColor(AppCompatResources.getColorStateList(context, i));
            getBinding().getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$BottomHomeNavigationHolder$bind$1$2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (HomeNavigationAdapter.BottomHomeNavigationHolder.this.getBinding().getRoot().getWidth() > 0) {
                        HomeNavigationAdapter.BottomHomeNavigationHolder.this.getBinding().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ViewGroup.LayoutParams layoutParams = HomeNavigationAdapter.BottomHomeNavigationHolder.this.getBinding().getRoot().getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(HomeNavigationItem homeNavigationItem, View view) {
            homeNavigationItem.getAction().invoke();
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomMiniGamesHomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationHolder;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;", "binding", "Lorg/betup/databinding/MediumButtonMinigamesBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter;Lorg/betup/databinding/MediumButtonMinigamesBinding;)V", "getBinding", "()Lorg/betup/databinding/MediumButtonMinigamesBinding;", "bind", "", "item", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BottomMiniGamesHomeNavigationHolder extends HomeNavigationHolder {
        private final MediumButtonMinigamesBinding binding;
        final /* synthetic */ HomeNavigationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomMiniGamesHomeNavigationHolder(HomeNavigationAdapter homeNavigationAdapter, MediumButtonMinigamesBinding binding) {
            super(homeNavigationAdapter, binding);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = homeNavigationAdapter;
            this.binding = binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public MediumButtonMinigamesBinding getBinding() {
            return this.binding;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationHolder
        public void bind(final HomeNavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            MediumButtonMinigamesBinding binding = getBinding();
            binding.iconIv.setImageDrawable(AppCompatResources.getDrawable(binding.getRoot().getContext(), item.getIcon()));
            binding.btnTitleTv.setText(binding.getRoot().getContext().getString(item.getTitle()));
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$BottomMiniGamesHomeNavigationHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeNavigationAdapter.BottomMiniGamesHomeNavigationHolder.bind$lambda$1$lambda$0(HomeNavigationAdapter.HomeNavigationItem.this, view);
                }
            });
            binding.getRoot().setVisibility(item.getIsVisible() ? 0 : 8);
            binding.getRoot().setEnabled(item.getIsActive());
            ImageView imageView = binding.iconIv;
            boolean isActive = item.getIsActive();
            int i = R.color.secondary_text;
            imageView.setImageTintList(isActive ? null : AppCompatResources.getColorStateList(binding.getRoot().getContext(), R.color.secondary_text));
            TextView textView = binding.btnTitleTv;
            Context context = binding.getRoot().getContext();
            if (item.getIsActive()) {
                i = R.color.active_text;
            }
            textView.setTextColor(AppCompatResources.getColorStateList(context, i));
            getBinding().getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.betup.ui.fragment.home.adapter.HomeNavigationAdapter$BottomMiniGamesHomeNavigationHolder$bind$1$2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (HomeNavigationAdapter.BottomMiniGamesHomeNavigationHolder.this.getBinding().getRoot().getWidth() > 0) {
                        HomeNavigationAdapter.BottomMiniGamesHomeNavigationHolder.this.getBinding().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ViewGroup.LayoutParams layoutParams = HomeNavigationAdapter.BottomMiniGamesHomeNavigationHolder.this.getBinding().getRoot().getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(HomeNavigationItem homeNavigationItem, View view) {
            homeNavigationItem.getAction().invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HomeNavigationHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Companion.ViewTypes.TOP.ordinal()) {
            DefaultButtonNavigationAdapterBinding inflate = DefaultButtonNavigationAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            ViewGroup.LayoutParams layoutParams = inflate.getRoot().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
            FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) layoutParams;
            layoutParams2.setFlexGrow(1.0f);
            layoutParams2.width = 0;
            return new TopHomeNavigationHolder(this, inflate);
        }
        if (viewType == Companion.ViewTypes.MIDDLE.ordinal()) {
            BigButtonNavigationAdapterBinding inflate2 = BigButtonNavigationAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            ViewGroup.LayoutParams layoutParams3 = inflate2.getRoot().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
            FlexboxLayoutManager.LayoutParams layoutParams4 = (FlexboxLayoutManager.LayoutParams) layoutParams3;
            layoutParams4.setFlexGrow(1.0f);
            layoutParams4.width = 0;
            return new MiddleHomeNavigationHolder(this, inflate2);
        }
        if (viewType == Companion.ViewTypes.MINIGAMES.ordinal()) {
            MediumButtonMinigamesBinding inflate3 = MediumButtonMinigamesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
            ViewGroup.LayoutParams layoutParams5 = inflate3.getRoot().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
            FlexboxLayoutManager.LayoutParams layoutParams6 = (FlexboxLayoutManager.LayoutParams) layoutParams5;
            layoutParams6.setFlexGrow(1.0f);
            layoutParams6.width = 0;
            return new BottomMiniGamesHomeNavigationHolder(this, inflate3);
        }
        MediumButtonNavigationAdapterBinding inflate4 = MediumButtonNavigationAdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
        ViewGroup.LayoutParams layoutParams7 = inflate4.getRoot().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
        FlexboxLayoutManager.LayoutParams layoutParams8 = (FlexboxLayoutManager.LayoutParams) layoutParams7;
        layoutParams8.setFlexGrow(1.0f);
        layoutParams8.width = 0;
        return new BottomHomeNavigationHolder(this, inflate4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        HomeNavigationItem homeNavigationItem = this.list.get(position);
        if (!(homeNavigationItem instanceof BottomNavigationItem)) {
            HomeNavigationItem.NavigationItemType itemType = this.list.get(position).getItemType();
            return itemType instanceof TopNavigationItem.TopNavigationItemType ? Companion.ViewTypes.TOP.ordinal() : itemType instanceof MiddleNavigationItem.MiddleNavigationItemType ? Companion.ViewTypes.MIDDLE.ordinal() : Companion.ViewTypes.BOTTOM.ordinal();
        }
        if (WhenMappings.$EnumSwitchMapping$0[((BottomNavigationItem) homeNavigationItem).getItemType().ordinal()] == 1) {
            return Companion.ViewTypes.MINIGAMES.ordinal();
        }
        return Companion.ViewTypes.BOTTOM.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HomeNavigationHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (position == this.list.size() - 1) {
            ViewGroup.LayoutParams layoutParams = holder.getBinding().getRoot().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
            ((FlexboxLayoutManager.LayoutParams) layoutParams).setMarginEnd(0);
        } else if (position == 0) {
            ViewGroup.LayoutParams layoutParams2 = holder.getBinding().getRoot().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager.LayoutParams");
            ((FlexboxLayoutManager.LayoutParams) layoutParams2).setMarginStart(0);
        }
        if (holder instanceof MiddleHomeNavigationHolder) {
            HomeNavigationItem homeNavigationItem = this.list.get(position);
            Intrinsics.checkNotNull(homeNavigationItem, "null cannot be cast to non-null type org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.MiddleNavigationItem");
            ((MiddleNavigationItem) homeNavigationItem).setPosition(position);
        }
        holder.bind(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public final void show(HomeNavigationItem.NavigationItemType itemType) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        changeVisibility(itemType, true);
    }

    public final void hide(HomeNavigationItem.NavigationItemType itemType) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        changeVisibility(itemType, false);
    }

    private final void changeVisibility(HomeNavigationItem.NavigationItemType itemType, boolean isVisible) {
        Iterator<HomeNavigationItem> it = this.list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getItemType(), itemType)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.list.get(i).setVisible(isVisible);
            notifyItemChanged(i);
        }
    }

    public final void setActive(HomeNavigationItem.NavigationItemType itemType, boolean isActive) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Iterator<HomeNavigationItem> it = this.list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getItemType(), itemType)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.list.get(i).setActive(isActive);
            notifyItemChanged(i);
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopNavigationItem;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "itemType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopNavigationItem$TopNavigationItemType;", "title", "", X3.i.H0, C3473f8.k, "", "isActive", "action", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopNavigationItem$TopNavigationItemType;IIZZLkotlin/jvm/functions/Function0;)V", "getItemType", "()Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopNavigationItem$TopNavigationItemType;", "getTitle", "()I", "getIcon", "()Z", "setVisible", "(Z)V", "setActive", "getAction", "()Lkotlin/jvm/functions/Function0;", "TopNavigationItemType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TopNavigationItem implements HomeNavigationItem {
        public static final int $stable = 8;
        private final Function0<Unit> action;
        private final int icon;
        private boolean isActive;
        private boolean isVisible;
        private final TopNavigationItemType itemType;
        private final int title;

        public TopNavigationItem(TopNavigationItemType itemType, int i, int i2, boolean z, boolean z2, Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(action, "action");
            this.itemType = itemType;
            this.title = i;
            this.icon = i2;
            this.isVisible = z;
            this.isActive = z2;
            this.action = action;
        }

        public /* synthetic */ TopNavigationItem(TopNavigationItemType topNavigationItemType, int i, int i2, boolean z, boolean z2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(topNavigationItemType, i, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? true : z2, function0);
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public TopNavigationItemType getItemType() {
            return this.itemType;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getIcon() {
            return this.icon;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isVisible, reason: from getter */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setVisible(boolean z) {
            this.isVisible = z;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isActive, reason: from getter */
        public boolean getIsActive() {
            return this.isActive;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setActive(boolean z) {
            this.isActive = z;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public Function0<Unit> getAction() {
            return this.action;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HomeNavigationAdapter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$TopNavigationItem$TopNavigationItemType;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "DAILY", "TASKS", "BONUS_OFFER", "ADS", "SCORES", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TopNavigationItemType implements HomeNavigationItem.NavigationItemType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TopNavigationItemType[] $VALUES;
            public static final TopNavigationItemType DAILY = new TopNavigationItemType("DAILY", 0);
            public static final TopNavigationItemType TASKS = new TopNavigationItemType("TASKS", 1);
            public static final TopNavigationItemType BONUS_OFFER = new TopNavigationItemType("BONUS_OFFER", 2);
            public static final TopNavigationItemType ADS = new TopNavigationItemType("ADS", 3);
            public static final TopNavigationItemType SCORES = new TopNavigationItemType("SCORES", 4);

            private static final /* synthetic */ TopNavigationItemType[] $values() {
                return new TopNavigationItemType[]{DAILY, TASKS, BONUS_OFFER, ADS, SCORES};
            }

            public static EnumEntries<TopNavigationItemType> getEntries() {
                return $ENTRIES;
            }

            private TopNavigationItemType(String str, int i) {
            }

            static {
                TopNavigationItemType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static TopNavigationItemType valueOf(String str) {
                return (TopNavigationItemType) Enum.valueOf(TopNavigationItemType.class, str);
            }

            public static TopNavigationItemType[] values() {
                return (TopNavigationItemType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0015\"\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleNavigationItem;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "itemType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleNavigationItem$MiddleNavigationItemType;", "title", "", X3.i.H0, C3473f8.k, "", "isActive", "position", "action", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleNavigationItem$MiddleNavigationItemType;IIZZILkotlin/jvm/functions/Function0;)V", "getItemType", "()Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleNavigationItem$MiddleNavigationItemType;", "getTitle", "()I", "getIcon", "()Z", "setVisible", "(Z)V", "setActive", "getPosition", "setPosition", "(I)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "MiddleNavigationItemType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MiddleNavigationItem implements HomeNavigationItem {
        public static final int $stable = 8;
        private final Function0<Unit> action;
        private final int icon;
        private boolean isActive;
        private boolean isVisible;
        private final MiddleNavigationItemType itemType;
        private int position;
        private final int title;

        public MiddleNavigationItem(MiddleNavigationItemType itemType, int i, int i2, boolean z, boolean z2, int i3, Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(action, "action");
            this.itemType = itemType;
            this.title = i;
            this.icon = i2;
            this.isVisible = z;
            this.isActive = z2;
            this.position = i3;
            this.action = action;
        }

        public /* synthetic */ MiddleNavigationItem(MiddleNavigationItemType middleNavigationItemType, int i, int i2, boolean z, boolean z2, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(middleNavigationItemType, i, i2, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? true : z2, (i4 & 32) != 0 ? 0 : i3, function0);
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public MiddleNavigationItemType getItemType() {
            return this.itemType;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getIcon() {
            return this.icon;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isVisible, reason: from getter */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setVisible(boolean z) {
            this.isVisible = z;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isActive, reason: from getter */
        public boolean getIsActive() {
            return this.isActive;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setActive(boolean z) {
            this.isActive = z;
        }

        public final int getPosition() {
            return this.position;
        }

        public final void setPosition(int i) {
            this.position = i;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public Function0<Unit> getAction() {
            return this.action;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HomeNavigationAdapter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$MiddleNavigationItem$MiddleNavigationItemType;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "BATTLES", "COMPETITIONS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MiddleNavigationItemType implements HomeNavigationItem.NavigationItemType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ MiddleNavigationItemType[] $VALUES;
            public static final MiddleNavigationItemType BATTLES = new MiddleNavigationItemType("BATTLES", 0);
            public static final MiddleNavigationItemType COMPETITIONS = new MiddleNavigationItemType("COMPETITIONS", 1);

            private static final /* synthetic */ MiddleNavigationItemType[] $values() {
                return new MiddleNavigationItemType[]{BATTLES, COMPETITIONS};
            }

            public static EnumEntries<MiddleNavigationItemType> getEntries() {
                return $ENTRIES;
            }

            private MiddleNavigationItemType(String str, int i) {
            }

            static {
                MiddleNavigationItemType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static MiddleNavigationItemType valueOf(String str) {
                return (MiddleNavigationItemType) Enum.valueOf(MiddleNavigationItemType.class, str);
            }

            public static MiddleNavigationItemType[] values() {
                return (MiddleNavigationItemType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomNavigationItem;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem;", "itemType", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomNavigationItem$BottomNavigationItemType;", "title", "", X3.i.H0, C3473f8.k, "", "isActive", "action", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomNavigationItem$BottomNavigationItemType;IIZZLkotlin/jvm/functions/Function0;)V", "getItemType", "()Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomNavigationItem$BottomNavigationItemType;", "getTitle", "()I", "getIcon", "()Z", "setVisible", "(Z)V", "setActive", "getAction", "()Lkotlin/jvm/functions/Function0;", "BottomNavigationItemType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomNavigationItem implements HomeNavigationItem {
        public static final int $stable = 8;
        private final Function0<Unit> action;
        private final int icon;
        private boolean isActive;
        private boolean isVisible;
        private final BottomNavigationItemType itemType;
        private final int title;

        public BottomNavigationItem(BottomNavigationItemType itemType, int i, int i2, boolean z, boolean z2, Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(action, "action");
            this.itemType = itemType;
            this.title = i;
            this.icon = i2;
            this.isVisible = z;
            this.isActive = z2;
            this.action = action;
        }

        public /* synthetic */ BottomNavigationItem(BottomNavigationItemType bottomNavigationItemType, int i, int i2, boolean z, boolean z2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(bottomNavigationItemType, i, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? true : z2, function0);
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public BottomNavigationItemType getItemType() {
            return this.itemType;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getTitle() {
            return this.title;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public int getIcon() {
            return this.icon;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isVisible, reason: from getter */
        public boolean getIsVisible() {
            return this.isVisible;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setVisible(boolean z) {
            this.isVisible = z;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        /* renamed from: isActive, reason: from getter */
        public boolean getIsActive() {
            return this.isActive;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public void setActive(boolean z) {
            this.isActive = z;
        }

        @Override // org.betup.ui.fragment.home.adapter.HomeNavigationAdapter.HomeNavigationItem
        public Function0<Unit> getAction() {
            return this.action;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HomeNavigationAdapter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$BottomNavigationItem$BottomNavigationItemType;", "Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$HomeNavigationItem$NavigationItemType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "RANKINGS", "TOP_MATCHES", "MINIGAMES", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BottomNavigationItemType implements HomeNavigationItem.NavigationItemType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ BottomNavigationItemType[] $VALUES;
            public static final BottomNavigationItemType RANKINGS = new BottomNavigationItemType("RANKINGS", 0);
            public static final BottomNavigationItemType TOP_MATCHES = new BottomNavigationItemType("TOP_MATCHES", 1);
            public static final BottomNavigationItemType MINIGAMES = new BottomNavigationItemType("MINIGAMES", 2);

            private static final /* synthetic */ BottomNavigationItemType[] $values() {
                return new BottomNavigationItemType[]{RANKINGS, TOP_MATCHES, MINIGAMES};
            }

            public static EnumEntries<BottomNavigationItemType> getEntries() {
                return $ENTRIES;
            }

            private BottomNavigationItemType(String str, int i) {
            }

            static {
                BottomNavigationItemType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static BottomNavigationItemType valueOf(String str) {
                return (BottomNavigationItemType) Enum.valueOf(BottomNavigationItemType.class, str);
            }

            public static BottomNavigationItemType[] values() {
                return (BottomNavigationItemType[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeNavigationAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/home/adapter/HomeNavigationAdapter$NavigationViewType;", "", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getId", "()I", "TOP", "MIDDLE", "BOTTOM", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NavigationViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationViewType[] $VALUES;
        private final int id;
        public static final NavigationViewType TOP = new NavigationViewType("TOP", 0, 0);
        public static final NavigationViewType MIDDLE = new NavigationViewType("MIDDLE", 1, 1);
        public static final NavigationViewType BOTTOM = new NavigationViewType("BOTTOM", 2, 2);

        private static final /* synthetic */ NavigationViewType[] $values() {
            return new NavigationViewType[]{TOP, MIDDLE, BOTTOM};
        }

        public static EnumEntries<NavigationViewType> getEntries() {
            return $ENTRIES;
        }

        private NavigationViewType(String str, int i, int i2) {
            this.id = i2;
        }

        public final int getId() {
            return this.id;
        }

        static {
            NavigationViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static NavigationViewType valueOf(String str) {
            return (NavigationViewType) Enum.valueOf(NavigationViewType.class, str);
        }

        public static NavigationViewType[] values() {
            return (NavigationViewType[]) $VALUES.clone();
        }
    }
}
