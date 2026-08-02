package org.betup.games.luckyCells.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sdk.api.model.VKApiUserFull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;
import org.betup.R;
import org.betup.databinding.AdapterMapItemLuckyCellsBinding;
import org.betup.games.luckyCells.model.rest.LuckyCellsGameConfig;
import org.betup.games.luckyCells.model.rest.RecordLuckyCellsGameModel;
import org.betup.games.luckyCells.ui.LuckyCellsGameAdapter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LuckyCellsGameAdapter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001/B9\u0012\u001e\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\tJ\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u001c\u0010\u0019\u001a\u00020\u00072\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0006\u0010 \u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u0007J\u001c\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002J\u0016\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0,H\u0002J\u0006\u0010*\u001a\u00020\u0007J*\u0010-\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0,2\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002R)\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/games/luckyCells/ui/LuckyCellsGameAdapter$LuckyCellsGameViewHolder;", "click", "Lkotlin/reflect/KProperty0;", "Lkotlin/Function2;", "", "", "_canPlay", "", "gameConfig", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/reflect/KProperty0;ZLorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;)V", "getClick", "()Lkotlin/reflect/KProperty0;", "binding", "Lorg/betup/databinding/AdapterMapItemLuckyCellsBinding;", "getCanPlay", "setCanPlay", "canPlay", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "cellsMap", "", "Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel$CellType;", "getPrizeRemainsCount", "getTrapRemainsCount", "updateCell", "cellType", "resetCells", "resetCellsSequentially", "index", "animationDelay", "onResetCellsEnd", "Lkotlin/Function0;", "openAllCells", "newCellsMap", "", "openCellsSequentially", "onOpenCellsEnd", "LuckyCellsGameViewHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LuckyCellsGameAdapter extends RecyclerView.Adapter<LuckyCellsGameViewHolder> {
    public static final int $stable = 8;
    private boolean _canPlay;
    private AdapterMapItemLuckyCellsBinding binding;
    private final List<RecordLuckyCellsGameModel.CellType> cellsMap;
    private final KProperty0<Function2<Integer, Integer, Unit>> click;
    private final LuckyCellsGameConfig gameConfig;
    private final Function0<Unit> onOpenCellsEnd;
    private final Function0<Unit> onResetCellsEnd;

    public /* synthetic */ LuckyCellsGameAdapter(KProperty0 kProperty0, boolean z, LuckyCellsGameConfig luckyCellsGameConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kProperty0, (i & 2) != 0 ? false : z, luckyCellsGameConfig);
    }

    public final KProperty0<Function2<Integer, Integer, Unit>> getClick() {
        return this.click;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LuckyCellsGameAdapter(KProperty0<? extends Function2<? super Integer, ? super Integer, Unit>> click, boolean z, LuckyCellsGameConfig gameConfig) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(gameConfig, "gameConfig");
        this.click = click;
        this._canPlay = z;
        this.gameConfig = gameConfig;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 25; i++) {
            arrayList.add(RecordLuckyCellsGameModel.CellType.NONE);
        }
        this.cellsMap = arrayList;
        this.onResetCellsEnd = new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onResetCellsEnd$lambda$5;
                onResetCellsEnd$lambda$5 = LuckyCellsGameAdapter.onResetCellsEnd$lambda$5(LuckyCellsGameAdapter.this);
                return onResetCellsEnd$lambda$5;
            }
        };
        this.onOpenCellsEnd = new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onOpenCellsEnd$lambda$13;
                onOpenCellsEnd$lambda$13 = LuckyCellsGameAdapter.onOpenCellsEnd$lambda$13(LuckyCellsGameAdapter.this);
                return onOpenCellsEnd$lambda$13;
            }
        };
    }

    /* renamed from: getCanPlay, reason: from getter */
    public final boolean get_canPlay() {
        return this._canPlay;
    }

    public final void setCanPlay(boolean canPlay) {
        this._canPlay = canPlay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LuckyCellsGameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.binding = AdapterMapItemLuckyCellsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AdapterMapItemLuckyCellsBinding adapterMapItemLuckyCellsBinding = this.binding;
        if (adapterMapItemLuckyCellsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            adapterMapItemLuckyCellsBinding = null;
        }
        return new LuckyCellsGameViewHolder(this, adapterMapItemLuckyCellsBinding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(LuckyCellsGameViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.click, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int mapSize = this.gameConfig.getMapSize();
        return mapSize * mapSize;
    }

    public final int getPrizeRemainsCount() {
        int size = this.cellsMap.size();
        List<RecordLuckyCellsGameModel.CellType> list = this.cellsMap;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((RecordLuckyCellsGameModel.CellType) it.next()) == RecordLuckyCellsGameModel.CellType.PRIZE && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return (size - i) - this.gameConfig.getMaxTrapsCount();
    }

    public final int getTrapRemainsCount() {
        int maxTrapsCount = this.gameConfig.getMaxTrapsCount();
        List<RecordLuckyCellsGameModel.CellType> list = this.cellsMap;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((RecordLuckyCellsGameModel.CellType) it.next()) == RecordLuckyCellsGameModel.CellType.TRAP && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return maxTrapsCount - i;
    }

    /* compiled from: LuckyCellsGameAdapter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J0\u0010\u0015\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameAdapter$LuckyCellsGameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/betup/databinding/AdapterMapItemLuckyCellsBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/luckyCells/ui/LuckyCellsGameAdapter;Lorg/betup/databinding/AdapterMapItemLuckyCellsBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterMapItemLuckyCellsBinding;", "bind", "", "click", "Lkotlin/reflect/KProperty0;", "Lkotlin/Function2;", "", "position", "updateCellDrawable", "imageView", "Landroid/widget/ImageView;", "resId", "openCell", "closeCell", "onItemClickListener", "animateViewDisappearance", "resource", "Landroid/view/View;", "endAction", "Lkotlin/Function0;", "animateViewAppearance", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class LuckyCellsGameViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMapItemLuckyCellsBinding binding;
        final /* synthetic */ LuckyCellsGameAdapter this$0;

        /* compiled from: LuckyCellsGameAdapter.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RecordLuckyCellsGameModel.CellType.values().length];
                try {
                    iArr[RecordLuckyCellsGameModel.CellType.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RecordLuckyCellsGameModel.CellType.TRAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RecordLuckyCellsGameModel.CellType.PRIZE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LuckyCellsGameViewHolder(LuckyCellsGameAdapter luckyCellsGameAdapter, AdapterMapItemLuckyCellsBinding binding) {
            super(binding.getRoot().getRootView());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = luckyCellsGameAdapter;
            this.binding = binding;
        }

        public final AdapterMapItemLuckyCellsBinding getBinding() {
            return this.binding;
        }

        public final void bind(final KProperty0<? extends Function2<? super Integer, ? super Integer, Unit>> click, final int position) {
            Intrinsics.checkNotNullParameter(click, "click");
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LuckyCellsGameAdapter.LuckyCellsGameViewHolder.this.onItemClickListener(click, position);
                }
            });
            int i = WhenMappings.$EnumSwitchMapping$0[((RecordLuckyCellsGameModel.CellType) this.this$0.cellsMap.get(position)).ordinal()];
            if (i == 1) {
                closeCell();
                return;
            }
            if (i == 2) {
                ImageView mapItemI = this.binding.mapItemI;
                Intrinsics.checkNotNullExpressionValue(mapItemI, "mapItemI");
                updateCellDrawable(mapItemI, R.drawable.lucky_cells_map_item_open_failed);
                openCell();
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ImageView mapItemI2 = this.binding.mapItemI;
            Intrinsics.checkNotNullExpressionValue(mapItemI2, "mapItemI");
            updateCellDrawable(mapItemI2, R.drawable.lucky_cells_map_item_open_success);
            openCell();
        }

        private final void updateCellDrawable(ImageView imageView, int resId) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(this.binding.getRoot().getContext(), resId));
        }

        private final void openCell() {
            ImageView mapItemV = this.binding.mapItemV;
            Intrinsics.checkNotNullExpressionValue(mapItemV, "mapItemV");
            animateViewDisappearance(mapItemV, new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit openCell$lambda$1;
                    openCell$lambda$1 = LuckyCellsGameAdapter.LuckyCellsGameViewHolder.openCell$lambda$1(LuckyCellsGameAdapter.LuckyCellsGameViewHolder.this);
                    return openCell$lambda$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit openCell$lambda$1(LuckyCellsGameViewHolder luckyCellsGameViewHolder) {
            ImageView mapItemI = luckyCellsGameViewHolder.binding.mapItemI;
            Intrinsics.checkNotNullExpressionValue(mapItemI, "mapItemI");
            animateViewAppearance$default(luckyCellsGameViewHolder, mapItemI, null, 2, null);
            return Unit.INSTANCE;
        }

        private final void closeCell() {
            ImageView mapItemV = this.binding.mapItemV;
            Intrinsics.checkNotNullExpressionValue(mapItemV, "mapItemV");
            animateViewAppearance(mapItemV, new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit closeCell$lambda$2;
                    closeCell$lambda$2 = LuckyCellsGameAdapter.LuckyCellsGameViewHolder.closeCell$lambda$2(LuckyCellsGameAdapter.LuckyCellsGameViewHolder.this);
                    return closeCell$lambda$2;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit closeCell$lambda$2(LuckyCellsGameViewHolder luckyCellsGameViewHolder) {
            ImageView mapItemI = luckyCellsGameViewHolder.binding.mapItemI;
            Intrinsics.checkNotNullExpressionValue(mapItemI, "mapItemI");
            animateViewDisappearance$default(luckyCellsGameViewHolder, mapItemI, null, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onItemClickListener(KProperty0<? extends Function2<? super Integer, ? super Integer, Unit>> click, int position) {
            if (this.this$0.get_canPlay() && this.this$0.cellsMap.get(position) == RecordLuckyCellsGameModel.CellType.NONE && position != -1) {
                click.get().invoke(Integer.valueOf(position / this.this$0.gameConfig.getMapSize()), Integer.valueOf(position % this.this$0.gameConfig.getMapSize()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void animateViewDisappearance$default(LuckyCellsGameViewHolder luckyCellsGameViewHolder, View view, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            luckyCellsGameViewHolder.animateViewDisappearance(view, function0);
        }

        private final void animateViewDisappearance(final View resource, final Function0<Unit> endAction) {
            resource.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LuckyCellsGameAdapter.LuckyCellsGameViewHolder.animateViewDisappearance$lambda$5$lambda$4(resource, endAction);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animateViewDisappearance$lambda$5$lambda$4(View view, Function0 function0) {
            view.setVisibility(4);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            function0.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void animateViewAppearance$default(LuckyCellsGameViewHolder luckyCellsGameViewHolder, View view, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            luckyCellsGameViewHolder.animateViewAppearance(view, function0);
        }

        private final void animateViewAppearance(final View resource, final Function0<Unit> endAction) {
            resource.setVisibility(0);
            resource.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$LuckyCellsGameViewHolder$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LuckyCellsGameAdapter.LuckyCellsGameViewHolder.animateViewAppearance$lambda$8$lambda$7(Function0.this, resource);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animateViewAppearance$lambda$8$lambda$7(Function0 function0, View view) {
            function0.invoke();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    public final void updateCell(int position, RecordLuckyCellsGameModel.CellType cellType) {
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        this.cellsMap.set(position, cellType);
        notifyItemChanged(position);
    }

    public final void resetCells() {
        setCanPlay(false);
        resetCellsSequentially$default(this, 0, 1500 / this.cellsMap.size(), 1, null);
    }

    static /* synthetic */ void resetCellsSequentially$default(LuckyCellsGameAdapter luckyCellsGameAdapter, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 20;
        }
        luckyCellsGameAdapter.resetCellsSequentially(i, i2);
    }

    private final void resetCellsSequentially(final int index, int animationDelay) {
        if (index >= this.cellsMap.size()) {
            this.onResetCellsEnd.invoke();
            return;
        }
        if (this.cellsMap.get(index) == RecordLuckyCellsGameModel.CellType.NONE) {
            resetCellsSequentially$default(this, index + 1, 0, 2, null);
            return;
        }
        updateCell(index, RecordLuckyCellsGameModel.CellType.NONE);
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        new Handler(myLooper).postDelayed(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameAdapter.resetCellsSequentially$lambda$4(LuckyCellsGameAdapter.this, index);
            }
        }, animationDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetCellsSequentially$lambda$4(LuckyCellsGameAdapter luckyCellsGameAdapter, int i) {
        resetCellsSequentially$default(luckyCellsGameAdapter, i + 1, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResetCellsEnd$lambda$5(LuckyCellsGameAdapter luckyCellsGameAdapter) {
        luckyCellsGameAdapter.setCanPlay(true);
        return Unit.INSTANCE;
    }

    private final void openAllCells(List<? extends RecordLuckyCellsGameModel.CellType> newCellsMap) {
        setCanPlay(false);
        openCellsSequentially$default(this, newCellsMap, 0, 1500 / newCellsMap.size(), 2, null);
    }

    public final void openAllCells() {
        int i;
        int i2 = 0;
        setCanPlay(false);
        List<? extends RecordLuckyCellsGameModel.CellType> mutableList = CollectionsKt.toMutableList((Collection) this.cellsMap);
        int maxTrapsCount = this.gameConfig.getMaxTrapsCount();
        List<RecordLuckyCellsGameModel.CellType> list = this.cellsMap;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((RecordLuckyCellsGameModel.CellType) it.next()) == RecordLuckyCellsGameModel.CellType.TRAP && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i3 = maxTrapsCount - i;
        this.cellsMap.size();
        List<RecordLuckyCellsGameModel.CellType> list2 = this.cellsMap;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((RecordLuckyCellsGameModel.CellType) it2.next()) == RecordLuckyCellsGameModel.CellType.PRIZE && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.gameConfig.getMaxTrapsCount();
        IntRange indices = CollectionsKt.getIndices(this.cellsMap);
        ArrayList arrayList = new ArrayList();
        for (Integer num : indices) {
            if (this.cellsMap.get(num.intValue()) != RecordLuckyCellsGameModel.CellType.NONE) {
                arrayList.add(num);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int intValue = ((Number) it3.next()).intValue();
            mutableList.set(intValue, this.cellsMap.get(intValue));
        }
        IntRange indices2 = CollectionsKt.getIndices(this.cellsMap);
        ArrayList arrayList2 = new ArrayList();
        for (Integer num2 : indices2) {
            if (this.cellsMap.get(num2.intValue()) == RecordLuckyCellsGameModel.CellType.NONE) {
                arrayList2.add(num2);
            }
        }
        Iterator it4 = CollectionsKt.shuffled(arrayList2).iterator();
        while (it4.hasNext()) {
            int intValue2 = ((Number) it4.next()).intValue();
            if (i3 > 0) {
                mutableList.set(intValue2, RecordLuckyCellsGameModel.CellType.TRAP);
                i3--;
            } else {
                mutableList.set(intValue2, RecordLuckyCellsGameModel.CellType.PRIZE);
            }
        }
        openAllCells(mutableList);
    }

    static /* synthetic */ void openCellsSequentially$default(LuckyCellsGameAdapter luckyCellsGameAdapter, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 20;
        }
        luckyCellsGameAdapter.openCellsSequentially(list, i, i2);
    }

    private final void openCellsSequentially(final List<? extends RecordLuckyCellsGameModel.CellType> newCellsMap, final int index, int animationDelay) {
        if (index >= newCellsMap.size()) {
            this.onOpenCellsEnd.invoke();
            return;
        }
        if (this.cellsMap.get(index) == newCellsMap.get(index)) {
            openCellsSequentially$default(this, newCellsMap, index + 1, 0, 4, null);
            return;
        }
        updateCell(index, newCellsMap.get(index));
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        new Handler(myLooper).postDelayed(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameAdapter$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameAdapter.openCellsSequentially$lambda$12(LuckyCellsGameAdapter.this, newCellsMap, index);
            }
        }, animationDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCellsSequentially$lambda$12(LuckyCellsGameAdapter luckyCellsGameAdapter, List list, int i) {
        openCellsSequentially$default(luckyCellsGameAdapter, list, i + 1, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOpenCellsEnd$lambda$13(LuckyCellsGameAdapter luckyCellsGameAdapter) {
        luckyCellsGameAdapter.setCanPlay(true);
        return Unit.INSTANCE;
    }
}
