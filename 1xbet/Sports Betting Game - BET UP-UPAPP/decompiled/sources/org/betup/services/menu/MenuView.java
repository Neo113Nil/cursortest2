package org.betup.services.menu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.betup.R;
import org.betup.services.menu.MenuView;
import org.betup.ui.TabMenuItem;

/* loaded from: classes2.dex */
public class MenuView extends LinearLayout {
    private TabMenuItem previousItem;
    private TabMenuItem selectedItem;
    private List<ViewHolder> viewHolders;

    private void init() {
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;
        private View view7f0a06f8;

        public ViewHolder_ViewBinding(final ViewHolder target, View source) {
            this.target = target;
            target.icon = (ImageView) Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.tabContainer, "field 'container' and method 'onContainerClick'");
            target.container = findRequiredView;
            this.view7f0a06f8 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.services.menu.MenuView.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onContainerClick();
                }
            });
            target.counter = (TextView) Utils.findRequiredViewAsType(source, R.id.counter, "field 'counter'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.icon = null;
            viewHolder.title = null;
            viewHolder.container = null;
            viewHolder.counter = null;
            this.view7f0a06f8.setOnClickListener(null);
            this.view7f0a06f8 = null;
        }
    }

    public MenuView(Context context) {
        super(context);
        this.selectedItem = TabMenuItem.NONE;
        this.previousItem = TabMenuItem.NONE;
        init();
    }

    public MenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.selectedItem = TabMenuItem.NONE;
        this.previousItem = TabMenuItem.NONE;
        init();
    }

    public MenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.selectedItem = TabMenuItem.NONE;
        this.previousItem = TabMenuItem.NONE;
        init();
    }

    public void updateCounter(Integer count) {
        for (ViewHolder viewHolder : this.viewHolders) {
            if (viewHolder.item.getType() == TabMenuItem.BETS) {
                viewHolder.setCounter(count);
            }
        }
    }

    public void updateNotificationsCounter(Integer count) {
        for (ViewHolder viewHolder : this.viewHolders) {
            if (viewHolder.item.getType() == TabMenuItem.DRAWER) {
                viewHolder.setCounter(count);
            }
        }
    }

    public boolean hasItem(TabMenuItem item) {
        Iterator<ViewHolder> it = this.viewHolders.iterator();
        while (it.hasNext()) {
            if (it.next().item.getType() == item) {
                return true;
            }
        }
        return false;
    }

    public void select(TabMenuItem item) {
        List<ViewHolder> list = this.viewHolders;
        if (list == null) {
            return;
        }
        TabMenuItem tabMenuItem = this.selectedItem;
        if (item != tabMenuItem) {
            this.previousItem = tabMenuItem;
            this.selectedItem = item;
        }
        for (ViewHolder viewHolder : list) {
            if (viewHolder.item.getType() == item) {
                if (!viewHolder.item.isSelected()) {
                    viewHolder.select();
                }
            } else {
                viewHolder.unselect();
            }
        }
    }

    public void setMenuItems(List<BottomMenuItem> bottomMenuItems) {
        removeAllViews();
        this.viewHolders = new ArrayList();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        Iterator<BottomMenuItem> it = bottomMenuItems.iterator();
        while (it.hasNext()) {
            ViewHolder viewHolder = new ViewHolder((Activity) getContext(), layoutInflater.inflate(R.layout.item_bottom_menu, (ViewGroup) this, false), it.next());
            addView(viewHolder.container);
            this.viewHolders.add(viewHolder);
            viewHolder.unselect();
        }
    }

    public View getView(TabMenuItem item) {
        List<ViewHolder> list = this.viewHolders;
        if (list == null) {
            return null;
        }
        for (ViewHolder viewHolder : list) {
            if (viewHolder.item.getType() == item) {
                return viewHolder.container;
            }
        }
        return null;
    }

    public TabMenuItem getCurrent() {
        return this.selectedItem;
    }

    public void restorePrevious() {
        for (ViewHolder viewHolder : this.viewHolders) {
            if (viewHolder.item.getType() == this.previousItem) {
                if (!viewHolder.item.isSelected()) {
                    viewHolder.select();
                }
            } else {
                viewHolder.unselect();
            }
        }
    }

    public void dimTabsExcept(TabMenuItem keepVisibleTab) {
        if (this.viewHolders == null) {
            Log.w("MenuView", "dimTabsExcept: viewHolders is null");
            return;
        }
        Log.d("MenuView", "dimTabsExcept: keeping visible tab = " + keepVisibleTab + ", total tabs = " + this.viewHolders.size());
        for (ViewHolder viewHolder : this.viewHolders) {
            if (viewHolder.item.getType() == keepVisibleTab) {
                Log.d("MenuView", "Keeping tab visible: " + viewHolder.item.getType());
                if (!viewHolder.item.isSelected()) {
                    viewHolder.select();
                }
            } else {
                Log.d("MenuView", "Dimming tab: " + viewHolder.item.getType());
                viewHolder.dimForTour();
            }
        }
    }

    public void restoreTabsNormalState() {
        List<ViewHolder> list = this.viewHolders;
        if (list == null) {
            return;
        }
        for (ViewHolder viewHolder : list) {
            if (!viewHolder.item.isSelected()) {
                viewHolder.unselect();
            }
        }
    }

    public static class ViewHolder {
        private final Activity activity;

        @BindView(R.id.tabContainer)
        View container;

        @BindView(R.id.counter)
        TextView counter;

        @BindView(R.id.icon)
        ImageView icon;
        private final BottomMenuItem item;

        @BindView(R.id.title)
        TextView title;

        public ViewHolder(Activity activity, View view, BottomMenuItem item) {
            ButterKnife.bind(this, view);
            this.activity = activity;
            this.item = item;
            init();
        }

        private void init() {
            this.icon.setImageResource(this.item.getIcon());
            this.title.setText(this.item.getTitle());
        }

        public void setCounter(Integer count) {
            if (count == null || count.intValue() == 0) {
                this.counter.setVisibility(8);
            } else {
                this.counter.setVisibility(0);
                this.counter.setText(String.valueOf(count));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void select() {
            this.item.setSelected(true);
            ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.icon);
            if (imageTintList != null) {
                ValueAnimator ofArgb = ValueAnimator.ofArgb(imageTintList.getDefaultColor(), ContextCompat.getColor(this.activity, R.color.active_icon));
                ofArgb.setDuration(300L);
                ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MenuView.ViewHolder.this.m12773lambda$select$0$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                    }
                });
                ofArgb.start();
            }
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(this.title.getCurrentTextColor(), ContextCompat.getColor(this.activity, R.color.active_text));
            ofArgb2.setDuration(300L);
            ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MenuView.ViewHolder.this.m12774lambda$select$1$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                }
            });
            ofArgb2.start();
        }

        /* renamed from: lambda$select$0$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12773lambda$select$0$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            ImageViewCompat.setImageTintList(this.icon, ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        /* renamed from: lambda$select$1$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12774lambda$select$1$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            this.title.setTextColor(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void unselect() {
            this.item.setSelected(false);
            ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.icon);
            if (imageTintList != null) {
                ValueAnimator ofArgb = ValueAnimator.ofArgb(imageTintList.getDefaultColor(), ContextCompat.getColor(this.activity, R.color.inactive_icon));
                ofArgb.setDuration(300L);
                ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MenuView.ViewHolder.this.m12775lambda$unselect$2$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                    }
                });
                ofArgb.start();
            }
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(this.title.getCurrentTextColor(), ContextCompat.getColor(this.activity, R.color.inactive_text));
            ofArgb2.setDuration(300L);
            ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MenuView.ViewHolder.this.m12776lambda$unselect$3$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                }
            });
            ofArgb2.start();
        }

        /* renamed from: lambda$unselect$2$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12775lambda$unselect$2$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            ImageViewCompat.setImageTintList(this.icon, ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        /* renamed from: lambda$unselect$3$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12776lambda$unselect$3$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            this.title.setTextColor(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dimForTour() {
            this.item.setSelected(false);
            Log.d("MenuView", "dimForTour called for tab: " + this.item.getType());
            int color = ContextCompat.getColor(this.activity, R.color.inactive_icon);
            int i = (((int) (((color >>> 24) & 255) * 0.3f)) << 24) | (color & 16777215);
            ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.icon);
            if (imageTintList != null) {
                color = imageTintList.getDefaultColor();
            }
            ValueAnimator ofArgb = ValueAnimator.ofArgb(color, i);
            ofArgb.setDuration(300L);
            ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MenuView.ViewHolder.this.m12771lambda$dimForTour$4$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                }
            });
            ofArgb.start();
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(this.title.getCurrentTextColor(), (ContextCompat.getColor(this.activity, R.color.inactive_text) & 16777215) | (((int) (((r0 >>> 24) & 255) * 0.3f)) << 24));
            ofArgb2.setDuration(300L);
            ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.services.menu.MenuView$ViewHolder$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MenuView.ViewHolder.this.m12772lambda$dimForTour$5$orgbetupservicesmenuMenuView$ViewHolder(valueAnimator);
                }
            });
            ofArgb2.start();
        }

        /* renamed from: lambda$dimForTour$4$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12771lambda$dimForTour$4$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            ImageViewCompat.setImageTintList(this.icon, ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        /* renamed from: lambda$dimForTour$5$org-betup-services-menu-MenuView$ViewHolder, reason: not valid java name */
        /* synthetic */ void m12772lambda$dimForTour$5$orgbetupservicesmenuMenuView$ViewHolder(ValueAnimator valueAnimator) {
            this.title.setTextColor(ColorStateList.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }

        @OnClick({R.id.tabContainer})
        public void onContainerClick() {
            playLottieStyleClickAnimation(this.container);
            if (this.item.getAction() != null) {
                this.item.getAction().action(this.activity, this.item);
            }
        }

        private void playLottieStyleClickAnimation(View view) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.9f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.9f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.9f, 1.2f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f, 1.2f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat3, ofFloat4);
            animatorSet2.setDuration(100L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.2f, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "scaleY", 1.2f, 1.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ofFloat5, ofFloat6);
            animatorSet3.setDuration(200L);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
            animatorSet4.start();
        }
    }
}
