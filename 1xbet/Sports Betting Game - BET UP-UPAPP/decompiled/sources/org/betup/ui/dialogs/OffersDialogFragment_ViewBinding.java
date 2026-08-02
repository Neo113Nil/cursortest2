package org.betup.ui.dialogs;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import me.relex.circleindicator.CircleIndicator;
import org.betup.R;

/* loaded from: classes2.dex */
public final class OffersDialogFragment_ViewBinding implements Unbinder {
    private OffersDialogFragment target;
    private View view7f0a03e0;
    private View view7f0a060a;

    public OffersDialogFragment_ViewBinding(final OffersDialogFragment target, View source) {
        this.target = target;
        View findRequiredView = Utils.findRequiredView(source, R.id.leftArrow, "field 'leftArrow' and method 'leftArrowOnClick'");
        target.leftArrow = findRequiredView;
        this.view7f0a03e0 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.OffersDialogFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.leftArrowOnClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.rightArrow, "field 'rightArrow' and method 'rightArrowOnClick'");
        target.rightArrow = findRequiredView2;
        this.view7f0a060a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.dialogs.OffersDialogFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.rightArrowOnClick();
            }
        });
        target.pager = (ViewPager) Utils.findRequiredViewAsType(source, R.id.pager, "field 'pager'", ViewPager.class);
        target.indicator = (CircleIndicator) Utils.findRequiredViewAsType(source, R.id.indicator, "field 'indicator'", CircleIndicator.class);
        target.progressBar = Utils.findRequiredView(source, R.id.progressBar, "field 'progressBar'");
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OffersDialogFragment offersDialogFragment = this.target;
        if (offersDialogFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        offersDialogFragment.leftArrow = null;
        offersDialogFragment.rightArrow = null;
        offersDialogFragment.pager = null;
        offersDialogFragment.indicator = null;
        offersDialogFragment.progressBar = null;
        this.view7f0a03e0.setOnClickListener(null);
        this.view7f0a03e0 = null;
        this.view7f0a060a.setOnClickListener(null);
        this.view7f0a060a = null;
    }
}
