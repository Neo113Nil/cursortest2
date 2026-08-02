package org.betup.games.luckyCells.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.sdk.api.model.VKApiUserFull;
import io.github.vnicius.glowshapedrawable.Glow;
import io.github.vnicius.glowshapedrawable.GlowShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.databinding.AdapterCoefItemLuckyCellsBinding;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LuckyCellsGameCoefAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameCoefAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/games/luckyCells/ui/LuckyCellsGameCoefAdapter$LuckyCellsGameCoefViewHolder;", "dataList", "", "", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Map;)V", "binding", "Lorg/betup/databinding/AdapterCoefItemLuckyCellsBinding;", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "next", "getCurrentCoef", "bet", "", "getCurrentCoefPosition", "getNextCoef", "LuckyCellsGameCoefViewHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LuckyCellsGameCoefAdapter extends RecyclerView.Adapter<LuckyCellsGameCoefViewHolder> {
    public static final int $stable = 8;
    private AdapterCoefItemLuckyCellsBinding binding;
    private Map<Double, Boolean> dataList;

    public LuckyCellsGameCoefAdapter(Map<Double, Boolean> map) {
        this.dataList = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LuckyCellsGameCoefViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.binding = AdapterCoefItemLuckyCellsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        AdapterCoefItemLuckyCellsBinding adapterCoefItemLuckyCellsBinding = this.binding;
        if (adapterCoefItemLuckyCellsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            adapterCoefItemLuckyCellsBinding = null;
        }
        return new LuckyCellsGameCoefViewHolder(adapterCoefItemLuckyCellsBinding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(LuckyCellsGameCoefViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Map<Double, Boolean> map = this.dataList;
        if (map != null) {
            holder.bind(((Number) CollectionsKt.elementAt(map.keySet(), position)).doubleValue(), ((Boolean) CollectionsKt.elementAt(map.values(), position)).booleanValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Map<Double, Boolean> map = this.dataList;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public final void next() {
        Map map;
        Map mutableMap;
        int currentCoefPosition = getCurrentCoefPosition();
        int i = currentCoefPosition + 1;
        Map<Double, Boolean> map2 = this.dataList;
        if (i < (map2 != null ? map2.size() : 0)) {
            Map<Double, Boolean> map3 = this.dataList;
            if (map3 == null || (mutableMap = MapsKt.toMutableMap(map3)) == null) {
                map = null;
            } else {
                if (currentCoefPosition >= 0) {
                    mutableMap.remove(CollectionsKt.elementAt(mutableMap.keySet(), currentCoefPosition));
                }
                mutableMap.put(CollectionsKt.elementAt(mutableMap.keySet(), 0), true);
                map = mutableMap;
            }
            this.dataList = map;
            if (currentCoefPosition >= 0) {
                notifyItemRemoved(currentCoefPosition);
            }
            notifyItemChanged(0);
        }
    }

    /* compiled from: LuckyCellsGameCoefAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameCoefAdapter$LuckyCellsGameCoefViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/betup/databinding/AdapterCoefItemLuckyCellsBinding;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/databinding/AdapterCoefItemLuckyCellsBinding;)V", "getBinding", "()Lorg/betup/databinding/AdapterCoefItemLuckyCellsBinding;", "bind", "", "d", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LuckyCellsGameCoefViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final AdapterCoefItemLuckyCellsBinding binding;

        public final AdapterCoefItemLuckyCellsBinding getBinding() {
            return this.binding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LuckyCellsGameCoefViewHolder(AdapterCoefItemLuckyCellsBinding binding) {
            super(binding.getRoot().getRootView());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(double d, boolean active) {
            AdapterCoefItemLuckyCellsBinding adapterCoefItemLuckyCellsBinding = this.binding;
            GlowShapeDrawable glowShapeDrawable = new GlowShapeDrawable();
            glowShapeDrawable.setBackgroundColor(this.binding.getRoot().getContext().getResources().getColor(R.color.lucky_cells_bg_color, this.binding.getRoot().getContext().getTheme()));
            if (active) {
                glowShapeDrawable.setGlow(new Glow(null, Integer.valueOf(this.binding.getRoot().getContext().getResources().getColor(R.color.lucky_cells_bg_secondary_color, this.binding.getRoot().getContext().getTheme())), (int) this.binding.getRoot().getContext().getResources().getDimension(R.dimen.fab_shadow_radius), 1, null));
            }
            glowShapeDrawable.setCornerRadius(this.binding.getRoot().getContext().getResources().getDimension(R.dimen.corner_radius_default));
            ConstraintLayout constraintLayout = adapterCoefItemLuckyCellsBinding.mapItem;
            constraintLayout.setLayerType(1, glowShapeDrawable.getPaint());
            constraintLayout.setBackground(glowShapeDrawable);
            adapterCoefItemLuckyCellsBinding.coefTv.setText("x" + d);
            if (active) {
                adapterCoefItemLuckyCellsBinding.coefTv.setTextColor(this.binding.getRoot().getContext().getResources().getColor(R.color.white, this.binding.getRoot().getContext().getTheme()));
            } else {
                adapterCoefItemLuckyCellsBinding.coefTv.setTextColor(this.binding.getRoot().getContext().getResources().getColor(R.color.lucky_cells_bg_secondary_color, this.binding.getRoot().getContext().getTheme()));
            }
            System.out.println((Object) ("active: " + active));
        }
    }

    public final int getCurrentCoef(long bet) {
        double d;
        Double d2;
        try {
            Map<Double, Boolean> map = this.dataList;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Double, Boolean> entry : map.entrySet()) {
                    if (entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap.keySet();
                if (keySet != null && (d2 = (Double) CollectionsKt.lastOrNull(keySet)) != null) {
                    d = d2.doubleValue();
                    return (int) (d * bet);
                }
            }
            d = 0.0d;
            return (int) (d * bet);
        } catch (Exception unused) {
            return 0;
        }
    }

    private final int getCurrentCoefPosition() {
        try {
            Map<Double, Boolean> map = this.dataList;
            if (map == null) {
                return 0;
            }
            int i = -1;
            int i2 = 0;
            for (Object obj : map.keySet()) {
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Boolean bool = map.get(Double.valueOf(((Number) obj).doubleValue()));
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    i = i2;
                }
                i2++;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int getNextCoef(long bet) {
        double d;
        Double d2;
        try {
            Map<Double, Boolean> map = this.dataList;
            if (map != null) {
                Iterator<Map.Entry<Double, Boolean>> it = map.entrySet().iterator();
                do {
                    d2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<Double, Boolean> next = it.next();
                    if (!next.getValue().booleanValue()) {
                        d2 = next.getKey();
                    }
                } while (d2 == null);
                d = d2 != null ? d2.doubleValue() : ((Number) CollectionsKt.first(map.keySet())).doubleValue();
            } else {
                d = 0.0d;
            }
            return (int) (d * bet);
        } catch (Exception unused) {
            return 0;
        }
    }
}
