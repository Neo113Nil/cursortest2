package org.betup.ui.dialogs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.R;
import org.betup.model.remote.entity.reward.DailyBonusItem;
import org.betup.model.remote.entity.shop.RewardState;
import org.betup.ui.base.BaseSingleItemAdapter;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyBonusAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0014J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0014¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/dialogs/adapter/DailyBonusAdapter;", "Lorg/betup/ui/base/BaseSingleItemAdapter;", "Lorg/betup/model/remote/entity/reward/DailyBonusItem;", "Lorg/betup/ui/dialogs/adapter/DailyBonusAdapter$DailyBonusHolder;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLayoutId", "", "getViewHolder", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "bindData", "", "viewHolder", "item", "position", "DailyBonusHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DailyBonusAdapter extends BaseSingleItemAdapter<DailyBonusItem, DailyBonusHolder> {
    public static final int $stable = 8;

    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public int getLayoutId() {
        return R.layout.item_daily_bonus;
    }

    public final class DailyBonusHolder_ViewBinding implements Unbinder {
        private DailyBonusHolder target;

        public DailyBonusHolder_ViewBinding(DailyBonusHolder target, View source) {
            this.target = target;
            target.day_label = (TextView) Utils.findRequiredViewAsType(source, R.id.day_label, "field 'day_label'", TextView.class);
            target.betcoinsInfo = Utils.findRequiredView(source, R.id.betcoinsInfo, "field 'betcoinsInfo'");
            target.check = Utils.findRequiredView(source, R.id.check, "field 'check'");
            target.betcoins = (TextView) Utils.findRequiredViewAsType(source, R.id.betcoins, "field 'betcoins'", TextView.class);
            target.bonusIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.bonusIcon, "field 'bonusIcon'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DailyBonusHolder dailyBonusHolder = this.target;
            if (dailyBonusHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            dailyBonusHolder.day_label = null;
            dailyBonusHolder.betcoinsInfo = null;
            dailyBonusHolder.check = null;
            dailyBonusHolder.betcoins = null;
            dailyBonusHolder.bonusIcon = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyBonusAdapter(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public DailyBonusHolder getViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new DailyBonusHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.ui.base.BaseSingleItemAdapter
    public void bindData(DailyBonusHolder viewHolder, DailyBonusItem item, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView day_label = viewHolder.getDay_label();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%s %d", Arrays.copyOf(new Object[]{getContext().getString(R.string.rank_day), item.getDayNumber()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        day_label.setText(format);
        Picasso.get().load(item.getPhotoUrl()).into(viewHolder.getBonusIcon());
        if (item.getState() == RewardState.CONSUMED) {
            viewHolder.itemView.setSelected(false);
            viewHolder.getDay_label().setTextColor(ContextCompat.getColor(getContext(), R.color.light_blue));
            viewHolder.getBetcoinsInfo().setVisibility(8);
            viewHolder.getCheck().setVisibility(0);
            return;
        }
        viewHolder.getCheck().setVisibility(8);
        TextView betcoins = viewHolder.getBetcoins();
        Long betcoins2 = item.getBetcoins();
        Intrinsics.checkNotNullExpressionValue(betcoins2, "getBetcoins(...)");
        betcoins.setText(FormatHelper.getShopBetcoinsFormated(betcoins2.longValue()));
        if (item.getState() == RewardState.AVAILABLE) {
            viewHolder.getDay_label().setTextColor(ContextCompat.getColor(getContext(), R.color.white));
            viewHolder.itemView.setSelected(true);
            viewHolder.getBetcoinsInfo().setVisibility(0);
        } else if (item.getState() == RewardState.NOT_AVAILABLE) {
            viewHolder.getDay_label().setTextColor(ContextCompat.getColor(getContext(), R.color.light_blue));
            viewHolder.itemView.setSelected(false);
            viewHolder.getBetcoinsInfo().setVisibility(0);
        }
    }

    /* compiled from: DailyBonusAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0005R\u001e\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/dialogs/adapter/DailyBonusAdapter$DailyBonusHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/view/View;)V", "day_label", "Landroid/widget/TextView;", "getDay_label", "()Landroid/widget/TextView;", "setDay_label", "(Landroid/widget/TextView;)V", "betcoinsInfo", "getBetcoinsInfo", "()Landroid/view/View;", "setBetcoinsInfo", "check", "getCheck", "setCheck", "betcoins", "getBetcoins", "setBetcoins", "bonusIcon", "Landroid/widget/ImageView;", "getBonusIcon", "()Landroid/widget/ImageView;", "setBonusIcon", "(Landroid/widget/ImageView;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DailyBonusHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        @BindView(R.id.betcoins)
        public TextView betcoins;

        @BindView(R.id.betcoinsInfo)
        public View betcoinsInfo;

        @BindView(R.id.bonusIcon)
        public ImageView bonusIcon;

        @BindView(R.id.check)
        public View check;

        @BindView(R.id.day_label)
        public TextView day_label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DailyBonusHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            ButterKnife.bind(this, itemView);
        }

        public final TextView getDay_label() {
            TextView textView = this.day_label;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("day_label");
            return null;
        }

        public final void setDay_label(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.day_label = textView;
        }

        public final View getBetcoinsInfo() {
            View view = this.betcoinsInfo;
            if (view != null) {
                return view;
            }
            Intrinsics.throwUninitializedPropertyAccessException("betcoinsInfo");
            return null;
        }

        public final void setBetcoinsInfo(View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.betcoinsInfo = view;
        }

        public final View getCheck() {
            View view = this.check;
            if (view != null) {
                return view;
            }
            Intrinsics.throwUninitializedPropertyAccessException("check");
            return null;
        }

        public final void setCheck(View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.check = view;
        }

        public final TextView getBetcoins() {
            TextView textView = this.betcoins;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("betcoins");
            return null;
        }

        public final void setBetcoins(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.betcoins = textView;
        }

        public final ImageView getBonusIcon() {
            ImageView imageView = this.bonusIcon;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bonusIcon");
            return null;
        }

        public final void setBonusIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.bonusIcon = imageView;
        }
    }
}
